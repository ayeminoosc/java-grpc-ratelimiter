// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/overload/v3/overload.proto

package io.envoyproxy.envoy.config.overload.v3;

public interface ThresholdTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.overload.v3.ThresholdTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the resource pressure is greater than or equal to this value, the trigger
   * will enter saturation.
   * </pre>
   *
   * <code>double value = 1 [(.validate.rules) = { ... }</code>
   * @return The value.
   */
  double getValue();
}
