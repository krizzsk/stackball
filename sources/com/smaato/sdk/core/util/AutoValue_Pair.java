package com.smaato.sdk.core.util;

final class AutoValue_Pair<F, S> extends Pair<F, S> {
    private final F first;
    private final S second;

    AutoValue_Pair(F f, S s) {
        this.first = f;
        this.second = s;
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
            F f = this.first;
            if (f != null ? f.equals(pair.first()) : pair.first() == null) {
                S s = this.second;
                return s != null ? s.equals(pair.second()) : pair.second() == null;
            }
        }
    }

    public final int hashCode() {
        F f = this.first;
        int i = 0;
        int hashCode = ((f == null ? 0 : f.hashCode()) ^ 1000003) * 1000003;
        S s = this.second;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }
}
