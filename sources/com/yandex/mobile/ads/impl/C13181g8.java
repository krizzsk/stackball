package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* renamed from: com.yandex.mobile.ads.impl.g8 */
public class C13181g8 {

    /* renamed from: a */
    private final NativeAdAssets f33901a;

    /* renamed from: b */
    private final C13314he f33902b = new C13314he();

    public C13181g8(NativeAdAssets nativeAdAssets) {
        this.f33901a = nativeAdAssets;
    }

    /* renamed from: a */
    public float mo67206a(Resources resources) {
        C13314he heVar = this.f33902b;
        NativeAdAssets nativeAdAssets = this.f33901a;
        heVar.getClass();
        if (nativeAdAssets.getCallToAction() == null) {
            return 0.0f;
        }
        float dimension = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_call_to_action_width_base);
        return dimension + 0.0f + resources.getDimension(C12066R.dimen.f29012x4b362306) + resources.getDimension(C12066R.dimen.f29012x4b362306);
    }

    /* renamed from: b */
    public float mo67207b(Resources resources) {
        C13314he heVar = this.f33902b;
        NativeAdAssets nativeAdAssets = this.f33901a;
        heVar.getClass();
        if (nativeAdAssets.getCallToAction() == null) {
            return 0.0f;
        }
        float dimension = resources.getDimension(C12066R.dimen.f29015x3b98c4bf);
        return dimension + 0.0f + resources.getDimension(C12066R.dimen.f29013x27a130e2) + resources.getDimension(C12066R.dimen.f29013x27a130e2);
    }
}
