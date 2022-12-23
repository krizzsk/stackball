package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

class lg1 {

    /* renamed from: a */
    private final jg1 f36664a;

    /* renamed from: b */
    private final sg0 f36665b = new sg0();

    /* renamed from: c */
    private final d01 f36666c;

    /* renamed from: d */
    private final gf0 f36667d;

    public lg1(d01 d01, gf0 gf0, af0 af0) {
        this.f36666c = d01;
        this.f36667d = gf0;
        this.f36664a = new jg1(af0);
    }

    /* renamed from: a */
    public kg1 mo68433a(Context context, uf0 uf0, og0 og0, ck1<VideoAd> ck1, ln1 ln1, oj1 oj1) {
        kg0 kg0 = new kg0(ck1.mo66323c(), this.f36667d);
        ck1<VideoAd> ck12 = ck1;
        return new kg1(uf0, this.f36664a.mo67989a(context, og0, ck12, kg0, ln1, oj1), ck12, this.f36665b, this.f36666c, kg0);
    }
}
