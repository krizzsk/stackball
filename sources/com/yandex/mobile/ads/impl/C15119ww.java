package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14841uw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ww */
final class C15119ww extends Lambda implements Function1<C14841uw.C14847f.C14851d, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12458ax f42308b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15119ww(C12458ax axVar) {
        super(1);
        this.f42308b = axVar;
    }

    public Object invoke(Object obj) {
        C14841uw.C14847f.C14851d dVar = (C14841uw.C14847f.C14851d) obj;
        Intrinsics.checkNotNullParameter(dVar, "orientation");
        this.f42308b.setHorizontal(dVar == C14841uw.C14847f.C14851d.HORIZONTAL);
        return Unit.INSTANCE;
    }
}
