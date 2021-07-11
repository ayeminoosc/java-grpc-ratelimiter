<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [Overview](#overview)
- [Deprecation of Legacy Ratelimit Proto and v2 Ratelimit proto](#deprecation-of-legacy-ratelimit-proto-and-v2-ratelimit-proto)
    - [Deprecation Schedule](#deprecation-schedule)
- [Building and Testing](#building-and-testing)
    - [Docker-compose setup](#docker-compose-setup)
    - [Full test environment](#full-test-environment)
- [Configuration](#configuration)
    - [The configuration format](#the-configuration-format)
        - [Definitions](#definitions)
        - [Descriptor list definition](#descriptor-list-definition)
        - [Rate limit definition](#rate-limit-definition)
        - [Examples](#examples)
            - [Example 1](#example-1)
            - [Example 2](#example-2)
            - [Example 3](#example-3)
            - [Example 4](#example-4)
    - [Loading Configuration](#loading-configuration)
    - [Log Format](#log-format)
- [Request Fields](#request-fields)
- [GRPC Client](#grpc-client)
    - [Commandline flags](#commandline-flags)
- [Statistics](#statistics)
    - [Statistics options](#statistics-options)
- [HTTP Port](#http-port)
    - [/json endpoint](#json-endpoint)
- [Debug Port](#debug-port)
- [Local Cache](#local-cache)
- [Redis](#redis)
    - [Redis type](#redis-type)
    - [Pipelining](#pipelining)
    - [One Redis Instance](#one-redis-instance)
    - [Two Redis Instances](#two-redis-instances)
- [Memcache](#memcache)
- [Contact](#contact)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# Overview

This rate limit service is java implementation of [golang/gRPC](https://github.com/envoyproxy/ratelimit) but not a direct translation of it.

This is a java/gRPC service designed to enable generic rate limit scenarios from different types of
applications. Applications request a rate limit decision based on a domain and a set of descriptors. The service
reads the configuration from disk which composes a cache key, and talks to the Redis cache. A
decision is then returned to the caller.

## Envoy Proxy Rate-Limit Proto Version
v3 of ratelimit protocol [v3 rls.proto](https://github.com/envoyproxy/data-plane-api/blob/master/envoy/service/ratelimit/v3/rls.proto) is currently used to communicate with envoy proxy.

# Building Using Docker Only
* Install [docker](https://www.docker.com/products/docker-desktop) if it is not installed before in your machine.

* The docker-compose setup has four containers: redis, ratelimit-build-and-run, envoy-proxy and envoy-mock. In order to run the docker-compose setup from the root of the repo, run

```bash
docker-compose up
```

---
**NOTE**

Note: while this approach is easiest to setup and run the project, building project in this way is slow because every IO need to be translated between host os and docker containers unless you are using linux as host os.

---

# Building Using Docker + Gradle
* Install [docker](https://www.docker.com/products/docker-desktop) if it is not installed before in your machine.
* Install [openJdk-15+](https://openjdk.java.net/) if it not installed before

```shell
docker-compose -f docker-compose-nobuild.yml up
./gradlew clean shadowJar -p grpc-server
java -jar grpc-server/build/libs/grpc-server-all.jar
```

---
**NOTE**

Note: In this approach, all necessary external services such as redis, envoy-proxy and envoy-mock are started as docker container while this project itself is built in host os.

---


## Testing Full Environment End to End
* Firstly build and run the full environment by either one of the above ways.

We can use `curl` command to hit the envoy proxy to test end-to-end. 
```bash
curl -i  http://localhost:8889/test
curl -i  -H "user: anyname" http://localhost:8889/oneheader # one header test with any user name 
curl -i  -H "org: rhovg" -H "user: tester1" http://localhost:8889/twoheader # two headers
```

Edit `examples/ratelimit/domain-configs/banking.yaml` or `examples/ratelimit/domain-configs/rl-domain.yaml` to test different rate limit configs. 
Or you can add your own domain config under `examples/ratelimit/domain-configs/` directory. Your config file name has to be end with `.yml` or `.yaml`.
Hot reloading is not supported yet so you will need to restart the grpc server to see the changes.

The descriptors in `banking.yaml` and the actions in `examples/envoy/proxy-my.yaml` should give you a good idea on how to configure rate limits.

# Configuration

## The configuration format

The rate limit configuration file format is YAML (mainly so that comments are supported).

### Definitions

* **Domain:** A domain is a container for a set of rate limits. All domains known to the Ratelimit service must be
  globally unique. They serve as a way for different teams/projects to have rate limit configurations that don't conflict.
* **Descriptor:** A descriptor is a list of key/value pairs owned by a domain that the Ratelimit service uses to
  select the correct rate limit to use when limiting. Descriptors are case-sensitive. Examples of descriptors are:
    * ("database", "users")
    * ("message_type", "marketing"),("to_number","2061234567")
    * ("to_cluster", "service_a")
    * ("to_cluster", "service_a"),("from_cluster", "service_b")
* Descriptor config files can be separated into multiple files based on their domain.

### Descriptor list definition

Each configuration contains a top level descriptor list and potentially multiple nested lists beneath that. The format is:

```yaml
domain: <unique domain ID>
descriptors:
  - key: <rule key: required>
    value: <rule value: optional>
    rate_limit: (optional block)
      unit: <see below: required>
      requests_per_unit: <see below: required>
    descriptors: (optional block)
      - ... (nested repetition of above)
```

Each descriptor in a descriptor list must have a key. It can also optionally have a value to enable a more specific
match. The "rate_limit" block is optional and if present sets up an actual rate limit rule. See below for how the
rule is defined. If the rate limit is not present and there are no nested descriptors, then the descriptor is
effectively whitelisted. Otherwise, nested descriptors allow more complex matching and rate limiting scenarios.

### Rate limit definition

```yaml
rate_limit:
  unit: <second, minute, hour, day>
  requests_per_unit: <uint>
```

The rate limit block specifies the actual rate limit that will be used when there is a match.
Currently the service supports per second, minute, hour, and day limits. More types of limits may be added in the
future based on user demand.

### Examples

#### Example 1

Let's start with a simple example:

```yaml
domain: mongo_cps
descriptors:
  - key: database
    value: users
    rate_limit:
      unit: second
      requests_per_unit: 500

  - key: database
    value: default
    rate_limit:
      unit: second
      requests_per_unit: 500
```

In the configuration above
the domain is "mongo_cps" and we setup 2 different rate limits in the top level descriptor list. Each of the limits
have the same key ("database"). They have a different value ("users", and "default"), and each of them setup a 500
request per second rate limit.

#### Example 2

A slightly more complex example:

```yaml
domain: messaging
descriptors:
  # Only allow 5 marketing messages a day
  - key: message_type
    value: marketing
    descriptors:
      - key: to_number
        rate_limit:
          unit: day
          requests_per_unit: 5

  # Only allow 100 messages a day to any unique phone number
  - key: to_number
    rate_limit:
      unit: day
      requests_per_unit: 100
```

In the preceding example, the domain is "messaging" and we setup two different scenarios that illustrate more
complex functionality. First, we want to limit on marketing messages to a specific number. To enable this, we make
use of *nested descriptor lists.* The top level descriptor is ("message_type", "marketing"). However this descriptor
does not have a limit assigned so it's just a placeholder. Contained within this entry we have another descriptor list
that includes an entry with key "to_number". However, notice that no value is provided. This means that the service
will match against any value supplied for "to_number" and generate a unique limit. Thus, ("message_type", "marketing"),
("to_number", "2061111111") and ("message_type", "marketing"),("to_number", "2062222222") will each get 5 requests
per day.

The configuration also sets up another rule without a value. This one creates an overall limit for messages sent to
any particular number during a 1 day period. Thus, ("to_number", "2061111111") and ("to_number", "2062222222") both
get 100 requests per day.

When calling the rate limit service, the client can specify *multiple descriptors* to limit on in a single call. This
limits round trips and allows limiting on aggregate rule definitions. For example, using the preceding configuration,
the client could send this complete request (in pseudo IDL):

```
RateLimitRequest:
  domain: messaging
  descriptor: ("message_type", "marketing"),("to_number", "2061111111")
  descriptor: ("to_number", "2061111111")
```

And the service will rate limit against *all* matching rules and return an aggregate result; a logical OR of all
the individual rate limit decisions.

#### Example 3

An example to illustrate matching order.

```yaml
domain: edge_proxy_per_ip
descriptors:
  - key: remote_address
    rate_limit:
      unit: second
      requests_per_unit: 10

  # Black list IP
  - key: remote_address
    value: 50.0.0.5
    rate_limit:
      unit: second
      requests_per_unit: 0
```

In the preceding example, we setup a generic rate limit for individual IP addresses. The architecture's edge proxy can
be configured to make a rate limit service call with the descriptor ("remote_address", "50.0.0.1") for example. This IP would
get 10 requests per second as
would any other IP. However, the configuration also contains a second configuration that explicitly defines a
value along with the same key. If the descriptor ("remote_address", "50.0.0.5") is received, the service will
*attempt the most specific match possible*. This means
the most specific descriptor at the same level as your request. Thus, key/value is always attempted as a match before just key.

#### Example 4

The Ratelimit service matches requests to configuration entries with the same level, i.e
same number of tuples in the request's descriptor as nested levels of descriptors
in the configuration file. For instance, the following request:

```
RateLimitRequest:
  domain: example4
  descriptor: ("key", "value"),("subkey", "subvalue")
```

Would **not** match the following configuration. Even though the first descriptor in
the request matches the 1st level descriptor in the configuration, the request has
two tuples in the descriptor.

```yaml
domain: example4
descriptors:
  - key: key
    value: value
    rate_limit:
      requests_per_unit: 300
      unit: second
```

However, it would match the following configuration:

```yaml
domain: example4
descriptors:
  - key: key
    value: value
    descriptors:
      - key: subkey
        rate_limit:
          requests_per_unit: 300
          unit: second
```

## Loading Configuration
Dynamic Loading of the descriptor config is not supported yet. //todo:

## Log Format
Logging is not implemented yet. //todo:


# Request Fields

For information on the fields of a Ratelimit gRPC request please read the information
on the RateLimitRequest message type in the Ratelimit [proto file.](https://github.com/envoyproxy/envoy/blob/master/api/envoy/service/ratelimit/v3/rls.proto)

# GRPC Client
//todo: not implemented yet

# gRPC Port

The ratelimit service listens to gRPC request (by default on port 8082)

## HTTP End Point
Not supported yet.

# Redis

Ratelimit uses Redis as its caching layer. 


# Contact

* [developer (ayeminoosc@gmail.com)](ayeminoosc@gmail.com) 
