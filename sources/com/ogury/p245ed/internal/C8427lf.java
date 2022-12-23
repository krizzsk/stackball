package com.ogury.p245ed.internal;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.lf */
class C8427lf extends C8426le {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m23846a() {
        C8407kz kzVar = C8407kz.f21638a;
        if (kzVar != null) {
            return kzVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: a */
    public static final <K, V> void m23849a(Map<? super K, ? super V> map, Iterable<? extends C8380jz<? extends K, ? extends V>> iterable) {
        C8467mq.m23881b(map, "$this$putAll");
        C8467mq.m23881b(iterable, "pairs");
        for (C8380jz jzVar : iterable) {
            map.put(jzVar.mo53855c(), jzVar.mo53856d());
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23847a(Iterable<? extends C8380jz<? extends K, ? extends V>> iterable) {
        C8467mq.m23881b(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C8424lc.m23846a();
        }
        if (size != 1) {
            return C8424lc.m23848a(iterable, new LinkedHashMap(C8424lc.m23844a(collection.size())));
        }
        return C8424lc.m23845a((C8380jz) ((List) iterable).get(0));
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m23848a(Iterable<? extends C8380jz<? extends K, ? extends V>> iterable, M m) {
        C8467mq.m23881b(iterable, "$this$toMap");
        C8467mq.m23881b(m, "destination");
        C8424lc.m23849a(m, iterable);
        return m;
    }
}
