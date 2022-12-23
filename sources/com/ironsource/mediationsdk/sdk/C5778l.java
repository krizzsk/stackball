package com.ironsource.mediationsdk.sdk;

import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.l */
public interface C5778l {
    void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    boolean isRewardedVideoAvailable(JSONObject jSONObject);

    void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);
}
