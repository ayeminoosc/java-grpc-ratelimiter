// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/proxy_protocol.proto

package io.envoyproxy.envoy.config.core.v3;

public final class ProxyProtocolProto {
  private ProxyProtocolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_ProxyProtocolConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_ProxyProtocolConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)envoy/config/core/v3/proxy_protocol.pr" +
      "oto\022\024envoy.config.core.v3\032\035udpa/annotati" +
      "ons/status.proto\032\027validate/validate.prot" +
      "o\"t\n\023ProxyProtocolConfig\022B\n\007version\030\001 \001(" +
      "\01621.envoy.config.core.v3.ProxyProtocolCo" +
      "nfig.Version\"\031\n\007Version\022\006\n\002V1\020\000\022\006\n\002V2\020\001B" +
      "B\n\"io.envoyproxy.envoy.config.core.v3B\022P" +
      "roxyProtocolProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_core_v3_ProxyProtocolConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_core_v3_ProxyProtocolConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_ProxyProtocolConfig_descriptor,
        new java.lang.String[] { "Version", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
