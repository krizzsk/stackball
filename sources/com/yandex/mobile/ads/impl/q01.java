package com.yandex.mobile.ads.impl;

import com.applovin.mediation.unity.BuildConfig;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

public enum q01 {
    PREROLL(InstreamAdBreakType.PREROLL),
    MIDROLL(InstreamAdBreakType.MIDROLL),
    POSTROLL("postroll"),
    STANDALONE(BuildConfig.FLAVOR);
    

    /* renamed from: b */
    private final String f38928b;

    private q01(String str) {
        this.f38928b = str;
    }

    public String toString() {
        return this.f38928b;
    }
}
