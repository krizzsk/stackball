package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.sk */
public class C14602sk {

    /* renamed from: a */
    private int f40010a;

    /* renamed from: b */
    private int f40011b;

    /* renamed from: c */
    private final int f40012c;

    /* renamed from: d */
    private final float f40013d;

    public C14602sk() {
        this(2500, 1, 1.0f);
    }

    /* renamed from: a */
    public int mo70002a() {
        return this.f40011b;
    }

    /* renamed from: b */
    public int mo70004b() {
        return this.f40010a;
    }

    public C14602sk(int i, int i2, float f) {
        this.f40010a = i;
        this.f40012c = i2;
        this.f40013d = f;
    }

    /* renamed from: a */
    public void mo70003a(op1 op1) throws op1 {
        boolean z = true;
        int i = this.f40011b + 1;
        this.f40011b = i;
        int i2 = this.f40010a;
        this.f40010a = i2 + ((int) (((float) i2) * this.f40013d));
        if (i > this.f40012c) {
            z = false;
        }
        if (!z) {
            throw op1;
        }
    }
}
