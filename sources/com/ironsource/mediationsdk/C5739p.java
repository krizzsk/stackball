package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C5786u;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C5746b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p */
public final class C5739p extends C5786u implements BannerSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5746b f13817i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f13818j;

    /* renamed from: k */
    private String f13819k;

    /* renamed from: l */
    private String f13820l;

    /* renamed from: m */
    private JSONObject f13821m;

    public C5739p(String str, String str2, NetworkSettings networkSettings, C5746b bVar, int i, AbstractAdapter abstractAdapter) {
        super(new C5717a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f13817i = bVar;
        this.f13897d = i;
        this.f13819k = str;
        this.f13820l = str2;
        this.f13821m = networkSettings.getBannerSettings();
        this.f13894a.initBannerForBidding(str, str2, this.f13896c, this);
    }

    /* renamed from: a */
    public final void mo42002a() {
        IronLog.INTERNAL.verbose("");
        if (this.f13894a == null) {
            IronLog.INTERNAL.error("destroyBanner() mAdapter == null");
        } else if (mo42099a(C5786u.C5787a.LOADED, C5786u.C5787a.NOT_LOADED) || mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
            mo42105h();
            this.f13894a.destroyBanner(this.f13895b.f13706a.getBannerSettings());
        } else {
            IronLog.INTERNAL.error("cannot destroy banner not loaded");
        }
    }

    /* renamed from: a */
    public final void mo42003a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + mo42104g());
        C5786u.C5787a a = mo42094a(new C5786u.C5787a[]{C5786u.C5787a.NOT_LOADED, C5786u.C5787a.LOADED}, C5786u.C5787a.LOAD_IN_PROGRESS);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("loadBanner - bannerLayout is null or destroyed");
            this.f13817i.mo41995a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.f13818j);
        } else if (str == null) {
            IronLog.INTERNAL.error("loadBanner - serverData is null");
            this.f13817i.mo41995a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "serverData==null"), this, false, new Date().getTime() - this.f13818j);
        } else if (this.f13894a == null) {
            IronLog.INTERNAL.error("loadBanner - mAdapter is null");
            this.f13817i.mo41995a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false, new Date().getTime() - this.f13818j);
        } else if (a == C5786u.C5787a.NOT_LOADED) {
            this.f13818j = new Date().getTime();
            IronLog.INTERNAL.verbose("start timer");
            mo42097a((TimerTask) new TimerTask() {
                public final void run() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("load timed out state=" + C5739p.this.mo42104g());
                    if (C5739p.this.mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
                        C5739p.this.f13817i.mo41995a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"), C5739p.this, false, new Date().getTime() - C5739p.this.f13818j);
                    }
                }
            });
            this.f13898e = str2;
            this.f13899f = jSONObject;
            this.f13900g = list;
            this.f13894a.initBannerForBidding(this.f13819k, this.f13820l, this.f13821m, this);
            this.f13894a.loadBannerForBidding(ironSourceBannerLayout, this.f13821m, this, str);
        } else {
            this.f13817i.mo41995a(a == C5786u.C5787a.LOAD_IN_PROGRESS ? new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_ALREADY_IN_PROGRESS, "load already in progress") : new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show"), this, false, new Date().getTime() - this.f13818j);
        }
    }

    /* renamed from: b */
    public final String mo42004b() {
        return this.f13895b.f13706a.isMultipleInstances() ? this.f13895b.f13706a.getProviderTypeForReflection() : this.f13895b.f13706a.getProviderName();
    }

    /* renamed from: c */
    public final Map<String, Object> mo42005c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f13894a != null ? this.f13894a.getVersion() : str);
            if (this.f13894a != null) {
                str = this.f13894a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f13895b.f13706a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f13895b.f13706a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, 2);
            if (!TextUtils.isEmpty(this.f13898e)) {
                hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13898e);
            }
            if (this.f13899f != null && this.f13899f.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13899f);
            }
            if (!TextUtils.isEmpty(this.f13901h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f13901h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo42101d() + ")", e);
        }
        return hashMap;
    }

    public final void onBannerAdClicked() {
        C5746b bVar = this.f13817i;
        if (bVar != null) {
            bVar.mo41996a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C5746b bVar = this.f13817i;
        if (bVar != null) {
            bVar.mo42000d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        if (mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.NOT_LOADED)) {
            mo42105h();
            boolean z = ironSourceError.getErrorCode() == 606;
            if (this.f13817i != null) {
                this.f13817i.mo41995a(ironSourceError, this, z, new Date().getTime() - this.f13818j);
            }
            mo42095a(C5786u.C5787a.NOT_LOADED);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (mo42099a(C5786u.C5787a.LOAD_IN_PROGRESS, C5786u.C5787a.LOADED)) {
            C5746b bVar = this.f13817i;
            if (bVar != null) {
                bVar.mo41997a(this, view, layoutParams);
            }
            mo42105h();
        }
    }

    public final void onBannerAdScreenDismissed() {
        C5746b bVar = this.f13817i;
        if (bVar != null) {
            bVar.mo41998b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C5746b bVar = this.f13817i;
        if (bVar != null) {
            bVar.mo41999c(this);
        }
    }

    public final void onBannerAdShown() {
        C5746b bVar = this.f13817i;
        if (bVar != null) {
            bVar.mo42001e(this);
            this.f13817i.mo41999c(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
