package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.mediation.base.C15434a;
import java.util.Map;

abstract class MediatedRewardedAdapter extends C15434a {
    MediatedRewardedAdapter() {
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isLoaded();

    /* access modifiers changed from: package-private */
    public abstract void loadRewardedAd(Context context, MediatedRewardedAdapterListener mediatedRewardedAdapterListener, Map<String, Object> map, Map<String, String> map2);

    /* access modifiers changed from: package-private */
    public abstract void onInvalidate();

    /* access modifiers changed from: package-private */
    public abstract void showRewardedAd();
}
