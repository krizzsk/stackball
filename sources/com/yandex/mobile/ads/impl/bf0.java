package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class bf0 implements h41.C13275a {

    /* renamed from: a */
    private final ek1 f31314a;

    public bf0(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f31314a = new ek1(videoAd);
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        i41 i41 = new i41(new LinkedHashMap());
        i41.mo67733b("product_type", this.f31314a.mo66843a());
        Map<String, Object> a = i41.mo67729a();
        Intrinsics.checkNotNullExpressionValue(a, "reportDataWrapper.reportData");
        return a;
    }
}
