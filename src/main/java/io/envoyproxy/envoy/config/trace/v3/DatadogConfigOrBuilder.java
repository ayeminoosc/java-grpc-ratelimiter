// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v3/datadog.proto

package io.envoyproxy.envoy.config.trace.v3;

public interface DatadogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.trace.v3.DatadogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The cluster to use for submitting traces to the Datadog agent.
   * </pre>
   *
   * <code>string collector_cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The collectorCluster.
   */
  java.lang.String getCollectorCluster();
  /**
   * <pre>
   * The cluster to use for submitting traces to the Datadog agent.
   * </pre>
   *
   * <code>string collector_cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for collectorCluster.
   */
  com.google.protobuf.ByteString
      getCollectorClusterBytes();

  /**
   * <pre>
   * The name used for the service when traces are generated by envoy.
   * </pre>
   *
   * <code>string service_name = 2 [(.validate.rules) = { ... }</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The name used for the service when traces are generated by envoy.
   * </pre>
   *
   * <code>string service_name = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();
}
