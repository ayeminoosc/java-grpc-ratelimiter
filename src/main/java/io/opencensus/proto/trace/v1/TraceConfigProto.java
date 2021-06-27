// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/trace/v1/trace_config.proto

package io.opencensus.proto.trace.v1;

public final class TraceConfigProto {
  private TraceConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_trace_v1_TraceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_trace_v1_TraceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_trace_v1_ProbabilitySampler_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_trace_v1_ProbabilitySampler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_trace_v1_ConstantSampler_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_trace_v1_ConstantSampler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencensus_proto_trace_v1_RateLimitingSampler_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencensus_proto_trace_v1_RateLimitingSampler_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,opencensus/proto/trace/v1/trace_config" +
      ".proto\022\031opencensus.proto.trace.v1\"\207\003\n\013Tr" +
      "aceConfig\022L\n\023probability_sampler\030\001 \001(\0132-" +
      ".opencensus.proto.trace.v1.ProbabilitySa" +
      "mplerH\000\022F\n\020constant_sampler\030\002 \001(\0132*.open" +
      "census.proto.trace.v1.ConstantSamplerH\000\022" +
      "O\n\025rate_limiting_sampler\030\003 \001(\0132..opencen" +
      "sus.proto.trace.v1.RateLimitingSamplerH\000" +
      "\022 \n\030max_number_of_attributes\030\004 \001(\003\022!\n\031ma" +
      "x_number_of_annotations\030\005 \001(\003\022$\n\034max_num" +
      "ber_of_message_events\030\006 \001(\003\022\033\n\023max_numbe" +
      "r_of_links\030\007 \001(\003B\t\n\007sampler\"1\n\022Probabili" +
      "tySampler\022\033\n\023samplingProbability\030\001 \001(\001\"\246" +
      "\001\n\017ConstantSampler\022M\n\010decision\030\001 \001(\0162;.o" +
      "pencensus.proto.trace.v1.ConstantSampler" +
      ".ConstantDecision\"D\n\020ConstantDecision\022\016\n" +
      "\nALWAYS_OFF\020\000\022\r\n\tALWAYS_ON\020\001\022\021\n\rALWAYS_P" +
      "ARENT\020\002\"\"\n\023RateLimitingSampler\022\013\n\003qps\030\001 " +
      "\001(\003B\222\001\n\034io.opencensus.proto.trace.v1B\020Tr" +
      "aceConfigProtoP\001ZBgithub.com/census-inst" +
      "rumentation/opencensus-proto/gen-go/trac" +
      "e/v1\352\002\031OpenCensus.Proto.Trace.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opencensus_proto_trace_v1_TraceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencensus_proto_trace_v1_TraceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_trace_v1_TraceConfig_descriptor,
        new java.lang.String[] { "ProbabilitySampler", "ConstantSampler", "RateLimitingSampler", "MaxNumberOfAttributes", "MaxNumberOfAnnotations", "MaxNumberOfMessageEvents", "MaxNumberOfLinks", "Sampler", });
    internal_static_opencensus_proto_trace_v1_ProbabilitySampler_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencensus_proto_trace_v1_ProbabilitySampler_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_trace_v1_ProbabilitySampler_descriptor,
        new java.lang.String[] { "SamplingProbability", });
    internal_static_opencensus_proto_trace_v1_ConstantSampler_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencensus_proto_trace_v1_ConstantSampler_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_trace_v1_ConstantSampler_descriptor,
        new java.lang.String[] { "Decision", });
    internal_static_opencensus_proto_trace_v1_RateLimitingSampler_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencensus_proto_trace_v1_RateLimitingSampler_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencensus_proto_trace_v1_RateLimitingSampler_descriptor,
        new java.lang.String[] { "Qps", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
