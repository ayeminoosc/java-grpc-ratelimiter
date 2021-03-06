// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/metrics.proto

package io.envoyproxy.envoy.admin.v3;

public interface SimpleMetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.admin.v3.SimpleMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the metric represented.
   * </pre>
   *
   * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the metric represented.
   * </pre>
   *
   * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
   * @return The type.
   */
  io.envoyproxy.envoy.admin.v3.SimpleMetric.Type getType();

  /**
   * <pre>
   * Current metric value.
   * </pre>
   *
   * <code>uint64 value = 2;</code>
   * @return The value.
   */
  long getValue();

  /**
   * <pre>
   * Name of the metric.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the metric.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
