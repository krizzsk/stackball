package com.ironsource.mediationsdk.sdk;

import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.h */
public interface C5752h {
    void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    boolean isInterstitialReady(JSONObject jSONObject);

    void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);
}
