package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ob */
public class C11596ob implements C11194ea<C10186Db, C11786tb<C10705Rf.C10716j, C10265Fn>> {

    /* renamed from: a */
    private final C11278gb f27843a;

    /* renamed from: b */
    private final C10455Lb f27844b;

    public C11596ob() {
        this(new C11278gb(), new C10455Lb(30));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    C11596ob(C11278gb gbVar, C10455Lb lb) {
        this.f27843a = gbVar;
        this.f27844b = lb;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10716j, C10265Fn> mo61050b(C10186Db db) {
        int i;
        C10705Rf.C10716j jVar = new C10705Rf.C10716j();
        C11786tb<C10705Rf.C10706a, C10265Fn> a = this.f27843a.mo61050b(db.f24486a);
        jVar.f25631b = (C10705Rf.C10706a) a.f28287a;
        C10682Qn<List<T>, C10349Hn> a2 = this.f27844b.mo62210a(db.f24487b);
        if (!C10796U2.m27896b((Collection) a2.f25555a)) {
            jVar.f25632c = new C10705Rf.C10706a[((List) a2.f25555a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a2.f25555a).size(); i2++) {
                C11786tb<C10705Rf.C10706a, C10265Fn> a3 = this.f27843a.mo61050b((C11981yb) ((List) a2.f25555a).get(i2));
                jVar.f25632c[i2] = (C10705Rf.C10706a) a3.f28287a;
                i += a3.f28288b.mo61250a();
            }
        } else {
            i = 0;
        }
        return new C11786tb<>(jVar, C10233En.m26217a(a, a2, new C10233En(i)));
    }
}
