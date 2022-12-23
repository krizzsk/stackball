package com.fyber.inneractive.sdk.player.p059c;

import com.fyber.inneractive.sdk.player.p059c.p077i.C3475f;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3497b;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3510j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3551n;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.c */
public final class C3226c implements C3294k {

    /* renamed from: a */
    private final C3510j f8133a;

    /* renamed from: b */
    private final long f8134b;

    /* renamed from: c */
    private final long f8135c;

    /* renamed from: d */
    private final long f8136d;

    /* renamed from: e */
    private final long f8137e;

    /* renamed from: f */
    private final C3551n f8138f;

    /* renamed from: g */
    private int f8139g;

    /* renamed from: h */
    private boolean f8140h;

    public C3226c() {
        this(new C3510j());
    }

    private C3226c(C3510j jVar) {
        this(jVar, (byte) 0);
    }

    private C3226c(C3510j jVar, byte b) {
        this(jVar, 0);
    }

    private C3226c(C3510j jVar, char c) {
        this.f8133a = jVar;
        this.f8134b = 15000000;
        this.f8135c = 30000000;
        this.f8136d = 2500000;
        this.f8137e = 5000000;
        this.f8138f = null;
    }

    /* renamed from: a */
    public final void mo18968a() {
        m7854a(false);
    }

    /* renamed from: a */
    public final void mo18969a(C3297n[] nVarArr, C3475f fVar) {
        this.f8139g = 0;
        for (int i = 0; i < nVarArr.length; i++) {
            if (fVar.f9405b[i] != null) {
                this.f8139g += C3560t.m8887b(nVarArr[i].mo18872a());
            }
        }
        this.f8133a.mo19347a(this.f8139g);
    }

    /* renamed from: b */
    public final void mo18972b() {
        m7854a(true);
    }

    /* renamed from: c */
    public final void mo18973c() {
        m7854a(true);
    }

    /* renamed from: d */
    public final C3497b mo18974d() {
        return this.f8133a;
    }

    /* renamed from: a */
    public final boolean mo18971a(long j, boolean z) {
        long j2 = z ? this.f8137e : this.f8136d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: a */
    private void m7854a(boolean z) {
        this.f8139g = 0;
        C3551n nVar = this.f8138f;
        if (nVar != null && this.f8140h) {
            nVar.mo19413a();
        }
        this.f8140h = false;
        if (z) {
            this.f8133a.mo19348d();
        }
    }

    /* renamed from: a */
    public final boolean mo18970a(long j) {
        boolean z = true;
        char c = j > this.f8135c ? 0 : j < this.f8134b ? (char) 2 : 1;
        boolean z2 = this.f8133a.mo19349e() >= this.f8139g;
        boolean z3 = this.f8140h;
        if (c != 2 && (c != 1 || !z3 || z2)) {
            z = false;
        }
        this.f8140h = z;
        C3551n nVar = this.f8138f;
        if (!(nVar == null || z == z3)) {
            if (z) {
                synchronized (nVar.f9632a) {
                    nVar.f9633b.add(0);
                    nVar.f9634c = Math.max(nVar.f9634c, 0);
                }
            } else {
                nVar.mo19413a();
            }
        }
        return this.f8140h;
    }
}
