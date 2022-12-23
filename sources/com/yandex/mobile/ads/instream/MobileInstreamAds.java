package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.hg0;

public final class MobileInstreamAds {
    private MobileInstreamAds() {
    }

    public static void setAdGroupPreloading(boolean z) {
        hg0.m36966a().mo67548a(z);
    }

    static void setControlsEnabled(boolean z) {
        hg0.m36966a().mo67549b(z);
    }

    static void setDiscardAdGroupOnSkip(boolean z) {
        hg0.m36966a().mo67551c(z);
    }
}
