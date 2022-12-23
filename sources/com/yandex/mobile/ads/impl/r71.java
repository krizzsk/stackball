package com.yandex.mobile.ads.impl;

import androidx.core.view.InputDeviceCompat;
import com.yandex.mobile.ads.impl.tf1;

public final class r71 implements tf1 {

    /* renamed from: a */
    private final q71 f39375a;

    /* renamed from: b */
    private final fy0 f39376b = new fy0(32);

    /* renamed from: c */
    private int f39377c;

    /* renamed from: d */
    private int f39378d;

    /* renamed from: e */
    private boolean f39379e;

    /* renamed from: f */
    private boolean f39380f;

    public r71(q71 q71) {
        this.f39375a = q71;
    }

    /* renamed from: a */
    public void mo66378a(de1 de1, x50 x50, tf1.C14678d dVar) {
        this.f39375a.mo69504a(de1, x50, dVar);
        this.f39380f = true;
    }

    /* renamed from: a */
    public void mo66377a() {
        this.f39380f = true;
    }

    /* renamed from: a */
    public void mo66379a(fy0 fy0, int i) {
        boolean z = (i & 1) != 0;
        int b = z ? fy0.mo67105b() + fy0.mo67126r() : -1;
        if (this.f39380f) {
            if (z) {
                this.f39380f = false;
                fy0.mo67112e(b);
                this.f39378d = 0;
            } else {
                return;
            }
        }
        while (fy0.mo67098a() > 0) {
            int i2 = this.f39378d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int r = fy0.mo67126r();
                    fy0.mo67112e(fy0.mo67105b() - 1);
                    if (r == 255) {
                        this.f39380f = true;
                        return;
                    }
                }
                int min = Math.min(fy0.mo67098a(), 3 - this.f39378d);
                fy0.mo67104a(this.f39376b.f33778a, this.f39378d, min);
                int i3 = this.f39378d + min;
                this.f39378d = i3;
                if (i3 == 3) {
                    this.f39376b.mo67108c(3);
                    this.f39376b.mo67114f(1);
                    int r2 = this.f39376b.mo67126r();
                    int r3 = this.f39376b.mo67126r();
                    this.f39379e = (r2 & 128) != 0;
                    int i4 = (((r2 & 15) << 8) | r3) + 3;
                    this.f39377c = i4;
                    fy0 fy02 = this.f39376b;
                    byte[] bArr = fy02.f33778a;
                    if (bArr.length < i4) {
                        fy02.mo67108c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f39376b.f33778a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(fy0.mo67098a(), this.f39377c - this.f39378d);
                fy0.mo67104a(this.f39376b.f33778a, this.f39378d, min2);
                int i5 = this.f39378d + min2;
                this.f39378d = i5;
                int i6 = this.f39377c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f39379e) {
                        this.f39376b.mo67108c(i6);
                    } else if (ih1.m37367a(this.f39376b.f33778a, 0, i6, -1) != 0) {
                        this.f39380f = true;
                        return;
                    } else {
                        this.f39376b.mo67108c(this.f39377c - 4);
                    }
                    this.f39375a.mo69505a(this.f39376b);
                    this.f39378d = 0;
                }
            }
        }
    }
}
