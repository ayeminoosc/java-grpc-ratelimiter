// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/mongo_proxy/v3/mongo_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.mongo_proxy.v3;

public final class MongoProxyProto {
  private MongoProxyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_network_mongo_proxy_v3_MongoProxy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_network_mongo_proxy_v3_MongoProxy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAenvoy/extensions/filters/network/mongo" +
      "_proxy/v3/mongo_proxy.proto\022/envoy.exten" +
      "sions.filters.network.mongo_proxy.v3\0324en" +
      "voy/extensions/filters/common/fault/v3/f" +
      "ault.proto\032\035udpa/annotations/status.prot" +
      "o\032!udpa/annotations/versioning.proto\032\027va" +
      "lidate/validate.proto\"\362\001\n\nMongoProxy\022\034\n\013" +
      "stat_prefix\030\001 \001(\tB\007\372B\004r\002\020\001\022\022\n\naccess_log" +
      "\030\002 \001(\t\022C\n\005delay\030\003 \001(\01324.envoy.extensions" +
      ".filters.common.fault.v3.FaultDelay\022\035\n\025e" +
      "mit_dynamic_metadata\030\004 \001(\010\022\020\n\010commands\030\005" +
      " \003(\t:<\232\305\210\0367\n5envoy.config.filter.network" +
      ".mongo_proxy.v2.MongoProxyBZ\n=io.envoypr" +
      "oxy.envoy.extensions.filters.network.mon" +
      "go_proxy.v3B\017MongoProxyProtoP\001\272\200\310\321\006\002\020\002b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_network_mongo_proxy_v3_MongoProxy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_network_mongo_proxy_v3_MongoProxy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_network_mongo_proxy_v3_MongoProxy_descriptor,
        new java.lang.String[] { "StatPrefix", "AccessLog", "Delay", "EmitDynamicMetadata", "Commands", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
