// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/tap/v3/common.proto

package io.envoyproxy.envoy.config.tap.v3;

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
    internal_static_envoy_config_tap_v3_TapConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_TapConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_MatchPredicate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_MatchPredicate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_MatchPredicate_MatchSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_MatchPredicate_MatchSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_HttpHeadersMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_HttpHeadersMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_GenericTextMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_GenericTextMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_OutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_OutputSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_OutputSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_StreamingAdminSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_StreamingAdminSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_FilePerTapSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_FilePerTapSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_tap_v3_StreamingGrpcSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_tap_v3_StreamingGrpcSink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n envoy/config/tap/v3/common.proto\022\023envo" +
      "y.config.tap.v3\032,envoy/config/common/mat" +
      "cher/v3/matcher.proto\032\037envoy/config/core" +
      "/v3/base.proto\032\'envoy/config/core/v3/grp" +
      "c_service.proto\032,envoy/config/route/v3/r" +
      "oute_components.proto\032\036google/protobuf/w" +
      "rappers.proto\032\035udpa/annotations/status.p" +
      "roto\032!udpa/annotations/versioning.proto\032" +
      "\027validate/validate.proto\"\276\002\n\tTapConfig\022=" +
      "\n\014match_config\030\001 \001(\0132#.envoy.config.tap." +
      "v3.MatchPredicateB\002\030\001\022=\n\005match\030\004 \001(\0132..e" +
      "nvoy.config.common.matcher.v3.MatchPredi" +
      "cate\022B\n\routput_config\030\002 \001(\0132!.envoy.conf" +
      "ig.tap.v3.OutputConfigB\010\372B\005\212\001\002\020\001\022C\n\013tap_" +
      "enabled\030\003 \001(\0132..envoy.config.core.v3.Run" +
      "timeFractionalPercent:*\232\305\210\036%\n#envoy.serv" +
      "ice.tap.v2alpha.TapConfig\"\225\007\n\016MatchPredi" +
      "cate\022@\n\010or_match\030\001 \001(\0132,.envoy.config.ta" +
      "p.v3.MatchPredicate.MatchSetH\000\022A\n\tand_ma" +
      "tch\030\002 \001(\0132,.envoy.config.tap.v3.MatchPre" +
      "dicate.MatchSetH\000\0228\n\tnot_match\030\003 \001(\0132#.e" +
      "nvoy.config.tap.v3.MatchPredicateH\000\022\034\n\ta" +
      "ny_match\030\004 \001(\010B\007\372B\004j\002\010\001H\000\022K\n\032http_reques" +
      "t_headers_match\030\005 \001(\0132%.envoy.config.tap" +
      ".v3.HttpHeadersMatchH\000\022L\n\033http_request_t" +
      "railers_match\030\006 \001(\0132%.envoy.config.tap.v" +
      "3.HttpHeadersMatchH\000\022L\n\033http_response_he" +
      "aders_match\030\007 \001(\0132%.envoy.config.tap.v3." +
      "HttpHeadersMatchH\000\022M\n\034http_response_trai" +
      "lers_match\030\010 \001(\0132%.envoy.config.tap.v3.H" +
      "ttpHeadersMatchH\000\022T\n\037http_request_generi" +
      "c_body_match\030\t \001(\0132).envoy.config.tap.v3" +
      ".HttpGenericBodyMatchH\000\022U\n http_response" +
      "_generic_body_match\030\n \001(\0132).envoy.config" +
      ".tap.v3.HttpGenericBodyMatchH\000\032\202\001\n\010Match" +
      "Set\022<\n\005rules\030\001 \003(\0132#.envoy.config.tap.v3" +
      ".MatchPredicateB\010\372B\005\222\001\002\010\002:8\232\305\210\0363\n1envoy." +
      "service.tap.v2alpha.MatchPredicate.Match" +
      "Set:/\232\305\210\036*\n(envoy.service.tap.v2alpha.Ma" +
      "tchPredicateB\013\n\004rule\022\003\370B\001\"|\n\020HttpHeaders" +
      "Match\0225\n\007headers\030\001 \003(\0132$.envoy.config.ro" +
      "ute.v3.HeaderMatcher:1\232\305\210\036,\n*envoy.servi" +
      "ce.tap.v2alpha.HttpHeadersMatch\"\346\001\n\024Http" +
      "GenericBodyMatch\022\023\n\013bytes_limit\030\001 \001(\r\022V\n" +
      "\010patterns\030\002 \003(\0132:.envoy.config.tap.v3.Ht" +
      "tpGenericBodyMatch.GenericTextMatchB\010\372B\005" +
      "\222\001\002\010\001\032a\n\020GenericTextMatch\022\037\n\014string_matc" +
      "h\030\001 \001(\tB\007\372B\004r\002\020\001H\000\022\037\n\014binary_match\030\002 \001(\014" +
      "B\007\372B\004z\002\020\001H\000B\013\n\004rule\022\003\370B\001\"\206\002\n\014OutputConfi" +
      "g\022:\n\005sinks\030\001 \003(\0132\037.envoy.config.tap.v3.O" +
      "utputSinkB\n\372B\007\222\001\004\010\001\020\001\022;\n\025max_buffered_rx" +
      "_bytes\030\002 \001(\0132\034.google.protobuf.UInt32Val" +
      "ue\022;\n\025max_buffered_tx_bytes\030\003 \001(\0132\034.goog" +
      "le.protobuf.UInt32Value\022\021\n\tstreaming\030\004 \001" +
      "(\010:-\232\305\210\036(\n&envoy.service.tap.v2alpha.Out" +
      "putConfig\"\327\003\n\nOutputSink\022@\n\006format\030\001 \001(\016" +
      "2&.envoy.config.tap.v3.OutputSink.Format" +
      "B\010\372B\005\202\001\002\020\001\022B\n\017streaming_admin\030\002 \001(\0132\'.en" +
      "voy.config.tap.v3.StreamingAdminSinkH\000\022;" +
      "\n\014file_per_tap\030\003 \001(\0132#.envoy.config.tap." +
      "v3.FilePerTapSinkH\000\022@\n\016streaming_grpc\030\004 " +
      "\001(\0132&.envoy.config.tap.v3.StreamingGrpcS" +
      "inkH\000\"~\n\006Format\022\026\n\022JSON_BODY_AS_BYTES\020\000\022" +
      "\027\n\023JSON_BODY_AS_STRING\020\001\022\020\n\014PROTO_BINARY" +
      "\020\002\022!\n\035PROTO_BINARY_LENGTH_DELIMITED\020\003\022\016\n" +
      "\nPROTO_TEXT\020\004:+\232\305\210\036&\n$envoy.service.tap." +
      "v2alpha.OutputSinkB\027\n\020output_sink_type\022\003" +
      "\370B\001\"I\n\022StreamingAdminSink:3\232\305\210\036.\n,envoy." +
      "service.tap.v2alpha.StreamingAdminSink\"_" +
      "\n\016FilePerTapSink\022\034\n\013path_prefix\030\001 \001(\tB\007\372" +
      "B\004r\002\020\001:/\232\305\210\036*\n(envoy.service.tap.v2alpha" +
      ".FilePerTapSink\"\232\001\n\021StreamingGrpcSink\022\016\n" +
      "\006tap_id\030\001 \001(\t\022A\n\014grpc_service\030\002 \001(\0132!.en" +
      "voy.config.core.v3.GrpcServiceB\010\372B\005\212\001\002\020\001" +
      ":2\232\305\210\036-\n+envoy.service.tap.v2alpha.Strea" +
      "mingGrpcSinkB:\n!io.envoyproxy.envoy.conf" +
      "ig.tap.v3B\013CommonProtoP\001\272\200\310\321\006\002\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.common.matcher.v3.MatcherProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.config.core.v3.GrpcServiceProto.getDescriptor(),
          io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_tap_v3_TapConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_tap_v3_TapConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_TapConfig_descriptor,
        new java.lang.String[] { "MatchConfig", "Match", "OutputConfig", "TapEnabled", });
    internal_static_envoy_config_tap_v3_MatchPredicate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_tap_v3_MatchPredicate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_MatchPredicate_descriptor,
        new java.lang.String[] { "OrMatch", "AndMatch", "NotMatch", "AnyMatch", "HttpRequestHeadersMatch", "HttpRequestTrailersMatch", "HttpResponseHeadersMatch", "HttpResponseTrailersMatch", "HttpRequestGenericBodyMatch", "HttpResponseGenericBodyMatch", "Rule", });
    internal_static_envoy_config_tap_v3_MatchPredicate_MatchSet_descriptor =
      internal_static_envoy_config_tap_v3_MatchPredicate_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_tap_v3_MatchPredicate_MatchSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_MatchPredicate_MatchSet_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_envoy_config_tap_v3_HttpHeadersMatch_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_tap_v3_HttpHeadersMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_HttpHeadersMatch_descriptor,
        new java.lang.String[] { "Headers", });
    internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_descriptor,
        new java.lang.String[] { "BytesLimit", "Patterns", });
    internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_GenericTextMatch_descriptor =
      internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_descriptor.getNestedTypes().get(0);
    internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_GenericTextMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_HttpGenericBodyMatch_GenericTextMatch_descriptor,
        new java.lang.String[] { "StringMatch", "BinaryMatch", "Rule", });
    internal_static_envoy_config_tap_v3_OutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_config_tap_v3_OutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_OutputConfig_descriptor,
        new java.lang.String[] { "Sinks", "MaxBufferedRxBytes", "MaxBufferedTxBytes", "Streaming", });
    internal_static_envoy_config_tap_v3_OutputSink_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_config_tap_v3_OutputSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_OutputSink_descriptor,
        new java.lang.String[] { "Format", "StreamingAdmin", "FilePerTap", "StreamingGrpc", "OutputSinkType", });
    internal_static_envoy_config_tap_v3_StreamingAdminSink_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_config_tap_v3_StreamingAdminSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_StreamingAdminSink_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_tap_v3_FilePerTapSink_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_config_tap_v3_FilePerTapSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_FilePerTapSink_descriptor,
        new java.lang.String[] { "PathPrefix", });
    internal_static_envoy_config_tap_v3_StreamingGrpcSink_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_envoy_config_tap_v3_StreamingGrpcSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_tap_v3_StreamingGrpcSink_descriptor,
        new java.lang.String[] { "TapId", "GrpcService", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.common.matcher.v3.MatcherProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.config.core.v3.GrpcServiceProto.getDescriptor();
    io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
