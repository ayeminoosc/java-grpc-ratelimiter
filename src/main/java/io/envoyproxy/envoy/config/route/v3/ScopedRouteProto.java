// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/route/v3/scoped_route.proto

package io.envoyproxy.envoy.config.route.v3;

public final class ScopedRouteProto {
  private ScopedRouteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_route_v3_ScopedRouteConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_Fragment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_Fragment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(envoy/config/route/v3/scoped_route.pro" +
      "to\022\025envoy.config.route.v3\032\035udpa/annotati" +
      "ons/status.proto\032!udpa/annotations/versi" +
      "oning.proto\032\027validate/validate.proto\"\350\003\n" +
      "\030ScopedRouteConfiguration\022\021\n\ton_demand\030\004" +
      " \001(\010\022\025\n\004name\030\001 \001(\tB\007\372B\004r\002\020\001\022)\n\030route_con" +
      "figuration_name\030\002 \001(\tB\007\372B\004r\002\020\001\022J\n\003key\030\003 " +
      "\001(\01323.envoy.config.route.v3.ScopedRouteC" +
      "onfiguration.KeyB\010\372B\005\212\001\002\020\001\032\374\001\n\003Key\022Y\n\tfr" +
      "agments\030\001 \003(\0132<.envoy.config.route.v3.Sc" +
      "opedRouteConfiguration.Key.FragmentB\010\372B\005" +
      "\222\001\002\010\001\032h\n\010Fragment\022\024\n\nstring_key\030\001 \001(\tH\000:" +
      "9\232\305\210\0364\n2envoy.api.v2.ScopedRouteConfigur" +
      "ation.Key.FragmentB\013\n\004type\022\003\370B\001:0\232\305\210\036+\n)" +
      "envoy.api.v2.ScopedRouteConfiguration.Ke" +
      "y:,\232\305\210\036\'\n%envoy.api.v2.ScopedRouteConfig" +
      "urationBA\n#io.envoyproxy.envoy.config.ro" +
      "ute.v3B\020ScopedRouteProtoP\001\272\200\310\321\006\002\020\002b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_route_v3_ScopedRouteConfiguration_descriptor,
        new java.lang.String[] { "OnDemand", "Name", "RouteConfigurationName", "Key", });
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_descriptor =
      internal_static_envoy_config_route_v3_ScopedRouteConfiguration_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_descriptor,
        new java.lang.String[] { "Fragments", });
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_Fragment_descriptor =
      internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_Fragment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_route_v3_ScopedRouteConfiguration_Key_Fragment_descriptor,
        new java.lang.String[] { "StringKey", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}