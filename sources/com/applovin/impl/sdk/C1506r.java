package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1363j;
import com.applovin.impl.sdk.p024ad.NativeAdImpl;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1426n;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.r */
public class C1506r extends C1508s {
    C1506r(C1469j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1349d mo12862a(C1363j jVar) {
        return ((NativeAdImpl) jVar).getAdZone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1392a mo12863a(C1349d dVar) {
        return new C1426n(this.f3682a, this);
    }

    /* renamed from: a */
    public void mo13282a() {
        mo12877h(C1349d.m2466h(this.f3682a));
    }

    /* renamed from: a */
    public void mo12865a(C1349d dVar, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12866a(Object obj, C1349d dVar, int i) {
        ((AppLovinNativeAdLoadListener) obj).onNativeAdsFailedToLoad(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12867a(Object obj, C1363j jVar) {
        AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = (AppLovinNativeAdLoadListener) obj;
        appLovinNativeAdLoadListener.onNativeAdsLoaded(Arrays.asList(new AppLovinNativeAd[]{(AppLovinNativeAd) jVar}));
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo12868a(LinkedHashSet linkedHashSet) {
        super.mo12868a((LinkedHashSet<C1349d>) linkedHashSet);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo12869a(C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        return super.mo12869a(dVar, appLovinAdLoadListener);
    }

    public void adReceived(AppLovinAd appLovinAd) {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo12870b(C1349d dVar, int i) {
        super.mo12870b(dVar, i);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo12871b(C1349d dVar) {
        return super.mo12871b(dVar);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C1363j mo12872c(C1349d dVar) {
        return super.mo12872c(dVar);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C1363j mo12873d(C1349d dVar) {
        return super.mo12873d(dVar);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C1363j mo12874e(C1349d dVar) {
        return super.mo12874e(dVar);
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo12875f(C1349d dVar) {
        super.mo12875f(dVar);
    }

    public void failedToReceiveAd(int i) {
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo12876g(C1349d dVar) {
        return super.mo12876g(dVar);
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo12877h(C1349d dVar) {
        super.mo12877h(dVar);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo12878i(C1349d dVar) {
        super.mo12878i(dVar);
    }

    public void onNativeAdsFailedToLoad(int i) {
        mo13284c(C1349d.m2466h(this.f3682a), i);
    }

    public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
        AppLovinNativeAd appLovinNativeAd = list.get(0);
        if (((Boolean) this.f3682a.mo13088a(C1369c.f2916bF)).booleanValue()) {
            this.f3682a.mo13132p().precacheResources(appLovinNativeAd, new AppLovinNativeAdPrecacheListener() {
                public void onNativeAdImagePrecachingFailed(AppLovinNativeAd appLovinNativeAd, int i) {
                    C1506r rVar = C1506r.this;
                    rVar.mo13284c(C1349d.m2466h(rVar.f3682a), i);
                }

                public void onNativeAdImagesPrecached(AppLovinNativeAd appLovinNativeAd) {
                    if (!C1553o.m3554b(appLovinNativeAd.getVideoUrl())) {
                        C1506r.this.mo13283b((C1363j) appLovinNativeAd);
                    }
                }

                public void onNativeAdVideoPrecachingFailed(AppLovinNativeAd appLovinNativeAd, int i) {
                    C1505q qVar = C1506r.this.f3683b;
                    qVar.mo13280d("NativeAdPreloadManager", "Video failed to cache during native ad preload. " + i);
                    C1506r.this.mo13283b((C1363j) appLovinNativeAd);
                }

                public void onNativeAdVideoPreceached(AppLovinNativeAd appLovinNativeAd) {
                    C1506r.this.mo13283b((C1363j) appLovinNativeAd);
                }
            });
        } else {
            mo13283b((C1363j) appLovinNativeAd);
        }
    }
}
