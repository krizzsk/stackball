package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.oa */
public class C11595oa implements Object<C10401Jc, C11428kg.C11441k.C11442a.C11445b> {

    /* renamed from: a */
    private final C11558na f27842a;

    public C11595oa() {
        this(new C11558na());
    }

    C11595oa(C11558na naVar) {
        this.f27842a = naVar;
    }

    /* renamed from: a */
    public C11428kg.C11441k.C11442a.C11445b mo63429b(C10401Jc jc) {
        C11428kg.C11441k.C11442a.C11445b bVar = new C11428kg.C11441k.C11442a.C11445b();
        C11983yd ydVar = jc.f25020a;
        bVar.f27520b = ydVar.f28777a;
        bVar.f27521c = ydVar.f28778b;
        C10336Hc hc = jc.f25021b;
        if (hc != null) {
            bVar.f27522d = this.f27842a.mo63374b(hc);
        }
        return bVar;
    }

    /* renamed from: a */
    public C10401Jc mo63428a(C11428kg.C11441k.C11442a.C11445b bVar) {
        C11428kg.C11441k.C11442a.C11445b.C11446a aVar = bVar.f27522d;
        return new C10401Jc(new C11983yd(bVar.f27520b, bVar.f27521c), aVar != null ? this.f27842a.mo63373a(aVar) : null);
    }
}
