package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.xz */
final class C15220xz extends Lambda implements Function1<Object, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f42713b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f42714c;

    /* renamed from: d */
    final /* synthetic */ j50 f42715d;

    /* renamed from: e */
    final /* synthetic */ C14706ts f42716e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15220xz(C14036mz mzVar, C12925dv dvVar, j50 j50, C14706ts tsVar) {
        super(1);
        this.f42713b = mzVar;
        this.f42714c = dvVar;
        this.f42715d = j50;
        this.f42716e = tsVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$noName_0");
        this.f42713b.m39768a((TextView) this.f42714c, this.f42715d, this.f42716e);
        return Unit.INSTANCE;
    }
}
