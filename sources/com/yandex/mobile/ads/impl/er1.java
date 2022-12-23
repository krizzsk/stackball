package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.s71;

final class er1 implements v71 {

    /* renamed from: a */
    private final long f33054a;

    /* renamed from: b */
    private final int f33055b;

    /* renamed from: c */
    private final long f33056c;

    /* renamed from: d */
    private final long f33057d;

    /* renamed from: e */
    private final long f33058e;

    /* renamed from: f */
    private final long[] f33059f;

    private er1(long j, int i, long j2, long j3, long[] jArr) {
        this.f33054a = j;
        this.f33055b = i;
        this.f33056c = j2;
        this.f33059f = jArr;
        this.f33057d = j3;
        this.f33058e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: a */
    public static er1 m35723a(long j, long j2, so0 so0, fy0 fy0) {
        int v;
        long j3 = j;
        so0 so02 = so0;
        int i = so02.f40098g;
        int i2 = so02.f40095d;
        int f = fy0.mo67113f();
        if ((f & 1) != 1 || (v = fy0.mo67130v()) == 0) {
            return null;
        }
        long a = ih1.m37369a((long) v, ((long) i) * 1000000, (long) i2);
        if ((f & 6) != 6) {
            return new er1(j2, so02.f40094c, a, -1, (long[]) null);
        }
        long t = fy0.mo67128t();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) fy0.mo67126r();
        }
        if (j3 != -1) {
            long j4 = j2 + t;
            if (j3 != j4) {
                Log.w("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new er1(j2, so02.f40094c, a, t, jArr);
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        double d;
        if (!mo64897a()) {
            u71 u71 = new u71(0, this.f33054a + ((long) this.f33055b));
            return new s71.C14566a(u71, u71);
        }
        long j2 = this.f33056c;
        int i = ih1.f34858a;
        long max = Math.max(0, Math.min(j, j2));
        double d2 = (((double) max) * 100.0d) / ((double) this.f33056c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i2 = (int) d2;
                long[] jArr = this.f33059f;
                jArr.getClass();
                double d4 = (double) jArr[i2];
                if (i2 == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i2 + 1];
                }
                d3 = d4 + ((d2 - ((double) i2)) * (d - d4));
            }
        }
        u71 u712 = new u71(max, this.f33054a + Math.max((long) this.f33055b, Math.min(Math.round((d3 / 256.0d) * ((double) this.f33057d)), this.f33057d - 1)));
        return new s71.C14566a(u712, u712);
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f33056c;
    }

    /* renamed from: b */
    public long mo66337b() {
        return this.f33058e;
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return this.f33059f != null;
    }

    /* renamed from: a */
    public long mo66336a(long j) {
        long j2;
        long j3 = j - this.f33054a;
        if (!mo64897a() || j3 <= ((long) this.f33055b)) {
            return 0;
        }
        long[] jArr = this.f33059f;
        jArr.getClass();
        double d = (((double) j3) * 256.0d) / ((double) this.f33057d);
        int b = ih1.m37388b(jArr, (long) d, true, true);
        long j4 = this.f33056c;
        long j5 = (((long) b) * j4) / 100;
        long j6 = jArr[b];
        int i = b + 1;
        long j7 = (j4 * ((long) i)) / 100;
        if (b == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        return j5 + Math.round((j6 == j2 ? 0.0d : (d - ((double) j6)) / ((double) (j2 - j6))) * ((double) (j7 - j5)));
    }
}
