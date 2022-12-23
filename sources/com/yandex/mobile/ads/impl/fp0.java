package com.yandex.mobile.ads.impl;

enum fp0 {
    AD_VIDEO_COMPLETE("advideocomplete"),
    IMPRESSION_TRACKING_START("impressionTrackingStart"),
    IMPRESSION_TRACKING_SUCCESS("impressionTrackingSuccess"),
    CLOSE("close"),
    OPEN("open"),
    REWARDED_AD_COMPLETE("rewardedAdComplete"),
    USE_CUSTOM_CLOSE("usecustomclose"),
    UNSPECIFIED("");
    

    /* renamed from: b */
    private final String f33488b;

    private fp0(String str) {
        this.f33488b = str;
    }

    /* renamed from: a */
    static fp0 m36097a(String str) {
        for (fp0 fp0 : values()) {
            if (fp0.f33488b.equals(str)) {
                return fp0;
            }
        }
        return UNSPECIFIED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo67063a() {
        return this.f33488b;
    }
}
