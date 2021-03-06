// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/cluster/v3/circuit_breaker.proto

package io.envoyproxy.envoy.config.cluster.v3;

public final class CircuitBreakerProto {
  private CircuitBreakerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_cluster_v3_CircuitBreakers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_cluster_v3_CircuitBreakers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_RetryBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_RetryBudget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-envoy/config/cluster/v3/circuit_breake" +
      "r.proto\022\027envoy.config.cluster.v3\032\037envoy/" +
      "config/core/v3/base.proto\032\033envoy/type/v3" +
      "/percent.proto\032\036google/protobuf/wrappers" +
      ".proto\032\035udpa/annotations/status.proto\032!u" +
      "dpa/annotations/versioning.proto\032\027valida" +
      "te/validate.proto\"\330\006\n\017CircuitBreakers\022G\n" +
      "\nthresholds\030\001 \003(\01323.envoy.config.cluster" +
      ".v3.CircuitBreakers.Thresholds\032\316\005\n\nThres" +
      "holds\022A\n\010priority\030\001 \001(\0162%.envoy.config.c" +
      "ore.v3.RoutingPriorityB\010\372B\005\202\001\002\020\001\0225\n\017max_" +
      "connections\030\002 \001(\0132\034.google.protobuf.UInt" +
      "32Value\022:\n\024max_pending_requests\030\003 \001(\0132\034." +
      "google.protobuf.UInt32Value\0222\n\014max_reque" +
      "sts\030\004 \001(\0132\034.google.protobuf.UInt32Value\022" +
      "1\n\013max_retries\030\005 \001(\0132\034.google.protobuf.U" +
      "Int32Value\022U\n\014retry_budget\030\010 \001(\0132?.envoy" +
      ".config.cluster.v3.CircuitBreakers.Thres" +
      "holds.RetryBudget\022\027\n\017track_remaining\030\006 \001" +
      "(\010\022:\n\024max_connection_pools\030\007 \001(\0132\034.googl" +
      "e.protobuf.UInt32Value\032\276\001\n\013RetryBudget\022." +
      "\n\016budget_percent\030\001 \001(\0132\026.envoy.type.v3.P" +
      "ercent\022;\n\025min_retry_concurrency\030\002 \001(\0132\034." +
      "google.protobuf.UInt32Value:B\232\305\210\036=\n;envo" +
      "y.api.v2.cluster.CircuitBreakers.Thresho" +
      "lds.RetryBudget:6\232\305\210\0361\n/envoy.api.v2.clu" +
      "ster.CircuitBreakers.Thresholds:+\232\305\210\036&\n$" +
      "envoy.api.v2.cluster.CircuitBreakersBF\n%" +
      "io.envoyproxy.envoy.config.cluster.v3B\023C" +
      "ircuitBreakerProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_cluster_v3_CircuitBreakers_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_cluster_v3_CircuitBreakers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_cluster_v3_CircuitBreakers_descriptor,
        new java.lang.String[] { "Thresholds", });
    internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_descriptor =
      internal_static_envoy_config_cluster_v3_CircuitBreakers_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_descriptor,
        new java.lang.String[] { "Priority", "MaxConnections", "MaxPendingRequests", "MaxRequests", "MaxRetries", "RetryBudget", "TrackRemaining", "MaxConnectionPools", });
    internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_RetryBudget_descriptor =
      internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_RetryBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_cluster_v3_CircuitBreakers_Thresholds_RetryBudget_descriptor,
        new java.lang.String[] { "BudgetPercent", "MinRetryConcurrency", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
