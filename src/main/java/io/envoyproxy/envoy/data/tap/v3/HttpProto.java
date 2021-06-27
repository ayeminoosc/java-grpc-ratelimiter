// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/tap/v3/http.proto

package io.envoyproxy.envoy.data.tap.v3;

public final class HttpProto {
  private HttpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_tap_v3_HttpBufferedTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_tap_v3_HttpBufferedTrace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_tap_v3_HttpBufferedTrace_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_tap_v3_HttpBufferedTrace_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_data_tap_v3_HttpStreamedTraceSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_data_tap_v3_HttpStreamedTraceSegment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034envoy/data/tap/v3/http.proto\022\021envoy.da" +
      "ta.tap.v3\032\037envoy/config/core/v3/base.pro" +
      "to\032\036envoy/data/tap/v3/common.proto\032\035udpa" +
      "/annotations/status.proto\032!udpa/annotati" +
      "ons/versioning.proto\"\230\003\n\021HttpBufferedTra" +
      "ce\022=\n\007request\030\001 \001(\0132,.envoy.data.tap.v3." +
      "HttpBufferedTrace.Message\022>\n\010response\030\002 " +
      "\001(\0132,.envoy.data.tap.v3.HttpBufferedTrac" +
      "e.Message\032\322\001\n\007Message\0222\n\007headers\030\001 \003(\0132!" +
      ".envoy.config.core.v3.HeaderValue\022%\n\004bod" +
      "y\030\002 \001(\0132\027.envoy.data.tap.v3.Body\0223\n\010trai" +
      "lers\030\003 \003(\0132!.envoy.config.core.v3.Header" +
      "Value:7\232\305\210\0362\n0envoy.data.tap.v2alpha.Htt" +
      "pBufferedTrace.Message:/\232\305\210\036*\n(envoy.dat" +
      "a.tap.v2alpha.HttpBufferedTrace\"\330\003\n\030Http" +
      "StreamedTraceSegment\022\020\n\010trace_id\030\001 \001(\004\022:" +
      "\n\017request_headers\030\002 \001(\0132\037.envoy.config.c" +
      "ore.v3.HeaderMapH\000\0225\n\022request_body_chunk" +
      "\030\003 \001(\0132\027.envoy.data.tap.v3.BodyH\000\022;\n\020req" +
      "uest_trailers\030\004 \001(\0132\037.envoy.config.core." +
      "v3.HeaderMapH\000\022;\n\020response_headers\030\005 \001(\013" +
      "2\037.envoy.config.core.v3.HeaderMapH\000\0226\n\023r" +
      "esponse_body_chunk\030\006 \001(\0132\027.envoy.data.ta" +
      "p.v3.BodyH\000\022<\n\021response_trailers\030\007 \001(\0132\037" +
      ".envoy.config.core.v3.HeaderMapH\000:6\232\305\210\0361" +
      "\n/envoy.data.tap.v2alpha.HttpStreamedTra" +
      "ceSegmentB\017\n\rmessage_pieceB6\n\037io.envoypr" +
      "oxy.envoy.data.tap.v3B\tHttpProtoP\001\272\200\310\321\006\002" +
      "\020\002b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor(),
          io.envoyproxy.envoy.data.tap.v3.CommonProto.getDescriptor(),
          udpa.annotations.Status.getDescriptor(),
          udpa.annotations.Versioning.getDescriptor(),
        });
    internal_static_envoy_data_tap_v3_HttpBufferedTrace_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_data_tap_v3_HttpBufferedTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_tap_v3_HttpBufferedTrace_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_envoy_data_tap_v3_HttpBufferedTrace_Message_descriptor =
      internal_static_envoy_data_tap_v3_HttpBufferedTrace_descriptor.getNestedTypes().get(0);
    internal_static_envoy_data_tap_v3_HttpBufferedTrace_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_tap_v3_HttpBufferedTrace_Message_descriptor,
        new java.lang.String[] { "Headers", "Body", "Trailers", });
    internal_static_envoy_data_tap_v3_HttpStreamedTraceSegment_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_data_tap_v3_HttpStreamedTraceSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_data_tap_v3_HttpStreamedTraceSegment_descriptor,
        new java.lang.String[] { "TraceId", "RequestHeaders", "RequestBodyChunk", "RequestTrailers", "ResponseHeaders", "ResponseBodyChunk", "ResponseTrailers", "MessagePiece", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(udpa.annotations.Status.fileStatus);
    registry.add(udpa.annotations.Versioning.versioning);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.config.core.v3.BaseProto.getDescriptor();
    io.envoyproxy.envoy.data.tap.v3.CommonProto.getDescriptor();
    udpa.annotations.Status.getDescriptor();
    udpa.annotations.Versioning.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}