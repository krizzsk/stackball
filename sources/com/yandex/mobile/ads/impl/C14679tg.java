package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.tg */
public class C14679tg implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final NativeAdAssets f40317a;

    /* renamed from: b */
    private final int f40318b;

    public C14679tg(NativeAdAssets nativeAdAssets, int i) {
        this.f40317a = nativeAdAssets;
        this.f40318b = i;
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        C14755ug ugVar = new C14755ug(this.f40317a, this.f40318b);
        ImageView a = ugVar.mo70347a(nativeAdView);
        ImageView b = ugVar.mo70348b(nativeAdView);
        if (a != null) {
            a.setId(C12066R.C12068id.favicon);
        }
        if (b != null) {
            b.setId(C12066R.C12068id.icon);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
