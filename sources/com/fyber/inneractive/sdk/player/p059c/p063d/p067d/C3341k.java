package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.k */
final class C3341k {

    /* renamed from: a */
    public C3327c f8807a;

    /* renamed from: b */
    public long f8808b;

    /* renamed from: c */
    public long f8809c;

    /* renamed from: d */
    public long f8810d;

    /* renamed from: e */
    public int f8811e;

    /* renamed from: f */
    public int f8812f;

    /* renamed from: g */
    public long[] f8813g;

    /* renamed from: h */
    public int[] f8814h;

    /* renamed from: i */
    public int[] f8815i;

    /* renamed from: j */
    public int[] f8816j;

    /* renamed from: k */
    public long[] f8817k;

    /* renamed from: l */
    public boolean[] f8818l;

    /* renamed from: m */
    public boolean f8819m;

    /* renamed from: n */
    public boolean[] f8820n;

    /* renamed from: o */
    public C3340j f8821o;

    /* renamed from: p */
    public int f8822p;

    /* renamed from: q */
    public C3548k f8823q;

    /* renamed from: r */
    public boolean f8824r;

    /* renamed from: s */
    public long f8825s;

    C3341k() {
    }

    /* renamed from: a */
    public final void mo19133a(int i) {
        C3548k kVar = this.f8823q;
        if (kVar == null || kVar.f9627c < i) {
            this.f8823q = new C3548k(i);
        }
        this.f8822p = i;
        this.f8819m = true;
        this.f8824r = true;
    }

    /* renamed from: b */
    public final long mo19134b(int i) {
        return this.f8817k[i] + ((long) this.f8816j[i]);
    }
}
