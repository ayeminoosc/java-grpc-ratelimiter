// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/grpc_stats/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.grpc_stats.v3;

public interface FilterObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.grpc_stats.v3.FilterObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Count of request messages in the request stream.
   * </pre>
   *
   * <code>uint64 request_message_count = 1;</code>
   * @return The requestMessageCount.
   */
  long getRequestMessageCount();

  /**
   * <pre>
   * Count of response messages in the response stream.
   * </pre>
   *
   * <code>uint64 response_message_count = 2;</code>
   * @return The responseMessageCount.
   */
  long getResponseMessageCount();
}
