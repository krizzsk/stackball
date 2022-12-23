package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.u2 */
public class C14735u2 {

    /* renamed from: a */
    private final Map<VideoAd, C14436r2> f40545a = new HashMap();

    /* renamed from: b */
    private final Map<C14436r2, VideoAd> f40546b = new HashMap();

    /* renamed from: a */
    public void mo70278a(VideoAd videoAd, C14436r2 r2Var) {
        this.f40545a.put(videoAd, r2Var);
        this.f40546b.put(r2Var, videoAd);
    }

    /* renamed from: a */
    public C14436r2 mo70276a(VideoAd videoAd) {
        return this.f40545a.get(videoAd);
    }

    /* renamed from: a */
    public VideoAd mo70277a(C14436r2 r2Var) {
        return this.f40546b.get(r2Var);
    }
}
