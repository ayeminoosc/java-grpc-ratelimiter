// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/kill_request/v3/kill_request.proto

package io.envoyproxy.envoy.extensions.filters.http.kill_request.v3;

public interface KillRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.kill_request.v3.KillRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The probability that a Kill request will be triggered.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent probability = 1;</code>
   * @return Whether the probability field is set.
   */
  boolean hasProbability();
  /**
   * <pre>
   * The probability that a Kill request will be triggered.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent probability = 1;</code>
   * @return The probability.
   */
  io.envoyproxy.envoy.type.v3.FractionalPercent getProbability();
  /**
   * <pre>
   * The probability that a Kill request will be triggered.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent probability = 1;</code>
   */
  io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder getProbabilityOrBuilder();

  /**
   * <pre>
   * The name of the kill request header. If this field is not empty, it will override the :ref:`default header &lt;config_http_filters_kill_request_http_header&gt;` name. Otherwise the default header name will be used.
   * </pre>
   *
   * <code>string kill_request_header = 2;</code>
   * @return The killRequestHeader.
   */
  java.lang.String getKillRequestHeader();
  /**
   * <pre>
   * The name of the kill request header. If this field is not empty, it will override the :ref:`default header &lt;config_http_filters_kill_request_http_header&gt;` name. Otherwise the default header name will be used.
   * </pre>
   *
   * <code>string kill_request_header = 2;</code>
   * @return The bytes for killRequestHeader.
   */
  com.google.protobuf.ByteString
      getKillRequestHeaderBytes();
}
