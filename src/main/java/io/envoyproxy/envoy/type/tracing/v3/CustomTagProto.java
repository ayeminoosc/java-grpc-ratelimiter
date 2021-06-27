// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/tracing/v3/custom_tag.proto

package io.envoyproxy.envoy.type.tracing.v3;

public final class CustomTagProto {
  private CustomTagProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_tracing_v3_CustomTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_tracing_v3_CustomTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_tracing_v3_CustomTag_Literal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_tracing_v3_CustomTag_Literal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_tracing_v3_CustomTag_Environment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_tracing_v3_CustomTag_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_tracing_v3_CustomTag_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_tracing_v3_CustomTag_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_tracing_v3_CustomTag_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_tracing_v3_CustomTag_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&envoy/type/tracing/v3/custom_tag.proto" +
      "\022\025envoy.type.tracing.v3\032%envoy/type/meta" +
      "data/v3/metadata.proto\032\035udpa/annotations" +
      "/status.proto\032!udpa/annotations/versioni" +
      "ng.proto\032\027validate/validate.proto\"\317\006\n\tCu" +
      "stomTag\022\024\n\003tag\030\001 \001(\tB\007\372B\004r\002\020\001\022;\n\007literal" +
      "\030\002 \001(\0132(.envoy.type.tracing.v3.CustomTag" +
      ".LiteralH\000\022C\n\013environment\030\003 \001(\0132,.envoy." +
      "type.tracing.v3.CustomTag.EnvironmentH\000\022" +
      "A\n\016request_header\030\004 \001(\0132\'.envoy.type.tra" +
      "cing.v3.CustomTag.HeaderH\000\022=\n\010metadata\030\005" +
      " \001(\0132).envoy.type.tracing.v3.CustomTag.M" +
      "etadataH\000\032Q\n\007Literal\022\026\n\005value\030\001 \001(\tB\007\372B\004" +
      "r\002\020\001:.\232\305\210\036)\n\'envoy.type.tracing.v2.Custo" +
      "mTag.Literal\032o\n\013Environment\022\025\n\004name\030\001 \001(" +
      "\tB\007\372B\004r\002\020\001\022\025\n\rdefault_value\030\002 \001(\t:2\232\305\210\036-" +
      "\n+envoy.type.tracing.v2.CustomTag.Enviro" +
      "nment\032k\n\006Header\022\033\n\004name\030\001 \001(\tB\r\372B\nr\010\020\001\300\001" +
      "\001\310\001\000\022\025\n\rdefault_value\030\002 \001(\t:-\232\305\210\036(\n&envo" +
      "y.type.tracing.v2.CustomTag.Header\032\301\001\n\010M" +
      "etadata\0222\n\004kind\030\001 \001(\0132$.envoy.type.metad" +
      "ata.v3.MetadataKind\0229\n\014metadata_key\030\002 \001(" +
      "\0132#.envoy.type.metadata.v3.MetadataKey\022\025" +
      "\n\rdefault_value\030\003 \001(\t:/\232\305\210\036*\n(envoy.type" +
      ".tracing.v2.CustomTag.Metadata:&\232\305\210\036!\n\037e" +
      "nvoy.type.tracing.v2.CustomTagB\013\n\004type\022\003" +
      "\370B\001B?\n#io.envoyproxy.envoy.type.tracing." +
      "v3B\016CustomTagProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.type.metadata.v3.MetadataProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_type_tracing_v3_CustomTag_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_type_tracing_v3_CustomTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_tracing_v3_CustomTag_descriptor,
        new java.lang.String[] { "Tag", "Literal", "Environment", "RequestHeader", "Metadata", "Type", });
    internal_static_envoy_type_tracing_v3_CustomTag_Literal_descriptor =
      internal_static_envoy_type_tracing_v3_CustomTag_descriptor.getNestedTypes().get(0);
    internal_static_envoy_type_tracing_v3_CustomTag_Literal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_tracing_v3_CustomTag_Literal_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_envoy_type_tracing_v3_CustomTag_Environment_descriptor =
      internal_static_envoy_type_tracing_v3_CustomTag_descriptor.getNestedTypes().get(1);
    internal_static_envoy_type_tracing_v3_CustomTag_Environment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_tracing_v3_CustomTag_Environment_descriptor,
        new java.lang.String[] { "Name", "DefaultValue", });
    internal_static_envoy_type_tracing_v3_CustomTag_Header_descriptor =
      internal_static_envoy_type_tracing_v3_CustomTag_descriptor.getNestedTypes().get(2);
    internal_static_envoy_type_tracing_v3_CustomTag_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_tracing_v3_CustomTag_Header_descriptor,
        new java.lang.String[] { "Name", "DefaultValue", });
    internal_static_envoy_type_tracing_v3_CustomTag_Metadata_descriptor =
      internal_static_envoy_type_tracing_v3_CustomTag_descriptor.getNestedTypes().get(3);
    internal_static_envoy_type_tracing_v3_CustomTag_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_tracing_v3_CustomTag_Metadata_descriptor,
        new java.lang.String[] { "Kind", "MetadataKey", "DefaultValue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.type.metadata.v3.MetadataProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}