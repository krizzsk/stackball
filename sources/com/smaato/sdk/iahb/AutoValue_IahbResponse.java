package com.smaato.sdk.iahb;

import com.smaato.sdk.iahb.IahbResponse;

final class AutoValue_IahbResponse extends IahbResponse {
    private final IahbBid bid;
    private final String bidId;

    /* synthetic */ AutoValue_IahbResponse(String str, IahbBid iahbBid, byte b) {
        this(str, iahbBid);
    }

    private AutoValue_IahbResponse(String str, IahbBid iahbBid) {
        this.bidId = str;
        this.bid = iahbBid;
    }

    /* access modifiers changed from: package-private */
    public final String bidId() {
        return this.bidId;
    }

    /* access modifiers changed from: package-private */
    public final IahbBid bid() {
        return this.bid;
    }

    public final String toString() {
        return "IahbResponse{bidId=" + this.bidId + ", bid=" + this.bid + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IahbResponse) {
            IahbResponse iahbResponse = (IahbResponse) obj;
            return this.bidId.equals(iahbResponse.bidId()) && this.bid.equals(iahbResponse.bid());
        }
    }

    public final int hashCode() {
        return ((this.bidId.hashCode() ^ 1000003) * 1000003) ^ this.bid.hashCode();
    }

    static final class Builder extends IahbResponse.Builder {
        private IahbBid bid;
        private String bidId;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final IahbResponse.Builder bidId(String str) {
            if (str != null) {
                this.bidId = str;
                return this;
            }
            throw new NullPointerException("Null bidId");
        }

        /* access modifiers changed from: package-private */
        public final IahbResponse.Builder bid(IahbBid iahbBid) {
            if (iahbBid != null) {
                this.bid = iahbBid;
                return this;
            }
            throw new NullPointerException("Null bid");
        }

        /* access modifiers changed from: package-private */
        public final IahbResponse build() {
            String str = "";
            if (this.bidId == null) {
                str = str + " bidId";
            }
            if (this.bid == null) {
                str = str + " bid";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbResponse(this.bidId, this.bid, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
