package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ub */
public class C11813ub implements C11194ea<C10335Hb, C11786tb<C10705Rf.C10720n, C10265Fn>> {

    /* renamed from: a */
    private final C11559nb f28374a;

    /* renamed from: b */
    private final C11377jb f28375b;

    /* renamed from: c */
    private final C10821Un f28376c;

    /* renamed from: d */
    private final C10821Un f28377d;

    public C11813ub() {
        this(new C11559nb(), new C11377jb(), new C10821Un(100), new C10821Un(1000));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    C11813ub(C11559nb nbVar, C11377jb jbVar, C10821Un un, C10821Un un2) {
        this.f28374a = nbVar;
        this.f28375b = jbVar;
        this.f28376c = un;
        this.f28377d = un2;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10720n, C10265Fn> mo61050b(C10335Hb hb) {
        C11786tb<C10705Rf.C10709d, C10265Fn> tbVar;
        C10705Rf.C10720n nVar = new C10705Rf.C10720n();
        C10682Qn<String, C10265Fn> a = this.f28376c.mo62210a(hb.f24826a);
        nVar.f25645b = C10585O2.m27106c((String) a.f25555a);
        List<String> list = hb.f24827b;
        C11786tb<C10705Rf.C10714i, C10265Fn> tbVar2 = null;
        if (list != null) {
            tbVar = this.f28375b.mo61050b(list);
            nVar.f25646c = (C10705Rf.C10709d) tbVar.f28287a;
        } else {
            tbVar = null;
        }
        C10682Qn<String, C10265Fn> a2 = this.f28377d.mo62210a(hb.f24828c);
        nVar.f25647d = C10585O2.m27106c((String) a2.f25555a);
        Map<String, String> map = hb.f24829d;
        if (map != null) {
            tbVar2 = this.f28374a.mo61050b(map);
            nVar.f25648e = (C10705Rf.C10714i) tbVar2.f28287a;
        }
        return new C11786tb<>(nVar, C10233En.m26217a(a, tbVar, a2, tbVar2));
    }
}
