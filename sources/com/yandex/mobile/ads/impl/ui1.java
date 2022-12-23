package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.s71;

final class ui1 implements v71 {

    /* renamed from: a */
    private final long[] f40653a;

    /* renamed from: b */
    private final long[] f40654b;

    /* renamed from: c */
    private final long f40655c;

    /* renamed from: d */
    private final long f40656d;

    private ui1(long[] jArr, long[] jArr2, long j, long j2) {
        this.f40653a = jArr;
        this.f40654b = jArr2;
        this.f40655c = j;
        this.f40656d = j2;
    }

    /* renamed from: a */
    public static ui1 m42693a(long j, long j2, so0 so0, fy0 fy0) {
        int i;
        long j3 = j;
        so0 so02 = so0;
        fy0 fy02 = fy0;
        fy02.mo67114f(10);
        int f = fy0.mo67113f();
        if (f <= 0) {
            return null;
        }
        int i2 = so02.f40095d;
        long a = ih1.m37369a((long) f, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int x = fy0.mo67132x();
        int x2 = fy0.mo67132x();
        int x3 = fy0.mo67132x();
        fy02.mo67114f(2);
        long j4 = j2 + ((long) so02.f40094c);
        long[] jArr = new long[x];
        long[] jArr2 = new long[x];
        int i3 = 0;
        long j5 = j2;
        while (i3 < x) {
            int i4 = x2;
            jArr[i3] = (((long) i3) * a) / ((long) x);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (x3 == 1) {
                i = fy0.mo67126r();
            } else if (x3 == 2) {
                i = fy0.mo67132x();
            } else if (x3 == 3) {
                i = fy0.mo67129u();
            } else if (x3 != 4) {
                return null;
            } else {
                i = fy0.mo67130v();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            x2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new ui1(jArr, jArr2, a, j5);
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return true;
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        int b = ih1.m37388b(this.f40653a, j, true, true);
        long[] jArr = this.f40653a;
        long j2 = jArr[b];
        long[] jArr2 = this.f40654b;
        u71 u71 = new u71(j2, jArr2[b]);
        if (j2 >= j || b == jArr.length - 1) {
            return new s71.C14566a(u71, u71);
        }
        int i = b + 1;
        return new s71.C14566a(u71, new u71(jArr[i], jArr2[i]));
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f40655c;
    }

    /* renamed from: b */
    public long mo66337b() {
        return this.f40656d;
    }

    /* renamed from: a */
    public long mo66336a(long j) {
        return this.f40653a[ih1.m37388b(this.f40654b, j, true, true)];
    }
}
