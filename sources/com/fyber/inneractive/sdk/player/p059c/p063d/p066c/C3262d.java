package com.fyber.inneractive.sdk.player.p059c.p063d.p066c;

import com.fyber.inneractive.sdk.player.p059c.p063d.p066c.C3258b;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.c.d */
final class C3262d implements C3258b.C3260a {

    /* renamed from: a */
    private final long f8333a;

    /* renamed from: b */
    private final long f8334b;

    /* renamed from: c */
    private final long f8335c;

    /* renamed from: d */
    private final long[] f8336d;

    /* renamed from: e */
    private final long f8337e;

    /* renamed from: f */
    private final int f8338f;

    C3262d(long j, long j2, long j3) {
        this(j, j2, j3, (long[]) null, 0, 0);
    }

    C3262d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f8333a = j;
        this.f8334b = j2;
        this.f8335c = j3;
        this.f8336d = jArr;
        this.f8337e = j4;
        this.f8338f = i;
    }

    /* renamed from: b_ */
    public final boolean mo18995b_() {
        return this.f8336d != null;
    }

    /* renamed from: a */
    public final long mo18993a(long j) {
        if (!mo18995b_()) {
            return this.f8333a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f8334b);
        float f2 = 256.0f;
        float f3 = 0.0f;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            if (i != 0) {
                f3 = (float) this.f8336d[i - 1];
            }
            if (i < 99) {
                f2 = (float) this.f8336d[i];
            }
            f2 = ((f2 - f3) * (f - ((float) i))) + f3;
        }
        long round = Math.round(((double) f2) * 0.00390625d * ((double) this.f8337e));
        long j2 = this.f8333a;
        long j3 = round + j2;
        long j4 = this.f8335c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - ((long) this.f8338f)) + this.f8337e) - 1);
    }

    /* renamed from: b */
    public final long mo19034b(long j) {
        long j2;
        long j3;
        long j4 = 0;
        if (mo18995b_()) {
            long j5 = this.f8333a;
            if (j >= j5) {
                double d = (((double) (j - j5)) * 256.0d) / ((double) this.f8337e);
                int a = C3560t.m8874a(this.f8336d, (long) d, false) + 1;
                long a2 = m7979a(a);
                if (a == 0) {
                    j2 = 0;
                } else {
                    j2 = this.f8336d[a - 1];
                }
                if (a == 99) {
                    j3 = 256;
                } else {
                    j3 = this.f8336d[a];
                }
                long a3 = m7979a(a + 1);
                if (j3 != j2) {
                    j4 = (long) ((((double) (a3 - a2)) * (d - ((double) j2))) / ((double) (j3 - j2)));
                }
                return a2 + j4;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo18994b() {
        return this.f8334b;
    }

    /* renamed from: a */
    private long m7979a(int i) {
        return (this.f8334b * ((long) i)) / 100;
    }
}
