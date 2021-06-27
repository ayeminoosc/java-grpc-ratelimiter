// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/tap/v3/tap.proto

package io.envoyproxy.envoy.service.tap.v3;

public interface StreamTapsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.tap.v3.StreamTapsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier data effectively is a structured metadata. As a performance optimization this will
   * only be sent in the first message on the stream.
   * </pre>
   *
   * <code>.envoy.service.tap.v3.StreamTapsRequest.Identifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Identifier data effectively is a structured metadata. As a performance optimization this will
   * only be sent in the first message on the stream.
   * </pre>
   *
   * <code>.envoy.service.tap.v3.StreamTapsRequest.Identifier identifier = 1;</code>
   * @return The identifier.
   */
  io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest.Identifier getIdentifier();
  /**
   * <pre>
   * Identifier data effectively is a structured metadata. As a performance optimization this will
   * only be sent in the first message on the stream.
   * </pre>
   *
   * <code>.envoy.service.tap.v3.StreamTapsRequest.Identifier identifier = 1;</code>
   */
  io.envoyproxy.envoy.service.tap.v3.StreamTapsRequest.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * The trace id. this can be used to merge together a streaming trace. Note that the trace_id
   * is not guaranteed to be spatially or temporally unique.
   * </pre>
   *
   * <code>uint64 trace_id = 2;</code>
   * @return The traceId.
   */
  long getTraceId();

  /**
   * <pre>
   * The trace data.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.TraceWrapper trace = 3;</code>
   * @return Whether the trace field is set.
   */
  boolean hasTrace();
  /**
   * <pre>
   * The trace data.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.TraceWrapper trace = 3;</code>
   * @return The trace.
   */
  io.envoyproxy.envoy.data.tap.v3.TraceWrapper getTrace();
  /**
   * <pre>
   * The trace data.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.TraceWrapper trace = 3;</code>
   */
  io.envoyproxy.envoy.data.tap.v3.TraceWrapperOrBuilder getTraceOrBuilder();
}
