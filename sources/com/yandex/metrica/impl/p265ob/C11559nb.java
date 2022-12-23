package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nb */
public class C11559nb implements C11194ea<Map<String, String>, C11786tb<C10705Rf.C10714i, C10265Fn>> {

    /* renamed from: a */
    private final C10865Vn f27783a;

    public C11559nb() {
        this(new C10865Vn(20480, 100, 1000));
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C11786tb tbVar = (C11786tb) obj;
        throw new UnsupportedOperationException();
    }

    public C11559nb(C10865Vn vn) {
        this.f27783a = vn;
    }

    /* renamed from: a */
    public C11786tb<C10705Rf.C10714i, C10265Fn> mo61050b(Map<String, String> map) {
        C10682Qn<Map<String, String>, C10349Hn> a = this.f27783a.mo62210a(map);
        C10705Rf.C10714i iVar = new C10705Rf.C10714i();
        iVar.f25627c = ((C10349Hn) a.f25556b).f24852b;
        Map map2 = (Map) a.f25555a;
        if (map2 != null) {
            iVar.f25626b = new C10705Rf.C10714i.C10715a[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                iVar.f25626b[i] = new C10705Rf.C10714i.C10715a();
                iVar.f25626b[i].f25629b = C10585O2.m27106c((String) entry.getKey());
                iVar.f25626b[i].f25630c = C10585O2.m27106c((String) entry.getValue());
                i++;
            }
        }
        return new C11786tb<>(iVar, a.f25556b);
    }
}
