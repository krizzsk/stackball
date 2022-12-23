package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.l */
final class C3342l {

    /* renamed from: a */
    public final int f8826a;

    /* renamed from: b */
    public final long[] f8827b;

    /* renamed from: c */
    public final int[] f8828c;

    /* renamed from: d */
    public final int f8829d;

    /* renamed from: e */
    public final long[] f8830e;

    /* renamed from: f */
    public final int[] f8831f;

    public C3342l(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        C3535a.m8782a(iArr.length == jArr2.length);
        C3535a.m8782a(jArr.length == jArr2.length);
        C3535a.m8782a(iArr2.length != jArr2.length ? false : z);
        this.f8827b = jArr;
        this.f8828c = iArr;
        this.f8829d = i;
        this.f8830e = jArr2;
        this.f8831f = iArr2;
        this.f8826a = jArr.length;
    }

    /* renamed from: a */
    public final int mo19135a(long j) {
        for (int a = C3560t.m8874a(this.f8830e, j, false); a >= 0; a--) {
            if ((this.f8831f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo19136b(long j) {
        for (int a = C3560t.m8875a(this.f8830e, j, true, false); a < this.f8830e.length; a++) {
            if ((this.f8831f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
