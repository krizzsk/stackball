package com.smaato.sdk.iahb;

abstract class IahbExt {
    /* access modifiers changed from: package-private */
    public abstract String adspaceid();

    /* access modifiers changed from: package-private */
    public abstract String adtype();

    /* access modifiers changed from: package-private */
    public abstract long expiresAt();

    IahbExt() {
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract Builder adspaceid(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder adtype(String str);

        /* access modifiers changed from: package-private */
        public abstract IahbExt autoBuild();

        /* access modifiers changed from: package-private */
        public abstract Builder expiresAt(long j);

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final IahbExt build() {
            try {
                return autoBuild();
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }
}
