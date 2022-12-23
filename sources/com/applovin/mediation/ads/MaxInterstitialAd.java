package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.C1220a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

public class MaxInterstitialAd implements MaxFullscreenAdImpl.C1213a {

    /* renamed from: a */
    private static WeakReference<Activity> f3910a = new WeakReference<>((Object) null);

    /* renamed from: b */
    private final MaxFullscreenAdImpl f3911b;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        C1220a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else if (appLovinSdk != null) {
            f3910a = new WeakReference<>(activity);
            this.f3911b = new MaxFullscreenAdImpl(str, MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", C1557r.m3585a(appLovinSdk));
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public void destroy() {
        this.f3911b.logApiCall("destroy()");
        this.f3911b.destroy();
    }

    public Activity getActivity() {
        this.f3911b.logApiCall("getActivity()");
        return (Activity) f3910a.get();
    }

    public boolean isReady() {
        this.f3911b.logApiCall("isReady()");
        return this.f3911b.isReady();
    }

    public void loadAd() {
        this.f3911b.logApiCall("loadAd()");
        this.f3911b.loadAd(getActivity());
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3911b;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f3911b.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3911b;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f3911b.setListener(maxAdListener);
    }

    public void showAd() {
        showAd((String) null);
    }

    public void showAd(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f3911b;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ")");
        this.f3911b.showAd(str, getActivity());
    }

    public String toString() {
        return "" + this.f3911b;
    }
}
