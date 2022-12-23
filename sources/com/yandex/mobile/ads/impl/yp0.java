package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class yp0 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final sp0 f42902a;

    /* renamed from: b */
    private final long f42903b;

    public yp0(sp0 sp0, long j) {
        Intrinsics.checkNotNullParameter(sp0, "multiBannerAutoSwipeController");
        this.f42902a = sp0;
        this.f42903b = j;
    }

    public void onViewAttachedToWindow(View view) {
        this.f42902a.mo70042a(this.f42903b);
    }

    public void onViewDetachedFromWindow(View view) {
        this.f42902a.mo70043b();
    }
}
