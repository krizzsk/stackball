package com.smaato.sdk.core;

import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.p248ad.AdFormat;

final class AutoValue_UbErrorReporting_Param extends UbErrorReporting.Param {
    private final AdFormat adFormat;
    private final String adSpaceId;
    private final String creativeId;
    private final String publisherId;
    private final Long requestTimestamp;
    private final String sessionId;

    /* synthetic */ AutoValue_UbErrorReporting_Param(String str, String str2, String str3, String str4, AdFormat adFormat2, Long l, byte b) {
        this(str, str2, str3, str4, adFormat2, l);
    }

    private AutoValue_UbErrorReporting_Param(String str, String str2, String str3, String str4, AdFormat adFormat2, Long l) {
        this.publisherId = str;
        this.adSpaceId = str2;
        this.sessionId = str3;
        this.creativeId = str4;
        this.adFormat = adFormat2;
        this.requestTimestamp = l;
    }

    public final String publisherId() {
        return this.publisherId;
    }

    public final String adSpaceId() {
        return this.adSpaceId;
    }

    public final String sessionId() {
        return this.sessionId;
    }

    public final String creativeId() {
        return this.creativeId;
    }

    public final AdFormat adFormat() {
        return this.adFormat;
    }

    public final Long requestTimestamp() {
        return this.requestTimestamp;
    }

    public final String toString() {
        return "Param{publisherId=" + this.publisherId + ", adSpaceId=" + this.adSpaceId + ", sessionId=" + this.sessionId + ", creativeId=" + this.creativeId + ", adFormat=" + this.adFormat + ", requestTimestamp=" + this.requestTimestamp + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.creativeId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = r4.adFormat;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r1 = r4.requestTimestamp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.sessionId;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.core.UbErrorReporting.Param
            r2 = 0
            if (r1 == 0) goto L_0x0078
            com.smaato.sdk.core.UbErrorReporting$Param r5 = (com.smaato.sdk.core.UbErrorReporting.Param) r5
            java.lang.String r1 = r4.publisherId
            java.lang.String r3 = r5.publisherId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = r4.adSpaceId
            java.lang.String r3 = r5.adSpaceId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = r4.sessionId
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r5.sessionId()
            if (r1 != 0) goto L_0x0078
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r5.sessionId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0078
        L_0x0038:
            java.lang.String r1 = r4.creativeId
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = r5.creativeId()
            if (r1 != 0) goto L_0x0078
            goto L_0x004d
        L_0x0043:
            java.lang.String r3 = r5.creativeId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0078
        L_0x004d:
            com.smaato.sdk.core.ad.AdFormat r1 = r4.adFormat
            if (r1 != 0) goto L_0x0058
            com.smaato.sdk.core.ad.AdFormat r1 = r5.adFormat()
            if (r1 != 0) goto L_0x0078
            goto L_0x0062
        L_0x0058:
            com.smaato.sdk.core.ad.AdFormat r3 = r5.adFormat()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0078
        L_0x0062:
            java.lang.Long r1 = r4.requestTimestamp
            if (r1 != 0) goto L_0x006d
            java.lang.Long r5 = r5.requestTimestamp()
            if (r5 != 0) goto L_0x0078
            goto L_0x0077
        L_0x006d:
            java.lang.Long r5 = r5.requestTimestamp()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0078
        L_0x0077:
            return r0
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.AutoValue_UbErrorReporting_Param.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((this.publisherId.hashCode() ^ 1000003) * 1000003) ^ this.adSpaceId.hashCode()) * 1000003;
        String str = this.sessionId;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.creativeId;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        AdFormat adFormat2 = this.adFormat;
        int hashCode4 = (hashCode3 ^ (adFormat2 == null ? 0 : adFormat2.hashCode())) * 1000003;
        Long l = this.requestTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 ^ i;
    }

    static final class Builder extends UbErrorReporting.Param.Builder {
        private AdFormat adFormat;
        private String adSpaceId;
        private String creativeId;
        private String publisherId;
        private Long requestTimestamp;
        private String sessionId;

        Builder() {
        }

        public final UbErrorReporting.Param.Builder setPublisherId(String str) {
            if (str != null) {
                this.publisherId = str;
                return this;
            }
            throw new NullPointerException("Null publisherId");
        }

        public final UbErrorReporting.Param.Builder setAdSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public final UbErrorReporting.Param.Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public final UbErrorReporting.Param.Builder setCreativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public final UbErrorReporting.Param.Builder setAdFormat(AdFormat adFormat2) {
            this.adFormat = adFormat2;
            return this;
        }

        public final UbErrorReporting.Param.Builder setRequestTimestamp(Long l) {
            this.requestTimestamp = l;
            return this;
        }

        public final UbErrorReporting.Param build() {
            String str = "";
            if (this.publisherId == null) {
                str = str + " publisherId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (str.isEmpty()) {
                return new AutoValue_UbErrorReporting_Param(this.publisherId, this.adSpaceId, this.sessionId, this.creativeId, this.adFormat, this.requestTimestamp, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
