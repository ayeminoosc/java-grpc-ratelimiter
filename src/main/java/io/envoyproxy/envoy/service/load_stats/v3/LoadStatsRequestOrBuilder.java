// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/load_stats/v3/lrs.proto

package io.envoyproxy.envoy.service.load_stats.v3;

public interface LoadStatsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.load_stats.v3.LoadStatsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node identifier for Envoy instance.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Node node = 1;</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <pre>
   * Node identifier for Envoy instance.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Node node = 1;</code>
   * @return The node.
   */
  io.envoyproxy.envoy.config.core.v3.Node getNode();
  /**
   * <pre>
   * Node identifier for Envoy instance.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Node node = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.NodeOrBuilder getNodeOrBuilder();

  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.config.endpoint.v3.ClusterStats cluster_stats = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.endpoint.v3.ClusterStats> 
      getClusterStatsList();
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.config.endpoint.v3.ClusterStats cluster_stats = 2;</code>
   */
  io.envoyproxy.envoy.config.endpoint.v3.ClusterStats getClusterStats(int index);
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.config.endpoint.v3.ClusterStats cluster_stats = 2;</code>
   */
  int getClusterStatsCount();
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.config.endpoint.v3.ClusterStats cluster_stats = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.endpoint.v3.ClusterStatsOrBuilder> 
      getClusterStatsOrBuilderList();
  /**
   * <pre>
   * A list of load stats to report.
   * </pre>
   *
   * <code>repeated .envoy.config.endpoint.v3.ClusterStats cluster_stats = 2;</code>
   */
  io.envoyproxy.envoy.config.endpoint.v3.ClusterStatsOrBuilder getClusterStatsOrBuilder(
      int index);
}
