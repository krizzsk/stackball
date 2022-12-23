package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C12352a3;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14736u3;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.h80;

/* renamed from: com.yandex.mobile.ads.rewarded.a */
public class C15558a implements h80 {

    /* renamed from: a */
    private final Handler f44103a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final C12352a3 f44104b;

    /* renamed from: c */
    private RewardedAdEventListener f44105c;

    public C15558a(Context context, C15230y2 y2Var) {
        this.f44104b = new C12352a3(context, y2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m45398b() {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdDismissed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m45400c() {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
            rewardedAdEventListener.onLeftApplication();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m45401d() {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdLoaded();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m45402e() {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onReturnedToApplication();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m45403f() {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdShown();
        }
    }

    /* renamed from: a */
    public void mo71957a(C14645t1 t1Var) {
        this.f44104b.mo65660b(new C14736u3(C12115n.REWARDED, t1Var));
    }

    public void onAdDismissed() {
        this.f44103a.post(new Runnable() {
            public final void run() {
                C15558a.this.m45398b();
            }
        });
    }

    public void onAdLeftApplication() {
        this.f44103a.post(new Runnable() {
            public final void run() {
                C15558a.this.m45400c();
            }
        });
    }

    public void onAdLoaded() {
        this.f44104b.mo65657a();
        this.f44103a.post(new Runnable() {
            public final void run() {
                C15558a.this.m45401d();
            }
        });
    }

    public void onAdShown() {
        this.f44103a.post(new Runnable() {
            public final void run() {
                C15558a.this.m45403f();
            }
        });
    }

    /* renamed from: a */
    public void mo71956a(h41.C13275a aVar) {
        this.f44104b.mo65658a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m45399b(AdImpressionData adImpressionData) {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onImpression(adImpressionData);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71958a(RewardedAdEventListener rewardedAdEventListener) {
        this.f44105c = rewardedAdEventListener;
    }

    /* renamed from: a */
    public void mo67430a(C12350a2 a2Var) {
        this.f44104b.mo65659a(a2Var.mo65652b());
        this.f44103a.post(new Runnable(new AdRequestError(a2Var.mo65651a(), a2Var.mo65652b())) {
            public final /* synthetic */ AdRequestError f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15558a.this.m45396a(this.f$1);
            }
        });
    }

    /* renamed from: b */
    public void mo71959b(Reward reward) {
        this.f44103a.post(new Runnable(reward) {
            public final /* synthetic */ Reward f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15558a.this.m45397a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45396a(AdRequestError adRequestError) {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    /* renamed from: a */
    public void mo67428a() {
        this.f44103a.post(new Runnable() {
            public final void run() {
                C15558a.this.m45402e();
            }
        });
    }

    /* renamed from: a */
    public void mo67429a(AdImpressionData adImpressionData) {
        this.f44103a.post(new Runnable(adImpressionData) {
            public final /* synthetic */ AdImpressionData f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15558a.this.m45399b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45397a(Reward reward) {
        RewardedAdEventListener rewardedAdEventListener = this.f44105c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(reward);
        }
    }
}
