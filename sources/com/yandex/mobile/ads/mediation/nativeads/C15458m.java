package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.impl.dn0;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.nativeads.C15474b;
import com.yandex.mobile.ads.nativeads.C15550v;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.m */
class C15458m implements uu0 {

    /* renamed from: a */
    private final uu0 f43664a;

    /* renamed from: b */
    private final MediatedNativeAd f43665b;

    /* renamed from: c */
    private final dn0 f43666c;

    /* renamed from: d */
    private boolean f43667d = false;

    C15458m(uu0 uu0, MediatedNativeAd mediatedNativeAd, dn0 dn0) {
        this.f43664a = uu0;
        this.f43665b = mediatedNativeAd;
        this.f43666c = dn0;
    }

    /* renamed from: a */
    public void mo70409a(C15550v vVar) {
        this.f43664a.mo70409a(vVar);
        NativeAdViewBinder f = vVar.mo71927f();
        if (f != null) {
            this.f43665b.unbindNativeAd(f);
        }
    }

    /* renamed from: a */
    public void mo70410a(C15550v vVar, C15474b bVar) {
        this.f43664a.mo70410a(vVar, bVar);
        NativeAdViewBinder f = vVar.mo71927f();
        if (f != null) {
            this.f43665b.bindNativeAd(f);
        }
        if (vVar.mo71926e() != null && !this.f43667d) {
            this.f43667d = true;
            this.f43666c.mo66645a();
        }
    }

    /* renamed from: a */
    public void mo70408a() {
        this.f43664a.mo70408a();
    }
}
