package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.C1220a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class MaxRewardedAd implements MaxFullscreenAdImpl.C1213a {

    /* renamed from: a */
    private static final Map<String, MaxRewardedAd> f3912a = new HashMap();

    /* renamed from: b */
    private static final Object f3913b = new Object();

    /* renamed from: c */
    private static WeakReference<Activity> f3914c = new WeakReference<>((Object) null);

    /* renamed from: d */
    private final MaxFullscreenAdImpl f3915d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f3915d = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED, this, "MaxRewardedAd", C1557r.m3585a(appLovinSdk));
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        C1220a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else if (appLovinSdk != null) {
            updateActivity(activity);
            synchronized (f3913b) {
                MaxRewardedAd maxRewardedAd = f3912a.get(str);
                if (maxRewardedAd != null) {
                    return maxRewardedAd;
                }
                MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
                f3912a.put(str, maxRewardedAd2);
                return maxRewardedAd2;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public static void updateActivity(Activity activity) {
        C1220a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            f3914c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.f3915d.logApiCall("destroy()");
        synchronized (f3913b) {
            f3912a.remove(this.f3915d.getAdUnitId());
        }
        this.f3915d.destroy();
    }

    public Activity getActivity() {
        this.f3915d.logApiCall("getActivity()");
        return (Activity) f3914c.get();
    }

    public boolean isReady() {
        this.f3915d.logApiCall("isReady()");
        return this.f3915d.isReady();
    }

    public void loadAd() {
        this.f3915d.logApiCall("loadAd()");
        this.f3915d.loadAd(getActivity());
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3915d;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f3915d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3915d;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f3915d.setListener(maxRewardedAdListener);
    }

    public void showAd() {
        showAd((String) null);
    }

    public void showAd(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3915d;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ")");
        this.f3915d.showAd(str, getActivity());
    }

    public String toString() {
        return "" + this.f3915d;
    }
}
