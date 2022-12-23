package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;

/* renamed from: com.yandex.metrica.impl.ob.sb */
public class C11745sb implements C11194ea<C10308Gb, C11786tb<C10705Rf.C10719m, C10265Fn>> {

    /* renamed from: a */
    private final C11813ub f28136a;

    /* renamed from: b */
    private final C10821Un f28137b;

    /* renamed from: c */
    private final C10821Un f28138c;

    public C11745sb() {
        this(new C11813ub(), new C10821Un(100), new C10821Un(2048));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    C11745sb(C11813ub ubVar, C10821Un un, C10821Un un2) {
        this.f28136a = ubVar;
        this.f28137b = un;
        this.f28138c = un2;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10719m, C10265Fn> mo61050b(C10308Gb gb) {
        C11786tb<C10705Rf.C10720n, C10265Fn> tbVar;
        C10705Rf.C10719m mVar = new C10705Rf.C10719m();
        C10682Qn<String, C10265Fn> a = this.f28137b.mo62210a(gb.f24773a);
        mVar.f25642b = C10585O2.m27106c((String) a.f25555a);
        C10682Qn<String, C10265Fn> a2 = this.f28138c.mo62210a(gb.f24774b);
        mVar.f25643c = C10585O2.m27106c((String) a2.f25555a);
        C10335Hb hb = gb.f24775c;
        if (hb != null) {
            tbVar = this.f28136a.mo61050b(hb);
            mVar.f25644d = (C10705Rf.C10720n) tbVar.f28287a;
        } else {
            tbVar = null;
        }
        return new C11786tb<>(mVar, C10233En.m26217a(a, a2, tbVar));
    }
}
