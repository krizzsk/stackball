package com.iab.omid.library.smaato.adsession.video;

import com.applovin.mediation.unity.BuildConfig;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

public enum Position {
    PREROLL(InstreamAdBreakType.PREROLL),
    MIDROLL(InstreamAdBreakType.MIDROLL),
    POSTROLL("postroll"),
    STANDALONE(BuildConfig.FLAVOR);
    
    private final String position;

    private Position(String str) {
        this.position = str;
    }

    public final String toString() {
        return this.position;
    }
}
