// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/wasm/v3/wasm.proto

package io.envoyproxy.envoy.extensions.filters.http.wasm.v3;

public final class WasmProto {
  private WasmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_filters_http_wasm_v3_Wasm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_filters_http_wasm_v3_Wasm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0envoy/extensions/filters/http/wasm/v3/" +
      "wasm.proto\022%envoy.extensions.filters.htt" +
      "p.wasm.v3\032#envoy/extensions/wasm/v3/wasm" +
      ".proto\032\035udpa/annotations/status.proto\032!u" +
      "dpa/annotations/versioning.proto\032\027valida" +
      "te/validate.proto\">\n\004Wasm\0226\n\006config\030\001 \001(" +
      "\0132&.envoy.extensions.wasm.v3.PluginConfi" +
      "gBJ\n3io.envoyproxy.envoy.extensions.filt" +
      "ers.http.wasm.v3B\tWasmProtoP\001\272\200\310\321\006\002\020\002b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.extensions.wasm.v3.WasmProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_filters_http_wasm_v3_Wasm_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_filters_http_wasm_v3_Wasm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_filters_http_wasm_v3_Wasm_descriptor,
        new java.lang.String[] { "Config", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.extensions.wasm.v3.WasmProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}