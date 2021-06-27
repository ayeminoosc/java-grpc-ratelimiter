// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/status/v3/csds.proto

package io.envoyproxy.envoy.service.status.v3;

public final class CsdsProto {
  private CsdsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_status_v3_ClientStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_status_v3_ClientStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_status_v3_PerXdsConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_status_v3_PerXdsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_status_v3_ClientConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_status_v3_ClientConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_service_status_v3_ClientStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_service_status_v3_ClientStatusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"envoy/service/status/v3/csds.proto\022\027en" +
      "voy.service.status.v3\032 envoy/admin/v3/co" +
      "nfig_dump.proto\032\037envoy/config/core/v3/ba" +
      "se.proto\032 envoy/type/matcher/v3/node.pro" +
      "to\032\034google/api/annotations.proto\032\034google" +
      "/protobuf/struct.proto\032\036udpa/annotations" +
      "/migrate.proto\032\035udpa/annotations/status." +
      "proto\032!udpa/annotations/versioning.proto" +
      "\"\256\001\n\023ClientStatusRequest\0229\n\rnode_matcher" +
      "s\030\001 \003(\0132\".envoy.type.matcher.v3.NodeMatc" +
      "her\022(\n\004node\030\002 \001(\0132\032.envoy.config.core.v3" +
      ".Node:2\232\305\210\036-\n+envoy.service.status.v2.Cl" +
      "ientStatusRequest\"\265\004\n\014PerXdsConfig\022L\n\006st" +
      "atus\030\001 \001(\0162%.envoy.service.status.v3.Con" +
      "figStatusB\025\362\230\376\217\005\017\022\rstatus_config\022Y\n\rclie" +
      "nt_status\030\007 \001(\0162+.envoy.service.status.v" +
      "3.ClientConfigStatusB\025\362\230\376\217\005\017\022\rstatus_con" +
      "fig\022>\n\017listener_config\030\002 \001(\0132#.envoy.adm" +
      "in.v3.ListenersConfigDumpH\000\022<\n\016cluster_c" +
      "onfig\030\003 \001(\0132\".envoy.admin.v3.ClustersCon" +
      "figDumpH\000\0228\n\014route_config\030\004 \001(\0132 .envoy." +
      "admin.v3.RoutesConfigDumpH\000\022E\n\023scoped_ro" +
      "ute_config\030\005 \001(\0132&.envoy.admin.v3.Scoped" +
      "RoutesConfigDumpH\000\022>\n\017endpoint_config\030\006 " +
      "\001(\0132#.envoy.admin.v3.EndpointsConfigDump" +
      "H\000:+\232\305\210\036&\n$envoy.service.status.v2.PerXd" +
      "sConfigB\020\n\016per_xds_config\"\240\001\n\014ClientConf" +
      "ig\022(\n\004node\030\001 \001(\0132\032.envoy.config.core.v3." +
      "Node\0229\n\nxds_config\030\002 \003(\0132%.envoy.service" +
      ".status.v3.PerXdsConfig:+\232\305\210\036&\n$envoy.se" +
      "rvice.status.v2.ClientConfig\"\202\001\n\024ClientS" +
      "tatusResponse\0225\n\006config\030\001 \003(\0132%.envoy.se" +
      "rvice.status.v3.ClientConfig:3\232\305\210\036.\n,env" +
      "oy.service.status.v2.ClientStatusRespons" +
      "e*K\n\014ConfigStatus\022\013\n\007UNKNOWN\020\000\022\n\n\006SYNCED" +
      "\020\001\022\014\n\010NOT_SENT\020\002\022\t\n\005STALE\020\003\022\t\n\005ERROR\020\004*c" +
      "\n\022ClientConfigStatus\022\022\n\016CLIENT_UNKNOWN\020\000" +
      "\022\024\n\020CLIENT_REQUESTED\020\001\022\020\n\014CLIENT_ACKED\020\002" +
      "\022\021\n\rCLIENT_NACKED\020\0032\270\002\n\034ClientStatusDisc" +
      "overyService\022w\n\022StreamClientStatus\022,.env" +
      "oy.service.status.v3.ClientStatusRequest" +
      "\032-.envoy.service.status.v3.ClientStatusR" +
      "esponse\"\000(\0010\001\022\236\001\n\021FetchClientStatus\022,.en" +
      "voy.service.status.v3.ClientStatusReques" +
      "t\032-.envoy.service.status.v3.ClientStatus" +
      "Response\",\202\323\344\223\002\035\"\033/v3/discovery:client_s" +
      "tatus\202\323\344\223\002\003:\001*B?\n%io.envoyproxy.envoy.se" +
      "rvice.status.v3B\tCsdsProtoP\001\210\001\001\272\200\310\321\006\002\020\002b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.admin.v3.ConfigDumpProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.NodeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_service_status_v3_ClientStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_service_status_v3_ClientStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_status_v3_ClientStatusRequest_descriptor,
        new java.lang.String[] { "NodeMatchers", "Node", });
    internal_static_envoy_service_status_v3_PerXdsConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_service_status_v3_PerXdsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_status_v3_PerXdsConfig_descriptor,
        new java.lang.String[] { "Status", "ClientStatus", "ListenerConfig", "ClusterConfig", "RouteConfig", "ScopedRouteConfig", "EndpointConfig", "PerXdsConfig", });
    internal_static_envoy_service_status_v3_ClientConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_service_status_v3_ClientConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_status_v3_ClientConfig_descriptor,
        new java.lang.String[] { "Node", "XdsConfig", });
    internal_static_envoy_service_status_v3_ClientStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_service_status_v3_ClientStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_service_status_v3_ClientStatusResponse_descriptor,
        new java.lang.String[] { "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(udpa.annotations.Migrate.fieldMigrate);
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.admin.v3.ConfigDumpProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.NodeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}