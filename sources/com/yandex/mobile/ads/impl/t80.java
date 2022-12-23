package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.C15555x;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;

public class t80 implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final NativeAd f40262a;

    /* renamed from: b */
    private final C14384qh f40263b;

    /* renamed from: c */
    private final NativeAdEventListener f40264c;

    /* renamed from: d */
    private final C15555x f40265d = new C15555x();

    /* renamed from: e */
    private final tq0 f40266e = new tq0();

    public t80(NativeAd nativeAd, C14384qh qhVar, NativeAdEventListener nativeAdEventListener) {
        this.f40262a = nativeAd;
        this.f40263b = qhVar;
        this.f40264c = nativeAdEventListener;
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        try {
            this.f40262a.bindNativeAd(this.f40265d.mo71937a((NativeAdView) viewGroup, this.f40266e));
            this.f40262a.setNativeAdEventListener(this.f40264c);
        } catch (NativeAdException unused) {
            this.f40263b.mo67136g();
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        this.f40262a.setNativeAdEventListener((NativeAdEventListener) null);
    }
}
