package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class xn0 implements C13058fl {

    /* renamed from: a */
    private final hl0 f42642a;

    /* renamed from: b */
    private final float f42643b;

    public xn0(NativeAdAssets nativeAdAssets, float f) {
        this.f42643b = f;
        this.f42642a = new hl0(nativeAdAssets);
    }

    /* renamed from: a */
    public boolean mo67026a(Context context) {
        Float a = this.f42642a.mo67565a();
        int i = lo1.f36769b;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        if (a != null) {
            i2 -= a.floatValue() != 0.0f ? Math.round(((float) context.getResources().getDisplayMetrics().widthPixels) / a.floatValue()) : 0;
        }
        if (((float) i2) >= this.f42643b) {
            return true;
        }
        return false;
    }
}
