package com.yandex.mobile.ads.impl;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

public final class fg1 extends MetricAffectingSpan {

    /* renamed from: b */
    private final Typeface f33359b;

    public fg1(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f33359b = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setTypeface(this.f33359b);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        textPaint.setTypeface(this.f33359b);
    }
}
