package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class cl1 implements bl1, dl1 {

    /* renamed from: a */
    private final Set<bl1> f31971a = new LinkedHashSet();

    /* renamed from: b */
    private final Set<dl1> f31972b = new LinkedHashSet();

    /* renamed from: a */
    public final void mo66329a(bl1... bl1Arr) {
        Intrinsics.checkNotNullParameter(bl1Arr, "newProgressChangeListeners");
        CollectionsKt.addAll(this.f31971a, (T[]) bl1Arr);
    }

    /* renamed from: b */
    public void mo66331b() {
        for (dl1 b : this.f31972b) {
            b.mo66331b();
        }
    }

    /* renamed from: a */
    public final void mo66330a(dl1... dl1Arr) {
        Intrinsics.checkNotNullParameter(dl1Arr, "newProgressLifecycleListeners");
        CollectionsKt.addAll(this.f31972b, (T[]) dl1Arr);
    }

    /* renamed from: a */
    public void mo66071a(long j, long j2) {
        for (bl1 a : this.f31971a) {
            a.mo66071a(j, j2);
        }
    }

    /* renamed from: a */
    public void mo66328a() {
        for (dl1 a : this.f31972b) {
            a.mo66328a();
        }
    }
}
