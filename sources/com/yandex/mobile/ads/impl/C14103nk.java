package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yf0;

/* renamed from: com.yandex.mobile.ads.impl.nk */
class C14103nk {

    /* renamed from: a */
    private final yf0 f37819a;

    public C14103nk(d01 d01) {
        yf0.C15248b bVar = new yf0.C15248b();
        float volume = d01.getVolume();
        if (volume == 0.0f) {
            bVar.mo71048a(1.0f);
            bVar.mo71052b(true);
        } else {
            bVar.mo71048a(volume);
            bVar.mo71052b(false);
        }
        this.f37819a = bVar.mo71050a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public yf0 mo69040a() {
        return this.f37819a;
    }
}
