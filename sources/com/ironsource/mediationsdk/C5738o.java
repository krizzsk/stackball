package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C5723g;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.sdk.C5746b;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.o */
public final class C5738o implements C5746b {

    /* renamed from: a */
    C5739p f13813a;

    /* renamed from: b */
    IronSourceBannerLayout f13814b;

    /* renamed from: c */
    ConcurrentHashMap<String, C5739p> f13815c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private C5739p f13816d;

    public C5738o(List<NetworkSettings> list, C5723g gVar, String str, String str2) {
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C5685c.m13965a().mo41824a(next, next.getBannerSettings(), true, false);
                if (a != null) {
                    this.f13815c.put(next.getSubProviderId(), new C5739p(str, str2, next, this, (int) gVar.f13737b, a));
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: a */
    static void m14127a(int i, C5739p pVar, Object[][] objArr) {
        Map<String, Object> c = pVar.mo42005c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, new JSONObject(c)));
    }

    /* renamed from: a */
    static void m14128a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put("spId", str);
        C5642d.m13798e().mo41689b(new C5641c(i, new JSONObject(hashMap)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41993a(int i, C5739p pVar) {
        m14127a(i, pVar, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41994a(com.ironsource.mediationsdk.IronSourceBannerLayout r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "demand only banner manager : destroyBanner"
            r0.verbose(r1)     // Catch:{ all -> 0x005c }
            if (r4 != 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "destroyBanner banner cannot be null"
            r4.error(r0)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0013:
            boolean r0 = r4.isDestroyed()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0022
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API"
            r4.error(r0)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0022:
            r4.mo41466b()     // Catch:{ all -> 0x005c }
            r4 = 0
            r3.f13814b = r4     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.p r0 = r3.f13816d     // Catch:{ all -> 0x005c }
            r1 = 3305(0xce9, float:4.631E-42)
            if (r0 == 0) goto L_0x0043
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "demand only banner manager : destroyBanner | mActiveSmash != null "
            r0.verbose(r2)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.p r0 = r3.f13816d     // Catch:{ all -> 0x005c }
            m14127a((int) r1, (com.ironsource.mediationsdk.C5739p) r0, (java.lang.Object[][]) r4)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.p r0 = r3.f13816d     // Catch:{ all -> 0x005c }
            r0.mo42002a()     // Catch:{ all -> 0x005c }
            r3.f13816d = r4     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0043:
            com.ironsource.mediationsdk.p r0 = r3.f13813a     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "demand only banner manager : destroyBanner | mLoadingSmash != null "
            r0.verbose(r2)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.p r0 = r3.f13813a     // Catch:{ all -> 0x005c }
            m14127a((int) r1, (com.ironsource.mediationsdk.C5739p) r0, (java.lang.Object[][]) r4)     // Catch:{ all -> 0x005c }
            com.ironsource.mediationsdk.p r0 = r3.f13813a     // Catch:{ all -> 0x005c }
            r0.mo42002a()     // Catch:{ all -> 0x005c }
            r3.f13813a = r4     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r3)
            return
        L_0x005c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5738o.mo41994a(com.ironsource.mediationsdk.IronSourceBannerLayout):void");
    }

    /* renamed from: a */
    public final void mo41995a(IronSourceError ironSourceError, C5739p pVar, boolean z, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + pVar.mo42004b());
        if (z) {
            m14127a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, pVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m14127a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, pVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f13814b;
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            this.f13814b.mo41464a(ironSourceError);
        }
    }

    /* renamed from: a */
    public final void mo41996a(C5739p pVar) {
        IronLog.INTERNAL.verbose(pVar.mo42004b());
        m14127a((int) IronSourceConstants.BN_INSTANCE_CLICK, pVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f13814b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo41467c();
        }
    }

    /* renamed from: a */
    public final void mo41997a(C5739p pVar, View view, FrameLayout.LayoutParams layoutParams) {
        C5739p pVar2 = pVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + pVar.mo42004b());
        IronSourceBannerLayout ironSourceBannerLayout = this.f13814b;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo41993a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, pVar2);
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout2 = this.f13814b;
        if (ironSourceBannerLayout2 != null) {
            ironSourceBannerLayout2.mo41463a(view, layoutParams);
        }
        this.f13816d = pVar2;
        int b = C5804m.m14360a().mo42136b(3);
        m14127a((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, pVar2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        m14127a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, pVar2, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b)}});
        C5804m.m14360a().mo42134a(3);
        if (pVar.mo42106i()) {
            for (String a : pVar2.f13900g) {
                C5690e.m13999a();
                String a2 = C5690e.m14001a(a, pVar.mo42101d(), pVar.mo42102e(), pVar2.f13901h, "", "", "", "");
                C5690e.m13999a();
                C5690e.m14004a("onBannerAdLoaded", pVar.mo42101d(), a2);
            }
        }
        IronSourceBannerLayout ironSourceBannerLayout3 = this.f13814b;
        if (ironSourceBannerLayout3 != null) {
            ironSourceBannerLayout3.mo41465a(String.format("%s %s", new Object[]{pVar.mo42004b(), Integer.valueOf(pVar.hashCode())}));
        }
    }

    /* renamed from: b */
    public final void mo41998b(C5739p pVar) {
        IronLog.INTERNAL.verbose(pVar.mo42004b());
        m14127a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, pVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f13814b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo41469e();
        }
    }

    /* renamed from: c */
    public final void mo41999c(C5739p pVar) {
        IronLog.INTERNAL.verbose(pVar.mo42004b());
        m14127a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, pVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f13814b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo41468d();
        }
    }

    /* renamed from: d */
    public final void mo42000d(C5739p pVar) {
        IronLog.INTERNAL.verbose(pVar.mo42004b());
        m14127a((int) IronSourceConstants.BN_INSTANCE_LEFT_APPLICATION, pVar, (Object[][]) null);
        IronSourceBannerLayout ironSourceBannerLayout = this.f13814b;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.mo41470f();
        }
    }

    /* renamed from: e */
    public final void mo42001e(C5739p pVar) {
        IronLog.INTERNAL.verbose(pVar.mo42004b());
        m14127a((int) IronSourceConstants.BN_INSTANCE_SHOW, pVar, (Object[][]) null);
        m14128a((int) IronSourceConstants.BN_CALLBACK_SHOW, "");
    }
}
