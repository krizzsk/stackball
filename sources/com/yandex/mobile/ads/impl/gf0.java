package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class gf0 {

    /* renamed from: a */
    private final InstreamAdPlayer f33982a;

    /* renamed from: b */
    private final hf0 f33983b = new hf0();

    public gf0(InstreamAdPlayer instreamAdPlayer) {
        this.f33982a = instreamAdPlayer;
    }

    /* renamed from: a */
    public void mo67280a(VideoAd videoAd, float f) {
        this.f33982a.setVolume(videoAd, f);
    }

    /* renamed from: b */
    public void mo67284b(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f33983b.mo67535b(videoAd, instreamAdPlayerListener);
    }

    /* renamed from: c */
    public float mo67285c(VideoAd videoAd) {
        return this.f33982a.getVolume(videoAd);
    }

    /* renamed from: d */
    public boolean mo67286d(VideoAd videoAd) {
        return this.f33982a.isPlayingAd(videoAd);
    }

    /* renamed from: e */
    public void mo67287e(VideoAd videoAd) {
        this.f33982a.pauseAd(videoAd);
    }

    /* renamed from: f */
    public void mo67288f(VideoAd videoAd) {
        this.f33982a.playAd(videoAd);
    }

    /* renamed from: g */
    public void mo67289g(VideoAd videoAd) {
        this.f33982a.prepareAd(videoAd);
    }

    /* renamed from: h */
    public void mo67290h(VideoAd videoAd) {
        this.f33982a.releaseAd(videoAd);
    }

    /* renamed from: i */
    public void mo67291i(VideoAd videoAd) {
        this.f33982a.resumeAd(videoAd);
    }

    /* renamed from: j */
    public void mo67292j(VideoAd videoAd) {
        this.f33982a.skipAd(videoAd);
    }

    /* renamed from: k */
    public void mo67293k(VideoAd videoAd) {
        this.f33982a.stopAd(videoAd);
    }

    /* renamed from: a */
    public void mo67281a(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f33983b.mo67534a(videoAd, instreamAdPlayerListener);
    }

    /* renamed from: b */
    public void mo67283b() {
        this.f33982a.setInstreamAdPlayerListener((InstreamAdPlayerListener) null);
        this.f33983b.mo67533a();
    }

    /* renamed from: a */
    public void mo67279a() {
        this.f33982a.setInstreamAdPlayerListener(this.f33983b);
    }

    /* renamed from: a */
    public long mo67278a(VideoAd videoAd) {
        return this.f33982a.getAdDuration(videoAd);
    }

    /* renamed from: b */
    public long mo67282b(VideoAd videoAd) {
        return this.f33982a.getAdPosition(videoAd);
    }
}
