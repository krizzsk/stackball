package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.nio.charset.Charset;

/* renamed from: com.tapjoy.internal.ir */
public final class C9431ir implements C9432is, C9433it, Cloneable {

    /* renamed from: c */
    private static final byte[] f23445c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C9440iy f23446a;

    /* renamed from: b */
    long f23447b;

    /* renamed from: a */
    public final C9432is mo58379a() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    /* renamed from: b */
    public final boolean mo58387b() {
        return this.f23447b == 0;
    }

    /* renamed from: a */
    public final void mo58380a(long j) {
        if (this.f23447b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public final byte mo58388c() {
        if (this.f23447b != 0) {
            C9440iy iyVar = this.f23446a;
            int i = iyVar.f23465b;
            int i2 = iyVar.f23466c;
            int i3 = i + 1;
            byte b = iyVar.f23464a[i];
            this.f23447b--;
            if (i3 == i2) {
                this.f23446a = iyVar.mo58423a();
                C9441iz.m25386a(iyVar);
            } else {
                iyVar.f23465b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: d */
    public final int mo58393d() {
        if (this.f23447b >= 4) {
            C9440iy iyVar = this.f23446a;
            int i = iyVar.f23465b;
            int i2 = iyVar.f23466c;
            if (i2 - i < 4) {
                return ((mo58388c() & 255) << Ascii.CAN) | ((mo58388c() & 255) << Ascii.DLE) | ((mo58388c() & 255) << 8) | (mo58388c() & 255);
            }
            byte[] bArr = iyVar.f23464a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f23447b -= 4;
            if (i6 == i2) {
                this.f23446a = iyVar.mo58423a();
                C9441iz.m25386a(iyVar);
            } else {
                iyVar.f23465b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f23447b);
    }

    /* renamed from: e */
    public final int mo58396e() {
        return C9448je.m25402a(mo58393d());
    }

    /* renamed from: b */
    public final C9434iu mo58386b(long j) {
        return new C9434iu(m25309g(j));
    }

    /* renamed from: c */
    public final String mo58390c(long j) {
        Charset charset = C9448je.f23478a;
        C9448je.m25404a(this.f23447b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C9440iy iyVar = this.f23446a;
            if (((long) iyVar.f23465b) + j > ((long) iyVar.f23466c)) {
                return new String(m25309g(j), charset);
            }
            String str = new String(iyVar.f23464a, iyVar.f23465b, (int) j, charset);
            iyVar.f23465b = (int) (((long) iyVar.f23465b) + j);
            this.f23447b -= j;
            if (iyVar.f23465b == iyVar.f23466c) {
                this.f23446a = iyVar.mo58423a();
                C9441iz.m25386a(iyVar);
            }
            return str;
        }
    }

    /* renamed from: g */
    public final byte[] mo58403g() {
        try {
            return m25309g(this.f23447b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    private byte[] m25309g(long j) {
        C9448je.m25404a(this.f23447b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            m25308a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: a */
    private void m25308a(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length) {
            int length = bArr.length - i2;
            C9448je.m25404a((long) bArr.length, (long) i2, (long) length);
            C9440iy iyVar = this.f23446a;
            if (iyVar == null) {
                i = -1;
            } else {
                i = Math.min(length, iyVar.f23466c - iyVar.f23465b);
                System.arraycopy(iyVar.f23464a, iyVar.f23465b, bArr, i2, i);
                iyVar.f23465b += i;
                this.f23447b -= (long) i;
                if (iyVar.f23465b == iyVar.f23466c) {
                    this.f23446a = iyVar.mo58423a();
                    C9441iz.m25386a(iyVar);
                }
            }
            if (i != -1) {
                i2 += i;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: d */
    public final void mo58395d(long j) {
        while (j > 0) {
            C9440iy iyVar = this.f23446a;
            if (iyVar != null) {
                int min = (int) Math.min(j, (long) (iyVar.f23466c - this.f23446a.f23465b));
                long j2 = (long) min;
                this.f23447b -= j2;
                j -= j2;
                this.f23446a.f23465b += min;
                if (this.f23446a.f23465b == this.f23446a.f23466c) {
                    C9440iy iyVar2 = this.f23446a;
                    this.f23446a = iyVar2.mo58423a();
                    C9441iz.m25386a(iyVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public final C9431ir mo58384b(C9434iu iuVar) {
        if (iuVar != null) {
            iuVar.mo58410a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public final C9431ir mo58385b(String str) {
        char c;
        char charAt;
        int length = str.length();
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (length < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
        } else if (length <= str.length()) {
            int i = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    C9440iy c2 = mo58389c(1);
                    byte[] bArr = c2.f23464a;
                    int i2 = c2.f23466c - i;
                    int min = Math.min(length, 8192 - i2);
                    int i3 = i + 1;
                    bArr[i + i2] = (byte) charAt2;
                    while (true) {
                        i = i3;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i4 = (i2 + i) - c2.f23466c;
                            c2.f23466c += i4;
                            this.f23447b += (long) i4;
                        } else {
                            i3 = i + 1;
                            bArr[i + i2] = (byte) charAt;
                        }
                    }
                    int i42 = (i2 + i) - c2.f23466c;
                    c2.f23466c += i42;
                    this.f23447b += (long) i42;
                } else {
                    if (charAt2 < 2048) {
                        mo58398e((charAt2 >> 6) | 192);
                        mo58398e((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        mo58398e((charAt2 >> 12) | 224);
                        mo58398e(((charAt2 >> 6) & 63) | 128);
                        mo58398e((int) (charAt2 & '?') | 128);
                    } else {
                        int i5 = i + 1;
                        if (i5 < length) {
                            c = str.charAt(i5);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            mo58398e(63);
                            i = i5;
                        } else {
                            int i6 = (((charAt2 & 10239) << 10) | (9215 & c)) + 0;
                            mo58398e((i6 >> 18) | 240);
                            mo58398e(((i6 >> 12) & 63) | 128);
                            mo58398e(((i6 >> 6) & 63) | 128);
                            mo58398e((i6 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
    }

    /* renamed from: a */
    public final C9431ir mo58378a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C9448je.m25404a((long) bArr.length, 0, j);
            int i3 = i2 + 0;
            while (i < i3) {
                C9440iy c = mo58389c(1);
                int min = Math.min(i3 - i, 8192 - c.f23466c);
                System.arraycopy(bArr, i, c.f23464a, c.f23466c, min);
                i += min;
                c.f23466c += min;
            }
            this.f23447b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final C9431ir mo58398e(int i) {
        C9440iy c = mo58389c(1);
        byte[] bArr = c.f23464a;
        int i2 = c.f23466c;
        c.f23466c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f23447b++;
        return this;
    }

    /* renamed from: b */
    public final C9431ir mo58394d(int i) {
        int a = C9448je.m25402a(i);
        C9440iy c = mo58389c(4);
        byte[] bArr = c.f23464a;
        int i2 = c.f23466c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((a >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((a >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((a >>> 8) & 255);
        bArr[i5] = (byte) (a & 255);
        c.f23466c = i5 + 1;
        this.f23447b += 4;
        return this;
    }

    /* renamed from: e */
    public final C9431ir mo58401f(long j) {
        long a = C9448je.m25403a(j);
        C9440iy c = mo58389c(8);
        byte[] bArr = c.f23464a;
        int i = c.f23466c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((a >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((a >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((a >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((a >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((a >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((a >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((a >>> 8) & 255));
        bArr[i8] = (byte) ((int) (a & 255));
        c.f23466c = i8 + 1;
        this.f23447b += 8;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C9440iy mo58389c(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C9440iy iyVar = this.f23446a;
        if (iyVar == null) {
            C9440iy a = C9441iz.m25385a();
            this.f23446a = a;
            a.f23470g = a;
            a.f23469f = a;
            return a;
        }
        C9440iy iyVar2 = iyVar.f23470g;
        return (iyVar2.f23466c + i > 8192 || !iyVar2.f23468e) ? iyVar2.mo58424a(C9441iz.m25385a()) : iyVar2;
    }

    /* renamed from: a */
    public final void mo58381a(C9431ir irVar, long j) {
        C9440iy iyVar;
        if (irVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (irVar != this) {
            C9448je.m25404a(irVar.f23447b, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (irVar.f23446a.f23466c - irVar.f23446a.f23465b))) {
                    C9440iy iyVar2 = this.f23446a;
                    C9440iy iyVar3 = iyVar2 != null ? iyVar2.f23470g : null;
                    if (iyVar3 != null && iyVar3.f23468e) {
                        if ((((long) iyVar3.f23466c) + j) - ((long) (iyVar3.f23467d ? 0 : iyVar3.f23465b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            irVar.f23446a.mo58425a(iyVar3, (int) j);
                            irVar.f23447b -= j;
                            this.f23447b += j;
                            return;
                        }
                    }
                    C9440iy iyVar4 = irVar.f23446a;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > iyVar4.f23466c - iyVar4.f23465b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        iyVar = new C9440iy(iyVar4);
                    } else {
                        iyVar = C9441iz.m25385a();
                        System.arraycopy(iyVar4.f23464a, iyVar4.f23465b, iyVar.f23464a, 0, i2);
                    }
                    iyVar.f23466c = iyVar.f23465b + i2;
                    iyVar4.f23465b += i2;
                    iyVar4.f23470g.mo58424a(iyVar);
                    irVar.f23446a = iyVar;
                }
                C9440iy iyVar5 = irVar.f23446a;
                long j2 = (long) (iyVar5.f23466c - iyVar5.f23465b);
                irVar.f23446a = iyVar5.mo58423a();
                C9440iy iyVar6 = this.f23446a;
                if (iyVar6 == null) {
                    this.f23446a = iyVar5;
                    iyVar5.f23470g = iyVar5;
                    iyVar5.f23469f = iyVar5;
                } else {
                    C9440iy a = iyVar6.f23470g.mo58424a(iyVar5);
                    if (a.f23470g == a) {
                        throw new IllegalStateException();
                    } else if (a.f23470g.f23468e) {
                        int i3 = a.f23466c - a.f23465b;
                        int i4 = 8192 - a.f23470g.f23466c;
                        if (!a.f23470g.f23467d) {
                            i = a.f23470g.f23465b;
                        }
                        if (i3 <= i4 + i) {
                            a.mo58425a(a.f23470g, i3);
                            a.mo58423a();
                            C9441iz.m25386a(a);
                        }
                    }
                }
                irVar.f23447b -= j2;
                this.f23447b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: b */
    public final long mo58382b(C9431ir irVar, long j) {
        if (irVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f23447b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            irVar.mo58381a(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9431ir)) {
            return false;
        }
        C9431ir irVar = (C9431ir) obj;
        long j = this.f23447b;
        if (j != irVar.f23447b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C9440iy iyVar = this.f23446a;
        C9440iy iyVar2 = irVar.f23446a;
        int i = iyVar.f23465b;
        int i2 = iyVar2.f23465b;
        while (j2 < this.f23447b) {
            long min = (long) Math.min(iyVar.f23466c - i, iyVar2.f23466c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (iyVar.f23464a[i] != iyVar2.f23464a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == iyVar.f23466c) {
                iyVar = iyVar.f23469f;
                i = iyVar.f23465b;
            }
            if (i2 == iyVar2.f23466c) {
                iyVar2 = iyVar2.f23469f;
                i2 = iyVar2.f23465b;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        C9440iy iyVar = this.f23446a;
        if (iyVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = iyVar.f23466c;
            for (int i3 = iyVar.f23465b; i3 < i2; i3++) {
                i = (i * 31) + iyVar.f23464a[i3];
            }
            iyVar = iyVar.f23469f;
        } while (iyVar != this.f23446a);
        return i;
    }

    /* renamed from: h */
    public final C9431ir clone() {
        C9431ir irVar = new C9431ir();
        if (this.f23447b == 0) {
            return irVar;
        }
        C9440iy iyVar = new C9440iy(this.f23446a);
        irVar.f23446a = iyVar;
        iyVar.f23470g = iyVar;
        iyVar.f23469f = iyVar;
        C9440iy iyVar2 = this.f23446a;
        while (true) {
            iyVar2 = iyVar2.f23469f;
            if (iyVar2 != this.f23446a) {
                irVar.f23446a.f23470g.mo58424a(new C9440iy(iyVar2));
            } else {
                irVar.f23447b = this.f23447b;
                return irVar;
            }
        }
    }

    /* renamed from: f */
    public final long mo58400f() {
        long j;
        if (this.f23447b >= 8) {
            C9440iy iyVar = this.f23446a;
            int i = iyVar.f23465b;
            int i2 = iyVar.f23466c;
            if (i2 - i < 8) {
                j = ((((long) mo58393d()) & 4294967295L) << 32) | (4294967295L & ((long) mo58393d()));
            } else {
                byte[] bArr = iyVar.f23464a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                long j2 = (((long) bArr[i9]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
                this.f23447b -= 8;
                if (i10 == i2) {
                    this.f23446a = iyVar.mo58423a();
                    C9441iz.m25386a(iyVar);
                } else {
                    iyVar.f23465b = i10;
                }
                j = j2;
            }
            return C9448je.m25403a(j);
        }
        throw new IllegalStateException("size < 8: " + this.f23447b);
    }

    public final String toString() {
        C9434iu iuVar;
        long j = this.f23447b;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                iuVar = C9434iu.f23449b;
            } else {
                iuVar = new C9443ja(this, i);
            }
            return iuVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f23447b);
    }
}
