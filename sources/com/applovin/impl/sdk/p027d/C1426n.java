package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.n */
public class C1426n extends C1424m {

    /* renamed from: a */
    private final AppLovinNativeAdLoadListener f3330a;

    public C1426n(C1469j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super(C1349d.m2466h(jVar), (AppLovinAdLoadListener) null, "TaskFetchNextNativeAd", jVar);
        this.f3330a = appLovinNativeAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1392a mo13000a(JSONObject jSONObject) {
        return new C1447w(jSONObject, this.f3279b, this.f3330a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13001a(int i) {
        AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = this.f3330a;
        if (appLovinNativeAdLoadListener != null) {
            appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo13003c() {
        return ((String) this.f3279b.mo13088a(C1369c.f2868aK)) + "4.0/nad";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo13004h() {
        return ((String) this.f3279b.mo13088a(C1369c.f2869aL)) + "4.0/nad";
    }
}
