package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;

public class du0 implements kk1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final st0 f32772a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final nk1 f32773b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final yh1<fu0> f32774c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final gm1 f32775d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public rk1 f32776e;

    /* renamed from: com.yandex.mobile.ads.impl.du0$b */
    private class C12924b implements mk1<fu0> {
        private C12924b() {
        }

        /* renamed from: a */
        public void mo66684a(ck1<fu0> ck1) {
            m35461a();
        }

        /* renamed from: a */
        public void mo66685a(ck1<fu0> ck1, float f) {
        }

        /* renamed from: b */
        public void mo66687b(ck1<fu0> ck1) {
        }

        /* renamed from: c */
        public void mo66688c(ck1<fu0> ck1) {
            du0.this.f32773b.mo69043b();
            if (du0.this.f32776e != null) {
                du0.this.f32776e.mo67637a();
            }
        }

        /* renamed from: d */
        public void mo66689d(ck1<fu0> ck1) {
            du0.this.f32774c.mo71083c();
        }

        /* renamed from: e */
        public void mo66690e(ck1<fu0> ck1) {
            m35461a();
        }

        /* renamed from: f */
        public void mo66691f(ck1<fu0> ck1) {
        }

        /* renamed from: g */
        public void mo66692g(ck1<fu0> ck1) {
        }

        /* renamed from: h */
        public void mo66693h(ck1<fu0> ck1) {
        }

        /* renamed from: i */
        public void mo66694i(ck1<fu0> ck1) {
            du0.this.f32773b.mo69042a();
            m35461a();
        }

        /* renamed from: j */
        public void mo66695j(ck1<fu0> ck1) {
            du0.this.f32775d.mo67331g();
        }

        /* renamed from: k */
        public void mo66696k(ck1<fu0> ck1) {
            du0.this.f32775d.mo67330a();
        }

        /* renamed from: a */
        private void m35461a() {
            if (du0.this.f32776e != null) {
                du0.this.f32776e.mo67639c();
            }
        }

        /* renamed from: a */
        public void mo66686a(ck1<fu0> ck1, xk1 xk1) {
            ((w40) du0.this.f32772a).mo70640a(xk1);
            if (du0.this.f32776e != null) {
                du0.this.f32776e.mo67638b();
            }
        }
    }

    public du0(Context context, st0 st0, ck1<fu0> ck1, rn1 rn1, h41.C13275a aVar, ln1 ln1, cl1 cl1, gm1 gm1) {
        st0 st02 = st0;
        h41.C13275a aVar2 = aVar;
        this.f32772a = st02;
        this.f32775d = gm1;
        this.f32773b = new nk1(context, aVar2);
        rn1 rn12 = rn1;
        ck1<fu0> ck12 = ck1;
        yh1 yh1 = new yh1(context, new ut0(st02), rn12, ck12, new ju0(rn1), new ll1(), ln1, cl1, new C12924b());
        this.f32774c = yh1;
        yh1.mo71080a(aVar2);
    }

    /* renamed from: a */
    public void mo66681a() {
        this.f32774c.mo71084d();
    }

    /* renamed from: d */
    public void mo66683d() {
        this.f32774c.mo71081b();
        ((w40) this.f32772a).mo70649j();
    }

    /* renamed from: a */
    public void mo66682a(rk1 rk1) {
        this.f32776e = rk1;
    }
}
