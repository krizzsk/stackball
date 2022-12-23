package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: com.yandex.mobile.ads.impl.mc */
class C13970mc implements C13698kc<BitmapDrawable> {
    C13970mc() {
    }

    /* renamed from: a */
    public boolean mo67392a(Drawable drawable, Bitmap bitmap) {
        return bitmap.equals(((BitmapDrawable) drawable).getBitmap());
    }
}
