// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/cors/v3/cors.proto

package io.envoyproxy.envoy.extensions.filters.http.cors.v3;

public final class CorsProto {
  private CorsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_cors_v3_Cors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_cors_v3_Cors_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0envoy/extensions/filters/http/cors/v3/" +
      "cors.proto\022%envoy.extensions.filters.htt" +
      "p.cors.v3\032\035udpa/annotations/status.proto" +
      "\032!udpa/annotations/versioning.proto\"4\n\004C" +
      "ors:,\232\305\210\036\'\n%envoy.config.filter.http.cor" +
      "s.v2.CorsBJ\n3io.envoyproxy.envoy.extensi" +
      "ons.filters.http.cors.v3B\tCorsProtoP\001\272\200\310" +
      "\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_cors_v3_Cors_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_cors_v3_Cors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_cors_v3_Cors_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
