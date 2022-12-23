package com.yandex.mobile.ads.impl;

public final class re0<T> implements b60<T>, xi0<T> {

    /* renamed from: a */
    private final T f39439a;

    private re0(T t) {
        this.f39439a = t;
    }

    /* renamed from: a */
    public static <T> b60<T> m41573a(T t) {
        if (t != null) {
            return new re0(t);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public T get() {
        return this.f39439a;
    }
}
