package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11408jo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ao */
public class C11055ao<T, R> implements C11255fo<T, R> {

    /* renamed from: a */
    private final Map<T, C11295go<R>> f26545a;

    public C11055ao(Map<T, C11295go<R>> map) {
        this.f26545a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public C11408jo<Map<T, R>> get(Map<T, R> map) {
        C11408jo.C11409a.values();
        int[] iArr = new int[3];
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            C11295go goVar = this.f26545a.get(next.getKey());
            if (goVar != null) {
                C11408jo joVar = goVar.get(next.getValue());
                int ordinal = joVar.f27291a.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
                hashMap.put(next.getKey(), joVar.f27292b);
            }
        }
        C11408jo.C11409a aVar = C11408jo.C11409a.NEW;
        if (iArr[0] > 0) {
            return new C11408jo<>(aVar, hashMap);
        }
        C11408jo.C11409a aVar2 = C11408jo.C11409a.REFRESH;
        if (iArr[2] > 0) {
            return new C11408jo<>(aVar2, hashMap);
        }
        return new C11408jo<>(C11408jo.C11409a.NOT_CHANGED, hashMap);
    }
}
