package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.el */
public final class C9214el {

    /* renamed from: a */
    final C9432is f22626a;

    /* renamed from: a */
    static int m24663a(int i) {
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

    /* renamed from: a */
    static int m24665a(long j) {
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

    /* renamed from: b */
    static int m24666b(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b */
    static long m24667b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: a */
    static int m24664a(int i, C9192eg egVar) {
        return (i << 3) | egVar.f22590e;
    }

    public C9214el(C9432is isVar) {
        this.f22626a = isVar;
    }

    /* renamed from: a */
    public final void mo58009a(C9434iu iuVar) {
        this.f22626a.mo58384b(iuVar);
    }

    /* renamed from: c */
    public final void mo58010c(int i) {
        while ((i & -128) != 0) {
            this.f22626a.mo58398e((i & 127) | 128);
            i >>>= 7;
        }
        this.f22626a.mo58398e(i);
    }

    /* renamed from: c */
    public final void mo58011c(long j) {
        while ((-128 & j) != 0) {
            this.f22626a.mo58398e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f22626a.mo58398e((int) j);
    }

    /* renamed from: d */
    public final void mo58012d(int i) {
        this.f22626a.mo58394d(i);
    }

    /* renamed from: d */
    public final void mo58013d(long j) {
        this.f22626a.mo58401f(j);
    }
}
