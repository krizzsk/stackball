package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.u1 */
public class C14734u1 {

    /* renamed from: a */
    private final sf0 f40539a;

    /* renamed from: b */
    private final oj1 f40540b;

    public C14734u1(sf0 sf0, oj1 oj1) {
        this.f40539a = sf0;
        this.f40540b = oj1;
    }

    /* renamed from: a */
    public void mo70267a(VideoAd videoAd, float f) {
        this.f40540b.onVolumeChanged(videoAd, f);
    }

    /* renamed from: b */
    public void mo70268b(VideoAd videoAd) {
        this.f40540b.mo69175b(videoAd);
    }

    /* renamed from: c */
    public void mo70269c(VideoAd videoAd) {
        this.f40540b.onAdPaused(videoAd);
    }

    /* renamed from: d */
    public void mo70270d(VideoAd videoAd) {
        this.f40540b.mo69173a(new ze0(this.f40539a, videoAd));
    }

    /* renamed from: e */
    public void mo70271e(VideoAd videoAd) {
        this.f40540b.onAdResumed(videoAd);
    }

    /* renamed from: f */
    public void mo70272f(VideoAd videoAd) {
        this.f40540b.onAdSkipped(videoAd);
    }

    /* renamed from: g */
    public void mo70273g(VideoAd videoAd) {
        this.f40540b.onAdStarted(videoAd);
    }

    /* renamed from: h */
    public void mo70274h(VideoAd videoAd) {
        this.f40540b.onAdStopped(videoAd);
    }

    /* renamed from: i */
    public void mo70275i(VideoAd videoAd) {
        this.f40540b.mo69176c(videoAd);
    }

    /* renamed from: a */
    public void mo70266a(VideoAd videoAd) {
        this.f40540b.onAdCompleted(videoAd);
    }

    /* renamed from: a */
    public void mo70265a() {
        this.f40539a.mo69969a((qj1) null);
    }
}
