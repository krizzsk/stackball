package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1363j;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1424m;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.c */
public class C1373c extends C1508s {
    C1373c(C1469j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1349d mo12862a(C1363j jVar) {
        return ((AppLovinAdBase) jVar).getAdZone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1392a mo12863a(C1349d dVar) {
        C1424m mVar = new C1424m(dVar, this, this.f3682a);
        mVar.mo13002a(true);
        return mVar;
    }

    /* renamed from: a */
    public void mo12864a() {
        for (C1349d next : C1349d.m2460b(this.f3682a)) {
            if (!next.mo12717e()) {
                mo12877h(next);
            }
        }
    }

    /* renamed from: a */
    public void mo12865a(C1349d dVar, int i) {
        mo13284c(dVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12866a(Object obj, C1349d dVar, int i) {
        if (obj instanceof C1483n) {
            ((C1483n) obj).mo12865a(dVar, i);
        }
        if (obj instanceof AppLovinAdLoadListener) {
            ((AppLovinAdLoadListener) obj).failedToReceiveAd(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12867a(Object obj, C1363j jVar) {
        ((AppLovinAdLoadListener) obj).adReceived((AppLovinAd) jVar);
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
        mo13283b((C1363j) appLovinAd);
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
    }

    public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
    }
}
