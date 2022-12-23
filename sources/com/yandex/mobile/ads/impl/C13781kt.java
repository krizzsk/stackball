package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.kt */
final class C13781kt extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C13444it f36409b;

    /* renamed from: c */
    final /* synthetic */ C14933vt f36410c;

    /* renamed from: d */
    final /* synthetic */ j50 f36411d;

    /* renamed from: e */
    final /* synthetic */ f50<C13215gn> f36412e;

    /* renamed from: f */
    final /* synthetic */ f50<C13332hn> f36413f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13781kt(C13444it itVar, C14933vt vtVar, j50 j50, f50<C13215gn> f50, f50<C13332hn> f502) {
        super(1);
        this.f36409b = itVar;
        this.f36410c = vtVar;
        this.f36411d = j50;
        this.f36412e = f50;
        this.f36413f = f502;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        C13444it itVar = this.f36409b;
        C14933vt vtVar = this.f36410c;
        j50 j50 = this.f36411d;
        f50<C13215gn> f50 = this.f36412e;
        f50<C13332hn> f502 = this.f36413f;
        itVar.getClass();
        vtVar.setGravity(C14175ob.m40325a(f50.mo66924a(j50), f502.mo66924a(j50)));
        return Unit.INSTANCE;
    }
}
