package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C5677b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C5753i;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.C */
public final class C5552C extends C5677b implements InterstitialSmashListener {

    /* renamed from: r */
    JSONObject f12801r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C5753i f12802s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public long f12803t;

    /* renamed from: u */
    private int f12804u;

    C5552C(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f12801r = interstitialSettings;
        this.f13499k = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f13500l = this.f12801r.optInt("maxAdsPerSession", 99);
        this.f13501m = this.f12801r.optInt("maxAdsPerDay", 99);
        this.f13493e = networkSettings.isMultipleInstances();
        this.f13494f = networkSettings.getSubProviderId();
        this.f12804u = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo41339g() {
        this.f13496h = 0;
        mo41803a(C5677b.C5678a.INITIATED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo41340h() {
        try {
            mo41809e();
            this.f13497i = new Timer();
            this.f13497i.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C5552C.this.f13489a == C5677b.C5678a.INIT_PENDING && C5552C.this.f12802s != null) {
                        C5552C.this.mo41803a(C5677b.C5678a.INIT_FAILED);
                        C5552C.this.f12802s.mo41322a(ErrorBuilder.buildInitFailedError("Timeout", IronSourceConstants.INTERSTITIAL_AD_UNIT), C5552C.this);
                    }
                }
            }, (long) (this.f12804u * 1000));
        } catch (Exception e) {
            mo41804a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo41341i() {
        try {
            mo41810f();
            this.f13498j = new Timer();
            this.f13498j.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C5552C.this.f13489a == C5677b.C5678a.LOAD_PENDING && C5552C.this.f12802s != null) {
                        C5552C.this.mo41803a(C5677b.C5678a.NOT_AVAILABLE);
                        C5552C.this.f12802s.mo41323a(ErrorBuilder.buildLoadFailedError("Timeout"), C5552C.this, new Date().getTime() - C5552C.this.f12803t);
                    }
                }
            }, (long) (this.f12804u * 1000));
        } catch (Exception e) {
            mo41804a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo41342k() {
        return "interstitial";
    }

    public final void onInterstitialAdClicked() {
        C5753i iVar = this.f12802s;
        if (iVar != null) {
            iVar.mo41334e(this);
        }
    }

    public final void onInterstitialAdClosed() {
        C5753i iVar = this.f12802s;
        if (iVar != null) {
            iVar.mo41331c(this);
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        mo41810f();
        if (this.f13489a == C5677b.C5678a.LOAD_PENDING && this.f12802s != null) {
            this.f12802s.mo41323a(ironSourceError, this, new Date().getTime() - this.f12803t);
        }
    }

    public final void onInterstitialAdOpened() {
        C5753i iVar = this.f12802s;
        if (iVar != null) {
            iVar.mo41328b(this);
        }
    }

    public final void onInterstitialAdReady() {
        mo41810f();
        if (this.f13489a == C5677b.C5678a.LOAD_PENDING && this.f12802s != null) {
            this.f12802s.mo41321a(this, new Date().getTime() - this.f12803t);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        C5753i iVar = this.f12802s;
        if (iVar != null) {
            iVar.mo41329b(ironSourceError, this);
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        C5753i iVar = this.f12802s;
        if (iVar != null) {
            iVar.mo41333d(this);
        }
    }

    public final void onInterstitialAdVisible() {
        C5753i iVar = this.f12802s;
        if (iVar != null) {
            iVar.mo41337f(this);
        }
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        mo41809e();
        if (this.f13489a == C5677b.C5678a.INIT_PENDING) {
            mo41803a(C5677b.C5678a.INIT_FAILED);
            C5753i iVar = this.f12802s;
            if (iVar != null) {
                iVar.mo41322a(ironSourceError, this);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        mo41809e();
        if (this.f13489a == C5677b.C5678a.INIT_PENDING) {
            mo41803a(C5677b.C5678a.INITIATED);
            C5753i iVar = this.f12802s;
            if (iVar != null) {
                iVar.mo41320a(this);
            }
        }
    }
}
