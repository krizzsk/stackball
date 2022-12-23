package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.Rating;

public class o21 extends FrameLayout implements Rating {

    /* renamed from: a */
    private float f38059a = 0.0f;

    public o21(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public float getRating() {
        return this.f38059a;
    }

    public void setRating(float f) {
        this.f38059a = f;
    }

    public o21(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o21(Context context) {
        super(context);
    }
}
