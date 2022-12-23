package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.fa */
public final class C11236fa implements C11194ea<Map<String, ? extends List<? extends String>>, C11428kg.C11434d[]> {
    /* renamed from: a */
    public C11428kg.C11434d[] mo61050b(Map<String, ? extends List<String>> map) {
        int size = map.size();
        C11428kg.C11434d[] dVarArr = new C11428kg.C11434d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new C11428kg.C11434d();
        }
        int i2 = 0;
        for (T next : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            dVarArr[i2].f27456b = (String) entry.getKey();
            C11428kg.C11434d dVar = dVarArr[i2];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array != null) {
                dVar.f27457c = (String[]) array;
                i2 = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return dVarArr;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo61049a(C11428kg.C11434d[] dVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(dVarArr.length), 16));
        for (C11428kg.C11434d dVar : dVarArr) {
            String str = dVar.f27456b;
            String[] strArr = dVar.f27457c;
            Intrinsics.checkNotNullExpressionValue(strArr, "it.hosts");
            Pair pair = TuplesKt.m45515to(str, ArraysKt.toList((T[]) strArr));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
