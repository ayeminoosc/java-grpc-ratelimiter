// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/route/v3/rds.proto

package io.envoyproxy.envoy.service.route.v3;

public final class RdsProto {
  private RdsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_route_v3_RdsDummy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_route_v3_RdsDummy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n envoy/service/route/v3/rds.proto\022\026envo" +
      "y.service.route.v3\032*envoy/service/discov" +
      "ery/v3/discovery.proto\032\034google/api/annot" +
      "ations.proto\032\036google/protobuf/wrappers.p" +
      "roto\032 envoy/annotations/resource.proto\032\035" +
      "udpa/annotations/status.proto\032!udpa/anno" +
      "tations/versioning.proto\032\027validate/valid" +
      "ate.proto\"(\n\010RdsDummy:\034\232\305\210\036\027\n\025envoy.api." +
      "v2.RdsDummy2\314\003\n\025RouteDiscoveryService\022q\n" +
      "\014StreamRoutes\022,.envoy.service.discovery." +
      "v3.DiscoveryRequest\032-.envoy.service.disc" +
      "overy.v3.DiscoveryResponse\"\000(\0010\001\022z\n\013Delt" +
      "aRoutes\0221.envoy.service.discovery.v3.Del" +
      "taDiscoveryRequest\0322.envoy.service.disco" +
      "very.v3.DeltaDiscoveryResponse\"\000(\0010\001\022\221\001\n" +
      "\013FetchRoutes\022,.envoy.service.discovery.v" +
      "3.DiscoveryRequest\032-.envoy.service.disco" +
      "very.v3.DiscoveryResponse\"%\202\323\344\223\002\026\"\024/v3/d" +
      "iscovery:routes\202\323\344\223\002\003:\001*\0320\212\244\226\363\007*\n(envoy." +
      "config.route.v3.RouteConfiguration2\313\001\n\033V" +
      "irtualHostDiscoveryService\022\200\001\n\021DeltaVirt" +
      "ualHosts\0221.envoy.service.discovery.v3.De" +
      "ltaDiscoveryRequest\0322.envoy.service.disc" +
      "overy.v3.DeltaDiscoveryResponse\"\000(\0010\001\032)\212" +
      "\244\226\363\007#\n!envoy.config.route.v3.VirtualHost" +
      "B=\n$io.envoyproxy.envoy.service.route.v3" +
      "B\010RdsProtoP\001\210\001\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          envoy.annotations.Resource.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_service_route_v3_RdsDummy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_route_v3_RdsDummy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_route_v3_RdsDummy_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(envoy.annotations.Resource.resource);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    envoy.annotations.Resource.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}