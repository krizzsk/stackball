package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class ll0 implements C13058fl {

    /* renamed from: a */
    private final hl0 f36740a;

    /* renamed from: b */
    private final int f36741b;

    public ll0(NativeAdAssets nativeAdAssets, int i) {
        this.f36741b = i;
        this.f36740a = new hl0(nativeAdAssets);
    }

    /* renamed from: a */
    public boolean mo67026a(Context context) {
        int i = lo1.f36769b;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        int i3 = context.getResources().getDisplayMetrics().widthPixels;
        Float a = this.f36740a.mo67565a();
        if (i3 - (a != null ? Math.round(a.floatValue() * ((float) i2)) : 0) >= this.f36741b) {
            return true;
        }
        return false;
    }
}
