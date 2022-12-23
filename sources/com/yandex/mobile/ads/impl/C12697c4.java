package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.yandex.mobile.ads.impl.c4 */
public final class C12697c4 {

    /* renamed from: a */
    public static final GradientDrawable f31805a;

    /* renamed from: b */
    public static final ColorDrawable f31806b = new ColorDrawable(Color.parseColor("#ff000000"));

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f31805a = gradientDrawable;
    }
}
