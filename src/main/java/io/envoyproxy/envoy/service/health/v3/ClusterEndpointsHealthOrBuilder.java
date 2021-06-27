// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/health/v3/hds.proto

package io.envoyproxy.envoy.service.health.v3;

public interface ClusterEndpointsHealthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.health.v3.ClusterEndpointsHealth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cluster_name = 1;</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <code>string cluster_name = 1;</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpointsHealth locality_endpoints_health = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.service.health.v3.LocalityEndpointsHealth> 
      getLocalityEndpointsHealthList();
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpointsHealth locality_endpoints_health = 2;</code>
   */
  io.envoyproxy.envoy.service.health.v3.LocalityEndpointsHealth getLocalityEndpointsHealth(int index);
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpointsHealth locality_endpoints_health = 2;</code>
   */
  int getLocalityEndpointsHealthCount();
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpointsHealth locality_endpoints_health = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.service.health.v3.LocalityEndpointsHealthOrBuilder> 
      getLocalityEndpointsHealthOrBuilderList();
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpointsHealth locality_endpoints_health = 2;</code>
   */
  io.envoyproxy.envoy.service.health.v3.LocalityEndpointsHealthOrBuilder getLocalityEndpointsHealthOrBuilder(
      int index);
}
