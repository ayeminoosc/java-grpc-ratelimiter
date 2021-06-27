// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/redis_proxy/v3/redis_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3;

public interface RedisProxyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.redis_proxy.v3.RedisProxy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics &lt;config_network_filters_redis_proxy_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics &lt;config_network_filters_redis_proxy_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * Network settings for the connection pool to the upstream clusters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.ConnPoolSettings settings = 3 [(.validate.rules) = { ... }</code>
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   * <pre>
   * Network settings for the connection pool to the upstream clusters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.ConnPoolSettings settings = 3 [(.validate.rules) = { ... }</code>
   * @return The settings.
   */
  io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.ConnPoolSettings getSettings();
  /**
   * <pre>
   * Network settings for the connection pool to the upstream clusters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.ConnPoolSettings settings = 3 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.ConnPoolSettingsOrBuilder getSettingsOrBuilder();

  /**
   * <pre>
   * Indicates that latency stat should be computed in microseconds. By default it is computed in
   * milliseconds. This does not apply to upstream command stats currently.
   * </pre>
   *
   * <code>bool latency_in_micros = 4;</code>
   * @return The latencyInMicros.
   */
  boolean getLatencyInMicros();

  /**
   * <pre>
   * List of **unique** prefixes used to separate keys from different workloads to different
   * clusters. Envoy will always favor the longest match first in case of overlap. A catch-all
   * cluster can be used to forward commands when there is no match. Time complexity of the
   * lookups are in O(min(longest key prefix, key length)).
   * Example:
   * .. code-block:: yaml
   *    prefix_routes:
   *      routes:
   *        - prefix: "ab"
   *          cluster: "cluster_a"
   *        - prefix: "abc"
   *          cluster: "cluster_b"
   * When using the above routes, the following prefixes would be sent to:
   * * ``get abc:users`` would retrieve the key 'abc:users' from cluster_b.
   * * ``get ab:users`` would retrieve the key 'ab:users' from cluster_a.
   * * ``get z:users`` would return a NoUpstreamHost error. A :ref:`catch-all
   *   route&lt;envoy_api_field_extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes.catch_all_route&gt;`
   *   would have retrieved the key from that cluster instead.
   * See the :ref:`configuration section
   * &lt;arch_overview_redis_configuration&gt;` of the architecture overview for recommendations on
   * configuring the backing clusters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes prefix_routes = 5;</code>
   * @return Whether the prefixRoutes field is set.
   */
  boolean hasPrefixRoutes();
  /**
   * <pre>
   * List of **unique** prefixes used to separate keys from different workloads to different
   * clusters. Envoy will always favor the longest match first in case of overlap. A catch-all
   * cluster can be used to forward commands when there is no match. Time complexity of the
   * lookups are in O(min(longest key prefix, key length)).
   * Example:
   * .. code-block:: yaml
   *    prefix_routes:
   *      routes:
   *        - prefix: "ab"
   *          cluster: "cluster_a"
   *        - prefix: "abc"
   *          cluster: "cluster_b"
   * When using the above routes, the following prefixes would be sent to:
   * * ``get abc:users`` would retrieve the key 'abc:users' from cluster_b.
   * * ``get ab:users`` would retrieve the key 'ab:users' from cluster_a.
   * * ``get z:users`` would return a NoUpstreamHost error. A :ref:`catch-all
   *   route&lt;envoy_api_field_extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes.catch_all_route&gt;`
   *   would have retrieved the key from that cluster instead.
   * See the :ref:`configuration section
   * &lt;arch_overview_redis_configuration&gt;` of the architecture overview for recommendations on
   * configuring the backing clusters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes prefix_routes = 5;</code>
   * @return The prefixRoutes.
   */
  io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes getPrefixRoutes();
  /**
   * <pre>
   * List of **unique** prefixes used to separate keys from different workloads to different
   * clusters. Envoy will always favor the longest match first in case of overlap. A catch-all
   * cluster can be used to forward commands when there is no match. Time complexity of the
   * lookups are in O(min(longest key prefix, key length)).
   * Example:
   * .. code-block:: yaml
   *    prefix_routes:
   *      routes:
   *        - prefix: "ab"
   *          cluster: "cluster_a"
   *        - prefix: "abc"
   *          cluster: "cluster_b"
   * When using the above routes, the following prefixes would be sent to:
   * * ``get abc:users`` would retrieve the key 'abc:users' from cluster_b.
   * * ``get ab:users`` would retrieve the key 'ab:users' from cluster_a.
   * * ``get z:users`` would return a NoUpstreamHost error. A :ref:`catch-all
   *   route&lt;envoy_api_field_extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes.catch_all_route&gt;`
   *   would have retrieved the key from that cluster instead.
   * See the :ref:`configuration section
   * &lt;arch_overview_redis_configuration&gt;` of the architecture overview for recommendations on
   * configuring the backing clusters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutes prefix_routes = 5;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.PrefixRoutesOrBuilder getPrefixRoutesOrBuilder();

  /**
   * <pre>
   * Authenticate Redis client connections locally by forcing downstream clients to issue a `Redis
   * AUTH command &lt;https://redis.io/commands/auth&gt;`_ with this password before enabling any other
   * command. If an AUTH command's password matches this password, an "OK" response will be returned
   * to the client. If the AUTH command password does not match this password, then an "ERR invalid
   * password" error will be returned. If any other command is received before AUTH when this
   * password is set, then a "NOAUTH Authentication required." error response will be sent to the
   * client. If an AUTH command is received when the password is not set, then an "ERR Client sent
   * AUTH, but no password is set" error will be returned.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource downstream_auth_password = 6 [(.udpa.annotations.sensitive) = true];</code>
   * @return Whether the downstreamAuthPassword field is set.
   */
  boolean hasDownstreamAuthPassword();
  /**
   * <pre>
   * Authenticate Redis client connections locally by forcing downstream clients to issue a `Redis
   * AUTH command &lt;https://redis.io/commands/auth&gt;`_ with this password before enabling any other
   * command. If an AUTH command's password matches this password, an "OK" response will be returned
   * to the client. If the AUTH command password does not match this password, then an "ERR invalid
   * password" error will be returned. If any other command is received before AUTH when this
   * password is set, then a "NOAUTH Authentication required." error response will be sent to the
   * client. If an AUTH command is received when the password is not set, then an "ERR Client sent
   * AUTH, but no password is set" error will be returned.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource downstream_auth_password = 6 [(.udpa.annotations.sensitive) = true];</code>
   * @return The downstreamAuthPassword.
   */
  io.envoyproxy.envoy.config.core.v3.DataSource getDownstreamAuthPassword();
  /**
   * <pre>
   * Authenticate Redis client connections locally by forcing downstream clients to issue a `Redis
   * AUTH command &lt;https://redis.io/commands/auth&gt;`_ with this password before enabling any other
   * command. If an AUTH command's password matches this password, an "OK" response will be returned
   * to the client. If the AUTH command password does not match this password, then an "ERR invalid
   * password" error will be returned. If any other command is received before AUTH when this
   * password is set, then a "NOAUTH Authentication required." error response will be sent to the
   * client. If an AUTH command is received when the password is not set, then an "ERR Client sent
   * AUTH, but no password is set" error will be returned.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource downstream_auth_password = 6 [(.udpa.annotations.sensitive) = true];</code>
   */
  io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getDownstreamAuthPasswordOrBuilder();

  /**
   * <pre>
   * List of faults to inject. Faults currently come in two flavors:
   * - Delay, which delays a request.
   * - Error, which responds to a request with an error. Errors can also have delays attached.
   * Example:
   * .. code-block:: yaml
   *    faults:
   *    - fault_type: ERROR
   *      fault_enabled:
   *        default_value:
   *          numerator: 10
   *          denominator: HUNDRED
   *        runtime_key: "bogus_key"
   *        commands:
   *        - GET
   *      - fault_type: DELAY
   *        fault_enabled:
   *          default_value:
   *            numerator: 10
   *            denominator: HUNDRED
   *          runtime_key: "bogus_key"
   *        delay: 2s
   * See the :ref:`fault injection section
   * &lt;config_network_filters_redis_proxy_fault_injection&gt;` for more information on how to configure this.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault faults = 8;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault> 
      getFaultsList();
  /**
   * <pre>
   * List of faults to inject. Faults currently come in two flavors:
   * - Delay, which delays a request.
   * - Error, which responds to a request with an error. Errors can also have delays attached.
   * Example:
   * .. code-block:: yaml
   *    faults:
   *    - fault_type: ERROR
   *      fault_enabled:
   *        default_value:
   *          numerator: 10
   *          denominator: HUNDRED
   *        runtime_key: "bogus_key"
   *        commands:
   *        - GET
   *      - fault_type: DELAY
   *        fault_enabled:
   *          default_value:
   *            numerator: 10
   *            denominator: HUNDRED
   *          runtime_key: "bogus_key"
   *        delay: 2s
   * See the :ref:`fault injection section
   * &lt;config_network_filters_redis_proxy_fault_injection&gt;` for more information on how to configure this.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault faults = 8;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault getFaults(int index);
  /**
   * <pre>
   * List of faults to inject. Faults currently come in two flavors:
   * - Delay, which delays a request.
   * - Error, which responds to a request with an error. Errors can also have delays attached.
   * Example:
   * .. code-block:: yaml
   *    faults:
   *    - fault_type: ERROR
   *      fault_enabled:
   *        default_value:
   *          numerator: 10
   *          denominator: HUNDRED
   *        runtime_key: "bogus_key"
   *        commands:
   *        - GET
   *      - fault_type: DELAY
   *        fault_enabled:
   *          default_value:
   *            numerator: 10
   *            denominator: HUNDRED
   *          runtime_key: "bogus_key"
   *        delay: 2s
   * See the :ref:`fault injection section
   * &lt;config_network_filters_redis_proxy_fault_injection&gt;` for more information on how to configure this.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault faults = 8;</code>
   */
  int getFaultsCount();
  /**
   * <pre>
   * List of faults to inject. Faults currently come in two flavors:
   * - Delay, which delays a request.
   * - Error, which responds to a request with an error. Errors can also have delays attached.
   * Example:
   * .. code-block:: yaml
   *    faults:
   *    - fault_type: ERROR
   *      fault_enabled:
   *        default_value:
   *          numerator: 10
   *          denominator: HUNDRED
   *        runtime_key: "bogus_key"
   *        commands:
   *        - GET
   *      - fault_type: DELAY
   *        fault_enabled:
   *          default_value:
   *            numerator: 10
   *            denominator: HUNDRED
   *          runtime_key: "bogus_key"
   *        delay: 2s
   * See the :ref:`fault injection section
   * &lt;config_network_filters_redis_proxy_fault_injection&gt;` for more information on how to configure this.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault faults = 8;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFaultOrBuilder> 
      getFaultsOrBuilderList();
  /**
   * <pre>
   * List of faults to inject. Faults currently come in two flavors:
   * - Delay, which delays a request.
   * - Error, which responds to a request with an error. Errors can also have delays attached.
   * Example:
   * .. code-block:: yaml
   *    faults:
   *    - fault_type: ERROR
   *      fault_enabled:
   *        default_value:
   *          numerator: 10
   *          denominator: HUNDRED
   *        runtime_key: "bogus_key"
   *        commands:
   *        - GET
   *      - fault_type: DELAY
   *        fault_enabled:
   *          default_value:
   *            numerator: 10
   *            denominator: HUNDRED
   *          runtime_key: "bogus_key"
   *        delay: 2s
   * See the :ref:`fault injection section
   * &lt;config_network_filters_redis_proxy_fault_injection&gt;` for more information on how to configure this.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFault faults = 8;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.redis_proxy.v3.RedisProxy.RedisFaultOrBuilder getFaultsOrBuilder(
      int index);

  /**
   * <pre>
   * If a username is provided an ACL style AUTH command will be required with a username and password.
   * Authenticate Redis client connections locally by forcing downstream clients to issue a `Redis
   * AUTH command &lt;https://redis.io/commands/auth&gt;`_ with this username and the *downstream_auth_password*
   * before enabling any other command. If an AUTH command's username and password matches this username
   * and the *downstream_auth_password* , an "OK" response will be returned to the client. If the AUTH
   * command username or password does not match this username or the *downstream_auth_password*, then an
   * "WRONGPASS invalid username-password pair" error will be returned. If any other command is received before AUTH when this
   * password is set, then a "NOAUTH Authentication required." error response will be sent to the
   * client. If an AUTH command is received when the password is not set, then an "ERR Client sent
   * AUTH, but no ACL is set" error will be returned.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource downstream_auth_username = 7 [(.udpa.annotations.sensitive) = true];</code>
   * @return Whether the downstreamAuthUsername field is set.
   */
  boolean hasDownstreamAuthUsername();
  /**
   * <pre>
   * If a username is provided an ACL style AUTH command will be required with a username and password.
   * Authenticate Redis client connections locally by forcing downstream clients to issue a `Redis
   * AUTH command &lt;https://redis.io/commands/auth&gt;`_ with this username and the *downstream_auth_password*
   * before enabling any other command. If an AUTH command's username and password matches this username
   * and the *downstream_auth_password* , an "OK" response will be returned to the client. If the AUTH
   * command username or password does not match this username or the *downstream_auth_password*, then an
   * "WRONGPASS invalid username-password pair" error will be returned. If any other command is received before AUTH when this
   * password is set, then a "NOAUTH Authentication required." error response will be sent to the
   * client. If an AUTH command is received when the password is not set, then an "ERR Client sent
   * AUTH, but no ACL is set" error will be returned.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource downstream_auth_username = 7 [(.udpa.annotations.sensitive) = true];</code>
   * @return The downstreamAuthUsername.
   */
  io.envoyproxy.envoy.config.core.v3.DataSource getDownstreamAuthUsername();
  /**
   * <pre>
   * If a username is provided an ACL style AUTH command will be required with a username and password.
   * Authenticate Redis client connections locally by forcing downstream clients to issue a `Redis
   * AUTH command &lt;https://redis.io/commands/auth&gt;`_ with this username and the *downstream_auth_password*
   * before enabling any other command. If an AUTH command's username and password matches this username
   * and the *downstream_auth_password* , an "OK" response will be returned to the client. If the AUTH
   * command username or password does not match this username or the *downstream_auth_password*, then an
   * "WRONGPASS invalid username-password pair" error will be returned. If any other command is received before AUTH when this
   * password is set, then a "NOAUTH Authentication required." error response will be sent to the
   * client. If an AUTH command is received when the password is not set, then an "ERR Client sent
   * AUTH, but no ACL is set" error will be returned.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource downstream_auth_username = 7 [(.udpa.annotations.sensitive) = true];</code>
   */
  io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getDownstreamAuthUsernameOrBuilder();
}