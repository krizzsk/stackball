package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.mediation.base.C15434a;
import java.util.Map;

abstract class MediatedBannerAdapter extends C15434a {

    interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(AdRequestError adRequestError);

        void onAdImpression();

        void onAdLeftApplication();

        void onAdLoaded(View view);
    }

    MediatedBannerAdapter() {
    }

    /* access modifiers changed from: package-private */
    public abstract void loadBanner(Context context, MediatedBannerAdapterListener mediatedBannerAdapterListener, Map<String, Object> map, Map<String, String> map2);

    /* access modifiers changed from: package-private */
    public abstract void onInvalidate();
}
