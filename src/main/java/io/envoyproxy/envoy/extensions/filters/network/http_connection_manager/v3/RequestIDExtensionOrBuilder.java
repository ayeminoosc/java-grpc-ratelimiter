// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/http_connection_manager/v3/http_connection_manager.proto

package io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3;

public interface RequestIDExtensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.http_connection_manager.v3.RequestIDExtension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Request ID extension specific configuration.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 1;</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <pre>
   * Request ID extension specific configuration.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 1;</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <pre>
   * Request ID extension specific configuration.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();
}
