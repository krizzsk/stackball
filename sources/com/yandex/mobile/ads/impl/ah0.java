package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

public final class ah0 {

    /* renamed from: a */
    private final ll1 f30538a;

    /* renamed from: b */
    private final og0 f30539b;

    /* renamed from: c */
    private final ck1<VideoAd> f30540c;

    /* renamed from: d */
    private final hg0 f30541d = hg0.m36966a();

    public ah0(ll1 ll1, og0 og0, ck1<VideoAd> ck1) {
        Intrinsics.checkNotNullParameter(ll1, "statusController");
        Intrinsics.checkNotNullParameter(og0, "adBreak");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        this.f30538a = ll1;
        this.f30539b = og0;
        this.f30540c = ck1;
    }

    /* renamed from: a */
    public final boolean mo65773a() {
        kl1 kl1;
        AdPodInfo adPodInfo = this.f30540c.mo66323c().getAdPodInfo();
        Intrinsics.checkNotNullExpressionValue(adPodInfo, "videoAdInfo.playbackInfo.adPodInfo");
        if (!this.f30541d.mo67550b() || adPodInfo.getAdPosition() <= 1) {
            String type = this.f30539b.getType();
            int hashCode = type.hashCode();
            if (hashCode == -1183812830 ? !type.equals(InstreamAdBreakType.INROLL) : !(hashCode == 830323571 ? type.equals(InstreamAdBreakType.PAUSEROLL) : hashCode == 1055572677 && type.equals(InstreamAdBreakType.MIDROLL))) {
                kl1 = kl1.PREPARING;
            } else if (adPodInfo.getAdPosition() == 1) {
                kl1 = kl1.PLAYING;
            } else {
                kl1 = kl1.PREPARING;
            }
        } else {
            kl1 = kl1.PLAYING;
        }
        return this.f30538a.mo68487a(kl1);
    }
}
