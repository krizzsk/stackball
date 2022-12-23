package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5728l;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.sdk.C5751g;
import com.ironsource.mediationsdk.sdk.C5777k;
import com.ironsource.mediationsdk.utils.C5800j;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.K */
final class C5578K implements C5751g {

    /* renamed from: a */
    C5777k f13007a;

    /* renamed from: b */
    C5751g f13008b;

    /* renamed from: c */
    private final String f13009c = getClass().getName();

    /* renamed from: d */
    private IronSourceLoggerManager f13010d = IronSourceLoggerManager.getLogger();

    /* renamed from: e */
    private AtomicBoolean f13011e = new AtomicBoolean(true);

    /* renamed from: f */
    private AtomicBoolean f13012f = new AtomicBoolean(false);

    /* renamed from: g */
    private C5800j f13013g;

    /* renamed from: h */
    private NetworkSettings f13014h;

    /* renamed from: i */
    private String f13015i;

    C5578K() {
    }

    /* renamed from: a */
    private synchronized void m13436a(IronSourceError ironSourceError) {
        if (this.f13012f != null) {
            this.f13012f.set(false);
        }
        if (this.f13011e != null) {
            this.f13011e.set(true);
        }
        if (this.f13008b != null) {
            this.f13008b.mo41509a(false, ironSourceError);
        }
    }

    /* renamed from: b */
    private AbstractAdapter m13437b(String str) {
        try {
            C5556E a = C5556E.m13257a();
            AbstractAdapter b = a.mo41367b(str);
            if (b == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                b = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, new Class[]{String.class}).invoke(cls, new Object[]{str});
                if (b == null) {
                    return null;
                }
            }
            a.mo41363a(b);
            return b;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f13010d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f13010d;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.logException(ironSourceTag2, this.f13009c + ":startOfferwallAdapter", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo41507a(String str) {
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f13008b.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.f13015i = str;
            C5728l a = this.f13013g.f14083c.f13746c.mo41978a(str);
            if (a == null) {
                this.f13010d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f13013g.f14083c.f13746c.mo41977a();
                if (a == null) {
                    this.f13010d.log(IronSourceLogger.IronSourceTag.INTERNAL, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f13010d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            if (this.f13012f != null && this.f13012f.get() && this.f13007a != null) {
                this.f13007a.showOfferwall(String.valueOf(a.f13763a), this.f13014h.getRewardedVideoSettings());
            }
        } catch (Exception e) {
            this.f13010d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[SYNTHETIC, Splitter:B:18:0x0067] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41508a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f13010d     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r2.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = r7.f13009c     // Catch:{ all -> 0x00fc }
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ":initOfferwall(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            r2.append(r8)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            r2.append(r9)     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fc }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C5556E.m13257a()     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.utils.j r0 = r0.f12853i     // Catch:{ all -> 0x00fc }
            r7.f13013g = r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.k r1 = r1.f13746c     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x0054
            com.ironsource.mediationsdk.model.i r1 = r0.f14083c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.k r1 = r1.f13746c     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.mo41979b()     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x004b
            goto L_0x0054
        L_0x004b:
            com.ironsource.mediationsdk.model.i r0 = r0.f14083c     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.k r0 = r0.f13746c     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = r0.mo41979b()     // Catch:{ all -> 0x00fc }
            goto L_0x0056
        L_0x0054:
            java.lang.String r0 = "SupersonicAds"
        L_0x0056:
            com.ironsource.mediationsdk.utils.j r1 = r7.f13013g     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0067
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m13436a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0067:
            com.ironsource.mediationsdk.utils.j r1 = r7.f13013g     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.p r1 = r1.f14064b     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r1.mo41985a((java.lang.String) r0)     // Catch:{ all -> 0x00fc }
            r7.f13014h = r1     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0080
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m13436a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0080:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r7.m13437b(r0)     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0093
            java.lang.String r8 = "Please check configurations for Offerwall adapters"
            java.lang.String r9 = "Offerwall"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r9)     // Catch:{ all -> 0x00fc }
            r7.m13436a((com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x0093:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.C5556E.m13257a()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r1 = r1.f12856l     // Catch:{ Exception -> 0x00c8 }
            if (r1 == 0) goto L_0x009e
            r0.setMediationSegment(r1)     // Catch:{ Exception -> 0x00c8 }
        L_0x009e:
            com.ironsource.mediationsdk.E r1 = com.ironsource.mediationsdk.C5556E.m13257a()     // Catch:{ Exception -> 0x00c8 }
            java.lang.Boolean r1 = r1.f12868x     // Catch:{ Exception -> 0x00c8 }
            if (r1 == 0) goto L_0x00e3
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f13010d     // Catch:{ Exception -> 0x00c8 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ Exception -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = "Offerwall | setConsent(consent:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00c8 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c8 }
            r2.log(r4, r5, r3)     // Catch:{ Exception -> 0x00c8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x00c8 }
            r0.setConsent(r1)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00e3
        L_0x00c8:
            r1 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r7.f13010d     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = ":setCustomParams():"
            r4.<init>(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fc }
            r4.append(r1)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fc }
            r4 = 3
            r2.log(r3, r1, r4)     // Catch:{ all -> 0x00fc }
        L_0x00e3:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r7.f13010d     // Catch:{ all -> 0x00fc }
            r0.setLogListener(r1)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.sdk.k r0 = (com.ironsource.mediationsdk.sdk.C5777k) r0     // Catch:{ all -> 0x00fc }
            r7.f13007a = r0     // Catch:{ all -> 0x00fc }
            r0.setInternalOfferwallListener(r7)     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.sdk.k r0 = r7.f13007a     // Catch:{ all -> 0x00fc }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r7.f13014h     // Catch:{ all -> 0x00fc }
            org.json.JSONObject r1 = r1.getRewardedVideoSettings()     // Catch:{ all -> 0x00fc }
            r0.initOfferwall(r8, r9, r1)     // Catch:{ all -> 0x00fc }
            monitor-exit(r7)
            return
        L_0x00fc:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5578K.mo41508a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo41509a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13010d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (z) {
            this.f13012f.set(true);
            C5751g gVar = this.f13008b;
            if (gVar != null) {
                gVar.onOfferwallAvailable(true);
                return;
            }
            return;
        }
        m13436a(ironSourceError);
    }

    /* renamed from: a */
    public final synchronized boolean mo41510a() {
        boolean z;
        z = false;
        if (this.f13012f != null) {
            z = this.f13012f.get();
        }
        return z;
    }

    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13010d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        C5751g gVar = this.f13008b;
        if (gVar != null) {
            gVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.f13010d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        C5751g gVar = this.f13008b;
        if (gVar != null) {
            return gVar.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo41509a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        this.f13010d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        C5751g gVar = this.f13008b;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    public final void onOfferwallOpened() {
        this.f13010d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b = C5804m.m14360a().mo42136b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f13015i)) {
                mediationAdditionalData.put("placement", this.f13015i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5645g.m13810e().mo41689b(new C5641c(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        C5804m.m14360a().mo42134a(0);
        C5751g gVar = this.f13008b;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13010d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        C5751g gVar = this.f13008b;
        if (gVar != null) {
            gVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
