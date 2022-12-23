package com.yandex.mobile.ads.impl;

import android.view.View;

public class jq0 implements View.OnClickListener {

    /* renamed from: a */
    private final kg0 f35438a;

    /* renamed from: b */
    private final C13952m3 f35439b;

    /* renamed from: c */
    private final yf0 f35440c;

    /* renamed from: d */
    private final iq0 f35441d;

    public jq0(kg0 kg0, C13952m3 m3Var, yf0 yf0, iq0 iq0) {
        this.f35438a = kg0;
        this.f35439b = m3Var;
        this.f35440c = yf0;
        this.f35441d = iq0;
    }

    public void onClick(View view) {
        boolean z = !(this.f35438a.getVolume() == 0.0f);
        this.f35439b.mo68558a(this.f35440c.mo71044a(), z);
        iq0 iq0 = this.f35441d;
        if (iq0 != null) {
            iq0.setMuted(z);
        }
    }
}
