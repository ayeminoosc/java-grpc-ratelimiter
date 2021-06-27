// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ratelimit/v3/rls.proto

package io.envoyproxy.envoy.service.ratelimit.v3;

public final class RlsProto {
  private RlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_ratelimit_v3_RateLimitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_ratelimit_v3_RateLimitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_ratelimit_v3_RateLimitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_RateLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_ratelimit_v3_RateLimitResponse_RateLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_DescriptorStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_ratelimit_v3_RateLimitResponse_DescriptorStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/service/ratelimit/v3/rls.proto\022\032" +
      "envoy.service.ratelimit.v3\032\037envoy/config" +
      "/core/v3/base.proto\0324envoy/extensions/co" +
      "mmon/ratelimit/v3/ratelimit.proto\032\036googl" +
      "e/protobuf/duration.proto\032\034google/protob" +
      "uf/struct.proto\032\035udpa/annotations/status" +
      ".proto\032!udpa/annotations/versioning.prot" +
      "o\032\027validate/validate.proto\"\273\001\n\020RateLimit" +
      "Request\022\016\n\006domain\030\001 \001(\t\022N\n\013descriptors\030\002" +
      " \003(\01329.envoy.extensions.common.ratelimit" +
      ".v3.RateLimitDescriptor\022\023\n\013hits_addend\030\003" +
      " \001(\r:2\232\305\210\036-\n+envoy.service.ratelimit.v2." +
      "RateLimitRequest\"\236\010\n\021RateLimitResponse\022H" +
      "\n\014overall_code\030\001 \001(\01622.envoy.service.rat" +
      "elimit.v3.RateLimitResponse.Code\022P\n\010stat" +
      "uses\030\002 \003(\0132>.envoy.service.ratelimit.v3." +
      "RateLimitResponse.DescriptorStatus\022B\n\027re" +
      "sponse_headers_to_add\030\003 \003(\0132!.envoy.conf" +
      "ig.core.v3.HeaderValue\022A\n\026request_header" +
      "s_to_add\030\004 \003(\0132!.envoy.config.core.v3.He" +
      "aderValue\022\020\n\010raw_body\030\005 \001(\014\0221\n\020dynamic_m" +
      "etadata\030\006 \001(\0132\027.google.protobuf.Struct\032\377" +
      "\001\n\tRateLimit\022\014\n\004name\030\003 \001(\t\022\031\n\021requests_p" +
      "er_unit\030\001 \001(\r\022J\n\004unit\030\002 \001(\0162<.envoy.serv" +
      "ice.ratelimit.v3.RateLimitResponse.RateL" +
      "imit.Unit\">\n\004Unit\022\013\n\007UNKNOWN\020\000\022\n\n\006SECOND" +
      "\020\001\022\n\n\006MINUTE\020\002\022\010\n\004HOUR\020\003\022\007\n\003DAY\020\004:=\232\305\210\0368" +
      "\n6envoy.service.ratelimit.v2.RateLimitRe" +
      "sponse.RateLimit\032\274\002\n\020DescriptorStatus\022@\n" +
      "\004code\030\001 \001(\01622.envoy.service.ratelimit.v3" +
      ".RateLimitResponse.Code\022N\n\rcurrent_limit" +
      "\030\002 \001(\01327.envoy.service.ratelimit.v3.Rate" +
      "LimitResponse.RateLimit\022\027\n\017limit_remaini" +
      "ng\030\003 \001(\r\0227\n\024duration_until_reset\030\004 \001(\0132\031" +
      ".google.protobuf.Duration:D\232\305\210\036?\n=envoy." +
      "service.ratelimit.v2.RateLimitResponse.D" +
      "escriptorStatus\"+\n\004Code\022\013\n\007UNKNOWN\020\000\022\006\n\002" +
      "OK\020\001\022\016\n\nOVER_LIMIT\020\002:3\232\305\210\036.\n,envoy.servi" +
      "ce.ratelimit.v2.RateLimitResponse2\204\001\n\020Ra" +
      "teLimitService\022p\n\017ShouldRateLimit\022,.envo" +
      "y.service.ratelimit.v3.RateLimitRequest\032" +
      "-.envoy.service.ratelimit.v3.RateLimitRe" +
      "sponse\"\000BA\n(io.envoyproxy.envoy.service." +
      "ratelimit.v3B\010RlsProtoP\001\210\001\001\272\200\310\321\006\002\020\002b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.common.ratelimit.v3.RatelimitProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_service_ratelimit_v3_RateLimitRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_ratelimit_v3_RateLimitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_ratelimit_v3_RateLimitRequest_descriptor,
        new java.lang.String[] { "Domain", "Descriptors", "HitsAddend", });
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_ratelimit_v3_RateLimitResponse_descriptor,
        new java.lang.String[] { "OverallCode", "Statuses", "ResponseHeadersToAdd", "RequestHeadersToAdd", "RawBody", "DynamicMetadata", });
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_RateLimit_descriptor =
      internal_static_envoy_service_ratelimit_v3_RateLimitResponse_descriptor.getNestedTypes().get(0);
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_RateLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_ratelimit_v3_RateLimitResponse_RateLimit_descriptor,
        new java.lang.String[] { "Name", "RequestsPerUnit", "Unit", });
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_DescriptorStatus_descriptor =
      internal_static_envoy_service_ratelimit_v3_RateLimitResponse_descriptor.getNestedTypes().get(1);
    internal_static_envoy_service_ratelimit_v3_RateLimitResponse_DescriptorStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_ratelimit_v3_RateLimitResponse_DescriptorStatus_descriptor,
        new java.lang.String[] { "Code", "CurrentLimit", "LimitRemaining", "DurationUntilReset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.extensions.common.ratelimit.v3.RatelimitProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}