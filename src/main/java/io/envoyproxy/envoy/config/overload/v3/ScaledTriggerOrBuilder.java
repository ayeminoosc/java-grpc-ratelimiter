// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/overload/v3/overload.proto

package io.envoyproxy.envoy.config.overload.v3;

public interface ScaledTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.overload.v3.ScaledTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the resource pressure is greater than this value, the trigger will be in the
   * :ref:`scaling &lt;arch_overview_overload_manager-triggers-state&gt;` state with value
   * `(pressure - scaling_threshold) / (saturation_threshold - scaling_threshold)`.
   * </pre>
   *
   * <code>double scaling_threshold = 1 [(.validate.rules) = { ... }</code>
   * @return The scalingThreshold.
   */
  double getScalingThreshold();

  /**
   * <pre>
   * If the resource pressure is greater than this value, the trigger will enter saturation.
   * </pre>
   *
   * <code>double saturation_threshold = 2 [(.validate.rules) = { ... }</code>
   * @return The saturationThreshold.
   */
  double getSaturationThreshold();
}
