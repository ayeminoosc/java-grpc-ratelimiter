// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/mongo_proxy/v3/mongo_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.mongo_proxy.v3;

public interface MongoProxyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.mongo_proxy.v3.MongoProxy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The human readable prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_mongo_proxy_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The human readable prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_mongo_proxy_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * The optional path to use for writing Mongo access logs. If not access log
   * path is specified no access logs will be written. Note that access log is
   * also gated :ref:`runtime &lt;config_network_filters_mongo_proxy_runtime&gt;`.
   * </pre>
   *
   * <code>string access_log = 2;</code>
   * @return The accessLog.
   */
  java.lang.String getAccessLog();
  /**
   * <pre>
   * The optional path to use for writing Mongo access logs. If not access log
   * path is specified no access logs will be written. Note that access log is
   * also gated :ref:`runtime &lt;config_network_filters_mongo_proxy_runtime&gt;`.
   * </pre>
   *
   * <code>string access_log = 2;</code>
   * @return The bytes for accessLog.
   */
  com.google.protobuf.ByteString
      getAccessLogBytes();

  /**
   * <pre>
   * Inject a fixed delay before proxying a Mongo operation. Delays are
   * applied to the following MongoDB operations: Query, Insert, GetMore,
   * and KillCursors. Once an active delay is in progress, all incoming
   * data up until the timer event fires will be a part of the delay.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultDelay delay = 3;</code>
   * @return Whether the delay field is set.
   */
  boolean hasDelay();
  /**
   * <pre>
   * Inject a fixed delay before proxying a Mongo operation. Delays are
   * applied to the following MongoDB operations: Query, Insert, GetMore,
   * and KillCursors. Once an active delay is in progress, all incoming
   * data up until the timer event fires will be a part of the delay.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultDelay delay = 3;</code>
   * @return The delay.
   */
  io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultDelay getDelay();
  /**
   * <pre>
   * Inject a fixed delay before proxying a Mongo operation. Delays are
   * applied to the following MongoDB operations: Query, Insert, GetMore,
   * and KillCursors. Once an active delay is in progress, all incoming
   * data up until the timer event fires will be a part of the delay.
   * </pre>
   *
   * <code>.envoy.extensions.filters.common.fault.v3.FaultDelay delay = 3;</code>
   */
  io.envoyproxy.envoy.extensions.filters.common.fault.v3.FaultDelayOrBuilder getDelayOrBuilder();

  /**
   * <pre>
   * Flag to specify whether :ref:`dynamic metadata
   * &lt;config_network_filters_mongo_proxy_dynamic_metadata&gt;` should be emitted. Defaults to false.
   * </pre>
   *
   * <code>bool emit_dynamic_metadata = 4;</code>
   * @return The emitDynamicMetadata.
   */
  boolean getEmitDynamicMetadata();

  /**
   * <pre>
   * List of commands to emit metrics for. Defaults to "delete", "insert", and "update".
   * Note that metrics will not be emitted for "find" commands, since those are considered
   * queries, and metrics for those are emitted under a dedicated "query" namespace.
   * </pre>
   *
   * <code>repeated string commands = 5;</code>
   * @return A list containing the commands.
   */
  java.util.List<java.lang.String>
      getCommandsList();
  /**
   * <pre>
   * List of commands to emit metrics for. Defaults to "delete", "insert", and "update".
   * Note that metrics will not be emitted for "find" commands, since those are considered
   * queries, and metrics for those are emitted under a dedicated "query" namespace.
   * </pre>
   *
   * <code>repeated string commands = 5;</code>
   * @return The count of commands.
   */
  int getCommandsCount();
  /**
   * <pre>
   * List of commands to emit metrics for. Defaults to "delete", "insert", and "update".
   * Note that metrics will not be emitted for "find" commands, since those are considered
   * queries, and metrics for those are emitted under a dedicated "query" namespace.
   * </pre>
   *
   * <code>repeated string commands = 5;</code>
   * @param index The index of the element to return.
   * @return The commands at the given index.
   */
  java.lang.String getCommands(int index);
  /**
   * <pre>
   * List of commands to emit metrics for. Defaults to "delete", "insert", and "update".
   * Note that metrics will not be emitted for "find" commands, since those are considered
   * queries, and metrics for those are emitted under a dedicated "query" namespace.
   * </pre>
   *
   * <code>repeated string commands = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the commands at the given index.
   */
  com.google.protobuf.ByteString
      getCommandsBytes(int index);
}
