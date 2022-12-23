package com.yandex.mobile.ads.mediation.interstitial;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C14167o5;
import com.yandex.mobile.ads.impl.m80;
import com.yandex.mobile.ads.impl.om0;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.a */
class C15436a implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* renamed from: a */
    private final WeakReference<m80> f43599a;

    /* renamed from: b */
    private final om0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f43600b;

    /* renamed from: c */
    private final rd0 f43601c;

    C15436a(m80 m80, om0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> om0) {
        this.f43599a = new WeakReference<>(m80);
        this.f43600b = om0;
        this.f43601c = new rd0(om0);
    }

    /* renamed from: a */
    private void m44948a() {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            this.f43600b.mo69219d(m80.mo64596h());
            m80.mo64359a(this.f43601c.mo69754a());
        }
    }

    public void onAdImpression() {
        if (!this.f43600b.mo69218c()) {
            m44948a();
        }
    }

    public void onInterstitialClicked() {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            this.f43600b.mo69216c(m80.mo64596h());
        }
    }

    public void onInterstitialDismissed() {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            m80.mo68616z();
        }
    }

    public void onInterstitialFailedToLoad(AdRequestError adRequestError) {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            this.f43600b.mo69214b(m80.mo64596h(), new C12350a2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    public void onInterstitialLeftApplication() {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            m80.onLeftApplication();
        }
    }

    public void onInterstitialLoaded() {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            this.f43600b.mo69221e(m80.mo64596h());
            m80.mo64591c(new C14167o5(this.f43600b).mo69115a());
            m80.onAdLoaded();
        }
    }

    public void onInterstitialShown() {
        m80 m80 = (m80) this.f43599a.get();
        if (m80 != null) {
            m80.mo68608A();
            this.f43600b.mo69223f(m80.mo64596h());
        }
        if (this.f43600b.mo69218c()) {
            m44948a();
        }
    }
}
