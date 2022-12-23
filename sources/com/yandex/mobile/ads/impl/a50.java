package com.yandex.mobile.ads.impl;

public abstract class a50<T> {

    /* renamed from: a */
    private final String f30448a;

    /* renamed from: b */
    private T f30449b;

    a50(String str, T t) {
        this.f30448a = str;
        this.f30449b = t;
    }

    /* renamed from: a */
    public T mo65678a() {
        return this.f30449b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f30448a.equals(((a50) obj).f30448a);
    }

    public int hashCode() {
        return this.f30448a.hashCode();
    }
}
