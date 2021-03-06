// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/config_dump.proto

package io.envoyproxy.envoy.admin.v3;

public interface EndpointsConfigDumpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.admin.v3.EndpointsConfigDump)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The statically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig static_endpoint_configs = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig> 
      getStaticEndpointConfigsList();
  /**
   * <pre>
   * The statically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig static_endpoint_configs = 2;</code>
   */
  io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig getStaticEndpointConfigs(int index);
  /**
   * <pre>
   * The statically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig static_endpoint_configs = 2;</code>
   */
  int getStaticEndpointConfigsCount();
  /**
   * <pre>
   * The statically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig static_endpoint_configs = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfigOrBuilder> 
      getStaticEndpointConfigsOrBuilderList();
  /**
   * <pre>
   * The statically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfig static_endpoint_configs = 2;</code>
   */
  io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.StaticEndpointConfigOrBuilder getStaticEndpointConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * The dynamically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig dynamic_endpoint_configs = 3;</code>
   */
  java.util.List<io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig> 
      getDynamicEndpointConfigsList();
  /**
   * <pre>
   * The dynamically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig dynamic_endpoint_configs = 3;</code>
   */
  io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig getDynamicEndpointConfigs(int index);
  /**
   * <pre>
   * The dynamically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig dynamic_endpoint_configs = 3;</code>
   */
  int getDynamicEndpointConfigsCount();
  /**
   * <pre>
   * The dynamically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig dynamic_endpoint_configs = 3;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfigOrBuilder> 
      getDynamicEndpointConfigsOrBuilderList();
  /**
   * <pre>
   * The dynamically loaded endpoint configs.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfig dynamic_endpoint_configs = 3;</code>
   */
  io.envoyproxy.envoy.admin.v3.EndpointsConfigDump.DynamicEndpointConfigOrBuilder getDynamicEndpointConfigsOrBuilder(
      int index);
}
