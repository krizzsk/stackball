package com.smaato.sdk.interstitial.csm;

import android.content.Context;
import java.util.Map;

public interface SMAInterstitialNetworkEvent {
    String getNetworkName();

    boolean isValid();

    void onDestroy();

    void requestInterstitial(Context context, SMAInterstitialNetworkEventListener sMAInterstitialNetworkEventListener, Map<String, String> map, Map<String, Object> map2);

    void showAd();
}
