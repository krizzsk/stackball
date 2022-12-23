package com.smaato.sdk.iahb;

final class AutoValue_InAppBid extends InAppBid {
    private final String json;

    AutoValue_InAppBid(String str) {
        if (str != null) {
            this.json = str;
            return;
        }
        throw new NullPointerException("Null json");
    }

    /* access modifiers changed from: package-private */
    public final String getJson() {
        return this.json;
    }

    public final String toString() {
        return "InAppBid{json=" + this.json + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InAppBid) {
            return this.json.equals(((InAppBid) obj).getJson());
        }
        return false;
    }

    public final int hashCode() {
        return this.json.hashCode() ^ 1000003;
    }
}
