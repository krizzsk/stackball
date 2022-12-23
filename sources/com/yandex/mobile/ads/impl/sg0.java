package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.Map;

public class sg0 {

    /* renamed from: a */
    private final Map<ck1<VideoAd>, yf0> f39982a = new HashMap();

    /* renamed from: a */
    public void mo69972a(ck1<VideoAd> ck1, yf0 yf0) {
        this.f39982a.put(ck1, yf0);
    }

    /* renamed from: a */
    public yf0 mo69971a(ck1<VideoAd> ck1) {
        return this.f39982a.get(ck1);
    }
}
