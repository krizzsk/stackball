package com.yandex.mobile.ads.impl;

public final class tp1 {

    /* renamed from: a */
    private final byte[] f40414a;

    /* renamed from: b */
    private final int f40415b;

    /* renamed from: c */
    private int f40416c;

    /* renamed from: d */
    private int f40417d;

    public tp1(byte[] bArr) {
        this.f40414a = bArr;
        this.f40415b = bArr.length;
    }

    /* renamed from: a */
    public int mo70212a(int i) {
        int i2 = this.f40416c;
        int min = Math.min(i, 8 - this.f40417d);
        int i3 = i2 + 1;
        int i4 = ((this.f40414a[i2] & 255) >> this.f40417d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f40414a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo70213b(i);
        return i5;
    }

    /* renamed from: b */
    public boolean mo70214b() {
        boolean z = (((this.f40414a[this.f40416c] & 255) >> this.f40417d) & 1) == 1;
        mo70213b(1);
        return z;
    }

    /* renamed from: b */
    public void mo70213b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f40416c + i3;
        this.f40416c = i4;
        int i5 = this.f40417d + (i - (i3 * 8));
        this.f40417d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f40416c = i4 + 1;
            this.f40417d = i5 - 8;
        }
        int i6 = this.f40416c;
        if (i6 < 0 || (i6 >= (i2 = this.f40415b) && !(i6 == i2 && this.f40417d == 0))) {
            z = false;
        }
        C13479j9.m37708b(z);
    }

    /* renamed from: a */
    public int mo70211a() {
        return (this.f40416c * 8) + this.f40417d;
    }
}
