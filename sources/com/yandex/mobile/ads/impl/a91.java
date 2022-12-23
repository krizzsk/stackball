package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.math.MathKt;

public final class a91 {

    /* renamed from: a */
    private static final DisplayMetrics f30477a = Resources.getSystem().getDisplayMetrics();

    /* renamed from: a */
    public static final float m33642a(float f) {
        return f * f30477a.density;
    }

    /* renamed from: b */
    public static final int m33644b(int i) {
        return MathKt.roundToInt(((float) i) * f30477a.density);
    }

    /* renamed from: a */
    public static final int m33643a(int i) {
        return MathKt.roundToInt(((float) i) * f30477a.density);
    }
}
