package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class bh0 implements bl1 {

    /* renamed from: a */
    private final wk1<VideoAd> f31326a;

    /* renamed from: b */
    private final tn1 f31327b;

    /* renamed from: c */
    private final ll1 f31328c;

    public bh0(wk1<VideoAd> wk1, rn1 rn1, ll1 ll1) {
        this.f31326a = wk1;
        this.f31327b = new rp0().mo69802a(rn1);
        this.f31328c = ll1;
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        boolean a = this.f31327b.mo70209a();
        if (this.f31328c.mo68486a() == kl1.BUFFERING) {
            return;
        }
        if (a) {
            if (!this.f31326a.mo68214b()) {
                this.f31326a.mo68218f();
            }
        } else if (this.f31326a.mo68214b()) {
            this.f31326a.mo68210a();
        }
    }
}
