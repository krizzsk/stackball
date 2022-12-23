package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ws */
final class C15105ws extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C15208xs f42207b;

    /* renamed from: c */
    final /* synthetic */ View f42208c;

    /* renamed from: d */
    final /* synthetic */ j50 f42209d;

    /* renamed from: e */
    final /* synthetic */ C14697tn f42210e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15105ws(C15208xs xsVar, View view, j50 j50, C14697tn tnVar) {
        super(1);
        this.f42207b = xsVar;
        this.f42208c = view;
        this.f42209d = j50;
        this.f42210e = tnVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f42207b.m44117a(this.f42208c, this.f42209d, this.f42210e);
        return Unit.INSTANCE;
    }
}
