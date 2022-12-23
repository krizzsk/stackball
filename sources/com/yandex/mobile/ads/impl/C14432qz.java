package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.qz */
final class C14432qz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f39335b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f39336c;

    /* renamed from: d */
    final /* synthetic */ j50 f39337d;

    /* renamed from: e */
    final /* synthetic */ f50<Integer> f39338e;

    /* renamed from: f */
    final /* synthetic */ f50<Integer> f39339f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14432qz(C14036mz mzVar, C12925dv dvVar, j50 j50, f50<Integer> f50, f50<Integer> f502) {
        super(1);
        this.f39335b = mzVar;
        this.f39336c = dvVar;
        this.f39337d = j50;
        this.f39338e = f50;
        this.f39339f = f502;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f39335b.m39772a(this.f39336c, this.f39337d, this.f39338e, this.f39339f);
        return Unit.INSTANCE;
    }
}
