package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jb */
public class C11377jb implements C11194ea<List<String>, C11786tb<C10705Rf.C10709d, C10265Fn>> {

    /* renamed from: a */
    private final C10792Tn f27185a;

    public C11377jb() {
        this(new C10792Tn(20, 100));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    public C11377jb(C10792Tn tn) {
        this.f27185a = tn;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10709d, C10265Fn> mo61050b(List<String> list) {
        C10682Qn<List<T>, C10349Hn> a = this.f27185a.mo62210a(list);
        C10705Rf.C10709d dVar = new C10705Rf.C10709d();
        List list2 = (List) a.f25555a;
        int i = C10585O2.f25307a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                bArr[i2] = C10585O2.m27106c((String) list2.get(i2));
            }
        }
        dVar.f25614b = bArr;
        return new C11786tb<>(dVar, a.f25556b);
    }
}
