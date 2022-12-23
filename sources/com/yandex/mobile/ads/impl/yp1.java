package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

public class yp1 {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo71105a(Resources resources, NativeAdAssets nativeAdAssets) {
        if (nativeAdAssets.getWarning() == null) {
            return 0.0f;
        }
        return resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_warning_height) + 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_warning_margin_bottom);
    }
}
