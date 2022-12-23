package com.smaato.sdk.util;

public abstract class Pair<F, S> {
    public abstract F first();

    public abstract S second();

    /* renamed from: of */
    public static <F, S> Pair<F, S> m24105of(F f, S s) {
        if (f == null) {
            throw new NullPointerException("'first' specified as non-null is null");
        } else if (s != null) {
            return new AutoValue_Pair(f, s);
        } else {
            throw new NullPointerException("'second' specified as non-null is null");
        }
    }
}
