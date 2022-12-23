package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

public class kh0 implements h80 {

    /* renamed from: a */
    private final Handler f36139a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final C12352a3 f36140b;

    /* renamed from: c */
    private InterstitialAdEventListener f36141c;

    public kh0(Context context, C15230y2 y2Var) {
        this.f36140b = new C12352a3(context, y2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m38345b() {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdDismissed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m38347c() {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
            interstitialAdEventListener.onLeftApplication();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m38348d() {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdLoaded();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m38349e() {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onReturnedToApplication();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m38350f() {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
    }

    /* renamed from: a */
    public void mo68229a(C14645t1 t1Var) {
        this.f36140b.mo65660b(new C14736u3(C12115n.INTERSTITIAL, t1Var));
    }

    public void onAdDismissed() {
        this.f36139a.post(new Runnable() {
            public final void run() {
                kh0.this.m38345b();
            }
        });
    }

    public void onAdLeftApplication() {
        this.f36139a.post(new Runnable() {
            public final void run() {
                kh0.this.m38347c();
            }
        });
    }

    public void onAdLoaded() {
        this.f36140b.mo65657a();
        this.f36139a.post(new Runnable() {
            public final void run() {
                kh0.this.m38348d();
            }
        });
    }

    public void onAdShown() {
        this.f36139a.post(new Runnable() {
            public final void run() {
                kh0.this.m38350f();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m38346b(AdImpressionData adImpressionData) {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onImpression(adImpressionData);
        }
    }

    /* renamed from: a */
    public void mo68228a(h41.C13275a aVar) {
        this.f36140b.mo65658a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68230a(InterstitialAdEventListener interstitialAdEventListener) {
        this.f36141c = interstitialAdEventListener;
    }

    /* renamed from: a */
    public void mo67429a(AdImpressionData adImpressionData) {
        this.f36139a.post(new Runnable(adImpressionData) {
            public final /* synthetic */ AdImpressionData f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                kh0.this.m38346b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo67430a(C12350a2 a2Var) {
        this.f36140b.mo65659a(a2Var.mo65652b());
        this.f36139a.post(new Runnable(new AdRequestError(a2Var.mo65651a(), a2Var.mo65652b())) {
            public final /* synthetic */ AdRequestError f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                kh0.this.m38344a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38344a(AdRequestError adRequestError) {
        InterstitialAdEventListener interstitialAdEventListener = this.f36141c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    /* renamed from: a */
    public void mo67428a() {
        this.f36139a.post(new Runnable() {
            public final void run() {
                kh0.this.m38349e();
            }
        });
    }
}
