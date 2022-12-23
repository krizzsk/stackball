package com.yandex.mobile.ads.impl;

class pc1 {

    /* renamed from: a */
    private final int f38581a;

    /* renamed from: b */
    private int f38582b = -1;

    /* renamed from: c */
    private int f38583c = -1;

    /* renamed from: d */
    private int[] f38584d;

    /* renamed from: e */
    private final C14270a f38585e;

    /* renamed from: com.yandex.mobile.ads.impl.pc1$a */
    interface C14270a {
        /* renamed from: a */
        int mo65552a(int i);
    }

    pc1(int i, C14270a aVar) {
        this.f38581a = i;
        this.f38585e = aVar;
        this.f38584d = new int[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo69349a() {
        if (this.f38582b < 0) {
            this.f38582b = this.f38585e.mo65552a(0);
        }
        return this.f38582b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo69351b() {
        if (this.f38583c < 0) {
            int a = mo69349a();
            for (int i = 1; i < this.f38581a; i++) {
                a = Math.max(a, this.f38585e.mo65552a(i));
            }
            this.f38583c = a;
        }
        return this.f38583c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo69350a(int i) {
        int i2 = this.f38581a;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0) {
            return mo69350a(0);
        }
        if (i >= i2) {
            return mo69350a(i2);
        }
        int[] iArr = this.f38584d;
        if (iArr[i] <= 0) {
            iArr[i] = this.f38585e.mo65552a(i);
        }
        return this.f38584d[i];
    }
}
