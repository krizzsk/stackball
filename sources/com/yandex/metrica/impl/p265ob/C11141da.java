package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10622P3;
import com.yandex.metrica.impl.p265ob.C11152dg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.da */
public final class C11141da implements C11194ea<C10622P3, C11152dg> {
    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11152dg dgVar = (C11152dg) obj;
        C11152dg.C11153a aVar = dgVar.f26720b;
        if (aVar == null) {
            aVar = new C11152dg.C11153a();
        }
        C10622P3.C10623a a = m28714a(aVar);
        C11152dg.C11153a[] aVarArr = dgVar.f26721c;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C11152dg.C11153a aVar2 : aVarArr) {
            Intrinsics.checkNotNullExpressionValue(aVar2, "it");
            arrayList.add(m28714a(aVar2));
        }
        return new C10622P3(a, arrayList);
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C10622P3 p3 = (C10622P3) obj;
        C11152dg dgVar = new C11152dg();
        dgVar.f26720b = m28715a(p3.mo61903c());
        int size = p3.mo61111a().size();
        C11152dg.C11153a[] aVarArr = new C11152dg.C11153a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = m28715a(p3.mo61111a().get(i));
        }
        dgVar.f26721c = aVarArr;
        return dgVar;
    }

    /* renamed from: a */
    private final C11152dg.C11153a m28715a(C10622P3.C10623a aVar) {
        C11152dg.C11154b bVar;
        C11152dg.C11153a aVar2 = new C11152dg.C11153a();
        Map<String, String> b = aVar.mo61907b();
        int i = 0;
        if (b != null) {
            bVar = new C11152dg.C11154b();
            int size = b.size();
            C11152dg.C11154b.C11155a[] aVarArr = new C11152dg.C11154b.C11155a[size];
            for (int i2 = 0; i2 < size; i2++) {
                aVarArr[i2] = new C11152dg.C11154b.C11155a();
            }
            bVar.f26725b = aVarArr;
            int i3 = 0;
            for (Map.Entry next : b.entrySet()) {
                C11152dg.C11154b.C11155a[] aVarArr2 = bVar.f26725b;
                aVarArr2[i3].f26727b = (String) next.getKey();
                aVarArr2[i3].f26728c = (String) next.getValue();
                i3++;
            }
        } else {
            bVar = null;
        }
        aVar2.f26723b = bVar;
        int ordinal = aVar.mo61253a().ordinal();
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        }
        aVar2.f26724c = i;
        return aVar2;
    }

    /* renamed from: a */
    private final C10622P3.C10623a m28714a(C11152dg.C11153a aVar) {
        C10202E0 e0;
        C11152dg.C11154b bVar = aVar.f26723b;
        Map<String, String> a = bVar != null ? m28716a(bVar) : null;
        int i = aVar.f26724c;
        if (i == 0) {
            e0 = C10202E0.UNDEFINED;
        } else if (i == 1) {
            e0 = C10202E0.APP;
        } else if (i == 2) {
            e0 = C10202E0.SATELLITE;
        } else if (i != 3) {
            e0 = C10202E0.UNDEFINED;
        } else {
            e0 = C10202E0.RETAIL;
        }
        return new C10622P3.C10623a(a, e0);
    }

    /* renamed from: a */
    private final Map<String, String> m28716a(C11152dg.C11154b bVar) {
        C11152dg.C11154b.C11155a[] aVarArr = bVar.f26725b;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "proto.pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(aVarArr.length), 16));
        for (C11152dg.C11154b.C11155a aVar : aVarArr) {
            Pair pair = TuplesKt.m45515to(aVar.f26727b, aVar.f26728c);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
