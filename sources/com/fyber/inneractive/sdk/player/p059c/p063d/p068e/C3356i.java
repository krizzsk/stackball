package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.i */
final class C3356i {

    /* renamed from: a */
    int f8889a;

    /* renamed from: b */
    int f8890b;

    /* renamed from: c */
    private final byte[] f8891c;

    /* renamed from: d */
    private final int f8892d;

    public C3356i(byte[] bArr) {
        this.f8891c = bArr;
        this.f8892d = bArr.length;
    }

    /* renamed from: a */
    public final boolean mo19154a() {
        boolean z = (((this.f8891c[this.f8889a] & 255) >> this.f8890b) & 1) == 1;
        mo19155b(1);
        return z;
    }

    /* renamed from: a */
    public final int mo19153a(int i) {
        int i2 = this.f8889a;
        int min = Math.min(i, 8 - this.f8890b);
        int i3 = i2 + 1;
        int i4 = ((this.f8891c[i2] & 255) >> this.f8890b) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f8891c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo19155b(i);
        return i5;
    }

    /* renamed from: b */
    public final void mo19155b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f8889a + i3;
        this.f8889a = i4;
        int i5 = this.f8890b + (i - (i3 * 8));
        this.f8890b = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f8889a = i4 + 1;
            this.f8890b = i5 - 8;
        }
        int i6 = this.f8889a;
        if (i6 < 0 || (i6 >= (i2 = this.f8892d) && !(i6 == i2 && this.f8890b == 0))) {
            z = false;
        }
        C3535a.m8784b(z);
    }
}
