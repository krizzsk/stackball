package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class jd0 {
    /* renamed from: a */
    public final boolean mo67975a(hd0 hd0, Map<String, Bitmap> map) {
        Intrinsics.checkNotNullParameter(hd0, "imageValue");
        Intrinsics.checkNotNullParameter(map, "images");
        Bitmap bitmap = map.get(hd0.mo67524d());
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            return false;
        }
        return true;
    }
}
