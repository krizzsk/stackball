package com.smaato.sdk.p257ub;

import com.smaato.sdk.p257ub.AdMarkup;

/* renamed from: com.smaato.sdk.ub.AutoValue_AdMarkup */
final class AutoValue_AdMarkup extends AdMarkup {
    private final String adFormat;
    private final String adSpaceId;
    private final long expiresAt;
    private final String markup;
    private final String sessionId;

    /* synthetic */ AutoValue_AdMarkup(String str, String str2, String str3, String str4, long j, byte b) {
        this(str, str2, str3, str4, j);
    }

    private AutoValue_AdMarkup(String str, String str2, String str3, String str4, long j) {
        this.markup = str;
        this.adFormat = str2;
        this.sessionId = str3;
        this.adSpaceId = str4;
        this.expiresAt = j;
    }

    public final String markup() {
        return this.markup;
    }

    public final String adFormat() {
        return this.adFormat;
    }

    public final String sessionId() {
        return this.sessionId;
    }

    public final String adSpaceId() {
        return this.adSpaceId;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public final String toString() {
        return "AdMarkup{markup=" + this.markup + ", adFormat=" + this.adFormat + ", sessionId=" + this.sessionId + ", adSpaceId=" + this.adSpaceId + ", expiresAt=" + this.expiresAt + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdMarkup) {
            AdMarkup adMarkup = (AdMarkup) obj;
            return this.markup.equals(adMarkup.markup()) && this.adFormat.equals(adMarkup.adFormat()) && this.sessionId.equals(adMarkup.sessionId()) && this.adSpaceId.equals(adMarkup.adSpaceId()) && this.expiresAt == adMarkup.expiresAt();
        }
    }

    public final int hashCode() {
        long j = this.expiresAt;
        return ((((((((this.markup.hashCode() ^ 1000003) * 1000003) ^ this.adFormat.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.adSpaceId.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: com.smaato.sdk.ub.AutoValue_AdMarkup$Builder */
    static final class Builder extends AdMarkup.Builder {
        private String adFormat;
        private String adSpaceId;
        private Long expiresAt;
        private String markup;
        private String sessionId;

        Builder() {
        }

        public final AdMarkup.Builder markup(String str) {
            if (str != null) {
                this.markup = str;
                return this;
            }
            throw new NullPointerException("Null markup");
        }

        public final AdMarkup.Builder adFormat(String str) {
            if (str != null) {
                this.adFormat = str;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        public final AdMarkup.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final AdMarkup.Builder adSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public final AdMarkup.Builder expiresAt(long j) {
            this.expiresAt = Long.valueOf(j);
            return this;
        }

        public final AdMarkup build() {
            String str = "";
            if (this.markup == null) {
                str = str + " markup";
            }
            if (this.adFormat == null) {
                str = str + " adFormat";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (this.expiresAt == null) {
                str = str + " expiresAt";
            }
            if (str.isEmpty()) {
                return new AutoValue_AdMarkup(this.markup, this.adFormat, this.sessionId, this.adSpaceId, this.expiresAt.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
