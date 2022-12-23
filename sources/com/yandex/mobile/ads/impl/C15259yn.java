package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.yn */
final class C15259yn extends Lambda implements Function1<Double, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f42897b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15259yn(View view) {
        super(1);
        this.f42897b = view;
    }

    public Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        View view = this.f42897b;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha((float) doubleValue);
        return Unit.INSTANCE;
    }
}
