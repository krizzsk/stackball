package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class yn0 implements C13058fl {

    /* renamed from: a */
    private final hl0 f42898a;

    /* renamed from: b */
    private final float f42899b;

    public yn0(NativeAdAssets nativeAdAssets, float f) {
        this.f42899b = f;
        this.f42898a = new hl0(nativeAdAssets);
    }

    /* renamed from: a */
    public boolean mo67026a(Context context) {
        Float a = this.f42898a.mo67565a();
        int i = lo1.f36769b;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        if (a != null) {
            i2 -= Math.round(((float) context.getResources().getDisplayMetrics().heightPixels) * a.floatValue());
        }
        return ((float) i2) >= this.f42899b;
    }
}
