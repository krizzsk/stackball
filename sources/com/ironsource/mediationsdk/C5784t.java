package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C5786u;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C5748d;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.t */
public final class C5784t extends C5786u implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5748d f13891i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f13892j;

    C5784t(String str, String str2, NetworkSettings networkSettings, C5748d dVar, int i, AbstractAdapter abstractAdapter) {
        super(new C5717a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f13895b = new C5717a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.f13896c = this.f13895b.f13707b;
        this.f13894a = abstractAdapter;
        this.f13891i = dVar;
        this.f13897d = i;
        this.f13894a.initRewardedVideoForDemandOnly(str, str2, this.f13896c, this);
    }

    /* renamed from: c */
    private void m14256c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f13895b.f13706a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14257d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f13895b.f13706a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo42090a() {
        m14257d("showRewardedVideo state=" + mo42104g());
        if (mo42099a(C5786u.C5787a.LOADED, C5786u.C5787a.SHOW_IN_PROGRESS)) {
            this.f13894a.showRewardedVideo(this.f13896c, this);
            return;
        }
        this.f13891i.mo42021a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo42091a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m14257d("loadRewardedVideo state=" + mo42104g());
        C5786u.C5787a a = mo42094a(new C5786u.C5787a[]{C5786u.C5787a.NOT_LOADED, C5786u.C5787a.LOADED}, C5786u.C5787a.LOAD_IN_PROGRESS);
        if (a == C5786u.C5787a.NOT_LOADED || a == C5786u.C5787a.LOADED) {
            this.f13892j = new Date().getTime();
            m14257d("start timer");
            mo42097a((TimerTask) new TimerTask() {
                public final void run() {
                    C5784t tVar = C5784t.this;
                    tVar.m14257d("load timed out state=" + C5784t.this.mo42104g());
                    if (C5784t.this.mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
                        C5784t.this.f13891i.mo42022a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C5784t.this, new Date().getTime() - C5784t.this.f13892j);
                    }
                }
            });
            if (mo42106i()) {
                this.f13898e = str2;
                this.f13899f = jSONObject;
                this.f13900g = list;
                this.f13894a.loadRewardedVideoForDemandOnlyForBidding(this.f13896c, this, str);
                return;
            }
            this.f13894a.loadRewardedVideoForDemandOnly(this.f13896c, this);
        } else if (a == C5786u.C5787a.LOAD_IN_PROGRESS) {
            this.f13891i.mo42022a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f13891i.mo42022a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo42092b() {
        return this.f13894a.isRewardedVideoAvailable(this.f13896c);
    }

    public final void onRewardedVideoAdClicked() {
        m14256c("onRewardedVideoAdClicked");
        this.f13891i.mo42027c(this);
    }

    public final void onRewardedVideoAdClosed() {
        mo42095a(C5786u.C5787a.NOT_LOADED);
        m14256c("onRewardedVideoAdClosed");
        this.f13891i.mo42026b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        m14256c("onRewardedVideoAdOpened");
        this.f13891i.mo42023a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        m14256c("onRewardedVideoAdRewarded");
        this.f13891i.mo42029e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo42095a(C5786u.C5787a.NOT_LOADED);
        m14256c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f13891i.mo42021a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        m14256c("onRewardedVideoAdVisible");
        this.f13891i.mo42028d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        m14256c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo42104g());
        mo42105h();
        if (mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
            this.f13891i.mo42022a(ironSourceError, this, new Date().getTime() - this.f13892j);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        m14256c("onRewardedVideoLoadSuccess state=" + mo42104g());
        mo42105h();
        if (mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.LOADED)) {
            this.f13891i.mo42024a(this, new Date().getTime() - this.f13892j);
        }
    }
}
