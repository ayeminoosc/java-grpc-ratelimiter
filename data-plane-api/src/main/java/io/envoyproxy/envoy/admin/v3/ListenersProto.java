// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/listeners.proto

package io.envoyproxy.envoy.admin.v3;

public final class ListenersProto {
  private ListenersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_Listeners_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_Listeners_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_admin_v3_ListenerStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_admin_v3_ListenerStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036envoy/admin/v3/listeners.proto\022\016envoy." +
      "admin.v3\032\"envoy/config/core/v3/address.p" +
      "roto\032\035udpa/annotations/status.proto\032!udp" +
      "a/annotations/versioning.proto\"l\n\tListen" +
      "ers\0229\n\021listener_statuses\030\001 \003(\0132\036.envoy.a" +
      "dmin.v3.ListenerStatus:$\232\305\210\036\037\n\035envoy.adm" +
      "in.v2alpha.Listeners\"\177\n\016ListenerStatus\022\014" +
      "\n\004name\030\001 \001(\t\0224\n\rlocal_address\030\002 \001(\0132\035.en" +
      "voy.config.core.v3.Address:)\232\305\210\036$\n\"envoy" +
      ".admin.v2alpha.ListenerStatusB8\n\034io.envo" +
      "yproxy.envoy.admin.v3B\016ListenersProtoP\001\272" +
      "\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_admin_v3_Listeners_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_admin_v3_Listeners_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_Listeners_descriptor,
        new java.lang.String[] { "ListenerStatuses", });
    internal_static_envoy_admin_v3_ListenerStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_admin_v3_ListenerStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_admin_v3_ListenerStatus_descriptor,
        new java.lang.String[] { "Name", "LocalAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
