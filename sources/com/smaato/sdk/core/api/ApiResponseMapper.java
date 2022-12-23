package com.smaato.sdk.core.api;

import com.google.common.net.HttpHeaders;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.DateEncoder;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkResponse;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.ApiUtils;
import com.smaato.sdk.core.p248ad.Expiration;
import com.smaato.sdk.core.util.ContentTypeUtil;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.List;
import java.util.Map;

class ApiResponseMapper {
    private final ExpirationTimestampFactory expirationTimestampFactory;
    private final HeaderUtils headerUtils;
    private final Logger logger;

    public ApiResponseMapper(Logger logger2, HeaderUtils headerUtils2, ExpirationTimestampFactory expirationTimestampFactory2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.headerUtils = (HeaderUtils) Objects.requireNonNull(headerUtils2);
        this.expirationTimestampFactory = (ExpirationTimestampFactory) Objects.requireNonNull(expirationTimestampFactory2);
    }

    public ApiAdResponse map(NetworkResponse networkResponse) throws MappingException {
        String str;
        AdFormat adFormat;
        this.logger.debug(LogDomain.API, "map: entered with %s", networkResponse);
        Objects.requireNonNull(networkResponse);
        int responseCode = networkResponse.getResponseCode();
        this.logger.debug(LogDomain.API, "httpResponseCode = %s", Integer.valueOf(responseCode));
        String str2 = null;
        if (responseCode == 200) {
            try {
                Map<String, List<String>> headers = networkResponse.getHeaders();
                List<String> extractHeaderValueList = this.headerUtils.extractHeaderValueList(headers, "Content-Type");
                if (extractHeaderValueList == null) {
                    this.logger.debug(LogDomain.API, "%s header is absent in response", "Content-Type");
                    throw new MappingException(MappingException.Type.MISSING_CONTENT_TYPE);
                } else if (!extractHeaderValueList.isEmpty()) {
                    int size = extractHeaderValueList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            String str3 = extractHeaderValueList.get(i);
                            if (str3 != null && (str = ContentTypeUtil.parseCharset(str3)) != null) {
                                this.logger.debug(LogDomain.API, "charset found in response = %s", str);
                                break;
                            }
                            i++;
                        } else {
                            this.logger.debug(LogDomain.API, "charset not found in response", new Object[0]);
                            str = null;
                            break;
                        }
                    }
                    if (str != null) {
                        String retrieveCsm = ApiUtils.retrieveCsm(headers);
                        if (retrieveCsm != null) {
                            str2 = retrieveCsm;
                        } else {
                            this.logger.debug(LogDomain.API, "No X-SMT-CSM header in ad response. null is returned.", new Object[0]);
                        }
                        String extractHeaderSingleValue = this.headerUtils.extractHeaderSingleValue(headers, "X-SMT-ADTYPE");
                        if (extractHeaderSingleValue != null) {
                            this.logger.debug(LogDomain.API, "%s header value: %s", "X-SMT-ADTYPE", extractHeaderSingleValue);
                            if (!extractHeaderSingleValue.isEmpty()) {
                                char c = 65535;
                                switch (extractHeaderSingleValue.hashCode()) {
                                    case -1968751561:
                                        if (extractHeaderSingleValue.equals("Native")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case 73635:
                                        if (extractHeaderSingleValue.equals("Img")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case 82650203:
                                        if (extractHeaderSingleValue.equals("Video")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 1173835880:
                                        if (extractHeaderSingleValue.equals("Richmedia")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                }
                                if (c == 0) {
                                    adFormat = AdFormat.STATIC_IMAGE;
                                } else if (c == 1) {
                                    adFormat = AdFormat.VIDEO;
                                } else if (c == 2) {
                                    adFormat = AdFormat.RICH_MEDIA;
                                } else if (c == 3) {
                                    adFormat = AdFormat.NATIVE;
                                } else {
                                    this.logger.debug(LogDomain.API, "unexpected X-SMT-ADTYPE response header value: %s", extractHeaderSingleValue);
                                    throw new MappingException(MappingException.Type.UNEXPECTED_AD_TYPE, extractHeaderSingleValue);
                                }
                            } else {
                                this.logger.debug(LogDomain.API, "invalid %s response header value", "X-SMT-ADTYPE");
                                throw new MappingException(MappingException.Type.MISSING_AD_TYPE);
                            }
                        } else if (!TextUtils.isEmpty(str2)) {
                            adFormat = AdFormat.CSM;
                        } else {
                            this.logger.debug(LogDomain.API, "missing %s response header", "X-SMT-ADTYPE");
                            throw new MappingException(MappingException.Type.MISSING_AD_TYPE);
                        }
                        this.logger.debug(LogDomain.API, "got adFormat = %s", adFormat);
                        byte[] body = networkResponse.getBody();
                        if (body == null) {
                            throw new MappingException(MappingException.Type.MISSING_BODY);
                        } else if (body.length != 0) {
                            ApiAdResponse.Builder expiration = ApiAdResponse.builder().adFormat(adFormat).body(body).responseHeaders(headers).charset(str).requestUrl(networkResponse.getRequestUrl()).expiration(retrieveAdExpirationTimestamp(headers));
                            String retrieveSessionId = ApiUtils.retrieveSessionId(headers);
                            if (retrieveSessionId != null) {
                                return expiration.sessionId(retrieveSessionId).creativeId(ApiUtils.retrieveSci(headers)).csm(str2).build();
                            }
                            throw new MappingException(MappingException.Type.MISSING_SESSION_ID, "No X-SMT-SessionId header in ad response. Empty string is returned.");
                        } else {
                            throw new MappingException(MappingException.Type.EMPTY_BODY);
                        }
                    } else {
                        throw new MappingException(MappingException.Type.MISSING_CHARSET);
                    }
                } else {
                    this.logger.debug(LogDomain.API, "%s header is empty in response", "Content-Type");
                    throw new MappingException(MappingException.Type.MISSING_CONTENT_TYPE);
                }
            } catch (Exception e) {
                this.logger.debug(LogDomain.API, "error mapping networkResponse: %s", e);
                if (e instanceof MappingException) {
                    throw e;
                }
                this.logger.error(LogDomain.API, e, "error mapping networkResponse", new Object[0]);
                throw new MappingException(MappingException.Type.GENERIC, e.toString());
            }
        } else if (responseCode == 204) {
            this.logger.debug(LogDomain.API, "No Ad", new Object[0]);
            throw new MappingException(MappingException.Type.NO_AD);
        } else if (responseCode < 400 || responseCode >= 500) {
            throw new MappingException(MappingException.Type.UNEXPECTED_HTTP_RESPONSE_CODE, String.valueOf(responseCode));
        } else {
            String extractHeaderMultiValue = this.headerUtils.extractHeaderMultiValue(networkResponse.getHeaders(), "X-SMT-MESSAGE");
            if (extractHeaderMultiValue != null) {
                this.logger.debug(LogDomain.API, "errorMessage = %s", extractHeaderMultiValue);
                str2 = extractHeaderMultiValue;
            } else {
                this.logger.debug(LogDomain.API, "errorMessage not supplied in response headers", new Object[0]);
            }
            throw new MappingException(MappingException.Type.BAD_REQUEST, str2);
        }
    }

    private Expiration retrieveAdExpirationTimestamp(Map<String, List<String>> map) {
        String extractHeaderSingleValue = this.headerUtils.extractHeaderSingleValue(map, "X-SMT-Expires");
        if (extractHeaderSingleValue != null) {
            try {
                return this.expirationTimestampFactory.createExpirationTimestampFor(Long.parseLong(extractHeaderSingleValue.trim()), DateEncoder.getInstance().decodeHeaderDate(this.headerUtils.extractHeaderSingleValue(map, HttpHeaders.DATE)));
            } catch (NumberFormatException unused) {
                this.logger.debug(LogDomain.API, "invalid %s response header value", "X-SMT-Expires", extractHeaderSingleValue);
            }
        } else {
            this.logger.debug(LogDomain.API, "No X-SMT-Expires header in ad response. Using default expiration timestamp.", new Object[0]);
            return this.expirationTimestampFactory.createDefaultExpirationTimestamp();
        }
    }

    public static class MappingException extends Exception {
        public final String errorMessage;
        public final Type type;

        public enum Type {
            NO_AD,
            BAD_REQUEST,
            MISSING_AD_TYPE,
            UNEXPECTED_AD_TYPE,
            MISSING_CONTENT_TYPE,
            MISSING_SESSION_ID,
            MISSING_MIME_TYPE,
            MISSING_CHARSET,
            MISSING_BODY,
            EMPTY_BODY,
            UNEXPECTED_HTTP_RESPONSE_CODE,
            GENERIC
        }

        MappingException(Type type2) {
            super(type2.toString());
            this.type = (Type) Objects.requireNonNull(type2);
            this.errorMessage = null;
        }

        MappingException(Type type2, String str) {
            super(type2.toString() + ": " + str);
            this.type = (Type) Objects.requireNonNull(type2);
            this.errorMessage = str;
        }
    }
}
