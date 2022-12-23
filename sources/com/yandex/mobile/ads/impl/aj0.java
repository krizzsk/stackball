package com.yandex.mobile.ads.impl;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

public final class aj0 extends MetricAffectingSpan {

    /* renamed from: b */
    private final float f30559b;

    public aj0(float f) {
        this.f30559b = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        textPaint.setLetterSpacing(this.f30559b);
    }

    public void updateMeasureState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        textPaint.setLetterSpacing(this.f30559b);
    }
}
