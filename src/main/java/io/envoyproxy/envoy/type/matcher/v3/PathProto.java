// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/v3/path.proto

package io.envoyproxy.envoy.type.matcher.v3;

public final class PathProto {
  private PathProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_type_matcher_v3_PathMatcher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_type_matcher_v3_PathMatcher_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n envoy/type/matcher/v3/path.proto\022\025envo" +
      "y.type.matcher.v3\032\"envoy/type/matcher/v3" +
      "/string.proto\032\035udpa/annotations/status.p" +
      "roto\032!udpa/annotations/versioning.proto\032" +
      "\027validate/validate.proto\"\201\001\n\013PathMatcher" +
      "\022>\n\004path\030\001 \001(\0132$.envoy.type.matcher.v3.S" +
      "tringMatcherB\010\372B\005\212\001\002\020\001H\000:%\232\305\210\036 \n\036envoy.t" +
      "ype.matcher.PathMatcherB\013\n\004rule\022\003\370B\001B:\n#" +
      "io.envoyproxy.envoy.type.matcher.v3B\tPat" +
      "hProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_type_matcher_v3_PathMatcher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_type_matcher_v3_PathMatcher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_type_matcher_v3_PathMatcher_descriptor,
        new java.lang.String[] { "Path", "Rule", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
