// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3;

public final class RateLimitProto {
  private RateLimitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;envoy/extensions/filters/http/ratelimi" +
      "t/v3/rate_limit.proto\022*envoy.extensions." +
      "filters.http.ratelimit.v3\032#envoy/config/" +
      "ratelimit/v3/rls.proto\032\036google/protobuf/" +
      "duration.proto\032\035udpa/annotations/status." +
      "proto\032!udpa/annotations/versioning.proto" +
      "\032\027validate/validate.proto\"\345\004\n\tRateLimit\022" +
      "\027\n\006domain\030\001 \001(\tB\007\372B\004r\002\020\001\022\026\n\005stage\030\002 \001(\rB" +
      "\007\372B\004*\002\030\n\0227\n\014request_type\030\003 \001(\tB!\372B\036r\034R\010i" +
      "nternalR\010externalR\004bothR\000\022*\n\007timeout\030\004 \001" +
      "(\0132\031.google.protobuf.Duration\022\031\n\021failure" +
      "_mode_deny\030\005 \001(\010\022*\n\"rate_limited_as_reso" +
      "urce_exhausted\030\006 \001(\010\022W\n\022rate_limit_servi" +
      "ce\030\007 \001(\01321.envoy.config.ratelimit.v3.Rat" +
      "eLimitServiceConfigB\010\372B\005\212\001\002\020\001\022\177\n\032enable_" +
      "x_ratelimit_headers\030\010 \001(\0162Q.envoy.extens" +
      "ions.filters.http.ratelimit.v3.RateLimit" +
      ".XRateLimitHeadersRFCVersionB\010\372B\005\202\001\002\020\001\022*" +
      "\n\"disable_x_envoy_ratelimited_header\030\t \001" +
      "(\010\"<\n\033XRateLimitHeadersRFCVersion\022\007\n\003OFF" +
      "\020\000\022\024\n\020DRAFT_VERSION_03\020\001:7\232\305\210\0362\n0envoy.c" +
      "onfig.filter.http.rate_limit.v2.RateLimi" +
      "t\"\306\001\n\021RateLimitPerRoute\022s\n\016vh_rate_limit" +
      "s\030\001 \001(\0162Q.envoy.extensions.filters.http." +
      "ratelimit.v3.RateLimitPerRoute.VhRateLim" +
      "itsOptionsB\010\372B\005\202\001\002\020\001\"<\n\023VhRateLimitsOpti" +
      "ons\022\014\n\010OVERRIDE\020\000\022\013\n\007INCLUDE\020\001\022\n\n\006IGNORE" +
      "\020\002BT\n8io.envoyproxy.envoy.extensions.fil" +
      "ters.http.ratelimit.v3B\016RateLimitProtoP\001" +
      "\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimit_descriptor,
        new java.lang.String[] { "Domain", "Stage", "RequestType", "Timeout", "FailureModeDeny", "RateLimitedAsResourceExhausted", "RateLimitService", "EnableXRatelimitHeaders", "DisableXEnvoyRatelimitedHeader", });
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor,
        new java.lang.String[] { "VhRateLimits", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
