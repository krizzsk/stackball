package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

public class ga1 {
    /* renamed from: a */
    public List<hd0> mo67221a(pq0 pq0) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m36520a(pq0.mo69415e()));
        List<C13690k9> b = pq0.mo69407b();
        ArrayList arrayList2 = new ArrayList();
        if (b != null) {
            for (C13690k9 a : b) {
                arrayList2.addAll(m36520a(a.mo68166a()));
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    private List<hd0> m36520a(ej0 ej0) {
        List<C13370i> a;
        ArrayList arrayList = new ArrayList();
        if (!(ej0 == null || (a = ej0.mo66834a()) == null)) {
            for (C13370i next : a) {
                if (next instanceof ea1) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ha1 c : ((ea1) next).mo66792b()) {
                        arrayList2.add(c.mo67506c().mo67957a());
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }
}
