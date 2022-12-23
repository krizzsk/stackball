package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.C15243ye;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.u70;

public final class InterstitialAd extends u70 {

    /* renamed from: a */
    private final mh0 f43574a;

    public InterstitialAd(Context context) {
        super(context);
        C15230y2 y2Var = new C15230y2();
        kh0 kh0 = new kh0(context, y2Var);
        mh0 mh0 = new mh0(context, kh0, y2Var);
        this.f43574a = mh0;
        kh0.mo68229a(mh0.mo64592d());
    }

    public void destroy() {
        if (!C13278h5.m36802a((C15243ye) this.f43574a)) {
            this.f43574a.mo68614x();
        }
    }

    public boolean isLoaded() {
        return this.f43574a.mo68615y();
    }

    public void loadAd(AdRequest adRequest) {
        this.f43574a.mo64584b(adRequest);
    }

    public void setAdUnitId(String str) {
        this.f43574a.mo64587b(str);
    }

    public void setInterstitialAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f43574a.mo68690a(interstitialAdEventListener);
    }

    /* access modifiers changed from: package-private */
    public void setShouldOpenLinksInApp(boolean z) {
        this.f43574a.mo64588b(z);
    }

    public void show() {
        if (this.f43574a.mo68615y()) {
            this.f43574a.mo68609B();
        } else {
            c21.m34567a("Failed to show not loaded ad", new Object[0]);
        }
    }
}
