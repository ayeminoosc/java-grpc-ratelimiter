// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/listener/original_src/v3/original_src.proto

package io.envoyproxy.envoy.extensions.filters.listener.original_src.v3;

public final class OriginalSrcProto {
  private OriginalSrcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_listener_original_src_v3_OriginalSrc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_listener_original_src_v3_OriginalSrc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDenvoy/extensions/filters/listener/orig" +
      "inal_src/v3/original_src.proto\0221envoy.ex" +
      "tensions.filters.listener.original_src.v" +
      "3\032\035udpa/annotations/status.proto\032!udpa/a" +
      "nnotations/versioning.proto\032\027validate/va" +
      "lidate.proto\"u\n\013OriginalSrc\022\021\n\tbind_port" +
      "\030\001 \001(\010\022\014\n\004mark\030\002 \001(\r:E\232\305\210\036@\n>envoy.confi" +
      "g.filter.listener.original_src.v2alpha1." +
      "OriginalSrcB]\n?io.envoyproxy.envoy.exten" +
      "sions.filters.listener.original_src.v3B\020" +
      "OriginalSrcProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_listener_original_src_v3_OriginalSrc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_listener_original_src_v3_OriginalSrc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_listener_original_src_v3_OriginalSrc_descriptor,
        new java.lang.String[] { "BindPort", "Mark", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
