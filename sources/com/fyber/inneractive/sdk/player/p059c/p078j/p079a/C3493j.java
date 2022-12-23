package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3480a;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.j */
public final class C3493j implements C3489f, Comparator<C3490g> {

    /* renamed from: a */
    private final long f9469a = 10485760;

    /* renamed from: b */
    private final TreeSet<C3490g> f9470b = new TreeSet<>(this);

    /* renamed from: c */
    private long f9471c;

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C3490g gVar = (C3490g) obj;
        C3490g gVar2 = (C3490g) obj2;
        if (gVar.f9457f - gVar2.f9457f == 0) {
            return gVar.compareTo(gVar2);
        }
        return gVar.f9457f < gVar2.f9457f ? -1 : 1;
    }

    /* renamed from: a */
    public final void mo19325a(C3480a aVar, long j) {
        m8680b(aVar, j);
    }

    /* renamed from: a */
    public final void mo19318a(C3480a aVar, C3490g gVar) {
        this.f9470b.add(gVar);
        this.f9471c += gVar.f9454c;
        m8680b(aVar, 0);
    }

    /* renamed from: a */
    public final void mo19320a(C3490g gVar) {
        this.f9470b.remove(gVar);
        this.f9471c -= gVar.f9454c;
    }

    /* renamed from: a */
    public final void mo19319a(C3480a aVar, C3490g gVar, C3490g gVar2) {
        mo19320a(gVar);
        mo19318a(aVar, gVar2);
    }

    /* renamed from: b */
    private void m8680b(C3480a aVar, long j) {
        while (this.f9471c + j > this.f9469a) {
            try {
                aVar.mo19316b(this.f9470b.first());
            } catch (C3480a.C3481a unused) {
            }
        }
    }
}
