package com.smaato.sdk.iahb;

abstract class IahbResponse {
    /* access modifiers changed from: package-private */
    public abstract IahbBid bid();

    /* access modifiers changed from: package-private */
    public abstract String bidId();

    IahbResponse() {
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract Builder bid(IahbBid iahbBid);

        /* access modifiers changed from: package-private */
        public abstract Builder bidId(String str);

        /* access modifiers changed from: package-private */
        public abstract IahbResponse build();

        Builder() {
        }
    }
}
