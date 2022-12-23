package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.tz */
final class C14731tz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f40527b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f40528c;

    /* renamed from: d */
    final /* synthetic */ f50<C13215gn> f40529d;

    /* renamed from: e */
    final /* synthetic */ j50 f40530e;

    /* renamed from: f */
    final /* synthetic */ f50<C13332hn> f40531f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14731tz(C14036mz mzVar, C12925dv dvVar, f50<C13215gn> f50, j50 j50, f50<C13332hn> f502) {
        super(1);
        this.f40527b = mzVar;
        this.f40528c = dvVar;
        this.f40529d = f50;
        this.f40530e = j50;
        this.f40531f = f502;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f40527b.m39766a((TextView) this.f40528c, this.f40529d.mo66924a(this.f40530e), this.f40531f.mo66924a(this.f40530e));
        return Unit.INSTANCE;
    }
}
