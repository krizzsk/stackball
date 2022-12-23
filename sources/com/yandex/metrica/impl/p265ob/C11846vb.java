package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vb */
public class C11846vb implements C11488lb<C10366Ib> {

    /* renamed from: a */
    private final C11813ub f28474a;

    /* renamed from: b */
    private final C11628pb f28475b;

    public C11846vb() {
        this(new C11813ub(), new C11628pb());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C10366Ib ib = (C10366Ib) obj;
        C10705Rf rf = new C10705Rf();
        rf.f25600b = 2;
        rf.f25602d = new C10705Rf.C10721o();
        C11786tb<C10705Rf.C10720n, C10265Fn> a = this.f28474a.mo61050b(ib.f24897c);
        rf.f25602d.f25650c = (C10705Rf.C10720n) a.f28287a;
        C11786tb<C10705Rf.C10717k, C10265Fn> a2 = this.f28475b.mo61050b(ib.f24896b);
        rf.f25602d.f25649b = (C10705Rf.C10717k) a2.f28287a;
        return Collections.singletonList(new C11786tb(rf, C10233En.m26217a(a, a2)));
    }

    C11846vb(C11813ub ubVar, C11628pb pbVar) {
        this.f28474a = ubVar;
        this.f28475b = pbVar;
    }
}
