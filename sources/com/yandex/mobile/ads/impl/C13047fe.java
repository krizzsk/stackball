package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* renamed from: com.yandex.mobile.ads.impl.fe */
public class C13047fe<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAd f33336a;

    /* renamed from: b */
    private final tq0 f33337b = new tq0();

    public C13047fe(NativeAd nativeAd) {
        this.f33336a = nativeAd;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        TextView k = this.f33337b.mo65911k(v);
        NativeAdType adType = this.f33336a.getAdType();
        if ((k instanceof CallToActionView) && adType != NativeAdType.APP_INSTALL) {
            ((CallToActionView) k).mo65457a();
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
