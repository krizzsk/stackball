package com.yandex.mobile.ads.impl;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;

public final class fy0 {

    /* renamed from: a */
    public byte[] f33778a;

    /* renamed from: b */
    private int f33779b;

    /* renamed from: c */
    private int f33780c;

    public fy0() {
        this.f33778a = ih1.f34863f;
    }

    /* renamed from: a */
    public void mo67102a(byte[] bArr) {
        int length = bArr.length;
        this.f33778a = bArr;
        this.f33780c = length;
        this.f33779b = 0;
    }

    /* renamed from: b */
    public int mo67105b() {
        return this.f33779b;
    }

    /* renamed from: c */
    public int mo67107c() {
        return this.f33780c;
    }

    /* renamed from: d */
    public void mo67110d(int i) {
        C13479j9.m37705a(i >= 0 && i <= this.f33778a.length);
        this.f33780c = i;
    }

    /* renamed from: e */
    public void mo67112e(int i) {
        C13479j9.m37705a(i >= 0 && i <= this.f33780c);
        this.f33779b = i;
    }

    /* renamed from: f */
    public void mo67114f(int i) {
        mo67112e(this.f33779b + i);
    }

    /* renamed from: g */
    public int mo67115g() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        byte b = (((bArr[i] & 255) << Ascii.CAN) >> 8) | ((bArr[i2] & 255) << 8);
        this.f33779b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: h */
    public String mo67116h() {
        if (mo67098a() == 0) {
            return null;
        }
        int i = this.f33779b;
        while (i < this.f33780c) {
            byte b = this.f33778a[i];
            int i2 = ih1.f34858a;
            if (b == 10 || b == 13) {
                break;
            }
            i++;
        }
        int i3 = this.f33779b;
        if (i - i3 >= 3) {
            byte[] bArr = this.f33778a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f33779b = i3 + 3;
            }
        }
        byte[] bArr2 = this.f33778a;
        int i4 = this.f33779b;
        String a = ih1.m37376a(bArr2, i4, i - i4);
        this.f33779b = i;
        int i5 = this.f33780c;
        if (i == i5) {
            return a;
        }
        byte[] bArr3 = this.f33778a;
        if (bArr3[i] == 13) {
            int i6 = i + 1;
            this.f33779b = i6;
            if (i6 == i5) {
                return a;
            }
        }
        int i7 = this.f33779b;
        if (bArr3[i7] == 10) {
            this.f33779b = i7 + 1;
        }
        return a;
    }

    /* renamed from: i */
    public int mo67117i() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f33779b = i4;
        byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
        this.f33779b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b2;
    }

    /* renamed from: j */
    public long mo67118j() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        int i4 = i3 + 1;
        this.f33779b = i4;
        int i5 = i4 + 1;
        this.f33779b = i5;
        int i6 = i5 + 1;
        this.f33779b = i6;
        int i7 = i6 + 1;
        this.f33779b = i7;
        int i8 = i7 + 1;
        this.f33779b = i8;
        this.f33779b = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: k */
    public long mo67119k() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        int i4 = i3 + 1;
        this.f33779b = i4;
        this.f33779b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: l */
    public int mo67120l() {
        int i = mo67117i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    /* renamed from: m */
    public int mo67121m() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        this.f33779b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: n */
    public long mo67122n() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        int i4 = i3 + 1;
        this.f33779b = i4;
        int i5 = i4 + 1;
        this.f33779b = i5;
        int i6 = i5 + 1;
        this.f33779b = i6;
        int i7 = i6 + 1;
        this.f33779b = i7;
        int i8 = i7 + 1;
        this.f33779b = i8;
        this.f33779b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: o */
    public String mo67123o() {
        if (mo67098a() == 0) {
            return null;
        }
        int i = this.f33779b;
        while (i < this.f33780c && this.f33778a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f33778a;
        int i2 = this.f33779b;
        String a = ih1.m37376a(bArr, i2, i - i2);
        this.f33779b = i;
        if (i < this.f33780c) {
            this.f33779b = i + 1;
        }
        return a;
    }

    /* renamed from: p */
    public short mo67124p() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        this.f33779b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: q */
    public int mo67125q() {
        return (mo67126r() << 21) | (mo67126r() << 14) | (mo67126r() << 7) | mo67126r();
    }

    /* renamed from: r */
    public int mo67126r() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        this.f33779b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: s */
    public int mo67127s() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f33779b = i3 + 2;
        return b;
    }

    /* renamed from: t */
    public long mo67128t() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = i2 + 1;
        this.f33779b = i3;
        int i4 = i3 + 1;
        this.f33779b = i4;
        this.f33779b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: u */
    public int mo67129u() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = (bArr[i] & 255) << Ascii.DLE;
        int i4 = i2 + 1;
        this.f33779b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f33779b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: v */
    public int mo67130v() {
        int f = mo67113f();
        if (f >= 0) {
            return f;
        }
        throw new IllegalStateException("Top bit not zero: " + f);
    }

    /* renamed from: w */
    public long mo67131w() {
        long n = mo67122n();
        if (n >= 0) {
            return n;
        }
        throw new IllegalStateException("Top bit not zero: " + n);
    }

    /* renamed from: x */
    public int mo67132x() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        this.f33779b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: y */
    public long mo67133y() {
        int i;
        int i2;
        long j = (long) this.f33778a[this.f33779b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f33778a[this.f33779b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f33779b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: z */
    public void mo67134z() {
        this.f33779b = 0;
        this.f33780c = 0;
    }

    /* renamed from: b */
    public String mo67106b(int i) {
        return mo67100a(i, Charset.forName("UTF-8"));
    }

    /* renamed from: c */
    public void mo67108c(int i) {
        byte[] bArr = this.f33778a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo67103a(bArr, i);
    }

    /* renamed from: f */
    public int mo67113f() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        int i2 = i + 1;
        this.f33779b = i2;
        int i3 = (bArr[i] & 255) << Ascii.CAN;
        int i4 = i2 + 1;
        this.f33779b = i4;
        byte b = i3 | ((bArr[i2] & 255) << Ascii.DLE);
        int i5 = i4 + 1;
        this.f33779b = i5;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        this.f33779b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    public fy0(int i) {
        this.f33778a = new byte[i];
        this.f33780c = i;
    }

    /* renamed from: d */
    public char mo67109d() {
        byte[] bArr = this.f33778a;
        int i = this.f33779b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: e */
    public int mo67111e() {
        return this.f33778a[this.f33779b] & 255;
    }

    /* renamed from: a */
    public void mo67103a(byte[] bArr, int i) {
        this.f33778a = bArr;
        this.f33780c = i;
        this.f33779b = 0;
    }

    public fy0(byte[] bArr) {
        this.f33778a = bArr;
        this.f33780c = bArr.length;
    }

    /* renamed from: a */
    public int mo67098a() {
        return this.f33780c - this.f33779b;
    }

    public fy0(byte[] bArr, int i) {
        this.f33778a = bArr;
        this.f33780c = i;
    }

    /* renamed from: a */
    public void mo67101a(ey0 ey0, int i) {
        mo67104a(ey0.f33187a, 0, i);
        ey0.mo66895c(0);
    }

    /* renamed from: a */
    public void mo67104a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f33778a, this.f33779b, bArr, i, i2);
        this.f33779b += i2;
    }

    /* renamed from: a */
    public String mo67100a(int i, Charset charset) {
        String str = new String(this.f33778a, this.f33779b, i, charset);
        this.f33779b += i;
        return str;
    }

    /* renamed from: a */
    public String mo67099a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f33779b;
        int i3 = (i2 + i) - 1;
        String a = ih1.m37376a(this.f33778a, i2, (i3 >= this.f33780c || this.f33778a[i3] != 0) ? i : i - 1);
        this.f33779b += i;
        return a;
    }
}
