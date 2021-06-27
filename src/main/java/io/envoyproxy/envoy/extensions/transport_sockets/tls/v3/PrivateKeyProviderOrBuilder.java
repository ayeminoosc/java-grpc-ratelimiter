// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/common.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public interface PrivateKeyProviderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.transport_sockets.tls.v3.PrivateKeyProvider)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Private key method provider name. The name must match a
   * supported private key method provider type.
   * </pre>
   *
   * <code>string provider_name = 1 [(.validate.rules) = { ... }</code>
   * @return The providerName.
   */
  java.lang.String getProviderName();
  /**
   * <pre>
   * Private key method provider name. The name must match a
   * supported private key method provider type.
   * </pre>
   *
   * <code>string provider_name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for providerName.
   */
  com.google.protobuf.ByteString
      getProviderNameBytes();

  /**
   * <code>.google.protobuf.Any typed_config = 3 [(.udpa.annotations.sensitive) = true];</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3 [(.udpa.annotations.sensitive) = true];</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <code>.google.protobuf.Any typed_config = 3 [(.udpa.annotations.sensitive) = true];</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();

  public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.PrivateKeyProvider.ConfigTypeCase getConfigTypeCase();
}
