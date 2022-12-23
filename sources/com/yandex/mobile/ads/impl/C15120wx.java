package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.wx */
final class C15120wx extends Lambda implements Function1<C13436ir, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14233ox f42313b;

    /* renamed from: c */
    final /* synthetic */ C12931dy f42314c;

    /* renamed from: d */
    final /* synthetic */ j50 f42315d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15120wx(C14233ox oxVar, C12931dy dyVar, j50 j50) {
        super(1);
        this.f42313b = oxVar;
        this.f42314c = dyVar;
        this.f42315d = j50;
    }

    public Object invoke(Object obj) {
        C13436ir irVar = (C13436ir) obj;
        Intrinsics.checkNotNullParameter(irVar, "style");
        C14233ox oxVar = this.f42313b;
        C12931dy dyVar = this.f42314c;
        j50 j50 = this.f42315d;
        oxVar.getClass();
        DisplayMetrics displayMetrics = dyVar.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        dyVar.setInactiveTrackDrawable(C12459ay.m33962a(irVar, displayMetrics, j50));
        return Unit.INSTANCE;
    }
}
