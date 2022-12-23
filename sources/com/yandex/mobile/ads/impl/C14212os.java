package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.os */
final class C14212os extends Lambda implements Function1<Double, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14628ss f38313b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14212os(C14628ss ssVar) {
        super(1);
        this.f38313b = ssVar;
    }

    public Object invoke(Object obj) {
        this.f38313b.setAspectRatio((float) ((Number) obj).doubleValue());
        return Unit.INSTANCE;
    }
}
