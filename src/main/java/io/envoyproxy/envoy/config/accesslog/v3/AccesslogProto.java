// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

public final class AccesslogProto {
  private AccesslogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_AccessLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_AccessLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_AccessLogFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_AccessLogFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_ComparisonFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_ComparisonFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_StatusCodeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_StatusCodeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_DurationFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_DurationFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_TraceableFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_TraceableFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_RuntimeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_AndFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_AndFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_OrFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_OrFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_HeaderFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_HeaderFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_MetadataFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_MetadataFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_config_accesslog_v3_ExtensionFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_config_accesslog_v3_ExtensionFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)envoy/config/accesslog/v3/accesslog.pr" +
      "oto\022\031envoy.config.accesslog.v3\032\037envoy/co" +
      "nfig/core/v3/base.proto\032,envoy/config/ro" +
      "ute/v3/route_components.proto\032$envoy/typ" +
      "e/matcher/v3/metadata.proto\032\033envoy/type/" +
      "v3/percent.proto\032\031google/protobuf/any.pr" +
      "oto\032\034google/protobuf/struct.proto\032\036googl" +
      "e/protobuf/wrappers.proto\032\035udpa/annotati" +
      "ons/status.proto\032!udpa/annotations/versi" +
      "oning.proto\032\027validate/validate.proto\"\323\001\n" +
      "\tAccessLog\022\014\n\004name\030\001 \001(\t\022:\n\006filter\030\002 \001(\013" +
      "2*.envoy.config.accesslog.v3.AccessLogFi" +
      "lter\022,\n\014typed_config\030\004 \001(\0132\024.google.prot" +
      "obuf.AnyH\000:1\232\305\210\036,\n*envoy.config.filter.a" +
      "ccesslog.v2.AccessLogB\r\n\013config_typeJ\004\010\003" +
      "\020\004R\006config\"\264\007\n\017AccessLogFilter\022I\n\022status" +
      "_code_filter\030\001 \001(\0132+.envoy.config.access" +
      "log.v3.StatusCodeFilterH\000\022D\n\017duration_fi" +
      "lter\030\002 \001(\0132).envoy.config.accesslog.v3.D" +
      "urationFilterH\000\022R\n\027not_health_check_filt" +
      "er\030\003 \001(\0132/.envoy.config.accesslog.v3.Not" +
      "HealthCheckFilterH\000\022F\n\020traceable_filter\030" +
      "\004 \001(\0132*.envoy.config.accesslog.v3.Tracea" +
      "bleFilterH\000\022B\n\016runtime_filter\030\005 \001(\0132(.en" +
      "voy.config.accesslog.v3.RuntimeFilterH\000\022" +
      ":\n\nand_filter\030\006 \001(\0132$.envoy.config.acces" +
      "slog.v3.AndFilterH\000\0228\n\tor_filter\030\007 \001(\0132#" +
      ".envoy.config.accesslog.v3.OrFilterH\000\022@\n" +
      "\rheader_filter\030\010 \001(\0132\'.envoy.config.acce" +
      "sslog.v3.HeaderFilterH\000\022M\n\024response_flag" +
      "_filter\030\t \001(\0132-.envoy.config.accesslog.v" +
      "3.ResponseFlagFilterH\000\022I\n\022grpc_status_fi" +
      "lter\030\n \001(\0132+.envoy.config.accesslog.v3.G" +
      "rpcStatusFilterH\000\022F\n\020extension_filter\030\013 " +
      "\001(\0132*.envoy.config.accesslog.v3.Extensio" +
      "nFilterH\000\022D\n\017metadata_filter\030\014 \001(\0132).env" +
      "oy.config.accesslog.v3.MetadataFilterH\000:" +
      "7\232\305\210\0362\n0envoy.config.filter.accesslog.v2" +
      ".AccessLogFilterB\027\n\020filter_specifier\022\003\370B" +
      "\001\"\344\001\n\020ComparisonFilter\022D\n\002op\030\001 \001(\0162..env" +
      "oy.config.accesslog.v3.ComparisonFilter." +
      "OpB\010\372B\005\202\001\002\020\001\0222\n\005value\030\002 \001(\0132#.envoy.conf" +
      "ig.core.v3.RuntimeUInt32\"\034\n\002Op\022\006\n\002EQ\020\000\022\006" +
      "\n\002GE\020\001\022\006\n\002LE\020\002:8\232\305\210\0363\n1envoy.config.filt" +
      "er.accesslog.v2.ComparisonFilter\"\227\001\n\020Sta" +
      "tusCodeFilter\022I\n\ncomparison\030\001 \001(\0132+.envo" +
      "y.config.accesslog.v3.ComparisonFilterB\010" +
      "\372B\005\212\001\002\020\001:8\232\305\210\0363\n1envoy.config.filter.acc" +
      "esslog.v2.StatusCodeFilter\"\223\001\n\016DurationF" +
      "ilter\022I\n\ncomparison\030\001 \001(\0132+.envoy.config" +
      ".accesslog.v3.ComparisonFilterB\010\372B\005\212\001\002\020\001" +
      ":6\232\305\210\0361\n/envoy.config.filter.accesslog.v" +
      "2.DurationFilter\"T\n\024NotHealthCheckFilter" +
      ":<\232\305\210\0367\n5envoy.config.filter.accesslog.v" +
      "2.NotHealthCheckFilter\"J\n\017TraceableFilte" +
      "r:7\232\305\210\0362\n0envoy.config.filter.accesslog." +
      "v2.TraceableFilter\"\303\001\n\rRuntimeFilter\022\034\n\013" +
      "runtime_key\030\001 \001(\tB\007\372B\004r\002\020\001\0229\n\017percent_sa" +
      "mpled\030\002 \001(\0132 .envoy.type.v3.FractionalPe" +
      "rcent\022\"\n\032use_independent_randomness\030\003 \001(" +
      "\010:5\232\305\210\0360\n.envoy.config.filter.accesslog." +
      "v2.RuntimeFilter\"\205\001\n\tAndFilter\022E\n\007filter" +
      "s\030\001 \003(\0132*.envoy.config.accesslog.v3.Acce" +
      "ssLogFilterB\010\372B\005\222\001\002\010\002:1\232\305\210\036,\n*envoy.conf" +
      "ig.filter.accesslog.v2.AndFilter\"\203\001\n\010OrF" +
      "ilter\022E\n\007filters\030\002 \003(\0132*.envoy.config.ac" +
      "cesslog.v3.AccessLogFilterB\010\372B\005\222\001\002\010\002:0\232\305" +
      "\210\036+\n)envoy.config.filter.accesslog.v2.Or" +
      "Filter\"\204\001\n\014HeaderFilter\022>\n\006header\030\001 \001(\0132" +
      "$.envoy.config.route.v3.HeaderMatcherB\010\372" +
      "B\005\212\001\002\020\001:4\232\305\210\036/\n-envoy.config.filter.acce" +
      "sslog.v2.HeaderFilter\"\325\001\n\022ResponseFlagFi" +
      "lter\022\202\001\n\005flags\030\001 \003(\tBs\372Bp\222\001m\"kriR\002LHR\002UH" +
      "R\002UTR\002LRR\002URR\002UFR\002UCR\002UOR\002NRR\002DIR\002FIR\002RL" +
      "R\004UAEXR\004RLSER\002DCR\003URXR\002SIR\002IHR\003DPER\005UMSD" +
      "RR\004RFCFR\004NFCFR\002DT::\232\305\210\0365\n3envoy.config.f" +
      "ilter.accesslog.v2.ResponseFlagFilter\"\355\003" +
      "\n\020GrpcStatusFilter\022S\n\010statuses\030\001 \003(\01622.e" +
      "nvoy.config.accesslog.v3.GrpcStatusFilte" +
      "r.StatusB\r\372B\n\222\001\007\"\005\202\001\002\020\001\022\017\n\007exclude\030\002 \001(\010" +
      "\"\270\002\n\006Status\022\006\n\002OK\020\000\022\014\n\010CANCELED\020\001\022\013\n\007UNK" +
      "NOWN\020\002\022\024\n\020INVALID_ARGUMENT\020\003\022\025\n\021DEADLINE" +
      "_EXCEEDED\020\004\022\r\n\tNOT_FOUND\020\005\022\022\n\016ALREADY_EX" +
      "ISTS\020\006\022\025\n\021PERMISSION_DENIED\020\007\022\026\n\022RESOURC" +
      "E_EXHAUSTED\020\010\022\027\n\023FAILED_PRECONDITION\020\t\022\013" +
      "\n\007ABORTED\020\n\022\020\n\014OUT_OF_RANGE\020\013\022\021\n\rUNIMPLE" +
      "MENTED\020\014\022\014\n\010INTERNAL\020\r\022\017\n\013UNAVAILABLE\020\016\022" +
      "\r\n\tDATA_LOSS\020\017\022\023\n\017UNAUTHENTICATED\020\020:8\232\305\210" +
      "\0363\n1envoy.config.filter.accesslog.v2.Grp" +
      "cStatusFilter\"\275\001\n\016MetadataFilter\0227\n\007matc" +
      "her\030\001 \001(\0132&.envoy.type.matcher.v3.Metada" +
      "taMatcher\022:\n\026match_if_key_not_found\030\002 \001(" +
      "\0132\032.google.protobuf.BoolValue:6\232\305\210\0361\n/en" +
      "voy.config.filter.accesslog.v2.MetadataF" +
      "ilter\"\243\001\n\017ExtensionFilter\022\014\n\004name\030\001 \001(\t\022" +
      ",\n\014typed_config\030\003 \001(\0132\024.google.protobuf." +
      "AnyH\000:7\232\305\210\0362\n0envoy.config.filter.access" +
      "log.v2.ExtensionFilterB\r\n\013config_typeJ\004\010" +
      "\002\020\003R\006configBC\n\'io.envoyproxy.envoy.confi" +
      "g.accesslog.v3B\016AccesslogProtoP\001\272\200\310\321\006\002\020\002" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor(),
          io.envoyproxy.envoy.type.matcher.v3.MetadataProto.getDescriptor(),
          io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_envoy_config_accesslog_v3_AccessLog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_config_accesslog_v3_AccessLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_AccessLog_descriptor,
        new java.lang.String[] { "Name", "Filter", "TypedConfig", "ConfigType", });
    internal_static_envoy_config_accesslog_v3_AccessLogFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_config_accesslog_v3_AccessLogFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_AccessLogFilter_descriptor,
        new java.lang.String[] { "StatusCodeFilter", "DurationFilter", "NotHealthCheckFilter", "TraceableFilter", "RuntimeFilter", "AndFilter", "OrFilter", "HeaderFilter", "ResponseFlagFilter", "GrpcStatusFilter", "ExtensionFilter", "MetadataFilter", "FilterSpecifier", });
    internal_static_envoy_config_accesslog_v3_ComparisonFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_config_accesslog_v3_ComparisonFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_ComparisonFilter_descriptor,
        new java.lang.String[] { "Op", "Value", });
    internal_static_envoy_config_accesslog_v3_StatusCodeFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_config_accesslog_v3_StatusCodeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_StatusCodeFilter_descriptor,
        new java.lang.String[] { "Comparison", });
    internal_static_envoy_config_accesslog_v3_DurationFilter_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_config_accesslog_v3_DurationFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_DurationFilter_descriptor,
        new java.lang.String[] { "Comparison", });
    internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_NotHealthCheckFilter_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_accesslog_v3_TraceableFilter_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_config_accesslog_v3_TraceableFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_TraceableFilter_descriptor,
        new java.lang.String[] { });
    internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_config_accesslog_v3_RuntimeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor,
        new java.lang.String[] { "RuntimeKey", "PercentSampled", "UseIndependentRandomness", });
    internal_static_envoy_config_accesslog_v3_AndFilter_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_envoy_config_accesslog_v3_AndFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_AndFilter_descriptor,
        new java.lang.String[] { "Filters", });
    internal_static_envoy_config_accesslog_v3_OrFilter_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_envoy_config_accesslog_v3_OrFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_OrFilter_descriptor,
        new java.lang.String[] { "Filters", });
    internal_static_envoy_config_accesslog_v3_HeaderFilter_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_envoy_config_accesslog_v3_HeaderFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_HeaderFilter_descriptor,
        new java.lang.String[] { "Header", });
    internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_ResponseFlagFilter_descriptor,
        new java.lang.String[] { "Flags", });
    internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_GrpcStatusFilter_descriptor,
        new java.lang.String[] { "Statuses", "Exclude", });
    internal_static_envoy_config_accesslog_v3_MetadataFilter_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_envoy_config_accesslog_v3_MetadataFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_MetadataFilter_descriptor,
        new java.lang.String[] { "Matcher", "MatchIfKeyNotFound", });
    internal_static_envoy_config_accesslog_v3_ExtensionFilter_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_envoy_config_accesslog_v3_ExtensionFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_config_accesslog_v3_ExtensionFilter_descriptor,
        new java.lang.String[] { "Name", "TypedConfig", "ConfigType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    registry.add(io.envoyproxy.pgv.validate.Validate.required);
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.getDescriptor();
    io.envoyproxy.envoy.type.matcher.v3.MetadataProto.getDescriptor();
    io.envoyproxy.envoy.type.v3.PercentProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
