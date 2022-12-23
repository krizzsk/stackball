package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class hd1 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f34381a = new LinkedHashMap();

    /* renamed from: a */
    public final String mo67528a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "path");
        Map map = this.f34381a.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    public final void mo67529a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "path");
        Intrinsics.checkNotNullParameter(str3, "stateId");
        synchronized (this.f34381a) {
            Map<String, Map<String, String>> map = this.f34381a;
            Map<String, String> map2 = map.get(str);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(str, map2);
            }
            map2.put(str2, str3);
            Unit unit = Unit.INSTANCE;
        }
    }
}
