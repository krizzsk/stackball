package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ot0 {

    /* renamed from: a */
    private fm0 f38314a = new fm0();

    /* renamed from: a */
    public final boolean mo69266a(vq0 vq0) {
        Intrinsics.checkNotNullParameter(vq0, "nativeAdBlock");
        List<pq0> c = vq0.mo70515c().mo65856c();
        Intrinsics.checkNotNullExpressionValue(c, "nativeAdBlock.nativeAdResponse.nativeAds");
        ArrayList<dm0> arrayList = new ArrayList<>();
        for (pq0 a : c) {
            Set<dm0> a2 = this.f38314a.mo67034a(a);
            Intrinsics.checkNotNullExpressionValue(a2, "mediaValuesProvider.getMediaValues(nativeAd)");
            CollectionsKt.addAll(arrayList, a2);
        }
        ArrayList<ck1> arrayList2 = new ArrayList<>();
        for (dm0 c2 : arrayList) {
            kj1 c3 = c2.mo66639c();
            List<ck1<fu0>> b = c3 == null ? null : c3.mo68243b();
            if (b == null) {
                b = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList2, b);
        }
        if (!arrayList2.isEmpty()) {
            for (ck1 e : arrayList2) {
                List<vi1> d = e.mo66325e().mo68457d();
                Intrinsics.checkNotNullExpressionValue(d, "videoAdInfo.vastVideoAd.adVerifications");
                if (!d.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
