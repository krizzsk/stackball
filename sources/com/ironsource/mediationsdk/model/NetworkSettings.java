package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a */
    private String f13686a;

    /* renamed from: b */
    private String f13687b;

    /* renamed from: c */
    private JSONObject f13688c;

    /* renamed from: d */
    private JSONObject f13689d;

    /* renamed from: e */
    private JSONObject f13690e;

    /* renamed from: f */
    private JSONObject f13691f;

    /* renamed from: g */
    private String f13692g;

    /* renamed from: h */
    private String f13693h;

    /* renamed from: i */
    private boolean f13694i;

    /* renamed from: j */
    private String f13695j;

    /* renamed from: k */
    private int f13696k;

    /* renamed from: l */
    private int f13697l;

    /* renamed from: m */
    private int f13698m;

    /* renamed from: n */
    private String f13699n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f13686a = networkSettings.getProviderName();
        this.f13695j = networkSettings.getProviderName();
        this.f13687b = networkSettings.getProviderTypeForReflection();
        this.f13689d = networkSettings.getRewardedVideoSettings();
        this.f13690e = networkSettings.getInterstitialSettings();
        this.f13691f = networkSettings.getBannerSettings();
        this.f13688c = networkSettings.getApplicationSettings();
        this.f13696k = networkSettings.getRewardedVideoPriority();
        this.f13697l = networkSettings.getInterstitialPriority();
        this.f13698m = networkSettings.getBannerPriority();
        this.f13699n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f13686a = str;
        this.f13695j = str;
        this.f13687b = str;
        this.f13699n = str;
        this.f13689d = new JSONObject();
        this.f13690e = new JSONObject();
        this.f13691f = new JSONObject();
        this.f13688c = new JSONObject();
        this.f13696k = -1;
        this.f13697l = -1;
        this.f13698m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f13686a = str;
        this.f13695j = str;
        this.f13687b = str2;
        this.f13699n = str3;
        this.f13689d = jSONObject2;
        this.f13690e = jSONObject3;
        this.f13691f = jSONObject4;
        this.f13688c = jSONObject;
        this.f13696k = -1;
        this.f13697l = -1;
        this.f13698m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f13693h;
    }

    public JSONObject getApplicationSettings() {
        return this.f13688c;
    }

    public int getBannerPriority() {
        return this.f13698m;
    }

    public JSONObject getBannerSettings() {
        return this.f13691f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f13688c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f13688c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f13689d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f13690e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f13691f) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f13688c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt(IronSourceConstants.EVENTS_INSTANCE_TYPE);
    }

    public int getInterstitialPriority() {
        return this.f13697l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f13690e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f13699n;
    }

    public String getProviderInstanceName() {
        return this.f13695j;
    }

    public String getProviderName() {
        return this.f13686a;
    }

    public String getProviderTypeForReflection() {
        return this.f13687b;
    }

    public int getRewardedVideoPriority() {
        return this.f13696k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f13689d;
    }

    public String getSubProviderId() {
        return this.f13692g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f13694i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f13693h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f13688c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f13698m = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f13691f.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f13691f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.f13697l = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f13690e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f13690e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f13694i = z;
    }

    public void setRewardedVideoPriority(int i) {
        this.f13696k = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f13689d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f13689d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f13692g = str;
    }
}
