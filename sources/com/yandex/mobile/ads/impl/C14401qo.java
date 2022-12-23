package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.qo */
final class C14401qo extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f39197b;

    /* renamed from: c */
    final /* synthetic */ C13452ix f39198c;

    /* renamed from: d */
    final /* synthetic */ j50 f39199d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14401qo(View view, C13452ix ixVar, j50 j50) {
        super(1);
        this.f39197b = view;
        this.f39198c = ixVar;
        this.f39199d = j50;
    }

    public Object invoke(Object obj) {
        ((Number) obj).intValue();
        C14175ob.m40345b(this.f39197b, this.f39198c, this.f39199d);
        return Unit.INSTANCE;
    }
}
