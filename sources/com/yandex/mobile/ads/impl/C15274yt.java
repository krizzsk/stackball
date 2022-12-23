package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.yt */
final class C15274yt extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C15210xt f42949b;

    /* renamed from: c */
    final /* synthetic */ C14633sv f42950c;

    /* renamed from: d */
    final /* synthetic */ j50 f42951d;

    /* renamed from: e */
    final /* synthetic */ C15107wt f42952e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15274yt(C15210xt xtVar, C14633sv svVar, j50 j50, C15107wt wtVar) {
        super(1);
        this.f42949b = xtVar;
        this.f42950c = svVar;
        this.f42951d = j50;
        this.f42952e = wtVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f42949b.m44121a(this.f42950c, this.f42951d, this.f42952e);
        return Unit.INSTANCE;
    }
}
