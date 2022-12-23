package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.rm0;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.k */
class C15456k implements rm0<MediatedNativeAdapter, MediatedNativeAdapterListener> {
    C15456k() {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo69785a(Object obj) {
        MediatedNativeAdapter mediatedNativeAdapter = (MediatedNativeAdapter) obj;
    }

    /* renamed from: a */
    public void mo69784a(Context context, Object obj, Object obj2, Map map, Map map2) {
        ((MediatedNativeAdapter) obj).loadAd(context, (MediatedNativeAdapterListener) obj2, map, map2);
    }
}
