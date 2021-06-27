// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/common.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public interface CertificateValidationContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TLS certificate data containing certificate authority certificates to use in verifying
   * a presented peer certificate (e.g. server certificate for clusters or client certificate
   * for listeners). If not specified and a peer certificate is presented it will not be
   * verified. By default, a client certificate is optional, unless one of the additional
   * options (:ref:`require_client_certificate
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.require_client_certificate&gt;`,
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;`,
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`, or
   * :ref:`match_subject_alt_names
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.match_subject_alt_names&gt;`) is also
   * specified.
   * It can optionally contain certificate revocation lists, in which case Envoy will verify
   * that the presented peer certificate has not been revoked by one of the included CRLs. Note
   * that if a CRL is provided for any certificate authority in a trust chain, a CRL must be
   * provided for all certificate authorities in that chain. Failure to do so will result in
   * verification failure for both revoked and unrevoked certificates from that chain.
   * See :ref:`the TLS overview &lt;arch_overview_ssl_enabling_verification&gt;` for a list of common
   * system CA locations.
   * If *trusted_ca* is a filesystem path, a watch will be added to the parent
   * directory for any file moves to support rotation. This currently only
   * applies to dynamic secrets, when the *CertificateValidationContext* is
   * delivered via SDS.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource trusted_ca = 1;</code>
   * @return Whether the trustedCa field is set.
   */
  boolean hasTrustedCa();
  /**
   * <pre>
   * TLS certificate data containing certificate authority certificates to use in verifying
   * a presented peer certificate (e.g. server certificate for clusters or client certificate
   * for listeners). If not specified and a peer certificate is presented it will not be
   * verified. By default, a client certificate is optional, unless one of the additional
   * options (:ref:`require_client_certificate
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.require_client_certificate&gt;`,
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;`,
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`, or
   * :ref:`match_subject_alt_names
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.match_subject_alt_names&gt;`) is also
   * specified.
   * It can optionally contain certificate revocation lists, in which case Envoy will verify
   * that the presented peer certificate has not been revoked by one of the included CRLs. Note
   * that if a CRL is provided for any certificate authority in a trust chain, a CRL must be
   * provided for all certificate authorities in that chain. Failure to do so will result in
   * verification failure for both revoked and unrevoked certificates from that chain.
   * See :ref:`the TLS overview &lt;arch_overview_ssl_enabling_verification&gt;` for a list of common
   * system CA locations.
   * If *trusted_ca* is a filesystem path, a watch will be added to the parent
   * directory for any file moves to support rotation. This currently only
   * applies to dynamic secrets, when the *CertificateValidationContext* is
   * delivered via SDS.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource trusted_ca = 1;</code>
   * @return The trustedCa.
   */
  io.envoyproxy.envoy.config.core.v3.DataSource getTrustedCa();
  /**
   * <pre>
   * TLS certificate data containing certificate authority certificates to use in verifying
   * a presented peer certificate (e.g. server certificate for clusters or client certificate
   * for listeners). If not specified and a peer certificate is presented it will not be
   * verified. By default, a client certificate is optional, unless one of the additional
   * options (:ref:`require_client_certificate
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.require_client_certificate&gt;`,
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;`,
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`, or
   * :ref:`match_subject_alt_names
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.match_subject_alt_names&gt;`) is also
   * specified.
   * It can optionally contain certificate revocation lists, in which case Envoy will verify
   * that the presented peer certificate has not been revoked by one of the included CRLs. Note
   * that if a CRL is provided for any certificate authority in a trust chain, a CRL must be
   * provided for all certificate authorities in that chain. Failure to do so will result in
   * verification failure for both revoked and unrevoked certificates from that chain.
   * See :ref:`the TLS overview &lt;arch_overview_ssl_enabling_verification&gt;` for a list of common
   * system CA locations.
   * If *trusted_ca* is a filesystem path, a watch will be added to the parent
   * directory for any file moves to support rotation. This currently only
   * applies to dynamic secrets, when the *CertificateValidationContext* is
   * delivered via SDS.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource trusted_ca = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getTrustedCaOrBuilder();

  /**
   * <pre>
   * If specified, updates of a file-based *trusted_ca* source will be triggered
   * by this watch. This allows explicit control over the path watched, by
   * default the parent directory of the filesystem path in *trusted_ca* is
   * watched if this field is not specified. This only applies when a
   * *CertificateValidationContext* is delivered by SDS with references to
   * filesystem paths. See the :ref:`SDS key rotation &lt;sds_key_rotation&gt;`
   * documentation for further details.
   * </pre>
   *
   * <code>.envoy.config.core.v3.WatchedDirectory watched_directory = 11;</code>
   * @return Whether the watchedDirectory field is set.
   */
  boolean hasWatchedDirectory();
  /**
   * <pre>
   * If specified, updates of a file-based *trusted_ca* source will be triggered
   * by this watch. This allows explicit control over the path watched, by
   * default the parent directory of the filesystem path in *trusted_ca* is
   * watched if this field is not specified. This only applies when a
   * *CertificateValidationContext* is delivered by SDS with references to
   * filesystem paths. See the :ref:`SDS key rotation &lt;sds_key_rotation&gt;`
   * documentation for further details.
   * </pre>
   *
   * <code>.envoy.config.core.v3.WatchedDirectory watched_directory = 11;</code>
   * @return The watchedDirectory.
   */
  io.envoyproxy.envoy.config.core.v3.WatchedDirectory getWatchedDirectory();
  /**
   * <pre>
   * If specified, updates of a file-based *trusted_ca* source will be triggered
   * by this watch. This allows explicit control over the path watched, by
   * default the parent directory of the filesystem path in *trusted_ca* is
   * watched if this field is not specified. This only applies when a
   * *CertificateValidationContext* is delivered by SDS with references to
   * filesystem paths. See the :ref:`SDS key rotation &lt;sds_key_rotation&gt;`
   * documentation for further details.
   * </pre>
   *
   * <code>.envoy.config.core.v3.WatchedDirectory watched_directory = 11;</code>
   */
  io.envoyproxy.envoy.config.core.v3.WatchedDirectoryOrBuilder getWatchedDirectoryOrBuilder();

  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes. If specified, Envoy will verify that the
   * SHA-256 of the DER-encoded Subject Public Key Information (SPKI) of the presented certificate
   * matches one of the specified values.
   * A base64-encoded SHA-256 of the Subject Public Key Information (SPKI) of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -pubkey
   *     | openssl pkey -pubin -outform DER
   *     | openssl dgst -sha256 -binary
   *     | openssl enc -base64
   *   NvqYIYSbgK2vCJpQhObf77vv+bQWtc5ek5RIOwPiC9A=
   * This is the format used in HTTP Public Key Pinning.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * .. attention::
   *   This option is preferred over :ref:`verify_certificate_hash
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`,
   *   because SPKI is tied to a private key, so it doesn't change when the certificate
   *   is renewed using the same private key.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 3 [(.validate.rules) = { ... }</code>
   * @return A list containing the verifyCertificateSpki.
   */
  java.util.List<java.lang.String>
      getVerifyCertificateSpkiList();
  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes. If specified, Envoy will verify that the
   * SHA-256 of the DER-encoded Subject Public Key Information (SPKI) of the presented certificate
   * matches one of the specified values.
   * A base64-encoded SHA-256 of the Subject Public Key Information (SPKI) of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -pubkey
   *     | openssl pkey -pubin -outform DER
   *     | openssl dgst -sha256 -binary
   *     | openssl enc -base64
   *   NvqYIYSbgK2vCJpQhObf77vv+bQWtc5ek5RIOwPiC9A=
   * This is the format used in HTTP Public Key Pinning.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * .. attention::
   *   This option is preferred over :ref:`verify_certificate_hash
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`,
   *   because SPKI is tied to a private key, so it doesn't change when the certificate
   *   is renewed using the same private key.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 3 [(.validate.rules) = { ... }</code>
   * @return The count of verifyCertificateSpki.
   */
  int getVerifyCertificateSpkiCount();
  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes. If specified, Envoy will verify that the
   * SHA-256 of the DER-encoded Subject Public Key Information (SPKI) of the presented certificate
   * matches one of the specified values.
   * A base64-encoded SHA-256 of the Subject Public Key Information (SPKI) of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -pubkey
   *     | openssl pkey -pubin -outform DER
   *     | openssl dgst -sha256 -binary
   *     | openssl enc -base64
   *   NvqYIYSbgK2vCJpQhObf77vv+bQWtc5ek5RIOwPiC9A=
   * This is the format used in HTTP Public Key Pinning.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * .. attention::
   *   This option is preferred over :ref:`verify_certificate_hash
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`,
   *   because SPKI is tied to a private key, so it doesn't change when the certificate
   *   is renewed using the same private key.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 3 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The verifyCertificateSpki at the given index.
   */
  java.lang.String getVerifyCertificateSpki(int index);
  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes. If specified, Envoy will verify that the
   * SHA-256 of the DER-encoded Subject Public Key Information (SPKI) of the presented certificate
   * matches one of the specified values.
   * A base64-encoded SHA-256 of the Subject Public Key Information (SPKI) of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -pubkey
   *     | openssl pkey -pubin -outform DER
   *     | openssl dgst -sha256 -binary
   *     | openssl enc -base64
   *   NvqYIYSbgK2vCJpQhObf77vv+bQWtc5ek5RIOwPiC9A=
   * This is the format used in HTTP Public Key Pinning.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * .. attention::
   *   This option is preferred over :ref:`verify_certificate_hash
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;`,
   *   because SPKI is tied to a private key, so it doesn't change when the certificate
   *   is renewed using the same private key.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 3 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the verifyCertificateSpki at the given index.
   */
  com.google.protobuf.ByteString
      getVerifyCertificateSpkiBytes(int index);

  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes. If specified, Envoy will verify that
   * the SHA-256 of the DER-encoded presented certificate matches one of the specified values.
   * A hex-encoded SHA-256 of the certificate can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -outform DER | openssl dgst -sha256 | cut -d" " -f2
   *   df6ff72fe9116521268f6f2dd4966f51df479883fe7037b39f75916ac3049d1a
   * A long hex-encoded and colon-separated SHA-256 (a.k.a. "fingerprint") of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -fingerprint -sha256 | cut -d"=" -f2
   *   DF:6F:F7:2F:E9:11:65:21:26:8F:6F:2D:D4:96:6F:51:DF:47:98:83:FE:70:37:B3:9F:75:91:6A:C3:04:9D:1A
   * Both of those formats are acceptable.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 2 [(.validate.rules) = { ... }</code>
   * @return A list containing the verifyCertificateHash.
   */
  java.util.List<java.lang.String>
      getVerifyCertificateHashList();
  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes. If specified, Envoy will verify that
   * the SHA-256 of the DER-encoded presented certificate matches one of the specified values.
   * A hex-encoded SHA-256 of the certificate can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -outform DER | openssl dgst -sha256 | cut -d" " -f2
   *   df6ff72fe9116521268f6f2dd4966f51df479883fe7037b39f75916ac3049d1a
   * A long hex-encoded and colon-separated SHA-256 (a.k.a. "fingerprint") of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -fingerprint -sha256 | cut -d"=" -f2
   *   DF:6F:F7:2F:E9:11:65:21:26:8F:6F:2D:D4:96:6F:51:DF:47:98:83:FE:70:37:B3:9F:75:91:6A:C3:04:9D:1A
   * Both of those formats are acceptable.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 2 [(.validate.rules) = { ... }</code>
   * @return The count of verifyCertificateHash.
   */
  int getVerifyCertificateHashCount();
  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes. If specified, Envoy will verify that
   * the SHA-256 of the DER-encoded presented certificate matches one of the specified values.
   * A hex-encoded SHA-256 of the certificate can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -outform DER | openssl dgst -sha256 | cut -d" " -f2
   *   df6ff72fe9116521268f6f2dd4966f51df479883fe7037b39f75916ac3049d1a
   * A long hex-encoded and colon-separated SHA-256 (a.k.a. "fingerprint") of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -fingerprint -sha256 | cut -d"=" -f2
   *   DF:6F:F7:2F:E9:11:65:21:26:8F:6F:2D:D4:96:6F:51:DF:47:98:83:FE:70:37:B3:9F:75:91:6A:C3:04:9D:1A
   * Both of those formats are acceptable.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 2 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The verifyCertificateHash at the given index.
   */
  java.lang.String getVerifyCertificateHash(int index);
  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes. If specified, Envoy will verify that
   * the SHA-256 of the DER-encoded presented certificate matches one of the specified values.
   * A hex-encoded SHA-256 of the certificate can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -outform DER | openssl dgst -sha256 | cut -d" " -f2
   *   df6ff72fe9116521268f6f2dd4966f51df479883fe7037b39f75916ac3049d1a
   * A long hex-encoded and colon-separated SHA-256 (a.k.a. "fingerprint") of the certificate
   * can be generated with the following command:
   * .. code-block:: bash
   *   $ openssl x509 -in path/to/client.crt -noout -fingerprint -sha256 | cut -d"=" -f2
   *   DF:6F:F7:2F:E9:11:65:21:26:8F:6F:2D:D4:96:6F:51:DF:47:98:83:FE:70:37:B3:9F:75:91:6A:C3:04:9D:1A
   * Both of those formats are acceptable.
   * When both:
   * :ref:`verify_certificate_hash
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_hash&gt;` and
   * :ref:`verify_certificate_spki
   * &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.verify_certificate_spki&gt;` are specified,
   * a hash matching value from either of the lists will result in the certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 2 [(.validate.rules) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the verifyCertificateHash at the given index.
   */
  com.google.protobuf.ByteString
      getVerifyCertificateHashBytes(int index);

  /**
   * <pre>
   * An optional list of Subject Alternative name matchers. If specified, Envoy will verify that the
   * Subject Alternative Name of the presented certificate matches one of the specified matchers.
   * When a certificate has wildcard DNS SAN entries, to match a specific client, it should be
   * configured with exact match type in the :ref:`string matcher &lt;envoy_api_msg_type.matcher.v3.StringMatcher&gt;`.
   * For example if the certificate has "&#92;*.example.com" as DNS SAN entry, to allow only "api.example.com",
   * it should be configured as shown below.
   * .. code-block:: yaml
   *  match_subject_alt_names:
   *    exact: "api.example.com"
   * .. attention::
   *   Subject Alternative Names are easily spoofable and verifying only them is insecure,
   *   therefore this option must be used together with :ref:`trusted_ca
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.trusted_ca&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.type.matcher.v3.StringMatcher match_subject_alt_names = 9;</code>
   */
  java.util.List<io.envoyproxy.envoy.type.matcher.v3.StringMatcher> 
      getMatchSubjectAltNamesList();
  /**
   * <pre>
   * An optional list of Subject Alternative name matchers. If specified, Envoy will verify that the
   * Subject Alternative Name of the presented certificate matches one of the specified matchers.
   * When a certificate has wildcard DNS SAN entries, to match a specific client, it should be
   * configured with exact match type in the :ref:`string matcher &lt;envoy_api_msg_type.matcher.v3.StringMatcher&gt;`.
   * For example if the certificate has "&#92;*.example.com" as DNS SAN entry, to allow only "api.example.com",
   * it should be configured as shown below.
   * .. code-block:: yaml
   *  match_subject_alt_names:
   *    exact: "api.example.com"
   * .. attention::
   *   Subject Alternative Names are easily spoofable and verifying only them is insecure,
   *   therefore this option must be used together with :ref:`trusted_ca
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.trusted_ca&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.type.matcher.v3.StringMatcher match_subject_alt_names = 9;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.StringMatcher getMatchSubjectAltNames(int index);
  /**
   * <pre>
   * An optional list of Subject Alternative name matchers. If specified, Envoy will verify that the
   * Subject Alternative Name of the presented certificate matches one of the specified matchers.
   * When a certificate has wildcard DNS SAN entries, to match a specific client, it should be
   * configured with exact match type in the :ref:`string matcher &lt;envoy_api_msg_type.matcher.v3.StringMatcher&gt;`.
   * For example if the certificate has "&#92;*.example.com" as DNS SAN entry, to allow only "api.example.com",
   * it should be configured as shown below.
   * .. code-block:: yaml
   *  match_subject_alt_names:
   *    exact: "api.example.com"
   * .. attention::
   *   Subject Alternative Names are easily spoofable and verifying only them is insecure,
   *   therefore this option must be used together with :ref:`trusted_ca
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.trusted_ca&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.type.matcher.v3.StringMatcher match_subject_alt_names = 9;</code>
   */
  int getMatchSubjectAltNamesCount();
  /**
   * <pre>
   * An optional list of Subject Alternative name matchers. If specified, Envoy will verify that the
   * Subject Alternative Name of the presented certificate matches one of the specified matchers.
   * When a certificate has wildcard DNS SAN entries, to match a specific client, it should be
   * configured with exact match type in the :ref:`string matcher &lt;envoy_api_msg_type.matcher.v3.StringMatcher&gt;`.
   * For example if the certificate has "&#92;*.example.com" as DNS SAN entry, to allow only "api.example.com",
   * it should be configured as shown below.
   * .. code-block:: yaml
   *  match_subject_alt_names:
   *    exact: "api.example.com"
   * .. attention::
   *   Subject Alternative Names are easily spoofable and verifying only them is insecure,
   *   therefore this option must be used together with :ref:`trusted_ca
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.trusted_ca&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.type.matcher.v3.StringMatcher match_subject_alt_names = 9;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> 
      getMatchSubjectAltNamesOrBuilderList();
  /**
   * <pre>
   * An optional list of Subject Alternative name matchers. If specified, Envoy will verify that the
   * Subject Alternative Name of the presented certificate matches one of the specified matchers.
   * When a certificate has wildcard DNS SAN entries, to match a specific client, it should be
   * configured with exact match type in the :ref:`string matcher &lt;envoy_api_msg_type.matcher.v3.StringMatcher&gt;`.
   * For example if the certificate has "&#92;*.example.com" as DNS SAN entry, to allow only "api.example.com",
   * it should be configured as shown below.
   * .. code-block:: yaml
   *  match_subject_alt_names:
   *    exact: "api.example.com"
   * .. attention::
   *   Subject Alternative Names are easily spoofable and verifying only them is insecure,
   *   therefore this option must be used together with :ref:`trusted_ca
   *   &lt;envoy_api_field_extensions.transport_sockets.tls.v3.CertificateValidationContext.trusted_ca&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.type.matcher.v3.StringMatcher match_subject_alt_names = 9;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getMatchSubjectAltNamesOrBuilder(
      int index);

  /**
   * <pre>
   * [#not-implemented-hide:] Must present signed certificate time-stamp.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_signed_certificate_timestamp = 6;</code>
   * @return Whether the requireSignedCertificateTimestamp field is set.
   */
  boolean hasRequireSignedCertificateTimestamp();
  /**
   * <pre>
   * [#not-implemented-hide:] Must present signed certificate time-stamp.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_signed_certificate_timestamp = 6;</code>
   * @return The requireSignedCertificateTimestamp.
   */
  com.google.protobuf.BoolValue getRequireSignedCertificateTimestamp();
  /**
   * <pre>
   * [#not-implemented-hide:] Must present signed certificate time-stamp.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_signed_certificate_timestamp = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getRequireSignedCertificateTimestampOrBuilder();

  /**
   * <pre>
   * An optional `certificate revocation list
   * &lt;https://en.wikipedia.org/wiki/Certificate_revocation_list&gt;`_
   * (in PEM format). If specified, Envoy will verify that the presented peer
   * certificate has not been revoked by this CRL. If this DataSource contains
   * multiple CRLs, all of them will be used. Note that if a CRL is provided
   * for any certificate authority in a trust chain, a CRL must be provided
   * for all certificate authorities in that chain. Failure to do so will
   * result in verification failure for both revoked and unrevoked certificates
   * from that chain.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource crl = 7;</code>
   * @return Whether the crl field is set.
   */
  boolean hasCrl();
  /**
   * <pre>
   * An optional `certificate revocation list
   * &lt;https://en.wikipedia.org/wiki/Certificate_revocation_list&gt;`_
   * (in PEM format). If specified, Envoy will verify that the presented peer
   * certificate has not been revoked by this CRL. If this DataSource contains
   * multiple CRLs, all of them will be used. Note that if a CRL is provided
   * for any certificate authority in a trust chain, a CRL must be provided
   * for all certificate authorities in that chain. Failure to do so will
   * result in verification failure for both revoked and unrevoked certificates
   * from that chain.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource crl = 7;</code>
   * @return The crl.
   */
  io.envoyproxy.envoy.config.core.v3.DataSource getCrl();
  /**
   * <pre>
   * An optional `certificate revocation list
   * &lt;https://en.wikipedia.org/wiki/Certificate_revocation_list&gt;`_
   * (in PEM format). If specified, Envoy will verify that the presented peer
   * certificate has not been revoked by this CRL. If this DataSource contains
   * multiple CRLs, all of them will be used. Note that if a CRL is provided
   * for any certificate authority in a trust chain, a CRL must be provided
   * for all certificate authorities in that chain. Failure to do so will
   * result in verification failure for both revoked and unrevoked certificates
   * from that chain.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource crl = 7;</code>
   */
  io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getCrlOrBuilder();

  /**
   * <pre>
   * If specified, Envoy will not reject expired certificates.
   * </pre>
   *
   * <code>bool allow_expired_certificate = 8;</code>
   * @return The allowExpiredCertificate.
   */
  boolean getAllowExpiredCertificate();

  /**
   * <pre>
   * Certificate trust chain verification mode.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext.TrustChainVerification trust_chain_verification = 10 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for trustChainVerification.
   */
  int getTrustChainVerificationValue();
  /**
   * <pre>
   * Certificate trust chain verification mode.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext.TrustChainVerification trust_chain_verification = 10 [(.validate.rules) = { ... }</code>
   * @return The trustChainVerification.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CertificateValidationContext.TrustChainVerification getTrustChainVerification();
}