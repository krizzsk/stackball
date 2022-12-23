package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ci0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class ek0<T extends ci0<?>> implements gd1<T> {

    /* renamed from: b */
    private final be0<T> f32997b;

    /* renamed from: c */
    private gd1<? extends T> f32998c;

    public ek0(be0<T> be0, gd1<? extends T> gd1) {
        Intrinsics.checkNotNullParameter(be0, "inMemoryProvider");
        Intrinsics.checkNotNullParameter(gd1, "dbProvider");
        this.f32997b = be0;
        this.f32998c = gd1;
    }

    /* renamed from: a */
    public T mo66059a(String str) {
        Intrinsics.checkNotNullParameter(str, "templateId");
        T a = this.f32997b.mo66059a(str);
        if (a == null) {
            a = this.f32998c.mo66059a(str);
            if (a == null) {
                return null;
            }
            this.f32997b.mo66060a(str, a);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo66842b(Map<String, T> map) {
        Intrinsics.checkNotNullParameter(map, "target");
        this.f32997b.mo66061a(map);
    }

    /* renamed from: a */
    public final void mo66841a(Map<String, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "parsed");
        for (Map.Entry next : map.entrySet()) {
            this.f32997b.mo66060a((String) next.getKey(), (ci0) next.getValue());
        }
    }
}
