package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.t */
public final class C3391t implements C3388q {

    /* renamed from: a */
    private C3558r f9138a;

    /* renamed from: b */
    private C3278n f9139b;

    /* renamed from: c */
    private boolean f9140c;

    /* renamed from: a */
    public final void mo19178a(C3558r rVar, C3270h hVar, C3396v.C3400d dVar) {
        this.f9138a = rVar;
        dVar.mo19181a();
        C3278n a = hVar.mo19056a(dVar.mo19182b());
        this.f9139b = a;
        a.mo19040a(C3290h.m8121a(dVar.mo19183c(), "application/x-scte35", (C3227a) null));
    }

    /* renamed from: a */
    public final void mo19177a(C3548k kVar) {
        long j = -9223372036854775807L;
        if (!this.f9140c) {
            if (this.f9138a.mo19421a() != -9223372036854775807L) {
                this.f9139b.mo19040a(C3290h.m8112a("application/x-scte35", this.f9138a.mo19421a()));
                this.f9140c = true;
            } else {
                return;
            }
        }
        int b = kVar.mo19383b();
        this.f9139b.mo19041a(kVar, b);
        C3278n nVar = this.f9139b;
        C3558r rVar = this.f9138a;
        if (rVar.f9653b != -9223372036854775807L) {
            j = rVar.f9653b;
        } else if (rVar.f9652a != Long.MAX_VALUE) {
            j = rVar.f9652a;
        }
        nVar.mo19038a(j, 1, b, 0, (byte[]) null);
    }
}
