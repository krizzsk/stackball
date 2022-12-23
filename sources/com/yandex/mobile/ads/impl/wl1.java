package com.yandex.mobile.ads.impl;

import android.view.View;

public class wl1 implements View.OnClickListener {

    /* renamed from: a */
    private final ej0 f42030a;

    /* renamed from: b */
    private final C13048ff f42031b;

    /* renamed from: c */
    private final o70 f42032c;

    /* renamed from: d */
    private final C13413ii f42033d;

    public wl1(ej0 ej0, C13048ff ffVar, C13413ii iiVar, o70 o70) {
        this.f42030a = ej0;
        this.f42031b = ffVar;
        this.f42033d = iiVar;
        this.f42032c = o70;
    }

    public void onClick(View view) {
        ej0 ej0;
        this.f42032c.mo68930b();
        if (this.f42033d != null) {
            ej0 = new ej0(this.f42030a.mo66834a(), this.f42030a.mo66835b(), this.f42030a.mo66836c(), this.f42033d.mo67784b());
        } else {
            ej0 = this.f42030a;
        }
        this.f42031b.mo66999a(ej0).onClick(view);
    }
}
