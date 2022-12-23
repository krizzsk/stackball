package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.iu */
public class C13449iu implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final C15340zq f35033a;

    /* renamed from: b */
    private final z00 f35034b = new z00();

    public C13449iu(C15340zq zqVar) {
        this.f35033a = zqVar;
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        try {
            C13513jm a = this.f35034b.mo71139a(nativeAdView.getContext());
            nativeAdView.addView(a);
            a.mo68031a(this.f35033a, new C12758cr(UUID.randomUUID().toString()));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
