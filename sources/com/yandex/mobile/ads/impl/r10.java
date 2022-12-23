package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class r10 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ s10 f39341b;

    /* renamed from: c */
    final /* synthetic */ C13513jm f39342c;

    /* renamed from: d */
    final /* synthetic */ View f39343d;

    /* renamed from: e */
    final /* synthetic */ HashMap f39344e;

    public r10(s10 s10, C13513jm jmVar, View view, HashMap hashMap) {
        this.f39341b = s10;
        this.f39342c = jmVar;
        this.f39343d = view;
        this.f39344e = hashMap;
    }

    public final void run() {
        ii0 ii0 = ii0.f34887a;
        o10 a = this.f39341b.f39801b;
        C13513jm jmVar = this.f39342c;
        View view = this.f39343d;
        Collection values = this.f39344e.values();
        Intrinsics.checkNotNullExpressionValue(values, "logIds.values");
        a.getClass();
        Intrinsics.checkNotNullParameter(jmVar, "scope");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(values, "actions");
        jmVar.mo68030a((Function0<Unit>) new n10(values, a, jmVar, view));
    }
}
