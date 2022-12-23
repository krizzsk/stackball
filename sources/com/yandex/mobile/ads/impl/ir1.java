package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.yandex.mobile.ads.C12066R;

public class ir1 {
    /* renamed from: a */
    public dl0 mo67887a(Context context, AttributeSet attributeSet) {
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.YandexAdsInternalPriorityLinearLayout);
            i = obtainStyledAttributes.getInt(C12066R.styleable.YandexAdsInternalPriorityLinearLayout_yandex_measure_priority, 0);
            obtainStyledAttributes.recycle();
        }
        return new dl0(i);
    }
}
