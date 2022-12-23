package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.zz */
final class C15409zz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f43508b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f43509c;

    /* renamed from: d */
    final /* synthetic */ C13915lz f43510d;

    /* renamed from: e */
    final /* synthetic */ j50 f43511e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15409zz(C14036mz mzVar, C12925dv dvVar, C13915lz lzVar, j50 j50) {
        super(1);
        this.f43508b = mzVar;
        this.f43509c = dvVar;
        this.f43510d = lzVar;
        this.f43511e = j50;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f43508b.m39770a((TextView) this.f43509c, this.f43510d.f37056q.mo66924a(this.f43511e), this.f43510d.f37059t.mo66924a(this.f43511e));
        return Unit.INSTANCE;
    }
}
