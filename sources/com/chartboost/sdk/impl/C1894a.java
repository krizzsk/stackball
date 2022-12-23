package com.chartboost.sdk.impl;

import com.chartboost.sdk.C1880a;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.Tracking.C1875f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.chartboost.sdk.impl.a */
public class C1894a {

    /* renamed from: a */
    public final int f4748a;

    /* renamed from: b */
    public final String f4749b;

    /* renamed from: c */
    public final String f4750c;

    /* renamed from: d */
    public final String f4751d;

    /* renamed from: e */
    public final String f4752e;

    /* renamed from: f */
    public final boolean f4753f;

    /* renamed from: g */
    public final boolean f4754g;

    /* renamed from: com.chartboost.sdk.impl.a$a */
    public class C1895a implements Runnable {

        /* renamed from: a */
        private final int f4755a;

        /* renamed from: b */
        private final String f4756b;

        /* renamed from: c */
        private final CBError.CBImpressionError f4757c;

        /* renamed from: d */
        private final ChartboostError f4758d;

        /* renamed from: e */
        private final boolean f4759e;

        /* renamed from: f */
        private final String f4760f;

        public C1895a(int i, String str, CBError.CBImpressionError cBImpressionError, ChartboostError chartboostError, boolean z, String str2) {
            this.f4755a = i;
            this.f4756b = str;
            this.f4757c = cBImpressionError;
            this.f4758d = chartboostError;
            this.f4759e = z;
            this.f4760f = str2;
        }

        public void run() {
            switch (this.f4755a) {
                case 0:
                    C1894a.this.mo14555a(this.f4756b, this.f4760f);
                    return;
                case 1:
                    C1894a.this.mo14559b(this.f4756b, this.f4760f);
                    return;
                case 2:
                    C1894a.this.mo14561c(this.f4756b, this.f4760f);
                    return;
                case 3:
                    C1894a.this.mo14562d(this.f4756b, this.f4760f);
                    return;
                case 4:
                    C1894a.this.mo14554a(this.f4756b, this.f4757c, this.f4759e, this.f4760f);
                    return;
                case 5:
                    C1894a.this.mo14563e(this.f4756b, this.f4760f);
                    return;
                case 6:
                    C1894a.this.mo14556a(this.f4756b, this.f4760f, (ChartboostCacheError) this.f4758d);
                    return;
                case 7:
                    C1894a.this.mo14557a(this.f4756b, this.f4760f, (ChartboostShowError) this.f4758d);
                    return;
                default:
                    return;
            }
        }
    }

    protected C1894a(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f4748a = i;
        this.f4749b = str;
        this.f4750c = str2;
        this.f4751d = str3;
        this.f4752e = str4;
        this.f4753f = z;
        this.f4754g = z2;
    }

    /* renamed from: b */
    public static C1894a m4439b() {
        return new C1894a(2, "inplay", "/inplay/get", "no webview endpoint", "/inplay/show", false, true);
    }

    /* renamed from: c */
    public static C1894a m4440c() {
        return new C1894a(0, IronSourceConstants.INTERSTITIAL_AD_UNIT, "/interstitial/get", "webview/%s/interstitial/get", "/interstitial/show", false, false);
    }

    /* renamed from: d */
    public static C1894a m4441d() {
        return new C1894a(1, "Rewarded", "/reward/get", "webview/%s/reward/get", "/reward/show", true, false);
    }

    /* renamed from: a */
    public void mo14555a(String str, String str2) {
        C1874e.m4311e(new C1875f("cache_finish_success", "", this.f4749b, str));
        C1880a aVar = C2026k.f5247d;
        if (aVar != null) {
            int i = this.f4748a;
            if (i == 0) {
                aVar.didCacheInterstitial(str);
            } else if (i == 1) {
                aVar.didCacheRewardedVideo(str);
            } else if (i == 2) {
                aVar.didCacheInPlay(str);
            }
        }
    }

    /* renamed from: a */
    public void mo14556a(String str, String str2, ChartboostCacheError chartboostCacheError) {
    }

    /* renamed from: a */
    public void mo14557a(String str, String str2, ChartboostShowError chartboostShowError) {
    }

    /* renamed from: e */
    public void mo14563e(String str, String str2) {
        C2022j b = C2022j.m4955b();
        if (b != null) {
            b.mo14894a(this.f4748a);
        }
        C1874e.m4311e(new C1875f("show_finish_success", "", this.f4749b, str));
        C1880a aVar = C2026k.f5247d;
        if (aVar != null) {
            int i = this.f4748a;
            if (i == 0) {
                aVar.didDisplayInterstitial(str);
            } else if (i == 1) {
                aVar.didDisplayRewardedVideo(str);
            }
        }
    }

    /* renamed from: b */
    public void mo14559b(String str, String str2) {
        C1880a aVar = C2026k.f5247d;
        if (aVar != null) {
            int i = this.f4748a;
            if (i == 0) {
                aVar.didClickInterstitial(str);
            } else if (i == 1) {
                aVar.didClickRewardedVideo(str);
            }
        }
    }

    /* renamed from: c */
    public void mo14561c(String str, String str2) {
        C1880a aVar = C2026k.f5247d;
        if (aVar != null) {
            int i = this.f4748a;
            if (i == 0) {
                aVar.didCloseInterstitial(str);
            } else if (i == 1) {
                aVar.didCloseRewardedVideo(str);
            }
        }
    }

    /* renamed from: d */
    public void mo14562d(String str, String str2) {
        C1880a aVar = C2026k.f5247d;
        if (aVar != null) {
            int i = this.f4748a;
            if (i == 0) {
                aVar.didDismissInterstitial(str);
            } else if (i == 1) {
                aVar.didDismissRewardedVideo(str);
            }
        }
    }

    /* renamed from: b */
    public boolean mo14560b(String str) {
        C1880a aVar = C2026k.f5247d;
        if (aVar == null || this.f4748a != 0) {
            return true;
        }
        return aVar.shouldRequestInterstitial(str);
    }

    /* renamed from: a */
    public void mo14554a(String str, CBError.CBImpressionError cBImpressionError, boolean z, String str2) {
        if (z) {
            C1874e.m4311e(new C1875f("show_finish_failure", cBImpressionError.name(), this.f4749b, str));
        } else {
            C1874e.m4311e(new C1875f("cache_finish_failure", cBImpressionError.name(), this.f4749b, str));
        }
        cBImpressionError.setAdId(str2);
        C1880a aVar = C2026k.f5247d;
        if (aVar != null) {
            int i = this.f4748a;
            if (i == 0) {
                aVar.didFailToLoadInterstitial(str, cBImpressionError);
            } else if (i == 1) {
                aVar.didFailToLoadRewardedVideo(str, cBImpressionError);
            } else if (i == 2) {
                aVar.didFailToLoadInPlay(str, cBImpressionError);
            }
        }
    }

    /* renamed from: a */
    public boolean mo14558a(String str) {
        C1880a aVar = C2026k.f5247d;
        if (aVar == null) {
            return true;
        }
        int i = this.f4748a;
        if (i == 0) {
            return aVar.shouldDisplayInterstitial(str);
        }
        if (i != 1) {
            return true;
        }
        return aVar.shouldDisplayRewardedVideo(str);
    }

    /* renamed from: a */
    public String mo14553a() {
        return this.f4749b;
    }
}
