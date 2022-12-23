package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C5786u;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C5747c;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r */
public final class C5742r extends C5786u implements InterstitialSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5747c f13825i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f13826j;

    public C5742r(String str, String str2, NetworkSettings networkSettings, C5747c cVar, int i, AbstractAdapter abstractAdapter) {
        super(new C5717a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f13825i = cVar;
        this.f13897d = i;
        this.f13894a.initInterstitial(str, str2, this.f13896c, this);
    }

    /* renamed from: c */
    private void m14160c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f13895b.f13706a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14161d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f13895b.f13706a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo42016a() {
        m14161d("showInterstitial state=" + mo42104g());
        if (mo42099a(C5786u.C5787a.LOADED, C5786u.C5787a.SHOW_IN_PROGRESS)) {
            this.f13894a.showInterstitial(this.f13896c, this);
            return;
        }
        this.f13825i.mo42008a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo42017a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m14161d("loadInterstitial state=" + mo42104g());
        C5786u.C5787a a = mo42094a(new C5786u.C5787a[]{C5786u.C5787a.NOT_LOADED, C5786u.C5787a.LOADED}, C5786u.C5787a.LOAD_IN_PROGRESS);
        if (a == C5786u.C5787a.NOT_LOADED || a == C5786u.C5787a.LOADED) {
            this.f13826j = new Date().getTime();
            m14161d("start timer");
            mo42097a((TimerTask) new TimerTask() {
                public final void run() {
                    C5742r rVar = C5742r.this;
                    rVar.m14161d("load timed out state=" + C5742r.this.mo42104g());
                    if (C5742r.this.mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
                        C5742r.this.f13825i.mo42009a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C5742r.this, new Date().getTime() - C5742r.this.f13826j);
                    }
                }
            });
            if (mo42106i()) {
                this.f13898e = str2;
                this.f13899f = jSONObject;
                this.f13900g = list;
                this.f13894a.loadInterstitialForBidding(this.f13896c, this, str);
                return;
            }
            this.f13894a.loadInterstitial(this.f13896c, this);
        } else if (a == C5786u.C5787a.LOAD_IN_PROGRESS) {
            this.f13825i.mo42009a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f13825i.mo42009a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo42018b() {
        return this.f13894a.isInterstitialReady(this.f13896c);
    }

    public final void onInterstitialAdClicked() {
        m14160c("onInterstitialAdClicked");
        this.f13825i.mo42014c(this);
    }

    public final void onInterstitialAdClosed() {
        mo42095a(C5786u.C5787a.NOT_LOADED);
        m14160c("onInterstitialAdClosed");
        this.f13825i.mo42013b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m14160c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo42104g());
        mo42105h();
        if (mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
            this.f13825i.mo42009a(ironSourceError, this, new Date().getTime() - this.f13826j);
        }
    }

    public final void onInterstitialAdOpened() {
        m14160c("onInterstitialAdOpened");
        this.f13825i.mo42010a(this);
    }

    public final void onInterstitialAdReady() {
        m14160c("onInterstitialAdReady state=" + mo42104g());
        mo42105h();
        if (mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.LOADED)) {
            this.f13825i.mo42011a(this, new Date().getTime() - this.f13826j);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        mo42095a(C5786u.C5787a.NOT_LOADED);
        m14160c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f13825i.mo42008a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        m14160c("onInterstitialAdVisible");
        this.f13825i.mo42015d(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
