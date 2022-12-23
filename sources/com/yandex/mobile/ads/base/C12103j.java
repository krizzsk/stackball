package com.yandex.mobile.ads.base;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: com.yandex.mobile.ads.base.j */
final class C12103j {

    /* renamed from: a */
    static final ColorDrawable f29175a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* renamed from: b */
    static final LayerDrawable f29176b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        int i = C12102i.f29173b;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        f29176b = layerDrawable;
    }
}
