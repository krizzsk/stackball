package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

class kg1 {

    /* renamed from: a */
    private final uf0 f36129a;

    /* renamed from: b */
    private final ig1 f36130b;

    /* renamed from: c */
    private final ck1<VideoAd> f36131c;

    /* renamed from: d */
    private final rg0 f36132d;

    /* renamed from: e */
    private final qg0 f36133e;

    /* renamed from: f */
    private yf0 f36134f;

    kg1(uf0 uf0, ig1 ig1, ck1<VideoAd> ck1, sg0 sg0, d01 d01, kg0 kg0) {
        this.f36129a = uf0;
        this.f36130b = ig1;
        this.f36131c = ck1;
        this.f36132d = new rg0(sg0, d01);
        this.f36133e = new qg0(sg0, kg0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68223a() {
        InstreamAdView b = this.f36129a.mo70346b();
        if (this.f36134f == null && b != null) {
            yf0 a = this.f36132d.mo69765a(this.f36131c);
            this.f36134f = a;
            this.f36130b.mo65778a(b, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo68225b() {
        InstreamAdView b = this.f36129a.mo70346b();
        yf0 yf0 = this.f36134f;
        if (yf0 != null && b != null) {
            this.f36133e.mo69591b(this.f36131c, b, yf0);
            this.f36134f = null;
            this.f36130b.mo65777a(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68224a(ck1<VideoAd> ck1) {
        InstreamAdView b = this.f36129a.mo70346b();
        yf0 yf0 = this.f36134f;
        if (yf0 != null && b != null) {
            this.f36133e.mo69590a(ck1, b, yf0);
        }
    }
}
