package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C13055fi;

public class RoundImageView extends ImageView {

    /* renamed from: a */
    private final C13055fi f30394a;

    public RoundImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f30394a.mo67019a(canvas);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30394a.mo67018a();
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.YandexAdsInternalRoundImageView, i, 0);
            f = (float) obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.YandexAdsInternalRoundImageView_yandex_corner_radius, 0);
            obtainStyledAttributes.recycle();
        } else {
            f = 0.0f;
        }
        this.f30394a = new C13055fi(this, f);
    }
}
