// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/trace/v3/trace_service.proto

package io.envoyproxy.envoy.service.trace.v3;

public interface StreamTracesMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.trace.v3.StreamTracesMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier data effectively is a structured metadata.
   * As a performance optimization this will only be sent in the first message
   * on the stream.
   * </pre>
   *
   * <code>.envoy.service.trace.v3.StreamTracesMessage.Identifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Identifier data effectively is a structured metadata.
   * As a performance optimization this will only be sent in the first message
   * on the stream.
   * </pre>
   *
   * <code>.envoy.service.trace.v3.StreamTracesMessage.Identifier identifier = 1;</code>
   * @return The identifier.
   */
  io.envoyproxy.envoy.service.trace.v3.StreamTracesMessage.Identifier getIdentifier();
  /**
   * <pre>
   * Identifier data effectively is a structured metadata.
   * As a performance optimization this will only be sent in the first message
   * on the stream.
   * </pre>
   *
   * <code>.envoy.service.trace.v3.StreamTracesMessage.Identifier identifier = 1;</code>
   */
  io.envoyproxy.envoy.service.trace.v3.StreamTracesMessage.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * A list of Span entries
   * </pre>
   *
   * <code>repeated .opencensus.proto.trace.v1.Span spans = 2;</code>
   */
  java.util.List<io.opencensus.proto.trace.v1.Span> 
      getSpansList();
  /**
   * <pre>
   * A list of Span entries
   * </pre>
   *
   * <code>repeated .opencensus.proto.trace.v1.Span spans = 2;</code>
   */
  io.opencensus.proto.trace.v1.Span getSpans(int index);
  /**
   * <pre>
   * A list of Span entries
   * </pre>
   *
   * <code>repeated .opencensus.proto.trace.v1.Span spans = 2;</code>
   */
  int getSpansCount();
  /**
   * <pre>
   * A list of Span entries
   * </pre>
   *
   * <code>repeated .opencensus.proto.trace.v1.Span spans = 2;</code>
   */
  java.util.List<? extends io.opencensus.proto.trace.v1.SpanOrBuilder> 
      getSpansOrBuilderList();
  /**
   * <pre>
   * A list of Span entries
   * </pre>
   *
   * <code>repeated .opencensus.proto.trace.v1.Span spans = 2;</code>
   */
  io.opencensus.proto.trace.v1.SpanOrBuilder getSpansOrBuilder(
      int index);
}
