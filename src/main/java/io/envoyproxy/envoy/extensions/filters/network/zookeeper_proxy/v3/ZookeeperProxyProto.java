// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/zookeeper_proxy/v3/zookeeper_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.zookeeper_proxy.v3;

public final class ZookeeperProxyProto {
  private ZookeeperProxyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_network_zookeeper_proxy_v3_ZooKeeperProxy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_network_zookeeper_proxy_v3_ZooKeeperProxy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIenvoy/extensions/filters/network/zooke" +
      "eper_proxy/v3/zookeeper_proxy.proto\0223env" +
      "oy.extensions.filters.network.zookeeper_" +
      "proxy.v3\032\036google/protobuf/wrappers.proto" +
      "\032\035udpa/annotations/status.proto\032!udpa/an" +
      "notations/versioning.proto\032\027validate/val" +
      "idate.proto\"\306\001\n\016ZooKeeperProxy\022\034\n\013stat_p" +
      "refix\030\001 \001(\tB\007\372B\004r\002\020\001\022\022\n\naccess_log\030\002 \001(\t" +
      "\0226\n\020max_packet_bytes\030\003 \001(\0132\034.google.prot" +
      "obuf.UInt32Value:J\232\305\210\036E\nCenvoy.config.fi" +
      "lter.network.zookeeper_proxy.v1alpha1.Zo" +
      "oKeeperProxyBb\nAio.envoyproxy.envoy.exte" +
      "nsions.filters.network.zookeeper_proxy.v" +
      "3B\023ZookeeperProxyProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_network_zookeeper_proxy_v3_ZooKeeperProxy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_network_zookeeper_proxy_v3_ZooKeeperProxy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_network_zookeeper_proxy_v3_ZooKeeperProxy_descriptor,
        new java.lang.String[] { "StatPrefix", "AccessLog", "MaxPacketBytes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}