// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/access_loggers/grpc/v3/als.proto

package io.envoyproxy.envoy.extensions.access_loggers.grpc.v3;

public final class AlsProto {
  private AlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_access_loggers_grpc_v3_HttpGrpcAccessLogConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_access_loggers_grpc_v3_HttpGrpcAccessLogConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_access_loggers_grpc_v3_CommonGrpcAccessLogConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_access_loggers_grpc_v3_CommonGrpcAccessLogConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1envoy/extensions/access_loggers/grpc/v" +
      "3/als.proto\022\'envoy.extensions.access_log" +
      "gers.grpc.v3\032(envoy/config/core/v3/confi" +
      "g_source.proto\032\'envoy/config/core/v3/grp" +
      "c_service.proto\032\036google/protobuf/duratio" +
      "n.proto\032\036google/protobuf/wrappers.proto\032" +
      "\035udpa/annotations/status.proto\032!udpa/ann" +
      "otations/versioning.proto\032\027validate/vali" +
      "date.proto\"\274\002\n\027HttpGrpcAccessLogConfig\022c" +
      "\n\rcommon_config\030\001 \001(\0132B.envoy.extensions" +
      ".access_loggers.grpc.v3.CommonGrpcAccess" +
      "LogConfigB\010\372B\005\212\001\002\020\001\022)\n!additional_reques" +
      "t_headers_to_log\030\002 \003(\t\022*\n\"additional_res" +
      "ponse_headers_to_log\030\003 \003(\t\022+\n#additional" +
      "_response_trailers_to_log\030\004 \003(\t:8\232\305\210\0363\n1" +
      "envoy.config.accesslog.v2.HttpGrpcAccess" +
      "LogConfig\"\266\001\n\026TcpGrpcAccessLogConfig\022c\n\r" +
      "common_config\030\001 \001(\0132B.envoy.extensions.a" +
      "ccess_loggers.grpc.v3.CommonGrpcAccessLo" +
      "gConfigB\010\372B\005\212\001\002\020\001:7\232\305\210\0362\n0envoy.config.a" +
      "ccesslog.v2.TcpGrpcAccessLogConfig\"\242\003\n\031C" +
      "ommonGrpcAccessLogConfig\022\031\n\010log_name\030\001 \001" +
      "(\tB\007\372B\004r\002\020\001\022A\n\014grpc_service\030\002 \001(\0132!.envo" +
      "y.config.core.v3.GrpcServiceB\010\372B\005\212\001\002\020\001\022I" +
      "\n\025transport_api_version\030\006 \001(\0162 .envoy.co" +
      "nfig.core.v3.ApiVersionB\010\372B\005\202\001\002\020\001\022B\n\025buf" +
      "fer_flush_interval\030\003 \001(\0132\031.google.protob" +
      "uf.DurationB\010\372B\005\252\001\002*\000\0227\n\021buffer_size_byt" +
      "es\030\004 \001(\0132\034.google.protobuf.UInt32Value\022#" +
      "\n\033filter_state_objects_to_log\030\005 \003(\t::\232\305\210" +
      "\0365\n3envoy.config.accesslog.v2.CommonGrpc" +
      "AccessLogConfigBK\n5io.envoyproxy.envoy.e" +
      "xtensions.access_loggers.grpc.v3B\010AlsPro" +
      "toP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.GrpcServiceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_access_loggers_grpc_v3_HttpGrpcAccessLogConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_access_loggers_grpc_v3_HttpGrpcAccessLogConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_access_loggers_grpc_v3_HttpGrpcAccessLogConfig_descriptor,
        new java.lang.String[] { "CommonConfig", "AdditionalRequestHeadersToLog", "AdditionalResponseHeadersToLog", "AdditionalResponseTrailersToLog", });
    internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_access_loggers_grpc_v3_TcpGrpcAccessLogConfig_descriptor,
        new java.lang.String[] { "CommonConfig", });
    internal_static_envoy_extensions_access_loggers_grpc_v3_CommonGrpcAccessLogConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_extensions_access_loggers_grpc_v3_CommonGrpcAccessLogConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_access_loggers_grpc_v3_CommonGrpcAccessLogConfig_descriptor,
        new java.lang.String[] { "LogName", "GrpcService", "TransportApiVersion", "BufferFlushInterval", "BufferSizeBytes", "FilterStateObjectsToLog", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.GrpcServiceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
