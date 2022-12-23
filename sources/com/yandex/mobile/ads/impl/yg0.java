package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

public final class yg0 implements ym1 {

    /* renamed from: a */
    private final sn1 f42848a;

    /* renamed from: b */
    private final ah0 f42849b;

    public yg0(og0 og0, ck1<VideoAd> ck1, ll1 ll1, rn1 rn1) {
        Intrinsics.checkNotNullParameter(og0, "adBreak");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(ll1, "statusController");
        Intrinsics.checkNotNullParameter(rn1, "viewProvider");
        this.f42848a = new sn1(rn1, 1);
        this.f42849b = new ah0(ll1, og0, ck1);
    }

    /* renamed from: a */
    public boolean mo68097a() {
        return this.f42849b.mo65773a() && this.f42848a.mo70036a();
    }
}
