package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import com.yandex.mobile.ads.C12066R;

public class cn1 {
    /* renamed from: a */
    public bn1 mo66335a(TypedArray typedArray) {
        int i = typedArray.getInt(C12066R.styleable.YandexAdsInternalMediaView_yandex_video_scale_type, -1);
        bn1[] values = bn1.values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
