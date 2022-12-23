package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g10;

public final class by0 implements g10.C13157a {

    /* renamed from: a */
    private final int f31626a;

    public by0(int i) {
        this.f31626a = i;
    }

    /* renamed from: a */
    public final int mo66138a() {
        return this.f31626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by0) && this.f31626a == ((by0) obj).f31626a;
    }

    public int hashCode() {
        return this.f31626a;
    }

    public String toString() {
        return "PagerState(currentPageIndex=" + this.f31626a + ')';
    }
}
