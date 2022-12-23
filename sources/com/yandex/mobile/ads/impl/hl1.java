package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class hl1 {
    @Deprecated

    /* renamed from: b */
    private static final Map<C15139x2, String> f34456b = MapsKt.mapOf(TuplesKt.m45515to(C15139x2.VIDEO_AD_RENDERING, "video_ad_rendering_duration"), TuplesKt.m45515to(C15139x2.VIDEO_AD_PREPARE, "video_ad_prepare_duration"));

    /* renamed from: a */
    private final C15230y2 f34457a;

    public hl1(C15230y2 y2Var) {
        Intrinsics.checkNotNullParameter(y2Var, "adLoadingPhasesManager");
        this.f34457a = y2Var;
    }

    /* renamed from: a */
    public final Map<String, Object> mo67566a() {
        List<C15027w2> b = this.f34457a.mo70969b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : b) {
            C15139x2 a = ((C15027w2) next).mo70624a();
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = f34456b.get(entry.getKey());
            if (str == null) {
                str = "";
            }
            linkedHashMap2.put(str, entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((String) entry2.getKey()).length() > 0) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            Iterable<C15027w2> iterable = (Iterable) entry3.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (C15027w2 b2 : iterable) {
                arrayList.add(b2.mo70625b());
            }
            linkedHashMap4.put(key, arrayList);
        }
        return MapsKt.mapOf(TuplesKt.m45515to("durations", linkedHashMap4));
    }
}
