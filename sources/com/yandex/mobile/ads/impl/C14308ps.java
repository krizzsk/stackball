package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.ps */
final class C14308ps extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14011ms f38812b;

    /* renamed from: c */
    final /* synthetic */ C14628ss f38813c;

    /* renamed from: d */
    final /* synthetic */ j50 f38814d;

    /* renamed from: e */
    final /* synthetic */ f50<C13215gn> f38815e;

    /* renamed from: f */
    final /* synthetic */ f50<C13332hn> f38816f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14308ps(C14011ms msVar, C14628ss ssVar, j50 j50, f50<C13215gn> f50, f50<C13332hn> f502) {
        super(1);
        this.f38812b = msVar;
        this.f38813c = ssVar;
        this.f38814d = j50;
        this.f38815e = f50;
        this.f38816f = f502;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        C14011ms msVar = this.f38812b;
        C14628ss ssVar = this.f38813c;
        j50 j50 = this.f38814d;
        f50<C13215gn> f50 = this.f38815e;
        f50<C13332hn> f502 = this.f38816f;
        msVar.getClass();
        ssVar.setGravity(C14175ob.m40325a(f50.mo66924a(j50), f502.mo66924a(j50)));
        return Unit.INSTANCE;
    }
}
