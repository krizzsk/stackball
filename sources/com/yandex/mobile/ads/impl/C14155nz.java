package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.nz */
final class C14155nz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f38024b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f38025c;

    /* renamed from: d */
    final /* synthetic */ C13513jm f38026d;

    /* renamed from: e */
    final /* synthetic */ j50 f38027e;

    /* renamed from: f */
    final /* synthetic */ C13915lz f38028f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14155nz(C14036mz mzVar, C12925dv dvVar, C13513jm jmVar, j50 j50, C13915lz lzVar) {
        super(1);
        this.f38024b = mzVar;
        this.f38025c = dvVar;
        this.f38026d = jmVar;
        this.f38027e = j50;
        this.f38028f = lzVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f38024b.m39771a((b30) this.f38025c, this.f38026d, this.f38027e, this.f38028f);
        return Unit.INSTANCE;
    }
}
