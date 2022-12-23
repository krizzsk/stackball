package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12116o;
import com.yandex.mobile.ads.base.model.MediationData;
import java.lang.ref.WeakReference;

public class ty0 {

    /* renamed from: a */
    private final ug1 f40525a;

    /* renamed from: b */
    private final WeakReference<C12116o> f40526b;

    public ty0(C12116o oVar, MediationData mediationData) {
        this.f40526b = new WeakReference<>(oVar);
        this.f40525a = new uy0(mediationData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70256a() {
        C12116o oVar = (C12116o) this.f40526b.get();
        if (oVar != null && !oVar.mo64597i()) {
            oVar.mo64580a(this.f40525a);
        }
    }
}
