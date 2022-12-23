package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.C1880a;
import com.chartboost.sdk.C1881b;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.z */
public class C2020z {
    /* renamed from: a */
    private static String m4936a(int i) {
        return i != 0 ? i != 1 ? i != 3 ? "" : IronSourceConstants.BANNER_AD_UNIT : "Rewarded" : IronSourceConstants.INTERSTITIAL_AD_UNIT;
    }

    /* renamed from: a */
    public static void m4943a(String str, String str2, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.m3993b("OpenRTBCache", "OpenRTBCache not supported for this Android version");
            C1880a aVar = C2026k.f5247d;
            if (aVar != null) {
                aVar.didFailToLoadInterstitial(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        C2022j b = C2022j.m4955b();
        if (b == null) {
            CBLogging.m3993b("OpenRTBCache", "OpenRTBCache cache: SDK is null");
        } else if (!C1896a0.m4458a(str, str2)) {
            C1896a0.m4455a(b, str, i, "");
        } else {
            C1952n nVar = b.f5224n.f5019a;
            if (nVar == null) {
                C1896a0.m4455a(b, str, i, "");
                return;
            }
            try {
                C2018y yVar = new C2018y(i, new JSONObject(str2));
                C2026k.f5257n = false;
                m4939a(b, i, str, nVar, yVar);
            } catch (JSONException e) {
                C1874e.m4311e(new C1868a("cache_bid_response_parsing_error", e.toString(), m4936a(i), str));
                C1896a0.m4455a(b, str, i, "");
            }
        }
    }

    /* renamed from: b */
    private static C1913g m4944b(C2022j jVar, int i, String str, String str2) {
        if (i == 0) {
            return jVar.mo14901f();
        }
        if (i == 1) {
            return jVar.mo14903h();
        }
        if (i != 3) {
            return null;
        }
        return m4935a(jVar, str, str2);
    }

    /* renamed from: a */
    private static void m4939a(C2022j jVar, int i, String str, C1952n nVar, C2018y yVar) {
        m4938a(nVar, yVar, (C1936j) new C1936j(i, str, yVar) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C2018y f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            /* renamed from: a */
            public final void mo14551a(boolean z, int i, int i2) {
                C2020z.m4941a(C2022j.this, this.f$1, this.f$2, this.f$3, z, i, i2);
            }
        }, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m4941a(C2022j jVar, int i, String str, C2018y yVar, boolean z, int i2, int i3) {
        if (z) {
            m4940a(jVar, i, str, yVar);
        } else {
            C1896a0.m4454a(jVar, str, i, yVar);
        }
    }

    /* renamed from: a */
    static void m4940a(C2022j jVar, int i, String str, C2018y yVar) {
        String str2 = yVar != null ? yVar.f4429i : "";
        C1913g b = m4944b(jVar, i, str, str2);
        if (b != null) {
            m4937a(b, str, yVar);
            m4942a(jVar, i, str, str2);
            return;
        }
        C1896a0.m4455a(jVar, str, i, yVar.f4429i);
    }

    /* renamed from: a */
    private static void m4938a(C1952n nVar, C2018y yVar, C1936j jVar, int i) {
        nVar.mo14707a(1, yVar.mo14891b().mo14588b(), new AtomicInteger(), jVar, m4936a(i));
    }

    /* renamed from: a */
    private static void m4942a(C2022j jVar, int i, String str, String str2) {
        if (i == 0) {
            Chartboost.cacheInterstitial(str);
        } else if (i == 1) {
            Chartboost.cacheRewardedVideo(str);
        } else if (i == 3) {
            jVar.f5222l.mo14478a(str, str2);
        }
    }

    /* renamed from: a */
    private static C1913g m4935a(C2022j jVar, String str, String str2) {
        C1881b bVar = jVar.f5222l;
        if (bVar != null) {
            return bVar.mo14476a(str);
        }
        C1896a0.m4461d(jVar, str, str2);
        return null;
    }

    /* renamed from: a */
    private static void m4937a(C1913g gVar, String str, C2018y yVar) {
        if (gVar.mo14610f(str) == null) {
            gVar.mo14604a(str, yVar);
        }
    }
}
