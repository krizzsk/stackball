package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.mediation.base.C15434a;
import java.util.Map;

abstract class MediatedInterstitialAdapter extends C15434a {

    interface MediatedInterstitialAdapterListener {
        void onAdImpression();

        void onInterstitialClicked();

        void onInterstitialDismissed();

        void onInterstitialFailedToLoad(AdRequestError adRequestError);

        void onInterstitialLeftApplication();

        void onInterstitialLoaded();

        void onInterstitialShown();
    }

    MediatedInterstitialAdapter() {
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isLoaded();

    /* access modifiers changed from: package-private */
    public abstract void loadInterstitial(Context context, MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, Map<String, Object> map, Map<String, String> map2);

    /* access modifiers changed from: package-private */
    public abstract void onInvalidate();

    /* access modifiers changed from: package-private */
    public abstract void showInterstitial();
}
