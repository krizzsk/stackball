package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C12066R;

public class do1 extends FrameLayout {

    /* renamed from: a */
    private C12908a f32731a;

    /* renamed from: b */
    private int f32732b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.do1$a */
    public interface C12908a {
        /* renamed from: a */
        int mo66652a(int i, int i2);

        /* renamed from: a */
        boolean mo66653a(int i, float f);
    }

    public do1(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo66648a() {
        return this.f32732b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C12908a aVar = this.f32731a;
        if (aVar != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(aVar.mo66652a(i, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setCollapsiblePaddingBottom(int i) {
        if (this.f32732b != i) {
            this.f32732b = i;
        }
    }

    public void setHeightCalculator(C12908a aVar) {
        this.f32731a = aVar;
    }

    public do1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.ViewPagerFixedSizeLayout);
        this.f32732b = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.ViewPagerFixedSizeLayout_collapsiblePaddingBottom, 0);
        obtainStyledAttributes.recycle();
    }

    public do1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.ViewPagerFixedSizeLayout, i, 0);
        this.f32732b = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.ViewPagerFixedSizeLayout_collapsiblePaddingBottom, 0);
        obtainStyledAttributes.recycle();
    }
}
