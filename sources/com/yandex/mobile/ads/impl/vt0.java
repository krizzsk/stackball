package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

public class vt0 {

    /* renamed from: a */
    private final m40 f41532a;

    public vt0(Context context, C14645t1 t1Var, AdResponse adResponse) {
        this.f41532a = new m40(context, t1Var, adResponse);
    }

    /* renamed from: a */
    public st0 mo70580a(ck1<fu0> ck1) {
        w40 a = v40.m43027a().mo70444a(ck1);
        if (a != null && !a.mo70644e()) {
            return a;
        }
        w40 a2 = this.f41532a.mo68560a();
        v40.m43027a().mo70445a(ck1, a2);
        return a2;
    }
}
