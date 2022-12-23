package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.Intrinsics;

public final class xt0 {

    /* renamed from: a */
    private final rz0 f42694a;

    /* renamed from: b */
    private final vm1 f42695b;

    /* renamed from: c */
    private final bp1 f42696c;

    public xt0(qn1 qn1, st0 st0, rn1 rn1, eu0 eu0) {
        Intrinsics.checkNotNullParameter(qn1, "viewAdapter");
        Intrinsics.checkNotNullParameter(st0, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(rn1, "videoViewProvider");
        Intrinsics.checkNotNullParameter(eu0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ut0 ut0 = new ut0(st0);
        this.f42694a = new rz0(eu0);
        this.f42695b = new vm1(qn1);
        this.f42696c = new bp1(ut0, rn1);
    }

    /* renamed from: a */
    public final void mo70941a(cl1 cl1) {
        Intrinsics.checkNotNullParameter(cl1, "progressEventsObservable");
        cl1.mo66329a(this.f42694a, this.f42695b, this.f42696c);
    }
}
