package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.fo */
final class C13082fo extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f33463b;

    /* renamed from: c */
    final /* synthetic */ C13452ix f33464c;

    /* renamed from: d */
    final /* synthetic */ j50 f33465d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13082fo(View view, C13452ix ixVar, j50 j50) {
        super(1);
        this.f33463b = view;
        this.f33464c = ixVar;
        this.f33465d = j50;
    }

    public Object invoke(Object obj) {
        ((Number) obj).intValue();
        C14175ob.m40336a(this.f33463b, this.f33464c, this.f33465d);
        return Unit.INSTANCE;
    }
}
