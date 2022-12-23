package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.C15434a;
import java.util.Map;

abstract class MediatedNativeAdapter extends C15434a {
    MediatedNativeAdapter() {
    }

    /* access modifiers changed from: package-private */
    public abstract void loadAd(Context context, MediatedNativeAdapterListener mediatedNativeAdapterListener, Map<String, Object> map, Map<String, String> map2);
}
