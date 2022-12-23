package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;

/* renamed from: com.yandex.metrica.impl.ob.gb */
public class C11278gb implements C11194ea<C11981yb, C11786tb<C10705Rf.C10706a, C10265Fn>> {

    /* renamed from: a */
    private final C11423kb f26974a;

    /* renamed from: b */
    private final C10821Un f26975b;

    public C11278gb() {
        this(new C11423kb(), new C10821Un(20));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    C11278gb(C11423kb kbVar, C10821Un un) {
        this.f26974a = kbVar;
        this.f26975b = un;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10706a, C10265Fn> mo61050b(C11981yb ybVar) {
        C10705Rf.C10706a aVar = new C10705Rf.C10706a();
        aVar.f25608c = this.f26974a.mo61050b(ybVar.f28772a);
        C10682Qn<String, C10265Fn> a = this.f26975b.mo62210a(ybVar.f28773b);
        aVar.f25607b = C10585O2.m27106c((String) a.f25555a);
        return new C11786tb<>(aVar, C10233En.m26217a(a));
    }
}
