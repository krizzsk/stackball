package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.C15243ye;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.u70;

public final class RewardedAd extends u70 {

    /* renamed from: a */
    private final C15559b f44102a;

    public RewardedAd(Context context) {
        super(context);
        C15230y2 y2Var = new C15230y2();
        C15558a aVar = new C15558a(context, y2Var);
        C15559b bVar = new C15559b(context, aVar, y2Var);
        this.f44102a = bVar;
        aVar.mo71957a(bVar.mo64592d());
    }

    public void destroy() {
        if (!C13278h5.m36802a((C15243ye) this.f44102a)) {
            this.f44102a.mo68614x();
        }
    }

    public boolean isLoaded() {
        return this.f44102a.mo68615y();
    }

    public void loadAd(AdRequest adRequest) {
        this.f44102a.mo64584b(adRequest);
    }

    public void setAdUnitId(String str) {
        this.f44102a.mo64587b(str);
    }

    public void setRewardedAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        this.f44102a.mo71961a(rewardedAdEventListener);
    }

    /* access modifiers changed from: package-private */
    public void setShouldOpenLinksInApp(boolean z) {
        this.f44102a.mo64588b(z);
    }

    public void show() {
        if (this.f44102a.mo68615y()) {
            this.f44102a.mo68609B();
        } else {
            c21.m34567a("Failed to show not loaded ad", new Object[0]);
        }
    }
}
