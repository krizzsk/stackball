package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.g */
public final class C3372g implements C3373h {

    /* renamed from: a */
    private final List<C3396v.C3397a> f8980a;

    /* renamed from: b */
    private final C3278n[] f8981b;

    /* renamed from: c */
    private boolean f8982c;

    /* renamed from: d */
    private int f8983d;

    /* renamed from: e */
    private int f8984e;

    /* renamed from: f */
    private long f8985f;

    public C3372g(List<C3396v.C3397a> list) {
        this.f8980a = list;
        this.f8981b = new C3278n[list.size()];
    }

    /* renamed from: a */
    public final void mo19156a() {
        this.f8982c = false;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        for (int i = 0; i < this.f8981b.length; i++) {
            C3396v.C3397a aVar = this.f8980a.get(i);
            dVar.mo19181a();
            C3278n a = hVar.mo19056a(dVar.mo19182b());
            a.mo19040a(C3290h.m8122a(dVar.mo19183c(), "application/dvbsubs", (List<byte[]>) Collections.singletonList(aVar.f9165c), aVar.f9163a, (C3227a) null));
            this.f8981b[i] = a;
        }
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        if (z) {
            this.f8982c = true;
            this.f8985f = j;
            this.f8984e = 0;
            this.f8983d = 2;
        }
    }

    /* renamed from: b */
    public final void mo19160b() {
        if (this.f8982c) {
            for (C3278n a : this.f8981b) {
                a.mo19038a(this.f8985f, 1, this.f8984e, 0, (byte[]) null);
            }
            this.f8982c = false;
        }
    }

    /* renamed from: a */
    public final void mo19159a(C3548k kVar) {
        if (!this.f8982c) {
            return;
        }
        if (this.f8983d != 2 || m8362a(kVar, 32)) {
            if (this.f8983d != 1 || m8362a(kVar, 0)) {
                int i = kVar.f9626b;
                int b = kVar.mo19383b();
                for (C3278n a : this.f8981b) {
                    kVar.mo19386c(i);
                    a.mo19041a(kVar, b);
                }
                this.f8984e += b;
            }
        }
    }

    /* renamed from: a */
    private boolean m8362a(C3548k kVar, int i) {
        if (kVar.mo19383b() == 0) {
            return false;
        }
        if (kVar.mo19387d() != i) {
            this.f8982c = false;
        }
        this.f8983d--;
        return this.f8982c;
    }
}
