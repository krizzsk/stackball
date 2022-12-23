package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.jt */
final class C13585jt extends Lambda implements Function1<Double, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14933vt f35633b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13585jt(C14933vt vtVar) {
        super(1);
        this.f35633b = vtVar;
    }

    public Object invoke(Object obj) {
        this.f35633b.setAspectRatio((float) ((Number) obj).doubleValue());
        return Unit.INSTANCE;
    }
}
