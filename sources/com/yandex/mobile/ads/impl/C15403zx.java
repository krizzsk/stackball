package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.zx */
final class C15403zx extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12931dy f43489b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15403zx(C12931dy dyVar) {
        super(1);
        this.f43489b = dyVar;
    }

    public Object invoke(Object obj) {
        this.f43489b.setThumbValue((float) ((Number) obj).intValue(), false);
        return Unit.INSTANCE;
    }
}
