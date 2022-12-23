package com.ogury.p245ed.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ogury.ed.internal.aw */
public final class C8046aw {

    /* renamed from: a */
    public static final C8046aw f20912a = new C8046aw();

    /* renamed from: b */
    private static final Map<String, C8045av> f20913b;

    private C8046aw() {
    }

    static {
        Map<String, C8045av> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C8467mq.m23878a((Object) synchronizedMap, "synchronizedMap(mutableMapOf())");
        f20913b = synchronizedMap;
    }

    /* renamed from: a */
    public static String m22409a(C8045av avVar) {
        C8467mq.m23881b(avVar, "item");
        String uuid = UUID.randomUUID().toString();
        C8467mq.m23878a((Object) uuid, "randomUUID().toString()");
        f20913b.put(uuid, avVar);
        return uuid;
    }

    /* renamed from: a */
    public static C8045av m22408a(String str) {
        Map<String, C8045av> map = f20913b;
        if (map != null) {
            return (C8045av) C8473mw.m23901c(map).remove(str);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }
}
