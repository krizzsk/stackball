package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ao */
final class C12401ao extends Lambda implements Function1<Boolean, Unit> {

    /* renamed from: b */
    final /* synthetic */ Function0<Unit> f30611b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12401ao(Function0<Unit> function0) {
        super(1);
        this.f30611b = function0;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        this.f30611b.invoke();
        return Unit.INSTANCE;
    }
}
