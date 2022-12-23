package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.rz */
final class C14547rz extends Lambda implements Function1<String, Unit> {

    /* renamed from: b */
    final /* synthetic */ C14036mz f39759b;

    /* renamed from: c */
    final /* synthetic */ C12925dv f39760c;

    /* renamed from: d */
    final /* synthetic */ C13513jm f39761d;

    /* renamed from: e */
    final /* synthetic */ j50 f39762e;

    /* renamed from: f */
    final /* synthetic */ C13915lz f39763f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14547rz(C14036mz mzVar, C12925dv dvVar, C13513jm jmVar, j50 j50, C13915lz lzVar) {
        super(1);
        this.f39759b = mzVar;
        this.f39760c = dvVar;
        this.f39761d = jmVar;
        this.f39762e = j50;
        this.f39763f = lzVar;
    }

    public Object invoke(Object obj) {
        Intrinsics.checkNotNullParameter((String) obj, "it");
        this.f39759b.m39769a((TextView) this.f39760c, this.f39761d, this.f39762e, this.f39763f);
        this.f39759b.m39767a((TextView) this.f39760c, this.f39762e, this.f39763f);
        return Unit.INSTANCE;
    }
}
