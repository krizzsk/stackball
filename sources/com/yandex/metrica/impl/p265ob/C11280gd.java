package com.yandex.metrica.impl.p265ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.gd */
class C11280gd {

    /* renamed from: a */
    private C10807Uc f26979a;

    /* renamed from: b */
    private C11125d0<Location> f26980b;

    /* renamed from: c */
    private Location f26981c = null;

    /* renamed from: d */
    private long f26982d;

    /* renamed from: e */
    private C10691R2 f26983e;

    /* renamed from: f */
    private C10106Ad f26984f;

    /* renamed from: g */
    private C11982yc f26985g;

    C11280gd(C10807Uc uc, C11125d0<Location> d0Var, Location location, long j, C10691R2 r2, C10106Ad ad, C11982yc ycVar) {
        this.f26979a = uc;
        this.f26980b = d0Var;
        this.f26982d = j;
        this.f26983e = r2;
        this.f26984f = ad;
        this.f26985g = ycVar;
    }

    /* renamed from: b */
    private boolean m29063b(Location location) {
        C10807Uc uc;
        if (!(location == null || (uc = this.f26979a) == null)) {
            if (this.f26981c == null) {
                return true;
            }
            boolean a = this.f26983e.mo62106a(this.f26982d, uc.f25910a, "isSavedLocationOutdated");
            boolean z = location.distanceTo(this.f26981c) > this.f26979a.f25911b;
            boolean z2 = this.f26981c == null || location.getTime() - this.f26981c.getTime() >= 0;
            if ((a || z) && z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo62964a(Location location) {
        if (m29063b(location)) {
            this.f26981c = location;
            this.f26982d = System.currentTimeMillis();
            this.f26980b.mo62738a(location);
            this.f26984f.mo61056a();
            this.f26985g.mo64140a();
        }
    }

    /* renamed from: a */
    public void mo62965a(C10807Uc uc) {
        this.f26979a = uc;
    }
}
