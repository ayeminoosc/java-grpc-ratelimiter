// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/event_reporting/v3/event_reporting_service.proto

package io.envoyproxy.envoy.service.event_reporting.v3;

public interface StreamEventsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.event_reporting.v3.StreamEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier data that will only be sent in the first message on the stream. This is effectively
   * structured metadata and is a performance optimization.
   * </pre>
   *
   * <code>.envoy.service.event_reporting.v3.StreamEventsRequest.Identifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Identifier data that will only be sent in the first message on the stream. This is effectively
   * structured metadata and is a performance optimization.
   * </pre>
   *
   * <code>.envoy.service.event_reporting.v3.StreamEventsRequest.Identifier identifier = 1;</code>
   * @return The identifier.
   */
  io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest.Identifier getIdentifier();
  /**
   * <pre>
   * Identifier data that will only be sent in the first message on the stream. This is effectively
   * structured metadata and is a performance optimization.
   * </pre>
   *
   * <code>.envoy.service.event_reporting.v3.StreamEventsRequest.Identifier identifier = 1;</code>
   */
  io.envoyproxy.envoy.service.event_reporting.v3.StreamEventsRequest.IdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * Batch of events. When the stream is already active, it will be the events occurred
   * since the last message had been sent. If the server receives unknown event type, it should
   * silently ignore it.
   * The following events are supported:
   * * :ref:`HealthCheckEvent &lt;envoy_api_msg_data.core.v3.HealthCheckEvent&gt;`
   * * :ref:`OutlierDetectionEvent &lt;envoy_api_msg_data.cluster.v3.OutlierDetectionEvent&gt;`
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2 [(.validate.rules) = { ... }</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getEventsList();
  /**
   * <pre>
   * Batch of events. When the stream is already active, it will be the events occurred
   * since the last message had been sent. If the server receives unknown event type, it should
   * silently ignore it.
   * The following events are supported:
   * * :ref:`HealthCheckEvent &lt;envoy_api_msg_data.core.v3.HealthCheckEvent&gt;`
   * * :ref:`OutlierDetectionEvent &lt;envoy_api_msg_data.cluster.v3.OutlierDetectionEvent&gt;`
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.Any getEvents(int index);
  /**
   * <pre>
   * Batch of events. When the stream is already active, it will be the events occurred
   * since the last message had been sent. If the server receives unknown event type, it should
   * silently ignore it.
   * The following events are supported:
   * * :ref:`HealthCheckEvent &lt;envoy_api_msg_data.core.v3.HealthCheckEvent&gt;`
   * * :ref:`OutlierDetectionEvent &lt;envoy_api_msg_data.cluster.v3.OutlierDetectionEvent&gt;`
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2 [(.validate.rules) = { ... }</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * Batch of events. When the stream is already active, it will be the events occurred
   * since the last message had been sent. If the server receives unknown event type, it should
   * silently ignore it.
   * The following events are supported:
   * * :ref:`HealthCheckEvent &lt;envoy_api_msg_data.core.v3.HealthCheckEvent&gt;`
   * * :ref:`OutlierDetectionEvent &lt;envoy_api_msg_data.cluster.v3.OutlierDetectionEvent&gt;`
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * Batch of events. When the stream is already active, it will be the events occurred
   * since the last message had been sent. If the server receives unknown event type, it should
   * silently ignore it.
   * The following events are supported:
   * * :ref:`HealthCheckEvent &lt;envoy_api_msg_data.core.v3.HealthCheckEvent&gt;`
   * * :ref:`OutlierDetectionEvent &lt;envoy_api_msg_data.cluster.v3.OutlierDetectionEvent&gt;`
   * </pre>
   *
   * <code>repeated .google.protobuf.Any events = 2 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.AnyOrBuilder getEventsOrBuilder(
      int index);
}