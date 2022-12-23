package com.yandex.mobile.ads.impl;

import java.util.List;

class hh0 {
    hh0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public gh0 mo67555a(nt0 nt0, List<k81> list) {
        int i;
        if (list.isEmpty()) {
            i = 50;
        } else {
            int c = list.get(0).mo68163c();
            for (k81 c2 : list) {
                c = Math.max(c, c2.mo68163c());
            }
            i = c;
        }
        return new gh0(nt0, i);
    }
}
