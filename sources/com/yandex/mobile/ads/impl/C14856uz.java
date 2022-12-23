package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.uz */
final class C14856uz extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ Ref.IntRef f41157b;

    /* renamed from: c */
    final /* synthetic */ Function0<Unit> f41158c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14856uz(Ref.IntRef intRef, Function0<Unit> function0) {
        super(1);
        this.f41157b = intRef;
        this.f41158c = function0;
    }

    public Object invoke(Object obj) {
        this.f41157b.element = ((Number) obj).intValue();
        this.f41158c.invoke();
        return Unit.INSTANCE;
    }
}
