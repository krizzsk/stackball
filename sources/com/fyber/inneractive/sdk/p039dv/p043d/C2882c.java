package com.fyber.inneractive.sdk.p039dv.p043d;

import android.app.Activity;
import com.fyber.inneractive.sdk.C2680a;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p039dv.C2870c;
import com.fyber.inneractive.sdk.p039dv.C2895f;
import com.fyber.inneractive.sdk.util.C3657l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* renamed from: com.fyber.inneractive.sdk.dv.d.c */
public final class C2882c extends C2680a<InterstitialAd> {

    /* renamed from: e */
    private final AdListener f6835e = new AdListener() {
        public final void onAdFailedToLoad(int i) {
            if (C2882c.this.f6809b != null) {
                C2882c.this.f6809b.mo18243d();
            }
        }

        public final void onAdLoaded() {
            if (C2882c.this.f6809b != null) {
                C2882c.this.mo17883a();
                C2882c.this.f6809b.mo18242c();
            }
        }
    };

    /* renamed from: l */
    private final AdListener f6836l = new AdListener() {
        public final void onAdClosed() {
            if (C2882c.this.f6321a != null) {
                C2882c.this.f6321a.mo18256d();
            }
        }

        public final void onAdOpened() {
            if (C2882c.this.f6321a != null) {
                C2882c.this.f6321a.mo18254b();
            }
        }

        public final void onAdClicked() {
            if (C2882c.this.f6321a != null) {
                C2882c.this.f6321a.mo18253a();
            }
        }

        public final void onAdImpression() {
            if (C2882c.this.f6321a != null) {
                C2882c.this.f6321a.mo18254b();
            }
        }
    };

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        return true;
    }

    public C2882c(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar, fVar);
    }

    /* renamed from: a */
    public final void mo17884a(C2878a aVar, Activity activity) {
        this.f6321a = aVar;
        if (this.f6811d != null) {
            ((InterstitialAd) this.f6811d).setAdListener(this.f6836l);
            ((InterstitialAd) this.f6811d).show();
        }
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        return this.f6811d != null && ((InterstitialAd) this.f6811d).isLoaded();
    }

    /* renamed from: a */
    public final void mo18226a(AdRequest adRequest, C2870c cVar) {
        super.mo18226a(adRequest, cVar);
        this.f6811d = new InterstitialAd(C3657l.m9125p());
        ((InterstitialAd) this.f6811d).setAdListener(this.f6835e);
        ((InterstitialAd) this.f6811d).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f6811d).loadAd(adRequest);
    }
}
