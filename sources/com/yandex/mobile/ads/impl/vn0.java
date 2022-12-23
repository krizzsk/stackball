package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.C15418d;
import com.yandex.mobile.ads.instream.C15419e;

public class vn0 implements C13679k4, j01, C13020f1 {

    /* renamed from: a */
    private final un0 f41331a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final h01 f41332b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15418d f41333c;

    /* renamed from: d */
    private final C13372i1 f41334d;

    /* renamed from: e */
    private final C14900b f41335e = new C14900b();

    /* renamed from: f */
    private final pj1 f41336f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C13830l4 f41337g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12948e1 f41338h;

    /* renamed from: com.yandex.mobile.ads.impl.vn0$b */
    private class C14900b implements om1 {
        private C14900b() {
        }

        /* renamed from: a */
        public void mo69224a() {
            vn0.this.f41332b.mo67376b();
            if (vn0.this.f41338h != null) {
                vn0.this.f41338h.mo66731c();
            }
        }

        public void onVideoCompleted() {
            vn0.m43152a(vn0.this);
            vn0.this.f41332b.mo67376b();
            vn0.this.f41333c.mo71334a((om1) null);
            if (vn0.this.f41337g != null) {
                vn0.this.f41337g.mo67720c();
            }
        }

        public void onVideoError() {
            vn0.this.f41332b.mo67376b();
            vn0.this.f41333c.mo71334a((om1) null);
            if (vn0.this.f41338h != null) {
                vn0.this.f41338h.mo66731c();
            }
            if (vn0.this.f41337g != null) {
                vn0.this.f41337g.mo67716a();
            }
        }

        public void onVideoPaused() {
            vn0.this.f41332b.mo67376b();
        }

        public void onVideoResumed() {
            vn0.this.f41332b.mo67374a();
        }
    }

    public vn0(Context context, jf0 jf0, C13372i1 i1Var, gf0 gf0, sf0 sf0, vf0 vf0, C15419e eVar, C15418d dVar) {
        this.f41333c = dVar;
        this.f41334d = i1Var;
        pj1 pj1 = new pj1();
        this.f41336f = pj1;
        this.f41331a = new un0(context, i1Var, gf0, sf0, vf0, pj1);
        this.f41332b = new i01(eVar, i1Var).mo67706a(jf0, this);
    }

    /* renamed from: a */
    public void mo68124a() {
        this.f41333c.mo71334a(this.f41335e);
        this.f41333c.mo71338e();
    }

    /* renamed from: d */
    public void mo66904d() {
    }

    /* renamed from: f */
    public void mo66905f() {
    }

    /* renamed from: g */
    public void mo68129g() {
        this.f41332b.mo67376b();
        C12948e1 e1Var = this.f41338h;
        if (e1Var != null) {
            e1Var.mo66730b();
        }
    }

    /* renamed from: h */
    public void mo66906h() {
        this.f41333c.mo71336c();
    }

    /* renamed from: i */
    public void mo66907i() {
        this.f41338h = null;
        this.f41333c.mo71338e();
    }

    public void resume() {
        boolean z = this.f41338h != null;
        boolean a = this.f41334d.mo67709a();
        if (!z) {
            this.f41333c.mo71338e();
        } else if (a) {
            this.f41333c.mo71336c();
            this.f41338h.mo66734g();
        } else {
            this.f41333c.mo71338e();
            this.f41338h.mo66732d();
        }
    }

    /* renamed from: b */
    public void mo68127b() {
        C13830l4 l4Var = this.f41337g;
        if (l4Var != null) {
            l4Var.mo67719b();
        }
    }

    /* renamed from: c */
    public void mo66903c() {
        this.f41338h = null;
        this.f41333c.mo71338e();
    }

    /* renamed from: e */
    public void mo68128e() {
        this.f41332b.mo67376b();
        C12948e1 e1Var = this.f41338h;
        if (e1Var != null) {
            e1Var.mo66731c();
        }
    }

    /* renamed from: a */
    public void mo68125a(C13830l4 l4Var) {
        this.f41337g = l4Var;
    }

    /* renamed from: a */
    public void mo68126a(oj1 oj1) {
        this.f41336f.mo69372a(oj1);
    }

    /* renamed from: b */
    public void mo70503b(og0 og0) {
        C12948e1 a = this.f41331a.mo70378a(og0);
        C12948e1 e1Var = this.f41338h;
        if (!(a == e1Var || e1Var == null)) {
            e1Var.mo66728a((C13020f1) null);
            this.f41338h.mo66733f();
        }
        this.f41338h = a;
        a.mo66728a((C13020f1) this);
        this.f41338h.mo66732d();
    }

    /* renamed from: a */
    public void mo70502a(og0 og0) {
        C12948e1 a = this.f41331a.mo70378a(og0);
        C12948e1 e1Var = this.f41338h;
        if (!(a == e1Var || e1Var == null)) {
            e1Var.mo66728a((C13020f1) null);
            this.f41338h.mo66733f();
        }
        this.f41338h = a;
        a.mo66728a((C13020f1) this);
        this.f41338h.mo66735h();
    }

    /* renamed from: a */
    static void m43152a(vn0 vn0) {
        C12948e1 e1Var = vn0.f41338h;
        if (e1Var != null) {
            e1Var.mo66728a((C13020f1) null);
            vn0.f41338h.mo66733f();
        }
    }
}
