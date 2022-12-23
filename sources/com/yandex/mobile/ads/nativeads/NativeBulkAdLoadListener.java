package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;
import java.util.List;

public interface NativeBulkAdLoadListener {
    void onAdsFailedToLoad(AdRequestError adRequestError);

    void onAdsLoaded(List<NativeAd> list);
}
