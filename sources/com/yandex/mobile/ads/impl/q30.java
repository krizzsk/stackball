package com.yandex.mobile.ads.impl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class q30 {

    /* renamed from: a */
    private final Map<String, p30> f38977a = new LinkedHashMap();

    /* renamed from: a */
    public final p30 mo69474a(C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, ViewHierarchyConstants.TAG_KEY);
        Map<String, p30> map = this.f38977a;
        String a = crVar.mo66346a();
        Intrinsics.checkNotNullExpressionValue(a, "tag.id");
        p30 p30 = map.get(a);
        if (p30 == null) {
            p30 = new p30();
            map.put(a, p30);
        }
        return p30;
    }
}
