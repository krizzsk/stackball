package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.View;

public class np0 extends un1<lp0, fl0> {
    public np0(lp0 lp0) {
        super(lp0);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        super.mo65866a((lp0) view);
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        lp0 lp0 = (lp0) view;
        fl0 fl0 = (fl0) obj;
        String b = fl0.mo67028b();
        if (!TextUtils.isEmpty(b)) {
            lp0.setAspectRatio(fl0.mo67027a());
            lp0.mo68495c(b);
        }
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, Object obj) {
        fl0 fl0 = (fl0) obj;
        lp0 lp0 = (lp0) mo70379b();
        if (lp0 != null) {
            yn1.mo66921a(k9Var, (View) lp0);
            yn1.mo66922a(k9Var, (C12971ef) new wo0(lp0));
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        lp0 lp0 = (lp0) view;
        fl0 fl0 = (fl0) obj;
        return true;
    }
}
