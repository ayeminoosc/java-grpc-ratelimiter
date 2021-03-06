// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ratelimit/v3/rls.proto

package io.envoyproxy.envoy.service.ratelimit.v3;

public interface RateLimitRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.ratelimit.v3.RateLimitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All rate limit requests must specify a domain. This enables the configuration to be per
   * application without fear of overlap. E.g., "envoy".
   * </pre>
   *
   * <code>string domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * All rate limit requests must specify a domain. This enables the configuration to be per
   * application without fear of overlap. E.g., "envoy".
   * </pre>
   *
   * <code>string domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * All rate limit requests must specify at least one RateLimitDescriptor. Each descriptor is
   * processed by the service (see below). If any of the descriptors are over limit, the entire
   * request is considered to be over limit.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor> 
      getDescriptorsList();
  /**
   * <pre>
   * All rate limit requests must specify at least one RateLimitDescriptor. Each descriptor is
   * processed by the service (see below). If any of the descriptors are over limit, the entire
   * request is considered to be over limit.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 2;</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor getDescriptors(int index);
  /**
   * <pre>
   * All rate limit requests must specify at least one RateLimitDescriptor. Each descriptor is
   * processed by the service (see below). If any of the descriptors are over limit, the entire
   * request is considered to be over limit.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 2;</code>
   */
  int getDescriptorsCount();
  /**
   * <pre>
   * All rate limit requests must specify at least one RateLimitDescriptor. Each descriptor is
   * processed by the service (see below). If any of the descriptors are over limit, the entire
   * request is considered to be over limit.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptorOrBuilder> 
      getDescriptorsOrBuilderList();
  /**
   * <pre>
   * All rate limit requests must specify at least one RateLimitDescriptor. Each descriptor is
   * processed by the service (see below). If any of the descriptors are over limit, the entire
   * request is considered to be over limit.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 2;</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptorOrBuilder getDescriptorsOrBuilder(
      int index);

  /**
   * <pre>
   * Rate limit requests can optionally specify the number of hits a request adds to the matched
   * limit. If the value is not set in the message, a request increases the matched limit by 1.
   * </pre>
   *
   * <code>uint32 hits_addend = 3;</code>
   * @return The hitsAddend.
   */
  int getHitsAddend();
}
