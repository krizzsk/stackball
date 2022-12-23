package com.smaato.sdk.iahb;

import com.smaato.sdk.iahb.IahbExt;

final class AutoValue_IahbExt extends IahbExt {
    private final String adspaceid;
    private final String adtype;
    private final long expiresAt;

    /* synthetic */ AutoValue_IahbExt(String str, String str2, long j, byte b) {
        this(str, str2, j);
    }

    private AutoValue_IahbExt(String str, String str2, long j) {
        this.adspaceid = str;
        this.adtype = str2;
        this.expiresAt = j;
    }

    /* access modifiers changed from: package-private */
    public final String adspaceid() {
        return this.adspaceid;
    }

    /* access modifiers changed from: package-private */
    public final String adtype() {
        return this.adtype;
    }

    /* access modifiers changed from: package-private */
    public final long expiresAt() {
        return this.expiresAt;
    }

    public final String toString() {
        return "IahbExt{adspaceid=" + this.adspaceid + ", adtype=" + this.adtype + ", expiresAt=" + this.expiresAt + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IahbExt) {
            IahbExt iahbExt = (IahbExt) obj;
            return this.adspaceid.equals(iahbExt.adspaceid()) && this.adtype.equals(iahbExt.adtype()) && this.expiresAt == iahbExt.expiresAt();
        }
    }

    public final int hashCode() {
        long j = this.expiresAt;
        return ((((this.adspaceid.hashCode() ^ 1000003) * 1000003) ^ this.adtype.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends IahbExt.Builder {
        private String adspaceid;
        private String adtype;
        private Long expiresAt;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final IahbExt.Builder adspaceid(String str) {
            if (str != null) {
                this.adspaceid = str;
                return this;
            }
            throw new NullPointerException("Null adspaceid");
        }

        /* access modifiers changed from: package-private */
        public final IahbExt.Builder adtype(String str) {
            if (str != null) {
                this.adtype = str;
                return this;
            }
            throw new NullPointerException("Null adtype");
        }

        /* access modifiers changed from: package-private */
        public final IahbExt.Builder expiresAt(long j) {
            this.expiresAt = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final IahbExt autoBuild() {
            String str = "";
            if (this.adspaceid == null) {
                str = str + " adspaceid";
            }
            if (this.adtype == null) {
                str = str + " adtype";
            }
            if (this.expiresAt == null) {
                str = str + " expiresAt";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbExt(this.adspaceid, this.adtype, this.expiresAt.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
