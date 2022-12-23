package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.ArrayList;
import java.util.List;

public class y40 {

    /* renamed from: a */
    private final List<C13690k9> f42774a;

    public y40(List<C13690k9> list) {
        this.f42774a = list;
    }

    /* renamed from: a */
    public List<String> mo70995a(C15550v vVar) {
        C13838l9 a;
        ArrayList arrayList = new ArrayList();
        for (C13690k9 next : this.f42774a) {
            if (!next.mo68172f() && ((a = vVar.mo71921a(next)) == null || !a.mo67821b())) {
                arrayList.add(next.mo68167b());
            }
        }
        return arrayList;
    }
}
