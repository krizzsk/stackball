package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.l */
public final class C3381l implements C3373h {

    /* renamed from: a */
    private final C3548k f9079a = new C3548k(10);

    /* renamed from: b */
    private C3278n f9080b;

    /* renamed from: c */
    private boolean f9081c;

    /* renamed from: d */
    private long f9082d;

    /* renamed from: e */
    private int f9083e;

    /* renamed from: f */
    private int f9084f;

    /* renamed from: a */
    public final void mo19156a() {
        this.f9081c = false;
    }

    /* renamed from: a */
    public final void mo19158a(C3270h hVar, C3396v.C3400d dVar) {
        dVar.mo19181a();
        C3278n a = hVar.mo19056a(dVar.mo19182b());
        this.f9080b = a;
        a.mo19040a(C3290h.m8121a(dVar.mo19183c(), "application/id3", (C3227a) null));
    }

    /* renamed from: a */
    public final void mo19157a(long j, boolean z) {
        if (z) {
            this.f9081c = true;
            this.f9082d = j;
            this.f9083e = 0;
            this.f9084f = 0;
        }
    }

    /* renamed from: a */
    public final void mo19159a(C3548k kVar) {
        if (this.f9081c) {
            int b = kVar.mo19383b();
            int i = this.f9084f;
            if (i < 10) {
                int min = Math.min(b, 10 - i);
                System.arraycopy(kVar.f9625a, kVar.f9626b, this.f9079a.f9625a, this.f9084f, min);
                if (this.f9084f + min == 10) {
                    this.f9079a.mo19386c(0);
                    if (73 == this.f9079a.mo19387d() && 68 == this.f9079a.mo19387d() && 51 == this.f9079a.mo19387d()) {
                        this.f9079a.mo19388d(3);
                        this.f9083e = this.f9079a.mo19399m() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f9081c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(b, this.f9083e - this.f9084f);
            this.f9080b.mo19041a(kVar, min2);
            this.f9084f += min2;
        }
    }

    /* renamed from: b */
    public final void mo19160b() {
        int i;
        if (this.f9081c && (i = this.f9083e) != 0 && this.f9084f == i) {
            this.f9080b.mo19038a(this.f9082d, 1, i, 0, (byte[]) null);
            this.f9081c = false;
        }
    }
}
