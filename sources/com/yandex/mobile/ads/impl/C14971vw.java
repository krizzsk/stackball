package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.vw */
final class C14971vw extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12458ax f41666b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14971vw(C12458ax axVar) {
        super(1);
        this.f41666b = axVar;
    }

    public Object invoke(Object obj) {
        this.f41666b.setDividerColor(((Number) obj).intValue());
        return Unit.INSTANCE;
    }
}
