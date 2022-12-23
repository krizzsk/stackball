package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.oz */
final class C14238oz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f38415b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f38416c;

    /* renamed from: d */
    final /* synthetic */ j50 f38417d;

    /* renamed from: e */
    final /* synthetic */ C13915lz f38418e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14238oz(C14036mz mzVar, C12925dv dvVar, j50 j50, C13915lz lzVar) {
        super(1);
        this.f38415b = mzVar;
        this.f38416c = dvVar;
        this.f38417d = j50;
        this.f38418e = lzVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f38415b.m39773a(this.f38416c, this.f38417d, this.f38418e);
        return Unit.INSTANCE;
    }
}
