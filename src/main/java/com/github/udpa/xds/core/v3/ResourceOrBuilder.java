// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/resource.proto

package com.github.udpa.xds.core.v3;

public interface ResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xds.core.v3.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name. This may be omitted for filesystem resources.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceName name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Resource name. This may be omitted for filesystem resources.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceName name = 1;</code>
   * @return The name.
   */
  com.github.udpa.xds.core.v3.ResourceName getName();
  /**
   * <pre>
   * Resource name. This may be omitted for filesystem resources.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceName name = 1;</code>
   */
  com.github.udpa.xds.core.v3.ResourceNameOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The resource's logical version. It is illegal to have the same named xDS
   * resource name at a given version with different resource payloads.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The resource's logical version. It is illegal to have the same named xDS
   * resource name at a given version with different resource payloads.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The resource payload, including type URL.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * The resource payload, including type URL.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   * @return The resource.
   */
  com.google.protobuf.Any getResource();
  /**
   * <pre>
   * The resource payload, including type URL.
   * </pre>
   *
   * <code>.google.protobuf.Any resource = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getResourceOrBuilder();
}
