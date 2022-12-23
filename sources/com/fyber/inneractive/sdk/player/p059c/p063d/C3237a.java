package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.a */
public final class C3237a implements C3276m {

    /* renamed from: a */
    public final int f8152a;

    /* renamed from: b */
    public final int[] f8153b;

    /* renamed from: c */
    public final long[] f8154c;

    /* renamed from: d */
    public final long[] f8155d;

    /* renamed from: e */
    public final long[] f8156e;

    /* renamed from: f */
    private final long f8157f;

    /* renamed from: b_ */
    public final boolean mo18995b_() {
        return true;
    }

    public C3237a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8153b = iArr;
        this.f8154c = jArr;
        this.f8155d = jArr2;
        this.f8156e = jArr3;
        int length = iArr.length;
        this.f8152a = length;
        if (length > 0) {
            this.f8157f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f8157f = 0;
        }
    }

    /* renamed from: b */
    public final long mo18994b() {
        return this.f8157f;
    }

    /* renamed from: a */
    public final long mo18993a(long j) {
        return this.f8154c[C3560t.m8874a(this.f8156e, j, true)];
    }
}
