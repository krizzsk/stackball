package com.smaato.sdk.p257ub;

import com.smaato.sdk.p257ub.UbId;

/* renamed from: com.smaato.sdk.ub.AutoValue_UbId */
final class AutoValue_UbId extends UbId {
    private final String adSpaceId;
    private final String sessionId;

    /* synthetic */ AutoValue_UbId(String str, String str2, byte b) {
        this(str, str2);
    }

    private AutoValue_UbId(String str, String str2) {
        this.sessionId = str;
        this.adSpaceId = str2;
    }

    public final String sessionId() {
        return this.sessionId;
    }

    public final String adSpaceId() {
        return this.adSpaceId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UbId) {
            UbId ubId = (UbId) obj;
            return this.sessionId.equals(ubId.sessionId()) && this.adSpaceId.equals(ubId.adSpaceId());
        }
    }

    public final int hashCode() {
        return ((this.sessionId.hashCode() ^ 1000003) * 1000003) ^ this.adSpaceId.hashCode();
    }

    /* renamed from: com.smaato.sdk.ub.AutoValue_UbId$Builder */
    static final class Builder extends UbId.Builder {
        private String adSpaceId;
        private String sessionId;

        Builder() {
        }

        public final UbId.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final UbId.Builder adSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public final UbId build() {
            String str = "";
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (str.isEmpty()) {
                return new AutoValue_UbId(this.sessionId, this.adSpaceId, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
