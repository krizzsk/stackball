package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.px */
final class C14326px extends Lambda implements Function1<C13436ir, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14233ox f38883b;

    /* renamed from: c */
    final /* synthetic */ C12931dy f38884c;

    /* renamed from: d */
    final /* synthetic */ j50 f38885d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14326px(C14233ox oxVar, C12931dy dyVar, j50 j50) {
        super(1);
        this.f38883b = oxVar;
        this.f38884c = dyVar;
        this.f38885d = j50;
    }

    public Object invoke(Object obj) {
        C13436ir irVar = (C13436ir) obj;
        Intrinsics.checkNotNullParameter(irVar, "style");
        C14233ox oxVar = this.f38883b;
        C12931dy dyVar = this.f38884c;
        j50 j50 = this.f38885d;
        oxVar.getClass();
        DisplayMetrics displayMetrics = dyVar.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        dyVar.setThumbSecondaryDrawable(C12459ay.m33962a(irVar, displayMetrics, j50));
        return Unit.INSTANCE;
    }
}
