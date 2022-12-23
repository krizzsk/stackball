package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.yx */
final class C15282yx extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12931dy f42974b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15282yx(C12931dy dyVar) {
        super(1);
        this.f42974b = dyVar;
    }

    public Object invoke(Object obj) {
        this.f42974b.setThumbSecondaryValue(Float.valueOf((float) ((Number) obj).intValue()), false);
        return Unit.INSTANCE;
    }
}
