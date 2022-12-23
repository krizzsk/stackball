package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.base.C12129u;
import com.yandex.mobile.ads.impl.as0;
import com.yandex.mobile.ads.impl.t41;
import com.yandex.mobile.ads.impl.vr0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.o */
class C15515o implements vr0 {

    /* renamed from: a */
    private final Object f43922a = new Object();

    /* renamed from: b */
    private final Context f43923b;

    /* renamed from: c */
    private final List<C15517p> f43924c;

    /* renamed from: d */
    private NativeAdLoadListener f43925d;

    /* renamed from: e */
    private NativeBulkAdLoadListener f43926e;

    /* renamed from: f */
    private SliderAdLoadListener f43927f;

    C15515o(Context context) {
        this.f43923b = context;
        this.f43924c = new ArrayList();
    }

    /* renamed from: a */
    public void mo71722a(C15517p pVar) {
        synchronized (this.f43922a) {
            this.f43924c.remove(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo71723b(NativeAdRequestConfiguration nativeAdRequestConfiguration, C12127t tVar, C12129u uVar, t41<as0> t41) {
        synchronized (this.f43922a) {
            C15517p pVar = new C15517p(this.f43923b, this);
            this.f43924c.add(pVar);
            pVar.mo71730a(this.f43927f);
            pVar.mo71727a(nativeAdRequestConfiguration, tVar, uVar, t41);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71717a(NativeAdLoadListener nativeAdLoadListener) {
        synchronized (this.f43922a) {
            this.f43925d = nativeAdLoadListener;
            for (C15517p a : this.f43924c) {
                a.mo71726a(nativeAdLoadListener);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71720a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        synchronized (this.f43922a) {
            this.f43926e = nativeBulkAdLoadListener;
            for (C15517p a : this.f43924c) {
                a.mo71729a(nativeBulkAdLoadListener);
            }
        }
    }

    /* renamed from: a */
    public void mo71721a(SliderAdLoadListener sliderAdLoadListener) {
        synchronized (this.f43922a) {
            this.f43927f = sliderAdLoadListener;
            for (C15517p a : this.f43924c) {
                a.mo71730a(sliderAdLoadListener);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71718a(NativeAdRequestConfiguration nativeAdRequestConfiguration, C12127t tVar, C12129u uVar, t41<as0> t41) {
        synchronized (this.f43922a) {
            C15517p pVar = new C15517p(this.f43923b, this);
            this.f43924c.add(pVar);
            pVar.mo71726a(this.f43925d);
            pVar.mo71727a(nativeAdRequestConfiguration, tVar, uVar, t41);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71719a(NativeAdRequestConfiguration nativeAdRequestConfiguration, C12127t tVar, C12129u uVar, t41<as0> t41, int i) {
        synchronized (this.f43922a) {
            C15517p pVar = new C15517p(this.f43923b, this);
            this.f43924c.add(pVar);
            pVar.mo71729a(this.f43926e);
            pVar.mo71728a(nativeAdRequestConfiguration, tVar, uVar, t41, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71716a() {
        synchronized (this.f43922a) {
            for (C15517p a : this.f43924c) {
                a.mo71725a();
            }
            this.f43924c.clear();
        }
    }
}
