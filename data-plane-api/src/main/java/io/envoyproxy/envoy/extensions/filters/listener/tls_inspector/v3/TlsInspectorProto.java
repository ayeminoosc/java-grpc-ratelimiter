// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/listener/tls_inspector/v3/tls_inspector.proto

package io.envoyproxy.envoy.extensions.filters.listener.tls_inspector.v3;

public final class TlsInspectorProto {
  private TlsInspectorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFenvoy/extensions/filters/listener/tls_" +
      "inspector/v3/tls_inspector.proto\0222envoy." +
      "extensions.filters.listener.tls_inspecto" +
      "r.v3\032\035udpa/annotations/status.proto\032!udp" +
      "a/annotations/versioning.proto\"Q\n\014TlsIns" +
      "pector:A\232\305\210\036<\n:envoy.config.filter.liste" +
      "ner.tls_inspector.v2.TlsInspectorB_\n@io." +
      "envoyproxy.envoy.extensions.filters.list" +
      "ener.tls_inspector.v3B\021TlsInspectorProto" +
      "P\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_listener_tls_inspector_v3_TlsInspector_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
