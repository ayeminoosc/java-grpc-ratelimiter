// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/wasm/v3/wasm.proto

package io.envoyproxy.envoy.extensions.wasm.v3;

public interface PluginConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.wasm.v3.PluginConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique name for a filters/services in a VM for use in identifying the filter/service if
   * multiple filters/services are handled by the same *vm_id* and *root_id* and for
   * logging/debugging.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * A unique name for a filters/services in a VM for use in identifying the filter/service if
   * multiple filters/services are handled by the same *vm_id* and *root_id* and for
   * logging/debugging.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A unique ID for a set of filters/services in a VM which will share a RootContext and Contexts
   * if applicable (e.g. an Wasm HttpFilter and an Wasm AccessLog). If left blank, all
   * filters/services with a blank root_id with the same *vm_id* will share Context(s).
   * </pre>
   *
   * <code>string root_id = 2;</code>
   * @return The rootId.
   */
  java.lang.String getRootId();
  /**
   * <pre>
   * A unique ID for a set of filters/services in a VM which will share a RootContext and Contexts
   * if applicable (e.g. an Wasm HttpFilter and an Wasm AccessLog). If left blank, all
   * filters/services with a blank root_id with the same *vm_id* will share Context(s).
   * </pre>
   *
   * <code>string root_id = 2;</code>
   * @return The bytes for rootId.
   */
  com.google.protobuf.ByteString
      getRootIdBytes();

  /**
   * <pre>
   * TODO: add referential VM configurations.
   * </pre>
   *
   * <code>.envoy.extensions.wasm.v3.VmConfig vm_config = 3;</code>
   * @return Whether the vmConfig field is set.
   */
  boolean hasVmConfig();
  /**
   * <pre>
   * TODO: add referential VM configurations.
   * </pre>
   *
   * <code>.envoy.extensions.wasm.v3.VmConfig vm_config = 3;</code>
   * @return The vmConfig.
   */
  io.envoyproxy.envoy.extensions.wasm.v3.VmConfig getVmConfig();
  /**
   * <pre>
   * TODO: add referential VM configurations.
   * </pre>
   *
   * <code>.envoy.extensions.wasm.v3.VmConfig vm_config = 3;</code>
   */
  io.envoyproxy.envoy.extensions.wasm.v3.VmConfigOrBuilder getVmConfigOrBuilder();

  /**
   * <pre>
   * Filter/service configuration used to configure or reconfigure a plugin
   * (proxy_on_configuration).
   * `google.protobuf.Struct` is serialized as JSON before
   * passing it to the plugin. `google.protobuf.BytesValue` and
   * `google.protobuf.StringValue` are passed directly without the wrapper.
   * </pre>
   *
   * <code>.google.protobuf.Any configuration = 4;</code>
   * @return Whether the configuration field is set.
   */
  boolean hasConfiguration();
  /**
   * <pre>
   * Filter/service configuration used to configure or reconfigure a plugin
   * (proxy_on_configuration).
   * `google.protobuf.Struct` is serialized as JSON before
   * passing it to the plugin. `google.protobuf.BytesValue` and
   * `google.protobuf.StringValue` are passed directly without the wrapper.
   * </pre>
   *
   * <code>.google.protobuf.Any configuration = 4;</code>
   * @return The configuration.
   */
  com.google.protobuf.Any getConfiguration();
  /**
   * <pre>
   * Filter/service configuration used to configure or reconfigure a plugin
   * (proxy_on_configuration).
   * `google.protobuf.Struct` is serialized as JSON before
   * passing it to the plugin. `google.protobuf.BytesValue` and
   * `google.protobuf.StringValue` are passed directly without the wrapper.
   * </pre>
   *
   * <code>.google.protobuf.Any configuration = 4;</code>
   */
  com.google.protobuf.AnyOrBuilder getConfigurationOrBuilder();

  /**
   * <pre>
   * If there is a fatal error on the VM (e.g. exception, abort(), on_start or on_configure return false),
   * then all plugins associated with the VM will either fail closed (by default), e.g. by returning an HTTP 503 error,
   * or fail open (if 'fail_open' is set to true) by bypassing the filter. Note: when on_start or on_configure return false
   * during xDS updates the xDS configuration will be rejected and when on_start or on_configuration return false on initial
   * startup the proxy will not start.
   * </pre>
   *
   * <code>bool fail_open = 5;</code>
   * @return The failOpen.
   */
  boolean getFailOpen();

  public io.envoyproxy.envoy.extensions.wasm.v3.PluginConfig.VmCase getVmCase();
}
