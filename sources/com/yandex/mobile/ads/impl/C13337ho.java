package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ho */
final class C13337ho extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ View f34493b;

    /* renamed from: c */
    final /* synthetic */ C13776kr f34494c;

    /* renamed from: d */
    final /* synthetic */ j50 f34495d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13337ho(View view, C13776kr krVar, j50 j50) {
        super(1);
        this.f34493b = view;
        this.f34494c = krVar;
        this.f34495d = j50;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        C14175ob.m40338a(this.f34493b, this.f34494c, this.f34495d);
        return Unit.INSTANCE;
    }
}
