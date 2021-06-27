// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/resource_name.proto

package com.github.udpa.xds.core.v3;

public interface ResourceNameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xds.core.v3.ResourceName)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Opaque identifier for the resource. Any '/' will not be escaped during URI
   * encoding and will form part of the URI path.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Opaque identifier for the resource. Any '/' will not be escaped during URI
   * encoding and will form part of the URI path.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Logical authority for resource (not necessarily transport network address).
   * Authorities are opaque in the xDS API, data-plane load balancers will map
   * them to concrete network transports such as an xDS management server.
   * </pre>
   *
   * <code>string authority = 2;</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * Logical authority for resource (not necessarily transport network address).
   * Authorities are opaque in the xDS API, data-plane load balancers will map
   * them to concrete network transports such as an xDS management server.
   * </pre>
   *
   * <code>string authority = 2;</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * Fully qualified resource type (as in type URL without types.googleapis.com/
   * prefix).
   * </pre>
   *
   * <code>string resource_type = 3 [(.validate.rules) = { ... }</code>
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   * <pre>
   * Fully qualified resource type (as in type URL without types.googleapis.com/
   * prefix).
   * </pre>
   *
   * <code>string resource_type = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <pre>
   * Additional parameters that can be used to select resource variants.
   * </pre>
   *
   * <code>.xds.core.v3.ContextParams context = 4;</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * Additional parameters that can be used to select resource variants.
   * </pre>
   *
   * <code>.xds.core.v3.ContextParams context = 4;</code>
   * @return The context.
   */
  com.github.udpa.xds.core.v3.ContextParams getContext();
  /**
   * <pre>
   * Additional parameters that can be used to select resource variants.
   * </pre>
   *
   * <code>.xds.core.v3.ContextParams context = 4;</code>
   */
  com.github.udpa.xds.core.v3.ContextParamsOrBuilder getContextOrBuilder();
}
