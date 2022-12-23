package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.Q */
public final class C5594Q extends C5606U implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C5596a f13107a = C5596a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5593P f13108b;

    /* renamed from: j */
    private Timer f13109j;

    /* renamed from: k */
    private int f13110k;

    /* renamed from: l */
    private String f13111l;

    /* renamed from: m */
    private String f13112m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f13113n;

    /* renamed from: o */
    private final Object f13114o = new Object();

    /* renamed from: com.ironsource.mediationsdk.Q$a */
    public enum C5596a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public C5594Q(String str, String str2, NetworkSettings networkSettings, C5593P p, int i, AbstractAdapter abstractAdapter) {
        super(new C5717a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f13111l = str;
        this.f13112m = str2;
        this.f13108b = p;
        this.f13109j = null;
        this.f13110k = i;
        this.f13192c.addInterstitialListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13559a(C5596a aVar) {
        m13565d("current state=" + this.f13107a + ", new state=" + aVar);
        this.f13107a = aVar;
    }

    /* renamed from: c */
    private void m13564c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + mo41606k() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13565d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo41606k() + " : " + str, 0);
    }

    /* renamed from: e */
    private void m13566e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo41606k() + " : " + str, 3);
    }

    /* renamed from: q */
    private void m13567q() {
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
            m13565d("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: r */
    private void m13568r() {
        synchronized (this.f13114o) {
            if (this.f13109j != null) {
                this.f13109j.cancel();
                this.f13109j = null;
            }
        }
    }

    /* renamed from: s */
    private void m13569s() {
        synchronized (this.f13114o) {
            m13565d("start timer");
            m13568r();
            Timer timer = new Timer();
            this.f13109j = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C5594Q q = C5594Q.this;
                    q.m13565d("timed out state=" + C5594Q.this.f13107a.name() + " isBidder=" + C5594Q.this.mo41603h());
                    if (C5594Q.this.f13107a != C5596a.INIT_IN_PROGRESS || !C5594Q.this.mo41603h()) {
                        C5594Q.this.m13559a(C5596a.LOAD_FAILED);
                        C5594Q.this.f13108b.mo41555a(ErrorBuilder.buildLoadFailedError("timed out"), C5594Q.this, new Date().getTime() - C5594Q.this.f13113n);
                        return;
                    }
                    C5594Q.this.m13559a(C5596a.NO_INIT);
                }
            }, (long) (this.f13110k * 1000));
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo41420a() {
        try {
            if (mo41603h()) {
                return this.f13192c.getInterstitialBiddingData(this.f13195f);
            }
            return null;
        } catch (Throwable th) {
            m13566e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo41569a(String str) {
        try {
            this.f13113n = new Date().getTime();
            m13565d("loadInterstitial");
            this.f13194e = false;
            if (mo41603h()) {
                m13569s();
                m13559a(C5596a.LOAD_IN_PROGRESS);
                this.f13192c.loadInterstitialForBidding(this.f13195f, this, str);
            } else if (this.f13107a == C5596a.NO_INIT) {
                m13569s();
                m13559a(C5596a.INIT_IN_PROGRESS);
                m13567q();
                this.f13192c.initInterstitial(this.f13111l, this.f13112m, this.f13195f, this);
            } else {
                m13569s();
                m13559a(C5596a.LOAD_IN_PROGRESS);
                this.f13192c.loadInterstitial(this.f13195f, this);
            }
        } catch (Throwable th) {
            m13566e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo41570b() {
        m13565d("initForBidding()");
        m13559a(C5596a.INIT_IN_PROGRESS);
        m13567q();
        try {
            this.f13192c.initInterstitialForBidding(this.f13111l, this.f13112m, this.f13195f, this);
        } catch (Throwable th) {
            m13566e(mo41606k() + "loadInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: c */
    public final void mo41571c() {
        try {
            this.f13192c.showInterstitial(this.f13195f, this);
        } catch (Throwable th) {
            m13566e(mo41606k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            this.f13108b.mo41554a(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()), this);
        }
    }

    /* renamed from: f */
    public final void mo41572f() {
        this.f13192c.setMediationState(C5677b.C5678a.CAPPED_PER_SESSION, "interstitial");
    }

    /* renamed from: g */
    public final boolean mo41573g() {
        try {
            return this.f13192c.isInterstitialReady(this.f13195f);
        } catch (Throwable th) {
            m13566e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        m13564c("onInterstitialAdClicked");
        this.f13108b.mo41563d(this);
    }

    public final void onInterstitialAdClosed() {
        m13564c("onInterstitialAdClosed");
        this.f13108b.mo41558b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m13564c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f13107a.name());
        m13568r();
        if (this.f13107a == C5596a.LOAD_IN_PROGRESS) {
            m13559a(C5596a.LOAD_FAILED);
            this.f13108b.mo41555a(ironSourceError, this, new Date().getTime() - this.f13113n);
        }
    }

    public final void onInterstitialAdOpened() {
        m13564c("onInterstitialAdOpened");
        this.f13108b.mo41552a(this);
    }

    public final void onInterstitialAdReady() {
        m13564c("onInterstitialAdReady state=" + this.f13107a.name());
        m13568r();
        if (this.f13107a == C5596a.LOAD_IN_PROGRESS) {
            m13559a(C5596a.LOADED);
            this.f13108b.mo41553a(this, new Date().getTime() - this.f13113n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        m13564c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f13108b.mo41554a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        m13564c("onInterstitialAdShowSucceeded");
        this.f13108b.mo41561c(this);
    }

    public final void onInterstitialAdVisible() {
        m13564c("onInterstitialAdVisible");
        this.f13108b.mo41564e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        m13564c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f13107a.name());
        if (this.f13107a == C5596a.INIT_IN_PROGRESS) {
            m13568r();
            m13559a(C5596a.NO_INIT);
            this.f13108b.mo41559b(ironSourceError, this);
            if (!mo41603h()) {
                this.f13108b.mo41555a(ironSourceError, this, new Date().getTime() - this.f13113n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        m13564c("onInterstitialInitSuccess state=" + this.f13107a.name());
        if (this.f13107a == C5596a.INIT_IN_PROGRESS) {
            m13568r();
            if (mo41603h()) {
                m13559a(C5596a.INIT_SUCCESS);
            } else {
                m13559a(C5596a.LOAD_IN_PROGRESS);
                m13569s();
                try {
                    this.f13192c.loadInterstitial(this.f13195f, this);
                } catch (Throwable th) {
                    m13566e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                }
            }
            this.f13108b.mo41566f(this);
        }
    }
}
