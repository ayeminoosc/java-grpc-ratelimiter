// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/starttls/v3/starttls.proto

package io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3;

public final class StarttlsProto {
  private StarttlsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=envoy/extensions/transport_sockets/sta" +
      "rttls/v3/starttls.proto\022.envoy.extension" +
      "s.transport_sockets.starttls.v3\032Aenvoy/e" +
      "xtensions/transport_sockets/raw_buffer/v" +
      "3/raw_buffer.proto\0323envoy/extensions/tra" +
      "nsport_sockets/tls/v3/tls.proto\032\036google/" +
      "protobuf/wrappers.proto\032\035udpa/annotation" +
      "s/status.proto\032!udpa/annotations/version" +
      "ing.proto\032\027validate/validate.proto\"\324\001\n\016S" +
      "tartTlsConfig\022\\\n\027cleartext_socket_config" +
      "\030\001 \001(\0132;.envoy.extensions.transport_sock" +
      "ets.raw_buffer.v3.RawBuffer\022d\n\021tls_socke" +
      "t_config\030\002 \001(\0132?.envoy.extensions.transp" +
      "ort_sockets.tls.v3.DownstreamTlsContextB" +
      "\010\372B\005\212\001\002\020\001BW\n<io.envoyproxy.envoy.extensi" +
      "ons.transport_sockets.starttls.v3B\rStart" +
      "tlsProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_descriptor,
        new java.lang.String[] { "CleartextSocketConfig", "TlsSocketConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferProto.getDescriptor();
    io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}