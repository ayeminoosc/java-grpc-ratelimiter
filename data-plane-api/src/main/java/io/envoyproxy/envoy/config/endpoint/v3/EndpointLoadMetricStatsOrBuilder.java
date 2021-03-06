// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/endpoint/v3/load_report.proto

package io.envoyproxy.envoy.config.endpoint.v3;

public interface EndpointLoadMetricStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.endpoint.v3.EndpointLoadMetricStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the metric; may be empty.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   * <pre>
   * Name of the metric; may be empty.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString
      getMetricNameBytes();

  /**
   * <pre>
   * Number of calls that finished and included this metric.
   * </pre>
   *
   * <code>uint64 num_requests_finished_with_metric = 2;</code>
   * @return The numRequestsFinishedWithMetric.
   */
  long getNumRequestsFinishedWithMetric();

  /**
   * <pre>
   * Sum of metric values across all calls that finished with this metric for
   * load_reporting_interval.
   * </pre>
   *
   * <code>double total_metric_value = 3;</code>
   * @return The totalMetricValue.
   */
  double getTotalMetricValue();
}
