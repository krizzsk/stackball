package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.vz */
final class C15015vz extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ Ref.ObjectRef<Integer> f41818b;

    /* renamed from: c */
    final /* synthetic */ Function0<Unit> f41819c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15015vz(Ref.ObjectRef<Integer> objectRef, Function0<Unit> function0) {
        super(1);
        this.f41818b = objectRef;
        this.f41819c = function0;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        this.f41818b.element = Integer.valueOf(intValue);
        this.f41819c.invoke();
        return Unit.INSTANCE;
    }
}
