package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.i4 */
public class C13377i4 implements C13830l4 {

    /* renamed from: a */
    private final C14055n4 f34738a = new C14055n4();

    /* renamed from: b */
    private final C13679k4 f34739b;

    /* renamed from: c */
    private final pj1 f34740c;

    /* renamed from: d */
    private C13830l4 f34741d;

    public C13377i4(C13679k4 k4Var) {
        this.f34739b = k4Var;
        k4Var.mo68125a((C13830l4) this);
        pj1 pj1 = new pj1();
        this.f34740c = pj1;
        k4Var.mo68126a((oj1) pj1);
    }

    /* renamed from: a */
    public void mo67717a(C13830l4 l4Var) {
        this.f34741d = l4Var;
    }

    /* renamed from: b */
    public void mo67719b() {
        this.f34738a.mo68887a(C13953m4.PREPARED);
        C13830l4 l4Var = this.f34741d;
        if (l4Var != null) {
            l4Var.mo67719b();
        }
    }

    /* renamed from: c */
    public void mo67720c() {
        this.f34738a.mo68887a(C13953m4.ENDED);
        C13830l4 l4Var = this.f34741d;
        if (l4Var != null) {
            l4Var.mo67720c();
        }
    }

    /* renamed from: d */
    public void mo67721d() {
        int ordinal = this.f34738a.mo68886a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f34739b.mo68129g();
        }
    }

    /* renamed from: e */
    public void mo67722e() {
        int ordinal = this.f34738a.mo68886a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f34739b.mo68128e();
        }
    }

    /* renamed from: f */
    public void mo67723f() {
        C13830l4 l4Var;
        int ordinal = this.f34738a.mo68886a().ordinal();
        if (ordinal == 0) {
            this.f34739b.mo68127b();
        } else if (ordinal == 1) {
            C13830l4 l4Var2 = this.f34741d;
            if (l4Var2 != null) {
                l4Var2.mo67719b();
            }
        } else if (ordinal == 4 && (l4Var = this.f34741d) != null) {
            l4Var.mo67716a();
        }
    }

    /* renamed from: g */
    public void mo67724g() {
        C13830l4 l4Var;
        int ordinal = this.f34738a.mo68886a().ordinal();
        if (ordinal == 0) {
            this.f34739b.mo68127b();
        } else if (ordinal == 2) {
            this.f34739b.resume();
        } else if (ordinal == 3) {
            C13830l4 l4Var2 = this.f34741d;
            if (l4Var2 != null) {
                l4Var2.mo67720c();
            }
        } else if (ordinal == 4 && (l4Var = this.f34741d) != null) {
            l4Var.mo67716a();
        }
    }

    /* renamed from: h */
    public void mo67725h() {
        C13830l4 l4Var;
        int ordinal = this.f34738a.mo68886a().ordinal();
        if (ordinal == 0) {
            this.f34739b.mo68127b();
        } else if (ordinal == 1) {
            this.f34738a.mo68887a(C13953m4.STARTED);
            this.f34739b.mo68124a();
        } else if (ordinal == 2) {
            this.f34739b.resume();
        } else if (ordinal == 3) {
            C13830l4 l4Var2 = this.f34741d;
            if (l4Var2 != null) {
                l4Var2.mo67720c();
            }
        } else if (ordinal == 4 && (l4Var = this.f34741d) != null) {
            l4Var.mo67716a();
        }
    }

    /* renamed from: a */
    public void mo67718a(oj1 oj1) {
        this.f34740c.mo69372a(oj1);
    }

    /* renamed from: a */
    public void mo67716a() {
        this.f34738a.mo68887a(C13953m4.ERROR);
        C13830l4 l4Var = this.f34741d;
        if (l4Var != null) {
            l4Var.mo67716a();
        }
    }
}
