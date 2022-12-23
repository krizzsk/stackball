package com.tapjoy.internal;

import com.applovin.mediation.unity.BuildConfig;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* renamed from: com.tapjoy.internal.da */
public enum C9147da {
    PREROLL(InstreamAdBreakType.PREROLL),
    MIDROLL(InstreamAdBreakType.MIDROLL),
    POSTROLL("postroll"),
    STANDALONE(BuildConfig.FLAVOR);
    

    /* renamed from: e */
    private final String f22492e;

    private C9147da(String str) {
        this.f22492e = str;
    }

    public final String toString() {
        return this.f22492e;
    }
}
