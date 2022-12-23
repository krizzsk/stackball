package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5531j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.C5807v;
import com.ironsource.mediationsdk.logger.C5715c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.sdk.C5754j;
import com.ironsource.mediationsdk.sdk.C5779m;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5793d;
import com.ironsource.mediationsdk.utils.C5794e;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.X */
final class C5624X extends C5632a implements C5531j, C5779m, C5793d, C5812y {

    /* renamed from: m */
    C5754j f13231m;

    /* renamed from: n */
    boolean f13232n = false;

    /* renamed from: o */
    int f13233o;

    /* renamed from: p */
    private final String f13234p = getClass().getSimpleName();

    /* renamed from: q */
    private boolean f13235q = false;

    /* renamed from: r */
    private NetworkStateReceiver f13236r;

    /* renamed from: s */
    private Placement f13237s;

    /* renamed from: t */
    private Timer f13238t = null;

    /* renamed from: u */
    private List<C5677b.C5678a> f13239u = Arrays.asList(new C5677b.C5678a[]{C5677b.C5678a.INIT_FAILED, C5677b.C5678a.CAPPED_PER_SESSION, C5677b.C5678a.EXHAUSTED, C5677b.C5678a.CAPPED_PER_DAY});

    /* renamed from: v */
    private boolean f13240v = false;

    /* renamed from: w */
    private long f13241w = new Date().getTime();

    /* renamed from: x */
    private boolean f13242x = false;

    C5624X() {
        this.f13259a = new C5794e("rewarded_video", this);
    }

