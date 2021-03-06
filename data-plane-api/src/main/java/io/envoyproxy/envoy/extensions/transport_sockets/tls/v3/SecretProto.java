// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/secret.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public final class SecretProto {
  private SecretProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_GenericSecret_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_GenericSecret_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_Secret_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_Secret_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6envoy/extensions/transport_sockets/tls" +
      "/v3/secret.proto\022)envoy.extensions.trans" +
      "port_sockets.tls.v3\032\037envoy/config/core/v" +
      "3/base.proto\032(envoy/config/core/v3/confi" +
      "g_source.proto\0326envoy/extensions/transpo" +
      "rt_sockets/tls/v3/common.proto\032\036udpa/ann" +
      "otations/migrate.proto\032 udpa/annotations" +
      "/sensitive.proto\032\035udpa/annotations/statu" +
      "s.proto\032!udpa/annotations/versioning.pro" +
      "to\032\027validate/validate.proto\"q\n\rGenericSe" +
      "cret\0228\n\006secret\030\001 \001(\0132 .envoy.config.core" +
      ".v3.DataSourceB\006\270\267\213\244\002\001:&\232\305\210\036!\n\037envoy.api" +
      ".v2.auth.GenericSecret\"\212\001\n\017SdsSecretConf" +
      "ig\022\025\n\004name\030\001 \001(\tB\007\372B\004r\002\020\001\0226\n\nsds_config\030" +
      "\002 \001(\0132\".envoy.config.core.v3.ConfigSourc" +
      "e:(\232\305\210\036#\n!envoy.api.v2.auth.SdsSecretCon" +
      "fig\"\260\003\n\006Secret\022\014\n\004name\030\001 \001(\t\022T\n\017tls_cert" +
      "ificate\030\002 \001(\01329.envoy.extensions.transpo" +
      "rt_sockets.tls.v3.TlsCertificateH\000\022^\n\023se" +
      "ssion_ticket_keys\030\003 \001(\0132?.envoy.extensio" +
      "ns.transport_sockets.tls.v3.TlsSessionTi" +
      "cketKeysH\000\022e\n\022validation_context\030\004 \001(\0132G" +
      ".envoy.extensions.transport_sockets.tls." +
      "v3.CertificateValidationContextH\000\022R\n\016gen" +
      "eric_secret\030\005 \001(\01328.envoy.extensions.tra" +
      "nsport_sockets.tls.v3.GenericSecretH\000:\037\232" +
      "\305\210\036\032\n\030envoy.api.v2.auth.SecretB\006\n\004typeBP" +
      "\n7io.envoyproxy.envoy.extensions.transpo" +
      "rt_sockets.tls.v3B\013SecretProtoP\001\272\200\310\321\006\002\020\002" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor(),
          io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonProto.getDescriptor(),
          udpa.annotations.Migrate.getDescriptor(),
          udpa.annotations.Sensitive.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_transport_sockets_tls_v3_GenericSecret_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_transport_sockets_tls_v3_GenericSecret_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_GenericSecret_descriptor,
        new java.lang.String[] { "Secret", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_descriptor,
        new java.lang.String[] { "Name", "SdsConfig", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_Secret_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_extensions_transport_sockets_tls_v3_Secret_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_Secret_descriptor,
        new java.lang.String[] { "Name", "TlsCertificate", "SessionTicketKeys", "ValidationContext", "GenericSecret", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Sensitive.sensitive);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.getDescriptor();
    io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonProto.getDescriptor();
    udpa.annotations.Migrate.getDescriptor();
    udpa.annotations.Sensitive.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
