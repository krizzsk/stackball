package com.chartboost.sdk.impl;

import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Model.CBError;

/* renamed from: com.chartboost.sdk.impl.d */
public class C1904d extends C1894a {

    /* renamed from: h */
    private C1901c f4772h;

    private C1904d(C1901c cVar, C1898b bVar) {
        super(3, bVar.mo14581a(), bVar.mo14582b(), bVar.mo14584d(), bVar.mo14583c(), bVar.mo14586f(), bVar.mo14585e());
        this.f4772h = cVar;
    }

    /* renamed from: a */
    public static C1904d m4478a(C1901c cVar) {
        return new C1904d(cVar, new C1898b());
    }

    /* renamed from: a */
    public void mo14554a(String str, CBError.CBImpressionError cBImpressionError, boolean z, String str2) {
    }

    /* renamed from: b */
    public void mo14559b(String str, String str2) {
        this.f4772h.didClickBanner(str, str2, (ChartboostClickError) null);
    }

    /* renamed from: e */
    public void mo14563e(String str, String str2) {
        this.f4772h.didShowBanner(str, str2, (ChartboostShowError) null);
    }

    /* renamed from: a */
    public void mo14555a(String str, String str2) {
        this.f4772h.didCacheBanner(str, str2, (ChartboostCacheError) null);
    }

    /* renamed from: a */
    public void mo14556a(String str, String str2, ChartboostCacheError chartboostCacheError) {
        this.f4772h.onBannerCacheFail(str, str2, chartboostCacheError);
    }

    /* renamed from: a */
    public void mo14557a(String str, String str2, ChartboostShowError chartboostShowError) {
        this.f4772h.onBannerShowFail(str, str2, chartboostShowError);
    }
}
