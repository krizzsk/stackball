package com.ogury.p245ed.internal;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.le */
class C8426le extends C8425ld {
    /* renamed from: a */
    public static final int m23844a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23845a(C8380jz<? extends K, ? extends V> jzVar) {
        C8467mq.m23881b(jzVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jzVar.mo53853a(), jzVar.mo53854b());
        C8467mq.m23878a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }
}
