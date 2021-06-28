// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v3/skywalking.proto

package io.envoyproxy.envoy.config.trace.v3;

public final class SkywalkingProto {
  private SkywalkingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_trace_v3_SkyWalkingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_trace_v3_SkyWalkingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_trace_v3_ClientConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_trace_v3_ClientConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&envoy/config/trace/v3/skywalking.proto" +
      "\022\025envoy.config.trace.v3\032\'envoy/config/co" +
      "re/v3/grpc_service.proto\032\036google/protobu" +
      "f/wrappers.proto\032\036udpa/annotations/migra" +
      "te.proto\032 udpa/annotations/sensitive.pro" +
      "to\032\035udpa/annotations/status.proto\032!udpa/" +
      "annotations/versioning.proto\032\027validate/v" +
      "alidate.proto\"\221\001\n\020SkyWalkingConfig\022A\n\014gr" +
      "pc_service\030\001 \001(\0132!.envoy.config.core.v3." +
      "GrpcServiceB\010\372B\005\212\001\002\020\001\022:\n\rclient_config\030\002" +
      " \001(\0132#.envoy.config.trace.v3.ClientConfi" +
      "g\"\255\001\n\014ClientConfig\022\024\n\014service_name\030\001 \001(\t" +
      "\022\025\n\rinstance_name\030\002 \001(\t\022\037\n\rbackend_token" +
      "\030\003 \001(\tB\006\270\267\213\244\002\001H\000\0224\n\016max_cache_size\030\004 \001(\013" +
      "2\034.google.protobuf.UInt32ValueB\031\n\027backen" +
      "d_token_specifierBs\n#io.envoyproxy.envoy" +
      ".config.trace.v3B\017SkywalkingProtoP\001\362\230\376\217\005" +
      "-\022+envoy.extensions.tracers.skywalking.v" +
      "4alpha\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.GrpcServiceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Sensitive.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_trace_v3_SkyWalkingConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_trace_v3_SkyWalkingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_trace_v3_SkyWalkingConfig_descriptor,
        new java.lang.String[] { "GrpcService", "ClientConfig", });
    internal_static_envoy_config_trace_v3_ClientConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_trace_v3_ClientConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_trace_v3_ClientConfig_descriptor,
        new java.lang.String[] { "ServiceName", "InstanceName", "BackendToken", "MaxCacheSize", "BackendTokenSpecifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Migrate.fileMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Sensitive.sensitive);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.GrpcServiceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Sensitive.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}