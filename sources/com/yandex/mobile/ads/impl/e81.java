package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public final class e81 {

    /* renamed from: a */
    private int f32924a;

    /* renamed from: b */
    private final int[] f32925b = new int[10];

    /* renamed from: a */
    public final int mo66776a() {
        if ((this.f32924a & 2) != 0) {
            return this.f32925b[1];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo66780b() {
        if ((this.f32924a & 128) != 0) {
            return this.f32925b[7];
        }
        return 65535;
    }

    /* renamed from: c */
    public final boolean mo66783c(int i) {
        return ((1 << i) & this.f32924a) != 0;
    }

    /* renamed from: d */
    public final int mo66784d() {
        return Integer.bitCount(this.f32924a);
    }

    /* renamed from: a */
    public final e81 mo66778a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f32925b;
            if (i < iArr.length) {
                this.f32924a = (1 << i) | this.f32924a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: b */
    public final int mo66781b(int i) {
        return (this.f32924a & 32) != 0 ? this.f32925b[5] : i;
    }

    /* renamed from: c */
    public final int mo66782c() {
        if ((this.f32924a & 16) != 0) {
            return this.f32925b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final void mo66779a(e81 e81) {
        Intrinsics.checkNotNullParameter(e81, "other");
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean z = true;
            if (((1 << i) & e81.f32924a) == 0) {
                z = false;
            }
            if (z) {
                mo66778a(i, e81.f32925b[i]);
            }
            if (i2 < 10) {
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo66777a(int i) {
        return this.f32925b[i];
    }
}
