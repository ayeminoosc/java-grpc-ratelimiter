// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

public interface JwtHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HTTP header name.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The HTTP header name.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The value prefix. The value format is "value_prefix&lt;token&gt;"
   * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
   * end.
   * </pre>
   *
   * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
   * @return The valuePrefix.
   */
  java.lang.String getValuePrefix();
  /**
   * <pre>
   * The value prefix. The value format is "value_prefix&lt;token&gt;"
   * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
   * end.
   * </pre>
   *
   * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for valuePrefix.
   */
  com.google.protobuf.ByteString
      getValuePrefixBytes();
}