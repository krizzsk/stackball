package com.fyber.inneractive.sdk.p039dv.p043d;

import android.app.Activity;
import com.fyber.inneractive.sdk.C2680a;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p039dv.C2870c;
import com.fyber.inneractive.sdk.p039dv.C2895f;
import com.fyber.inneractive.sdk.util.C3657l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.d.b */
public final class C2879b extends C2680a<InterstitialAd> {

    /* renamed from: e */
    private final InterstitialAdLoadCallback f6831e = new InterstitialAdLoadCallback() {
        public final /* synthetic */ void onAdLoaded(Object obj) {
            InterstitialAd interstitialAd = (InterstitialAd) obj;
            if (C2879b.this.f6809b != null) {
                Object unused = C2879b.this.f6811d = interstitialAd;
                C2879b.this.mo17883a();
                C2879b.this.f6809b.mo18242c();
            }
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            if (C2879b.this.f6809b != null) {
                C2879b.this.f6809b.mo18243d();
            }
        }
    };

    /* renamed from: l */
    private final FullScreenContentCallback f6832l = new FullScreenContentCallback() {
        public final void onAdShowedFullScreenContent() {
            if (C2879b.this.f6321a != null) {
                C2879b.this.f6321a.mo18254b();
            }
        }

        public final void onAdDismissedFullScreenContent() {
            if (C2879b.this.f6321a != null) {
                C2879b.this.f6321a.mo18256d();
            }
        }
    };

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        return true;
    }

    public C2879b(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar, fVar);
    }

    /* renamed from: a */
    public final void mo17884a(C2878a aVar, Activity activity) {
        this.f6321a = aVar;
        if (this.f6811d != null) {
            ((InterstitialAd) this.f6811d).setFullScreenContentCallback(this.f6832l);
            ((InterstitialAd) this.f6811d).show(activity);
        }
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        return this.f6811d != null;
    }

    /* renamed from: a */
    public final void mo18226a(AdRequest adRequest, C2870c cVar) {
        super.mo18226a(adRequest, cVar);
        InterstitialAd.load(C3657l.m9125p(), "FyberInterstitial", adRequest, this.f6831e);
    }
}
