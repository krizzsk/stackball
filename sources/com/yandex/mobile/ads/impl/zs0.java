package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.C15499i;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.List;

class zs0 implements wq0 {

    /* renamed from: a */
    private final pr0 f43328a = new pr0();

    zs0() {
    }

    /* renamed from: a */
    public void mo67956a(Context context, vq0 vq0, ed0 ed0, C15499i iVar, or0 or0, er0 er0) {
        NativeAd nativeAd;
        List<pq0> c = vq0.mo70515c().mo65856c();
        if (c == null || c.isEmpty()) {
            nativeAd = null;
        } else if (c.size() > 1) {
            nativeAd = iVar.mo71673a(context, vq0, ed0, or0);
        } else {
            nativeAd = this.f43328a.mo69423a(context, vq0, ed0, iVar, or0, c.get(0));
        }
        if (nativeAd != null) {
            er0.mo66861a(nativeAd);
        } else {
            er0.mo66860a(C14559s3.f39808a);
        }
    }
}
