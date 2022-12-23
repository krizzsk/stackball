package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class f00 implements View.OnLayoutChangeListener {

    /* renamed from: b */
    final /* synthetic */ g00 f33198b;

    /* renamed from: c */
    final /* synthetic */ View f33199c;

    /* renamed from: d */
    final /* synthetic */ c00 f33200d;

    /* renamed from: e */
    final /* synthetic */ C13513jm f33201e;

    public f00(g00 g00, View view, c00 c00, C13513jm jmVar) {
        this.f33198b = g00;
        this.f33199c = view;
        this.f33200d = c00;
        this.f33201e = jmVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.f33198b.m36383a(this.f33199c, this.f33200d, this.f33201e);
    }
}
