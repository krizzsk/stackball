package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

class p80 {

    /* renamed from: a */
    private final r80 f38546a = new r80();

    /* renamed from: b */
    private final q80 f38547b = new q80();

    p80() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo69328a(Context context, NativeAdAssets nativeAdAssets) {
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f38547b.getClass();
            if (new hl0(nativeAdAssets).mo67565a() != null) {
                return C12066R.layout.yandex_ads_internal_fullscreen_content_v1_landscape_with_media;
            }
            return C12066R.layout.f29028xeb3c836a;
        }
        this.f38546a.getClass();
        return C12066R.layout.yandex_ads_internal_fullscreen_content_v1_portrait;
    }
}
