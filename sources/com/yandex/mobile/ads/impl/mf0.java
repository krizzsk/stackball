package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

public final class mf0 {

    /* renamed from: a */
    private final e91 f37364a;

    /* renamed from: b */
    private final o11 f37365b;

    /* renamed from: c */
    private final bh0 f37366c;

    public mf0(VideoAd videoAd, rn1 rn1, wk1<VideoAd> wk1, vf0 vf0, ll1 ll1) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(rn1, "videoViewProvider");
        Intrinsics.checkNotNullParameter(wk1, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(vf0, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(ll1, "adStatusController");
        this.f37364a = new e91(vf0, videoAd);
        this.f37365b = new o11(vf0);
        this.f37366c = new bh0(wk1, rn1, ll1);
    }

    /* renamed from: a */
    public final void mo68680a(cl1 cl1) {
        Intrinsics.checkNotNullParameter(cl1, "progressEventsObservable");
        cl1.mo66329a(this.f37364a, this.f37365b, this.f37366c);
    }
}
