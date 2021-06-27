// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/core/v3/health_check_event.proto

package io.envoyproxy.envoy.data.core.v3;

public final class HealthCheckEventProto {
  private HealthCheckEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_core_v3_HealthCheckEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_core_v3_HealthCheckEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_core_v3_HealthCheckAddHealthy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_core_v3_HealthCheckAddHealthy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_core_v3_HealthCheckFailure_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_core_v3_HealthCheckFailure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_core_v3_DegradedHealthyHost_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_core_v3_DegradedHealthyHost_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_core_v3_NoLongerDegradedHost_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_core_v3_NoLongerDegradedHost_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+envoy/data/core/v3/health_check_event." +
      "proto\022\022envoy.data.core.v3\032\"envoy/config/" +
      "core/v3/address.proto\032\037google/protobuf/t" +
      "imestamp.proto\032\035udpa/annotations/status." +
      "proto\032!udpa/annotations/versioning.proto" +
      "\032\027validate/validate.proto\"\227\005\n\020HealthChec" +
      "kEvent\022L\n\023health_checker_type\030\001 \001(\0162%.en" +
      "voy.data.core.v3.HealthCheckerTypeB\010\372B\005\202" +
      "\001\002\020\001\022+\n\004host\030\002 \001(\0132\035.envoy.config.core.v" +
      "3.Address\022\035\n\014cluster_name\030\003 \001(\tB\007\372B\004r\002\020\001" +
      "\022N\n\025eject_unhealthy_event\030\004 \001(\0132-.envoy." +
      "data.core.v3.HealthCheckEjectUnhealthyH\000" +
      "\022F\n\021add_healthy_event\030\005 \001(\0132).envoy.data" +
      ".core.v3.HealthCheckAddHealthyH\000\022L\n\032heal" +
      "th_check_failure_event\030\007 \001(\0132&.envoy.dat" +
      "a.core.v3.HealthCheckFailureH\000\022H\n\025degrad" +
      "ed_healthy_host\030\010 \001(\0132\'.envoy.data.core." +
      "v3.DegradedHealthyHostH\000\022K\n\027no_longer_de" +
      "graded_host\030\t \001(\0132(.envoy.data.core.v3.N" +
      "oLongerDegradedHostH\000\022-\n\ttimestamp\030\006 \001(\013" +
      "2\032.google.protobuf.Timestamp:/\232\305\210\036*\n(env" +
      "oy.data.core.v2alpha.HealthCheckEventB\014\n" +
      "\005event\022\003\370B\001\"\241\001\n\031HealthCheckEjectUnhealth" +
      "y\022J\n\014failure_type\030\001 \001(\0162*.envoy.data.cor" +
      "e.v3.HealthCheckFailureTypeB\010\372B\005\202\001\002\020\001:8\232" +
      "\305\210\0363\n1envoy.data.core.v2alpha.HealthChec" +
      "kEjectUnhealthy\"b\n\025HealthCheckAddHealthy" +
      "\022\023\n\013first_check\030\001 \001(\010:4\232\305\210\036/\n-envoy.data" +
      ".core.v2alpha.HealthCheckAddHealthy\"\250\001\n\022" +
      "HealthCheckFailure\022J\n\014failure_type\030\001 \001(\016" +
      "2*.envoy.data.core.v3.HealthCheckFailure" +
      "TypeB\010\372B\005\202\001\002\020\001\022\023\n\013first_check\030\002 \001(\010:1\232\305\210" +
      "\036,\n*envoy.data.core.v2alpha.HealthCheckF" +
      "ailure\"I\n\023DegradedHealthyHost:2\232\305\210\036-\n+en" +
      "voy.data.core.v2alpha.DegradedHealthyHos" +
      "t\"K\n\024NoLongerDegradedHost:3\232\305\210\036.\n,envoy." +
      "data.core.v2alpha.NoLongerDegradedHost*>" +
      "\n\026HealthCheckFailureType\022\n\n\006ACTIVE\020\000\022\013\n\007" +
      "PASSIVE\020\001\022\013\n\007NETWORK\020\002*;\n\021HealthCheckerT" +
      "ype\022\010\n\004HTTP\020\000\022\007\n\003TCP\020\001\022\010\n\004GRPC\020\002\022\t\n\005REDI" +
      "S\020\003BC\n io.envoyproxy.envoy.data.core.v3B" +
      "\025HealthCheckEventProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_data_core_v3_HealthCheckEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_data_core_v3_HealthCheckEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_core_v3_HealthCheckEvent_descriptor,
        new java.lang.String[] { "HealthCheckerType", "Host", "ClusterName", "EjectUnhealthyEvent", "AddHealthyEvent", "HealthCheckFailureEvent", "DegradedHealthyHost", "NoLongerDegradedHost", "Timestamp", "Event", });
    internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_descriptor,
        new java.lang.String[] { "FailureType", });
    internal_static_envoy_data_core_v3_HealthCheckAddHealthy_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_data_core_v3_HealthCheckAddHealthy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_core_v3_HealthCheckAddHealthy_descriptor,
        new java.lang.String[] { "FirstCheck", });
    internal_static_envoy_data_core_v3_HealthCheckFailure_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_data_core_v3_HealthCheckFailure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_core_v3_HealthCheckFailure_descriptor,
        new java.lang.String[] { "FailureType", "FirstCheck", });
    internal_static_envoy_data_core_v3_DegradedHealthyHost_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_data_core_v3_DegradedHealthyHost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_core_v3_DegradedHealthyHost_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_data_core_v3_NoLongerDegradedHost_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_data_core_v3_NoLongerDegradedHost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_core_v3_NoLongerDegradedHost_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.AddressProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
