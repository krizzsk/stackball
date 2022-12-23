package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;

/* renamed from: com.yandex.metrica.impl.ob.ib */
public class C11343ib implements C11194ea<C10104Ab, C11786tb<C10705Rf.C10708c, C10265Fn>> {

    /* renamed from: a */
    private final C11628pb f27105a;

    /* renamed from: b */
    private final C11423kb f27106b;

    /* renamed from: c */
    private final C11596ob f27107c;

    /* renamed from: d */
    private final C11745sb f27108d;

    public C11343ib() {
        this(new C11628pb(), new C11423kb(), new C11596ob(), new C11745sb());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    C11343ib(C11628pb pbVar, C11423kb kbVar, C11596ob obVar, C11745sb sbVar) {
        this.f27105a = pbVar;
        this.f27106b = kbVar;
        this.f27107c = obVar;
        this.f27108d = sbVar;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10708c, C10265Fn> mo61050b(C10104Ab ab) {
        C11786tb<C10705Rf.C10719m, C10265Fn> tbVar;
        C10705Rf.C10708c cVar = new C10705Rf.C10708c();
        C11786tb<C10705Rf.C10717k, C10265Fn> a = this.f27105a.mo61050b(ab.f24312a);
        cVar.f25610b = (C10705Rf.C10717k) a.f28287a;
        cVar.f25612d = this.f27106b.mo61050b(ab.f24313b);
        C11786tb<C10705Rf.C10716j, C10265Fn> a2 = this.f27107c.mo61050b(ab.f24314c);
        cVar.f25613e = (C10705Rf.C10716j) a2.f28287a;
        C10308Gb gb = ab.f24315d;
        if (gb != null) {
            tbVar = this.f27108d.mo61050b(gb);
            cVar.f25611c = (C10705Rf.C10719m) tbVar.f28287a;
        } else {
            tbVar = null;
        }
        return new C11786tb<>(cVar, C10233En.m26217a(a, a2, tbVar));
    }
}
