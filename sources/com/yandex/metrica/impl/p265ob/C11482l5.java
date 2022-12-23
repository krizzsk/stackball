package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10910X3;

/* renamed from: com.yandex.metrica.impl.ob.l5 */
public class C11482l5 extends C11305h5 {

    /* renamed from: b */
    private final C10490M2 f27641b;

    /* renamed from: c */
    private final C10188Dd f27642c;

    public C11482l5(C10978Z3 z3, C10490M2 m2, C10188Dd dd) {
        super(z3);
        this.f27641b = m2;
        this.f27642c = dd;
    }

    /* renamed from: a */
    public boolean mo62989a(C11411k0 k0Var, C10328H4 h4) {
        C10910X3.C10911a a = h4.mo61416b().mo62561a();
        this.f27641b.mo61770a(a.f26233l);
        Boolean bool = a.f26226e;
        Boolean bool2 = a.f26237p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f27642c.mo61188a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f27642c.mo61188a(false);
        }
        return false;
    }
}
