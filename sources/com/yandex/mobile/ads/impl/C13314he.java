package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* renamed from: com.yandex.mobile.ads.impl.he */
public class C13314he {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo67530a(Resources resources, NativeAdAssets nativeAdAssets) {
        if (nativeAdAssets.getCallToAction() == null) {
            return 0.0f;
        }
        float dimension = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_call_to_action_height);
        return dimension + 0.0f + resources.getDimension(C12066R.dimen.f29011xf89b260d) + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_call_to_action_top_margin_base);
    }
}
