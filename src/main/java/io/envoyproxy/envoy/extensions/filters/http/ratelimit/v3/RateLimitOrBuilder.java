// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3;

public interface RateLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ratelimit.v3.RateLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The rate limit domain to use when calling the rate limit service.
   * </pre>
   *
   * <code>string domain = 1 [(.validate.rules) = { ... }</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * The rate limit domain to use when calling the rate limit service.
   * </pre>
   *
   * <code>string domain = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * Specifies the rate limit configurations to be applied with the same
   * stage number. If not set, the default stage number is 0.
   * .. note::
   *  The filter supports a range of 0 - 10 inclusively for stage numbers.
   * </pre>
   *
   * <code>uint32 stage = 2 [(.validate.rules) = { ... }</code>
   * @return The stage.
   */
  int getStage();

  /**
   * <pre>
   * The type of requests the filter should apply to. The supported
   * types are *internal*, *external* or *both*. A request is considered internal if
   * :ref:`x-envoy-internal&lt;config_http_conn_man_headers_x-envoy-internal&gt;` is set to true. If
   * :ref:`x-envoy-internal&lt;config_http_conn_man_headers_x-envoy-internal&gt;` is not set or false, a
   * request is considered external. The filter defaults to *both*, and it will apply to all request
   * types.
   * </pre>
   *
   * <code>string request_type = 3 [(.validate.rules) = { ... }</code>
   * @return The requestType.
   */
  java.lang.String getRequestType();
  /**
   * <pre>
   * The type of requests the filter should apply to. The supported
   * types are *internal*, *external* or *both*. A request is considered internal if
   * :ref:`x-envoy-internal&lt;config_http_conn_man_headers_x-envoy-internal&gt;` is set to true. If
   * :ref:`x-envoy-internal&lt;config_http_conn_man_headers_x-envoy-internal&gt;` is not set or false, a
   * request is considered external. The filter defaults to *both*, and it will apply to all request
   * types.
   * </pre>
   *
   * <code>string request_type = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for requestType.
   */
  com.google.protobuf.ByteString
      getRequestTypeBytes();

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
   * </pre>
   *
   * <code>bool failure_mode_deny = 5;</code>
   * @return The failureModeDeny.
   */
  boolean getFailureModeDeny();

  /**
   * <pre>
   * Specifies whether a `RESOURCE_EXHAUSTED` gRPC code must be returned instead
   * of the default `UNAVAILABLE` gRPC code for a rate limited gRPC call. The
   * HTTP code will be 200 for a gRPC response.
   * </pre>
   *
   * <code>bool rate_limited_as_resource_exhausted = 6;</code>
   * @return The rateLimitedAsResourceExhausted.
   */
  boolean getRateLimitedAsResourceExhausted();

  /**
   * <pre>
   * Configuration for an external rate limit service provider. If not
   * specified, any calls to the rate limit service will immediately return
   * success.
   * </pre>
   *
   * <code>.envoy.config.ratelimit.v3.RateLimitServiceConfig rate_limit_service = 7 [(.validate.rules) = { ... }</code>
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
   * <code>.envoy.config.ratelimit.v3.RateLimitServiceConfig rate_limit_service = 7 [(.validate.rules) = { ... }</code>
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
   * <code>.envoy.config.ratelimit.v3.RateLimitServiceConfig rate_limit_service = 7 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfigOrBuilder getRateLimitServiceOrBuilder();

  /**
   * <pre>
   * Defines the standard version to use for X-RateLimit headers emitted by the filter:
   * * ``X-RateLimit-Limit`` - indicates the request-quota associated to the
   *   client in the current time-window followed by the description of the
   *   quota policy. The values are returned by the rate limiting service in
   *   :ref:`current_limit&lt;envoy_v3_api_field_service.ratelimit.v3.RateLimitResponse.DescriptorStatus.current_limit&gt;`
   *   field. Example: `10, 10;w=1;name="per-ip", 1000;w=3600`.
   * * ``X-RateLimit-Remaining`` - indicates the remaining requests in the
   *   current time-window. The values are returned by the rate limiting service
   *   in :ref:`limit_remaining&lt;envoy_v3_api_field_service.ratelimit.v3.RateLimitResponse.DescriptorStatus.limit_remaining&gt;`
   *   field.
   * * ``X-RateLimit-Reset`` - indicates the number of seconds until reset of
   *   the current time-window. The values are returned by the rate limiting service
   *   in :ref:`duration_until_reset&lt;envoy_v3_api_field_service.ratelimit.v3.RateLimitResponse.DescriptorStatus.duration_until_reset&gt;`
   *   field.
   * In case rate limiting policy specifies more then one time window, the values
   * above represent the window that is closest to reaching its limit.
   * For more information about the headers specification see selected version of
   * the `draft RFC &lt;https://tools.ietf.org/id/draft-polli-ratelimit-headers-03.html&gt;`_.
   * Disabled by default.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimit.XRateLimitHeadersRFCVersion enable_x_ratelimit_headers = 8 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for enableXRatelimitHeaders.
   */
  int getEnableXRatelimitHeadersValue();
  /**
   * <pre>
   * Defines the standard version to use for X-RateLimit headers emitted by the filter:
   * * ``X-RateLimit-Limit`` - indicates the request-quota associated to the
   *   client in the current time-window followed by the description of the
   *   quota policy. The values are returned by the rate limiting service in
   *   :ref:`current_limit&lt;envoy_v3_api_field_service.ratelimit.v3.RateLimitResponse.DescriptorStatus.current_limit&gt;`
   *   field. Example: `10, 10;w=1;name="per-ip", 1000;w=3600`.
   * * ``X-RateLimit-Remaining`` - indicates the remaining requests in the
   *   current time-window. The values are returned by the rate limiting service
   *   in :ref:`limit_remaining&lt;envoy_v3_api_field_service.ratelimit.v3.RateLimitResponse.DescriptorStatus.limit_remaining&gt;`
   *   field.
   * * ``X-RateLimit-Reset`` - indicates the number of seconds until reset of
   *   the current time-window. The values are returned by the rate limiting service
   *   in :ref:`duration_until_reset&lt;envoy_v3_api_field_service.ratelimit.v3.RateLimitResponse.DescriptorStatus.duration_until_reset&gt;`
   *   field.
   * In case rate limiting policy specifies more then one time window, the values
   * above represent the window that is closest to reaching its limit.
   * For more information about the headers specification see selected version of
   * the `draft RFC &lt;https://tools.ietf.org/id/draft-polli-ratelimit-headers-03.html&gt;`_.
   * Disabled by default.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimit.XRateLimitHeadersRFCVersion enable_x_ratelimit_headers = 8 [(.validate.rules) = { ... }</code>
   * @return The enableXRatelimitHeaders.
   */
  io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimit.XRateLimitHeadersRFCVersion getEnableXRatelimitHeaders();

  /**
   * <pre>
   * Disables emitting the :ref:`x-envoy-ratelimited&lt;config_http_filters_router_x-envoy-ratelimited&gt;` header
   * in case of rate limiting (i.e. 429 responses).
   * Having this header not present potentially makes the request retriable.
   * </pre>
   *
   * <code>bool disable_x_envoy_ratelimited_header = 9;</code>
   * @return The disableXEnvoyRatelimitedHeader.
   */
  boolean getDisableXEnvoyRatelimitedHeader();
}
