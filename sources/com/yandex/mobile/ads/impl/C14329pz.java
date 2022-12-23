package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.pz */
final class C14329pz extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: b */
    final /* synthetic */ C12925dv f38891b;

    /* renamed from: c */
    final /* synthetic */ C13915lz f38892c;

    /* renamed from: d */
    final /* synthetic */ j50 f38893d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14329pz(C12925dv dvVar, C13915lz lzVar, j50 j50) {
        super(1);
        this.f38891b = dvVar;
        this.f38892c = lzVar;
        this.f38893d = j50;
    }

    public Object invoke(Object obj) {
        C14175ob.m40342a((TextView) this.f38891b, Integer.valueOf(((Number) obj).intValue()), this.f38892c.f37058s.mo66924a(this.f38893d));
        return Unit.INSTANCE;
    }
}
