package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.impl.dn0;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.vu0;
import com.yandex.mobile.ads.nativeads.C15525s0;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.n */
public class C15459n implements vu0 {

    /* renamed from: a */
    private final MediatedNativeAd f43668a;

    /* renamed from: b */
    private final vu0 f43669b = new C15525s0();

    /* renamed from: c */
    private final dn0 f43670c;

    C15459n(MediatedNativeAd mediatedNativeAd, dn0 dn0) {
        this.f43668a = mediatedNativeAd;
        this.f43670c = dn0;
    }

    /* renamed from: a */
    public uu0 mo70593a(pq0 pq0) {
        return new C15458m(this.f43669b.mo70593a(pq0), this.f43668a, this.f43670c);
    }
}
