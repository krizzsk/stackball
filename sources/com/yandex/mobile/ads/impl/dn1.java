package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

public class dn1 {

    /* renamed from: a */
    private final a01 f32721a;

    /* renamed from: b */
    private final bm1 f32722b;

    public dn1(a01 a01, bm1 bm1) {
        this.f32721a = a01;
        this.f32722b = bm1;
    }

    /* renamed from: a */
    public void mo66646a(Player player) {
        if (!this.f32721a.mo65634c() && !player.isPlayingAd()) {
            this.f32722b.mo66099c();
            boolean b = this.f32722b.mo66098b();
            Timeline b2 = this.f32721a.mo65633b();
            if (!(b || b2.isEmpty())) {
                b2.getPeriod(0, this.f32721a.mo65630a());
            }
        }
    }
}
