package com.yandex.mobile.ads.impl;

import android.view.View;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.video.models.p268ad.C15566b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class pm1 implements h41.C13275a {

    /* renamed from: a */
    private final ck1<?> f38743a;

    /* renamed from: b */
    private final rn1 f38744b;

    public pm1(ck1<?> ck1, rn1 rn1) {
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(rn1, "videoViewProvider");
        this.f38743a = ck1;
        this.f38744b = rn1;
    }

    /* renamed from: a */
    public Map<String, Object> mo66063a() {
        Integer num;
        Integer num2;
        i41 i41 = new i41(new LinkedHashMap());
        View a = this.f38744b.mo69797a();
        Integer num3 = null;
        if (a == null) {
            num = null;
        } else {
            num = Integer.valueOf(a.getHeight());
        }
        if (a == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(a.getWidth());
        }
        C15566b b = this.f38743a.mo66322b();
        Intrinsics.checkNotNullExpressionValue(b, "videoAdInfo.mediaFile");
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        i41.mo67733b("view_container_height", num);
        if (num2 == null || num2.intValue() <= 0) {
            num2 = null;
        }
        i41.mo67733b("view_container_width", num2);
        i41.mo67733b(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_HEIGHT, b.mo71983b() > 0 ? Integer.valueOf(b.mo71983b()) : null);
        if (b.mo71988f() > 0) {
            num3 = Integer.valueOf(b.mo71988f());
        }
        i41.mo67733b(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_WIDTH, num3);
        i41.mo67733b("video_codec", b.mo71982a());
        i41.mo67733b("video_mime_type", b.mo71984c());
        i41.mo67733b("video_vmaf", b.mo71986e());
        Map<String, Object> a2 = i41.mo67729a();
        Intrinsics.checkNotNullExpressionValue(a2, "wrapper.reportData");
        return MapsKt.mapOf(TuplesKt.m45515to("video_playback_info", a2));
    }
}
