// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/upstreams/http/http/v3/http_connection_pool.proto

package io.envoyproxy.envoy.extensions.upstreams.http.http.v3;

public final class HttpConnectionPoolProtoOuterClass {
  private HttpConnectionPoolProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_upstreams_http_http_v3_HttpConnectionPoolProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_upstreams_http_http_v3_HttpConnectionPoolProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBenvoy/extensions/upstreams/http/http/v" +
      "3/http_connection_pool.proto\022\'envoy.exte" +
      "nsions.upstreams.http.http.v3\032\035udpa/anno" +
      "tations/status.proto\"\031\n\027HttpConnectionPo" +
      "olProtoBd\n5io.envoyproxy.envoy.extension" +
      "s.upstreams.http.http.v3B!HttpConnection" +
      "PoolProtoOuterClassP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
        });
    internal_static_envoy_extensions_upstreams_http_http_v3_HttpConnectionPoolProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_upstreams_http_http_v3_HttpConnectionPoolProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_upstreams_http_http_v3_HttpConnectionPoolProto_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
