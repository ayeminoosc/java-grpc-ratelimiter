// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/tap.proto

package io.envoyproxy.envoy.admin.v3;

public final class TapProto {
  private TapProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_TapRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_TapRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030envoy/admin/v3/tap.proto\022\016envoy.admin." +
      "v3\032 envoy/config/tap/v3/common.proto\032\035ud" +
      "pa/annotations/status.proto\032!udpa/annota" +
      "tions/versioning.proto\032\027validate/validat" +
      "e.proto\"\215\001\n\nTapRequest\022\032\n\tconfig_id\030\001 \001(" +
      "\tB\007\372B\004r\002\020\001\022<\n\ntap_config\030\002 \001(\0132\036.envoy.c" +
      "onfig.tap.v3.TapConfigB\010\372B\005\212\001\002\020\001:%\232\305\210\036 \n" +
      "\036envoy.admin.v2alpha.TapRequestB2\n\034io.en" +
      "voyproxy.envoy.admin.v3B\010TapProtoP\001\272\200\310\321\006" +
      "\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.tap.v3.CommonProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_admin_v3_TapRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_admin_v3_TapRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_TapRequest_descriptor,
        new java.lang.String[] { "ConfigId", "TapConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.tap.v3.CommonProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}