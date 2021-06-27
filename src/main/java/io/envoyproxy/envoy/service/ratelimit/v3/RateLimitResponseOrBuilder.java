// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ratelimit/v3/rls.proto

package io.envoyproxy.envoy.service.ratelimit.v3;

public interface RateLimitResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.ratelimit.v3.RateLimitResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The overall response code which takes into account all of the descriptors that were passed
   * in the RateLimitRequest message.
   * </pre>
   *
   * <code>.envoy.service.ratelimit.v3.RateLimitResponse.Code overall_code = 1;</code>
   * @return The enum numeric value on the wire for overallCode.
   */
  int getOverallCodeValue();
  /**
   * <pre>
   * The overall response code which takes into account all of the descriptors that were passed
   * in the RateLimitRequest message.
   * </pre>
   *
   * <code>.envoy.service.ratelimit.v3.RateLimitResponse.Code overall_code = 1;</code>
   * @return The overallCode.
   */
  io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.Code getOverallCode();

  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus> 
      getStatusesList();
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus getStatuses(int index);
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  int getStatusesCount();
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatusOrBuilder> 
      getStatusesOrBuilderList();
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  io.envoyproxy.envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatusOrBuilder getStatusesOrBuilder(
      int index);

  /**
   * <pre>
   * A list of headers to add to the response
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue response_headers_to_add = 3;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.HeaderValue> 
      getResponseHeadersToAddList();
  /**
   * <pre>
   * A list of headers to add to the response
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue response_headers_to_add = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValue getResponseHeadersToAdd(int index);
  /**
   * <pre>
   * A list of headers to add to the response
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue response_headers_to_add = 3;</code>
   */
  int getResponseHeadersToAddCount();
  /**
   * <pre>
   * A list of headers to add to the response
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue response_headers_to_add = 3;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder> 
      getResponseHeadersToAddOrBuilderList();
  /**
   * <pre>
   * A list of headers to add to the response
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue response_headers_to_add = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder getResponseHeadersToAddOrBuilder(
      int index);

  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue request_headers_to_add = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.HeaderValue> 
      getRequestHeadersToAddList();
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue request_headers_to_add = 4;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValue getRequestHeadersToAdd(int index);
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue request_headers_to_add = 4;</code>
   */
  int getRequestHeadersToAddCount();
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue request_headers_to_add = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder> 
      getRequestHeadersToAddOrBuilderList();
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValue request_headers_to_add = 4;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOrBuilder getRequestHeadersToAddOrBuilder(
      int index);

  /**
   * <pre>
   * A response body to send to the downstream client when the response code is not OK.
   * </pre>
   *
   * <code>bytes raw_body = 5;</code>
   * @return The rawBody.
   */
  com.google.protobuf.ByteString getRawBody();

  /**
   * <pre>
   * Optional response metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata lives in a namespace specified by the canonical name of extension filter
   * that requires it:
   * - :ref:`envoy.filters.http.ratelimit &lt;config_http_filters_ratelimit_dynamic_metadata&gt;` for HTTP filter.
   * - :ref:`envoy.filters.network.ratelimit &lt;config_network_filters_ratelimit_dynamic_metadata&gt;` for network filter.
   * - :ref:`envoy.filters.thrift.rate_limit &lt;config_thrift_filters_rate_limit_dynamic_metadata&gt;` for Thrift filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 6;</code>
   * @return Whether the dynamicMetadata field is set.
   */
  boolean hasDynamicMetadata();
  /**
   * <pre>
   * Optional response metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata lives in a namespace specified by the canonical name of extension filter
   * that requires it:
   * - :ref:`envoy.filters.http.ratelimit &lt;config_http_filters_ratelimit_dynamic_metadata&gt;` for HTTP filter.
   * - :ref:`envoy.filters.network.ratelimit &lt;config_network_filters_ratelimit_dynamic_metadata&gt;` for network filter.
   * - :ref:`envoy.filters.thrift.rate_limit &lt;config_thrift_filters_rate_limit_dynamic_metadata&gt;` for Thrift filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 6;</code>
   * @return The dynamicMetadata.
   */
  com.google.protobuf.Struct getDynamicMetadata();
  /**
   * <pre>
   * Optional response metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata lives in a namespace specified by the canonical name of extension filter
   * that requires it:
   * - :ref:`envoy.filters.http.ratelimit &lt;config_http_filters_ratelimit_dynamic_metadata&gt;` for HTTP filter.
   * - :ref:`envoy.filters.network.ratelimit &lt;config_network_filters_ratelimit_dynamic_metadata&gt;` for network filter.
   * - :ref:`envoy.filters.thrift.rate_limit &lt;config_thrift_filters_rate_limit_dynamic_metadata&gt;` for Thrift filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getDynamicMetadataOrBuilder();
}