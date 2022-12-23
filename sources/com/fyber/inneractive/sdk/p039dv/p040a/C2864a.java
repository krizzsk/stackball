package com.fyber.inneractive.sdk.p039dv.p040a;

import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p039dv.C2863a;
import com.fyber.inneractive.sdk.p039dv.C2870c;
import com.fyber.inneractive.sdk.p039dv.C2886e;
import com.fyber.inneractive.sdk.p039dv.C2895f;
import com.fyber.inneractive.sdk.p039dv.p041b.C2869a;
import com.fyber.inneractive.sdk.p039dv.p042c.C2872b;
import com.fyber.inneractive.sdk.util.C3657l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.fyber.inneractive.sdk.dv.a.a */
public final class C2864a extends C2863a<AdView> {

    /* renamed from: a */
    boolean f6812a = false;

    /* renamed from: e */
    boolean f6813e = false;

    /* renamed from: l */
    private final AdListener f6814l = new AdListener() {
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            C2872b.m6351a(C2864a.this.f6742f != null ? C2864a.this.f6742f.getSpotId() : null, C2869a.Load, C2864a.this.f6742f, C2864a.this.mo18227c(), loadAdError.getMessage());
        }

        public final void onAdLoaded() {
            if (C2864a.this.f6809b != null) {
                C2864a.this.f6813e = true;
                C2864a.this.f6809b.mo18242c();
            }
        }

        public final void onAdOpened() {
            if (C2864a.this.f6810c != null) {
                C2864a.this.f6810c.mo18230a();
            }
        }

        public final void onAdImpression() {
            if (C2864a.this.f6810c != null) {
                C2864a.this.f6810c.mo18235b();
            } else {
                C2864a.this.f6812a = true;
            }
        }
    };

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        return false;
    }

    public C2864a(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar, fVar);
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        return this.f6813e;
    }

    /* renamed from: a */
    public final void mo18226a(AdRequest adRequest, C2870c cVar) {
        super.mo18226a(adRequest, cVar);
        this.f6811d = new AdView(C3657l.m9125p());
        AdView adView = (AdView) this.f6811d;
        AdSize adSize = AdSize.BANNER;
        if (!(this.f6745i == null || this.f6745i.mo18071h() == null || this.f6745i.mo18071h().mo18057a() != UnitDisplayType.MRECT)) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f6811d).setAdUnitId("FyberBanner");
        ((AdView) this.f6811d).setAdListener(this.f6814l);
        ((AdView) this.f6811d).loadAd(adRequest);
    }

    /* renamed from: a */
    public final void mo18225a(C2886e eVar) {
        super.mo18225a(eVar);
        if (this.f6812a) {
            eVar.mo18235b();
            this.f6812a = false;
        }
    }
}
