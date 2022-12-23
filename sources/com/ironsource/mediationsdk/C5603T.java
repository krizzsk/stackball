package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.T */
public final class C5603T extends C5606U implements RewardedVideoSmashListener {

    /* renamed from: A */
    private String f13161A;

    /* renamed from: B */
    private String f13162B;

    /* renamed from: C */
    private final Object f13163C = new Object();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Object f13164D = new Object();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C5605a f13165a = C5605a.NO_INIT;

    /* renamed from: b */
    boolean f13166b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5602S f13167j;

    /* renamed from: k */
    private Timer f13168k;

    /* renamed from: l */
    private int f13169l;

    /* renamed from: m */
    private String f13170m;

    /* renamed from: n */
    private String f13171n;

    /* renamed from: o */
    private String f13172o;

    /* renamed from: p */
    private boolean f13173p;

    /* renamed from: q */
    private boolean f13174q;

    /* renamed from: r */
    private Placement f13175r;

    /* renamed from: s */
    private long f13176s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f13177t;

    /* renamed from: u */
    private JSONObject f13178u;

    /* renamed from: v */
    private String f13179v;

    /* renamed from: w */
    private int f13180w;

    /* renamed from: x */
    private String f13181x;

    /* renamed from: y */
    private int f13182y;

    /* renamed from: z */
    private int f13183z;

    /* renamed from: com.ironsource.mediationsdk.T$a */
    public enum C5605a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C5603T(String str, String str2, NetworkSettings networkSettings, C5602S s, int i, AbstractAdapter abstractAdapter) {
        super(new C5717a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f13170m = str;
        this.f13171n = str2;
        this.f13167j = s;
        this.f13168k = null;
        this.f13169l = i;
        this.f13192c.addRewardedVideoListener(this);
        this.f13173p = false;
        this.f13174q = false;
        this.f13166b = false;
        this.f13175r = null;
        this.f13177t = "";
        this.f13178u = null;
        this.f13197h = 1;
        m13640g();
    }

