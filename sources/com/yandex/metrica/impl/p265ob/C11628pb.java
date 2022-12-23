package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pb */
public class C11628pb implements C11194ea<C10219Eb, C11786tb<C10705Rf.C10717k, C10265Fn>> {

    /* renamed from: a */
    private final C11559nb f27906a;

    /* renamed from: b */
    private final C11596ob f27907b;

    /* renamed from: c */
    private final C11377jb f27908c;

    /* renamed from: d */
    private final C11679qb f27909d;

    /* renamed from: e */
    private final C10821Un f27910e;

    /* renamed from: f */
    private final C10821Un f27911f;

    public C11628pb() {
        this(new C11559nb(), new C11596ob(), new C11377jb(), new C11679qb(), new C10821Un(100), new C10821Un(1000));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    C11628pb(C11559nb nbVar, C11596ob obVar, C11377jb jbVar, C11679qb qbVar, C10821Un un, C10821Un un2) {
        this.f27906a = nbVar;
        this.f27907b = obVar;
        this.f27908c = jbVar;
        this.f27909d = qbVar;
        this.f27910e = un;
        this.f27911f = un2;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10717k, C10265Fn> mo61050b(C10219Eb eb) {
        C11786tb<C10705Rf.C10709d, C10265Fn> tbVar;
        C11786tb<C10705Rf.C10714i, C10265Fn> tbVar2;
        C11786tb<C10705Rf.C10716j, C10265Fn> tbVar3;
        C11786tb<C10705Rf.C10716j, C10265Fn> tbVar4;
        C10705Rf.C10717k kVar = new C10705Rf.C10717k();
        C10682Qn<String, C10265Fn> a = this.f27910e.mo62210a(eb.f24575a);
        kVar.f25633b = C10585O2.m27106c((String) a.f25555a);
        C10682Qn<String, C10265Fn> a2 = this.f27911f.mo62210a(eb.f24576b);
        kVar.f25634c = C10585O2.m27106c((String) a2.f25555a);
        List<String> list = eb.f24577c;
        C11786tb<C10705Rf.C10718l[], C10265Fn> tbVar5 = null;
        if (list != null) {
            tbVar = this.f27908c.mo61050b(list);
            kVar.f25635d = (C10705Rf.C10709d) tbVar.f28287a;
        } else {
            tbVar = null;
        }
        Map<String, String> map = eb.f24578d;
        if (map != null) {
            tbVar2 = this.f27906a.mo61050b(map);
            kVar.f25636e = (C10705Rf.C10714i) tbVar2.f28287a;
        } else {
            tbVar2 = null;
        }
        C10186Db db = eb.f24579e;
        if (db != null) {
            tbVar3 = this.f27907b.mo61050b(db);
            kVar.f25637f = (C10705Rf.C10716j) tbVar3.f28287a;
        } else {
            tbVar3 = null;
        }
        C10186Db db2 = eb.f24580f;
        if (db2 != null) {
            tbVar4 = this.f27907b.mo61050b(db2);
            kVar.f25638g = (C10705Rf.C10716j) tbVar4.f28287a;
        } else {
            tbVar4 = null;
        }
        List<String> list2 = eb.f24581g;
        if (list2 != null) {
            tbVar5 = this.f27909d.mo61050b(list2);
            kVar.f25639h = (C10705Rf.C10718l[]) tbVar5.f28287a;
        }
        return new C11786tb<>(kVar, C10233En.m26217a(a, a2, tbVar, tbVar2, tbVar3, tbVar4, tbVar5));
    }
}
