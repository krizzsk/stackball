package com.fyber.inneractive.sdk.player.p059c.p080k;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.k */
public final class C3548k {

    /* renamed from: a */
    public byte[] f9625a;

    /* renamed from: b */
    public int f9626b;

    /* renamed from: c */
    public int f9627c;

    public C3548k() {
    }

    public C3548k(int i) {
        this.f9625a = new byte[i];
        this.f9627c = i;
    }

    public C3548k(byte[] bArr) {
        this.f9625a = bArr;
        this.f9627c = bArr.length;
    }

    public C3548k(byte[] bArr, int i) {
        this.f9625a = bArr;
        this.f9627c = i;
    }

    /* renamed from: a */
    public final void mo19379a(int i) {
        mo19381a(mo19385c() < i ? new byte[i] : this.f9625a, i);
    }

    /* renamed from: a */
    public final void mo19381a(byte[] bArr, int i) {
        this.f9625a = bArr;
        this.f9627c = i;
        this.f9626b = 0;
    }

    /* renamed from: a */
    public final void mo19378a() {
        this.f9626b = 0;
        this.f9627c = 0;
    }

    /* renamed from: b */
    public final int mo19383b() {
        return this.f9627c - this.f9626b;
    }

    /* renamed from: b */
    public final void mo19384b(int i) {
        C3535a.m8782a(i >= 0 && i <= this.f9625a.length);
        this.f9627c = i;
    }

    /* renamed from: c */
    public final int mo19385c() {
        byte[] bArr = this.f9625a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final void mo19386c(int i) {
        C3535a.m8782a(i >= 0 && i <= this.f9627c);
        this.f9626b = i;
    }

    /* renamed from: d */
    public final void mo19388d(int i) {
        mo19386c(this.f9626b + i);
    }

    /* renamed from: a */
    public final void mo19380a(C3547j jVar, int i) {
        mo19382a(jVar.f9621a, 0, i);
        jVar.mo19374a(0);
    }

    /* renamed from: a */
    public final void mo19382a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f9625a, this.f9626b, bArr, i, i2);
        this.f9626b += i2;
    }

    /* renamed from: d */
    public final int mo19387d() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        this.f9626b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: e */
    public final int mo19389e() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        this.f9626b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: f */
    public final int mo19391f() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        this.f9626b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: g */
    public final int mo19393g() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        int i3 = (bArr[i] & 255) << Ascii.DLE;
        int i4 = i2 + 1;
        this.f9626b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f9626b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: h */
    public final long mo19394h() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        int i3 = i2 + 1;
        this.f9626b = i3;
        int i4 = i3 + 1;
        this.f9626b = i4;
        this.f9626b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: i */
    public final long mo19395i() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        int i3 = i2 + 1;
        this.f9626b = i3;
        int i4 = i3 + 1;
        this.f9626b = i4;
        this.f9626b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: j */
    public final int mo19396j() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        int i3 = (bArr[i] & 255) << Ascii.CAN;
        int i4 = i2 + 1;
        this.f9626b = i4;
        byte b = i3 | ((bArr[i2] & 255) << Ascii.DLE);
        int i5 = i4 + 1;
        this.f9626b = i5;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        this.f9626b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    /* renamed from: k */
    public final int mo19397k() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        int i3 = i2 + 1;
        this.f9626b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f9626b = i4;
        byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
        this.f9626b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b2;
    }

    /* renamed from: l */
    public final long mo19398l() {
        byte[] bArr = this.f9625a;
        int i = this.f9626b;
        int i2 = i + 1;
        this.f9626b = i2;
        int i3 = i2 + 1;
        this.f9626b = i3;
        int i4 = i3 + 1;
        this.f9626b = i4;
        int i5 = i4 + 1;
        this.f9626b = i5;
        int i6 = i5 + 1;
        this.f9626b = i6;
        int i7 = i6 + 1;
        this.f9626b = i7;
        int i8 = i7 + 1;
        this.f9626b = i8;
        this.f9626b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: m */
    public final int mo19399m() {
        return (mo19387d() << 21) | (mo19387d() << 14) | (mo19387d() << 7) | mo19387d();
    }

    /* renamed from: n */
    public final int mo19400n() {
        int j = mo19396j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    /* renamed from: o */
    public final int mo19401o() {
        int k = mo19397k();
        if (k >= 0) {
            return k;
        }
        throw new IllegalStateException("Top bit not zero: " + k);
    }

    /* renamed from: p */
    public final long mo19402p() {
        long l = mo19398l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    /* renamed from: e */
    public final String mo19390e(int i) {
        String str = new String(this.f9625a, this.f9626b, i, Charset.defaultCharset());
        this.f9626b += i;
        return str;
    }

    /* renamed from: f */
    public final String mo19392f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f9626b + i) - 1;
        String str = new String(this.f9625a, this.f9626b, (i2 >= this.f9627c || this.f9625a[i2] != 0) ? i : i - 1);
        this.f9626b += i;
        return str;
    }

    /* renamed from: q */
    public final String mo19403q() {
        if (mo19383b() == 0) {
            return null;
        }
        int i = this.f9626b;
        while (i < this.f9627c && this.f9625a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f9625a;
        int i2 = this.f9626b;
        String str = new String(bArr, i2, i - i2);
        this.f9626b = i;
        if (i < this.f9627c) {
            this.f9626b = i + 1;
        }
        return str;
    }
}
