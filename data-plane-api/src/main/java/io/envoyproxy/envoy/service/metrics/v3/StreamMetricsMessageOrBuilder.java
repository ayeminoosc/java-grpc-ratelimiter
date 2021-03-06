// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/metrics/v3/metrics_service.proto

package io.envoyproxy.envoy.service.metrics.v3;

public interface StreamMetricsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.metrics.v3.StreamMetricsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier data effectively is a structured metadata. As a performance optimization this will
   * only be sent in the first message on the stream.
   * </pre>
   *
   * <code>.envoy.service.metrics.v3.StreamMetricsMessage.Identifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Identifier data effectively is a structured metadata. As a performance optimization this will
   * only be sent in the first message on the stream.
   * </pre>
   *
   * <code>.envoy.service.metrics.v3.StreamMetricsMessage.Identifier identifier = 1;</code>
   * @return The identifier.
   */
  io.envoyproxy.envoy.service.metrics.v3.StreamMetricsMessage.Identifier getIdentifier();
  /**
   * <pre>
   * Identifier data effectively is a structured metadata. As a performance optimization this will
   * only be sent in the first message on the stream.
   * </pre>
   *
   * <code>.envoy.service.metrics.v3.StreamMetricsMessage.Identifier identifier = 1;</code>
   */
  io.envoyproxy.envoy.service.metrics.v3.StreamMetricsMessage.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * A list of metric entries
   * </pre>
   *
   * <code>repeated .io.prometheus.client.MetricFamily envoy_metrics = 2;</code>
   */
  java.util.List<io.prometheus.client.Metrics.MetricFamily> 
      getEnvoyMetricsList();
  /**
   * <pre>
   * A list of metric entries
   * </pre>
   *
   * <code>repeated .io.prometheus.client.MetricFamily envoy_metrics = 2;</code>
   */
  io.prometheus.client.Metrics.MetricFamily getEnvoyMetrics(int index);
  /**
   * <pre>
   * A list of metric entries
   * </pre>
   *
   * <code>repeated .io.prometheus.client.MetricFamily envoy_metrics = 2;</code>
   */
  int getEnvoyMetricsCount();
  /**
   * <pre>
   * A list of metric entries
   * </pre>
   *
   * <code>repeated .io.prometheus.client.MetricFamily envoy_metrics = 2;</code>
   */
  java.util.List<? extends io.prometheus.client.Metrics.MetricFamilyOrBuilder> 
      getEnvoyMetricsOrBuilderList();
  /**
   * <pre>
   * A list of metric entries
   * </pre>
   *
   * <code>repeated .io.prometheus.client.MetricFamily envoy_metrics = 2;</code>
   */
  io.prometheus.client.Metrics.MetricFamilyOrBuilder getEnvoyMetricsOrBuilder(
      int index);
}
