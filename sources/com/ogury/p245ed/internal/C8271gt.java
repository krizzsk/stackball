package com.ogury.p245ed.internal;

import com.ogury.p245ed.OguryAdClickCallback;
import p269io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.internal.gt */
public class C8271gt implements C8280h {

    /* renamed from: a */
    private final PresageInterstitialCallback f21379a;

    /* renamed from: b */
    private OguryAdClickCallback f21380b;

    public C8271gt(PresageInterstitialCallback presageInterstitialCallback) {
        C8467mq.m23881b(presageInterstitialCallback, "presageInterstitialCallback");
        this.f21379a = presageInterstitialCallback;
    }

    /* renamed from: a */
    public final void mo53625a(OguryAdClickCallback oguryAdClickCallback) {
        this.f21380b = oguryAdClickCallback;
    }

    /* renamed from: b */
    public final void mo53465b() {
        this.f21379a.onAdAvailable();
    }

    /* renamed from: c */
    public final void mo53466c() {
        this.f21379a.onAdNotAvailable();
    }

    /* renamed from: d */
    public final void mo53467d() {
        this.f21379a.onAdLoaded();
    }

    /* renamed from: e */
    public final void mo53468e() {
        this.f21379a.onAdNotLoaded();
    }

    /* renamed from: f */
    public final void mo53469f() {
        this.f21379a.onAdDisplayed();
    }

    /* renamed from: g */
    public final void mo53470g() {
        this.f21379a.onAdClosed();
    }

    /* renamed from: a */
    public final void mo53464a(int i) {
        C8250ga gaVar = C8250ga.f21371a;
        C8247fz fzVar = C8247fz.f21354a;
        C8250ga.m23181b(C8247fz.m23164a(i));
        this.f21379a.onAdError(i);
    }

    /* renamed from: a */
    public void mo53203a() {
        OguryAdClickCallback oguryAdClickCallback = this.f21380b;
        if (oguryAdClickCallback != null) {
            oguryAdClickCallback.onAdClicked();
        }
    }
}
