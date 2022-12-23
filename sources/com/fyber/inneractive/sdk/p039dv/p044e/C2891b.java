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
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.e.b */
public final class C2891b extends C2680a<RewardedAd> {

    /* renamed from: e */
    private final RewardedAdLoadCallback f6846e = new RewardedAdLoadCallback() {
        public final void onRewardedAdLoaded() {
            if (C2891b.this.f6809b != null) {
                C2891b.this.mo17883a();
                C2891b.this.f6809b.mo18242c();
            }
        }

        public final void onRewardedAdFailedToLoad(int i) {
            if (C2891b.this.f6809b != null) {
                C2891b.this.f6809b.mo18243d();
            }
        }
    };

    /* renamed from: l */
    private final RewardedAdCallback f6847l = new RewardedAdCallback() {
        public final void onRewardedAdFailedToShow(int i) {
        }

        public final void onRewardedAdOpened() {
            if (C2891b.this.f6321a != null) {
                C2891b.this.f6321a.mo18254b();
            }
        }

        public final void onRewardedAdClosed() {
            if (C2891b.this.f6321a != null) {
                C2891b.this.f6321a.mo18256d();
            }
        }

        public final void onUserEarnedReward(RewardItem rewardItem) {
            if (C2891b.this.f6321a != null) {
                C2891b.this.f6321a.mo18255c();
            }
        }
    };

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        return true;
    }

    public C2891b(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar, fVar);
    }

    /* renamed from: a */
    public final void mo17884a(C2878a aVar, Activity activity) {
        this.f6321a = aVar;
        ((RewardedAd) this.f6811d).show(activity, this.f6847l);
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        if (this.f6811d != null) {
            return ((RewardedAd) this.f6811d).isLoaded();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18226a(AdRequest adRequest, C2870c cVar) {
        super.mo18226a(adRequest, cVar);
        this.f6811d = new RewardedAd(C3657l.m9125p(), "FyberRewarded");
        ((RewardedAd) this.f6811d).loadAd(adRequest, this.f6846e);
    }
}
