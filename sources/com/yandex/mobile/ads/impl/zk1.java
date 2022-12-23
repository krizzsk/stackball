package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;

public class zk1 implements AdPodInfo {

    /* renamed from: a */
    private final int f43222a;

    /* renamed from: b */
    private final int f43223b;

    public zk1(int i, int i2) {
        this.f43223b = i;
        this.f43222a = i2;
    }

    public int getAdPosition() {
        return this.f43222a;
    }

    public int getAdsCount() {
        return this.f43223b;
    }
}
