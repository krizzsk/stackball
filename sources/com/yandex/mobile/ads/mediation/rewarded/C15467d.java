package com.yandex.mobile.ads.mediation.rewarded;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C14167o5;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.rewarded.C15559b;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.d */
class C15467d implements MediatedRewardedAdapterListener {

    /* renamed from: a */
    private final WeakReference<C15559b> f43698a;

    /* renamed from: b */
    private final om0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f43699b;

    /* renamed from: c */
    private final rd0 f43700c;

    C15467d(C15559b bVar, om0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> om0) {
        this.f43698a = new WeakReference<>(bVar);
        this.f43699b = om0;
        this.f43700c = new rd0(om0);
    }

    /* renamed from: a */
    private void m44999a() {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            this.f43699b.mo69219d(bVar.mo64596h());
            bVar.mo64359a(this.f43700c.mo69754a());
        }
    }

    public void onAdImpression() {
        if (!this.f43699b.mo69218c()) {
            m44999a();
        }
    }

    public void onRewarded(MediatedReward mediatedReward) {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            this.f43699b.mo69208a(bVar.mo64596h(), (AdResponse<String>) bVar.mo64595g());
            bVar.mo71960D();
        }
    }

    public void onRewardedAdClicked() {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            this.f43699b.mo69216c(bVar.mo64596h());
        }
    }

    public void onRewardedAdDismissed() {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            bVar.mo68616z();
        }
    }

    public void onRewardedAdFailedToLoad(AdRequestError adRequestError) {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            this.f43699b.mo69214b(bVar.mo64596h(), new C12350a2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    public void onRewardedAdLeftApplication() {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            bVar.onLeftApplication();
        }
    }

    public void onRewardedAdLoaded() {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            this.f43699b.mo69221e(bVar.mo64596h());
            bVar.mo64591c(new C14167o5(this.f43699b).mo69115a());
            bVar.onAdLoaded();
        }
    }

    public void onRewardedAdShown() {
        C15559b bVar = (C15559b) this.f43698a.get();
        if (bVar != null) {
            bVar.mo68608A();
            this.f43699b.mo69223f(bVar.mo64596h());
        }
        if (this.f43699b.mo69218c()) {
            m44999a();
        }
    }
}
