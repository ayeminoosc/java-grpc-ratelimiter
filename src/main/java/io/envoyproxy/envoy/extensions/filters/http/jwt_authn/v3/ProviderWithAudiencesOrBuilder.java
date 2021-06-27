// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

public interface ProviderWithAudiencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.jwt_authn.v3.ProviderWithAudiences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specify a required provider name.
   * </pre>
   *
   * <code>string provider_name = 1;</code>
   * @return The providerName.
   */
  java.lang.String getProviderName();
  /**
   * <pre>
   * Specify a required provider name.
   * </pre>
   *
   * <code>string provider_name = 1;</code>
   * @return The bytes for providerName.
   */
  com.google.protobuf.ByteString
      getProviderNameBytes();

  /**
   * <pre>
   * This field overrides the one specified in the JwtProvider.
   * </pre>
   *
   * <code>repeated string audiences = 2;</code>
   * @return A list containing the audiences.
   */
  java.util.List<java.lang.String>
      getAudiencesList();
  /**
   * <pre>
   * This field overrides the one specified in the JwtProvider.
   * </pre>
   *
   * <code>repeated string audiences = 2;</code>
   * @return The count of audiences.
   */
  int getAudiencesCount();
  /**
   * <pre>
   * This field overrides the one specified in the JwtProvider.
   * </pre>
   *
   * <code>repeated string audiences = 2;</code>
   * @param index The index of the element to return.
   * @return The audiences at the given index.
   */
  java.lang.String getAudiences(int index);
  /**
   * <pre>
   * This field overrides the one specified in the JwtProvider.
   * </pre>
   *
   * <code>repeated string audiences = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the audiences at the given index.
   */
  com.google.protobuf.ByteString
      getAudiencesBytes(int index);
}
