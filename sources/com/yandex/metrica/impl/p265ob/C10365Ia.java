package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11215em;
import com.yandex.metrica.impl.p265ob.C11428kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ia */
class C10365Ia implements C11194ea<List<C11215em>, C11428kg.C11461x[]> {
    C10365Ia() {
    }

    /* renamed from: a */
    public C11428kg.C11461x[] mo61050b(List<C11215em> list) {
        C11428kg.C11461x[] xVarArr = new C11428kg.C11461x[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C11215em emVar = list.get(i);
            C11428kg.C11461x xVar = new C11428kg.C11461x();
            xVar.f27590b = emVar.f26845a.f26852a;
            xVar.f27591c = emVar.f26846b;
            xVarArr[i] = xVar;
        }
        return xVarArr;
    }

    /* renamed from: a */
    public List<C11215em> mo61049a(C11428kg.C11461x[] xVarArr) {
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (C11428kg.C11461x xVar : xVarArr) {
            arrayList.add(new C11215em(C11215em.C11217b.m28893a(xVar.f27590b), xVar.f27591c));
        }
        return arrayList;
    }
}
