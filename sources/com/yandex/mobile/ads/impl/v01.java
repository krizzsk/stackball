package com.yandex.mobile.ads.impl;

public final class v01 {
    /* renamed from: a */
    public static <T> T m43011a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static <T> void m43012a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }
}
