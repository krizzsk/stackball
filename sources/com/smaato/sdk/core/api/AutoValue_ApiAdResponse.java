package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.Expiration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class AutoValue_ApiAdResponse extends ApiAdResponse {
    private final AdFormat adFormat;
    private final byte[] body;
    private final String charset;
    private final String creativeId;
    private final String csm;
    private final Expiration expiration;
    private final String requestUrl;
    private final Map<String, List<String>> responseHeaders;
    private final String sessionId;

    /* synthetic */ AutoValue_ApiAdResponse(AdFormat adFormat2, byte[] bArr, Map map, String str, String str2, Expiration expiration2, String str3, String str4, String str5, byte b) {
        this(adFormat2, bArr, map, str, str2, expiration2, str3, str4, str5);
    }

    private AutoValue_ApiAdResponse(AdFormat adFormat2, byte[] bArr, Map<String, List<String>> map, String str, String str2, Expiration expiration2, String str3, String str4, String str5) {
        this.adFormat = adFormat2;
        this.body = bArr;
        this.responseHeaders = map;
        this.charset = str;
        this.requestUrl = str2;
        this.expiration = expiration2;
        this.sessionId = str3;
        this.creativeId = str4;
        this.csm = str5;
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final Expiration getExpiration() {
        return this.expiration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    /* access modifiers changed from: package-private */
    public final String getCsm() {
        return this.csm;
    }

    public final String toString() {
        return "ApiAdResponse{adFormat=" + this.adFormat + ", body=" + Arrays.toString(this.body) + ", responseHeaders=" + this.responseHeaders + ", charset=" + this.charset + ", requestUrl=" + this.requestUrl + ", expiration=" + this.expiration + ", sessionId=" + this.sessionId + ", creativeId=" + this.creativeId + ", csm=" + this.csm + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r1 = r4.creativeId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r1 = r4.csm;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.core.api.ApiAdResponse
            r2 = 0
            if (r1 == 0) goto L_0x0094
            com.smaato.sdk.core.api.ApiAdResponse r5 = (com.smaato.sdk.core.api.ApiAdResponse) r5
            com.smaato.sdk.core.ad.AdFormat r1 = r4.adFormat
            com.smaato.sdk.core.ad.AdFormat r3 = r5.getAdFormat()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            byte[] r1 = r4.body
            boolean r3 = r5 instanceof com.smaato.sdk.core.api.AutoValue_ApiAdResponse
            if (r3 == 0) goto L_0x0023
            r3 = r5
            com.smaato.sdk.core.api.AutoValue_ApiAdResponse r3 = (com.smaato.sdk.core.api.AutoValue_ApiAdResponse) r3
            byte[] r3 = r3.body
            goto L_0x0027
        L_0x0023:
            byte[] r3 = r5.getBody()
        L_0x0027:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x0094
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r4.responseHeaders
            java.util.Map r3 = r5.getResponseHeaders()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r4.charset
            java.lang.String r3 = r5.getCharset()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r4.requestUrl
            java.lang.String r3 = r5.getRequestUrl()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            com.smaato.sdk.core.ad.Expiration r1 = r4.expiration
            com.smaato.sdk.core.ad.Expiration r3 = r5.getExpiration()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r4.sessionId
            java.lang.String r3 = r5.getSessionId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r4.creativeId
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = r5.getCreativeId()
            if (r1 != 0) goto L_0x0094
            goto L_0x007e
        L_0x0074:
            java.lang.String r3 = r5.getCreativeId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0094
        L_0x007e:
            java.lang.String r1 = r4.csm
            if (r1 != 0) goto L_0x0089
            java.lang.String r5 = r5.getCsm()
            if (r5 != 0) goto L_0x0094
            goto L_0x0093
        L_0x0089:
            java.lang.String r5 = r5.getCsm()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0094
        L_0x0093:
            return r0
        L_0x0094:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.api.AutoValue_ApiAdResponse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.adFormat.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.body)) * 1000003) ^ this.responseHeaders.hashCode()) * 1000003) ^ this.charset.hashCode()) * 1000003) ^ this.requestUrl.hashCode()) * 1000003) ^ this.expiration.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003;
        String str = this.creativeId;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.csm;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    static final class Builder extends ApiAdResponse.Builder {
        private AdFormat adFormat;
        private byte[] body;
        private String charset;
        private String creativeId;
        private String csm;
        private Expiration expiration;
        private String requestUrl;
        private Map<String, List<String>> responseHeaders;
        private String sessionId;

        Builder() {
        }

        public final ApiAdResponse.Builder adFormat(AdFormat adFormat2) {
            if (adFormat2 != null) {
                this.adFormat = adFormat2;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        public final ApiAdResponse.Builder body(byte[] bArr) {
            if (bArr != null) {
                this.body = bArr;
                return this;
            }
            throw new NullPointerException("Null body");
        }

        /* access modifiers changed from: package-private */
        public final byte[] getBody() {
            byte[] bArr = this.body;
            if (bArr != null) {
                return bArr;
            }
            throw new IllegalStateException("Property \"body\" has not been set");
        }

        public final ApiAdResponse.Builder responseHeaders(Map<String, List<String>> map) {
            if (map != null) {
                this.responseHeaders = map;
                return this;
            }
            throw new NullPointerException("Null responseHeaders");
        }

        /* access modifiers changed from: package-private */
        public final Map<String, List<String>> getResponseHeaders() {
            Map<String, List<String>> map = this.responseHeaders;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"responseHeaders\" has not been set");
        }

        public final ApiAdResponse.Builder charset(String str) {
            if (str != null) {
                this.charset = str;
                return this;
            }
            throw new NullPointerException("Null charset");
        }

        public final ApiAdResponse.Builder requestUrl(String str) {
            if (str != null) {
                this.requestUrl = str;
                return this;
            }
            throw new NullPointerException("Null requestUrl");
        }

        public final ApiAdResponse.Builder expiration(Expiration expiration2) {
            if (expiration2 != null) {
                this.expiration = expiration2;
                return this;
            }
            throw new NullPointerException("Null expiration");
        }

        public final ApiAdResponse.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final ApiAdResponse.Builder creativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public final ApiAdResponse.Builder csm(String str) {
            this.csm = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final ApiAdResponse autoBuild() {
            String str = "";
            if (this.adFormat == null) {
                str = str + " adFormat";
            }
            if (this.body == null) {
                str = str + " body";
            }
            if (this.responseHeaders == null) {
                str = str + " responseHeaders";
            }
            if (this.charset == null) {
                str = str + " charset";
            }
            if (this.requestUrl == null) {
                str = str + " requestUrl";
            }
            if (this.expiration == null) {
                str = str + " expiration";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (str.isEmpty()) {
                return new AutoValue_ApiAdResponse(this.adFormat, this.body, this.responseHeaders, this.charset, this.requestUrl, this.expiration, this.sessionId, this.creativeId, this.csm, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
