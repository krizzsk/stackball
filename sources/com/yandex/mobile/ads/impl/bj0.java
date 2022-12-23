package com.yandex.mobile.ads.impl;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

public final class bj0 implements LineHeightSpan {

    /* renamed from: b */
    private final int f31337b;

    /* renamed from: c */
    private final int f31338c;

    /* renamed from: d */
    private boolean f31339d;

    /* renamed from: e */
    private int f31340e = -1;

    /* renamed from: f */
    private int f31341f = -1;

    /* renamed from: g */
    private int f31342g = -1;

    public bj0(int i, int i2) {
        this.f31337b = i;
        this.f31338c = i2;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fm");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            int spanStart = spanned.getSpanStart(this);
            int spanEnd = spanned.getSpanEnd(this);
            boolean z = true;
            if (this.f31339d) {
                fontMetricsInt.ascent = this.f31340e;
                fontMetricsInt.descent = this.f31341f;
                fontMetricsInt.top = this.f31342g;
            } else if (i >= spanStart) {
                this.f31339d = true;
                this.f31340e = fontMetricsInt.ascent;
                this.f31341f = fontMetricsInt.descent;
                this.f31342g = fontMetricsInt.top;
            }
            if (i >= spanStart && i2 <= spanEnd && (i6 = this.f31338c) > 0 && (i8 = i7 - fontMetricsInt.ascent) >= 0) {
                int roundToInt = MathKt.roundToInt(((float) (i7 = fontMetricsInt.descent)) * ((((float) i6) * 1.0f) / ((float) i8)));
                fontMetricsInt.descent = roundToInt;
                fontMetricsInt.ascent = roundToInt - this.f31338c;
            }
            if (i > spanStart || spanStart > i2) {
                z = false;
            }
            if (z && (i5 = this.f31337b) > 0) {
                fontMetricsInt.ascent -= i5;
                fontMetricsInt.top -= i5;
            }
            if (StringsKt.contains$default((CharSequence) charSequence.subSequence(i, i2).toString(), (CharSequence) "\n", false, 2, (Object) null)) {
                this.f31339d = false;
            }
        }
    }
}
