// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

public interface FilterStateRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.jwt_authn.v3.FilterStateRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The filter state name to retrieve the `Router::StringAccessor` object.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The filter state name to retrieve the `Router::StringAccessor` object.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the *name* field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  int getRequiresCount();
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the *name* field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  boolean containsRequires(
      java.lang.String key);
  /**
   * Use {@link #getRequiresMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
  getRequires();
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the *name* field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */
  java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement>
  getRequiresMap();
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the *name* field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */

  io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement getRequiresOrDefault(
      java.lang.String key,
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement defaultValue);
  /**
   * <pre>
   * A map of string keys to requirements. The string key is the string value
   * in the FilterState with the name specified in the *name* field above.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement&gt; requires = 3;</code>
   */

  io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtRequirement getRequiresOrThrow(
      java.lang.String key);
}