package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.x4 */
public class C15146x4 {

    /* renamed from: a */
    private final Map<VideoAd, qf0> f42405a = new HashMap();

    /* renamed from: b */
    private e01 f42406b;

    /* renamed from: a */
    public qf0 mo70822a(VideoAd videoAd) {
        qf0 qf0 = this.f42405a.get(videoAd);
        return qf0 != null ? qf0 : qf0.NONE;
    }

    /* renamed from: b */
    public e01 mo70826b() {
        return this.f42406b;
    }

    /* renamed from: c */
    public boolean mo70827c() {
        Collection<qf0> values = this.f42405a.values();
        return values.contains(qf0.PLAYING) || values.contains(qf0.PAUSED);
    }

    /* renamed from: a */
    public void mo70825a(VideoAd videoAd, qf0 qf0) {
        this.f42405a.put(videoAd, qf0);
    }

    /* renamed from: a */
    public void mo70823a() {
        this.f42405a.clear();
    }

    /* renamed from: a */
    public void mo70824a(e01 e01) {
        this.f42406b = e01;
    }
}
