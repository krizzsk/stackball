package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.yandex.mobile.ads.C12066R;

public class nc1 extends View {

    /* renamed from: a */
    public final CharSequence f37794a;

    public nc1(Context context) {
        this(context, (AttributeSet) null);
    }

    public nc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C12066R.styleable.TabItem);
        this.f37794a = obtainStyledAttributes.getText(C12066R.styleable.TabItem_android_text);
        obtainStyledAttributes.getDrawable(C12066R.styleable.TabItem_android_icon);
        obtainStyledAttributes.getResourceId(C12066R.styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
