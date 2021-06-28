// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/extension.proto

package io.envoyproxy.envoy.config.core.v3;

public interface TypedExtensionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.TypedExtensionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of an extension. This is not used to select the extension, instead
   * it serves the role of an opaque identifier.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of an extension. This is not used to select the extension, instead
   * it serves the role of an opaque identifier.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The typed config for the extension. The type URL will be used to identify
   * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
   * the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview
   * &lt;config_overview_extension_configuration&gt;` for further details.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the typedConfig field is set.
   */
  boolean hasTypedConfig();
  /**
   * <pre>
   * The typed config for the extension. The type URL will be used to identify
   * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
   * the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview
   * &lt;config_overview_extension_configuration&gt;` for further details.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
   * @return The typedConfig.
   */
  com.google.protobuf.Any getTypedConfig();
  /**
   * <pre>
   * The typed config for the extension. The type URL will be used to identify
   * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
   * the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview
   * &lt;config_overview_extension_configuration&gt;` for further details.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder();
}