package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewParent;

class lf1 {

    /* renamed from: a */
    private final bo1 f36657a = new bo1();

    lf1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo68418a(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        return !this.f36657a.mo66102a((View) parent, view);
    }
}
