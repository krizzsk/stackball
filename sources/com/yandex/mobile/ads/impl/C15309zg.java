package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.zg */
public class C15309zg implements oj1 {

    /* renamed from: a */
    private final oj1[] f43112a;

    public C15309zg(oj1... oj1Arr) {
        this.f43112a = oj1Arr;
    }

    /* renamed from: a */
    public void mo69173a(ze0 ze0) {
        for (oj1 a : this.f43112a) {
            a.mo69173a(ze0);
        }
    }

    /* renamed from: b */
    public void mo69175b(VideoAd videoAd) {
        for (oj1 b : this.f43112a) {
            b.mo69175b(videoAd);
        }
    }

    /* renamed from: c */
    public void mo69176c(VideoAd videoAd) {
        for (oj1 c : this.f43112a) {
            c.mo69176c(videoAd);
        }
    }

    public void onAdCompleted(VideoAd videoAd) {
        for (oj1 onAdCompleted : this.f43112a) {
            onAdCompleted.onAdCompleted(videoAd);
        }
    }

    public void onAdPaused(VideoAd videoAd) {
        for (oj1 onAdPaused : this.f43112a) {
            onAdPaused.onAdPaused(videoAd);
        }
    }

    public void onAdResumed(VideoAd videoAd) {
        for (oj1 onAdResumed : this.f43112a) {
            onAdResumed.onAdResumed(videoAd);
        }
    }

    public void onAdSkipped(VideoAd videoAd) {
        for (oj1 onAdSkipped : this.f43112a) {
            onAdSkipped.onAdSkipped(videoAd);
        }
    }

    public void onAdStarted(VideoAd videoAd) {
        for (oj1 onAdStarted : this.f43112a) {
            onAdStarted.onAdStarted(videoAd);
        }
    }

    public void onAdStopped(VideoAd videoAd) {
        for (oj1 onAdStopped : this.f43112a) {
            onAdStopped.onAdStopped(videoAd);
        }
    }

    public void onVolumeChanged(VideoAd videoAd, float f) {
        for (oj1 onVolumeChanged : this.f43112a) {
            onVolumeChanged.onVolumeChanged(videoAd, f);
        }
    }

    /* renamed from: a */
    public void mo69174a(VideoAd videoAd) {
        for (oj1 a : this.f43112a) {
            a.mo69174a(videoAd);
        }
    }
}