    /* renamed from: a */
    private void m13684a(int i, C5677b bVar, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m13685a(int i, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private synchronized void m13686a(C5677b bVar, int i) {
        Object[][] objArr;
        C5790c.m14293c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f13237s);
        if (C5790c.m14294c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), m13702p())) {
            m13685a((int) IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{"placement", m13702p()}});
        }
        this.f13259a.mo42117a(bVar);
        if (this.f13237s != null) {
            if (this.f13232n) {
                m13687a(((C5626Y) bVar).f13248v, true, this.f13237s.getPlacementId());
                int placementId = this.f13237s.getPlacementId();
                int i2 = 0;
                while (i2 < i && i2 < this.f13261c.size()) {
                    if (!this.f13239u.contains(((C5677b) this.f13261c.get(i2)).f13489a)) {
                        m13687a(((C5626Y) this.f13261c.get(i2)).f13248v, false, placementId);
                    }
                    i2++;
                }
            }
            String p = m13702p();
            m13684a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "true"}});
            int i3 = 0;
            while (i3 < this.f13261c.size() && i3 < i) {
                C5677b bVar2 = (C5677b) this.f13261c.get(i3);
                if (bVar2.f13489a == C5677b.C5678a.NOT_AVAILABLE || bVar2.f13489a == C5677b.C5678a.NEEDS_RELOAD) {
                    m13684a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar2, new Object[][]{new Object[]{"placement", p}, new Object[]{"status", "false"}});
                }
                i3++;
            }
        } else {
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        if (this.f13237s != null) {
            objArr = new Object[][]{new Object[]{"placement", m13702p()}};
        } else {
            objArr = null;
        }
        m13684a((int) IronSourceConstants.RV_INSTANCE_SHOW, bVar, objArr);
        this.f13242x = true;
        C5807v.C5809a.f14128a.mo42138a();
        ((C5626Y) bVar).f13249w = C5804m.m14360a().mo42136b(1);
        C5626Y y = (C5626Y) bVar;
        if (y.f13490b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = y.f13505q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":showRewardedVideo()", 1);
            y.mo41808d();
            y.f13490b.showRewardedVideo(y.f13244r, y);
        }
    }

    /* renamed from: a */
    private synchronized void m13687a(String str, boolean z, int i) {
        String str2 = "";
        try {
            str2 = (str2 + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable(str2, z, i) {

                /* renamed from: a */
                private /* synthetic */ String f13888a;

                /* renamed from: b */
                private /* synthetic */ boolean f13889b;

                /* renamed from: c */
                private /* synthetic */ int f13890c;

                {
                    this.f13888a = r1;
                    this.f13889b = r2;
                    this.f13890c = r3;
                }

                public final void run() {
                    String str = this.f13888a;
                    boolean z = this.f13889b;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, this.f13890c)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
                        if (str == null) {
                            sb.append("null");
                        } else {
                            sb.append(str);
                        }
                        sb.append(", hit:");
                        sb.append(z);
                        sb.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new C5715c());
            thread.start();
        } catch (Throwable th) {
            this.f13266h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m13688a(java.util.Map<java.lang.String, java.lang.Object> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.b r0 = r2.f13262d     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.f13269k     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0023
            r2.f13269k = r1     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.b r3 = r2.f13262d     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.Y r3 = (com.ironsource.mediationsdk.C5626Y) r3     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r2.m13693h(r3)     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0021
            com.ironsource.mediationsdk.sdk.j r3 = r2.f13231m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f13268j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            boolean r0 = r2.m13697k()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003d
            r3 = 0
            boolean r3 = r2.m13689a((boolean) r1, (boolean) r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            com.ironsource.mediationsdk.sdk.j r3 = r2.f13231m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f13268j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return
        L_0x003d:
            com.ironsource.mediationsdk.sdk.j r0 = r2.f13231m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r1 = r2.f13268j     // Catch:{ all -> 0x004a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x004a }
            r0.mo42057a((boolean) r1, (java.util.Map<java.lang.String, java.lang.Object>) r3)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r2)
            return
        L_0x004a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.m13688a(java.util.Map):void");
    }

    /* renamed from: a */
    private synchronized boolean m13689a(boolean z, boolean z2) {
        boolean z3;
        Boolean bool;
        z3 = false;
        if (this.f13268j == null) {
            mo41649d();
            if (z) {
                bool = Boolean.TRUE;
            } else if (!m13697k() && m13694h()) {
                bool = Boolean.FALSE;
            }
        } else if (z && !this.f13268j.booleanValue()) {
            bool = Boolean.TRUE;
        } else if (!z && this.f13268j.booleanValue() && ((!m13696j() || z2) && !m13697k())) {
            bool = Boolean.FALSE;
        }
        this.f13268j = bool;
        z3 = true;
        return z3;
    }

    /* renamed from: b */
    private void m13690b(int i) {
        m13685a(i, (Object[][]) null);
    }

    /* renamed from: b */
    private void m13691b(boolean z) {
        if (!z && mo41648c()) {
            m13685a(1000, (Object[][]) null);
            m13685a(1003, new Object[][]{new Object[]{"duration", 0}});
            this.f13240v = false;
        } else if (m13695i()) {
            m13685a(1000, (Object[][]) null);
            this.f13240v = true;
            this.f13241w = new Date().getTime();
        }
    }

    /* renamed from: f */
    private AbstractAdapter m13692f() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f13261c.size() && abstractAdapter == null; i2++) {
            if (((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.AVAILABLE || ((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.INITIATED) {
                i++;
                if (i >= this.f13260b) {
                    break;
                }
            } else if (((C5677b) this.f13261c.get(i2)).f13489a == C5677b.C5678a.NOT_INITIATED && (abstractAdapter = m13693h((C5626Y) this.f13261c.get(i2))) == null) {
                ((C5677b) this.f13261c.get(i2)).mo41803a(C5677b.C5678a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m13693h(com.ironsource.mediationsdk.C5626Y r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f13266h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r2.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r9.f13234p     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r10.f13492d     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.c r0 = com.ironsource.mediationsdk.C5685c.m13965a()     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f13491c     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f13491c     // Catch:{ all -> 0x00d7 }
            org.json.JSONObject r2 = r2.getRewardedVideoSettings()     // Catch:{ all -> 0x00d7 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo41824a(r1, r2, r4, r4)     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f13266h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r3.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r10.f13492d     // Catch:{ all -> 0x00d7 }
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x0057:
            r10.f13490b = r0     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C5677b.C5678a.INITIATED     // Catch:{ all -> 0x00d7 }
            r10.mo41803a(r2)     // Catch:{ all -> 0x00d7 }
            r9.mo41670d(r10)     // Catch:{ all -> 0x00d7 }
            r2 = 1001(0x3e9, float:1.403E-42)
            r9.m13684a((int) r2, (com.ironsource.mediationsdk.C5677b) r10, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r9.f13265g     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r9.f13264f     // Catch:{ all -> 0x00a9 }
            r10.mo41340h()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f13490b     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x00a7
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.f13246t     // Catch:{ all -> 0x00a9 }
            r5.set(r3)     // Catch:{ all -> 0x00a9 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00a9 }
            r5.<init>()     // Catch:{ all -> 0x00a9 }
            long r5 = r5.getTime()     // Catch:{ all -> 0x00a9 }
            r10.f13247u = r5     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f13490b     // Catch:{ all -> 0x00a9 }
            r5.addRewardedVideoListener(r10)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f13505q     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r10.f13492d     // Catch:{ all -> 0x00a9 }
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = ":initRewardedVideo()"
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f13490b     // Catch:{ all -> 0x00a9 }
            org.json.JSONObject r5 = r10.f13244r     // Catch:{ all -> 0x00a9 }
            r3.initRewardedVideo(r2, r4, r5, r10)     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r9)
            return r0
        L_0x00a9:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f13266h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r4.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r9.f13234p     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r10.mo41811j()     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00d7 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.INIT_FAILED     // Catch:{ all -> 0x00d7 }
            r10.mo41803a(r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x00d7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.m13693h(com.ironsource.mediationsdk.Y):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: h */
    private synchronized boolean m13694h() {
        int i;
        Iterator it = this.f13261c.iterator();
        i = 0;
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.INIT_FAILED || bVar.f13489a == C5677b.C5678a.CAPPED_PER_DAY || bVar.f13489a == C5677b.C5678a.CAPPED_PER_SESSION || bVar.f13489a == C5677b.C5678a.NOT_AVAILABLE || bVar.f13489a == C5677b.C5678a.NEEDS_RELOAD || bVar.f13489a == C5677b.C5678a.EXHAUSTED) {
                i++;
            }
        }
        return this.f13261c.size() == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m13695i() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f13261c     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C5677b) r1     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.NEEDS_RELOAD     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.INITIATED     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.INIT_PENDING     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r1 = r1.f13489a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C5677b.C5678a.LOAD_PENDING     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0007
        L_0x0037:
            r0 = 1
        L_0x0038:
            monitor-exit(r4)
            return r0
        L_0x003a:
            r0 = 0
            goto L_0x0038
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.m13695i():boolean");
    }

    /* renamed from: j */
    private synchronized boolean m13696j() {
        boolean z;
        z = false;
        Iterator it = this.f13261c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C5677b) it.next()).f13489a == C5677b.C5678a.AVAILABLE) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: k */
    private synchronized boolean m13697k() {
        if (this.f13262d == null) {
            return false;
        }
        return ((C5626Y) this.f13262d).mo41657o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m13698l() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.AbstractAdapter r0 = r9.m13692f()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r9)
            return
        L_0x0009:
            r0 = 4
            com.ironsource.mediationsdk.b$a[] r1 = new com.ironsource.mediationsdk.C5677b.C5678a[r0]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_AVAILABLE     // Catch:{ all -> 0x005a }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C5677b.C5678a.NEEDS_RELOAD     // Catch:{ all -> 0x005a }
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x005a }
            r2 = 2
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_SESSION     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            r2 = 3
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_DAY     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            java.util.concurrent.CopyOnWriteArrayList r2 = r9.f13261c     // Catch:{ all -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005a }
            r4 = 0
        L_0x0027:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b r5 = (com.ironsource.mediationsdk.C5677b) r5     // Catch:{ all -> 0x005a }
            r6 = 0
        L_0x0034:
            if (r6 >= r0) goto L_0x0027
            r7 = r1[r6]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r8 = r5.f13489a     // Catch:{ all -> 0x005a }
            if (r8 != r7) goto L_0x003e
            int r4 = r4 + 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0041:
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f13261c     // Catch:{ all -> 0x005a }
            int r0 = r0.size()     // Catch:{ all -> 0x005a }
            if (r4 >= r0) goto L_0x004e
            r9.m13699m()     // Catch:{ all -> 0x005a }
            monitor-exit(r9)
            return
        L_0x004e:
            boolean r0 = r9.m13689a((boolean) r3, (boolean) r3)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r9.m13688a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r9)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.m13698l():void");
    }

    /* renamed from: m */
    private synchronized void m13699m() {
        if (m13700n()) {
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator it = this.f13261c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C5677b bVar = (C5677b) it.next();
                if (bVar.f13489a == C5677b.C5678a.EXHAUSTED) {
                    bVar.mo41339g();
                }
                if (bVar.f13489a == C5677b.C5678a.AVAILABLE) {
                    z = true;
                }
            }
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (m13689a(z, false)) {
                this.f13231m.onRewardedVideoAvailabilityChanged(this.f13268j.booleanValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m13700n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f13261c     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C5677b) r1     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r2 = r1.f13489a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C5677b.C5678a.INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r1 = r1.f13489a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE     // Catch:{ all -> 0x002a }
            if (r1 != r2) goto L_0x0007
        L_0x0025:
            r0 = 0
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = 1
            goto L_0x0026
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.m13700n():boolean");
    }

    /* renamed from: o */
    private void m13701o() {
        for (int i = 0; i < this.f13261c.size(); i++) {
            String providerTypeForReflection = ((C5677b) this.f13261c.get(i)).f13491c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C5685c.m13965a().mo41824a(((C5677b) this.f13261c.get(i)).f13491c, ((C5677b) this.f13261c.get(i)).f13491c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    /* renamed from: p */
    private String m13702p() {
        Placement placement = this.f13237s;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: q */
    private void m13703q() {
        Iterator it = this.f13261c.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.AVAILABLE && bVar.mo41812l() != null && bVar.mo41812l().longValue() < j) {
                j = bVar.mo41812l().longValue();
            }
        }
        if (j != Long.MAX_VALUE) {
            C5807v.C5809a.f14128a.mo42139a(System.currentTimeMillis() - j);
        }
    }

    /* renamed from: a */
    public final void mo41638a(int i) {
        C5807v.C5809a.f14128a.mo42140a(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41319a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f13234p + " Should Track Network State: " + z, 0);
        try {
            this.f13267i = z;
            if (this.f13267i) {
                if (this.f13236r == null) {
                    this.f13236r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f13236r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f13236r != null) {
                context.getApplicationContext().unregisterReceiver(this.f13236r);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo41639a(C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdOpened()", 1);
        m13684a(1005, (C5677b) y, new Object[][]{new Object[]{"placement", m13702p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(y.f13249w)}});
        this.f13231m.onRewardedVideoAdOpened();
    }

    /* renamed from: a */
    public final void mo41640a(IronSourceError ironSourceError, C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f13242x = false;
        int i = y.f13249w;
        m13684a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, (C5677b) y, new Object[][]{new Object[]{"placement", m13702p()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(i)}});
        m13691b(false);
        this.f13231m.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41641a(Placement placement) {
        this.f13237s = placement;
        this.f13231m.f13838f = placement.getPlacementName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41642a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f13266h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r2.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = r9.f13234p     // Catch:{ all -> 0x01a1 }
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ":showRewardedVideo(placementName: "
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            r2.append(r10)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.j r0 = r9.f13231m     // Catch:{ all -> 0x01a1 }
            r0.f13838f = r10     // Catch:{ all -> 0x01a1 }
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "placement"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x01a1 }
            r4[r3] = r10     // Catch:{ all -> 0x01a1 }
            r1[r6] = r4     // Catch:{ all -> 0x01a1 }
            r9.m13685a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f13242x     // Catch:{ all -> 0x01a1 }
            r0 = 3
            if (r10 == 0) goto L_0x0057
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f13266h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01a1 }
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f13231m     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r10 = r9.f13267i     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x007f
            com.ironsource.environment.ContextProvider r10 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01a1 }
            android.app.Activity r10 = r10.getCurrentActiveActivity()     // Catch:{ all -> 0x01a1 }
            boolean r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x007f
            java.lang.String r10 = "showRewardedVideo error: can't show ad when there's no internet connection"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f13266h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f13231m     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoInternetConnectionShowFailError(r0)     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x007f:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ all -> 0x01a1 }
            r10.<init>()     // Catch:{ all -> 0x01a1 }
            r0 = 0
        L_0x0085:
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f13261c     // Catch:{ all -> 0x01a1 }
            int r1 = r1.size()     // Catch:{ all -> 0x01a1 }
            if (r0 >= r1) goto L_0x0173
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f13261c     // Catch:{ all -> 0x01a1 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C5677b) r1     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f13266h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = "showRewardedVideo, iterating on: "
            r7.<init>(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = r1.f13492d     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = ", Status: "
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r8 = r1.f13489a     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01a1 }
            r4.log(r5, r7, r6)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r4 = r1.f13489a     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE     // Catch:{ all -> 0x01a1 }
            if (r4 != r5) goto L_0x016f
            r4 = r1
            com.ironsource.mediationsdk.Y r4 = (com.ironsource.mediationsdk.C5626Y) r4     // Catch:{ all -> 0x01a1 }
            boolean r4 = r4.mo41657o()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0120
            r9.m13686a((com.ironsource.mediationsdk.C5677b) r1, (int) r0)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f13270l     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00d7
            com.ironsource.mediationsdk.b r10 = r9.f13263e     // Catch:{ all -> 0x01a1 }
            boolean r10 = r1.equals(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x00d7
            r9.mo41645b()     // Catch:{ all -> 0x01a1 }
        L_0x00d7:
            boolean r10 = r1.mo41806b()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_SESSION     // Catch:{ all -> 0x01a1 }
            r1.mo41803a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 1401(0x579, float:1.963E-42)
            r0 = 0
            r9.m13684a((int) r10, (com.ironsource.mediationsdk.C5677b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m13698l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x00ed:
            com.ironsource.mediationsdk.utils.e r10 = r9.f13259a     // Catch:{ all -> 0x01a1 }
            boolean r10 = r10.mo42120c((com.ironsource.mediationsdk.C5677b) r1)     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x0112
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_DAY     // Catch:{ all -> 0x01a1 }
            r1.mo41803a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "status"
            r2[r6] = r4     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "true"
            r2[r3] = r4     // Catch:{ all -> 0x01a1 }
            r0[r6] = r2     // Catch:{ all -> 0x01a1 }
            r9.m13684a((int) r10, (com.ironsource.mediationsdk.C5677b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m13698l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0112:
            boolean r10 = r1.mo41805a()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x011e
            r9.m13692f()     // Catch:{ all -> 0x01a1 }
            r9.m13699m()     // Catch:{ all -> 0x01a1 }
        L_0x011e:
            monitor-exit(r9)
            return
        L_0x0120:
            java.lang.Long r4 = r1.mo41813m()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0148
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r4.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = r1.f13492d     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.Long r5 = r1.mo41813m()     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01a1 }
            r10.append(r4)     // Catch:{ all -> 0x01a1 }
        L_0x0148:
            r4 = r1
            com.ironsource.mediationsdk.Y r4 = (com.ironsource.mediationsdk.C5626Y) r4     // Catch:{ all -> 0x01a1 }
            r9.mo41644a((boolean) r6, (com.ironsource.mediationsdk.C5626Y) r4)     // Catch:{ all -> 0x01a1 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "FailedToShowVideoException"
            r4.<init>(r5)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f13266h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r8.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.f13492d     // Catch:{ all -> 0x01a1 }
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = " Failed to show video"
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x01a1 }
            r5.logException(r7, r1, r4)     // Catch:{ all -> 0x01a1 }
        L_0x016f:
            int r0 = r0 + 1
            goto L_0x0085
        L_0x0173:
            boolean r0 = r9.m13697k()     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0186
            com.ironsource.mediationsdk.b r10 = r9.f13262d     // Catch:{ all -> 0x01a1 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f13261c     // Catch:{ all -> 0x01a1 }
            int r0 = r0.size()     // Catch:{ all -> 0x01a1 }
            r9.m13686a((com.ironsource.mediationsdk.C5677b) r10, (int) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0186:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01a1 }
            r0.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "ext1"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01a1 }
            r0.put(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f13231m     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r1)     // Catch:{ all -> 0x01a1 }
            r10.mo42056a((com.ironsource.mediationsdk.logger.IronSourceError) r1, (java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x01a1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.mo41642a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41643a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f13266h     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r9.f13234p     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ":initRewardedVideo(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r10)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r11)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00df }
            r2 = 81312(0x13da0, float:1.13942E-40)
            r9.m13690b((int) r2)     // Catch:{ all -> 0x00df }
            r9.f13265g = r10     // Catch:{ all -> 0x00df }
            r9.f13264f = r11     // Catch:{ all -> 0x00df }
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f13261c     // Catch:{ all -> 0x00df }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00df }
            r11 = 0
            r2 = 0
        L_0x0047:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x00df }
            r5 = 2
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.b r4 = (com.ironsource.mediationsdk.C5677b) r4     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.utils.e r6 = r9.f13259a     // Catch:{ all -> 0x00df }
            boolean r6 = r6.mo42119b((com.ironsource.mediationsdk.C5677b) r4)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x006f
            r6 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "status"
            r5[r11] = r8     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "false"
            r5[r3] = r8     // Catch:{ all -> 0x00df }
            r7[r11] = r5     // Catch:{ all -> 0x00df }
            r9.m13684a((int) r6, (com.ironsource.mediationsdk.C5677b) r4, (java.lang.Object[][]) r7)     // Catch:{ all -> 0x00df }
        L_0x006f:
            com.ironsource.mediationsdk.utils.e r5 = r9.f13259a     // Catch:{ all -> 0x00df }
            boolean r5 = r5.mo42120c((com.ironsource.mediationsdk.C5677b) r4)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0047
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_DAY     // Catch:{ all -> 0x00df }
            r4.mo41803a(r5)     // Catch:{ all -> 0x00df }
            int r2 = r2 + 1
            goto L_0x0047
        L_0x007f:
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f13261c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r2 != r10) goto L_0x008e
            com.ironsource.mediationsdk.sdk.j r10 = r9.f13231m     // Catch:{ all -> 0x00df }
            r10.onRewardedVideoAvailabilityChanged(r11)     // Catch:{ all -> 0x00df }
            monitor-exit(r9)
            return
        L_0x008e:
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.m13690b((int) r10)     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.sdk.j r10 = r9.f13231m     // Catch:{ all -> 0x00df }
            r2 = 0
            r10.f13838f = r2     // Catch:{ all -> 0x00df }
            r9.f13240v = r3     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            r9.f13241w = r6     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            long r6 = r6 - r0
            r10 = 81313(0x13da1, float:1.13944E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "duration"
            r1[r11] = r2     // Catch:{ all -> 0x00df }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00df }
            r1[r3] = r2     // Catch:{ all -> 0x00df }
            r0[r11] = r1     // Catch:{ all -> 0x00df }
            r9.m13685a((int) r10, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x00df }
            r9.m13701o()     // Catch:{ all -> 0x00df }
        L_0x00c8:
            int r10 = r9.f13260b     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f13261c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            com.ironsource.mediationsdk.AbstractAdapter r10 = r9.m13692f()     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00dd
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00dd:
            monitor-exit(r9)
            return
        L_0x00df:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.mo41643a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo41252a(boolean z) {
        Boolean bool;
        if (this.f13267i) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = false;
            ironSourceLoggerManager.log(ironSourceTag, "Network Availability Changed To: " + z, 0);
            if (this.f13268j != null) {
                if (z && !this.f13268j.booleanValue() && m13696j()) {
                    bool = Boolean.TRUE;
                } else if (!z && this.f13268j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f13268j = bool;
                z2 = true;
            }
            if (z2) {
                this.f13235q = !z;
                this.f13231m.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41644a(boolean r9, com.ironsource.mediationsdk.C5626Y r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r8.f13266h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r2.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = r10.f13492d     // Catch:{ all -> 0x0117 }
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ": onRewardedVideoAvailabilityChanged(available:"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            r2.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0117 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0117 }
            boolean r0 = r8.f13235q     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x002a
            monitor-exit(r8)
            return
        L_0x002a:
            r0 = 0
            if (r9 == 0) goto L_0x0058
            boolean r1 = r8.f13240v     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0058
            r8.f13240v = r0     // Catch:{ all -> 0x0117 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0117 }
            r1.<init>()     // Catch:{ all -> 0x0117 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0117 }
            long r4 = r8.f13241w     // Catch:{ all -> 0x0117 }
            long r1 = r1 - r4
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r5 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0117 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = "duration"
            r6[r0] = r7     // Catch:{ all -> 0x0117 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0117 }
            r6[r3] = r1     // Catch:{ all -> 0x0117 }
            r5[r0] = r6     // Catch:{ all -> 0x0117 }
            r8.m13685a((int) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x0117 }
            r8.m13703q()     // Catch:{ all -> 0x0117 }
        L_0x0058:
            com.ironsource.mediationsdk.b r1 = r8.f13262d     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0073
            boolean r0 = r8.m13689a((boolean) r9, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0071
            com.ironsource.mediationsdk.sdk.j r0 = r8.f13231m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f13268j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x0071:
            monitor-exit(r8)
            return
        L_0x0073:
            com.ironsource.mediationsdk.b r1 = r8.f13263e     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ba
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f13266h     // Catch:{ all -> 0x00ee }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r4.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r10.f13492d     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = " is a premium adapter, canShowPremium: "
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            boolean r5 = r8.mo41667a()     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ee }
            r1.log(r2, r4, r3)     // Catch:{ all -> 0x00ee }
            boolean r1 = r8.mo41667a()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ba
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_SESSION     // Catch:{ all -> 0x00ee }
            r10.mo41803a(r1)     // Catch:{ all -> 0x00ee }
            boolean r0 = r8.m13689a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00b8
            com.ironsource.mediationsdk.sdk.j r0 = r8.f13231m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f13268j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x00b8:
            monitor-exit(r8)
            return
        L_0x00ba:
            com.ironsource.mediationsdk.utils.e r1 = r8.f13259a     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.mo42120c((com.ironsource.mediationsdk.C5677b) r10)     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00dc
            boolean r1 = r10.mo41807c()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00dc
            boolean r0 = r8.m13689a((boolean) r3, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.sdk.j r0 = r8.f13231m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f13268j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x0115
        L_0x00dc:
            boolean r0 = r8.m13689a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            r8.m13688a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x00ee }
        L_0x00e6:
            r8.m13692f()     // Catch:{ all -> 0x00ee }
            r8.m13699m()     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r8)
            return
        L_0x00ee:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f13266h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "onRewardedVideoAvailabilityChanged(available:"
            r3.<init>(r4)     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ", provider:"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r10.mo41811j()     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ")"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0117 }
            r1.logException(r2, r9, r0)     // Catch:{ all -> 0x0117 }
        L_0x0115:
            monitor-exit(r8)
            return
        L_0x0117:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.mo41644a(boolean, com.ironsource.mediationsdk.Y):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo41645b() {
        super.mo41645b();
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.equals(this.f13263e)) {
                bVar.mo41803a(C5677b.C5678a.CAPPED_PER_SESSION);
                m13692f();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo41646b(C5626Y y) {
        String str;
        this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, y.f13492d + ":onRewardedVideoAdClosed()", 1);
        this.f13242x = false;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = this.f13261c.iterator();
            while (it.hasNext()) {
                C5677b bVar = (C5677b) it.next();
                if (((C5626Y) bVar).mo41657o()) {
                    sb.append(bVar.f13492d + ";");
                }
            }
        } catch (Throwable unused) {
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3][];
        objArr[0] = new Object[]{"placement", m13702p()};
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[1] = objArr2;
        objArr[2] = new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(y.f13249w)};
        m13684a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (C5677b) y, objArr);
        C5804m.m14360a().mo42134a(1);
        if (!y.mo41806b() && !this.f13259a.mo42120c((C5677b) y)) {
            m13684a(1001, (C5677b) y, (Object[][]) null);
        }
        m13691b(false);
        this.f13231m.onRewardedVideoAdClosed();
        m13703q();
        Iterator it2 = this.f13261c.iterator();
        while (it2.hasNext()) {
            C5677b bVar2 = (C5677b) it2.next();
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Fetch on ad closed, iterating on: " + bVar2.f13492d + ", Status: " + bVar2.f13489a, 0);
            if (bVar2.f13489a == C5677b.C5678a.NOT_AVAILABLE || bVar2.f13489a == C5677b.C5678a.NEEDS_RELOAD) {
                try {
                    if (!bVar2.f13492d.equals(y.f13492d)) {
                        this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, bVar2.f13492d + ":reload smash", 1);
                        ((C5626Y) bVar2).mo41656n();
                        m13684a(1001, bVar2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.f13266h.log(IronSourceLogger.IronSourceTag.NATIVE, bVar2.f13492d + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo41647c(C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdStarted()", 1);
        m13684a((int) IronSourceConstants.RV_INSTANCE_STARTED, (C5677b) y, new Object[][]{new Object[]{"placement", m13702p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(y.f13249w)}});
        this.f13231m.onRewardedVideoAdStarted();
    }

    /* renamed from: c */
    public final synchronized boolean mo41648c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f13234p + ":isRewardedVideoAvailable()", 1);
        if (this.f13267i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.mo41807c() && ((C5626Y) bVar).mo41657o()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41649d() {
        if (this.f13233o <= 0) {
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f13238t;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f13238t = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                cancel();
                C5624X.this.mo41651e();
                C5624X.this.mo41649d();
            }
        }, (long) (this.f13233o * 1000));
    }

    /* renamed from: d */
    public final void mo41650d(C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdEnded()", 1);
        m13684a((int) IronSourceConstants.RV_INSTANCE_ENDED, (C5677b) y, new Object[][]{new Object[]{"placement", m13702p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(y.f13249w)}});
        this.f13231m.onRewardedVideoAdEnded();
    }

    /* renamed from: d_ */
    public final void mo41415d_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.f13268j == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            m13685a((int) IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (m13689a(false, true)) {
            m13688a(C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        m13691b(true);
        Iterator it = this.f13261c.iterator();
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.AVAILABLE || bVar.f13489a == C5677b.C5678a.NOT_AVAILABLE) {
                bVar.mo41803a(C5677b.C5678a.NEEDS_RELOAD);
            }
        }
        Iterator it2 = this.f13261c.iterator();
        while (it2.hasNext()) {
            C5677b bVar2 = (C5677b) it2.next();
            if (bVar2.f13489a == C5677b.C5678a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(bVar2.f13492d + ":reload smash");
                    m13684a(1001, bVar2, (Object[][]) null);
                    ((C5626Y) bVar2).mo41656n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(bVar2.f13492d + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo41651e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0092 }
            android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ all -> 0x0092 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            java.lang.Boolean r0 = r8.f13268j     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0015
            goto L_0x0090
        L_0x0015:
            java.lang.Boolean r0 = r8.f13268j     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x008e
            r0 = 102(0x66, float:1.43E-43)
            r1 = 0
            r8.m13685a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.m13685a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1
            r8.f13240v = r0     // Catch:{ all -> 0x0092 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f13261c     // Catch:{ all -> 0x0092 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0031:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b r3 = (com.ironsource.mediationsdk.C5677b) r3     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r4 = r3.f13489a     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_AVAILABLE     // Catch:{ all -> 0x0092 }
            if (r4 != r5) goto L_0x0031
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r8.f13266h     // Catch:{ all -> 0x006b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "Fetch from timer: "
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r3.f13492d     // Catch:{ all -> 0x006b }
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = ":reload smash"
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006b }
            r4.log(r5, r6, r0)     // Catch:{ all -> 0x006b }
            r4 = 1001(0x3e9, float:1.403E-42)
            r8.m13684a((int) r4, (com.ironsource.mediationsdk.C5677b) r3, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x006b }
            r4 = r3
            com.ironsource.mediationsdk.Y r4 = (com.ironsource.mediationsdk.C5626Y) r4     // Catch:{ all -> 0x006b }
            r4.mo41656n()     // Catch:{ all -> 0x006b }
            goto L_0x0031
        L_0x006b:
            r4 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f13266h     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r3.f13492d     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = " Failed to call fetchVideo(), "
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r4.getLocalizedMessage()     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0092 }
            r5.log(r6, r3, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0031
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            monitor-exit(r8)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5624X.mo41651e():void");
    }

    /* renamed from: e */
    public final void mo41652e(C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdRewarded()", 1);
        if (this.f13237s == null) {
            this.f13237s = C5556E.m13257a().f12853i.f14083c.f13744a.mo41989a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C5677b) y);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, y.f13249w);
            if (this.f13237s != null) {
                providerAdditionalData.put("placement", m13702p());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f13237s.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f13237s.getRewardAmount());
            } else {
                this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C5641c cVar = new C5641c(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f13265g)) {
            cVar.mo41708a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(Long.toString(cVar.mo41709b()) + this.f13265g + y.mo41811j()));
            if (!TextUtils.isEmpty(C5556E.m13257a().f12857m)) {
                cVar.mo41708a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, (Object) C5556E.m13257a().f12857m);
            }
            Map<String, String> map = C5556E.m13257a().f12858n;
            if (map != null) {
                for (String next : map.keySet()) {
                    cVar.mo41708a(ContentMetadata.KEY_CUSTOM_PREFIX + next, (Object) map.get(next));
                }
            }
        }
        C5645g.m13810e().mo41689b(cVar);
        Placement placement = this.f13237s;
        if (placement != null) {
            this.f13231m.onRewardedVideoAdRewarded(placement);
        } else {
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    /* renamed from: f */
    public final void mo41653f(C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdClicked()", 1);
        if (this.f13237s == null) {
            this.f13237s = C5556E.m13257a().f12853i.f14083c.f13744a.mo41989a();
        }
        if (this.f13237s == null) {
            this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            return;
        }
        m13684a(1006, (C5677b) y, new Object[][]{new Object[]{"placement", m13702p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(y.f13249w)}});
        this.f13231m.onRewardedVideoAdClicked(this.f13237s);
    }

    /* renamed from: g */
    public final void mo41338g() {
        Iterator it = this.f13261c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C5677b bVar = (C5677b) it.next();
            if (bVar.f13489a == C5677b.C5678a.CAPPED_PER_DAY) {
                m13684a((int) IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo41803a(C5677b.C5678a.NOT_AVAILABLE);
                if (((C5626Y) bVar).mo41657o() && bVar.mo41807c()) {
                    bVar.mo41803a(C5677b.C5678a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && m13689a(true, false)) {
            this.f13231m.onRewardedVideoAvailabilityChanged(true);
        }
    }

    /* renamed from: g */
    public final void mo41654g(C5626Y y) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, y.f13492d + ":onRewardedVideoAdVisible()", 1);
        if (this.f13237s != null) {
            m13684a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (C5677b) y, new Object[][]{new Object[]{"placement", m13702p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(y.f13249w)}});
            return;
        }
        this.f13266h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
    }
}
