// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v3/http_tracer.proto

package io.envoyproxy.envoy.config.trace.v3;

public final class HttpTracerProto {
  private HttpTracerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_trace_v3_Tracing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_trace_v3_Tracing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_trace_v3_Tracing_Http_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_trace_v3_Tracing_Http_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'envoy/config/trace/v3/http_tracer.prot" +
      "o\022\025envoy.config.trace.v3\032\031google/protobu" +
      "f/any.proto\032\034google/protobuf/struct.prot" +
      "o\032\035udpa/annotations/status.proto\032!udpa/a" +
      "nnotations/versioning.proto\032\027validate/va" +
      "lidate.proto\"\370\001\n\007Tracing\0221\n\004http\030\001 \001(\0132#" +
      ".envoy.config.trace.v3.Tracing.Http\032\223\001\n\004" +
      "Http\022\025\n\004name\030\001 \001(\tB\007\372B\004r\002\020\001\022,\n\014typed_con" +
      "fig\030\003 \001(\0132\024.google.protobuf.AnyH\000:)\232\305\210\036$" +
      "\n\"envoy.config.trace.v2.Tracing.HttpB\r\n\013" +
      "config_typeJ\004\010\002\020\003R\006config:$\232\305\210\036\037\n\035envoy." +
      "config.trace.v2.TracingB@\n#io.envoyproxy" +
      ".envoy.config.trace.v3B\017HttpTracerProtoP" +
      "\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_trace_v3_Tracing_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_trace_v3_Tracing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_trace_v3_Tracing_descriptor,
        new java.lang.String[] { "Http", });
    internal_static_envoy_config_trace_v3_Tracing_Http_descriptor =
      internal_static_envoy_config_trace_v3_Tracing_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_trace_v3_Tracing_Http_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_trace_v3_Tracing_Http_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", "ConfigType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
