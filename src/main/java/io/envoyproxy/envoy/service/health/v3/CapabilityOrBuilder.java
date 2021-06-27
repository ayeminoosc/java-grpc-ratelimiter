// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/health/v3/hds.proto

package io.envoyproxy.envoy.service.health.v3;

public interface CapabilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.health.v3.Capability)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .envoy.service.health.v3.Capability.Protocol health_check_protocols = 1;</code>
   * @return A list containing the healthCheckProtocols.
   */
  java.util.List<io.envoyproxy.envoy.service.health.v3.Capability.Protocol> getHealthCheckProtocolsList();
  /**
   * <code>repeated .envoy.service.health.v3.Capability.Protocol health_check_protocols = 1;</code>
   * @return The count of healthCheckProtocols.
   */
  int getHealthCheckProtocolsCount();
  /**
   * <code>repeated .envoy.service.health.v3.Capability.Protocol health_check_protocols = 1;</code>
   * @param index The index of the element to return.
   * @return The healthCheckProtocols at the given index.
   */
  io.envoyproxy.envoy.service.health.v3.Capability.Protocol getHealthCheckProtocols(int index);
  /**
   * <code>repeated .envoy.service.health.v3.Capability.Protocol health_check_protocols = 1;</code>
   * @return A list containing the enum numeric values on the wire for healthCheckProtocols.
   */
  java.util.List<java.lang.Integer>
  getHealthCheckProtocolsValueList();
  /**
   * <code>repeated .envoy.service.health.v3.Capability.Protocol health_check_protocols = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of healthCheckProtocols at the given index.
   */
  int getHealthCheckProtocolsValue(int index);
}
