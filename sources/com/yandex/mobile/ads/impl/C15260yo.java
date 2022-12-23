package com.yandex.mobile.ads.impl;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.collections.ArraysKt;

/* renamed from: com.yandex.mobile.ads.impl.yo */
public final class C15260yo extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C15196xo f42900a;

    C15260yo(C15196xo xoVar) {
        this.f42900a = xoVar;
    }

    public void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            C15196xo xoVar = this.f42900a;
            float[] a = xoVar.f42655j;
            outline.setRoundRect(0, 0, width, height, xoVar.m44078a(a == null ? 0.0f : ArraysKt.first(a), (float) view.getWidth(), (float) view.getHeight()));
        }
    }
}
