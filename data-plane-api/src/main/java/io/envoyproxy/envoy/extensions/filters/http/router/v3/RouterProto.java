// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/router/v3/router.proto

package io.envoyproxy.envoy.extensions.filters.http.router.v3;

public final class RouterProto {
  private RouterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_router_v3_Router_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_router_v3_Router_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4envoy/extensions/filters/http/router/v" +
      "3/router.proto\022\'envoy.extensions.filters" +
      ".http.router.v3\032)envoy/config/accesslog/" +
      "v3/accesslog.proto\032\036google/protobuf/wrap" +
      "pers.proto\032\035udpa/annotations/status.prot" +
      "o\032!udpa/annotations/versioning.proto\032\027va" +
      "lidate/validate.proto\"\276\003\n\006Router\0221\n\rdyna" +
      "mic_stats\030\001 \001(\0132\032.google.protobuf.BoolVa" +
      "lue\022\030\n\020start_child_span\030\002 \001(\010\022:\n\014upstrea" +
      "m_log\030\003 \003(\0132$.envoy.config.accesslog.v3." +
      "AccessLog\022\036\n\026suppress_envoy_headers\030\004 \001(" +
      "\010\022\263\001\n\024strict_check_headers\030\005 \003(\tB\224\001\372B\220\001\222" +
      "\001\214\001\"\211\001r\206\001R\036x-envoy-upstream-rq-timeout-m" +
      "sR&x-envoy-upstream-rq-per-try-timeout-m" +
      "sR\023x-envoy-max-retriesR\025x-envoy-retry-gr" +
      "pc-onR\020x-envoy-retry-on\022#\n\033respect_expec" +
      "ted_rq_timeout\030\006 \001(\010:0\232\305\210\036+\n)envoy.confi" +
      "g.filter.http.router.v2.RouterBN\n5io.env" +
      "oyproxy.envoy.extensions.filters.http.ro" +
      "uter.v3B\013RouterProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_router_v3_Router_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_router_v3_Router_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_router_v3_Router_descriptor,
        new java.lang.String[] { "DynamicStats", "StartChildSpan", "UpstreamLog", "SuppressEnvoyHeaders", "StrictCheckHeaders", "RespectExpectedRqTimeout", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
