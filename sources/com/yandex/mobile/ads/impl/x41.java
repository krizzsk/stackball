package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAdView;

public class x41 implements C12982el<NativeAdView> {

    /* renamed from: a */
    private final C13371i0 f42409a;

    /* renamed from: b */
    public final int f42410b;

    public x41(C13371i0 i0Var, int i) {
        this.f42409a = i0Var;
        this.f42410b = i;
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        if (this.f42410b == 1) {
            ((C14049n0) this.f42409a).mo68876a(7);
        } else {
            ((C14049n0) this.f42409a).mo68876a(6);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
