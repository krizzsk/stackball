package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10705Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hb */
public class C11311hb implements C11488lb<C12024zb> {

    /* renamed from: a */
    private final C11343ib f27043a;

    public C11311hb() {
        this(new C11343ib());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Object mo61050b(Object obj) {
        C12024zb zbVar = (C12024zb) obj;
        C10705Rf rf = new C10705Rf();
        rf.f25604f = new C10705Rf.C10707b();
        C11786tb<C10705Rf.C10708c, C10265Fn> a = this.f27043a.mo61050b(zbVar.f28884c);
        rf.f25604f.f25609b = (C10705Rf.C10708c) a.f28287a;
        rf.f25600b = zbVar.f28883b;
        return Collections.singletonList(new C11786tb(rf, C10233En.m26217a(a)));
    }

    C11311hb(C11343ib ibVar) {
        this.f27043a = ibVar;
    }
}
