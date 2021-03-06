// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/protocol.proto

package io.envoyproxy.envoy.config.core.v3;

public interface KeepaliveSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.KeepaliveSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Send HTTP/2 PING frames at this period, in order to test that the connection is still alive.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   * <pre>
   * Send HTTP/2 PING frames at this period, in order to test that the connection is still alive.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 1 [(.validate.rules) = { ... }</code>
   * @return The interval.
   */
  com.google.protobuf.Duration getInterval();
  /**
   * <pre>
   * Send HTTP/2 PING frames at this period, in order to test that the connection is still alive.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalOrBuilder();

  /**
   * <pre>
   * How long to wait for a response to a keepalive PING. If a response is not received within this
   * time period, the connection will be aborted.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * How long to wait for a response to a keepalive PING. If a response is not received within this
   * time period, the connection will be aborted.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [(.validate.rules) = { ... }</code>
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * How long to wait for a response to a keepalive PING. If a response is not received within this
   * time period, the connection will be aborted.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   * <pre>
   * A random jitter amount as a percentage of interval that will be added to each interval.
   * A value of zero means there will be no jitter.
   * The default value is 15%.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent interval_jitter = 3;</code>
   * @return Whether the intervalJitter field is set.
   */
  boolean hasIntervalJitter();
  /**
   * <pre>
   * A random jitter amount as a percentage of interval that will be added to each interval.
   * A value of zero means there will be no jitter.
   * The default value is 15%.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent interval_jitter = 3;</code>
   * @return The intervalJitter.
   */
  io.envoyproxy.envoy.type.v3.Percent getIntervalJitter();
  /**
   * <pre>
   * A random jitter amount as a percentage of interval that will be added to each interval.
   * A value of zero means there will be no jitter.
   * The default value is 15%.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent interval_jitter = 3;</code>
   */
  io.envoyproxy.envoy.type.v3.PercentOrBuilder getIntervalJitterOrBuilder();
}
