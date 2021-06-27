// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/config_dump.proto

package io.envoyproxy.envoy.admin.v3;

public interface ConfigDumpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.admin.v3.ConfigDump)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This list is serialized and dumped in its entirety at the
   * :ref:`/config_dump &lt;operations_admin_interface_config_dump&gt;` endpoint.
   * The following configurations are currently supported and will be dumped in the order given
   * below:
   * * *bootstrap*: :ref:`BootstrapConfigDump &lt;envoy_api_msg_admin.v3.BootstrapConfigDump&gt;`
   * * *clusters*: :ref:`ClustersConfigDump &lt;envoy_api_msg_admin.v3.ClustersConfigDump&gt;`
   * * *endpoints*:  :ref:`EndpointsConfigDump &lt;envoy_api_msg_admin.v3.EndpointsConfigDump&gt;`
   * * *listeners*: :ref:`ListenersConfigDump &lt;envoy_api_msg_admin.v3.ListenersConfigDump&gt;`
   * * *routes*:  :ref:`RoutesConfigDump &lt;envoy_api_msg_admin.v3.RoutesConfigDump&gt;`
   * EDS Configuration will only be dumped by using parameter `?include_eds`
   * You can filter output with the resource and mask query parameters.
   * See :ref:`/config_dump?resource={} &lt;operations_admin_interface_config_dump_by_resource&gt;`,
   * :ref:`/config_dump?mask={} &lt;operations_admin_interface_config_dump_by_mask&gt;`,
   * or :ref:`/config_dump?resource={},mask={}
   * &lt;operations_admin_interface_config_dump_by_resource_and_mask&gt;` for more information.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any configs = 1;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getConfigsList();
  /**
   * <pre>
   * This list is serialized and dumped in its entirety at the
   * :ref:`/config_dump &lt;operations_admin_interface_config_dump&gt;` endpoint.
   * The following configurations are currently supported and will be dumped in the order given
   * below:
   * * *bootstrap*: :ref:`BootstrapConfigDump &lt;envoy_api_msg_admin.v3.BootstrapConfigDump&gt;`
   * * *clusters*: :ref:`ClustersConfigDump &lt;envoy_api_msg_admin.v3.ClustersConfigDump&gt;`
   * * *endpoints*:  :ref:`EndpointsConfigDump &lt;envoy_api_msg_admin.v3.EndpointsConfigDump&gt;`
   * * *listeners*: :ref:`ListenersConfigDump &lt;envoy_api_msg_admin.v3.ListenersConfigDump&gt;`
   * * *routes*:  :ref:`RoutesConfigDump &lt;envoy_api_msg_admin.v3.RoutesConfigDump&gt;`
   * EDS Configuration will only be dumped by using parameter `?include_eds`
   * You can filter output with the resource and mask query parameters.
   * See :ref:`/config_dump?resource={} &lt;operations_admin_interface_config_dump_by_resource&gt;`,
   * :ref:`/config_dump?mask={} &lt;operations_admin_interface_config_dump_by_mask&gt;`,
   * or :ref:`/config_dump?resource={},mask={}
   * &lt;operations_admin_interface_config_dump_by_resource_and_mask&gt;` for more information.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any configs = 1;</code>
   */
  com.google.protobuf.Any getConfigs(int index);
  /**
   * <pre>
   * This list is serialized and dumped in its entirety at the
   * :ref:`/config_dump &lt;operations_admin_interface_config_dump&gt;` endpoint.
   * The following configurations are currently supported and will be dumped in the order given
   * below:
   * * *bootstrap*: :ref:`BootstrapConfigDump &lt;envoy_api_msg_admin.v3.BootstrapConfigDump&gt;`
   * * *clusters*: :ref:`ClustersConfigDump &lt;envoy_api_msg_admin.v3.ClustersConfigDump&gt;`
   * * *endpoints*:  :ref:`EndpointsConfigDump &lt;envoy_api_msg_admin.v3.EndpointsConfigDump&gt;`
   * * *listeners*: :ref:`ListenersConfigDump &lt;envoy_api_msg_admin.v3.ListenersConfigDump&gt;`
   * * *routes*:  :ref:`RoutesConfigDump &lt;envoy_api_msg_admin.v3.RoutesConfigDump&gt;`
   * EDS Configuration will only be dumped by using parameter `?include_eds`
   * You can filter output with the resource and mask query parameters.
   * See :ref:`/config_dump?resource={} &lt;operations_admin_interface_config_dump_by_resource&gt;`,
   * :ref:`/config_dump?mask={} &lt;operations_admin_interface_config_dump_by_mask&gt;`,
   * or :ref:`/config_dump?resource={},mask={}
   * &lt;operations_admin_interface_config_dump_by_resource_and_mask&gt;` for more information.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any configs = 1;</code>
   */
  int getConfigsCount();
  /**
   * <pre>
   * This list is serialized and dumped in its entirety at the
   * :ref:`/config_dump &lt;operations_admin_interface_config_dump&gt;` endpoint.
   * The following configurations are currently supported and will be dumped in the order given
   * below:
   * * *bootstrap*: :ref:`BootstrapConfigDump &lt;envoy_api_msg_admin.v3.BootstrapConfigDump&gt;`
   * * *clusters*: :ref:`ClustersConfigDump &lt;envoy_api_msg_admin.v3.ClustersConfigDump&gt;`
   * * *endpoints*:  :ref:`EndpointsConfigDump &lt;envoy_api_msg_admin.v3.EndpointsConfigDump&gt;`
   * * *listeners*: :ref:`ListenersConfigDump &lt;envoy_api_msg_admin.v3.ListenersConfigDump&gt;`
   * * *routes*:  :ref:`RoutesConfigDump &lt;envoy_api_msg_admin.v3.RoutesConfigDump&gt;`
   * EDS Configuration will only be dumped by using parameter `?include_eds`
   * You can filter output with the resource and mask query parameters.
   * See :ref:`/config_dump?resource={} &lt;operations_admin_interface_config_dump_by_resource&gt;`,
   * :ref:`/config_dump?mask={} &lt;operations_admin_interface_config_dump_by_mask&gt;`,
   * or :ref:`/config_dump?resource={},mask={}
   * &lt;operations_admin_interface_config_dump_by_resource_and_mask&gt;` for more information.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any configs = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getConfigsOrBuilderList();
  /**
   * <pre>
   * This list is serialized and dumped in its entirety at the
   * :ref:`/config_dump &lt;operations_admin_interface_config_dump&gt;` endpoint.
   * The following configurations are currently supported and will be dumped in the order given
   * below:
   * * *bootstrap*: :ref:`BootstrapConfigDump &lt;envoy_api_msg_admin.v3.BootstrapConfigDump&gt;`
   * * *clusters*: :ref:`ClustersConfigDump &lt;envoy_api_msg_admin.v3.ClustersConfigDump&gt;`
   * * *endpoints*:  :ref:`EndpointsConfigDump &lt;envoy_api_msg_admin.v3.EndpointsConfigDump&gt;`
   * * *listeners*: :ref:`ListenersConfigDump &lt;envoy_api_msg_admin.v3.ListenersConfigDump&gt;`
   * * *routes*:  :ref:`RoutesConfigDump &lt;envoy_api_msg_admin.v3.RoutesConfigDump&gt;`
   * EDS Configuration will only be dumped by using parameter `?include_eds`
   * You can filter output with the resource and mask query parameters.
   * See :ref:`/config_dump?resource={} &lt;operations_admin_interface_config_dump_by_resource&gt;`,
   * :ref:`/config_dump?mask={} &lt;operations_admin_interface_config_dump_by_mask&gt;`,
   * or :ref:`/config_dump?resource={},mask={}
   * &lt;operations_admin_interface_config_dump_by_resource_and_mask&gt;` for more information.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any configs = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getConfigsOrBuilder(
      int index);
}
