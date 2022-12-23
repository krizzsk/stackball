package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.l2 */
public final class C13828l2 {

    /* renamed from: a */
    private final C13677k2 f36496a;

    public C13828l2(Context context, og0 og0, gf0 gf0, vf0 vf0, mk1<VideoAd> mk1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(og0, "adBreak");
        Intrinsics.checkNotNullParameter(gf0, "adPlayerController");
        Intrinsics.checkNotNullParameter(vf0, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(mk1, "playbackEventsListener");
        C13156g1 a = new C12694c1().mo66180a(og0.mo69155a().mo65934c());
        Intrinsics.checkNotNullExpressionValue(a, "adBreakPositionConverter.convert(adBreakId)");
        this.f36496a = new C13677k2(context, og0, a, gf0, vf0, mk1);
    }

    /* renamed from: a */
    public final List<C13471j2> mo68309a(List<? extends ck1<VideoAd>> list) {
        Intrinsics.checkNotNullParameter(list, "videoAdInfoList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ck1 a : list) {
            arrayList.add(this.f36496a.mo68116a(a));
        }
        return arrayList;
    }
}
