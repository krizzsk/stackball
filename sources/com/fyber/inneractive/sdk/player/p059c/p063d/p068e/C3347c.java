package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.c */
public final class C3347c implements C3268f {

    /* renamed from: a */
    public static final C3271i f8852a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3347c()};
        }
    };

    /* renamed from: b */
    private C3353h f8853b;

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        try {
            C3350e eVar = new C3350e();
            if (eVar.mo19145a(gVar, true)) {
                if ((eVar.f8861b & 2) == 2) {
                    int min = Math.min(eVar.f8868i, 8);
                    C3548k kVar = new C3548k(min);
                    gVar.mo19014c(kVar.f9625a, 0, min);
                    kVar.mo19386c(0);
                    if (kVar.mo19383b() >= 5 && kVar.mo19387d() == 127 && kVar.mo19394h() == 1179402563) {
                        this.f8853b = new C3345b();
                    } else {
                        kVar.mo19386c(0);
                        if (C3357j.m8319b(kVar)) {
                            this.f8853b = new C3357j();
                        } else {
                            kVar.mo19386c(0);
                            if (C3352g.m8299b(kVar)) {
                                this.f8853b = new C3352g();
                            }
                        }
                    }
                    return true;
                }
            }
        } catch (C3295l unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        C3278n a = hVar.mo19056a(0);
        hVar.mo19058b();
        this.f8853b.mo19150a(hVar, a);
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f8853b.mo19149a(j, j2);
    }

    /* renamed from: a */
    public final int mo18998a(C3269g gVar, C3275l lVar) throws IOException, InterruptedException {
        C3353h hVar = this.f8853b;
        int i = hVar.f8876c;
        if (i == 0) {
            return hVar.mo19146a(gVar);
        }
        if (i == 1) {
            gVar.mo19009b((int) hVar.f8875b);
            hVar.f8876c = 2;
            return 0;
        } else if (i == 2) {
            return hVar.mo19147a(gVar, lVar);
        } else {
            throw new IllegalStateException();
        }
    }
}
