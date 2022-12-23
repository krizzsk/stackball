package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;

public class u60 {

    /* renamed from: a */
    private final Context f40578a;

    public u60(Context context) {
        this.f40578a = context;
    }

    /* renamed from: a */
    public ImageView mo70294a(int i, int i2) {
        ImageView imageView = new ImageView(this.f40578a);
        int a = lo1.m38864a(this.f40578a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = i2;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
