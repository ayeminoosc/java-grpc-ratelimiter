// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/hash_policy.proto

package io.envoyproxy.envoy.type.v3;

public final class HashPolicyProto {
  private HashPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_v3_HashPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_v3_HashPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_v3_HashPolicy_SourceIp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_v3_HashPolicy_SourceIp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037envoy/type/v3/hash_policy.proto\022\renvoy" +
      ".type.v3\032\035udpa/annotations/status.proto\032" +
      "!udpa/annotations/versioning.proto\032\027vali" +
      "date/validate.proto\"\257\001\n\nHashPolicy\0227\n\tso" +
      "urce_ip\030\001 \001(\0132\".envoy.type.v3.HashPolicy" +
      ".SourceIpH\000\0321\n\010SourceIp:%\232\305\210\036 \n\036envoy.ty" +
      "pe.HashPolicy.SourceIp:\034\232\305\210\036\027\n\025envoy.typ" +
      "e.HashPolicyB\027\n\020policy_specifier\022\003\370B\001B8\n" +
      "\033io.envoyproxy.envoy.type.v3B\017HashPolicy" +
      "ProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_type_v3_HashPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_type_v3_HashPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_v3_HashPolicy_descriptor,
        new java.lang.String[] { "SourceIp", "PolicySpecifier", });
    internal_static_envoy_type_v3_HashPolicy_SourceIp_descriptor =
      internal_static_envoy_type_v3_HashPolicy_descriptor.getNestedTypes().get(0);
    internal_static_envoy_type_v3_HashPolicy_SourceIp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_v3_HashPolicy_SourceIp_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}