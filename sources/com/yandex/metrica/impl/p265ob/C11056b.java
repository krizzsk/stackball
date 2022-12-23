package com.yandex.metrica.impl.p265ob;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.b */
public final class C11056b {

    /* renamed from: a */
    private final byte[] f26546a;

    /* renamed from: b */
    private final int f26547b;

    /* renamed from: c */
    private int f26548c;

    /* renamed from: com.yandex.metrica.impl.ob.b$a */
    public static class C11057a extends IOException {
        C11057a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private C11056b(byte[] bArr, int i, int i2) {
        this.f26546a = bArr;
        this.f26548c = i;
        this.f26547b = i + i2;
    }

    /* renamed from: a */
    public static int m28527a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: a */
    public static int m28528a(C11169e eVar) {
        int a = eVar.mo61538a();
        eVar.f26754a = a;
        return m28531b(a) + a;
    }

    /* renamed from: b */
    public static int m28531b(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m28533b(int i, long j) {
        return m28534c(i) + m28527a(j);
    }

    /* renamed from: c */
    public static int m28535c(int i, int i2) {
        return m28534c(i) + m28531b(i2);
    }

    /* renamed from: d */
    public void mo62671d(int i) throws IOException {
        byte b = (byte) i;
        int i2 = this.f26548c;
        if (i2 != this.f26547b) {
            byte[] bArr = this.f26546a;
            this.f26548c = i2 + 1;
            bArr[i2] = b;
            return;
        }
        throw new C11057a(this.f26548c, this.f26547b);
    }

    /* renamed from: e */
    public void mo62675e(int i, int i2) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        mo62674e((i2 << 1) ^ (i2 >> 31));
    }

    /* renamed from: f */
    public void mo62677f(int i, int i2) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        mo62674e(i2);
    }

    /* renamed from: b */
    public static int m28532b(int i, int i2) {
        return m28534c(i) + m28531b((i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: c */
    public void mo62670c(int i, long j) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        mo62669b(j);
    }

    /* renamed from: e */
    public void mo62676e(int i, long j) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        mo62669b(j);
    }

    /* renamed from: a */
    public static C11056b m28530a(byte[] bArr, int i, int i2) {
        return new C11056b(bArr, i, i2);
    }

    /* renamed from: a */
    public static int m28520a(int i, double d) {
        return m28534c(i) + 8;
    }

    /* renamed from: c */
    public static int m28534c(int i) {
        return m28531b(C11256g.m29011a(i, 0));
    }

    /* renamed from: b */
    public void mo62667b(int i, boolean z) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        mo62671d(z ? 1 : 0);
    }

    /* renamed from: e */
    public void mo62674e(int i) throws IOException {
        while ((i & -128) != 0) {
            mo62671d((i & 127) | 128);
            i >>>= 7;
        }
        mo62671d(i);
    }

    /* renamed from: a */
    public static int m28522a(int i, long j) {
        return m28534c(i) + m28527a(j);
    }

    /* renamed from: b */
    public void mo62668b(int i, byte[] bArr) throws IOException {
        mo62674e(C11256g.m29011a(i, 2));
        mo62674e(bArr.length);
        mo62663a(bArr);
    }

    /* renamed from: a */
    public static int m28521a(int i, int i2) {
        return m28534c(i) + m28519a(i2);
    }

    /* renamed from: d */
    public void mo62672d(int i, int i2) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        if (i2 >= 0) {
            mo62674e(i2);
        } else {
            mo62669b((long) i2);
        }
    }

    /* renamed from: a */
    public static int m28525a(int i, boolean z) {
        return m28534c(i) + 1;
    }

    /* renamed from: a */
    public static int m28524a(int i, String str) {
        return m28534c(i) + m28529a(str);
    }

    /* renamed from: b */
    public void mo62664b(int i, double d) throws IOException {
        mo62674e(C11256g.m29011a(i, 1));
        long doubleToLongBits = Double.doubleToLongBits(d);
        mo62671d(((int) doubleToLongBits) & 255);
        mo62671d(((int) (doubleToLongBits >> 8)) & 255);
        mo62671d(((int) (doubleToLongBits >> 16)) & 255);
        mo62671d(((int) (doubleToLongBits >> 24)) & 255);
        mo62671d(((int) (doubleToLongBits >> 32)) & 255);
        mo62671d(((int) (doubleToLongBits >> 40)) & 255);
        mo62671d(((int) (doubleToLongBits >> 48)) & 255);
        mo62671d(((int) (doubleToLongBits >> 56)) & 255);
    }

    /* renamed from: a */
    public static int m28523a(int i, C11169e eVar) {
        int c = m28534c(i);
        int a = eVar.mo61538a();
        eVar.f26754a = a;
        return c + m28531b(a) + a;
    }

    /* renamed from: d */
    public void mo62673d(int i, long j) throws IOException {
        mo62674e(C11256g.m29011a(i, 0));
        mo62669b((j >> 63) ^ (j << 1));
    }

    /* renamed from: a */
    public static int m28526a(int i, byte[] bArr) {
        return m28534c(i) + m28531b(bArr.length) + bArr.length;
    }

    /* renamed from: a */
    public static int m28519a(int i) {
        if (i >= 0) {
            return m28531b(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m28529a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m28531b(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: b */
    public void mo62665b(int i, C11169e eVar) throws IOException {
        mo62674e(C11256g.m29011a(i, 2));
        if (eVar.f26754a < 0) {
            eVar.f26754a = eVar.mo61538a();
        }
        mo62674e(eVar.f26754a);
        eVar.mo61540a(this);
    }

    /* renamed from: a */
    public void mo62661a() {
        if (this.f26547b - this.f26548c != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    public void mo62663a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.f26547b;
        int i2 = this.f26548c;
        if (i - i2 >= length) {
            System.arraycopy(bArr, 0, this.f26546a, i2, length);
            this.f26548c += length;
            return;
        }
        throw new C11057a(this.f26548c, this.f26547b);
    }

    /* renamed from: b */
    public void mo62666b(int i, String str) throws IOException {
        mo62674e(C11256g.m29011a(i, 2));
        byte[] bytes = str.getBytes("UTF-8");
        mo62674e(bytes.length);
        mo62663a(bytes);
    }

    /* renamed from: b */
    public void mo62669b(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo62671d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo62671d((int) j);
    }

    /* renamed from: a */
    public void mo62662a(int i, float f) throws IOException {
        mo62674e(C11256g.m29011a(i, 5));
        int floatToIntBits = Float.floatToIntBits(f);
        mo62671d(floatToIntBits & 255);
        mo62671d((floatToIntBits >> 8) & 255);
        mo62671d((floatToIntBits >> 16) & 255);
        mo62671d((floatToIntBits >> 24) & 255);
    }
}
