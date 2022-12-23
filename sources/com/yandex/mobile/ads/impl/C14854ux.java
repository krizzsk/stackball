package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ux */
final class C14854ux extends Lambda implements Function1<C13436ir, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14233ox f41146b;

    /* renamed from: c */
    final /* synthetic */ C12931dy f41147c;

    /* renamed from: d */
    final /* synthetic */ j50 f41148d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14854ux(C14233ox oxVar, C12931dy dyVar, j50 j50) {
        super(1);
        this.f41146b = oxVar;
        this.f41147c = dyVar;
        this.f41148d = j50;
    }

    public Object invoke(Object obj) {
        Drawable drawable;
        C13436ir irVar = (C13436ir) obj;
        Intrinsics.checkNotNullParameter(irVar, "style");
        C14233ox oxVar = this.f41146b;
        C12931dy dyVar = this.f41147c;
        j50 j50 = this.f41148d;
        oxVar.getClass();
        if (irVar == null) {
            drawable = null;
        } else {
            DisplayMetrics displayMetrics = dyVar.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            drawable = C12459ay.m33962a(irVar, displayMetrics, j50);
        }
        dyVar.setInactiveTickMarkDrawable(drawable);
        return Unit.INSTANCE;
    }
}
