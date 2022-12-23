package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.no */
final class C14118no extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f37871b;

    /* renamed from: c */
    final /* synthetic */ C13776kr f37872c;

    /* renamed from: d */
    final /* synthetic */ j50 f37873d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14118no(View view, C13776kr krVar, j50 j50) {
        super(1);
        this.f37871b = view;
        this.f37872c = krVar;
        this.f37873d = j50;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        C14175ob.m40346b(this.f37871b, this.f37872c, this.f37873d);
        return Unit.INSTANCE;
    }
}
