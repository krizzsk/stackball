package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

final class dw0 {

    /* renamed from: a */
    private final ew0 f32789a = new ew0();

    /* renamed from: b */
    private final fy0 f32790b = new fy0(new byte[65025], 0);

    /* renamed from: c */
    private int f32791c = -1;

    /* renamed from: d */
    private int f32792d;

    /* renamed from: e */
    private boolean f32793e;

    dw0() {
    }

    /* renamed from: a */
    public boolean mo66707a(C13416ik ikVar) throws IOException, InterruptedException {
        int i;
        C13479j9.m37708b(ikVar != null);
        if (this.f32793e) {
            this.f32793e = false;
            this.f32790b.mo67134z();
        }
        while (!this.f32793e) {
            if (this.f32791c < 0) {
                if (!this.f32789a.mo66880a(ikVar, true)) {
                    return false;
                }
                ew0 ew0 = this.f32789a;
                int i2 = ew0.f33169d;
                if ((ew0.f33166a & 1) == 1 && this.f32790b.mo67107c() == 0) {
                    i2 += m35483a(0);
                    i = this.f32792d + 0;
                } else {
                    i = 0;
                }
                ikVar.mo67813d(i2);
                this.f32791c = i;
            }
            int a = m35483a(this.f32791c);
            int i3 = this.f32791c + this.f32792d;
            if (a > 0) {
                fy0 fy0 = this.f32790b;
                if (fy0.f33778a.length < fy0.mo67107c() + a) {
                    fy0 fy02 = this.f32790b;
                    fy02.f33778a = Arrays.copyOf(fy02.f33778a, fy02.mo67107c() + a);
                }
                fy0 fy03 = this.f32790b;
                ikVar.mo67809b(fy03.f33778a, fy03.mo67107c(), a, false);
                fy0 fy04 = this.f32790b;
                fy04.mo67110d(fy04.mo67107c() + a);
                this.f32793e = this.f32789a.f33171f[i3 + -1] != 255;
            }
            if (i3 == this.f32789a.f33168c) {
                i3 = -1;
            }
            this.f32791c = i3;
        }
        return true;
    }

    /* renamed from: b */
    public fy0 mo66708b() {
        return this.f32790b;
    }

    /* renamed from: c */
    public void mo66709c() {
        this.f32789a.mo66879a();
        this.f32790b.mo67134z();
        this.f32791c = -1;
        this.f32793e = false;
    }

    /* renamed from: d */
    public void mo66710d() {
        fy0 fy0 = this.f32790b;
        byte[] bArr = fy0.f33778a;
        if (bArr.length != 65025) {
            fy0.f33778a = Arrays.copyOf(bArr, Math.max(65025, fy0.mo67107c()));
        }
    }

    /* renamed from: a */
    public ew0 mo66706a() {
        return this.f32789a;
    }

    /* renamed from: a */
    private int m35483a(int i) {
        int i2;
        int i3 = 0;
        this.f32792d = 0;
        do {
            int i4 = this.f32792d;
            int i5 = i + i4;
            ew0 ew0 = this.f32789a;
            if (i5 >= ew0.f33168c) {
                break;
            }
            int[] iArr = ew0.f33171f;
            this.f32792d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
