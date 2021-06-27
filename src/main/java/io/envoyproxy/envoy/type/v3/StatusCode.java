// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/http_status.proto

package io.envoyproxy.envoy.type.v3;

/**
 * <pre>
 * HTTP response codes supported in Envoy.
 * For more details: https://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml
 * </pre>
 *
 * Protobuf enum {@code envoy.type.v3.StatusCode}
 */
public enum StatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Empty - This code not part of the HTTP status code specification, but it is needed for proto
   * `enum` type.
   * </pre>
   *
   * <code>Empty = 0;</code>
   */
  Empty(0),
  /**
   * <code>Continue = 100;</code>
   */
  Continue(100),
  /**
   * <code>OK = 200;</code>
   */
  OK(200),
  /**
   * <code>Created = 201;</code>
   */
  Created(201),
  /**
   * <code>Accepted = 202;</code>
   */
  Accepted(202),
  /**
   * <code>NonAuthoritativeInformation = 203;</code>
   */
  NonAuthoritativeInformation(203),
  /**
   * <code>NoContent = 204;</code>
   */
  NoContent(204),
  /**
   * <code>ResetContent = 205;</code>
   */
  ResetContent(205),
  /**
   * <code>PartialContent = 206;</code>
   */
  PartialContent(206),
  /**
   * <code>MultiStatus = 207;</code>
   */
  MultiStatus(207),
  /**
   * <code>AlreadyReported = 208;</code>
   */
  AlreadyReported(208),
  /**
   * <code>IMUsed = 226;</code>
   */
  IMUsed(226),
  /**
   * <code>MultipleChoices = 300;</code>
   */
  MultipleChoices(300),
  /**
   * <code>MovedPermanently = 301;</code>
   */
  MovedPermanently(301),
  /**
   * <code>Found = 302;</code>
   */
  Found(302),
  /**
   * <code>SeeOther = 303;</code>
   */
  SeeOther(303),
  /**
   * <code>NotModified = 304;</code>
   */
  NotModified(304),
  /**
   * <code>UseProxy = 305;</code>
   */
  UseProxy(305),
  /**
   * <code>TemporaryRedirect = 307;</code>
   */
  TemporaryRedirect(307),
  /**
   * <code>PermanentRedirect = 308;</code>
   */
  PermanentRedirect(308),
  /**
   * <code>BadRequest = 400;</code>
   */
  BadRequest(400),
  /**
   * <code>Unauthorized = 401;</code>
   */
  Unauthorized(401),
  /**
   * <code>PaymentRequired = 402;</code>
   */
  PaymentRequired(402),
  /**
   * <code>Forbidden = 403;</code>
   */
  Forbidden(403),
  /**
   * <code>NotFound = 404;</code>
   */
  NotFound(404),
  /**
   * <code>MethodNotAllowed = 405;</code>
   */
  MethodNotAllowed(405),
  /**
   * <code>NotAcceptable = 406;</code>
   */
  NotAcceptable(406),
  /**
   * <code>ProxyAuthenticationRequired = 407;</code>
   */
  ProxyAuthenticationRequired(407),
  /**
   * <code>RequestTimeout = 408;</code>
   */
  RequestTimeout(408),
  /**
   * <code>Conflict = 409;</code>
   */
  Conflict(409),
  /**
   * <code>Gone = 410;</code>
   */
  Gone(410),
  /**
   * <code>LengthRequired = 411;</code>
   */
  LengthRequired(411),
  /**
   * <code>PreconditionFailed = 412;</code>
   */
  PreconditionFailed(412),
  /**
   * <code>PayloadTooLarge = 413;</code>
   */
  PayloadTooLarge(413),
  /**
   * <code>URITooLong = 414;</code>
   */
  URITooLong(414),
  /**
   * <code>UnsupportedMediaType = 415;</code>
   */
  UnsupportedMediaType(415),
  /**
   * <code>RangeNotSatisfiable = 416;</code>
   */
  RangeNotSatisfiable(416),
  /**
   * <code>ExpectationFailed = 417;</code>
   */
  ExpectationFailed(417),
  /**
   * <code>MisdirectedRequest = 421;</code>
   */
  MisdirectedRequest(421),
  /**
   * <code>UnprocessableEntity = 422;</code>
   */
  UnprocessableEntity(422),
  /**
   * <code>Locked = 423;</code>
   */
  Locked(423),
  /**
   * <code>FailedDependency = 424;</code>
   */
  FailedDependency(424),
  /**
   * <code>UpgradeRequired = 426;</code>
   */
  UpgradeRequired(426),
  /**
   * <code>PreconditionRequired = 428;</code>
   */
  PreconditionRequired(428),
  /**
   * <code>TooManyRequests = 429;</code>
   */
  TooManyRequests(429),
  /**
   * <code>RequestHeaderFieldsTooLarge = 431;</code>
   */
  RequestHeaderFieldsTooLarge(431),
  /**
   * <code>InternalServerError = 500;</code>
   */
  InternalServerError(500),
  /**
   * <code>NotImplemented = 501;</code>
   */
  NotImplemented(501),
  /**
   * <code>BadGateway = 502;</code>
   */
  BadGateway(502),
  /**
   * <code>ServiceUnavailable = 503;</code>
   */
  ServiceUnavailable(503),
  /**
   * <code>GatewayTimeout = 504;</code>
   */
  GatewayTimeout(504),
  /**
   * <code>HTTPVersionNotSupported = 505;</code>
   */
  HTTPVersionNotSupported(505),
  /**
   * <code>VariantAlsoNegotiates = 506;</code>
   */
  VariantAlsoNegotiates(506),
  /**
   * <code>InsufficientStorage = 507;</code>
   */
  InsufficientStorage(507),
  /**
   * <code>LoopDetected = 508;</code>
   */
  LoopDetected(508),
  /**
   * <code>NotExtended = 510;</code>
   */
  NotExtended(510),
  /**
   * <code>NetworkAuthenticationRequired = 511;</code>
   */
  NetworkAuthenticationRequired(511),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Empty - This code not part of the HTTP status code specification, but it is needed for proto
   * `enum` type.
   * </pre>
   *
   * <code>Empty = 0;</code>
   */
  public static final int Empty_VALUE = 0;
  /**
   * <code>Continue = 100;</code>
   */
  public static final int Continue_VALUE = 100;
  /**
   * <code>OK = 200;</code>
   */
  public static final int OK_VALUE = 200;
  /**
   * <code>Created = 201;</code>
   */
  public static final int Created_VALUE = 201;
  /**
   * <code>Accepted = 202;</code>
   */
  public static final int Accepted_VALUE = 202;
  /**
   * <code>NonAuthoritativeInformation = 203;</code>
   */
  public static final int NonAuthoritativeInformation_VALUE = 203;
  /**
   * <code>NoContent = 204;</code>
   */
  public static final int NoContent_VALUE = 204;
  /**
   * <code>ResetContent = 205;</code>
   */
  public static final int ResetContent_VALUE = 205;
  /**
   * <code>PartialContent = 206;</code>
   */
  public static final int PartialContent_VALUE = 206;
  /**
   * <code>MultiStatus = 207;</code>
   */
  public static final int MultiStatus_VALUE = 207;
  /**
   * <code>AlreadyReported = 208;</code>
   */
  public static final int AlreadyReported_VALUE = 208;
  /**
   * <code>IMUsed = 226;</code>
   */
  public static final int IMUsed_VALUE = 226;
  /**
   * <code>MultipleChoices = 300;</code>
   */
  public static final int MultipleChoices_VALUE = 300;
  /**
   * <code>MovedPermanently = 301;</code>
   */
  public static final int MovedPermanently_VALUE = 301;
  /**
   * <code>Found = 302;</code>
   */
  public static final int Found_VALUE = 302;
  /**
   * <code>SeeOther = 303;</code>
   */
  public static final int SeeOther_VALUE = 303;
  /**
   * <code>NotModified = 304;</code>
   */
  public static final int NotModified_VALUE = 304;
  /**
   * <code>UseProxy = 305;</code>
   */
  public static final int UseProxy_VALUE = 305;
  /**
   * <code>TemporaryRedirect = 307;</code>
   */
  public static final int TemporaryRedirect_VALUE = 307;
  /**
   * <code>PermanentRedirect = 308;</code>
   */
  public static final int PermanentRedirect_VALUE = 308;
  /**
   * <code>BadRequest = 400;</code>
   */
  public static final int BadRequest_VALUE = 400;
  /**
   * <code>Unauthorized = 401;</code>
   */
  public static final int Unauthorized_VALUE = 401;
  /**
   * <code>PaymentRequired = 402;</code>
   */
  public static final int PaymentRequired_VALUE = 402;
  /**
   * <code>Forbidden = 403;</code>
   */
  public static final int Forbidden_VALUE = 403;
  /**
   * <code>NotFound = 404;</code>
   */
  public static final int NotFound_VALUE = 404;
  /**
   * <code>MethodNotAllowed = 405;</code>
   */
  public static final int MethodNotAllowed_VALUE = 405;
  /**
   * <code>NotAcceptable = 406;</code>
   */
  public static final int NotAcceptable_VALUE = 406;
  /**
   * <code>ProxyAuthenticationRequired = 407;</code>
   */
  public static final int ProxyAuthenticationRequired_VALUE = 407;
  /**
   * <code>RequestTimeout = 408;</code>
   */
  public static final int RequestTimeout_VALUE = 408;
  /**
   * <code>Conflict = 409;</code>
   */
  public static final int Conflict_VALUE = 409;
  /**
   * <code>Gone = 410;</code>
   */
  public static final int Gone_VALUE = 410;
  /**
   * <code>LengthRequired = 411;</code>
   */
  public static final int LengthRequired_VALUE = 411;
  /**
   * <code>PreconditionFailed = 412;</code>
   */
  public static final int PreconditionFailed_VALUE = 412;
  /**
   * <code>PayloadTooLarge = 413;</code>
   */
  public static final int PayloadTooLarge_VALUE = 413;
  /**
   * <code>URITooLong = 414;</code>
   */
  public static final int URITooLong_VALUE = 414;
  /**
   * <code>UnsupportedMediaType = 415;</code>
   */
  public static final int UnsupportedMediaType_VALUE = 415;
  /**
   * <code>RangeNotSatisfiable = 416;</code>
   */
  public static final int RangeNotSatisfiable_VALUE = 416;
  /**
   * <code>ExpectationFailed = 417;</code>
   */
  public static final int ExpectationFailed_VALUE = 417;
  /**
   * <code>MisdirectedRequest = 421;</code>
   */
  public static final int MisdirectedRequest_VALUE = 421;
  /**
   * <code>UnprocessableEntity = 422;</code>
   */
  public static final int UnprocessableEntity_VALUE = 422;
  /**
   * <code>Locked = 423;</code>
   */
  public static final int Locked_VALUE = 423;
  /**
   * <code>FailedDependency = 424;</code>
   */
  public static final int FailedDependency_VALUE = 424;
  /**
   * <code>UpgradeRequired = 426;</code>
   */
  public static final int UpgradeRequired_VALUE = 426;
  /**
   * <code>PreconditionRequired = 428;</code>
   */
  public static final int PreconditionRequired_VALUE = 428;
  /**
   * <code>TooManyRequests = 429;</code>
   */
  public static final int TooManyRequests_VALUE = 429;
  /**
   * <code>RequestHeaderFieldsTooLarge = 431;</code>
   */
  public static final int RequestHeaderFieldsTooLarge_VALUE = 431;
  /**
   * <code>InternalServerError = 500;</code>
   */
  public static final int InternalServerError_VALUE = 500;
  /**
   * <code>NotImplemented = 501;</code>
   */
  public static final int NotImplemented_VALUE = 501;
  /**
   * <code>BadGateway = 502;</code>
   */
  public static final int BadGateway_VALUE = 502;
  /**
   * <code>ServiceUnavailable = 503;</code>
   */
  public static final int ServiceUnavailable_VALUE = 503;
  /**
   * <code>GatewayTimeout = 504;</code>
   */
  public static final int GatewayTimeout_VALUE = 504;
  /**
   * <code>HTTPVersionNotSupported = 505;</code>
   */
  public static final int HTTPVersionNotSupported_VALUE = 505;
  /**
   * <code>VariantAlsoNegotiates = 506;</code>
   */
  public static final int VariantAlsoNegotiates_VALUE = 506;
  /**
   * <code>InsufficientStorage = 507;</code>
   */
  public static final int InsufficientStorage_VALUE = 507;
  /**
   * <code>LoopDetected = 508;</code>
   */
  public static final int LoopDetected_VALUE = 508;
  /**
   * <code>NotExtended = 510;</code>
   */
  public static final int NotExtended_VALUE = 510;
  /**
   * <code>NetworkAuthenticationRequired = 511;</code>
   */
  public static final int NetworkAuthenticationRequired_VALUE = 511;


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
  public static StatusCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StatusCode forNumber(int value) {
    switch (value) {
      case 0: return Empty;
      case 100: return Continue;
      case 200: return OK;
      case 201: return Created;
      case 202: return Accepted;
      case 203: return NonAuthoritativeInformation;
      case 204: return NoContent;
      case 205: return ResetContent;
      case 206: return PartialContent;
      case 207: return MultiStatus;
      case 208: return AlreadyReported;
      case 226: return IMUsed;
      case 300: return MultipleChoices;
      case 301: return MovedPermanently;
      case 302: return Found;
      case 303: return SeeOther;
      case 304: return NotModified;
      case 305: return UseProxy;
      case 307: return TemporaryRedirect;
      case 308: return PermanentRedirect;
      case 400: return BadRequest;
      case 401: return Unauthorized;
      case 402: return PaymentRequired;
      case 403: return Forbidden;
      case 404: return NotFound;
      case 405: return MethodNotAllowed;
      case 406: return NotAcceptable;
      case 407: return ProxyAuthenticationRequired;
      case 408: return RequestTimeout;
      case 409: return Conflict;
      case 410: return Gone;
      case 411: return LengthRequired;
      case 412: return PreconditionFailed;
      case 413: return PayloadTooLarge;
      case 414: return URITooLong;
      case 415: return UnsupportedMediaType;
      case 416: return RangeNotSatisfiable;
      case 417: return ExpectationFailed;
      case 421: return MisdirectedRequest;
      case 422: return UnprocessableEntity;
      case 423: return Locked;
      case 424: return FailedDependency;
      case 426: return UpgradeRequired;
      case 428: return PreconditionRequired;
      case 429: return TooManyRequests;
      case 431: return RequestHeaderFieldsTooLarge;
      case 500: return InternalServerError;
      case 501: return NotImplemented;
      case 502: return BadGateway;
      case 503: return ServiceUnavailable;
      case 504: return GatewayTimeout;
      case 505: return HTTPVersionNotSupported;
      case 506: return VariantAlsoNegotiates;
      case 507: return InsufficientStorage;
      case 508: return LoopDetected;
      case 510: return NotExtended;
      case 511: return NetworkAuthenticationRequired;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
          public StatusCode findValueByNumber(int number) {
            return StatusCode.forNumber(number);
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
    return io.envoyproxy.envoy.type.v3.HttpStatusProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final StatusCode[] VALUES = values();

  public static StatusCode valueOf(
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

  private StatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:envoy.type.v3.StatusCode)
}

