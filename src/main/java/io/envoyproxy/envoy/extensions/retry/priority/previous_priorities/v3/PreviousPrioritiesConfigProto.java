// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/retry/priority/previous_priorities/v3/previous_priorities_config.proto

package io.envoyproxy.envoy.extensions.retry.priority.previous_priorities.v3;

public final class PreviousPrioritiesConfigProto {
  private PreviousPrioritiesConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_retry_priority_previous_priorities_v3_PreviousPrioritiesConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_retry_priority_previous_priorities_v3_PreviousPrioritiesConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nWenvoy/extensions/retry/priority/previo" +
      "us_priorities/v3/previous_priorities_con" +
      "fig.proto\0226envoy.extensions.retry.priori" +
      "ty.previous_priorities.v3\032\035udpa/annotati" +
      "ons/status.proto\032!udpa/annotations/versi" +
      "oning.proto\032\027validate/validate.proto\"\205\001\n" +
      "\030PreviousPrioritiesConfig\022!\n\020update_freq" +
      "uency\030\001 \001(\005B\007\372B\004\032\002 \000:F\232\305\210\036A\n?envoy.confi" +
      "g.retry.previous_priorities.PreviousPrio" +
      "ritiesConfigBo\nDio.envoyproxy.envoy.exte" +
      "nsions.retry.priority.previous_prioritie" +
      "s.v3B\035PreviousPrioritiesConfigProtoP\001\272\200\310" +
      "\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_retry_priority_previous_priorities_v3_PreviousPrioritiesConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_retry_priority_previous_priorities_v3_PreviousPrioritiesConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_retry_priority_previous_priorities_v3_PreviousPrioritiesConfig_descriptor,
        new java.lang.String[] { "UpdateFrequency", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
