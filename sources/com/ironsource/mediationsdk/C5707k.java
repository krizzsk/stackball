package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C5745a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.k */
public final class C5707k implements BannerSmashListener {

    /* renamed from: a */
    public AbstractAdapter f13649a;

    /* renamed from: b */
    public NetworkSettings f13650b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public C5745a f13651c;

    /* renamed from: d */
    boolean f13652d;

    /* renamed from: e */
    IronSourceBannerLayout f13653e;

    /* renamed from: f */
    public int f13654f;

    /* renamed from: g */
    private Timer f13655g;

    /* renamed from: h */
    private long f13656h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5709a f13657i = C5709a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.k$a */
    public enum C5709a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C5707k(C5745a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f13654f = i;
        this.f13651c = aVar;
        this.f13649a = abstractAdapter;
        this.f13650b = networkSettings;
        this.f13656h = j;
        abstractAdapter.addBannerListener(this);
    }

    /* renamed from: a */
    private void m14077a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + mo41892a() + " | " + str2, 3);
    }

    /* renamed from: c */
    private void m14079c() {
        if (this.f13649a != null) {
            try {
                String str = C5556E.m13257a().f12856l;
                if (!TextUtils.isEmpty(str)) {
                    this.f13649a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f13649a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                mo41895a(":setCustomParams():" + e.toString());
            }
        }
    }

    /* renamed from: d */
    private void m14080d() {
        try {
            if (this.f13655g != null) {
                this.f13655g.cancel();
            }
        } catch (Exception e) {
            m14077a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f13655g = null;
        }
    }

    /* renamed from: a */
    public final String mo41892a() {
        return this.f13650b.isMultipleInstances() ? this.f13650b.getProviderTypeForReflection() : this.f13650b.getProviderName();
    }

    /* renamed from: a */
    public final void mo41893a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        mo41895a("loadBanner");
        this.f13652d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo41895a("loadBanner - bannerLayout is null or destroyed");
            this.f13651c.mo41885a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f13649a == null) {
            mo41895a("loadBanner - mAdapter is null");
            this.f13651c.mo41885a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false);
        } else {
            this.f13653e = ironSourceBannerLayout;
            mo41896b();
            if (this.f13657i == C5709a.NO_INIT) {
                mo41894a(C5709a.INIT_IN_PROGRESS);
                m14079c();
                this.f13649a.initBanners(str, str2, this.f13650b.getBannerSettings(), this);
                return;
            }
            mo41894a(C5709a.LOAD_IN_PROGRESS);
            this.f13649a.loadBanner(ironSourceBannerLayout, this.f13650b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41894a(C5709a aVar) {
        this.f13657i = aVar;
        mo41895a("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41895a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + mo41892a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41896b() {
        try {
            m14080d();
            Timer timer = new Timer();
            this.f13655g = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C5745a b;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C5707k.this.f13657i == C5709a.INIT_IN_PROGRESS) {
                        C5707k.this.mo41894a(C5709a.NO_INIT);
                        C5707k.this.mo41895a("init timed out");
                        b = C5707k.this.f13651c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
                    } else if (C5707k.this.f13657i == C5709a.LOAD_IN_PROGRESS) {
                        C5707k.this.mo41894a(C5709a.LOAD_FAILED);
                        C5707k.this.mo41895a("load timed out");
                        b = C5707k.this.f13651c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
                    } else if (C5707k.this.f13657i == C5709a.LOADED) {
                        C5707k.this.mo41894a(C5709a.LOAD_FAILED);
                        C5707k.this.mo41895a("reload timed out");
                        C5707k.this.f13651c.mo41887b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), C5707k.this, false);
                        return;
                    } else {
                        return;
                    }
                    b.mo41885a(ironSourceError, C5707k.this, false);
                }
            }, this.f13656h);
        } catch (Exception e) {
            m14077a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        C5745a aVar = this.f13651c;
        if (aVar != null) {
            aVar.mo41882a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C5745a aVar = this.f13651c;
        if (aVar != null) {
            aVar.mo41889d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        mo41895a("onBannerAdLoadFailed()");
        m14080d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.f13657i == C5709a.LOAD_IN_PROGRESS) {
            mo41894a(C5709a.LOAD_FAILED);
            this.f13651c.mo41885a(ironSourceError, this, z);
        } else if (this.f13657i == C5709a.LOADED) {
            this.f13651c.mo41887b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        mo41895a("onBannerAdLoaded()");
        m14080d();
        if (this.f13657i == C5709a.LOAD_IN_PROGRESS) {
            mo41894a(C5709a.LOADED);
            this.f13651c.mo41883a(this, view, layoutParams);
        } else if (this.f13657i == C5709a.LOADED) {
            this.f13651c.mo41884a(this, view, layoutParams, this.f13649a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        C5745a aVar = this.f13651c;
        if (aVar != null) {
            aVar.mo41886b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C5745a aVar = this.f13651c;
        if (aVar != null) {
            aVar.mo41888c(this);
        }
    }

    public final void onBannerAdShown() {
        C5745a aVar = this.f13651c;
        if (aVar != null) {
            aVar.mo41890e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        m14080d();
        if (this.f13657i == C5709a.INIT_IN_PROGRESS) {
            this.f13651c.mo41885a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this, false);
            mo41894a(C5709a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        m14080d();
        if (this.f13657i == C5709a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f13653e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f13651c.mo41885a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f13653e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            mo41896b();
            mo41894a(C5709a.LOAD_IN_PROGRESS);
            this.f13649a.loadBanner(this.f13653e, this.f13650b.getBannerSettings(), this);
        }
    }
}
