// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/clusters/aggregate/v3/cluster.proto

package io.envoyproxy.envoy.extensions.clusters.aggregate.v3;

public final class ClusterProto {
  private ClusterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_clusters_aggregate_v3_ClusterConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_clusters_aggregate_v3_ClusterConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4envoy/extensions/clusters/aggregate/v3" +
      "/cluster.proto\022&envoy.extensions.cluster" +
      "s.aggregate.v3\032\035udpa/annotations/status." +
      "proto\032!udpa/annotations/versioning.proto" +
      "\032\027validate/validate.proto\"h\n\rClusterConf" +
      "ig\022\032\n\010clusters\030\001 \003(\tB\010\372B\005\222\001\002\010\001:;\232\305\210\0366\n4e" +
      "nvoy.config.cluster.aggregate.v2alpha.Cl" +
      "usterConfigBN\n4io.envoyproxy.envoy.exten" +
      "sions.clusters.aggregate.v3B\014ClusterProt" +
      "oP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_clusters_aggregate_v3_ClusterConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_clusters_aggregate_v3_ClusterConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_clusters_aggregate_v3_ClusterConfig_descriptor,
        new java.lang.String[] { "Clusters", });
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
