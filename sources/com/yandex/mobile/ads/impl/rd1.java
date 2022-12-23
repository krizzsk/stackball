package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class rd1 extends Drawable {

    /* renamed from: a */
    private final Paint f39438a;

    public rd1(Drawable drawable, Shader.TileMode tileMode) {
        this.f39438a = new sd1().mo69957a(drawable, tileMode);
    }

    public void draw(Canvas canvas) {
        canvas.drawPaint(this.f39438a);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f39438a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f39438a.setColorFilter(colorFilter);
    }
}
