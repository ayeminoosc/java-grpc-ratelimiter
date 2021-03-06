// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

public interface RuntimeFeatureFlagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.RuntimeFeatureFlag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default value if runtime value is not available.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue default_value = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   * <pre>
   * Default value if runtime value is not available.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue default_value = 1 [(.validate.rules) = { ... }</code>
   * @return The defaultValue.
   */
  com.google.protobuf.BoolValue getDefaultValue();
  /**
   * <pre>
   * Default value if runtime value is not available.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue default_value = 1 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.BoolValueOrBuilder getDefaultValueOrBuilder();

  /**
   * <pre>
   * Runtime key to get value for comparison. This value is used if defined. The boolean value must
   * be represented via its
   * `canonical JSON encoding &lt;https://developers.google.com/protocol-buffers/docs/proto3#json&gt;`_.
   * </pre>
   *
   * <code>string runtime_key = 2 [(.validate.rules) = { ... }</code>
   * @return The runtimeKey.
   */
  java.lang.String getRuntimeKey();
  /**
   * <pre>
   * Runtime key to get value for comparison. This value is used if defined. The boolean value must
   * be represented via its
   * `canonical JSON encoding &lt;https://developers.google.com/protocol-buffers/docs/proto3#json&gt;`_.
   * </pre>
   *
   * <code>string runtime_key = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for runtimeKey.
   */
  com.google.protobuf.ByteString
      getRuntimeKeyBytes();
}
