package com.smaato.sdk.iahb;

import com.smaato.sdk.log.Logger;

abstract class IahbBid {
    /* access modifiers changed from: package-private */
    public abstract String adm();

    /* access modifiers changed from: package-private */
    public abstract IahbExt ext();

    IahbBid() {
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract Builder adm(String str);

        /* access modifiers changed from: package-private */
        public abstract IahbBid autoBuild();

        /* access modifiers changed from: package-private */
        public abstract Builder ext(IahbExt iahbExt);

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final IahbBid build() {
            try {
                return autoBuild();
            } catch (IllegalStateException e) {
                Logger.m24077e(e.getMessage(), new Object[0]);
                return null;
            }
        }
    }
}
