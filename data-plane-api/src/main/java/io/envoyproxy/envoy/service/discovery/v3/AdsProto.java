// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/discovery/v3/ads.proto

package io.envoyproxy.envoy.service.discovery.v3;

public final class AdsProto {
  private AdsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_discovery_v3_AdsDummy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_discovery_v3_AdsDummy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/service/discovery/v3/ads.proto\022\032" +
      "envoy.service.discovery.v3\032*envoy/servic" +
      "e/discovery/v3/discovery.proto\032\035udpa/ann" +
      "otations/status.proto\032!udpa/annotations/" +
      "versioning.proto\"6\n\010AdsDummy:*\232\305\210\036%\n#env" +
      "oy.service.discovery.v2.AdsDummy2\246\002\n\032Agg" +
      "regatedDiscoveryService\022~\n\031StreamAggrega" +
      "tedResources\022,.envoy.service.discovery.v" +
      "3.DiscoveryRequest\032-.envoy.service.disco" +
      "very.v3.DiscoveryResponse\"\000(\0010\001\022\207\001\n\030Delt" +
      "aAggregatedResources\0221.envoy.service.dis" +
      "covery.v3.DeltaDiscoveryRequest\0322.envoy." +
      "service.discovery.v3.DeltaDiscoveryRespo" +
      "nse\"\000(\0010\001BA\n(io.envoyproxy.envoy.service" +
      ".discovery.v3B\010AdsProtoP\001\210\001\001\272\200\310\321\006\002\020\002b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_service_discovery_v3_AdsDummy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_discovery_v3_AdsDummy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_discovery_v3_AdsDummy_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}