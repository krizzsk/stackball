package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C15016w;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.td0;

/* renamed from: com.yandex.mobile.ads.nativeads.j */
public class C15501j implements td0.C14668a {

    /* renamed from: a */
    private final C15016w f43859a;

    /* renamed from: b */
    private final nr0 f43860b;

    public C15501j(Context context, C14645t1 t1Var) {
        nr0 nr0 = new nr0();
        this.f43860b = nr0;
        this.f43859a = new C15016w(context, t1Var, nr0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71682a(NativeAdEventListener nativeAdEventListener) {
        this.f43860b.mo69076a(nativeAdEventListener);
    }

    /* renamed from: b */
    public void mo71683b() {
        this.f43859a.mo70604a();
    }

    /* renamed from: c */
    public void mo71684c() {
        this.f43859a.mo70610e();
    }

    /* renamed from: d */
    public void mo71685d() {
        this.f43860b.onLeftApplication();
        this.f43859a.mo70609d();
    }

    /* renamed from: e */
    public void mo71686e() {
        this.f43860b.onLeftApplication();
        this.f43859a.mo70611f();
    }

    /* renamed from: f */
    public void mo71687f() {
        this.f43859a.mo70607b();
    }

    /* renamed from: g */
    public void mo71688g() {
        this.f43860b.onLeftApplication();
        this.f43859a.mo70608c();
    }

    /* renamed from: a */
    public void mo71681a(h41.C13275a aVar) {
        this.f43859a.mo70606a(aVar);
    }

    /* renamed from: a */
    public void mo71679a() {
        this.f43860b.mo69075a();
    }

    /* renamed from: a */
    public void mo71680a(ej0 ej0) {
        this.f43859a.mo70605a(ej0.mo66835b());
    }

    /* renamed from: a */
    public void mo64359a(AdImpressionData adImpressionData) {
        this.f43860b.mo69077b(adImpressionData);
    }
}
