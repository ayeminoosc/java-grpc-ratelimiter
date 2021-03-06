// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/thrift_proxy/v3/thrift_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3;

/**
 * <pre>
 * Thrift transport types supported by Envoy.
 * </pre>
 *
 * Protobuf enum {@code envoy.extensions.filters.network.thrift_proxy.v3.TransportType}
 */
public enum TransportType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * For downstream connections, the Thrift proxy will attempt to determine which transport to use.
   * For upstream connections, the Thrift proxy will use same transport as the downstream
   * connection.
   * </pre>
   *
   * <code>AUTO_TRANSPORT = 0;</code>
   */
  AUTO_TRANSPORT(0),
  /**
   * <pre>
   * The Thrift proxy will use the Thrift framed transport.
   * </pre>
   *
   * <code>FRAMED = 1;</code>
   */
  FRAMED(1),
  /**
   * <pre>
   * The Thrift proxy will use the Thrift unframed transport.
   * </pre>
   *
   * <code>UNFRAMED = 2;</code>
   */
  UNFRAMED(2),
  /**
   * <pre>
   * The Thrift proxy will assume the client is using the Thrift header transport.
   * </pre>
   *
   * <code>HEADER = 3;</code>
   */
  HEADER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * For downstream connections, the Thrift proxy will attempt to determine which transport to use.
   * For upstream connections, the Thrift proxy will use same transport as the downstream
   * connection.
   * </pre>
   *
   * <code>AUTO_TRANSPORT = 0;</code>
   */
  public static final int AUTO_TRANSPORT_VALUE = 0;
  /**
   * <pre>
   * The Thrift proxy will use the Thrift framed transport.
   * </pre>
   *
   * <code>FRAMED = 1;</code>
   */
  public static final int FRAMED_VALUE = 1;
  /**
   * <pre>
   * The Thrift proxy will use the Thrift unframed transport.
   * </pre>
   *
   * <code>UNFRAMED = 2;</code>
   */
  public static final int UNFRAMED_VALUE = 2;
  /**
   * <pre>
   * The Thrift proxy will assume the client is using the Thrift header transport.
   * </pre>
   *
   * <code>HEADER = 3;</code>
   */
  public static final int HEADER_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TransportType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransportType forNumber(int value) {
    switch (value) {
      case 0: return AUTO_TRANSPORT;
      case 1: return FRAMED;
      case 2: return UNFRAMED;
      case 3: return HEADER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransportType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransportType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransportType>() {
          public TransportType findValueByNumber(int number) {
            return TransportType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransportType[] VALUES = values();

  public static TransportType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransportType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:envoy.extensions.filters.network.thrift_proxy.v3.TransportType)
}

