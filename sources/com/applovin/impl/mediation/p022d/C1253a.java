package com.applovin.impl.mediation.p022d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* renamed from: com.applovin.impl.mediation.d.a */
public class C1253a implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private final C1469j f2427a;

    /* renamed from: b */
    private final MaxAdListener f2428b;

    public C1253a(MaxAdListener maxAdListener, C1469j jVar) {
        this.f2427a = jVar;
        this.f2428b = maxAdListener;
    }

    public void onAdClicked(MaxAd maxAd) {
        C1522j.m3521d(this.f2428b, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        C1522j.m3525h(this.f2428b, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, int i) {
        C1522j.m3501a(this.f2428b, maxAd, i);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        C1522j.m3515b(this.f2428b, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        C1522j.m3524g(this.f2428b, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        C1522j.m3519c(this.f2428b, maxAd);
    }

    public void onAdLoadFailed(String str, int i) {
        C1522j.m3503a(this.f2428b, str, i);
    }

    public void onAdLoaded(MaxAd maxAd) {
        C1522j.m3500a(this.f2428b, maxAd);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        C1522j.m3523f(this.f2428b, maxAd);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        C1522j.m3522e(this.f2428b, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        C1522j.m3502a(this.f2428b, maxAd, maxReward);
    }
}
