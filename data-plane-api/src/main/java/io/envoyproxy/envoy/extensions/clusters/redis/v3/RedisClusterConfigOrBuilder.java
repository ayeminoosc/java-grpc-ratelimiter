// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/clusters/redis/v3/redis_cluster.proto

package io.envoyproxy.envoy.extensions.clusters.redis.v3;

public interface RedisClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.clusters.redis.v3.RedisClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Interval between successive topology refresh requests. If not set, this defaults to 5s.
   * </pre>
   *
   * <code>.google.protobuf.Duration cluster_refresh_rate = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the clusterRefreshRate field is set.
   */
  boolean hasClusterRefreshRate();
  /**
   * <pre>
   * Interval between successive topology refresh requests. If not set, this defaults to 5s.
   * </pre>
   *
   * <code>.google.protobuf.Duration cluster_refresh_rate = 1 [(.validate.rules) = { ... }</code>
   * @return The clusterRefreshRate.
   */
  com.google.protobuf.Duration getClusterRefreshRate();
  /**
   * <pre>
   * Interval between successive topology refresh requests. If not set, this defaults to 5s.
   * </pre>
   *
   * <code>.google.protobuf.Duration cluster_refresh_rate = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getClusterRefreshRateOrBuilder();

  /**
   * <pre>
   * Timeout for topology refresh request. If not set, this defaults to 3s.
   * </pre>
   *
   * <code>.google.protobuf.Duration cluster_refresh_timeout = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the clusterRefreshTimeout field is set.
   */
  boolean hasClusterRefreshTimeout();
  /**
   * <pre>
   * Timeout for topology refresh request. If not set, this defaults to 3s.
   * </pre>
   *
   * <code>.google.protobuf.Duration cluster_refresh_timeout = 2 [(.validate.rules) = { ... }</code>
   * @return The clusterRefreshTimeout.
   */
  com.google.protobuf.Duration getClusterRefreshTimeout();
  /**
   * <pre>
   * Timeout for topology refresh request. If not set, this defaults to 3s.
   * </pre>
   *
   * <code>.google.protobuf.Duration cluster_refresh_timeout = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getClusterRefreshTimeoutOrBuilder();

  /**
   * <pre>
   * The minimum interval that must pass after triggering a topology refresh request before a new
   * request can possibly be triggered again. Any errors received during one of these
   * time intervals are ignored. If not set, this defaults to 5s.
   * </pre>
   *
   * <code>.google.protobuf.Duration redirect_refresh_interval = 3;</code>
   * @return Whether the redirectRefreshInterval field is set.
   */
  boolean hasRedirectRefreshInterval();
  /**
   * <pre>
   * The minimum interval that must pass after triggering a topology refresh request before a new
   * request can possibly be triggered again. Any errors received during one of these
   * time intervals are ignored. If not set, this defaults to 5s.
   * </pre>
   *
   * <code>.google.protobuf.Duration redirect_refresh_interval = 3;</code>
   * @return The redirectRefreshInterval.
   */
  com.google.protobuf.Duration getRedirectRefreshInterval();
  /**
   * <pre>
   * The minimum interval that must pass after triggering a topology refresh request before a new
   * request can possibly be triggered again. Any errors received during one of these
   * time intervals are ignored. If not set, this defaults to 5s.
   * </pre>
   *
   * <code>.google.protobuf.Duration redirect_refresh_interval = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getRedirectRefreshIntervalOrBuilder();

  /**
   * <pre>
   * The number of redirection errors that must be received before
   * triggering a topology refresh request. If not set, this defaults to 5.
   * If this is set to 0, topology refresh after redirect is disabled.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value redirect_refresh_threshold = 4;</code>
   * @return Whether the redirectRefreshThreshold field is set.
   */
  boolean hasRedirectRefreshThreshold();
  /**
   * <pre>
   * The number of redirection errors that must be received before
   * triggering a topology refresh request. If not set, this defaults to 5.
   * If this is set to 0, topology refresh after redirect is disabled.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value redirect_refresh_threshold = 4;</code>
   * @return The redirectRefreshThreshold.
   */
  com.google.protobuf.UInt32Value getRedirectRefreshThreshold();
  /**
   * <pre>
   * The number of redirection errors that must be received before
   * triggering a topology refresh request. If not set, this defaults to 5.
   * If this is set to 0, topology refresh after redirect is disabled.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value redirect_refresh_threshold = 4;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getRedirectRefreshThresholdOrBuilder();

  /**
   * <pre>
   * The number of failures that must be received before triggering a topology refresh request.
   * If not set, this defaults to 0, which disables the topology refresh due to failure.
   * </pre>
   *
   * <code>uint32 failure_refresh_threshold = 5;</code>
   * @return The failureRefreshThreshold.
   */
  int getFailureRefreshThreshold();

  /**
   * <pre>
   * The number of hosts became degraded or unhealthy before triggering a topology refresh request.
   * If not set, this defaults to 0, which disables the topology refresh due to degraded or
   * unhealthy host.
   * </pre>
   *
   * <code>uint32 host_degraded_refresh_threshold = 6;</code>
   * @return The hostDegradedRefreshThreshold.
   */
  int getHostDegradedRefreshThreshold();
}
