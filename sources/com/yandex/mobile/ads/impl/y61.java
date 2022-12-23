package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

class y61 {

    /* renamed from: a */
    private final List<g01> f42789a;

    y61(jf0 jf0) {
        this.f42789a = m44217a(jf0);
    }

    /* renamed from: a */
    private List<g01> m44217a(jf0 jf0) {
        ArrayList arrayList = new ArrayList();
        og0 c = jf0.mo67986c();
        if (c != null) {
            arrayList.add(new g01(c, 0));
        }
        arrayList.addAll(jf0.mo67984a());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<g01> mo71004a() {
        return this.f42789a;
    }
}
