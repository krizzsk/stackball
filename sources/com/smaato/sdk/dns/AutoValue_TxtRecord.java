package com.smaato.sdk.dns;

final class AutoValue_TxtRecord extends TxtRecord {
    private final String data;
    private final int ttl;

    AutoValue_TxtRecord(String str, int i) {
        if (str != null) {
            this.data = str;
            this.ttl = i;
            return;
        }
        throw new NullPointerException("Null data");
    }

    public final String data() {
        return this.data;
    }

    public final int ttl() {
        return this.ttl;
    }

    public final String toString() {
        return "TxtRecord{data=" + this.data + ", ttl=" + this.ttl + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TxtRecord) {
            TxtRecord txtRecord = (TxtRecord) obj;
            return this.data.equals(txtRecord.data()) && this.ttl == txtRecord.ttl();
        }
    }

    public final int hashCode() {
        return ((this.data.hashCode() ^ 1000003) * 1000003) ^ this.ttl;
    }
}
