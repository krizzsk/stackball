package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.t41;
import com.yandex.mobile.ads.impl.ur0;
import com.yandex.mobile.ads.impl.vr0;

/* renamed from: com.yandex.mobile.ads.nativeads.p */
class C15517p implements ur0 {

    /* renamed from: a */
    private final C15512n f43929a;

    /* renamed from: b */
    private final vr0 f43930b;

    C15517p(Context context, vr0 vr0) {
        this.f43930b = vr0;
        C15230y2 y2Var = new C15230y2();
        C15524s sVar = new C15524s(context, y2Var, this);
        C15512n nVar = new C15512n(context, sVar, y2Var);
        this.f43929a = nVar;
        sVar.mo71745a(nVar.mo64592d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71727a(NativeAdRequestConfiguration nativeAdRequestConfiguration, C12127t tVar, C12129u uVar, t41<as0> t41) {
        this.f43929a.mo71712a(nativeAdRequestConfiguration, tVar, uVar, t41, 1);
    }

    /* renamed from: b */
    public void mo71731b() {
        ((C15515o) this.f43930b).mo71722a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71728a(NativeAdRequestConfiguration nativeAdRequestConfiguration, C12127t tVar, C12129u uVar, t41<as0> t41, int i) {
        this.f43929a.mo71712a(nativeAdRequestConfiguration, tVar, uVar, t41, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71726a(NativeAdLoadListener nativeAdLoadListener) {
        this.f43929a.mo71711a(nativeAdLoadListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71729a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f43929a.mo71713a(nativeBulkAdLoadListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71730a(SliderAdLoadListener sliderAdLoadListener) {
        this.f43929a.mo71714a(sliderAdLoadListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71725a() {
        this.f43929a.mo71715t();
    }
}
