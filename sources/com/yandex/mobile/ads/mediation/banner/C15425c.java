package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.rm0;
import com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.banner.c */
class C15425c implements rm0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> {
    C15425c() {
    }

    /* renamed from: a */
    public void mo69785a(Object obj) {
        ((MediatedBannerAdapter) obj).onInvalidate();
    }

    /* renamed from: a */
    public void mo69784a(Context context, Object obj, Object obj2, Map map, Map map2) {
        ((MediatedBannerAdapter) obj).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj2, map, map2);
    }
}
