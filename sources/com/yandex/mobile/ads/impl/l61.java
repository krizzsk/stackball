package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class l61 {

    /* renamed from: a */
    private final Set<k61> f36547a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void mo68359a(k61 k61) {
        Intrinsics.checkNotNullParameter(k61, "route");
        this.f36547a.remove(k61);
    }

    /* renamed from: b */
    public final synchronized void mo68360b(k61 k61) {
        Intrinsics.checkNotNullParameter(k61, "failedRoute");
        this.f36547a.add(k61);
    }

    /* renamed from: c */
    public final synchronized boolean mo68361c(k61 k61) {
        Intrinsics.checkNotNullParameter(k61, "route");
        return this.f36547a.contains(k61);
    }
}
