package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class pw0 {

    /* renamed from: a */
    private final sw0 f38880a;

    /* renamed from: b */
    private final Object f38881b = new Object();

    /* renamed from: c */
    private final List<nw0> f38882c = new ArrayList();

    public pw0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38880a = sw0.f40159g.mo70068a(context);
    }

    /* renamed from: a */
    public final void mo69451a(nw0 nw0) {
        Intrinsics.checkNotNullParameter(nw0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f38881b) {
            this.f38882c.add(nw0);
            this.f38880a.mo70067b(nw0);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo69450a() {
        synchronized (this.f38881b) {
            for (nw0 a : this.f38882c) {
                this.f38880a.mo70066a(a);
            }
            this.f38882c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
