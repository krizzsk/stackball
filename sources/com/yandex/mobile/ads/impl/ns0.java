package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.C15499i;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.ArrayList;
import java.util.List;

class ns0 implements wq0 {

    /* renamed from: a */
    private final pr0 f37906a = new pr0();

    ns0() {
    }

    /* renamed from: a */
    public void mo67956a(Context context, vq0 vq0, ed0 ed0, C15499i iVar, or0 or0, er0 er0) {
        er0 er02 = er0;
        ArrayList arrayList = new ArrayList();
        List<pq0> c = vq0.mo70515c().mo65856c();
        if (c != null) {
            for (pq0 a : c) {
                NativeAd a2 = this.f37906a.mo69423a(context, vq0, ed0, iVar, or0, a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            er02.mo66863a((List<NativeAd>) arrayList);
        } else {
            er02.mo66860a(C14559s3.f39808a);
        }
    }
}
