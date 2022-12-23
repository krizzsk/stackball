package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.nativeads.C15511m0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.p */
class C15461p {

    /* renamed from: a */
    private final C15460o f43675a;

    C15461p(Context context) {
        this.f43675a = new C15460o(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdResponse<as0> mo71468a(MediatedNativeAd mediatedNativeAd, Map<String, Bitmap> map, C15511m0 m0Var) {
        List<C13690k9> a = this.f43675a.mo71467a(mediatedNativeAd.getMediatedNativeAdAssets(), map);
        pq0 pq0 = new pq0();
        pq0.mo69414d(m0Var.mo71709a());
        pq0.mo69412c(a);
        as0 as0 = new as0();
        as0.mo65857c(Collections.singletonList(pq0));
        return new AdResponse.C12087b().mo64459a(as0).mo64464a();
    }
}
