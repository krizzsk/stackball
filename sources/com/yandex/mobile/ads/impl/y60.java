package com.yandex.mobile.ads.impl;

import java.util.List;

public class y60 {

    /* renamed from: a */
    private final List<oe0> f42788a;

    public y60(List<oe0> list) {
        this.f42788a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y60.class != obj.getClass()) {
            return false;
        }
        return this.f42788a.equals(((y60) obj).f42788a);
    }

    public int hashCode() {
        return this.f42788a.hashCode();
    }
}
