package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

public final class w91 {
    /* renamed from: a */
    public static final float m43565a(s91 s91, RectF rectF, RectF rectF2) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(s91, "<this>");
        Intrinsics.checkNotNullParameter(rectF, "view");
        Intrinsics.checkNotNullParameter(rectF2, "image");
        if (rectF2.width() / rectF2.height() > rectF.width() / rectF.height()) {
            f2 = rectF.height();
            f = rectF2.height();
        } else {
            f2 = rectF.width();
            f = rectF2.width();
        }
        float min = Math.min(1.0f, f2 / f);
        if (rectF.width() < ((float) ((int) (((float) s91.mo69907c()) * min))) || rectF.height() < ((float) ((int) (((float) s91.mo69906b()) * min)))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(rectF.width() - (((float) s91.mo69907c()) * min)) + Math.abs(rectF.height() - (((float) s91.mo69906b()) * min));
    }
}
