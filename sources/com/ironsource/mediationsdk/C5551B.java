package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5568I;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5725i;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.sdk.C5753i;
import com.ironsource.mediationsdk.sdk.C5754j;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5793d;
import com.ironsource.mediationsdk.utils.C5794e;
import com.ironsource.mediationsdk.utils.C5799i;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.B */
final class C5551B extends C5632a implements C5753i, C5793d, C5799i {

    /* renamed from: m */
    C5754j f12789m;

    /* renamed from: n */
    C5736n f12790n = C5736n.m14120a();

    /* renamed from: o */
    private final String f12791o = getClass().getName();

    /* renamed from: p */
    private boolean f12792p = false;

    /* renamed from: q */
    private boolean f12793q = false;

    /* renamed from: r */
    private boolean f12794r;

    /* renamed from: s */
    private InterstitialPlacement f12795s;

    /* renamed from: t */
    private boolean f12796t = false;

    /* renamed from: u */
    private Map<String, C5552C> f12797u = new ConcurrentHashMap();

    /* renamed from: v */
    private CopyOnWriteArraySet<String> f12798v = new CopyOnWriteArraySet<>();

    /* renamed from: w */
    private long f12799w;

    /* renamed from: x */
    private boolean f12800x;

    C5551B() {
        this.f13259a = new C5794e("interstitial", this);
        this.f12800x = false;
    }

