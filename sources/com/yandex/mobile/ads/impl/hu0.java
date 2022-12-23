package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;

public class hu0 {

    /* renamed from: a */
    private final jm1 f34560a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final qn1 f34561b;

    /* renamed from: c */
    private final tt0 f34562c;

    /* renamed from: d */
    private final j11 f34563d;

    /* renamed from: e */
    private final qu0 f34564e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final z31 f34565f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final pz0 f34566g;

    /* renamed from: h */
    private final pz0 f34567h;

    /* renamed from: i */
    private final C13348b f34568i = new C13348b();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final eu0 f34569j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public pz0 f34570k;

    /* renamed from: com.yandex.mobile.ads.impl.hu0$b */
    private class C13348b implements rk1 {
        private C13348b() {
        }

        /* renamed from: a */
        public void mo67637a() {
            pu0 pu0 = (pu0) hu0.this.f34561b.mo70379b();
            if (pu0 != null) {
                pu0.setClickable(true);
            }
        }

        /* renamed from: b */
        public void mo67638b() {
            hu0.this.f34569j.mo65887b();
        }

        /* renamed from: c */
        public void mo67639c() {
            pz0 unused = hu0.this.f34570k = null;
            hu0.this.f34565f.mo71151a();
            hu0.this.f34569j.mo65889c();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hu0$c */
    private class C13349c implements f41 {
        private C13349c() {
        }

        /* renamed from: a */
        public void mo66920a(pu0 pu0) {
            hu0 hu0 = hu0.this;
            hu0.m37101b(hu0, hu0.f34566g);
        }
    }

    public hu0(Context context, st0 st0, ck1<fu0> ck1, jm1 jm1, qn1 qn1, h41.C13275a aVar, ln1 ln1, gm1 gm1, eu0 eu0) {
        st0 st02 = st0;
        jm1 jm12 = jm1;
        qn1 qn12 = qn1;
        eu0 eu02 = eu0;
        this.f34560a = jm12;
        this.f34561b = qn12;
        this.f34569j = eu02;
        tu0 tu0 = new tu0(qn12);
        this.f34562c = new tt0(st02);
        this.f34564e = new qu0(st02);
        cl1 cl1 = new cl1();
        new xt0(qn12, st02, tu0, eu02).mo70941a(cl1);
        du0 du0 = new du0(context, st0, ck1, tu0, aVar, ln1, cl1, gm1);
        g41 g41 = new g41(st02, ck1, cl1);
        ru0 ru0 = new ru0(st02, jm12);
        j11 j11 = new j11();
        this.f34563d = j11;
        this.f34567h = new pz0(qn12, du0, ru0, j11);
        this.f34566g = new pz0(qn12, g41, ru0, j11);
        this.f34565f = new z31(qn12, new C13349c());
    }

    /* renamed from: b */
    public void mo67636b(pu0 pu0) {
        pz0 pz0 = this.f34570k;
        if (pz0 != null) {
            pz0.mo69455a(pu0);
        }
        this.f34564e.mo69652b(pu0);
    }

    /* renamed from: a */
    public void mo67634a() {
        pu0 pu0 = (pu0) this.f34561b.mo70379b();
        if (pu0 != null) {
            pu0.setClickable(false);
        }
    }

    /* renamed from: a */
    public void mo67635a(pu0 pu0) {
        this.f34562c.mo70233a(this.f34560a);
        this.f34564e.mo69651a(pu0);
        mm1 b = pu0.mo69437b();
        this.f34563d.getClass();
        b.mo68841a().setVisibility(0);
        pz0 pz0 = this.f34567h;
        this.f34570k = pz0;
        pz0.mo69456a((rk1) this.f34568i);
        this.f34570k.mo69454a();
    }

    /* renamed from: b */
    static void m37101b(hu0 hu0, pz0 pz0) {
        hu0.f34570k = pz0;
        pz0.mo69456a((rk1) hu0.f34568i);
        hu0.f34570k.mo69454a();
    }
}
