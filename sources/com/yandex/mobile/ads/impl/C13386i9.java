package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.i9 */
public class C13386i9 {

    /* renamed from: a */
    private final float f34767a;

    public C13386i9(float f) {
        this.f34767a = f == 0.0f ? 1.7777778f : f;
    }

    /* renamed from: a */
    public int mo67752a(int i) {
        return Math.round(((float) i) / this.f34767a);
    }

    /* renamed from: b */
    public int mo67753b(int i) {
        return Math.round(((float) i) * this.f34767a);
    }
}
