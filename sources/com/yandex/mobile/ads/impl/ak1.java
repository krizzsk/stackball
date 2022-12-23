package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ak1 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Map m33777b(lj1 lj1) {
        Intrinsics.checkNotNullParameter(lj1, "$videoAd");
        List<qe1> b = lj1.mo68466k().mo71092b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : b) {
            String a = ((qe1) next).mo69585a();
            Object obj = linkedHashMap.get(a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable<qe1> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (qe1 c : iterable) {
                arrayList.add(c.mo69587c());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }

    /* renamed from: a */
    public final in1 mo65796a(lj1 lj1) {
        Intrinsics.checkNotNullParameter(lj1, "videoAd");
        return new in1() {
            /* renamed from: a */
            public final Map mo65493a() {
                return ak1.m33777b(lj1.this);
            }
        };
    }
}
