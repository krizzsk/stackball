package com.fyber.inneractive.sdk.p039dv.p044e;

import android.app.Activity;
import com.fyber.inneractive.sdk.C2680a;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p039dv.C2870c;
import com.fyber.inneractive.sdk.p039dv.C2895f;
import com.fyber.inneractive.sdk.p039dv.p043d.C2878a;
import com.fyber.inneractive.sdk.util.C3657l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.e.a */
public final class C2887a extends C2680a<RewardedAd> {

    /* renamed from: e */
    private final RewardedAdLoadCallback f6840e = new RewardedAdLoadCallback() {
        public final /* synthetic */ void onAdLoaded(Object obj) {
            RewardedAd rewardedAd = (RewardedAd) obj;
            if (C2887a.this.f6809b != null) {
                Object unused = C2887a.this.f6811d = rewardedAd;
                C2887a.this.mo17883a();
                C2887a.this.f6809b.mo18242c();
            }
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            if (C2887a.this.f6809b != null) {
                C2887a.this.f6809b.mo18243d();
            }
        }
    };

    /* renamed from: l */
    private final FullScreenContentCallback f6841l = new FullScreenContentCallback() {
        public final void onAdDismissedFullScreenContent() {
            if (C2887a.this.f6321a != null) {
                C2887a.this.f6321a.mo18256d();
            }
        }

        public final void onAdImpression() {
            if (C2887a.this.f6321a != null) {
                C2887a.this.f6321a.mo18254b();
            }
        }
    };

    /* renamed from: m */
    private final OnUserEarnedRewardListener f6842m = new OnUserEarnedRewardListener() {
        public final void onUserEarnedReward(RewardItem rewardItem) {
            if (C2887a.this.f6321a != null) {
                C2887a.this.f6321a.mo18255c();
            }
        }
    };

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        return true;
    }

    public C2887a(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar, fVar);
    }

    /* renamed from: a */
    public final void mo17884a(C2878a aVar, Activity activity) {
        this.f6321a = aVar;
        if (this.f6811d != null) {
            ((RewardedAd) this.f6811d).setFullScreenContentCallback(this.f6841l);
            ((RewardedAd) this.f6811d).show(activity, this.f6842m);
        }
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        return this.f6811d != null;
    }

    /* renamed from: a */
    public final void mo18226a(AdRequest adRequest, C2870c cVar) {
        super.mo18226a(adRequest, cVar);
        RewardedAd.load(C3657l.m9125p(), "FyberRewarded", adRequest, this.f6840e);
    }
}
