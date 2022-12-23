package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ys */
final class C15270ys extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12417at f42926b;

    /* renamed from: c */
    final /* synthetic */ f50<C13215gn> f42927c;

    /* renamed from: d */
    final /* synthetic */ j50 f42928d;

    /* renamed from: e */
    final /* synthetic */ f50<C13332hn> f42929e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15270ys(C12417at atVar, f50<C13215gn> f50, j50 j50, f50<C13332hn> f502) {
        super(1);
        this.f42926b = atVar;
        this.f42927c = f50;
        this.f42928d = j50;
        this.f42929e = f502;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f42926b.setGravity(C14175ob.m40325a(this.f42927c.mo66924a(this.f42928d), this.f42929e.mo66924a(this.f42928d)));
        return Unit.INSTANCE;
    }
}
