package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.go */
final class C13218go extends Lambda implements Function1<C13794kx, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f34055b;

    /* renamed from: c */
    final /* synthetic */ C13452ix f34056c;

    /* renamed from: d */
    final /* synthetic */ j50 f34057d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13218go(View view, C13452ix ixVar, j50 j50) {
        super(1);
        this.f34055b = view;
        this.f34056c = ixVar;
        this.f34057d = j50;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter((C13794kx) obj, "it");
        C14175ob.m40336a(this.f34055b, this.f34056c, this.f34057d);
        return Unit.INSTANCE;
    }
}
