// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/fault/v3/fault.proto

package io.envoyproxy.envoy.extensions.filters.http.fault.v3;

public interface HTTPFaultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.fault.v3.HTTPFault)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If specified, the filter will inject delays based on the values in the
   * object.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultDelay delay = 1;</code>
   * @return Whether the delay field is set.
   */
  boolean hasDelay();
  /**
   * <pre>
   * If specified, the filter will inject delays based on the values in the
   * object.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultDelay delay = 1;</code>
   * @return The delay.
   */
  io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultDelay getDelay();
  /**
   * <pre>
   * If specified, the filter will inject delays based on the values in the
   * object.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultDelay delay = 1;</code>
   */
  io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultDelayOrBuilder getDelayOrBuilder();

  /**
   * <pre>
   * If specified, the filter will abort requests based on the values in
   * the object. At least *abort* or *delay* must be specified.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.fault.v3.FaultAbort abort = 2;</code>
   * @return Whether the abort field is set.
   */
  boolean hasAbort();
  /**
   * <pre>
   * If specified, the filter will abort requests based on the values in
   * the object. At least *abort* or *delay* must be specified.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.fault.v3.FaultAbort abort = 2;</code>
   * @return The abort.
   */
  io.envoyproxy.envoy.extensions.filters.http.fault.v3.FaultAbort getAbort();
  /**
   * <pre>
   * If specified, the filter will abort requests based on the values in
   * the object. At least *abort* or *delay* must be specified.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.fault.v3.FaultAbort abort = 2;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.fault.v3.FaultAbortOrBuilder getAbortOrBuilder();

  /**
   * <pre>
   * Specifies the name of the (destination) upstream cluster that the
   * filter should match on. Fault injection will be restricted to requests
   * bound to the specific upstream cluster.
   * </pre>
   *
   * <code>string upstream_cluster = 3;</code>
   * @return The upstreamCluster.
   */
  java.lang.String getUpstreamCluster();
  /**
   * <pre>
   * Specifies the name of the (destination) upstream cluster that the
   * filter should match on. Fault injection will be restricted to requests
   * bound to the specific upstream cluster.
   * </pre>
   *
   * <code>string upstream_cluster = 3;</code>
   * @return The bytes for upstreamCluster.
   */
  com.google.protobuf.ByteString
      getUpstreamClusterBytes();

  /**
   * <pre>
   * Specifies a set of headers that the filter should match on. The fault
   * injection filter can be applied selectively to requests that match a set of
   * headers specified in the fault filter config. The chances of actual fault
   * injection further depend on the value of the :ref:`percentage
   * &lt;envoy_api_field_extensions.filters.http.fault.v3.FaultAbort.percentage&gt;` field.
   * The filter will check the request's headers against all the specified
   * headers in the filter config. A match will happen if all the headers in the
   * config are present in the request with the same values (or based on
   * presence if the *value* field is not in the config).
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.route.v3.HeaderMatcher> 
      getHeadersList();
  /**
   * <pre>
   * Specifies a set of headers that the filter should match on. The fault
   * injection filter can be applied selectively to requests that match a set of
   * headers specified in the fault filter config. The chances of actual fault
   * injection further depend on the value of the :ref:`percentage
   * &lt;envoy_api_field_extensions.filters.http.fault.v3.FaultAbort.percentage&gt;` field.
   * The filter will check the request's headers against all the specified
   * headers in the filter config. A match will happen if all the headers in the
   * config are present in the request with the same values (or based on
   * presence if the *value* field is not in the config).
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  io.envoyproxy.envoy.config.route.v3.HeaderMatcher getHeaders(int index);
  /**
   * <pre>
   * Specifies a set of headers that the filter should match on. The fault
   * injection filter can be applied selectively to requests that match a set of
   * headers specified in the fault filter config. The chances of actual fault
   * injection further depend on the value of the :ref:`percentage
   * &lt;envoy_api_field_extensions.filters.http.fault.v3.FaultAbort.percentage&gt;` field.
   * The filter will check the request's headers against all the specified
   * headers in the filter config. A match will happen if all the headers in the
   * config are present in the request with the same values (or based on
   * presence if the *value* field is not in the config).
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * Specifies a set of headers that the filter should match on. The fault
   * injection filter can be applied selectively to requests that match a set of
   * headers specified in the fault filter config. The chances of actual fault
   * injection further depend on the value of the :ref:`percentage
   * &lt;envoy_api_field_extensions.filters.http.fault.v3.FaultAbort.percentage&gt;` field.
   * The filter will check the request's headers against all the specified
   * headers in the filter config. A match will happen if all the headers in the
   * config are present in the request with the same values (or based on
   * presence if the *value* field is not in the config).
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.route.v3.HeaderMatcherOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <pre>
   * Specifies a set of headers that the filter should match on. The fault
   * injection filter can be applied selectively to requests that match a set of
   * headers specified in the fault filter config. The chances of actual fault
   * injection further depend on the value of the :ref:`percentage
   * &lt;envoy_api_field_extensions.filters.http.fault.v3.FaultAbort.percentage&gt;` field.
   * The filter will check the request's headers against all the specified
   * headers in the filter config. A match will happen if all the headers in the
   * config are present in the request with the same values (or based on
   * presence if the *value* field is not in the config).
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.HeaderMatcher headers = 4;</code>
   */
  io.envoyproxy.envoy.config.route.v3.HeaderMatcherOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <pre>
   * Faults are injected for the specified list of downstream hosts. If this
   * setting is not set, faults are injected for all downstream nodes.
   * Downstream node name is taken from :ref:`the HTTP
   * x-envoy-downstream-service-node
   * &lt;config_http_conn_man_headers_downstream-service-node&gt;` header and compared
   * against downstream_nodes list.
   * </pre>
   *
   * <code>repeated string downstream_nodes = 5;</code>
   * @return A list containing the downstreamNodes.
   */
  java.util.List<java.lang.String>
      getDownstreamNodesList();
  /**
   * <pre>
   * Faults are injected for the specified list of downstream hosts. If this
   * setting is not set, faults are injected for all downstream nodes.
   * Downstream node name is taken from :ref:`the HTTP
   * x-envoy-downstream-service-node
   * &lt;config_http_conn_man_headers_downstream-service-node&gt;` header and compared
   * against downstream_nodes list.
   * </pre>
   *
   * <code>repeated string downstream_nodes = 5;</code>
   * @return The count of downstreamNodes.
   */
  int getDownstreamNodesCount();
  /**
   * <pre>
   * Faults are injected for the specified list of downstream hosts. If this
   * setting is not set, faults are injected for all downstream nodes.
   * Downstream node name is taken from :ref:`the HTTP
   * x-envoy-downstream-service-node
   * &lt;config_http_conn_man_headers_downstream-service-node&gt;` header and compared
   * against downstream_nodes list.
   * </pre>
   *
   * <code>repeated string downstream_nodes = 5;</code>
   * @param index The index of the element to return.
   * @return The downstreamNodes at the given index.
   */
  java.lang.String getDownstreamNodes(int index);
  /**
   * <pre>
   * Faults are injected for the specified list of downstream hosts. If this
   * setting is not set, faults are injected for all downstream nodes.
   * Downstream node name is taken from :ref:`the HTTP
   * x-envoy-downstream-service-node
   * &lt;config_http_conn_man_headers_downstream-service-node&gt;` header and compared
   * against downstream_nodes list.
   * </pre>
   *
   * <code>repeated string downstream_nodes = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the downstreamNodes at the given index.
   */
  com.google.protobuf.ByteString
      getDownstreamNodesBytes(int index);

  /**
   * <pre>
   * The maximum number of faults that can be active at a single time via the configured fault
   * filter. Note that because this setting can be overridden at the route level, it's possible
   * for the number of active faults to be greater than this value (if injected via a different
   * route). If not specified, defaults to unlimited. This setting can be overridden via
   * `runtime &lt;config_http_filters_fault_injection_runtime&gt;` and any faults that are not injected
   * due to overflow will be indicated via the `faults_overflow
   * &lt;config_http_filters_fault_injection_stats&gt;` stat.
   * .. attention::
   *   Like other :ref:`circuit breakers &lt;arch_overview_circuit_break&gt;` in Envoy, this is a fuzzy
   *   limit. It's possible for the number of active faults to rise slightly above the configured
   *   amount due to the implementation details.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_active_faults = 6;</code>
   * @return Whether the maxActiveFaults field is set.
   */
  boolean hasMaxActiveFaults();
  /**
   * <pre>
   * The maximum number of faults that can be active at a single time via the configured fault
   * filter. Note that because this setting can be overridden at the route level, it's possible
   * for the number of active faults to be greater than this value (if injected via a different
   * route). If not specified, defaults to unlimited. This setting can be overridden via
   * `runtime &lt;config_http_filters_fault_injection_runtime&gt;` and any faults that are not injected
   * due to overflow will be indicated via the `faults_overflow
   * &lt;config_http_filters_fault_injection_stats&gt;` stat.
   * .. attention::
   *   Like other :ref:`circuit breakers &lt;arch_overview_circuit_break&gt;` in Envoy, this is a fuzzy
   *   limit. It's possible for the number of active faults to rise slightly above the configured
   *   amount due to the implementation details.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_active_faults = 6;</code>
   * @return The maxActiveFaults.
   */
  com.google.protobuf.UInt32Value getMaxActiveFaults();
  /**
   * <pre>
   * The maximum number of faults that can be active at a single time via the configured fault
   * filter. Note that because this setting can be overridden at the route level, it's possible
   * for the number of active faults to be greater than this value (if injected via a different
   * route). If not specified, defaults to unlimited. This setting can be overridden via
   * `runtime &lt;config_http_filters_fault_injection_runtime&gt;` and any faults that are not injected
   * due to overflow will be indicated via the `faults_overflow
   * &lt;config_http_filters_fault_injection_stats&gt;` stat.
   * .. attention::
   *   Like other :ref:`circuit breakers &lt;arch_overview_circuit_break&gt;` in Envoy, this is a fuzzy
   *   limit. It's possible for the number of active faults to rise slightly above the configured
   *   amount due to the implementation details.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_active_faults = 6;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getMaxActiveFaultsOrBuilder();

  /**
   * <pre>
   * The response rate limit to be applied to the response body of the stream. When configured,
   * the percentage can be overridden by the :ref:`fault.http.rate_limit.response_percent
   * &lt;config_http_filters_fault_injection_runtime&gt;` runtime key.
   * .. attention::
   *  This is a per-stream limit versus a connection level limit. This means that concurrent streams
   *  will each get an independent limit.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultRateLimit response_rate_limit = 7;</code>
   * @return Whether the responseRateLimit field is set.
   */
  boolean hasResponseRateLimit();
  /**
   * <pre>
   * The response rate limit to be applied to the response body of the stream. When configured,
   * the percentage can be overridden by the :ref:`fault.http.rate_limit.response_percent
   * &lt;config_http_filters_fault_injection_runtime&gt;` runtime key.
   * .. attention::
   *  This is a per-stream limit versus a connection level limit. This means that concurrent streams
   *  will each get an independent limit.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultRateLimit response_rate_limit = 7;</code>
   * @return The responseRateLimit.
   */
  io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultRateLimit getResponseRateLimit();
  /**
   * <pre>
   * The response rate limit to be applied to the response body of the stream. When configured,
   * the percentage can be overridden by the :ref:`fault.http.rate_limit.response_percent
   * &lt;config_http_filters_fault_injection_runtime&gt;` runtime key.
   * .. attention::
   *  This is a per-stream limit versus a connection level limit. This means that concurrent streams
   *  will each get an independent limit.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultRateLimit response_rate_limit = 7;</code>
   */
  io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultRateLimitOrBuilder getResponseRateLimitOrBuilder();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.delay.fixed_delay_percent
   * </pre>
   *
   * <code>string delay_percent_runtime = 8;</code>
   * @return The delayPercentRuntime.
   */
  java.lang.String getDelayPercentRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.delay.fixed_delay_percent
   * </pre>
   *
   * <code>string delay_percent_runtime = 8;</code>
   * @return The bytes for delayPercentRuntime.
   */
  com.google.protobuf.ByteString
      getDelayPercentRuntimeBytes();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.abort.abort_percent
   * </pre>
   *
   * <code>string abort_percent_runtime = 9;</code>
   * @return The abortPercentRuntime.
   */
  java.lang.String getAbortPercentRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.abort.abort_percent
   * </pre>
   *
   * <code>string abort_percent_runtime = 9;</code>
   * @return The bytes for abortPercentRuntime.
   */
  com.google.protobuf.ByteString
      getAbortPercentRuntimeBytes();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.delay.fixed_duration_ms
   * </pre>
   *
   * <code>string delay_duration_runtime = 10;</code>
   * @return The delayDurationRuntime.
   */
  java.lang.String getDelayDurationRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.delay.fixed_duration_ms
   * </pre>
   *
   * <code>string delay_duration_runtime = 10;</code>
   * @return The bytes for delayDurationRuntime.
   */
  com.google.protobuf.ByteString
      getDelayDurationRuntimeBytes();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.abort.http_status
   * </pre>
   *
   * <code>string abort_http_status_runtime = 11;</code>
   * @return The abortHttpStatusRuntime.
   */
  java.lang.String getAbortHttpStatusRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.abort.http_status
   * </pre>
   *
   * <code>string abort_http_status_runtime = 11;</code>
   * @return The bytes for abortHttpStatusRuntime.
   */
  com.google.protobuf.ByteString
      getAbortHttpStatusRuntimeBytes();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.max_active_faults
   * </pre>
   *
   * <code>string max_active_faults_runtime = 12;</code>
   * @return The maxActiveFaultsRuntime.
   */
  java.lang.String getMaxActiveFaultsRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.max_active_faults
   * </pre>
   *
   * <code>string max_active_faults_runtime = 12;</code>
   * @return The bytes for maxActiveFaultsRuntime.
   */
  com.google.protobuf.ByteString
      getMaxActiveFaultsRuntimeBytes();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.rate_limit.response_percent
   * </pre>
   *
   * <code>string response_rate_limit_percent_runtime = 13;</code>
   * @return The responseRateLimitPercentRuntime.
   */
  java.lang.String getResponseRateLimitPercentRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.rate_limit.response_percent
   * </pre>
   *
   * <code>string response_rate_limit_percent_runtime = 13;</code>
   * @return The bytes for responseRateLimitPercentRuntime.
   */
  com.google.protobuf.ByteString
      getResponseRateLimitPercentRuntimeBytes();

  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.abort.grpc_status
   * </pre>
   *
   * <code>string abort_grpc_status_runtime = 14;</code>
   * @return The abortGrpcStatusRuntime.
   */
  java.lang.String getAbortGrpcStatusRuntime();
  /**
   * <pre>
   * The runtime key to override the :ref:`default &lt;config_http_filters_fault_injection_runtime&gt;`
   * runtime. The default is: fault.http.abort.grpc_status
   * </pre>
   *
   * <code>string abort_grpc_status_runtime = 14;</code>
   * @return The bytes for abortGrpcStatusRuntime.
   */
  com.google.protobuf.ByteString
      getAbortGrpcStatusRuntimeBytes();
}
