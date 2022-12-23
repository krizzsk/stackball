package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ci0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class be0<T extends ci0<?>> implements gd1<T> {

    /* renamed from: b */
    private final Map<String, T> f31311b = C13204gg.m36607a();

    /* renamed from: a */
    public T mo66059a(String str) {
        Intrinsics.checkNotNullParameter(str, "templateId");
        return (ci0) this.f31311b.get(str);
    }

    /* renamed from: a */
    public final void mo66060a(String str, T t) {
        Intrinsics.checkNotNullParameter(str, "templateId");
        Intrinsics.checkNotNullParameter(t, "jsonTemplate");
        this.f31311b.put(str, t);
    }

    /* renamed from: a */
    public final void mo66061a(Map<String, T> map) {
        Intrinsics.checkNotNullParameter(map, "target");
        map.putAll(this.f31311b);
    }
}
