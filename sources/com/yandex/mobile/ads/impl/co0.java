package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.impl.s71;

final class co0 implements v71 {

    /* renamed from: a */
    private final long[] f31984a;

    /* renamed from: b */
    private final long[] f31985b;

    /* renamed from: c */
    private final long f31986c;

    private co0(long[] jArr, long[] jArr2) {
        this.f31984a = jArr;
        this.f31985b = jArr2;
        this.f31986c = C12874dd.m35212a(jArr2[jArr2.length - 1]);
    }

    /* renamed from: a */
    public static co0 m34781a(long j, MlltFrame mlltFrame) {
        int length = mlltFrame.f29931f.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.f29929d + mlltFrame.f29931f[i3]);
            j2 += (long) (mlltFrame.f29930e + mlltFrame.f29932g[i3]);
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new co0(jArr, jArr2);
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return true;
    }

    /* renamed from: b */
    public long mo66337b() {
        return -1;
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        long j2 = this.f31986c;
        int i = ih1.f34858a;
        Pair<Long, Long> a = m34780a(C12874dd.m35213b(Math.max(0, Math.min(j, j2))), this.f31985b, this.f31984a);
        u71 u71 = new u71(C12874dd.m35212a(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new s71.C14566a(u71, u71);
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f31986c;
    }

    /* renamed from: a */
    public long mo66336a(long j) {
        return C12874dd.m35212a(((Long) m34780a(j, this.f31984a, this.f31985b).second).longValue());
    }

    /* renamed from: a */
    private static Pair<Long, Long> m34780a(long j, long[] jArr, long[] jArr2) {
        int b = ih1.m37388b(jArr, j, true, true);
        long j2 = jArr[b];
        long j3 = jArr2[b];
        int i = b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }
}
