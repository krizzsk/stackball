package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p075h.p076a.C3463a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.s */
final class C3390s {

    /* renamed from: a */
    private final List<C3290h> f9136a;

    /* renamed from: b */
    private final C3278n[] f9137b;

    public C3390s(List<C3290h> list) {
        this.f9136a = list;
        this.f9137b = new C3278n[list.size()];
    }

    /* renamed from: a */
    public final void mo19180a(C3270h hVar, C3396v.C3400d dVar) {
        for (int i = 0; i < this.f9137b.length; i++) {
            dVar.mo19181a();
            C3278n a = hVar.mo19056a(dVar.mo19182b());
            C3290h hVar2 = this.f9136a.get(i);
            String str = hVar2.f8493f;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C3535a.m8783a(z, (Object) "Invalid closed caption mime type provided: " + str);
            a.mo19040a(C3290h.m8118a(hVar2.f8488a != null ? hVar2.f8488a : dVar.mo19183c(), str, hVar2.f8511x, hVar2.f8512y, hVar2.f8513z));
            this.f9137b[i] = a;
        }
    }

    /* renamed from: a */
    public final void mo19179a(long j, C3548k kVar) {
        C3463a.m8608a(j, kVar, this.f9137b);
    }
}
