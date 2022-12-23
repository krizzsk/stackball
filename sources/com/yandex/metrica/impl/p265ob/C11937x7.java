package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10460Lf;
import java.util.EnumMap;

/* renamed from: com.yandex.metrica.impl.ob.x7 */
public class C11937x7 implements C11194ea<C10451L7, C10460Lf> {

    /* renamed from: a */
    private static final EnumMap<C10590O7, Integer> f28705a;

    static {
        EnumMap<C10590O7, Integer> enumMap = new EnumMap<>(C10590O7.class);
        f28705a = enumMap;
        enumMap.put(C10590O7.UNKNOWN, 0);
        enumMap.put(C10590O7.BREAKPAD, 2);
        enumMap.put(C10590O7.CRASHPAD, 3);
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10460Lf lf = (C10460Lf) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C10460Lf mo61050b(C10451L7 l7) {
        C10460Lf lf = new C10460Lf();
        lf.f25121g = 1;
        C10460Lf.C10461a aVar = new C10460Lf.C10461a();
        lf.f25122h = aVar;
        aVar.f25126b = l7.mo61708a();
        C10422K7 b = l7.mo61709b();
        lf.f25122h.f25127c = new C10550Nf();
        Integer num = f28705a.get(b.mo61654b());
        if (num != null) {
            lf.f25122h.f25127c.f25249b = num.intValue();
        }
        C10550Nf nf = lf.f25122h.f25127c;
        String a = b.mo61653a();
        if (a == null) {
            a = "";
        }
        nf.f25250c = a;
        return lf;
    }
}
