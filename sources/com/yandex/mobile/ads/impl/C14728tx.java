package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.tx */
final class C14728tx extends Lambda implements Function1<C13436ir, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14233ox f40517b;

    /* renamed from: c */
    final /* synthetic */ C12931dy f40518c;

    /* renamed from: d */
    final /* synthetic */ j50 f40519d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14728tx(C14233ox oxVar, C12931dy dyVar, j50 j50) {
        super(1);
        this.f40517b = oxVar;
        this.f40518c = dyVar;
        this.f40519d = j50;
    }

    public Object invoke(Object obj) {
        Drawable drawable;
        C13436ir irVar = (C13436ir) obj;
        Intrinsics.checkNotNullParameter(irVar, "style");
        C14233ox oxVar = this.f40517b;
        C12931dy dyVar = this.f40518c;
        j50 j50 = this.f40519d;
        oxVar.getClass();
        if (irVar == null) {
            drawable = null;
        } else {
            DisplayMetrics displayMetrics = dyVar.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            drawable = C12459ay.m33962a(irVar, displayMetrics, j50);
        }
        dyVar.setActiveTickMarkDrawable(drawable);
        return Unit.INSTANCE;
    }
}
