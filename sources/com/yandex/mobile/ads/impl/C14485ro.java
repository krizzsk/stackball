package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ro */
final class C14485ro extends Lambda implements Function1<C13794kx, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f39526b;

    /* renamed from: c */
    final /* synthetic */ C13452ix f39527c;

    /* renamed from: d */
    final /* synthetic */ j50 f39528d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14485ro(View view, C13452ix ixVar, j50 j50) {
        super(1);
        this.f39526b = view;
        this.f39527c = ixVar;
        this.f39528d = j50;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter((C13794kx) obj, "it");
        C14175ob.m40345b(this.f39526b, this.f39527c, this.f39528d);
        return Unit.INSTANCE;
    }
}
