// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/local_ratelimit/v3/local_rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.network.local_ratelimit.v3;

public interface LocalRateLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.local_ratelimit.v3.LocalRateLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_local_rate_limit_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_local_rate_limit_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * The token bucket configuration to use for rate limiting connections that are processed by the
   * filter's filter chain. Each incoming connection processed by the filter consumes a single
   * token. If the token is available, the connection will be allowed. If no tokens are available,
   * the connection will be immediately closed.
   * .. note::
   *   In the current implementation each filter and filter chain has an independent rate limit.
   * .. note::
   *   In the current implementation the token bucket's :ref:`fill_interval
   *   &lt;envoy_api_field_type.v3.TokenBucket.fill_interval&gt;` must be &gt;= 50ms to avoid too aggressive
   *   refills.
   * </pre>
   *
   * <code>.envoy.type.v3.TokenBucket token_bucket = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the tokenBucket field is set.
   */
  boolean hasTokenBucket();
  /**
   * <pre>
   * The token bucket configuration to use for rate limiting connections that are processed by the
   * filter's filter chain. Each incoming connection processed by the filter consumes a single
   * token. If the token is available, the connection will be allowed. If no tokens are available,
   * the connection will be immediately closed.
   * .. note::
   *   In the current implementation each filter and filter chain has an independent rate limit.
   * .. note::
   *   In the current implementation the token bucket's :ref:`fill_interval
   *   &lt;envoy_api_field_type.v3.TokenBucket.fill_interval&gt;` must be &gt;= 50ms to avoid too aggressive
   *   refills.
   * </pre>
   *
   * <code>.envoy.type.v3.TokenBucket token_bucket = 2 [(.validate.rules) = { ... }</code>
   * @return The tokenBucket.
   */
  io.envoyproxy.envoy.type.v3.TokenBucket getTokenBucket();
  /**
   * <pre>
   * The token bucket configuration to use for rate limiting connections that are processed by the
   * filter's filter chain. Each incoming connection processed by the filter consumes a single
   * token. If the token is available, the connection will be allowed. If no tokens are available,
   * the connection will be immediately closed.
   * .. note::
   *   In the current implementation each filter and filter chain has an independent rate limit.
   * .. note::
   *   In the current implementation the token bucket's :ref:`fill_interval
   *   &lt;envoy_api_field_type.v3.TokenBucket.fill_interval&gt;` must be &gt;= 50ms to avoid too aggressive
   *   refills.
   * </pre>
   *
   * <code>.envoy.type.v3.TokenBucket token_bucket = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.type.v3.TokenBucketOrBuilder getTokenBucketOrBuilder();

  /**
   * <pre>
   * Runtime flag that controls whether the filter is enabled or not. If not specified, defaults
   * to enabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag runtime_enabled = 3;</code>
   * @return Whether the runtimeEnabled field is set.
   */
  boolean hasRuntimeEnabled();
  /**
   * <pre>
   * Runtime flag that controls whether the filter is enabled or not. If not specified, defaults
   * to enabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag runtime_enabled = 3;</code>
   * @return The runtimeEnabled.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFeatureFlag getRuntimeEnabled();
  /**
   * <pre>
   * Runtime flag that controls whether the filter is enabled or not. If not specified, defaults
   * to enabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag runtime_enabled = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFeatureFlagOrBuilder getRuntimeEnabledOrBuilder();
}
