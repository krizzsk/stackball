package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.impl.qd1;

public class CallToActionView extends Button {

    /* renamed from: a */
    private CharSequence f30382a;

    public CallToActionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private Drawable m32567a(Context context, int i) {
        return context.getResources().getDrawable(i);
    }

    public CharSequence getText() {
        return this.f30382a;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof String) {
            this.f30382a = charSequence;
        }
        super.setText(this.f30382a, TextView.BufferType.SPANNABLE);
    }

    public CallToActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallToActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        Drawable drawable = null;
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12066R.styleable.YandexAdsInternalIconButton, i, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C12066R.styleable.YandexAdsInternalIconButton_yandex_icon, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.YandexAdsInternalIconButton_yandex_icon_size, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C12066R.styleable.YandexAdsInternalIconButton_yandex_icon_offset, 0);
            obtainStyledAttributes.recycle();
            drawable = resourceId != 0 ? m32567a(context, resourceId) : drawable;
            i2 = dimensionPixelSize2;
            i3 = dimensionPixelSize;
        } else {
            i2 = 0;
        }
        setSpannableFactory(new qd1(drawable, i3, i2));
    }

    /* renamed from: a */
    public void mo65457a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f30382a);
    }
}
