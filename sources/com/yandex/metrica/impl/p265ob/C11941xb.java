package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.xb */
public class C11941xb implements C11488lb<C10427Kb> {

    /* renamed from: a */
    private final C11813ub f28707a;

    public C11941xb() {
        this(new C11813ub());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C10705Rf rf = new C10705Rf();
        rf.f25600b = 1;
        rf.f25601c = new C10705Rf.C10723q();
        C11786tb<C10705Rf.C10720n, C10265Fn> a = this.f28707a.mo61050b(((C10427Kb) obj).f25052b);
        rf.f25601c.f25653b = (C10705Rf.C10720n) a.f28287a;
        return Collections.singletonList(new C11786tb(rf, C10233En.m26217a(a)));
    }

    C11941xb(C11813ub ubVar) {
        this.f28707a = ubVar;
    }
}
