package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.impl.rm0;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.c */
class C15466c implements rm0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {

    /* renamed from: a */
    private MediatedRewardedAdapter f43697a;

    C15466c() {
    }

    /* renamed from: a */
    public void mo69785a(Object obj) {
        ((MediatedRewardedAdapter) obj).onInvalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo71482b() {
        MediatedRewardedAdapter mediatedRewardedAdapter = this.f43697a;
        return mediatedRewardedAdapter != null && mediatedRewardedAdapter.isLoaded();
    }

    /* renamed from: a */
    public void mo69784a(Context context, Object obj, Object obj2, Map map, Map map2) {
        MediatedRewardedAdapter mediatedRewardedAdapter = (MediatedRewardedAdapter) obj;
        this.f43697a = mediatedRewardedAdapter;
        mediatedRewardedAdapter.loadRewardedAd(context, (MediatedRewardedAdapterListener) obj2, map, map2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public MediatedRewardedAdapter mo71481a() {
        return this.f43697a;
    }
}
