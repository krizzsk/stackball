package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

public class ku0 {

    /* renamed from: a */
    private final tl1 f36421a = new tl1();

    /* renamed from: b */
    private final vt0 f36422b;

    /* renamed from: c */
    private final iu0 f36423c;

    /* renamed from: d */
    private hu0 f36424d;

    public ku0(Context context, qn1 qn1, jm1 jm1, C14645t1 t1Var, AdResponse<?> adResponse, gm1 gm1, eu0 eu0) {
        this.f36423c = new iu0(qn1, jm1, t1Var, adResponse, gm1, eu0);
        this.f36422b = new vt0(context, t1Var, adResponse);
    }

    /* renamed from: a */
    public void mo68276a(pu0 pu0, ck1<fu0> ck1, ln1 ln1) {
        st0 a = this.f36422b.mo70580a(ck1);
        hu0 a2 = this.f36423c.mo67894a(pu0.getContext(), a, ck1, ln1);
        this.f36424d = a2;
        a2.mo67635a(pu0);
    }

    /* renamed from: a */
    public void mo68275a(pu0 pu0, ck1<fu0> ck1) {
        pu0.setAspectRatio(this.f36421a.mo70204a(ck1));
        hu0 hu0 = this.f36424d;
        if (hu0 != null) {
            hu0.mo67634a();
        }
    }

    /* renamed from: a */
    public void mo68274a(pu0 pu0) {
        hu0 hu0 = this.f36424d;
        if (hu0 != null) {
            hu0.mo67636b(pu0);
        }
    }
}
