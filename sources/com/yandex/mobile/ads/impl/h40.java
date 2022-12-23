package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class h40 implements InstreamAdPlayer {

    /* renamed from: a */
    private final C15146x4 f34213a;

    /* renamed from: b */
    private final C13472j3 f34214b;

    /* renamed from: c */
    private final C13829l3 f34215c;

    /* renamed from: d */
    private final C13678k3 f34216d;

    /* renamed from: e */
    private final a01 f34217e;

    /* renamed from: f */
    private final c01 f34218f;

    /* renamed from: g */
    private final t11 f34219g;

    public h40(C15146x4 x4Var, zz0 zz0, t11 t11, C13829l3 l3Var, C13678k3 k3Var, C13472j3 j3Var) {
        this.f34213a = x4Var;
        this.f34217e = zz0.mo71287d();
        this.f34218f = zz0.mo71288e();
        this.f34219g = t11;
        this.f34215c = l3Var;
        this.f34216d = k3Var;
        this.f34214b = j3Var;
    }

    public long getAdDuration(VideoAd videoAd) {
        return this.f34219g.mo65690a().mo70257a();
    }

    public long getAdPosition(VideoAd videoAd) {
        return this.f34219g.mo65690a().mo70258b();
    }

    public float getVolume(VideoAd videoAd) {
        Float a = this.f34218f.mo66177a();
        if (a != null) {
            return a.floatValue();
        }
        return 0.0f;
    }

    public boolean isPlayingAd(VideoAd videoAd) {
        return this.f34213a.mo70822a(videoAd) != qf0.f39097b && this.f34217e.mo65634c();
    }

    public void pauseAd(VideoAd videoAd) {
        try {
            this.f34216d.mo68117c(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    public void playAd(VideoAd videoAd) {
        try {
            this.f34216d.mo68118d(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    public void prepareAd(VideoAd videoAd) {
        try {
            this.f34215c.mo68310a(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    public void releaseAd(VideoAd videoAd) {
    }

    public void resumeAd(VideoAd videoAd) {
        try {
            this.f34216d.mo68119e(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    public void setInstreamAdPlayerListener(InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f34214b.mo67920a(instreamAdPlayerListener);
    }

    public void setVolume(VideoAd videoAd, float f) {
        this.f34218f.mo66178a(f);
        this.f34214b.onVolumeChanged(videoAd, f);
    }

    public void skipAd(VideoAd videoAd) {
        try {
            this.f34216d.mo68120f(videoAd);
        } catch (RuntimeException unused) {
        }
    }

    public void stopAd(VideoAd videoAd) {
        try {
            this.f34216d.mo68121g(videoAd);
        } catch (RuntimeException unused) {
        }
    }
}
