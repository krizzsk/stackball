package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1501o;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.NativeAdImpl;
import com.applovin.impl.sdk.p026c.C1383e;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.d.f */
abstract class C1412f extends C1392a {

    /* renamed from: a */
    protected final AppLovinNativeAdPrecacheListener f3309a;

    /* renamed from: c */
    private final List<NativeAdImpl> f3310c;

    /* renamed from: d */
    private final AppLovinNativeAdLoadListener f3311d;

    /* renamed from: e */
    private int f3312e;

    C1412f(String str, List<NativeAdImpl> list, C1469j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super(str, jVar);
        this.f3310c = list;
        this.f3311d = appLovinNativeAdLoadListener;
        this.f3309a = null;
    }

    C1412f(String str, List<NativeAdImpl> list, C1469j jVar, AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        super(str, jVar);
        if (list != null) {
            this.f3310c = list;
            this.f3311d = null;
            this.f3309a = appLovinNativeAdPrecacheListener;
            return;
        }
        throw new IllegalArgumentException("Native ads cannot be null");
    }

    /* renamed from: a */
    private void m2869a(int i) {
        AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = this.f3311d;
        if (appLovinNativeAdLoadListener != null) {
            appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
        }
    }

    /* renamed from: a */
    private void m2870a(List<AppLovinNativeAd> list) {
        AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = this.f3311d;
        if (appLovinNativeAdLoadListener != null) {
            appLovinNativeAdLoadListener.onNativeAdsLoaded(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo12989a(String str, C1501o oVar, List<String> list) {
        if (!C1553o.m3554b(str)) {
            mo12944a("Asked to cache file with null/empty URL, nothing to do.");
            return null;
        } else if (!C1557r.m3613a(str, list)) {
            mo12944a("Domain is not whitelisted, skipping precache for URL " + str);
            return null;
        } else {
            try {
                String a = oVar.mo13260a(mo12951f(), str, (String) null, list, true, true, (C1383e) null);
                if (a != null) {
                    return a;
                }
                mo12947c("Unable to cache icon resource " + str);
                return null;
            } catch (Exception e) {
                mo12945a("Unable to cache icon resource " + str, e);
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12985a(NativeAdImpl nativeAdImpl);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12986a(NativeAdImpl nativeAdImpl, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo12987a(NativeAdImpl nativeAdImpl, C1501o oVar);

    public void run() {
        for (NativeAdImpl next : this.f3310c) {
            mo12944a("Beginning resource caching phase...");
            if (mo12987a(next, this.f3279b.mo13081U())) {
                this.f3312e++;
                mo12985a(next);
            } else {
                mo12949d("Unable to cache resources");
            }
        }
        try {
            if (this.f3312e == this.f3310c.size()) {
                m2870a((List<AppLovinNativeAd>) this.f3310c);
                return;
            }
            mo12949d("Mismatch between successful populations and requested size");
            m2869a(-6);
        } catch (Throwable th) {
            C1505q.m3341c(mo12950e(), "Encountered exception while notifying publisher code", th);
        }
    }
}
