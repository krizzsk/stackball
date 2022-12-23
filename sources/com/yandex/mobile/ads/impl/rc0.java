package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

public class rc0 {

    /* renamed from: a */
    private final l30 f39434a;

    public rc0(l30 l30) {
        this.f39434a = l30;
    }

    /* renamed from: a */
    public void mo69752a(qc0 qc0) {
        C15035w8 a = qc0.mo69577a();
        String b = qc0.mo69578b();
        String a2 = a.mo70659a();
        String b2 = a.mo70660b();
        String c = a.mo70661c();
        if (TextUtils.isEmpty(a2)) {
            a2 = "https://mobile.yandexadexchange.net";
        }
        this.f39434a.mo68313a(a2);
        this.f39434a.mo68319c(b2);
        this.f39434a.mo68323e(c);
        this.f39434a.mo68321d(b);
    }
}
