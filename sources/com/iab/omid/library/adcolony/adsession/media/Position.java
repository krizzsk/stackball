package com.iab.omid.library.adcolony.adsession.media;

import com.applovin.mediation.unity.BuildConfig;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

public enum Position {
    PREROLL(InstreamAdBreakType.PREROLL),
    MIDROLL(InstreamAdBreakType.MIDROLL),
    POSTROLL("postroll"),
    STANDALONE(BuildConfig.FLAVOR);
    

    /* renamed from: a */
    private final String f10274a;

    private Position(String str) {
        this.f10274a = str;
    }

    public String toString() {
        return this.f10274a;
    }
}
