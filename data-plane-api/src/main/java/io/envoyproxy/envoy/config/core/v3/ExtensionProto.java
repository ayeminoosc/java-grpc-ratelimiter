// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/extension.proto

package io.envoyproxy.envoy.config.core.v3;

public final class ExtensionProto {
  private ExtensionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_TypedExtensionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_TypedExtensionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_ExtensionConfigSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_ExtensionConfigSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$envoy/config/core/v3/extension.proto\022\024" +
      "envoy.config.core.v3\032(envoy/config/core/" +
      "v3/config_source.proto\032\031google/protobuf/" +
      "any.proto\032\035udpa/annotations/status.proto" +
      "\032\027validate/validate.proto\"c\n\024TypedExtens" +
      "ionConfig\022\025\n\004name\030\001 \001(\tB\007\372B\004r\002\020\001\0224\n\014type" +
      "d_config\030\002 \001(\0132\024.google.protobuf.AnyB\010\372B" +
      "\005\242\001\002\010\001\"\325\001\n\025ExtensionConfigSource\022C\n\rconf" +
      "ig_source\030\001 \001(\0132\".envoy.config.core.v3.C" +
      "onfigSourceB\010\372B\005\242\001\002\010\001\022,\n\016default_config\030" +
      "\002 \001(\0132\024.google.protobuf.Any\022,\n$apply_def" +
      "ault_config_without_warming\030\003 \001(\010\022\033\n\ttyp" +
      "e_urls\030\004 \003(\tB\010\372B\005\222\001\002\010\001B>\n\"io.envoyproxy." +
      "envoy.config.core.v3B\016ExtensionProtoP\001\272\200" +
      "\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_core_v3_TypedExtensionConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_core_v3_TypedExtensionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_TypedExtensionConfig_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", });
    internal_static_envoy_config_core_v3_ExtensionConfigSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_core_v3_ExtensionConfigSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_ExtensionConfigSource_descriptor,
        new java.lang.String[] { "ConfigSource", "DefaultConfig", "ApplyDefaultConfigWithoutWarming", "TypeUrls", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
