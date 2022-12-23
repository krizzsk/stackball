package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.j3 */
public class C13472j3 implements InstreamAdPlayerListener {

    /* renamed from: a */
    private final C14864v4 f35121a;

    /* renamed from: b */
    private InstreamAdPlayerListener f35122b;

    public C13472j3(C14864v4 v4Var) {
        this.f35121a = v4Var;
    }

    /* renamed from: a */
    public void mo67920a(InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f35122b = instreamAdPlayerListener;
    }

    public void onAdBufferingFinished(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingFinished(videoAd);
        }
    }

    public void onAdBufferingStarted(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingStarted(videoAd);
        }
    }

    public void onAdCompleted(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdCompleted(videoAd);
        }
    }

    public void onAdPaused(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPaused(videoAd);
        }
    }

    public void onAdPrepared(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPrepared(videoAd);
        }
    }

    public void onAdResumed(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdResumed(videoAd);
        }
    }

    public void onAdSkipped(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdSkipped(videoAd);
        }
    }

    public void onAdStarted(VideoAd videoAd) {
        this.f35121a.mo70443a();
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStarted(videoAd);
        }
    }

    public void onAdStopped(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStopped(videoAd);
        }
    }

    public void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onError(videoAd, instreamAdPlayerError);
        }
    }

    public void onVolumeChanged(VideoAd videoAd, float f) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f35122b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onVolumeChanged(videoAd, f);
        }
    }
}
