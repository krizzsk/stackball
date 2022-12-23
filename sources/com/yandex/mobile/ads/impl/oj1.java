package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

public interface oj1 {
    /* renamed from: a */
    void mo69173a(ze0 ze0);

    /* renamed from: a */
    void mo69174a(VideoAd videoAd);

    /* renamed from: b */
    void mo69175b(VideoAd videoAd);

    /* renamed from: c */
    void mo69176c(VideoAd videoAd);

    void onAdCompleted(VideoAd videoAd);

    void onAdPaused(VideoAd videoAd);

    void onAdResumed(VideoAd videoAd);

    void onAdSkipped(VideoAd videoAd);

    void onAdStarted(VideoAd videoAd);

    void onAdStopped(VideoAd videoAd);

    void onVolumeChanged(VideoAd videoAd, float f);
}
