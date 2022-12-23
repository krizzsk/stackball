package com.yandex.mobile.ads.impl;

import java.util.Arrays;

final class mq0 {

    /* renamed from: a */
    private final int f37482a;

    /* renamed from: b */
    private boolean f37483b;

    /* renamed from: c */
    private boolean f37484c;

    /* renamed from: d */
    public byte[] f37485d;

    /* renamed from: e */
    public int f37486e;

    public mq0(int i, int i2) {
        this.f37482a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f37485d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public boolean mo68848a() {
        return this.f37484c;
    }

    /* renamed from: b */
    public void mo68850b() {
        this.f37483b = false;
        this.f37484c = false;
    }

    /* renamed from: a */
    public void mo68847a(byte[] bArr, int i, int i2) {
        if (this.f37483b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f37485d;
            int length = bArr2.length;
            int i4 = this.f37486e + i3;
            if (length < i4) {
                this.f37485d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f37485d, this.f37486e, i3);
            this.f37486e += i3;
        }
    }

    /* renamed from: b */
    public void mo68851b(int i) {
        boolean z = true;
        C13479j9.m37708b(!this.f37483b);
        if (i != this.f37482a) {
            z = false;
        }
        this.f37483b = z;
        if (z) {
            this.f37486e = 3;
            this.f37484c = false;
        }
    }

    /* renamed from: a */
    public boolean mo68849a(int i) {
        if (!this.f37483b) {
            return false;
        }
        this.f37486e -= i;
        this.f37483b = false;
        this.f37484c = true;
        return true;
    }
}
