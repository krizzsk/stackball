package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.NativeAdImpl;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1411e;
import com.applovin.impl.sdk.p027d.C1413g;
import com.applovin.impl.sdk.p027d.C1426n;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import com.applovin.nativeAds.AppLovinNativeAdService;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NativeAdServiceImpl implements AppLovinNativeAdService {

    /* renamed from: a */
    private final C1469j f2596a;

    NativeAdServiceImpl(C1469j jVar) {
        this.f2596a = jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2350a(AppLovinNativeAd appLovinNativeAd, final AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        if (appLovinNativeAd.isVideoPrecached()) {
            appLovinNativeAdPrecacheListener.onNativeAdVideoPreceached(appLovinNativeAd);
            return;
        }
        this.f2596a.mo13071K().mo13014a((C1392a) new C1413g((List<NativeAdImpl>) Arrays.asList(new NativeAdImpl[]{(NativeAdImpl) appLovinNativeAd}), this.f2596a, (AppLovinNativeAdPrecacheListener) new AppLovinNativeAdPrecacheListener() {
            public void onNativeAdImagePrecachingFailed(AppLovinNativeAd appLovinNativeAd, int i) {
            }

            public void onNativeAdImagesPrecached(AppLovinNativeAd appLovinNativeAd) {
            }

            public void onNativeAdVideoPrecachingFailed(AppLovinNativeAd appLovinNativeAd, int i) {
                NativeAdServiceImpl.this.m2353a(appLovinNativeAdPrecacheListener, appLovinNativeAd, i, true);
            }

            public void onNativeAdVideoPreceached(AppLovinNativeAd appLovinNativeAd) {
                NativeAdServiceImpl.this.m2354a(appLovinNativeAdPrecacheListener, appLovinNativeAd, true);
            }
        }), C1435s.C1437a.CACHING_OTHER);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2351a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, int i) {
        if (appLovinNativeAdLoadListener != null) {
            try {
                appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
            } catch (Exception e) {
                C1505q.m3341c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2352a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, List<AppLovinNativeAd> list) {
        if (appLovinNativeAdLoadListener != null) {
            try {
                appLovinNativeAdLoadListener.onNativeAdsLoaded(list);
            } catch (Exception e) {
                C1505q.m3341c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2353a(AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener, AppLovinNativeAd appLovinNativeAd, int i, boolean z) {
        if (appLovinNativeAdPrecacheListener == null) {
            return;
        }
        if (z) {
            try {
                appLovinNativeAdPrecacheListener.onNativeAdVideoPrecachingFailed(appLovinNativeAd, i);
            } catch (Exception e) {
                C1505q.m3341c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        } else {
            appLovinNativeAdPrecacheListener.onNativeAdImagePrecachingFailed(appLovinNativeAd, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2354a(AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener, AppLovinNativeAd appLovinNativeAd, boolean z) {
        if (appLovinNativeAdPrecacheListener == null) {
            return;
        }
        if (z) {
            try {
                appLovinNativeAdPrecacheListener.onNativeAdVideoPreceached(appLovinNativeAd);
            } catch (Exception e) {
                C1505q.m3341c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        } else {
            appLovinNativeAdPrecacheListener.onNativeAdImagesPrecached(appLovinNativeAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2355a(List<AppLovinNativeAd> list, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        int intValue = ((Integer) this.f2596a.mo13088a(C1369c.f3054dn)).intValue();
        if (intValue > 0) {
            List list2 = list;
            int size = list2.size();
            if (size != 0) {
                int min = Math.min(intValue, size);
                final List subList = list2.subList(0, min);
                final List subList2 = list2.subList(min, size);
                m2357b(subList, new AppLovinNativeAdLoadListener() {
                    public void onNativeAdsFailedToLoad(int i) {
                        AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = appLovinNativeAdLoadListener;
                        if (appLovinNativeAdLoadListener != null) {
                            appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
                        }
                    }

                    public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
                        NativeAdServiceImpl.this.m2358c(subList, new AppLovinNativeAdLoadListener() {
                            public void onNativeAdsFailedToLoad(int i) {
                                if (appLovinNativeAdLoadListener != null) {
                                    appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
                                }
                            }

                            public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
                                if (appLovinNativeAdLoadListener != null) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(subList);
                                    arrayList.addAll(subList2);
                                    appLovinNativeAdLoadListener.onNativeAdsLoaded(arrayList);
                                }
                            }
                        });
                    }
                });
            } else if (appLovinNativeAdLoadListener != null) {
                appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(AppLovinErrorCodes.UNABLE_TO_PREPARE_NATIVE_AD);
            }
        } else if (appLovinNativeAdLoadListener != null) {
            appLovinNativeAdLoadListener.onNativeAdsLoaded(list);
        }
    }

    /* renamed from: b */
    private void m2357b(List<NativeAdImpl> list, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        this.f2596a.mo13071K().mo13014a((C1392a) new C1411e(list, this.f2596a, (AppLovinNativeAdLoadListener) new AppLovinNativeAdLoadListener() {
            public void onNativeAdsFailedToLoad(int i) {
                AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = appLovinNativeAdLoadListener;
                if (appLovinNativeAdLoadListener != null) {
                    appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
                }
            }

            public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
                AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = appLovinNativeAdLoadListener;
                if (appLovinNativeAdLoadListener != null) {
                    appLovinNativeAdLoadListener.onNativeAdsLoaded(list);
                }
            }
        }), C1435s.C1437a.CACHING_OTHER);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m2358c(List<NativeAdImpl> list, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        this.f2596a.mo13071K().mo13014a((C1392a) new C1413g(list, this.f2596a, (AppLovinNativeAdLoadListener) new AppLovinNativeAdLoadListener() {
            public void onNativeAdsFailedToLoad(int i) {
                NativeAdServiceImpl.this.m2351a(appLovinNativeAdLoadListener, i);
            }

            public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
                NativeAdServiceImpl.this.m2352a(appLovinNativeAdLoadListener, list);
            }
        }), C1435s.C1437a.CACHING_OTHER);
    }

    public void loadNativeAds(int i, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        if (i > 0) {
            this.f2596a.mo13091a();
            if (i == 1) {
                C1349d h = C1349d.m2466h(this.f2596a);
                AppLovinNativeAd appLovinNativeAd = (AppLovinNativeAd) this.f2596a.mo13080T().mo12874e(h);
                if (appLovinNativeAd != null) {
                    m2352a(appLovinNativeAdLoadListener, (List<AppLovinNativeAd>) Arrays.asList(new AppLovinNativeAd[]{appLovinNativeAd}));
                } else {
                    this.f2596a.mo13071K().mo13014a((C1392a) new C1426n(this.f2596a, new AppLovinNativeAdLoadListener() {
                        public void onNativeAdsFailedToLoad(int i) {
                            NativeAdServiceImpl.this.m2351a(appLovinNativeAdLoadListener, i);
                        }

                        public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
                            NativeAdServiceImpl.this.m2355a(list, appLovinNativeAdLoadListener);
                        }
                    }), C1435s.C1437a.MAIN);
                }
                if (((Boolean) this.f2596a.mo13088a(C1369c.f2942bf)).booleanValue()) {
                    this.f2596a.mo13080T().mo12878i(h);
                    return;
                }
                return;
            }
            loadNextAd(appLovinNativeAdLoadListener);
            return;
        }
        C1505q.m3345i("NativeAdService", "Requested invalid number of native ads: " + i);
    }

    public void loadNextAd(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        loadNativeAds(1, appLovinNativeAdLoadListener);
    }

    public void precacheResources(AppLovinNativeAd appLovinNativeAd, final AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        this.f2596a.mo13091a();
        if (appLovinNativeAd.isImagePrecached()) {
            appLovinNativeAdPrecacheListener.onNativeAdImagesPrecached(appLovinNativeAd);
            m2350a(appLovinNativeAd, appLovinNativeAdPrecacheListener);
            return;
        }
        this.f2596a.mo13071K().mo13014a((C1392a) new C1411e((List<NativeAdImpl>) Arrays.asList(new NativeAdImpl[]{(NativeAdImpl) appLovinNativeAd}), this.f2596a, (AppLovinNativeAdPrecacheListener) new AppLovinNativeAdPrecacheListener() {
            public void onNativeAdImagePrecachingFailed(AppLovinNativeAd appLovinNativeAd, int i) {
                NativeAdServiceImpl.this.m2353a(appLovinNativeAdPrecacheListener, appLovinNativeAd, i, false);
            }

            public void onNativeAdImagesPrecached(AppLovinNativeAd appLovinNativeAd) {
                NativeAdServiceImpl.this.m2354a(appLovinNativeAdPrecacheListener, appLovinNativeAd, false);
                NativeAdServiceImpl.this.m2350a(appLovinNativeAd, appLovinNativeAdPrecacheListener);
            }

            public void onNativeAdVideoPrecachingFailed(AppLovinNativeAd appLovinNativeAd, int i) {
            }

            public void onNativeAdVideoPreceached(AppLovinNativeAd appLovinNativeAd) {
            }
        }), C1435s.C1437a.CACHING_OTHER);
    }

    public void preloadAds(C1349d dVar) {
        this.f2596a.mo13079S().mo12877h(dVar);
        int h = dVar.mo12721h();
        if (h == 0 && this.f2596a.mo13079S().mo12871b(dVar)) {
            h = 1;
        }
        this.f2596a.mo13079S().mo12870b(dVar, h);
    }

    public String toString() {
        return "NativeAdServiceImpl{}";
    }
}
