package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.ma */
public class C11523ma implements Object<C10220Ec, C11428kg.C11441k.C11442a.C11443a> {

    /* renamed from: a */
    private final C11487la f27723a;

    public C11523ma() {
        this(new C11487la());
    }

    C11523ma(C11487la laVar) {
        this.f27723a = laVar;
    }

    /* renamed from: a */
    public C11428kg.C11441k.C11442a.C11443a mo63320b(C10220Ec ec) {
        C11428kg.C11441k.C11442a.C11443a aVar = new C11428kg.C11441k.C11442a.C11443a();
        C11983yd ydVar = ec.f24582a;
        aVar.f27515b = ydVar.f28777a;
        aVar.f27516c = ydVar.f28778b;
        C10187Dc dc = ec.f24583b;
        if (dc != null) {
            this.f27723a.getClass();
            C11428kg.C11441k.C11442a.C11443a.C11444a aVar2 = new C11428kg.C11441k.C11442a.C11443a.C11444a();
            aVar2.f27518b = dc.f24488a;
            aVar2.f27519c = dc.f24489b;
            aVar.f27517d = aVar2;
        }
        return aVar;
    }

    /* renamed from: a */
    public C10220Ec mo63319a(C11428kg.C11441k.C11442a.C11443a aVar) {
        C10187Dc dc;
        C11428kg.C11441k.C11442a.C11443a.C11444a aVar2 = aVar.f27517d;
        if (aVar2 != null) {
            this.f27723a.getClass();
            dc = new C10187Dc(aVar2.f27518b, aVar2.f27519c);
        } else {
            dc = null;
        }
        return new C10220Ec(new C11983yd(aVar.f27515b, aVar.f27516c), dc);
    }
}
