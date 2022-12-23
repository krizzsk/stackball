package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.sz */
final class C14642sz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f40184b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f40185c;

    /* renamed from: d */
    final /* synthetic */ C13513jm f40186d;

    /* renamed from: e */
    final /* synthetic */ j50 f40187e;

    /* renamed from: f */
    final /* synthetic */ C13915lz f40188f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14642sz(C14036mz mzVar, C12925dv dvVar, C13513jm jmVar, j50 j50, C13915lz lzVar) {
        super(1);
        this.f40184b = mzVar;
        this.f40185c = dvVar;
        this.f40186d = jmVar;
        this.f40187e = j50;
        this.f40188f = lzVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f40184b.m39769a((TextView) this.f40185c, this.f40186d, this.f40187e, this.f40188f);
        return Unit.INSTANCE;
    }
}
