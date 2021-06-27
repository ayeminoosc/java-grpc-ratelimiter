// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/health_check.proto

package io.envoyproxy.envoy.config.core.v3;

public interface HealthCheckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.HealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time to wait for a health check response. If the timeout is reached the
   * health check attempt will be considered a failure.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * The time to wait for a health check response. If the timeout is reached the
   * health check attempt will be considered a failure.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1 [(.validate.rules) = { ... }</code>
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   * <pre>
   * The time to wait for a health check response. If the timeout is reached the
   * health check attempt will be considered a failure.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   * <pre>
   * The interval between health checks.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   * <pre>
   * The interval between health checks.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2 [(.validate.rules) = { ... }</code>
   * @return The interval.
   */
  com.google.protobuf.Duration getInterval();
  /**
   * <pre>
   * The interval between health checks.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalOrBuilder();

  /**
   * <pre>
   * An optional jitter amount in milliseconds. If specified, Envoy will start health
   * checking after for a random time in ms between 0 and initial_jitter. This only
   * applies to the first health check.
   * </pre>
   *
   * <code>.google.protobuf.Duration initial_jitter = 20;</code>
   * @return Whether the initialJitter field is set.
   */
  boolean hasInitialJitter();
  /**
   * <pre>
   * An optional jitter amount in milliseconds. If specified, Envoy will start health
   * checking after for a random time in ms between 0 and initial_jitter. This only
   * applies to the first health check.
   * </pre>
   *
   * <code>.google.protobuf.Duration initial_jitter = 20;</code>
   * @return The initialJitter.
   */
  com.google.protobuf.Duration getInitialJitter();
  /**
   * <pre>
   * An optional jitter amount in milliseconds. If specified, Envoy will start health
   * checking after for a random time in ms between 0 and initial_jitter. This only
   * applies to the first health check.
   * </pre>
   *
   * <code>.google.protobuf.Duration initial_jitter = 20;</code>
   */
  com.google.protobuf.DurationOrBuilder getInitialJitterOrBuilder();

  /**
   * <pre>
   * An optional jitter amount in milliseconds. If specified, during every
   * interval Envoy will add interval_jitter to the wait time.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval_jitter = 3;</code>
   * @return Whether the intervalJitter field is set.
   */
  boolean hasIntervalJitter();
  /**
   * <pre>
   * An optional jitter amount in milliseconds. If specified, during every
   * interval Envoy will add interval_jitter to the wait time.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval_jitter = 3;</code>
   * @return The intervalJitter.
   */
  com.google.protobuf.Duration getIntervalJitter();
  /**
   * <pre>
   * An optional jitter amount in milliseconds. If specified, during every
   * interval Envoy will add interval_jitter to the wait time.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval_jitter = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalJitterOrBuilder();

  /**
   * <pre>
   * An optional jitter amount as a percentage of interval_ms. If specified,
   * during every interval Envoy will add interval_ms *
   * interval_jitter_percent / 100 to the wait time.
   * If interval_jitter_ms and interval_jitter_percent are both set, both of
   * them will be used to increase the wait time.
   * </pre>
   *
   * <code>uint32 interval_jitter_percent = 18;</code>
   * @return The intervalJitterPercent.
   */
  int getIntervalJitterPercent();

  /**
   * <pre>
   * The number of unhealthy health checks required before a host is marked
   * unhealthy. Note that for *http* health checking if a host responds with 503
   * this threshold is ignored and the host is considered unhealthy immediately.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value unhealthy_threshold = 4 [(.validate.rules) = { ... }</code>
   * @return Whether the unhealthyThreshold field is set.
   */
  boolean hasUnhealthyThreshold();
  /**
   * <pre>
   * The number of unhealthy health checks required before a host is marked
   * unhealthy. Note that for *http* health checking if a host responds with 503
   * this threshold is ignored and the host is considered unhealthy immediately.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value unhealthy_threshold = 4 [(.validate.rules) = { ... }</code>
   * @return The unhealthyThreshold.
   */
  com.google.protobuf.UInt32Value getUnhealthyThreshold();
  /**
   * <pre>
   * The number of unhealthy health checks required before a host is marked
   * unhealthy. Note that for *http* health checking if a host responds with 503
   * this threshold is ignored and the host is considered unhealthy immediately.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value unhealthy_threshold = 4 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getUnhealthyThresholdOrBuilder();

  /**
   * <pre>
   * The number of healthy health checks required before a host is marked
   * healthy. Note that during startup, only a single successful health check is
   * required to mark a host healthy.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value healthy_threshold = 5 [(.validate.rules) = { ... }</code>
   * @return Whether the healthyThreshold field is set.
   */
  boolean hasHealthyThreshold();
  /**
   * <pre>
   * The number of healthy health checks required before a host is marked
   * healthy. Note that during startup, only a single successful health check is
   * required to mark a host healthy.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value healthy_threshold = 5 [(.validate.rules) = { ... }</code>
   * @return The healthyThreshold.
   */
  com.google.protobuf.UInt32Value getHealthyThreshold();
  /**
   * <pre>
   * The number of healthy health checks required before a host is marked
   * healthy. Note that during startup, only a single successful health check is
   * required to mark a host healthy.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value healthy_threshold = 5 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getHealthyThresholdOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:] Non-serving port for health checking.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value alt_port = 6;</code>
   * @return Whether the altPort field is set.
   */
  boolean hasAltPort();
  /**
   * <pre>
   * [#not-implemented-hide:] Non-serving port for health checking.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value alt_port = 6;</code>
   * @return The altPort.
   */
  com.google.protobuf.UInt32Value getAltPort();
  /**
   * <pre>
   * [#not-implemented-hide:] Non-serving port for health checking.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value alt_port = 6;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getAltPortOrBuilder();

  /**
   * <pre>
   * Reuse health check connection between health checks. Default is true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue reuse_connection = 7;</code>
   * @return Whether the reuseConnection field is set.
   */
  boolean hasReuseConnection();
  /**
   * <pre>
   * Reuse health check connection between health checks. Default is true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue reuse_connection = 7;</code>
   * @return The reuseConnection.
   */
  com.google.protobuf.BoolValue getReuseConnection();
  /**
   * <pre>
   * Reuse health check connection between health checks. Default is true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue reuse_connection = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getReuseConnectionOrBuilder();

  /**
   * <pre>
   * HTTP health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.HttpHealthCheck http_health_check = 8;</code>
   * @return Whether the httpHealthCheck field is set.
   */
  boolean hasHttpHealthCheck();
  /**
   * <pre>
   * HTTP health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.HttpHealthCheck http_health_check = 8;</code>
   * @return The httpHealthCheck.
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.HttpHealthCheck getHttpHealthCheck();
  /**
   * <pre>
   * HTTP health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.HttpHealthCheck http_health_check = 8;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.HttpHealthCheckOrBuilder getHttpHealthCheckOrBuilder();

  /**
   * <pre>
   * TCP health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.TcpHealthCheck tcp_health_check = 9;</code>
   * @return Whether the tcpHealthCheck field is set.
   */
  boolean hasTcpHealthCheck();
  /**
   * <pre>
   * TCP health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.TcpHealthCheck tcp_health_check = 9;</code>
   * @return The tcpHealthCheck.
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.TcpHealthCheck getTcpHealthCheck();
  /**
   * <pre>
   * TCP health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.TcpHealthCheck tcp_health_check = 9;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.TcpHealthCheckOrBuilder getTcpHealthCheckOrBuilder();

  /**
   * <pre>
   * gRPC health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.GrpcHealthCheck grpc_health_check = 11;</code>
   * @return Whether the grpcHealthCheck field is set.
   */
  boolean hasGrpcHealthCheck();
  /**
   * <pre>
   * gRPC health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.GrpcHealthCheck grpc_health_check = 11;</code>
   * @return The grpcHealthCheck.
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.GrpcHealthCheck getGrpcHealthCheck();
  /**
   * <pre>
   * gRPC health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.GrpcHealthCheck grpc_health_check = 11;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.GrpcHealthCheckOrBuilder getGrpcHealthCheckOrBuilder();

  /**
   * <pre>
   * Custom health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.CustomHealthCheck custom_health_check = 13;</code>
   * @return Whether the customHealthCheck field is set.
   */
  boolean hasCustomHealthCheck();
  /**
   * <pre>
   * Custom health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.CustomHealthCheck custom_health_check = 13;</code>
   * @return The customHealthCheck.
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.CustomHealthCheck getCustomHealthCheck();
  /**
   * <pre>
   * Custom health check.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.CustomHealthCheck custom_health_check = 13;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.CustomHealthCheckOrBuilder getCustomHealthCheckOrBuilder();

  /**
   * <pre>
   * The "no traffic interval" is a special health check interval that is used when a cluster has
   * never had traffic routed to it. This lower interval allows cluster information to be kept up to
   * date, without sending a potentially large amount of active health checking traffic for no
   * reason. Once a cluster has been used for traffic routing, Envoy will shift back to using the
   * standard health check interval that is defined. Note that this interval takes precedence over
   * any other.
   * The default value for "no traffic interval" is 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_traffic_interval = 12 [(.validate.rules) = { ... }</code>
   * @return Whether the noTrafficInterval field is set.
   */
  boolean hasNoTrafficInterval();
  /**
   * <pre>
   * The "no traffic interval" is a special health check interval that is used when a cluster has
   * never had traffic routed to it. This lower interval allows cluster information to be kept up to
   * date, without sending a potentially large amount of active health checking traffic for no
   * reason. Once a cluster has been used for traffic routing, Envoy will shift back to using the
   * standard health check interval that is defined. Note that this interval takes precedence over
   * any other.
   * The default value for "no traffic interval" is 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_traffic_interval = 12 [(.validate.rules) = { ... }</code>
   * @return The noTrafficInterval.
   */
  com.google.protobuf.Duration getNoTrafficInterval();
  /**
   * <pre>
   * The "no traffic interval" is a special health check interval that is used when a cluster has
   * never had traffic routed to it. This lower interval allows cluster information to be kept up to
   * date, without sending a potentially large amount of active health checking traffic for no
   * reason. Once a cluster has been used for traffic routing, Envoy will shift back to using the
   * standard health check interval that is defined. Note that this interval takes precedence over
   * any other.
   * The default value for "no traffic interval" is 60 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_traffic_interval = 12 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getNoTrafficIntervalOrBuilder();

  /**
   * <pre>
   * The "no traffic healthy interval" is a special health check interval that
   * is used for hosts that are currently passing active health checking
   * (including new hosts) when the cluster has received no traffic.
   * This is useful for when we want to send frequent health checks with
   * `no_traffic_interval` but then revert to lower frequency `no_traffic_healthy_interval` once
   * a host in the cluster is marked as healthy.
   * Once a cluster has been used for traffic routing, Envoy will shift back to using the
   * standard health check interval that is defined.
   * If no_traffic_healthy_interval is not set, it will default to the
   * no traffic interval and send that interval regardless of health state.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_traffic_healthy_interval = 24 [(.validate.rules) = { ... }</code>
   * @return Whether the noTrafficHealthyInterval field is set.
   */
  boolean hasNoTrafficHealthyInterval();
  /**
   * <pre>
   * The "no traffic healthy interval" is a special health check interval that
   * is used for hosts that are currently passing active health checking
   * (including new hosts) when the cluster has received no traffic.
   * This is useful for when we want to send frequent health checks with
   * `no_traffic_interval` but then revert to lower frequency `no_traffic_healthy_interval` once
   * a host in the cluster is marked as healthy.
   * Once a cluster has been used for traffic routing, Envoy will shift back to using the
   * standard health check interval that is defined.
   * If no_traffic_healthy_interval is not set, it will default to the
   * no traffic interval and send that interval regardless of health state.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_traffic_healthy_interval = 24 [(.validate.rules) = { ... }</code>
   * @return The noTrafficHealthyInterval.
   */
  com.google.protobuf.Duration getNoTrafficHealthyInterval();
  /**
   * <pre>
   * The "no traffic healthy interval" is a special health check interval that
   * is used for hosts that are currently passing active health checking
   * (including new hosts) when the cluster has received no traffic.
   * This is useful for when we want to send frequent health checks with
   * `no_traffic_interval` but then revert to lower frequency `no_traffic_healthy_interval` once
   * a host in the cluster is marked as healthy.
   * Once a cluster has been used for traffic routing, Envoy will shift back to using the
   * standard health check interval that is defined.
   * If no_traffic_healthy_interval is not set, it will default to the
   * no traffic interval and send that interval regardless of health state.
   * </pre>
   *
   * <code>.google.protobuf.Duration no_traffic_healthy_interval = 24 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getNoTrafficHealthyIntervalOrBuilder();

  /**
   * <pre>
   * The "unhealthy interval" is a health check interval that is used for hosts that are marked as
   * unhealthy. As soon as the host is marked as healthy, Envoy will shift back to using the
   * standard health check interval that is defined.
   * The default value for "unhealthy interval" is the same as "interval".
   * </pre>
   *
   * <code>.google.protobuf.Duration unhealthy_interval = 14 [(.validate.rules) = { ... }</code>
   * @return Whether the unhealthyInterval field is set.
   */
  boolean hasUnhealthyInterval();
  /**
   * <pre>
   * The "unhealthy interval" is a health check interval that is used for hosts that are marked as
   * unhealthy. As soon as the host is marked as healthy, Envoy will shift back to using the
   * standard health check interval that is defined.
   * The default value for "unhealthy interval" is the same as "interval".
   * </pre>
   *
   * <code>.google.protobuf.Duration unhealthy_interval = 14 [(.validate.rules) = { ... }</code>
   * @return The unhealthyInterval.
   */
  com.google.protobuf.Duration getUnhealthyInterval();
  /**
   * <pre>
   * The "unhealthy interval" is a health check interval that is used for hosts that are marked as
   * unhealthy. As soon as the host is marked as healthy, Envoy will shift back to using the
   * standard health check interval that is defined.
   * The default value for "unhealthy interval" is the same as "interval".
   * </pre>
   *
   * <code>.google.protobuf.Duration unhealthy_interval = 14 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getUnhealthyIntervalOrBuilder();

  /**
   * <pre>
   * The "unhealthy edge interval" is a special health check interval that is used for the first
   * health check right after a host is marked as unhealthy. For subsequent health checks
   * Envoy will shift back to using either "unhealthy interval" if present or the standard health
   * check interval that is defined.
   * The default value for "unhealthy edge interval" is the same as "unhealthy interval".
   * </pre>
   *
   * <code>.google.protobuf.Duration unhealthy_edge_interval = 15 [(.validate.rules) = { ... }</code>
   * @return Whether the unhealthyEdgeInterval field is set.
   */
  boolean hasUnhealthyEdgeInterval();
  /**
   * <pre>
   * The "unhealthy edge interval" is a special health check interval that is used for the first
   * health check right after a host is marked as unhealthy. For subsequent health checks
   * Envoy will shift back to using either "unhealthy interval" if present or the standard health
   * check interval that is defined.
   * The default value for "unhealthy edge interval" is the same as "unhealthy interval".
   * </pre>
   *
   * <code>.google.protobuf.Duration unhealthy_edge_interval = 15 [(.validate.rules) = { ... }</code>
   * @return The unhealthyEdgeInterval.
   */
  com.google.protobuf.Duration getUnhealthyEdgeInterval();
  /**
   * <pre>
   * The "unhealthy edge interval" is a special health check interval that is used for the first
   * health check right after a host is marked as unhealthy. For subsequent health checks
   * Envoy will shift back to using either "unhealthy interval" if present or the standard health
   * check interval that is defined.
   * The default value for "unhealthy edge interval" is the same as "unhealthy interval".
   * </pre>
   *
   * <code>.google.protobuf.Duration unhealthy_edge_interval = 15 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getUnhealthyEdgeIntervalOrBuilder();

  /**
   * <pre>
   * The "healthy edge interval" is a special health check interval that is used for the first
   * health check right after a host is marked as healthy. For subsequent health checks
   * Envoy will shift back to using the standard health check interval that is defined.
   * The default value for "healthy edge interval" is the same as the default interval.
   * </pre>
   *
   * <code>.google.protobuf.Duration healthy_edge_interval = 16 [(.validate.rules) = { ... }</code>
   * @return Whether the healthyEdgeInterval field is set.
   */
  boolean hasHealthyEdgeInterval();
  /**
   * <pre>
   * The "healthy edge interval" is a special health check interval that is used for the first
   * health check right after a host is marked as healthy. For subsequent health checks
   * Envoy will shift back to using the standard health check interval that is defined.
   * The default value for "healthy edge interval" is the same as the default interval.
   * </pre>
   *
   * <code>.google.protobuf.Duration healthy_edge_interval = 16 [(.validate.rules) = { ... }</code>
   * @return The healthyEdgeInterval.
   */
  com.google.protobuf.Duration getHealthyEdgeInterval();
  /**
   * <pre>
   * The "healthy edge interval" is a special health check interval that is used for the first
   * health check right after a host is marked as healthy. For subsequent health checks
   * Envoy will shift back to using the standard health check interval that is defined.
   * The default value for "healthy edge interval" is the same as the default interval.
   * </pre>
   *
   * <code>.google.protobuf.Duration healthy_edge_interval = 16 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getHealthyEdgeIntervalOrBuilder();

  /**
   * <pre>
   * Specifies the path to the :ref:`health check event log &lt;arch_overview_health_check_logging&gt;`.
   * If empty, no event log will be written.
   * </pre>
   *
   * <code>string event_log_path = 17;</code>
   * @return The eventLogPath.
   */
  java.lang.String getEventLogPath();
  /**
   * <pre>
   * Specifies the path to the :ref:`health check event log &lt;arch_overview_health_check_logging&gt;`.
   * If empty, no event log will be written.
   * </pre>
   *
   * <code>string event_log_path = 17;</code>
   * @return The bytes for eventLogPath.
   */
  com.google.protobuf.ByteString
      getEventLogPathBytes();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * The gRPC service for the health check event service.
   * If empty, health check events won't be sent to a remote endpoint.
   * </pre>
   *
   * <code>.envoy.config.core.v3.EventServiceConfig event_service = 22;</code>
   * @return Whether the eventService field is set.
   */
  boolean hasEventService();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The gRPC service for the health check event service.
   * If empty, health check events won't be sent to a remote endpoint.
   * </pre>
   *
   * <code>.envoy.config.core.v3.EventServiceConfig event_service = 22;</code>
   * @return The eventService.
   */
  io.envoyproxy.envoy.config.core.v3.EventServiceConfig getEventService();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * The gRPC service for the health check event service.
   * If empty, health check events won't be sent to a remote endpoint.
   * </pre>
   *
   * <code>.envoy.config.core.v3.EventServiceConfig event_service = 22;</code>
   */
  io.envoyproxy.envoy.config.core.v3.EventServiceConfigOrBuilder getEventServiceOrBuilder();

  /**
   * <pre>
   * If set to true, health check failure events will always be logged. If set to false, only the
   * initial health check failure event will be logged.
   * The default value is false.
   * </pre>
   *
   * <code>bool always_log_health_check_failures = 19;</code>
   * @return The alwaysLogHealthCheckFailures.
   */
  boolean getAlwaysLogHealthCheckFailures();

  /**
   * <pre>
   * This allows overriding the cluster TLS settings, just for health check connections.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.TlsOptions tls_options = 21;</code>
   * @return Whether the tlsOptions field is set.
   */
  boolean hasTlsOptions();
  /**
   * <pre>
   * This allows overriding the cluster TLS settings, just for health check connections.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.TlsOptions tls_options = 21;</code>
   * @return The tlsOptions.
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.TlsOptions getTlsOptions();
  /**
   * <pre>
   * This allows overriding the cluster TLS settings, just for health check connections.
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthCheck.TlsOptions tls_options = 21;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck.TlsOptionsOrBuilder getTlsOptionsOrBuilder();

  /**
   * <pre>
   * Optional key/value pairs that will be used to match a transport socket from those specified in the cluster's
   * :ref:`tranport socket matches &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * For example, the following match criteria
   * .. code-block:: yaml
   *  transport_socket_match_criteria:
   *    useMTLS: true
   * Will match the following :ref:`cluster socket match &lt;envoy_api_msg_config.cluster.v3.Cluster.TransportSocketMatch&gt;`
   * .. code-block:: yaml
   *  transport_socket_matches:
   *  - name: "useMTLS"
   *    match:
   *      useMTLS: true
   *    transport_socket:
   *      name: envoy.transport_sockets.tls
   *      config: { ... } # tls socket configuration
   * If this field is set, then for health checks it will supersede an entry of *envoy.transport_socket* in the
   * :ref:`LbEndpoint.Metadata &lt;envoy_api_field_config.endpoint.v3.LbEndpoint.metadata&gt;`.
   * This allows using different transport socket capabilities for health checking versus proxying to the
   * endpoint.
   * If the key/values pairs specified do not match any
   * :ref:`transport socket matches &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`,
   * the cluster's :ref:`transport socket &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket&gt;`
   * will be used for health check socket configuration.
   * </pre>
   *
   * <code>.google.protobuf.Struct transport_socket_match_criteria = 23;</code>
   * @return Whether the transportSocketMatchCriteria field is set.
   */
  boolean hasTransportSocketMatchCriteria();
  /**
   * <pre>
   * Optional key/value pairs that will be used to match a transport socket from those specified in the cluster's
   * :ref:`tranport socket matches &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * For example, the following match criteria
   * .. code-block:: yaml
   *  transport_socket_match_criteria:
   *    useMTLS: true
   * Will match the following :ref:`cluster socket match &lt;envoy_api_msg_config.cluster.v3.Cluster.TransportSocketMatch&gt;`
   * .. code-block:: yaml
   *  transport_socket_matches:
   *  - name: "useMTLS"
   *    match:
   *      useMTLS: true
   *    transport_socket:
   *      name: envoy.transport_sockets.tls
   *      config: { ... } # tls socket configuration
   * If this field is set, then for health checks it will supersede an entry of *envoy.transport_socket* in the
   * :ref:`LbEndpoint.Metadata &lt;envoy_api_field_config.endpoint.v3.LbEndpoint.metadata&gt;`.
   * This allows using different transport socket capabilities for health checking versus proxying to the
   * endpoint.
   * If the key/values pairs specified do not match any
   * :ref:`transport socket matches &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`,
   * the cluster's :ref:`transport socket &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket&gt;`
   * will be used for health check socket configuration.
   * </pre>
   *
   * <code>.google.protobuf.Struct transport_socket_match_criteria = 23;</code>
   * @return The transportSocketMatchCriteria.
   */
  com.google.protobuf.Struct getTransportSocketMatchCriteria();
  /**
   * <pre>
   * Optional key/value pairs that will be used to match a transport socket from those specified in the cluster's
   * :ref:`tranport socket matches &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * For example, the following match criteria
   * .. code-block:: yaml
   *  transport_socket_match_criteria:
   *    useMTLS: true
   * Will match the following :ref:`cluster socket match &lt;envoy_api_msg_config.cluster.v3.Cluster.TransportSocketMatch&gt;`
   * .. code-block:: yaml
   *  transport_socket_matches:
   *  - name: "useMTLS"
   *    match:
   *      useMTLS: true
   *    transport_socket:
   *      name: envoy.transport_sockets.tls
   *      config: { ... } # tls socket configuration
   * If this field is set, then for health checks it will supersede an entry of *envoy.transport_socket* in the
   * :ref:`LbEndpoint.Metadata &lt;envoy_api_field_config.endpoint.v3.LbEndpoint.metadata&gt;`.
   * This allows using different transport socket capabilities for health checking versus proxying to the
   * endpoint.
   * If the key/values pairs specified do not match any
   * :ref:`transport socket matches &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`,
   * the cluster's :ref:`transport socket &lt;envoy_api_field_config.cluster.v3.Cluster.transport_socket&gt;`
   * will be used for health check socket configuration.
   * </pre>
   *
   * <code>.google.protobuf.Struct transport_socket_match_criteria = 23;</code>
   */
  com.google.protobuf.StructOrBuilder getTransportSocketMatchCriteriaOrBuilder();

  public io.envoyproxy.envoy.config.core.v3.HealthCheck.HealthCheckerCase getHealthCheckerCase();
}
