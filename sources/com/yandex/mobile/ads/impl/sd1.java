package com.yandex.mobile.ads.impl;

import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class sd1 {
    /* renamed from: a */
    public Paint mo69957a(Drawable drawable, Shader.TileMode tileMode) {
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(new w61().mo70654a(drawable), tileMode, tileMode));
        return paint;
    }
}
