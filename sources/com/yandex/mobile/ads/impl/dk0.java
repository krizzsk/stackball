package com.yandex.mobile.ads.impl;

import android.view.animation.Interpolator;
import com.tapjoy.TJAdUnitConstants;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public abstract class dk0 implements Interpolator {

    /* renamed from: a */
    private final float[] f32696a;

    /* renamed from: b */
    private final float f32697b;

    public dk0(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        this.f32696a = fArr;
        this.f32697b = 1.0f / ((float) ArraysKt.getLastIndex(fArr));
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int coerceAtMost = RangesKt.coerceAtMost((int) (((float) ArraysKt.getLastIndex(this.f32696a)) * f), this.f32696a.length - 2);
        float f2 = this.f32697b;
        float f3 = (f - (((float) coerceAtMost) * f2)) / f2;
        float[] fArr = this.f32696a;
        return fArr[coerceAtMost] + (f3 * (fArr[coerceAtMost + 1] - fArr[coerceAtMost]));
    }
}
