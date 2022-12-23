package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.C13055fi;
import com.yandex.mobile.ads.impl.C15171xg;
import com.yandex.mobile.ads.impl.al0;
import com.yandex.mobile.ads.impl.bl0;
import com.yandex.mobile.ads.impl.el0;
import com.yandex.mobile.ads.impl.r81;

public class ExtendedViewContainer extends FrameLayout {

    /* renamed from: a */
    private final C13055fi f30387a;

    /* renamed from: b */
    private final el0 f30388b;

    /* renamed from: c */
    private el0 f30389c;

    public ExtendedViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private el0 m32571a(float f, float f2) {
        return new C15171xg(new bl0(this, f), new al0(this, f2));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f30387a.mo67019a(canvas);
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        el0.C12983a a = this.f30389c.mo65798a(i, i2);
        super.onMeasure(a.f33000a, a.f33001b);
        this.f30387a.mo67018a();
    }

    public void setMeasureSpecProvider(el0 el0) {
        this.f30389c = new C15171xg(this.f30388b, el0);
        requestLayout();
        invalidate();
    }

    public ExtendedViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExtendedViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.YandexAdsInternalExtendedViewContainer, i, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.YandexAdsInternalExtendedViewContainer_yandex_corner_radius, 0);
            i2 = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.f29033xd97899c4, dimensionPixelSize);
            i5 = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.f29034xd226f699, dimensionPixelSize);
            i4 = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.f29032x2df9c8db, dimensionPixelSize);
            i3 = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.f29031x26c17742, dimensionPixelSize);
            this.f30388b = m32571a(obtainStyledAttributes.getFloat(C12066R.styleable.YandexAdsInternalExtendedViewContainer_yandex_max_screen_width, 1.0f), obtainStyledAttributes.getFloat(C12066R.styleable.YandexAdsInternalExtendedViewContainer_yandex_max_screen_height, 1.0f));
            obtainStyledAttributes.recycle();
        } else {
            this.f30388b = new r81();
            i3 = 0;
            i2 = 0;
            i5 = 0;
            i4 = 0;
        }
        this.f30389c = this.f30388b;
        this.f30387a = new C13055fi(this, (float) i2, (float) i5, (float) i4, (float) i3);
        setWillNotDraw(false);
    }
}
