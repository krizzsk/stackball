package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.mb */
public class C11524mb implements C11488lb<C10132Bb> {

    /* renamed from: a */
    private final C11559nb f27724a;

    /* renamed from: b */
    private final C11343ib f27725b;

    /* renamed from: c */
    private final C10821Un f27726c;

    /* renamed from: d */
    private final C11712rb f27727d;

    public C11524mb() {
        this(new C11559nb(), new C11343ib(), new C10821Un(100), new C11712rb());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C11786tb<C10705Rf.C10714i, C10265Fn> tbVar;
        int i;
        C10132Bb bb = (C10132Bb) obj;
        C10705Rf rf = new C10705Rf();
        rf.f25600b = bb.f24394b;
        rf.f25605g = new C10705Rf.C10713h();
        C10160Cb cb = bb.f24395c;
        C10705Rf.C10711f fVar = new C10705Rf.C10711f();
        fVar.f25617b = C10585O2.m27106c(cb.f24447a);
        C10682Qn<String, C10265Fn> a = this.f27726c.mo62210a(cb.f24448b);
        fVar.f25618c = C10585O2.m27106c((String) a.f25555a);
        fVar.f25621f = cb.f24449c.size();
        Map<String, String> map = cb.f24450d;
        if (map != null) {
            tbVar = this.f27724a.mo61050b(map);
            fVar.f25619d = (C10705Rf.C10714i) tbVar.f28287a;
        } else {
            tbVar = null;
        }
        rf.f25605g.f25625b = fVar;
        C10265Fn a2 = C10233En.m26217a(a, tbVar);
        List<C10104Ab> list = cb.f24449c;
        ArrayList arrayList = new ArrayList();
        this.f27727d.getClass();
        int a3 = rf.f25600b != new C10705Rf().f25600b ? C11056b.m28521a(1, rf.f25600b) + 0 : 0;
        C10705Rf.C10723q qVar = rf.f25601c;
        if (qVar != null) {
            a3 += C11056b.m28523a(2, (C11169e) qVar);
        }
        C10705Rf.C10721o oVar = rf.f25602d;
        if (oVar != null) {
            a3 += C11056b.m28523a(3, (C11169e) oVar);
        }
        C10705Rf.C10722p pVar = rf.f25603e;
        int i2 = 4;
        if (pVar != null) {
            a3 += C11056b.m28523a(4, (C11169e) pVar);
        }
        C10705Rf.C10707b bVar = rf.f25604f;
        if (bVar != null) {
            a3 += C11056b.m28523a(5, (C11169e) bVar);
        }
        C10705Rf.C10713h hVar = rf.f25605g;
        if (hVar != null) {
            a3 += C11056b.m28523a(6, (C11169e) hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        C10705Rf a4 = m29798a(rf);
        C10265Fn fn = a2;
        int i3 = a3;
        int i4 = 0;
        while (i4 < list.size()) {
            C10705Rf.C10712g gVar = new C10705Rf.C10712g();
            gVar.f25623b = i4;
            C11786tb<C10705Rf.C10708c, C10265Fn> a5 = this.f27725b.mo61050b(list.get(i4));
            gVar.f25624c = (C10705Rf.C10708c) a5.f28287a;
            this.f27727d.getClass();
            int c = C11056b.m28534c(i2);
            int a6 = C11056b.m28528a((C11169e) gVar);
            if ((a6 & -128) == 0) {
                i = 0;
            } else {
                i = C11056b.m28531b(a6);
            }
            int i5 = c + a6 + i;
            if (arrayList2.size() != 0 && i3 + i5 > 204800) {
                a4.f25605g.f25625b.f25620e = (C10705Rf.C10712g[]) arrayList2.toArray(new C10705Rf.C10712g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C11786tb(a4, fn));
                fn = a2;
                i3 = a3;
                a4 = m29798a(rf);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            fn = C10233En.m26217a(fn, a5);
            i3 += i5;
            i4++;
            i2 = 4;
        }
        a4.f25605g.f25625b.f25620e = (C10705Rf.C10712g[]) arrayList2.toArray(new C10705Rf.C10712g[arrayList2.size()]);
        arrayList.add(new C11786tb(a4, fn));
        return arrayList;
    }

    C11524mb(C11559nb nbVar, C11343ib ibVar, C10821Un un, C11712rb rbVar) {
        this.f27724a = nbVar;
        this.f27725b = ibVar;
        this.f27726c = un;
        this.f27727d = rbVar;
    }

    /* renamed from: a */
    private C10705Rf m29798a(C10705Rf rf) {
        C10705Rf rf2 = new C10705Rf();
        rf2.f25600b = rf.f25600b;
        C10705Rf.C10713h hVar = new C10705Rf.C10713h();
        rf2.f25605g = hVar;
        hVar.f25625b = new C10705Rf.C10711f();
        C10705Rf.C10711f fVar = rf2.f25605g.f25625b;
        C10705Rf.C10711f fVar2 = rf.f25605g.f25625b;
        fVar.f25618c = fVar2.f25618c;
        fVar.f25617b = fVar2.f25617b;
        fVar.f25621f = fVar2.f25621f;
        fVar.f25619d = fVar2.f25619d;
        return rf2;
    }
}
