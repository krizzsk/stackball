package com.smaato.sdk.util;

final class AutoValue_Pair<F, S> extends Pair<F, S> {
    private final F first;
    private final S second;

    AutoValue_Pair(F f, S s) {
        if (f != null) {
            this.first = f;
            if (s != null) {
                this.second = s;
                return;
            }
            throw new NullPointerException("Null second");
        }
        throw new NullPointerException("Null first");
    }

    public final F first() {
        return this.first;
    }

    public final S second() {
        return this.second;
    }

    public final String toString() {
        return "Pair{first=" + this.first + ", second=" + this.second + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return this.first.equals(pair.first()) && this.second.equals(pair.second());
        }
    }

    public final int hashCode() {
        return ((this.first.hashCode() ^ 1000003) * 1000003) ^ this.second.hashCode();
    }
}
