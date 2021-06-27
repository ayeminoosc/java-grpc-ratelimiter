// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/ratelimit/v3/rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.network.ratelimit.v3;

public interface RateLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.ratelimit.v3.RateLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics &lt;config_network_filters_rate_limit_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics &lt;config_network_filters_rate_limit_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * The rate limit domain to use in the rate limit service request.
   * </pre>
   *
   * <code>string domain = 2 [(.validate.rules) = { ... }</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * The rate limit domain to use in the rate limit service request.
   * </pre>
   *
   * <code>string domain = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * The rate limit descriptor list to use in the rate limit service request.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 3 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor> 
      getDescriptorsList();
  /**
   * <pre>
   * The rate limit descriptor list to use in the rate limit service request.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 3 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor getDescriptors(int index);
  /**
   * <pre>
   * The rate limit descriptor list to use in the rate limit service request.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 3 [(.validate.rules) = { ... }</code>
   */
  int getDescriptorsCount();
  /**
   * <pre>
   * The rate limit descriptor list to use in the rate limit service request.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 3 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptorOrBuilder> 
      getDescriptorsOrBuilderList();
  /**
   * <pre>
   * The rate limit descriptor list to use in the rate limit service request.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor descriptors = 3 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptorOrBuilder getDescriptorsOrBuilder(
      int index);

  /**
   * <pre>
   * The timeout in milliseconds for the rate limit service RPC. If not
   * set, this defaults to 20ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 4;</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * The timeout in milliseconds for the rate limit service RPC. If not
   * set, this defaults to 20ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 4;</code>
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * The timeout in milliseconds for the rate limit service RPC. If not
   * set, this defaults to 20ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   * <pre>
   * The filter's behaviour in case the rate limiting service does
   * not respond back. When it is set to true, Envoy will not allow traffic in case of
   * communication failure between rate limiting service and the proxy.
   * Defaults to false.
   * </pre>
   *
   * <code>bool failure_mode_deny = 5;</code>
   * @return The failureModeDeny.
   */
  boolean getFailureModeDeny();

  /**
   * <pre>
   * Configuration for an external rate limit service provider. If not
   * specified, any calls to the rate limit service will immediately return
   * success.
   * </pre>
   *
   * <code>.envoy.config.ratelimit.v3.RateLimitServiceConfig rate_limit_service = 6 [(.validate.rules) = { ... }</code>
   * @return Whether the rateLimitService field is set.
   */
  boolean hasRateLimitService();
  /**
   * <pre>
   * Configuration for an external rate limit service provider. If not
   * specified, any calls to the rate limit service will immediately return
   * success.
   * </pre>
   *
   * <code>.envoy.config.ratelimit.v3.RateLimitServiceConfig rate_limit_service = 6 [(.validate.rules) = { ... }</code>
   * @return The rateLimitService.
   */
  io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig getRateLimitService();
  /**
   * <pre>
   * Configuration for an external rate limit service provider. If not
   * specified, any calls to the rate limit service will immediately return
   * success.
   * </pre>
   *
   * <code>.envoy.config.ratelimit.v3.RateLimitServiceConfig rate_limit_service = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfigOrBuilder getRateLimitServiceOrBuilder();
}
