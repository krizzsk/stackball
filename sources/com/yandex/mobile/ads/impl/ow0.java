package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class ow0 {

    /* renamed from: a */
    private WeakHashMap<nw0, Object> f38404a = new WeakHashMap<>();

    /* renamed from: a */
    public final void mo69277a(nw0 nw0) {
        Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f38404a.put(nw0, (Object) null);
    }

    /* renamed from: b */
    public final void mo69280b(nw0 nw0) {
        Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f38404a.remove(nw0);
    }

    /* renamed from: a */
    public final boolean mo69278a() {
        return this.f38404a.size() > 0;
    }

    /* renamed from: b */
    public final void mo69279b() {
        for (nw0 a : this.f38404a.keySet()) {
            a.mo69083a();
        }
        this.f38404a.clear();
    }
}
