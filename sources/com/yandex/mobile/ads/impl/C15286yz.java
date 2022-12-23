package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.yz */
final class C15286yz extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f42983b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f42984c;

    /* renamed from: d */
    final /* synthetic */ j50 f42985d;

    /* renamed from: e */
    final /* synthetic */ C13915lz f42986e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C15286yz(C14036mz mzVar, C12925dv dvVar, j50 j50, C13915lz lzVar) {
        super(1);
        this.f42983b = mzVar;
        this.f42984c = dvVar;
        this.f42985d = j50;
        this.f42986e = lzVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter((String) obj, "it");
        C14036mz mzVar = this.f42983b;
        C12925dv dvVar = this.f42984c;
        j50 j50 = this.f42985d;
        C13915lz lzVar = this.f42986e;
        mzVar.getClass();
        dvVar.setText(lzVar.f37026I.mo66924a(j50));
        this.f42983b.m39767a((TextView) this.f42984c, this.f42985d, this.f42986e);
        return Unit.INSTANCE;
    }
}
