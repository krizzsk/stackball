package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class w61 {

    /* renamed from: a */
    private final C14093nc f41886a = new C14093nc();

    /* renamed from: a */
    public Bitmap mo70654a(Drawable drawable) {
        Bitmap bitmap;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            C14093nc ncVar = this.f41886a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            ncVar.getClass();
            bitmap = Bitmap.createBitmap(1, 1, config);
        } else {
            C14093nc ncVar2 = this.f41886a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            ncVar2.getClass();
            bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }
}
