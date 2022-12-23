package com.fyber.inneractive.sdk.player.p059c.p063d.p066c;

import com.fyber.inneractive.sdk.player.p059c.p063d.p066c.C3258b;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.c.a */
final class C3257a implements C3258b.C3260a {

    /* renamed from: a */
    private final long f8310a;

    /* renamed from: b */
    private final int f8311b;

    /* renamed from: c */
    private final long f8312c;

    public C3257a(long j, int i, long j2) {
        long j3;
        this.f8310a = j;
        this.f8311b = i;
        if (j2 == -1) {
            j3 = -9223372036854775807L;
        } else {
            j3 = mo19034b(j2);
        }
        this.f8312c = j3;
    }

    /* renamed from: b_ */
    public final boolean mo18995b_() {
        return this.f8312c != -9223372036854775807L;
    }

    /* renamed from: a */
    public final long mo18993a(long j) {
        long j2 = this.f8312c;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return this.f8310a + ((C3560t.m8876a(j, j2) * ((long) this.f8311b)) / 8000000);
    }

    /* renamed from: b */
    public final long mo19034b(long j) {
        return ((Math.max(0, j - this.f8310a) * 1000000) * 8) / ((long) this.f8311b);
    }

    /* renamed from: b */
    public final long mo18994b() {
        return this.f8312c;
    }
}
