package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.C13377i4;
import com.yandex.mobile.ads.impl.C13473j4;
import com.yandex.mobile.ads.impl.C13830l4;
import com.yandex.mobile.ads.impl.gf0;
import com.yandex.mobile.ads.impl.gg0;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.oj1;
import com.yandex.mobile.ads.impl.pj1;
import com.yandex.mobile.ads.impl.vf0;
import com.yandex.mobile.ads.impl.xg0;

/* renamed from: com.yandex.mobile.ads.instream.b */
public class C15412b {

    /* renamed from: a */
    private final gf0 f43538a;

    /* renamed from: b */
    private final C15419e f43539b;

    /* renamed from: c */
    private final C15418d f43540c;

    /* renamed from: d */
    private final C13473j4 f43541d;

    /* renamed from: e */
    private final C13830l4 f43542e = new C15416d();

    /* renamed from: f */
    private final C13830l4 f43543f = new C15414b();

    /* renamed from: g */
    private final C13830l4 f43544g = new C15415c();

    /* renamed from: h */
    private final pj1 f43545h;

    /* renamed from: i */
    private C13377i4 f43546i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public xg0 f43547j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f43548k;

    /* renamed from: com.yandex.mobile.ads.instream.b$b */
    private class C15414b implements C13830l4 {
        private C15414b() {
        }

        /* renamed from: a */
        public void mo67716a() {
            C15412b.this.mo71320f();
        }

        /* renamed from: b */
        public void mo67719b() {
            C15412b.m44877b(C15412b.this);
        }

        /* renamed from: c */
        public void mo67720c() {
            C15412b.m44881e(C15412b.this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.instream.b$c */
    private class C15415c implements C13830l4 {
        private C15415c() {
        }

        /* renamed from: a */
        public void mo67716a() {
            C15412b.this.m44879c();
        }

        /* renamed from: b */
        public void mo67719b() {
            C15412b.m44877b(C15412b.this);
        }

        /* renamed from: c */
        public void mo67720c() {
            C15412b.this.m44879c();
        }
    }

    /* renamed from: com.yandex.mobile.ads.instream.b$d */
    private class C15416d implements C13830l4 {
        private C15416d() {
        }

        /* renamed from: a */
        public void mo67716a() {
            boolean unused = C15412b.this.f43548k = false;
            C15412b.m44880d(C15412b.this);
        }

        /* renamed from: b */
        public void mo67719b() {
            boolean a = C15412b.this.f43548k;
            boolean unused = C15412b.this.f43548k = false;
            if (a) {
                C15412b.m44877b(C15412b.this);
            } else if (C15412b.this.f43547j != null) {
                ((gg0) C15412b.this.f43547j).mo67305c();
            }
        }

        /* renamed from: c */
        public void mo67720c() {
            C15412b.m44880d(C15412b.this);
        }
    }

    C15412b(Context context, ng0 ng0, gf0 gf0, vf0 vf0, C15419e eVar) {
        this.f43538a = gf0;
        this.f43539b = eVar;
        pj1 pj1 = new pj1();
        this.f43545h = pj1;
        C15418d dVar = new C15418d(eVar, this);
        this.f43540c = dVar;
        this.f43541d = new C13473j4(context, ng0, gf0, vf0, eVar, dVar, pj1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71317b() {
        C13377i4 i4Var = this.f43546i;
        if (i4Var != null) {
            i4Var.mo67724g();
        } else {
            m44879c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo71318d() {
        C13377i4 i4Var = this.f43546i;
        if (i4Var != null) {
            i4Var.mo67721d();
        }
        this.f43538a.mo67283b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo71319e() {
        C13377i4 i4Var = this.f43546i;
        if (i4Var != null) {
            i4Var.mo67721d();
        }
        this.f43538a.mo67283b();
        this.f43539b.mo71348h();
        this.f43540c.mo71335b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo71321g() {
        if (this.f43546i != null) {
            this.f43540c.mo71336c();
            C13377i4 i4Var = this.f43546i;
            if (i4Var != null) {
                i4Var.mo67725h();
                return;
            }
            return;
        }
        C13377i4 c = this.f43541d.mo67923c();
        this.f43546i = c;
        if (c != null) {
            c.mo67717a(this.f43542e);
            this.f43540c.mo71336c();
            this.f43548k = true;
            this.f43546i.mo67723f();
            return;
        }
        C13377i4 a = this.f43541d.mo67921a();
        this.f43546i = a;
        a.mo67717a(this.f43543f);
        this.f43546i.mo67723f();
    }

    /* renamed from: h */
    public void mo71322h() {
        this.f43539b.mo71341a(this.f43540c);
        this.f43540c.mo71337d();
    }

    /* renamed from: i */
    public void mo71323i() {
        if (this.f43546i == null) {
            C13377i4 c = this.f43541d.mo67923c();
            this.f43546i = c;
            if (c != null) {
                c.mo67717a(this.f43542e);
                this.f43548k = false;
                this.f43546i.mo67723f();
                return;
            }
            xg0 xg0 = this.f43547j;
            if (xg0 != null) {
                ((gg0) xg0).mo67305c();
                return;
            }
            return;
        }
        xg0 xg02 = this.f43547j;
        if (xg02 != null) {
            ((gg0) xg02).mo67305c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo71324j() {
        C13377i4 i4Var = this.f43546i;
        if (i4Var != null) {
            i4Var.mo67724g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo71325k() {
        this.f43540c.mo71339f();
        C13377i4 i4Var = this.f43546i;
        if (i4Var != null) {
            i4Var.mo67722e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m44879c() {
        xg0 xg0 = this.f43547j;
        if (xg0 != null) {
            ((gg0) xg0).mo67306d();
        }
        this.f43539b.mo71348h();
        this.f43538a.mo67283b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo71320f() {
        xg0 xg0 = this.f43547j;
        if (xg0 != null) {
            ((gg0) xg0).mo67304b("Video player returned error");
        }
        this.f43539b.mo71348h();
        this.f43538a.mo67283b();
    }

    /* renamed from: a */
    public void mo71316a(xg0 xg0) {
        this.f43547j = xg0;
    }

    /* renamed from: a */
    public void mo71315a(oj1 oj1) {
        this.f43545h.mo69372a(oj1);
    }

    /* renamed from: b */
    static void m44877b(C15412b bVar) {
        C13377i4 i4Var = bVar.f43546i;
        if (i4Var != null) {
            i4Var.mo67725h();
        }
    }

    /* renamed from: d */
    static void m44880d(C15412b bVar) {
        C13377i4 a = bVar.f43541d.mo67921a();
        bVar.f43546i = a;
        a.mo67717a(bVar.f43543f);
        bVar.f43546i.mo67723f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71314a() {
        this.f43540c.mo71333a();
    }

    /* renamed from: e */
    static void m44881e(C15412b bVar) {
        C13377i4 b = bVar.f43541d.mo67922b();
        bVar.f43546i = b;
        if (b != null) {
            b.mo67717a(bVar.f43544g);
            bVar.f43546i.mo67723f();
            return;
        }
        bVar.m44879c();
    }
}
