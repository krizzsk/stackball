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

/* renamed from: com.ironsource.mediationsdk.G */
public final class C5564G extends C5606U implements RewardedVideoSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C5566a f12907a;

    /* renamed from: b */
    String f12908b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5567H f12909j;

    /* renamed from: k */
    private Timer f12910k;

    /* renamed from: l */
    private int f12911l;

    /* renamed from: m */
    private String f12912m;

    /* renamed from: n */
    private String f12913n;

    /* renamed from: o */
    private Placement f12914o;

    /* renamed from: p */
    private long f12915p;

    /* renamed from: q */
    private JSONObject f12916q;

    /* renamed from: r */
    private int f12917r;

    /* renamed from: s */
    private String f12918s;

    /* renamed from: t */
    private final Object f12919t;

    /* renamed from: u */
    private final Object f12920u;

    /* renamed from: v */
    private long f12921v;

    /* renamed from: com.ironsource.mediationsdk.G$a */
    public enum C5566a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5564G(com.ironsource.mediationsdk.C5564G r10, com.ironsource.mediationsdk.C5567H r11, com.ironsource.mediationsdk.AbstractAdapter r12, int r13, java.lang.String r14, org.json.JSONObject r15, int r16, java.lang.String r17) {
        /*
            r9 = this;
            r8 = r9
            r0 = r10
            java.lang.String r1 = r0.f12912m
            java.lang.String r2 = r0.f12913n
            com.ironsource.mediationsdk.model.a r3 = r0.f13193d
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.f13706a
            int r5 = r0.f12911l
            r0 = r9
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r8.f12908b = r0
            r0 = r15
            r8.f12916q = r0
            r0 = r16
            r8.f12917r = r0
            r0 = r17
            r8.f12918s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5564G.<init>(com.ironsource.mediationsdk.G, com.ironsource.mediationsdk.H, com.ironsource.mediationsdk.AbstractAdapter, int, java.lang.String, org.json.JSONObject, int, java.lang.String):void");
    }

    public C5564G(String str, String str2, NetworkSettings networkSettings, C5567H h, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C5717a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f12919t = new Object();
        this.f12920u = new Object();
        this.f12912m = str;
        this.f12913n = str2;
        this.f12909j = h;
        this.f12910k = null;
        this.f12911l = i;
        this.f13192c.updateRewardedVideoListener(this);
        this.f13197h = i2;
        this.f12907a = C5566a.NO_INIT;
        this.f12921v = 0;
        if (this.f13193d.f13708c) {
            m13386c("initForBidding()");
            m13380a(C5566a.INIT_IN_PROGRESS);
            m13389g();
            try {
                this.f13192c.initRewardedVideoForBidding(this.f12912m, this.f12913n, this.f13195f, this);
            } catch (Throwable th) {
                m13387d("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    /* renamed from: a */
    private void m13378a(int i) {
        m13379a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m13379a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo41609n();
        if (!TextUtils.isEmpty(this.f12908b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f12908b);
        }
        JSONObject jSONObject = this.f12916q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f12916q);
        }
        if (z && (placement = this.f12914o) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.f12914o.getPlacementName());
        }
        if (m13384b(i)) {
            C5645g.m13810e();
            C5645g.m13758a(n, this.f12917r, this.f12918s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13197h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo41606k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, new JSONObject(n)));
        if (i == 1203) {
            C5804m.m14360a().mo42134a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13380a(C5566a aVar) {
        m13386c("current state=" + this.f12907a + ", new state=" + aVar);
        synchronized (this.f12919t) {
            this.f12907a = aVar;
        }
    }

    /* renamed from: b */
    private static boolean m13384b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13386c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo41606k() + " " + hashCode() + "  : " + str, 0);
    }

    /* renamed from: d */
    private void m13387d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo41606k() + " " + hashCode() + " : " + str, 3);
    }

    /* renamed from: f */
    private boolean m13388f() {
        return this.f13192c.isRewardedVideoAvailable(this.f13195f);
    }

    /* renamed from: g */
    private void m13389g() {
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
            m13386c("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: q */
    private void m13390q() {
        synchronized (this.f12920u) {
            if (this.f12910k != null) {
                this.f12910k.cancel();
                this.f12910k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public long m13391r() {
        return new Date().getTime() - this.f12915p;
    }

    /* renamed from: a */
    public final Map<String, Object> mo41420a() {
        try {
            if (mo41603h()) {
                return this.f13192c.getRewardedVideoBiddingData(this.f13195f);
            }
            return null;
        } catch (Throwable th) {
            m13387d("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo41421a(int i, Object[][] objArr) {
        m13379a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo41422a(Placement placement) {
        m13390q();
        m13386c("showVideo()");
        this.f12914o = placement;
        m13380a(C5566a.SHOW_IN_PROGRESS);
        mo41421a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f13192c.showRewardedVideo(this.f13195f, this);
        } catch (Throwable th) {
            m13387d("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo41423a(String str) {
        C5566a aVar;
        m13386c("loadVideo() auctionId: " + this.f12908b + " state: " + this.f12907a);
        this.f13198i = null;
        this.f13194e = false;
        synchronized (this.f12919t) {
            aVar = this.f12907a;
            if (!(this.f12907a == C5566a.LOAD_IN_PROGRESS || this.f12907a == C5566a.SHOW_IN_PROGRESS)) {
                m13380a(C5566a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C5566a.LOAD_IN_PROGRESS) {
            mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == C5566a.SHOW_IN_PROGRESS) {
            mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.f12920u) {
                Timer timer = new Timer();
                this.f12910k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str = "Rewarded Video - load instance time out";
                        if (C5564G.this.f12907a == C5566a.LOAD_IN_PROGRESS || C5564G.this.f12907a == C5566a.INIT_IN_PROGRESS) {
                            if (C5564G.this.f12907a == C5566a.LOAD_IN_PROGRESS) {
                                i = 1025;
                            } else {
                                i = 1032;
                                str = "Rewarded Video - init instance time out";
                            }
                            C5564G.this.m13380a(C5566a.NOT_LOADED);
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        C5564G.this.m13386c(str);
                        if (z) {
                            C5564G.this.mo41425b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(C5564G.this.m13391r())}});
                            C5564G.this.mo41425b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(C5564G.this.m13391r())}});
                            C5564G.this.f12909j.mo41409b(C5564G.this);
                            return;
                        }
                        C5564G.this.mo41425b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(C5564G.this.m13391r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C5564G.this.f12907a.name()}});
                    }
                }, (long) (this.f12911l * 1000));
            }
            this.f12915p = new Date().getTime();
            m13378a(1001);
            try {
                if (mo41603h()) {
                    this.f13192c.loadRewardedVideoForBidding(this.f13195f, this, str);
                    return;
                }
                m13389g();
                this.f13192c.initRewardedVideo(this.f12912m, this.f12913n, this.f13195f, this);
            } catch (Throwable th) {
                m13387d("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo41424a(boolean z) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m13379a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo41425b(int i, Object[][] objArr) {
        m13379a(i, objArr, false);
    }

    /* renamed from: b */
    public final boolean mo41426b() {
        try {
            return mo41603h() ? this.f12907a == C5566a.LOADED && m13388f() : m13388f();
        } catch (Throwable th) {
            m13387d("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: c */
    public final LoadWhileShowSupportState mo41427c() {
        return this.f13192c.getLoadWhileShowSupportState(this.f13195f);
    }

    /* renamed from: c_ */
    public final void mo41428c_() {
        this.f13192c.setMediationState(C5677b.C5678a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m13379a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    /* renamed from: e */
    public final int mo41429e() {
        return 2;
    }

    public final void onRewardedVideoAdClicked() {
        m13386c("onRewardedVideoAdClicked");
        this.f12909j.mo41410b(this, this.f12914o);
        mo41421a(1006, (Object[][]) null);
    }

    public final void onRewardedVideoAdClosed() {
        m13386c("onRewardedVideoAdClosed");
        synchronized (this.f12919t) {
            if (this.f12907a != C5566a.SHOW_IN_PROGRESS) {
                mo41421a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)};
                mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f12907a}});
                return;
            }
            m13380a(C5566a.ENDED);
            this.f12921v = new Date().getTime();
            this.f12909j.mo41414d(this);
        }
    }

    public final void onRewardedVideoAdEnded() {
        m13386c("onRewardedVideoAdEnded");
        this.f12909j.mo41417f(this);
        mo41421a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m13386c("onRewardedVideoAdOpened");
        this.f12909j.mo41412c(this);
        mo41421a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m13386c("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f12909j.mo41403a(this, this.f12914o);
        Map<String, Object> n = mo41609n();
        Placement placement = this.f12914o;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f12914o.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f12914o.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C5556E.m13257a().f12857m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C5556E.m13257a().f12857m);
        }
        if (C5556E.m13257a().f12858n != null) {
            for (String next : C5556E.m13257a().f12858n.keySet()) {
                n.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C5556E.m13257a().f12858n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f12908b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f12908b);
        }
        JSONObject jSONObject = this.f12916q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f12916q);
        }
        if (m13384b(1010)) {
            C5645g.m13810e();
            C5645g.m13758a(n, this.f12917r, this.f12918s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13197h));
        C5641c cVar = new C5641c(1010, new JSONObject(n));
        cVar.mo41708a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(Long.toString(cVar.mo41709b()) + this.f12912m + mo41606k()));
        long j = this.f12921v;
        if (j != 0) {
            long j2 = time - j;
            m13386c("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            cVar.mo41708a("duration", (Object) Long.valueOf(j2));
        }
        C5645g.m13810e().mo41689b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m13386c("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo41421a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f12919t) {
            if (this.f12907a != C5566a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f12907a}});
                return;
            }
            m13380a(C5566a.ENDED);
            this.f12909j.mo41404a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m13386c("onRewardedVideoAdStarted");
        this.f12909j.mo41416e(this);
        mo41421a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m13386c("onRewardedVideoAdVisible");
        mo41421a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m13386c("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f12907a.name());
        synchronized (this.f12919t) {
            if (this.f12907a == C5566a.LOAD_IN_PROGRESS) {
                m13380a(z ? C5566a.LOADED : C5566a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m13390q();
            mo41425b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(m13391r())}});
            if (z) {
                this.f12909j.mo41402a(this);
            } else {
                this.f12909j.mo41409b(this);
            }
        } else if (z) {
            mo41425b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f12907a.name()}});
        } else {
            mo41425b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1034}, new Object[]{"duration", Long.valueOf(m13391r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f12907a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m13386c("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m13390q();
        mo41425b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1033}, new Object[]{"duration", Long.valueOf(m13391r())}});
        mo41425b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m13391r())}});
        synchronized (this.f12919t) {
            if (this.f12907a != C5566a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f12907a}});
                return;
            }
            m13380a(C5566a.NO_INIT);
            this.f12909j.mo41409b(this);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m13386c("onRewardedVideoInitSuccess");
        synchronized (this.f12919t) {
            if (this.f12907a != C5566a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo41425b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f12907a}});
                return;
            }
            m13380a(C5566a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m13379a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(m13391r())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f13198i = Long.valueOf(System.currentTimeMillis());
        }
        m13379a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(m13391r())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
