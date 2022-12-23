package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qb */
public class C11679qb implements C11194ea<List<String>, C11786tb<C10705Rf.C10718l[], C10265Fn>> {

    /* renamed from: a */
    private final C10792Tn f28010a;

    public C11679qb() {
        this(new C10792Tn(20, 100));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    public C11679qb(C10792Tn tn) {
        this.f28010a = tn;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10718l[], C10265Fn> mo61050b(List<String> list) {
        C10682Qn<List<T>, C10349Hn> a = this.f28010a.mo62210a(list);
        List list2 = (List) a.f25555a;
        C10705Rf.C10718l[] lVarArr = new C10705Rf.C10718l[0];
        if (list2 != null) {
            lVarArr = new C10705Rf.C10718l[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                lVarArr[i] = new C10705Rf.C10718l();
                lVarArr[i].f25641b = C10585O2.m27106c((String) list2.get(i));
            }
        }
        return new C11786tb<>(lVarArr, a.f25556b);
    }
}
