// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/ratelimit_unit.proto

package io.envoyproxy.envoy.type.v3;

public final class RatelimitUnitProto {
  private RatelimitUnitProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"envoy/type/v3/ratelimit_unit.proto\022\ren" +
      "voy.type.v3\032\035udpa/annotations/status.pro" +
      "to*G\n\rRateLimitUnit\022\013\n\007UNKNOWN\020\000\022\n\n\006SECO" +
      "ND\020\001\022\n\n\006MINUTE\020\002\022\010\n\004HOUR\020\003\022\007\n\003DAY\020\004B;\n\033i" +
      "o.envoyproxy.envoy.type.v3B\022RatelimitUni" +
      "tProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
