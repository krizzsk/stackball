package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

public class b50 {

    /* renamed from: a */
    private final RectF f31225a;

    /* renamed from: b */
    private final int f31226b;

    public b50(int i, RectF rectF) {
        this.f31226b = i;
        this.f31225a = rectF;
    }

    /* renamed from: a */
    public int mo65969a() {
        return this.f31226b;
    }

    /* renamed from: b */
    public RectF mo65970b() {
        return this.f31225a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b50.class != obj.getClass()) {
            return false;
        }
        b50 b50 = (b50) obj;
        if (this.f31226b != b50.f31226b) {
            return false;
        }
        RectF rectF = this.f31225a;
        if (rectF != null) {
            return rectF.equals(b50.f31225a);
        }
        if (b50.f31225a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        RectF rectF = this.f31225a;
        return ((rectF != null ? rectF.hashCode() : 0) * 31) + this.f31226b;
    }
}
