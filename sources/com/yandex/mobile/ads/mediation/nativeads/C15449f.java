package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.C15501j;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.f */
class C15449f {

    /* renamed from: a */
    private final WeakHashMap<C15501j, Object> f43650a = new WeakHashMap<>();

    C15449f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71460a(C15501j jVar) {
        this.f43650a.put(jVar, (Object) null);
    }

    /* renamed from: b */
    public void mo71461b() {
        for (C15501j c : this.f43650a.keySet()) {
            c.mo71684c();
        }
    }

    /* renamed from: c */
    public void mo71462c() {
        for (C15501j d : this.f43650a.keySet()) {
            d.mo71685d();
        }
    }

    /* renamed from: d */
    public void mo71463d() {
        for (C15501j e : this.f43650a.keySet()) {
            e.mo71686e();
        }
    }

    /* renamed from: a */
    public void mo71458a() {
        for (C15501j b : this.f43650a.keySet()) {
            b.mo71683b();
        }
    }

    /* renamed from: a */
    public void mo71459a(AdImpressionData adImpressionData) {
        for (C15501j a : this.f43650a.keySet()) {
            a.mo64359a(adImpressionData);
        }
    }
}
