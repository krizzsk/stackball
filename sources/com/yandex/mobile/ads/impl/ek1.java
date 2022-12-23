package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class ek1 {

    /* renamed from: a */
    private final VideoAd f32999a;

    public ek1(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f32999a = videoAd;
    }

    /* renamed from: a */
    public final String mo66843a() {
        Boolean bool;
        JSONObject a;
        VideoAd videoAd = this.f32999a;
        mg0 mg0 = videoAd instanceof mg0 ? (mg0) videoAd : null;
        String optString = (mg0 == null || (a = mg0.mo68683a()) == null) ? null : a.optString("productType");
        if (optString == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(optString.length() > 0);
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            return optString;
        }
        return null;
    }
}
