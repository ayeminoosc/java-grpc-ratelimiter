// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/alts/v3/alts.proto

package io.envoyproxy.envoy.extensions.transport_sockets.alts.v3;

public final class AltsProto {
  private AltsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_alts_v3_Alts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_alts_v3_Alts_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5envoy/extensions/transport_sockets/alt" +
      "s/v3/alts.proto\022*envoy.extensions.transp" +
      "ort_sockets.alts.v3\032\035udpa/annotations/st" +
      "atus.proto\032!udpa/annotations/versioning." +
      "proto\032\027validate/validate.proto\"\202\001\n\004Alts\022" +
      "#\n\022handshaker_service\030\001 \001(\tB\007\372B\004r\002\020\001\022\035\n\025" +
      "peer_service_accounts\030\002 \003(\t:6\232\305\210\0361\n/envo" +
      "y.config.transport_socket.alts.v2alpha.A" +
      "ltsBO\n8io.envoyproxy.envoy.extensions.tr" +
      "ansport_sockets.alts.v3B\tAltsProtoP\001\272\200\310\321" +
      "\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_transport_sockets_alts_v3_Alts_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_transport_sockets_alts_v3_Alts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_alts_v3_Alts_descriptor,
        new java.lang.String[] { "HandshakerService", "PeerServiceAccounts", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}