package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.va */
public class C11845va implements Object<C11347ie, C11428kg.C11448l> {
    /* renamed from: a */
    public C11428kg.C11448l[] mo63840b(List<C11347ie> list) {
        C11428kg.C11448l[] lVarArr = new C11428kg.C11448l[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C11347ie ieVar = list.get(i);
            C11428kg.C11448l lVar = new C11428kg.C11448l();
            lVar.f27529b = ieVar.f27118a;
            lVar.f27530c = ieVar.f27119b;
            lVarArr[i] = lVar;
        }
        return lVarArr;
    }

    /* renamed from: a */
    public List<C11347ie> mo63837a(C11428kg.C11448l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (C11428kg.C11448l lVar : lVarArr) {
            arrayList.add(new C11347ie(lVar.f27529b, lVar.f27530c));
        }
        return arrayList;
    }
}
