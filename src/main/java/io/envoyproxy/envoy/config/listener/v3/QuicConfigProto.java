// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/quic_config.proto

package io.envoyproxy.envoy.config.listener.v3;

public final class QuicConfigProto {
  private QuicConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_listener_v3_QuicProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_listener_v3_QuicProtocolOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*envoy/config/listener/v3/quic_config.p" +
      "roto\022\030envoy.config.listener.v3\032\037envoy/co" +
      "nfig/core/v3/base.proto\032\036google/protobuf" +
      "/duration.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\035udpa/annotations/status.proto\032!" +
      "udpa/annotations/versioning.proto\"\256\002\n\023Qu" +
      "icProtocolOptions\022<\n\026max_concurrent_stre" +
      "ams\030\001 \001(\0132\034.google.protobuf.UInt32Value\022" +
      "/\n\014idle_timeout\030\002 \001(\0132\031.google.protobuf." +
      "Duration\022;\n\030crypto_handshake_timeout\030\003 \001" +
      "(\0132\031.google.protobuf.Duration\0229\n\007enabled" +
      "\030\004 \001(\0132(.envoy.config.core.v3.RuntimeFea" +
      "tureFlag:0\232\305\210\036+\n)envoy.api.v2.listener.Q" +
      "uicProtocolOptionsBC\n&io.envoyproxy.envo" +
      "y.config.listener.v3B\017QuicConfigProtoP\001\272" +
      "\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_config_listener_v3_QuicProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_listener_v3_QuicProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_listener_v3_QuicProtocolOptions_descriptor,
        new java.lang.String[] { "MaxConcurrentStreams", "IdleTimeout", "CryptoHandshakeTimeout", "Enabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
