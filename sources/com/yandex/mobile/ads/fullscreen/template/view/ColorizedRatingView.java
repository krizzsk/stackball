package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.mobile.ads.impl.n21;

public class ColorizedRatingView extends n21 {

    /* renamed from: a */
    private static final int f30383a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m32569a(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                m32569a(layerDrawable.getDrawable(0), -3355444);
                Drawable drawable2 = layerDrawable.getDrawable(1);
                int i = f30383a;
                m32569a(drawable2, i);
                m32569a(layerDrawable.getDrawable(2), i);
            }
        }
    }

    public ColorizedRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorizedRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
