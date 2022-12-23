package com.yandex.mobile.ads.impl;

import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ni */
public final class C14100ni {

    /* renamed from: a */
    private final C13979mi f37806a = new C13979mi();

    /* renamed from: a */
    public final in1 mo69032a(C13413ii iiVar) {
        Intrinsics.checkNotNullParameter(iiVar, VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
        return new in1(iiVar) {
            public final /* synthetic */ C13413ii f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final Map mo65493a() {
                return C14100ni.m40041a(C14100ni.this, this.f$1);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final Map m40041a(C14100ni niVar, C13413ii iiVar) {
        Intrinsics.checkNotNullParameter(niVar, "this$0");
        Intrinsics.checkNotNullParameter(iiVar, "$creative");
        C13709ki a = niVar.f37806a.mo68692a(iiVar);
        List<qe1> b = a == null ? null : a.mo68232b();
        if (b == null) {
            b = CollectionsKt.emptyList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : b) {
            String a2 = ((qe1) next).mo69585a();
            Object obj = linkedHashMap.get(a2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a2, obj);
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
}
