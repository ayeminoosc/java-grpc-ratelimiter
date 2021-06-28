// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/common.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_TlsParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_PrivateKeyProvider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_PrivateKeyProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsCertificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_TlsCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsSessionTicketKeys_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_TlsSessionTicketKeys_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_extensions_transport_sockets_tls_v3_CertificateValidationContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_extensions_transport_sockets_tls_v3_CertificateValidationContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6envoy/extensions/transport_sockets/tls" +
      "/v3/common.proto\022)envoy.extensions.trans" +
      "port_sockets.tls.v3\032\037envoy/config/core/v" +
      "3/base.proto\032\"envoy/type/matcher/v3/stri" +
      "ng.proto\032\031google/protobuf/any.proto\032\034goo" +
      "gle/protobuf/struct.proto\032\036google/protob" +
      "uf/wrappers.proto\032 udpa/annotations/sens" +
      "itive.proto\032\035udpa/annotations/status.pro" +
      "to\032!udpa/annotations/versioning.proto\032\027v" +
      "alidate/validate.proto\"\240\003\n\rTlsParameters" +
      "\022t\n\034tls_minimum_protocol_version\030\001 \001(\0162D" +
      ".envoy.extensions.transport_sockets.tls." +
      "v3.TlsParameters.TlsProtocolB\010\372B\005\202\001\002\020\001\022t" +
      "\n\034tls_maximum_protocol_version\030\002 \001(\0162D.e" +
      "nvoy.extensions.transport_sockets.tls.v3" +
      ".TlsParameters.TlsProtocolB\010\372B\005\202\001\002\020\001\022\025\n\r" +
      "cipher_suites\030\003 \003(\t\022\023\n\013ecdh_curves\030\004 \003(\t" +
      "\"O\n\013TlsProtocol\022\014\n\010TLS_AUTO\020\000\022\013\n\007TLSv1_0" +
      "\020\001\022\013\n\007TLSv1_1\020\002\022\013\n\007TLSv1_2\020\003\022\013\n\007TLSv1_3\020" +
      "\004:&\232\305\210\036!\n\037envoy.api.v2.auth.TlsParameter" +
      "s\"\264\001\n\022PrivateKeyProvider\022\036\n\rprovider_nam" +
      "e\030\001 \001(\tB\007\372B\004r\002\020\001\0224\n\014typed_config\030\003 \001(\0132\024" +
      ".google.protobuf.AnyB\006\270\267\213\244\002\001H\000:+\232\305\210\036&\n$e" +
      "nvoy.api.v2.auth.PrivateKeyProviderB\r\n\013c" +
      "onfig_typeJ\004\010\002\020\003R\006config\"\220\004\n\016TlsCertific" +
      "ate\022;\n\021certificate_chain\030\001 \001(\0132 .envoy.c" +
      "onfig.core.v3.DataSource\022=\n\013private_key\030" +
      "\002 \001(\0132 .envoy.config.core.v3.DataSourceB" +
      "\006\270\267\213\244\002\001\022A\n\021watched_directory\030\007 \001(\0132&.env" +
      "oy.config.core.v3.WatchedDirectory\022[\n\024pr" +
      "ivate_key_provider\030\006 \001(\0132=.envoy.extensi" +
      "ons.transport_sockets.tls.v3.PrivateKeyP" +
      "rovider\022:\n\010password\030\003 \001(\0132 .envoy.config" +
      ".core.v3.DataSourceB\006\270\267\213\244\002\001\0225\n\013ocsp_stap" +
      "le\030\004 \001(\0132 .envoy.config.core.v3.DataSour" +
      "ce\022F\n\034signed_certificate_timestamp\030\005 \003(\013" +
      "2 .envoy.config.core.v3.DataSource:\'\232\305\210\036" +
      "\"\n envoy.api.v2.auth.TlsCertificate\"\205\001\n\024" +
      "TlsSessionTicketKeys\022>\n\004keys\030\001 \003(\0132 .env" +
      "oy.config.core.v3.DataSourceB\016\372B\005\222\001\002\010\001\270\267" +
      "\213\244\002\001:-\232\305\210\036(\n&envoy.api.v2.auth.TlsSessio" +
      "nTicketKeys\"\215\006\n\034CertificateValidationCon" +
      "text\0224\n\ntrusted_ca\030\001 \001(\0132 .envoy.config." +
      "core.v3.DataSource\022A\n\021watched_directory\030" +
      "\013 \001(\0132&.envoy.config.core.v3.WatchedDire" +
      "ctory\022/\n\027verify_certificate_spki\030\003 \003(\tB\016" +
      "\372B\013\222\001\010\"\006r\004\020,(,\022/\n\027verify_certificate_has" +
      "h\030\002 \003(\tB\016\372B\013\222\001\010\"\006r\004\020@(_\022E\n\027match_subject" +
      "_alt_names\030\t \003(\0132$.envoy.type.matcher.v3" +
      ".StringMatcher\022H\n$require_signed_certifi" +
      "cate_timestamp\030\006 \001(\0132\032.google.protobuf.B" +
      "oolValue\022-\n\003crl\030\007 \001(\0132 .envoy.config.cor" +
      "e.v3.DataSource\022!\n\031allow_expired_certifi" +
      "cate\030\010 \001(\010\022\212\001\n\030trust_chain_verification\030" +
      "\n \001(\0162^.envoy.extensions.transport_socke" +
      "ts.tls.v3.CertificateValidationContext.T" +
      "rustChainVerificationB\010\372B\005\202\001\002\020\001\"F\n\026Trust" +
      "ChainVerification\022\026\n\022VERIFY_TRUST_CHAIN\020" +
      "\000\022\024\n\020ACCEPT_UNTRUSTED\020\001:5\232\305\210\0360\n.envoy.ap" +
      "i.v2.auth.CertificateValidationContextJ\004" +
      "\010\004\020\005J\004\010\005\020\006R\027verify_subject_alt_nameBP\n7i" +
      "o.envoyproxy.envoy.extensions.transport_" +
      "sockets.tls.v3B\013CommonProtoP\001\272\200\310\321\006\002\020\002b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Sensitive.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsParameters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_TlsParameters_descriptor,
        new java.lang.String[] { "TlsMinimumProtocolVersion", "TlsMaximumProtocolVersion", "CipherSuites", "EcdhCurves", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_PrivateKeyProvider_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_extensions_transport_sockets_tls_v3_PrivateKeyProvider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_PrivateKeyProvider_descriptor,
        new java.lang.String[] { "ProviderName", "TypedConfig", "ConfigType", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsCertificate_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsCertificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_TlsCertificate_descriptor,
        new java.lang.String[] { "CertificateChain", "PrivateKey", "WatchedDirectory", "PrivateKeyProvider", "Password", "OcspStaple", "SignedCertificateTimestamp", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsSessionTicketKeys_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_extensions_transport_sockets_tls_v3_TlsSessionTicketKeys_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_TlsSessionTicketKeys_descriptor,
        new java.lang.String[] { "Keys", });
    internal_static_envoy_extensions_transport_sockets_tls_v3_CertificateValidationContext_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_extensions_transport_sockets_tls_v3_CertificateValidationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_extensions_transport_sockets_tls_v3_CertificateValidationContext_descriptor,
        new java.lang.String[] { "TrustedCa", "WatchedDirectory", "VerifyCertificateSpki", "VerifyCertificateHash", "MatchSubjectAltNames", "RequireSignedCertificateTimestamp", "Crl", "AllowExpiredCertificate", "TrustChainVerification", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Sensitive.sensitive);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.StringProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Sensitive.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}