    /* renamed from: a */
    private int m13217a(C5677b.C5678a... aVarArr) {
        Iterator it = this.f13261c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            for (C5677b.C5678a aVar : aVarArr) {
                if (bVar.f13489a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m13218a(int i, C5677b bVar, Object[][] objArr) {
        m13219a(i, bVar, objArr, false);
    }

    /* renamed from: a */
    private void m13219a(int i, C5677b bVar, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (z) {
            try {
                if (this.f12795s != null && !TextUtils.isEmpty(this.f12795s.getPlacementName())) {
                    providerAdditionalData.put("placement", this.f12795s.getPlacementName());
                }
            } catch (Exception e) {
                this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m13220a(int i, Object[][] objArr) {
        m13221a(i, objArr, false);
    }

    /* renamed from: a */
    private void m13221a(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                if (this.f12795s != null && !TextUtils.isEmpty(this.f12795s.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.f12795s.getPlacementName());
                }
            } catch (Exception e) {
                this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, mediationAdditionalData));
    }

    /* renamed from: b */
    private void m13222b(int i, C5677b bVar, Object[][] objArr) {
        m13219a(i, bVar, objArr, true);
    }

    /* renamed from: e */
    private void m13223e(C5677b bVar) {
        if (!bVar.mo41807c()) {
            m13227i();
            m13225h();
            return;
        }
        bVar.mo41803a(C5677b.C5678a.INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m13224g(com.ironsource.mediationsdk.C5552C r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f13266h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r9.f12791o     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r10.mo41811j()     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.c r0 = com.ironsource.mediationsdk.C5685c.m13965a()     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f13491c     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f13491c     // Catch:{ all -> 0x00c4 }
            org.json.JSONObject r2 = r2.getInterstitialSettings()     // Catch:{ all -> 0x00c4 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo41824a(r1, r2, r4, r4)     // Catch:{ all -> 0x00c4 }
            r1 = 0
            if (r0 != 0) goto L_0x0059
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f13266h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.f13492d     // Catch:{ all -> 0x00c4 }
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x0059:
            r10.f13490b = r0     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C5677b.C5678a.INIT_PENDING     // Catch:{ all -> 0x00c4 }
            r10.mo41803a(r2)     // Catch:{ all -> 0x00c4 }
            r9.mo41670d(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r9.f13265g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r9.f13264f     // Catch:{ all -> 0x0096 }
            r10.mo41340h()     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f13490b     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0094
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f13490b     // Catch:{ all -> 0x0096 }
            r5.addInterstitialListener(r10)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f13505q     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = r10.f13492d     // Catch:{ all -> 0x0096 }
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = ":initInterstitial()"
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f13490b     // Catch:{ all -> 0x0096 }
            org.json.JSONObject r5 = r10.f12801r     // Catch:{ all -> 0x0096 }
            r3.initInterstitial(r2, r4, r5, r10)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r9)
            return r0
        L_0x0096:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f13266h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r9.f12791o     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r10.mo41811j()     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.INIT_FAILED     // Catch:{ all -> 0x00c4 }
            r10.mo41803a(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5551B.m13224g(com.ironsource.mediationsdk.C):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13225h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f13261c
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C5677b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f13489a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f13489a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.INIT_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f13489a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f13489a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.LOAD_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r1 = r1.f13489a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE
            if (r1 != r3) goto L_0x0006
        L_0x0031:
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0064
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f13266h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f13261c
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C5677b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f13489a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.EXHAUSTED
            if (r3 != r4) goto L_0x0045
            r1.mo41339g()
            goto L_0x0045
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f13266h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5551B.m13225h():void");
    }

    /* renamed from: h */
    private synchronized void m13226h(C5552C c) {
        m13218a(2002, (C5677b) c, (Object[][]) null);
        c.mo41341i();
        if (c.f13490b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = c.f13505q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":loadInterstitial()", 1);
            c.f12803t = new Date().getTime();
            c.f13490b.loadInterstitial(c.f12801r, c);
        }
    }

    /* renamed from: i */
    private AbstractAdapter m13227i() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f13261c.size() && abstractAdapter == null; i2++) {
            if (((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.AVAILABLE || ((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.INITIATED || ((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.INIT_PENDING || ((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.LOAD_PENDING) {
                i++;
                if (i >= this.f13260b) {
                    break;
                }
            } else if (((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.NOT_INITIATED && (abstractAdapter = m13224g((C5552C) this.f13261c.get(i2))) == null) {
                ((C5677b) this.f13261c.get(i2)).mo41803a(C5677b.C5678a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* renamed from: j */
    private synchronized void m13228j() {
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.AVAILABLE || bVar.f13489a == C5677b.C5678a.LOAD_PENDING || bVar.f13489a == C5677b.C5678a.NOT_AVAILABLE) {
                bVar.mo41803a(C5677b.C5678a.INITIATED);
            }
        }
    }

    /* renamed from: k */
    private void m13229k() {
        for (int i = 0; i < this.f13261c.size(); i++) {
            String providerTypeForReflection = ((C5677b) this.f13261c.get(i)).f13491c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C5685c.m13965a().mo41824a(((C5677b) this.f13261c.get(i)).f13491c, ((C5677b) this.f13261c.get(i)).f13491c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41319a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f12791o + " Should Track Network State: " + z, 0);
        this.f13267i = z;
    }

    /* renamed from: a */
    public final synchronized void mo41320a(C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + " :onInterstitialInitSuccess()", 1);
        m13218a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, (C5677b) c, (Object[][]) null);
        this.f12794r = true;
        if (this.f12792p) {
            if (m13217a(C5677b.C5678a.AVAILABLE, C5677b.C5678a.LOAD_PENDING) < this.f13260b) {
                c.mo41803a(C5677b.C5678a.LOAD_PENDING);
                m13226h(c);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo41321a(C5552C c, long j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdReady()", 1);
        m13218a(2003, (C5677b) c, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        long time = new Date().getTime() - this.f12799w;
        c.mo41803a(C5677b.C5678a.AVAILABLE);
        this.f12793q = false;
        if (this.f12796t) {
            this.f12796t = false;
            this.f12789m.onInterstitialAdReady();
            m13220a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(time)}});
        }
    }

    /* renamed from: a */
    public final synchronized void mo41322a(IronSourceError ironSourceError, C5552C c) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            m13218a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, (C5677b) c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            if (m13217a(C5677b.C5678a.INIT_FAILED) >= this.f13261c.size()) {
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f13266h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                ironSourceLoggerManager2.log(ironSourceTag2, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
                if (this.f12792p) {
                    this.f12790n.mo41990a(ErrorBuilder.buildGenericError("no ads to show"));
                    m13220a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_GENERIC)}});
                    this.f12796t = false;
                }
                this.f12794r = true;
            } else {
                if (m13227i() == null && this.f12792p) {
                    if (m13217a(C5677b.C5678a.INIT_FAILED, C5677b.C5678a.NOT_AVAILABLE, C5677b.C5678a.CAPPED_PER_SESSION, C5677b.C5678a.CAPPED_PER_DAY, C5677b.C5678a.EXHAUSTED) >= this.f13261c.size()) {
                        this.f12790n.mo41990a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                        m13220a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
                        this.f12796t = false;
                    }
                }
                m13225h();
                return;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager3 = this.f13266h;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager3.logException(ironSourceTag3, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + c.mo41811j() + ")", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0129, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41323a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.C5552C r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f13266h     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r2.<init>()     // Catch:{ all -> 0x012a }
            java.lang.String r3 = r9.f13492d     // Catch:{ all -> 0x012a }
            r2.append(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = ":onInterstitialAdLoadFailed("
            r2.append(r3)     // Catch:{ all -> 0x012a }
            r2.append(r8)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012a }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r9.f13492d     // Catch:{ all -> 0x012a }
            r0.append(r1)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = ":onInterstitialAdLoadFailed("
            r0.append(r1)     // Catch:{ all -> 0x012a }
            r0.append(r8)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x012a }
            int r0 = r8.getErrorCode()     // Catch:{ all -> 0x012a }
            r1 = 1158(0x486, float:1.623E-42)
            r2 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0074
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]     // Catch:{ all -> 0x012a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012a }
            int r8 = r8.getErrorCode()     // Catch:{ all -> 0x012a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012a }
            r5[r3] = r8     // Catch:{ all -> 0x012a }
            r1[r4] = r5     // Catch:{ all -> 0x012a }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012a }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012a }
            r8[r3] = r10     // Catch:{ all -> 0x012a }
            r1[r3] = r8     // Catch:{ all -> 0x012a }
            r7.m13218a((int) r0, (com.ironsource.mediationsdk.C5677b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012a }
            goto L_0x00aa
        L_0x0074:
            r0 = 2200(0x898, float:3.083E-42)
            r1 = 3
            java.lang.Object[][] r1 = new java.lang.Object[r1][]     // Catch:{ all -> 0x012a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012a }
            int r6 = r8.getErrorCode()     // Catch:{ all -> 0x012a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x012a }
            r5[r3] = r6     // Catch:{ all -> 0x012a }
            r1[r4] = r5     // Catch:{ all -> 0x012a }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "reason"
            r5[r4] = r6     // Catch:{ all -> 0x012a }
            java.lang.String r8 = r8.getErrorMessage()     // Catch:{ all -> 0x012a }
            r5[r3] = r8     // Catch:{ all -> 0x012a }
            r1[r3] = r5     // Catch:{ all -> 0x012a }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012a }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012a }
            r8[r3] = r10     // Catch:{ all -> 0x012a }
            r1[r2] = r8     // Catch:{ all -> 0x012a }
            r7.m13218a((int) r0, (com.ironsource.mediationsdk.C5677b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012a }
        L_0x00aa:
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_AVAILABLE     // Catch:{ all -> 0x012a }
            r9.mo41803a(r8)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b$a[] r8 = new com.ironsource.mediationsdk.C5677b.C5678a[r2]     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE     // Catch:{ all -> 0x012a }
            r8[r4] = r9     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C5677b.C5678a.LOAD_PENDING     // Catch:{ all -> 0x012a }
            r8[r3] = r9     // Catch:{ all -> 0x012a }
            int r8 = r7.m13217a((com.ironsource.mediationsdk.C5677b.C5678a[]) r8)     // Catch:{ all -> 0x012a }
            int r9 = r7.f13260b     // Catch:{ all -> 0x012a }
            if (r8 < r9) goto L_0x00c3
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.concurrent.CopyOnWriteArrayList r9 = r7.f13261c     // Catch:{ all -> 0x012a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x012a }
        L_0x00c9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x012a }
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b r10 = (com.ironsource.mediationsdk.C5677b) r10     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b$a r11 = r10.f13489a     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.INITIATED     // Catch:{ all -> 0x012a }
            if (r11 != r0) goto L_0x00c9
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C5677b.C5678a.LOAD_PENDING     // Catch:{ all -> 0x012a }
            r10.mo41803a(r8)     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.C r10 = (com.ironsource.mediationsdk.C5552C) r10     // Catch:{ all -> 0x012a }
            r7.m13226h(r10)     // Catch:{ all -> 0x012a }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.ironsource.mediationsdk.AbstractAdapter r9 = r7.m13227i()     // Catch:{ all -> 0x012a }
            if (r9 == 0) goto L_0x00ef
            monitor-exit(r7)
            return
        L_0x00ef:
            boolean r9 = r7.f12792p     // Catch:{ all -> 0x012a }
            if (r9 == 0) goto L_0x0128
            com.ironsource.mediationsdk.b$a[] r9 = new com.ironsource.mediationsdk.C5677b.C5678a[r3]     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C5677b.C5678a.INIT_PENDING     // Catch:{ all -> 0x012a }
            r9[r4] = r10     // Catch:{ all -> 0x012a }
            int r9 = r7.m13217a((com.ironsource.mediationsdk.C5677b.C5678a[]) r9)     // Catch:{ all -> 0x012a }
            int r8 = r8 + r9
            if (r8 != 0) goto L_0x0128
            r7.m13225h()     // Catch:{ all -> 0x012a }
            r7.f12793q = r4     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.n r8 = r7.f12790n     // Catch:{ all -> 0x012a }
            com.ironsource.mediationsdk.logger.IronSourceError r9 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012a }
            java.lang.String r10 = "No ads to show"
            r11 = 509(0x1fd, float:7.13E-43)
            r9.<init>(r11, r10)     // Catch:{ all -> 0x012a }
            r8.mo41990a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x012a }
            r8 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r9 = new java.lang.Object[r3][]     // Catch:{ all -> 0x012a }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "errorCode"
            r10[r4] = r0     // Catch:{ all -> 0x012a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x012a }
            r10[r3] = r11     // Catch:{ all -> 0x012a }
            r9[r4] = r10     // Catch:{ all -> 0x012a }
            r7.m13220a((int) r8, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x012a }
        L_0x0128:
            monitor-exit(r7)
            return
        L_0x012a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5551B.mo41323a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.C, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41324a(InterstitialPlacement interstitialPlacement) {
        this.f12795s = interstitialPlacement;
        this.f12789m.f13837e = interstitialPlacement;
    }

    /* renamed from: a */
    public final void mo41325a(String str) {
        if (this.f12792p) {
            this.f12790n.mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.f12792p = false;
            this.f12793q = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41326a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.f12791o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        m13220a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.f13265g = str;
        this.f13264f = str2;
        Iterator it = this.f13261c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (this.f13259a.mo42119b(bVar)) {
                m13218a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.f13259a.mo42120c(bVar)) {
                bVar.mo41803a(C5677b.C5678a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.f13261c.size()) {
            this.f12794r = true;
        }
        m13229k();
        for (int i2 = 0; i2 < this.f13260b && m13227i() != null; i2++) {
        }
        m13220a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    public final void mo41327a(List<IronSource.AD_UNIT> list, boolean z, C5725i iVar) {
    }

    /* renamed from: b */
    public final void mo41328b(C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdOpened()", 1);
        m13222b(2005, c, (Object[][]) null);
        this.f12789m.onInterstitialAdOpened();
    }

    /* renamed from: b */
    public final void mo41329b(IronSourceError ironSourceError, C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        m13222b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.f12800x = false;
        m13223e((C5677b) c);
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            if (((C5677b) it.next()).f13489a == C5677b.C5678a.AVAILABLE) {
                this.f12792p = true;
                InterstitialPlacement interstitialPlacement = this.f12795s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                mo41332d();
                return;
            }
        }
        this.f12789m.onInterstitialAdShowFailed(ironSourceError);
    }

    /* renamed from: c */
    public final synchronized void mo41330c() {
        try {
            if (this.f12800x) {
                this.f13266h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                C5543A.m13206a().mo41280a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f12795s = null;
            this.f12789m.f13837e = null;
            if (!this.f12793q) {
                if (!this.f12790n.mo41991b()) {
                    C5568I.C5572a b = C5568I.m13411a().mo41447b();
                    if (b == C5568I.C5572a.NOT_INIT) {
                        this.f13266h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b == C5568I.C5572a.INIT_IN_PROGRESS) {
                        if (C5568I.m13411a().mo41449c()) {
                            this.f13266h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f12790n.mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                            return;
                        }
                        this.f12799w = new Date().getTime();
                        m13220a(2001, (Object[][]) null);
                        this.f12792p = true;
                        this.f12796t = true;
                        return;
                    } else if (b == C5568I.C5572a.INIT_FAILED) {
                        this.f13266h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f12790n.mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else if (this.f13261c.size() == 0) {
                        this.f13266h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f12790n.mo41990a(ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else {
                        this.f12799w = new Date().getTime();
                        m13220a(2001, (Object[][]) null);
                        this.f12796t = true;
                        m13228j();
                        if (m13217a(C5677b.C5678a.INITIATED) != 0) {
                            this.f12792p = true;
                            this.f12793q = true;
                            Iterator it = this.f13261c.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C5677b bVar = (C5677b) it.next();
                                if (bVar.f13489a == C5677b.C5678a.INITIATED) {
                                    bVar.mo41803a(C5677b.C5678a.LOAD_PENDING);
                                    m13226h((C5552C) bVar);
                                    i++;
                                    if (i >= this.f13260b) {
                                        return;
                                    }
                                }
                            }
                            return;
                        } else if (!this.f12794r) {
                            this.f12792p = true;
                            return;
                        } else {
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.f13266h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.f12790n.mo41990a(buildGenericError);
                            m13220a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.f12796t = false;
                            return;
                        }
                    }
                }
            }
            this.f13266h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.f13266h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f12790n.mo41990a(buildLoadFailedError);
            if (this.f12796t) {
                this.f12796t = false;
                m13220a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    /* renamed from: c */
    public final void mo41331c(C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdClosed()", 1);
        this.f12800x = false;
        m13222b(IronSourceConstants.IS_INSTANCE_CLOSED, c, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C5804m.m14360a().mo42136b(2))}});
        C5804m.m14360a().mo42134a(2);
        this.f12789m.onInterstitialAdClosed();
    }

    /* renamed from: d */
    public final void mo41332d() {
        if (this.f12800x) {
            this.f13266h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.f12789m.onInterstitialAdShowFailed(new IronSourceError(1036, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.f12792p) {
            this.f13266h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.f12789m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (!this.f13267i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            for (int i = 0; i < this.f13261c.size(); i++) {
                C5677b bVar = (C5677b) this.f13261c.get(i);
                if (bVar.f13489a == C5677b.C5678a.AVAILABLE) {
                    C5790c.m14292c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f12795s);
                    if (C5790c.m14287b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f12795s) != C5790c.C5792a.f13939d) {
                        m13221a((int) IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    m13222b(IronSourceConstants.IS_INSTANCE_SHOW, bVar, (Object[][]) null);
                    this.f12800x = true;
                    C5552C c = (C5552C) bVar;
                    if (c.f13490b != null) {
                        IronSourceLoggerManager ironSourceLoggerManager = c.f13505q;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":showInterstitial()", 1);
                        c.mo41808d();
                        c.f13490b.showInterstitial(c.f12801r, c);
                    }
                    if (bVar.mo41806b()) {
                        m13218a((int) IronSourceConstants.IS_CAP_SESSION, bVar, (Object[][]) null);
                    }
                    this.f13259a.mo42117a(bVar);
                    if (this.f13259a.mo42120c(bVar)) {
                        bVar.mo41803a(C5677b.C5678a.CAPPED_PER_DAY);
                        m13218a(250, bVar, new Object[][]{new Object[]{"status", "true"}});
                    }
                    this.f12792p = false;
                    if (!bVar.mo41807c()) {
                        m13227i();
                        return;
                    }
                    return;
                }
            }
            this.f12789m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        } else {
            this.f13266h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.f12789m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    /* renamed from: d */
    public final void mo41333d(C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdShowSucceeded()", 1);
        m13222b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, c, (Object[][]) null);
        Iterator it = this.f13261c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.AVAILABLE) {
                m13223e(bVar);
                z = true;
            }
        }
        if (!z && (c.f13489a == C5677b.C5678a.CAPPED_PER_SESSION || c.f13489a == C5677b.C5678a.EXHAUSTED || c.f13489a == C5677b.C5678a.CAPPED_PER_DAY)) {
            m13225h();
        }
        m13228j();
        this.f12789m.onInterstitialAdShowSucceeded();
    }

    /* renamed from: e */
    public final void mo41334e(C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdClicked()", 1);
        m13222b(2006, c, (Object[][]) null);
        this.f12789m.onInterstitialAdClicked();
    }

    /* renamed from: e */
    public final synchronized boolean mo41335e() {
        boolean z;
        if (this.f13267i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.AVAILABLE) {
                C5552C c = (C5552C) bVar;
                if (c.f13490b != null) {
                    IronSourceLoggerManager ironSourceLoggerManager = c.f13505q;
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                    ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":isInterstitialReady()", 1);
                    z = c.f13490b.isInterstitialReady(c.f12801r);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo41336f() {
        if (this.f12792p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.f12790n.mo41990a(buildInitFailedError);
            this.f12792p = false;
            this.f12793q = false;
            if (this.f12796t) {
                m13221a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f12796t = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo41337f(C5552C c) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, c.f13492d + ":onInterstitialAdVisible()", 1);
    }

    /* renamed from: g */
    public final void mo41338g() {
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.CAPPED_PER_DAY) {
                m13218a(250, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo41803a(bVar.mo41806b() ? C5677b.C5678a.CAPPED_PER_SESSION : bVar.mo41805a() ? C5677b.C5678a.EXHAUSTED : C5677b.C5678a.INITIATED);
            }
        }
    }
}
