package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yf0;
import com.yandex.mobile.ads.instream.player.p267ad.C15420a;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class qg0 {

    /* renamed from: a */
    private final sg0 f39109a;

    /* renamed from: b */
    private final C15420a f39110b = new C15420a();

    /* renamed from: c */
    private final ye0 f39111c;

    public qg0(sg0 sg0, kg0 kg0) {
        this.f39109a = sg0;
        this.f39111c = new ye0(kg0);
    }

    /* renamed from: a */
    public void mo69590a(ck1<VideoAd> ck1, InstreamAdView instreamAdView, yf0 yf0) {
        qj1 a = this.f39110b.mo71356a(instreamAdView);
        if (a != null) {
            this.f39109a.mo69972a(ck1, new yf0.C15248b().mo71052b(this.f39111c.mo71037a(a, yf0).mo71047d()).mo71048a(yf0.mo71044a()).mo71050a());
        }
    }

    /* renamed from: b */
    public void mo69591b(ck1<VideoAd> ck1, InstreamAdView instreamAdView, yf0 yf0) {
        qj1 a = this.f39110b.mo71356a(instreamAdView);
        if (a != null) {
            this.f39109a.mo69972a(ck1, this.f39111c.mo71037a(a, yf0));
        }
    }
}
