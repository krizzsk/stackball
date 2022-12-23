package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.yandex.mobile.ads.impl.bo */
final class C12599bo extends Lambda implements Function1<Drawable, Unit> {

    /* renamed from: b */
    final /* synthetic */ Ref.ObjectRef<Drawable> f31377b;

    /* renamed from: c */
    final /* synthetic */ Function0<Unit> f31378c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12599bo(Ref.ObjectRef<Drawable> objectRef, Function0<Unit> function0) {
        super(1);
        this.f31377b = objectRef;
        this.f31378c = function0;
    }

    public Object invoke(Object obj) {
        T t = (Drawable) obj;
        Intrinsics.checkNotNullParameter(t, "newShadow");
        this.f31377b.element = t;
        this.f31378c.invoke();
        return Unit.INSTANCE;
    }
}