    /* renamed from: a */
    private void m13627a(int i) {
        m13628a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m13628a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo41609n();
        if (!TextUtils.isEmpty(this.f13177t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13177t);
        }
        JSONObject jSONObject = this.f13178u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13178u);
        }
        if (z && (placement = this.f13175r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.f13175r.getPlacementName());
        }
        if (m13635b(i)) {
            C5645g.m13810e();
            C5645g.m13758a(n, this.f13180w, this.f13181x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13197h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo41606k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, new JSONObject(n)));
        if (i == 1203) {
            C5804m.m14360a().mo42134a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13629a(C5605a aVar) {
        m13632a("current state=" + this.f13165a + ", new state=" + aVar);
        synchronized (this.f13164D) {
            this.f13165a = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13632a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo41606k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m13633a(String str, String str2, int i, String str3, int i2, String str4) {
        this.f13179v = str2;
        this.f13172o = str;
        this.f13182y = i;
        this.f13162B = str3;
        this.f13183z = i2;
        this.f13161A = str4;
    }

    /* renamed from: b */
    private static boolean m13635b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* renamed from: c */
    private void m13637c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo41606k() + " : " + str, 3);
    }

    /* renamed from: g */
    private void m13640g() {
        this.f13179v = "";
        this.f13182y = -1;
        this.f13162B = "";
        this.f13172o = "";
        this.f13183z = this.f13197h;
        this.f13161A = "";
    }

    /* renamed from: q */
    private boolean m13641q() {
        return this.f13192c.isRewardedVideoAvailable(this.f13195f);
    }

    /* renamed from: r */
    private void m13642r() {
        try {
            String str = C5556E.m13257a().f12856l;
            if (!TextUtils.isEmpty(str)) {
                this.f13192c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f13192c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m13632a("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: s */
    private void m13643s() {
        synchronized (this.f13163C) {
            if (this.f13168k != null) {
                this.f13168k.cancel();
                this.f13168k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public long m13644t() {
        return new Date().getTime() - this.f13176s;
    }

    /* renamed from: a */
    public final Map<String, Object> mo41420a() {
        try {
            if (mo41603h()) {
                return this.f13192c.getRewardedVideoBiddingData(this.f13195f);
            }
            return null;
        } catch (Throwable th) {
            m13637c("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo41593a(int i, Object[][] objArr) {
        m13628a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo41594a(Placement placement, int i) {
        m13643s();
        m13632a("showVideo()");
        this.f13175r = placement;
        this.f13197h = i;
        m13629a(C5605a.SHOW_IN_PROGRESS);
        mo41593a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f13192c.showRewardedVideo(this.f13195f, this);
        } catch (Throwable th) {
            m13637c("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo41595a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        C5605a aVar;
        m13632a("loadVideo() auctionId: " + str2 + " state: " + this.f13165a);
        this.f13198i = null;
        this.f13194e = false;
        this.f13166b = true;
        synchronized (this.f13164D) {
            aVar = this.f13165a;
            if (!(this.f13165a == C5605a.LOAD_IN_PROGRESS || this.f13165a == C5605a.SHOW_IN_PROGRESS)) {
                m13629a(C5605a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C5605a.LOAD_IN_PROGRESS) {
            mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.f13174q = true;
            m13633a(str, str2, i, str3, i2, str4);
            this.f13167j.mo41585b(this, str2);
        } else if (aVar == C5605a.SHOW_IN_PROGRESS) {
            mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.f13173p = true;
            m13633a(str, str2, i, str3, i2, str4);
        } else {
            this.f13196g = str4;
            this.f13177t = str2;
            this.f13178u = jSONObject;
            this.f13180w = i;
            this.f13181x = str3;
            this.f13197h = i2;
            synchronized (this.f13163C) {
                m13643s();
                Timer timer = new Timer();
                this.f13168k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str;
                        int i2;
                        String str2 = "Rewarded Video - load instance time out";
                        synchronized (C5603T.this.f13164D) {
                            if (C5603T.this.f13165a != C5605a.LOAD_IN_PROGRESS) {
                                if (C5603T.this.f13165a != C5605a.INIT_IN_PROGRESS) {
                                    i = 0;
                                    z = false;
                                }
                            }
                            if (C5603T.this.f13165a == C5605a.LOAD_IN_PROGRESS) {
                                str = str2;
                                i2 = 1025;
                            } else {
                                i2 = 1032;
                                str = "Rewarded Video - init instance time out";
                            }
                            C5603T.this.m13629a(C5605a.NOT_LOADED);
                            z = true;
                            String str3 = str;
                            i = i2;
                            str2 = str3;
                        }
                        C5603T.this.m13632a(str2);
                        if (z) {
                            C5603T.this.mo41598b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C5603T.this.m13644t())}});
                            C5603T.this.mo41598b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(C5603T.this.m13644t())}});
                            C5602S e = C5603T.this.f13167j;
                            C5603T t = C5603T.this;
                            e.mo41585b(t, t.f13177t);
                            return;
                        }
                        C5603T.this.mo41598b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(C5603T.this.m13644t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C5603T.this.f13165a.name()}});
                    }
                }, (long) (this.f13169l * 1000));
            }
            this.f13176s = new Date().getTime();
            m13627a(1001);
            try {
                if (mo41603h()) {
                    this.f13192c.loadRewardedVideoForBidding(this.f13195f, this, str);
                } else if (aVar == C5605a.NO_INIT) {
                    m13642r();
                    this.f13192c.initRewardedVideo(this.f13170m, this.f13171n, this.f13195f, this);
                } else {
                    this.f13192c.fetchRewardedVideoForAutomaticLoad(this.f13195f, this);
                }
            } catch (Throwable th) {
                m13637c("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo41596a(boolean z, int i) {
        this.f13197h = i;
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m13628a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo41597b() {
        m13632a("initForBidding()");
        m13629a(C5605a.INIT_IN_PROGRESS);
        m13642r();
        try {
            this.f13192c.initRewardedVideoForBidding(this.f13170m, this.f13171n, this.f13195f, this);
        } catch (Throwable th) {
            m13637c("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo41598b(int i, Object[][] objArr) {
        m13628a(i, objArr, false);
    }

    /* renamed from: c */
    public final boolean mo41599c() {
        try {
            return mo41603h() ? this.f13166b && this.f13165a == C5605a.LOADED && m13641q() : m13641q();
        } catch (Throwable th) {
            m13637c("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: f */
    public final void mo41600f() {
        this.f13192c.setMediationState(C5677b.C5678a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m13628a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    public final void onRewardedVideoAdClicked() {
        m13632a("onRewardedVideoAdClicked");
        this.f13167j.mo41584b(this, this.f13175r);
        mo41593a(1006, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r12.f13167j.mo41583b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r12.f13173p == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        m13632a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
        r12.f13173p = false;
        mo41595a(r12.f13172o, r12.f13179v, r12.f13178u, r12.f13182y, r12.f13162B, r12.f13183z, r12.f13161A);
        m13640g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRewardedVideoAdClosed() {
        /*
            r12 = this;
            java.lang.String r0 = "onRewardedVideoAdClosed"
            r12.m13632a((java.lang.String) r0)
            java.lang.Object r0 = r12.f13164D
            monitor-enter(r0)
            com.ironsource.mediationsdk.T$a r1 = r12.f13165a     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.T$a r2 = com.ironsource.mediationsdk.C5603T.C5605a.SHOW_IN_PROGRESS     // Catch:{ all -> 0x0077 }
            r3 = 0
            if (r1 == r2) goto L_0x004b
            r1 = 1203(0x4b3, float:1.686E-42)
            r2 = 0
            r12.mo41593a((int) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0077 }
            r1 = 81316(0x13da4, float:1.13948E-40)
            r2 = 2
            java.lang.Object[][] r4 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0077 }
            r6 = 5009(0x1391, float:7.019E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0077 }
            r4[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "reason"
            r2[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "adClosed: "
            r3.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.T$a r5 = r12.f13165a     // Catch:{ all -> 0x0077 }
            r3.append(r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0077 }
            r2[r7] = r3     // Catch:{ all -> 0x0077 }
            r4[r7] = r2     // Catch:{ all -> 0x0077 }
            r12.mo41598b(r1, r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x004b:
            com.ironsource.mediationsdk.T$a r1 = com.ironsource.mediationsdk.C5603T.C5605a.NOT_LOADED     // Catch:{ all -> 0x0077 }
            r12.m13629a((com.ironsource.mediationsdk.C5603T.C5605a) r1)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.S r0 = r12.f13167j
            r0.mo41583b(r12)
            boolean r0 = r12.f13173p
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding"
            r12.m13632a((java.lang.String) r0)
            r12.f13173p = r3
            java.lang.String r5 = r12.f13172o
            java.lang.String r6 = r12.f13179v
            org.json.JSONObject r7 = r12.f13178u
            int r8 = r12.f13182y
            java.lang.String r9 = r12.f13162B
            int r10 = r12.f13183z
            java.lang.String r11 = r12.f13161A
            r4 = r12
            r4.mo41595a(r5, r6, r7, r8, r9, r10, r11)
            r12.m13640g()
        L_0x0076:
            return
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5603T.onRewardedVideoAdClosed():void");
    }

    public final void onRewardedVideoAdEnded() {
        m13632a("onRewardedVideoAdEnded");
        this.f13167j.mo41588d(this);
        mo41593a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m13632a("onRewardedVideoAdOpened");
        this.f13167j.mo41578a(this);
        mo41593a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m13632a("onRewardedVideoAdRewarded");
        this.f13167j.mo41579a(this, this.f13175r);
        Map<String, Object> n = mo41609n();
        Placement placement = this.f13175r;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f13175r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f13175r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C5556E.m13257a().f12857m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C5556E.m13257a().f12857m);
        }
        if (C5556E.m13257a().f12858n != null) {
            for (String next : C5556E.m13257a().f12858n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C5556E.m13257a().f12858n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f13177t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13177t);
        }
        JSONObject jSONObject = this.f13178u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13178u);
        }
        if (m13635b(1010)) {
            C5645g.m13810e();
            C5645g.m13758a(n, this.f13180w, this.f13181x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13197h));
        C5641c cVar = new C5641c(1010, new JSONObject(n));
        cVar.mo41708a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(Long.toString(cVar.mo41709b()) + this.f13170m + mo41606k()));
        C5645g.m13810e().mo41689b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m13632a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo41593a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f13164D) {
            if (this.f13165a != C5605a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f13165a}});
                return;
            }
            m13629a(C5605a.NOT_LOADED);
            this.f13167j.mo41581a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m13632a("onRewardedVideoAdStarted");
        this.f13167j.mo41586c(this);
        mo41593a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m13632a("onRewardedVideoAdVisible");
        mo41593a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m13632a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f13165a.name());
        synchronized (this.f13164D) {
            if (this.f13165a == C5605a.LOAD_IN_PROGRESS) {
                m13629a(z ? C5605a.LOADED : C5605a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m13643s();
            mo41598b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(m13644t())}});
            if (this.f13174q) {
                this.f13174q = false;
                m13632a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
                mo41595a(this.f13172o, this.f13179v, this.f13178u, this.f13182y, this.f13162B, this.f13183z, this.f13161A);
                m13640g();
            } else if (z) {
                this.f13167j.mo41580a(this, this.f13177t);
            } else {
                this.f13167j.mo41585b(this, this.f13177t);
            }
        } else if (z) {
            mo41598b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f13165a.name()}});
        } else {
            mo41598b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{"duration", Long.valueOf(m13644t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f13165a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m13632a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m13643s();
        mo41598b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{"duration", Long.valueOf(m13644t())}});
        mo41598b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m13644t())}});
        synchronized (this.f13164D) {
            if (this.f13165a != C5605a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f13165a}});
                return;
            }
            m13629a(C5605a.NO_INIT);
            this.f13167j.mo41585b(this, this.f13177t);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m13632a("onRewardedVideoInitSuccess");
        synchronized (this.f13164D) {
            if (this.f13165a != C5605a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo41598b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f13165a}});
                return;
            }
            m13629a(C5605a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m13628a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m13644t())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f13198i = Long.valueOf(System.currentTimeMillis());
        }
        m13628a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m13644t())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
