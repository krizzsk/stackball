package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RatingBar;
import com.yandex.mobile.ads.nativeads.Rating;

public class n21 extends RatingBar implements Rating {
    public n21(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public float getRating() {
        return super.getRating();
    }

    public void setRating(float f) {
        super.setRating(f);
    }

    public n21(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n21(Context context) {
        super(context);
    }
}
