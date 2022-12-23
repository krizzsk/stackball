package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.C5690e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5726j;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.sdk.C5747c;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5789b;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.q */
final class C5741q implements C5747c {

    /* renamed from: a */
    ConcurrentHashMap<String, C5742r> f13823a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private C5789b f13824b;

    C5741q(List<NetworkSettings> list, C5726j jVar, String str, String str2) {
        this.f13824b = jVar.f13757i;
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C5685c.m13965a().mo41824a(next, next.getRewardedVideoSettings(), true, false);
                if (a != null) {
                    this.f13823a.put(next.getSubProviderId(), new C5742r(str, str2, next, this, jVar.f13753e, a));
                }
            } else {
                m14147a("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: a */
    static void m14144a(int i, C5742r rVar, Object[][] objArr) {
        Map<String, Object> c = rVar.mo42005c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, new JSONObject(c)));
    }

    /* renamed from: a */
    static void m14145a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        C5642d.m13798e().mo41689b(new C5641c(2500, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private static void m14146a(C5742r rVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + rVar.mo42101d() + " : " + str, 0);
    }

    /* renamed from: a */
    private static void m14147a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyIsManager " + str, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42007a(int i, C5742r rVar) {
        m14144a(i, rVar, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo42008a(IronSourceError ironSourceError, C5742r rVar) {
        m14146a(rVar, "onInterstitialAdShowFailed error=" + ironSourceError.toString());
        m14144a((int) IronSourceConstants.IS_INSTANCE_SHOW_FAILED, rVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        C5813z.m14382a().mo42146b(rVar.mo42103f(), ironSourceError);
    }

    /* renamed from: a */
    public final void mo42009a(IronSourceError ironSourceError, C5742r rVar, long j) {
        m14146a(rVar, "onInterstitialAdLoadFailed error=" + ironSourceError.toString());
        if (ironSourceError.getErrorCode() == 1158) {
            m14144a((int) IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, rVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m14144a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, rVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
        C5813z.m14382a().mo42145a(rVar.mo42103f(), ironSourceError);
    }

    /* renamed from: a */
    public final void mo42010a(C5742r rVar) {
        m14146a(rVar, "onInterstitialAdOpened");
        m14144a(2005, rVar, (Object[][]) null);
        C5813z a = C5813z.m14382a();
        String f = rVar.mo42103f();
        if (a.f14130a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(f) {

                /* renamed from: a */
                private /* synthetic */ String f14136a;

                {
                    this.f14136a = r2;
                }

                public final void run() {
                    C5813z.this.f14130a.onInterstitialAdOpened(this.f14136a);
                    C5813z zVar = C5813z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened() instanceId=" + this.f14136a, 1);
                }
            });
        }
        if (rVar.mo42106i()) {
            for (String a2 : rVar.f13900g) {
                C5690e.m13999a();
                String a3 = C5690e.m14001a(a2, rVar.mo42101d(), rVar.mo42102e(), rVar.f13901h, "", "", "", "");
                C5690e.m13999a();
                C5690e.m14004a("onInterstitialAdOpened", rVar.mo42101d(), a3);
            }
        }
    }

    /* renamed from: a */
    public final void mo42011a(C5742r rVar, long j) {
        m14146a(rVar, "onInterstitialAdReady");
        m14144a(2003, rVar, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        C5813z a = C5813z.m14382a();
        String f = rVar.mo42103f();
        if (a.f14130a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(f) {

                /* renamed from: a */
                private /* synthetic */ String f14131a;

                {
                    this.f14131a = r2;
                }

                public final void run() {
                    C5813z.this.f14130a.onInterstitialAdReady(this.f14131a);
                    C5813z zVar = C5813z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady() instanceId=" + this.f14131a, 1);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42012a(String str, String str2, boolean z) {
        IronSourceError buildLoadFailedError;
        try {
            if (!this.f13823a.containsKey(str)) {
                m14145a(2500, str);
                C5813z.m14382a().mo42145a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                return;
            }
            C5742r rVar = this.f13823a.get(str);
            if (z) {
                if (!rVar.mo42106i()) {
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in IAB flow must be called by bidder instances");
                    m14147a(buildLoadFailedError.getErrorMessage());
                    m14144a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, rVar, (Object[][]) null);
                } else {
                    C5690e.m13999a();
                    JSONObject a = C5690e.m14002a(str2);
                    C5690e.m13999a();
                    C5690e.C5691a a2 = C5690e.m13998a(a);
                    C5690e.m13999a();
                    C5782b a3 = C5690e.m14000a(rVar.mo42101d(), a2.f13547b);
                    if (a3 != null) {
                        rVar.mo42096a(a3.mo42083b());
                        rVar.mo42100b(a2.f13546a);
                        rVar.mo42098a(a2.f13549d);
                        m14144a(2002, rVar, (Object[][]) null);
                        rVar.mo42017a(a3.mo42083b(), a2.f13546a, a2.f13549d, a3.mo42085d());
                        return;
                    }
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                    m14147a(buildLoadFailedError.getErrorMessage());
                    m14144a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, rVar, (Object[][]) null);
                }
                C5813z.m14382a().mo42145a(str, buildLoadFailedError);
            } else if (!rVar.mo42106i()) {
                m14144a(2002, rVar, (Object[][]) null);
                rVar.mo42017a("", "", (JSONObject) null, (List<String>) null);
            } else {
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in non IAB flow must be called by non bidder instances");
                m14147a(buildLoadFailedError2.getErrorMessage());
                m14144a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, rVar, (Object[][]) null);
                C5813z.m14382a().mo42145a(str, buildLoadFailedError2);
            }
        } catch (Exception unused) {
            IronSourceError buildLoadFailedError3 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm exception");
            m14147a(buildLoadFailedError3.getErrorMessage());
            C5813z.m14382a().mo42145a(str, buildLoadFailedError3);
        }
    }

    /* renamed from: b */
    public final void mo42013b(C5742r rVar) {
        m14146a(rVar, "onInterstitialAdClosed");
        m14144a((int) IronSourceConstants.IS_INSTANCE_CLOSED, rVar, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C5804m.m14360a().mo42136b(2))}});
        C5804m.m14360a().mo42134a(2);
        C5813z a = C5813z.m14382a();
        String f = rVar.mo42103f();
        if (a.f14130a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(f) {

                /* renamed from: a */
                private /* synthetic */ String f14138a;

                {
                    this.f14138a = r2;
                }

                public final void run() {
                    C5813z.this.f14130a.onInterstitialAdClosed(this.f14138a);
                    C5813z zVar = C5813z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed() instanceId=" + this.f14138a, 1);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo42014c(C5742r rVar) {
        m14146a(rVar, "onInterstitialAdClicked");
        m14144a(2006, rVar, (Object[][]) null);
        C5813z a = C5813z.m14382a();
        String f = rVar.mo42103f();
        if (a.f14130a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(f) {

                /* renamed from: a */
                private /* synthetic */ String f14143a;

                {
                    this.f14143a = r2;
                }

                public final void run() {
                    C5813z.this.f14130a.onInterstitialAdClicked(this.f14143a);
                    C5813z zVar = C5813z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked() instanceId=" + this.f14143a, 1);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo42015d(C5742r rVar) {
        m14144a((int) IronSourceConstants.IS_INSTANCE_VISIBLE, rVar, (Object[][]) null);
        m14146a(rVar, "onInterstitialAdVisible");
    }
}
