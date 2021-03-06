// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/overload/v3/overload.proto

package io.envoyproxy.envoy.config.overload.v3;

public interface ScaleTimersOverloadActionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.overload.v3.ScaleTimersOverloadActionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A set of timer scaling rules to be applied.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer timer_scale_factors = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer> 
      getTimerScaleFactorsList();
  /**
   * <pre>
   * A set of timer scaling rules to be applied.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer timer_scale_factors = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer getTimerScaleFactors(int index);
  /**
   * <pre>
   * A set of timer scaling rules to be applied.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer timer_scale_factors = 1 [(.validate.rules) = { ... }</code>
   */
  int getTimerScaleFactorsCount();
  /**
   * <pre>
   * A set of timer scaling rules to be applied.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer timer_scale_factors = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimerOrBuilder> 
      getTimerScaleFactorsOrBuilderList();
  /**
   * <pre>
   * A set of timer scaling rules to be applied.
   * </pre>
   *
   * <code>repeated .envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimer timer_scale_factors = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.overload.v3.ScaleTimersOverloadActionConfig.ScaleTimerOrBuilder getTimerScaleFactorsOrBuilder(
      int index);
}
