package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qa */
public class C11678qa implements Object<C10547Nc, C11428kg.C11462y.C11463a> {
    /* renamed from: a */
    public C11428kg.C11462y.C11463a[] mo63534b(List<C10547Nc> list) {
        C11428kg.C11462y.C11463a[] aVarArr = new C11428kg.C11462y.C11463a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C10547Nc nc = list.get(i);
            C11428kg.C11462y.C11463a aVar = new C11428kg.C11462y.C11463a();
            aVar.f27596b = nc.f25243a;
            aVar.f27597c = nc.f25244b;
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }

    /* renamed from: a */
    public List<C10547Nc> mo63531a(C11428kg.C11462y.C11463a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C11428kg.C11462y.C11463a aVar : aVarArr) {
            arrayList.add(new C10547Nc(aVar.f27596b, aVar.f27597c));
        }
        return arrayList;
    }
}
