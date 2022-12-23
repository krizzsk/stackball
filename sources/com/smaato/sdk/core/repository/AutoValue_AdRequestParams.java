package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.repository.AdRequestParams;

final class AutoValue_AdRequestParams extends AdRequestParams {
    private final String UBUniqueId;

    /* synthetic */ AutoValue_AdRequestParams(String str, byte b) {
        this(str);
    }

    private AutoValue_AdRequestParams(String str) {
        this.UBUniqueId = str;
    }

    public final String getUBUniqueId() {
        return this.UBUniqueId;
    }

    public final String toString() {
        return "AdRequestParams{UBUniqueId=" + this.UBUniqueId + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdRequestParams)) {
            return false;
        }
        String str = this.UBUniqueId;
        String uBUniqueId = ((AdRequestParams) obj).getUBUniqueId();
        if (str == null) {
            return uBUniqueId == null;
        }
        return str.equals(uBUniqueId);
    }

    public final int hashCode() {
        String str = this.UBUniqueId;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    static final class Builder extends AdRequestParams.Builder {
        private String UBUniqueId;

        Builder() {
        }

        public final AdRequestParams.Builder setUBUniqueId(String str) {
            this.UBUniqueId = str;
            return this;
        }

        public final AdRequestParams build() {
            return new AutoValue_AdRequestParams(this.UBUniqueId, (byte) 0);
        }
    }
}
