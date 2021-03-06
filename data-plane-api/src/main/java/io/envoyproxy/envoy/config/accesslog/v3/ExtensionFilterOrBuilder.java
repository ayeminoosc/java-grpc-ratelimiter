// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

public interface ExtensionFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.accesslog.v3.ExtensionFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the filter implementation to instantiate. The name must
   * match a statically registered filter.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the filter implementation to instantiate. The name must
   * match a statically registered filter.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();

  public io.envoyproxy.envoy.config.accesslog.v3.ExtensionFilter.ConfigTypeCase getConfigTypeCase();
}
