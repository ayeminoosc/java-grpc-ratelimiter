// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/protocol.proto

package io.envoyproxy.envoy.config.core.v3;

public final class ProtocolProto {
  private ProtocolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_TcpProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_TcpProtocolOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_HttpProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_HttpProtocolOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Http1ProtocolOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_ProperCaseWords_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_ProperCaseWords_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_KeepaliveSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_KeepaliveSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Http2ProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Http2ProtocolOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_Http2ProtocolOptions_SettingsParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_Http2ProtocolOptions_SettingsParameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_core_v3_GrpcProtocolOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_core_v3_GrpcProtocolOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#envoy/config/core/v3/protocol.proto\022\024e" +
      "nvoy.config.core.v3\032\033envoy/type/v3/perce" +
      "nt.proto\032\036google/protobuf/duration.proto" +
      "\032\036google/protobuf/wrappers.proto\032\035udpa/a" +
      "nnotations/status.proto\032!udpa/annotation" +
      "s/versioning.proto\032\027validate/validate.pr" +
      "oto\"A\n\022TcpProtocolOptions:+\232\305\210\036&\n$envoy." +
      "api.v2.core.TcpProtocolOptions\"\202\001\n\033Upstr" +
      "eamHttpProtocolOptions\022\020\n\010auto_sni\030\001 \001(\010" +
      "\022\033\n\023auto_san_validation\030\002 \001(\010:4\232\305\210\036/\n-en" +
      "voy.api.v2.core.UpstreamHttpProtocolOpti" +
      "ons\"\353\003\n\023HttpProtocolOptions\022/\n\014idle_time" +
      "out\030\001 \001(\0132\031.google.protobuf.Duration\022:\n\027" +
      "max_connection_duration\030\003 \001(\0132\031.google.p" +
      "rotobuf.Duration\022@\n\021max_headers_count\030\002 " +
      "\001(\0132\034.google.protobuf.UInt32ValueB\007\372B\004*\002" +
      "(\001\0226\n\023max_stream_duration\030\004 \001(\0132\031.google" +
      ".protobuf.Duration\022o\n\037headers_with_under" +
      "scores_action\030\005 \001(\0162F.envoy.config.core." +
      "v3.HttpProtocolOptions.HeadersWithUnders" +
      "coresAction\"N\n\034HeadersWithUnderscoresAct" +
      "ion\022\t\n\005ALLOW\020\000\022\022\n\016REJECT_REQUEST\020\001\022\017\n\013DR" +
      "OP_HEADER\020\002:,\232\305\210\036\'\n%envoy.api.v2.core.Ht" +
      "tpProtocolOptions\"\314\005\n\024Http1ProtocolOptio" +
      "ns\0226\n\022allow_absolute_url\030\001 \001(\0132\032.google." +
      "protobuf.BoolValue\022\026\n\016accept_http_10\030\002 \001" +
      "(\010\022 \n\030default_host_for_http_10\030\003 \001(\t\022U\n\021" +
      "header_key_format\030\004 \001(\0132:.envoy.config.c" +
      "ore.v3.Http1ProtocolOptions.HeaderKeyFor" +
      "mat\022\027\n\017enable_trailers\030\005 \001(\010\022\034\n\024allow_ch" +
      "unked_length\030\006 \001(\010\022Q\n-override_stream_er" +
      "ror_on_invalid_http_message\030\007 \001(\0132\032.goog" +
      "le.protobuf.BoolValue\032\261\002\n\017HeaderKeyForma" +
      "t\022g\n\021proper_case_words\030\001 \001(\0132J.envoy.con" +
      "fig.core.v3.Http1ProtocolOptions.HeaderK" +
      "eyFormat.ProperCaseWordsH\000\032`\n\017ProperCase" +
      "Words:M\232\305\210\036H\nFenvoy.api.v2.core.Http1Pro" +
      "tocolOptions.HeaderKeyFormat.ProperCaseW" +
      "ords:=\232\305\210\0368\n6envoy.api.v2.core.Http1Prot" +
      "ocolOptions.HeaderKeyFormatB\024\n\rheader_fo" +
      "rmat\022\003\370B\001:-\232\305\210\036(\n&envoy.api.v2.core.Http" +
      "1ProtocolOptions\"\275\001\n\021KeepaliveSettings\022;" +
      "\n\010interval\030\001 \001(\0132\031.google.protobuf.Durat" +
      "ionB\016\372B\013\252\001\010\010\0012\004\020\300\204=\022:\n\007timeout\030\002 \001(\0132\031.g" +
      "oogle.protobuf.DurationB\016\372B\013\252\001\010\010\0012\004\020\300\204=\022" +
      "/\n\017interval_jitter\030\003 \001(\0132\026.envoy.type.v3" +
      ".Percent\"\304\n\n\024Http2ProtocolOptions\0226\n\020hpa" +
      "ck_table_size\030\001 \001(\0132\034.google.protobuf.UI" +
      "nt32Value\022K\n\026max_concurrent_streams\030\002 \001(" +
      "\0132\034.google.protobuf.UInt32ValueB\r\372B\n*\010\030\377" +
      "\377\377\377\007(\001\022Q\n\032initial_stream_window_size\030\003 \001" +
      "(\0132\034.google.protobuf.UInt32ValueB\017\372B\014*\n\030" +
      "\377\377\377\377\007(\377\377\003\022U\n\036initial_connection_window_s" +
      "ize\030\004 \001(\0132\034.google.protobuf.UInt32ValueB" +
      "\017\372B\014*\n\030\377\377\377\377\007(\377\377\003\022\025\n\rallow_connect\030\005 \001(\010\022" +
      "\026\n\016allow_metadata\030\006 \001(\010\022B\n\023max_outbound_" +
      "frames\030\007 \001(\0132\034.google.protobuf.UInt32Val" +
      "ueB\007\372B\004*\002(\001\022J\n\033max_outbound_control_fram" +
      "es\030\010 \001(\0132\034.google.protobuf.UInt32ValueB\007" +
      "\372B\004*\002(\001\022W\n1max_consecutive_inbound_frame" +
      "s_with_empty_payload\030\t \001(\0132\034.google.prot" +
      "obuf.UInt32Value\022L\n&max_inbound_priority" +
      "_frames_per_stream\030\n \001(\0132\034.google.protob" +
      "uf.UInt32Value\022c\n4max_inbound_window_upd" +
      "ate_frames_per_data_frame_sent\030\013 \001(\0132\034.g" +
      "oogle.protobuf.UInt32ValueB\007\372B\004*\002(\001\0222\n&s" +
      "tream_error_on_invalid_http_messaging\030\014 " +
      "\001(\010B\002\030\001\022Q\n-override_stream_error_on_inva" +
      "lid_http_message\030\016 \001(\0132\032.google.protobuf" +
      ".BoolValue\022`\n\032custom_settings_parameters" +
      "\030\r \003(\0132<.envoy.config.core.v3.Http2Proto" +
      "colOptions.SettingsParameter\022E\n\024connecti" +
      "on_keepalive\030\017 \001(\0132\'.envoy.config.core.v" +
      "3.KeepaliveSettings\032\322\001\n\021SettingsParamete" +
      "r\022E\n\nidentifier\030\001 \001(\0132\034.google.protobuf." +
      "UInt32ValueB\023\372B\010*\006\030\377\377\003(\000\372B\005\212\001\002\020\001\0225\n\005valu" +
      "e\030\002 \001(\0132\034.google.protobuf.UInt32ValueB\010\372" +
      "B\005\212\001\002\020\001:?\232\305\210\036:\n8envoy.api.v2.core.Http2P" +
      "rotocolOptions.SettingsParameter:-\232\305\210\036(\n" +
      "&envoy.api.v2.core.Http2ProtocolOptions\"" +
      "\217\001\n\023GrpcProtocolOptions\022J\n\026http2_protoco" +
      "l_options\030\001 \001(\0132*.envoy.config.core.v3.H" +
      "ttp2ProtocolOptions:,\232\305\210\036\'\n%envoy.api.v2" +
      ".core.GrpcProtocolOptionsB=\n\"io.envoypro" +
      "xy.envoy.config.core.v3B\rProtocolProtoP\001" +
      "\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_core_v3_TcpProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_core_v3_TcpProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_TcpProtocolOptions_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_descriptor,
        new java.lang.String[] { "AutoSni", "AutoSanValidation", });
    internal_static_envoy_config_core_v3_HttpProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_core_v3_HttpProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_HttpProtocolOptions_descriptor,
        new java.lang.String[] { "IdleTimeout", "MaxConnectionDuration", "MaxHeadersCount", "MaxStreamDuration", "HeadersWithUnderscoresAction", });
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Http1ProtocolOptions_descriptor,
        new java.lang.String[] { "AllowAbsoluteUrl", "AcceptHttp10", "DefaultHostForHttp10", "HeaderKeyFormat", "EnableTrailers", "AllowChunkedLength", "OverrideStreamErrorOnInvalidHttpMessage", });
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_descriptor =
      internal_static_envoy_config_core_v3_Http1ProtocolOptions_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_descriptor,
        new java.lang.String[] { "ProperCaseWords", "HeaderFormat", });
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_ProperCaseWords_descriptor =
      internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_ProperCaseWords_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Http1ProtocolOptions_HeaderKeyFormat_ProperCaseWords_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_core_v3_KeepaliveSettings_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_config_core_v3_KeepaliveSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_KeepaliveSettings_descriptor,
        new java.lang.String[] { "Interval", "Timeout", "IntervalJitter", });
    internal_static_envoy_config_core_v3_Http2ProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_config_core_v3_Http2ProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Http2ProtocolOptions_descriptor,
        new java.lang.String[] { "HpackTableSize", "MaxConcurrentStreams", "InitialStreamWindowSize", "InitialConnectionWindowSize", "AllowConnect", "AllowMetadata", "MaxOutboundFrames", "MaxOutboundControlFrames", "MaxConsecutiveInboundFramesWithEmptyPayload", "MaxInboundPriorityFramesPerStream", "MaxInboundWindowUpdateFramesPerDataFrameSent", "StreamErrorOnInvalidHttpMessaging", "OverrideStreamErrorOnInvalidHttpMessage", "CustomSettingsParameters", "ConnectionKeepalive", });
    internal_static_envoy_config_core_v3_Http2ProtocolOptions_SettingsParameter_descriptor =
      internal_static_envoy_config_core_v3_Http2ProtocolOptions_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_core_v3_Http2ProtocolOptions_SettingsParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_Http2ProtocolOptions_SettingsParameter_descriptor,
        new java.lang.String[] { "Identifier", "Value", });
    internal_static_envoy_config_core_v3_GrpcProtocolOptions_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_config_core_v3_GrpcProtocolOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_core_v3_GrpcProtocolOptions_descriptor,
        new java.lang.String[] { "Http2ProtocolOptions", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
