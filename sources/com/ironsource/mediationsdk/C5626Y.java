package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.sdk.C5779m;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.Y */
public final class C5626Y extends C5677b implements RewardedVideoSmashListener {

    /* renamed from: r */
    JSONObject f13244r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C5779m f13245s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public AtomicBoolean f13246t;
    /* access modifiers changed from: package-private */

    /* renamed from: u */
    public long f13247u;

    /* renamed from: v */
    String f13248v;

    /* renamed from: w */
    public int f13249w;

    /* renamed from: x */
    private int f13250x;

    /* renamed from: y */
    private final String f13251y = IronSourceConstants.REQUEST_URL;

    C5626Y(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.f13244r = rewardedVideoSettings;
        this.f13499k = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.f13500l = this.f13244r.optInt("maxAdsPerSession", 99);
        this.f13501m = this.f13244r.optInt("maxAdsPerDay", 99);
        this.f13248v = this.f13244r.optString(IronSourceConstants.REQUEST_URL);
        this.f13246t = new AtomicBoolean(false);
        this.f13250x = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13726a(int i, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C5677b) this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f13505q.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, providerAdditionalData));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo41339g() {
        this.f13496h = 0;
        mo41803a(mo41657o() ? C5677b.C5678a.AVAILABLE : C5677b.C5678a.NOT_AVAILABLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo41340h() {
        try {
            mo41809e();
            this.f13497i = new Timer();
            this.f13497i.schedule(new TimerTask() {
                public final void run() {
                    synchronized (C5626Y.this) {
                        cancel();
                        if (C5626Y.this.f13245s != null) {
                            String str = "Timeout for " + C5626Y.this.f13492d;
                            C5626Y.this.f13505q.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                            C5626Y.this.mo41803a(C5677b.C5678a.NOT_AVAILABLE);
                            long time = new Date().getTime() - C5626Y.this.f13247u;
                            if (C5626Y.this.f13246t.compareAndSet(true, false)) {
                                C5626Y.this.m13726a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(time)}});
                                C5626Y.this.m13726a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(time)}});
                            } else {
                                C5626Y.this.m13726a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(time)}});
                            }
                            C5626Y.this.f13245s.mo41644a(false, C5626Y.this);
                        }
                    }
                }
            }, (long) (this.f13250x * 1000));
        } catch (Exception e) {
            mo41804a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo41341i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo41342k() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    /* renamed from: n */
    public final void mo41656n() {
        this.f13504p = null;
        if (this.f13490b != null) {
            if (!(this.f13489a == C5677b.C5678a.CAPPED_PER_DAY || this.f13489a == C5677b.C5678a.CAPPED_PER_SESSION)) {
                this.f13246t.set(true);
                this.f13247u = new Date().getTime();
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f13505q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f13492d + ":fetchRewardedVideoForAutomaticLoad()", 1);
            this.f13490b.fetchRewardedVideoForAutomaticLoad(this.f13244r, this);
        }
    }

    /* renamed from: o */
    public final boolean mo41657o() {
        if (this.f13490b == null) {
            return false;
        }
        IronSourceLoggerManager ironSourceLoggerManager = this.f13505q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f13492d + ":isRewardedVideoAvailable()", 1);
        return this.f13490b.isRewardedVideoAvailable(this.f13244r);
    }

    public final void onRewardedVideoAdClicked() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41653f(this);
        }
    }

    public final void onRewardedVideoAdClosed() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41646b(this);
        }
        mo41656n();
    }

    public final void onRewardedVideoAdEnded() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41650d(this);
        }
    }

    public final void onRewardedVideoAdOpened() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41639a(this);
        }
    }

    public final void onRewardedVideoAdRewarded() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41652e(this);
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41640a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41647c(this);
        }
    }

    public final void onRewardedVideoAdVisible() {
        C5779m mVar = this.f13245s;
        if (mVar != null) {
            mVar.mo41654g(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo41809e()     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f13246t     // Catch:{ all -> 0x00b4 }
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0036
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00b4 }
            r0.<init>()     // Catch:{ all -> 0x00b4 }
            long r3 = r0.getTime()     // Catch:{ all -> 0x00b4 }
            long r5 = r8.f13247u     // Catch:{ all -> 0x00b4 }
            long r3 = r3 - r5
            if (r9 == 0) goto L_0x001f
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0021
        L_0x001f:
            r0 = 1200(0x4b0, float:1.682E-42)
        L_0x0021:
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x00b4 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = "duration"
            r6[r1] = r7     // Catch:{ all -> 0x00b4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b4 }
            r6[r2] = r3     // Catch:{ all -> 0x00b4 }
            r5[r1] = r6     // Catch:{ all -> 0x00b4 }
            r8.m13726a(r0, r5)     // Catch:{ all -> 0x00b4 }
            goto L_0x0041
        L_0x0036:
            if (r9 == 0) goto L_0x003b
            r0 = 1207(0x4b7, float:1.691E-42)
            goto L_0x003d
        L_0x003b:
            r0 = 1208(0x4b8, float:1.693E-42)
        L_0x003d:
            r1 = 0
            r8.m13726a(r0, r1)     // Catch:{ all -> 0x00b4 }
        L_0x0041:
            boolean r0 = r8.mo41807c()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x009a
            if (r9 == 0) goto L_0x004f
            com.ironsource.mediationsdk.b$a r0 = r8.f13489a     // Catch:{ all -> 0x00b4 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE     // Catch:{ all -> 0x00b4 }
            if (r0 != r1) goto L_0x0057
        L_0x004f:
            if (r9 != 0) goto L_0x0078
            com.ironsource.mediationsdk.b$a r0 = r8.f13489a     // Catch:{ all -> 0x00b4 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_AVAILABLE     // Catch:{ all -> 0x00b4 }
            if (r0 == r1) goto L_0x0078
        L_0x0057:
            if (r9 == 0) goto L_0x005c
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.AVAILABLE     // Catch:{ all -> 0x00b4 }
            goto L_0x005e
        L_0x005c:
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.NOT_AVAILABLE     // Catch:{ all -> 0x00b4 }
        L_0x005e:
            r8.mo41803a(r0)     // Catch:{ all -> 0x00b4 }
            if (r9 == 0) goto L_0x006d
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b4 }
            r8.f13503o = r0     // Catch:{ all -> 0x00b4 }
        L_0x006d:
            com.ironsource.mediationsdk.sdk.m r0 = r8.f13245s     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b2
            com.ironsource.mediationsdk.sdk.m r0 = r8.f13245s     // Catch:{ all -> 0x00b4 }
            r0.mo41644a((boolean) r9, (com.ironsource.mediationsdk.C5626Y) r8)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)
            return
        L_0x0078:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r8.f13492d     // Catch:{ all -> 0x00b4 }
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = ": state remains "
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = " in smash, mediation remains unchanged"
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00b4 }
            r0.info(r9)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)
            return
        L_0x009a:
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r0.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = r8.f13492d     // Catch:{ all -> 0x00b4 }
            r0.append(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = ": is capped or exhausted"
            r0.append(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b4 }
            r9.info(r0)     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r8)
            return
        L_0x00b4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5626Y.onRewardedVideoAvailabilityChanged(boolean):void");
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long time = new Date().getTime() - this.f13247u;
        if (ironSourceError.getErrorCode() == 1058) {
            m13726a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(time)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f13504p = Long.valueOf(System.currentTimeMillis());
        }
        m13726a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(time)}});
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
