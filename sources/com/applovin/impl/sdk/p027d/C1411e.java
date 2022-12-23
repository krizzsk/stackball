package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1501o;
import com.applovin.impl.sdk.p024ad.NativeAdImpl;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.d.e */
public class C1411e extends C1412f {
    public C1411e(List<NativeAdImpl> list, C1469j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super("TaskCacheNativeAdImages", list, jVar, appLovinNativeAdLoadListener);
    }

    public C1411e(List<NativeAdImpl> list, C1469j jVar, AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        super("TaskCacheNativeAdImages", list, jVar, appLovinNativeAdPrecacheListener);
    }

    /* renamed from: b */
    private boolean m2865b(NativeAdImpl nativeAdImpl) {
        mo12947c("Unable to cache image resource");
        mo12986a(nativeAdImpl, !C1520h.m3445a(mo12951f()) ? AppLovinErrorCodes.NO_NETWORK : AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12985a(NativeAdImpl nativeAdImpl) {
        if (this.f3309a != null) {
            this.f3309a.onNativeAdImagesPrecached(nativeAdImpl);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12986a(NativeAdImpl nativeAdImpl, int i) {
        if (this.f3309a != null) {
            this.f3309a.onNativeAdImagePrecachingFailed(nativeAdImpl, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12987a(NativeAdImpl nativeAdImpl, C1501o oVar) {
        mo12944a("Beginning native ad image caching for #" + nativeAdImpl.getAdId());
        if (((Boolean) this.f3279b.mo13088a(C1369c.f2917bG)).booleanValue()) {
            String a = mo12989a(nativeAdImpl.getSourceIconUrl(), oVar, nativeAdImpl.getResourcePrefixes());
            if (a == null) {
                return m2865b(nativeAdImpl);
            }
            nativeAdImpl.setIconUrl(a);
            String a2 = mo12989a(nativeAdImpl.getSourceImageUrl(), oVar, nativeAdImpl.getResourcePrefixes());
            if (a2 == null) {
                return m2865b(nativeAdImpl);
            }
            nativeAdImpl.setImageUrl(a2);
            return true;
        }
        mo12944a("Resource caching is disabled, skipping...");
        return true;
    }

    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
