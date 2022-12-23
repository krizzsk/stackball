package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

public class vz0 {

    /* renamed from: a */
    private final r40 f41820a;

    public vz0(r40 r40) {
        this.f41820a = r40;
    }

    /* renamed from: a */
    public void mo70602a() {
        Player a = this.f41820a.mo69687a();
        if (a != null) {
            a.setPlayWhenReady(false);
        }
    }

    /* renamed from: b */
    public void mo70603b() {
        Player a = this.f41820a.mo69687a();
        if (a != null) {
            a.setPlayWhenReady(true);
        }
    }
}
