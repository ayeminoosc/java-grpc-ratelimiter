// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: udpa/service/orca/v1/orca.proto

package com.github.udpa.udpa.service.orca.v1;

public interface OrcaLoadReportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:udpa.service.orca.v1.OrcaLoadReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Interval for generating Open RCA core metric responses.
   * </pre>
   *
   * <code>.google.protobuf.Duration report_interval = 1;</code>
   * @return Whether the reportInterval field is set.
   */
  boolean hasReportInterval();
  /**
   * <pre>
   * Interval for generating Open RCA core metric responses.
   * </pre>
   *
   * <code>.google.protobuf.Duration report_interval = 1;</code>
   * @return The reportInterval.
   */
  com.google.protobuf.Duration getReportInterval();
  /**
   * <pre>
   * Interval for generating Open RCA core metric responses.
   * </pre>
   *
   * <code>.google.protobuf.Duration report_interval = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getReportIntervalOrBuilder();

  /**
   * <pre>
   * Request costs to collect. If this is empty, all known requests costs tracked by
   * the load reporting agent will be returned. This provides an opportunity for
   * the client to selectively obtain a subset of tracked costs.
   * </pre>
   *
   * <code>repeated string request_cost_names = 2;</code>
   * @return A list containing the requestCostNames.
   */
  java.util.List<java.lang.String>
      getRequestCostNamesList();
  /**
   * <pre>
   * Request costs to collect. If this is empty, all known requests costs tracked by
   * the load reporting agent will be returned. This provides an opportunity for
   * the client to selectively obtain a subset of tracked costs.
   * </pre>
   *
   * <code>repeated string request_cost_names = 2;</code>
   * @return The count of requestCostNames.
   */
  int getRequestCostNamesCount();
  /**
   * <pre>
   * Request costs to collect. If this is empty, all known requests costs tracked by
   * the load reporting agent will be returned. This provides an opportunity for
   * the client to selectively obtain a subset of tracked costs.
   * </pre>
   *
   * <code>repeated string request_cost_names = 2;</code>
   * @param index The index of the element to return.
   * @return The requestCostNames at the given index.
   */
  java.lang.String getRequestCostNames(int index);
  /**
   * <pre>
   * Request costs to collect. If this is empty, all known requests costs tracked by
   * the load reporting agent will be returned. This provides an opportunity for
   * the client to selectively obtain a subset of tracked costs.
   * </pre>
   *
   * <code>repeated string request_cost_names = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the requestCostNames at the given index.
   */
  com.google.protobuf.ByteString
      getRequestCostNamesBytes(int index);
}
