package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.gpllibrary.C10081a;
import com.yandex.metrica.impl.p265ob.C11428kg;

/* renamed from: com.yandex.metrica.impl.ob.na */
public class C11558na implements Object<C10336Hc, C11428kg.C11441k.C11442a.C11445b.C11446a> {
    /* renamed from: a */
    public C11428kg.C11441k.C11442a.C11445b.C11446a mo63374b(C10336Hc hc) {
        C11428kg.C11441k.C11442a.C11445b.C11446a aVar = new C11428kg.C11441k.C11442a.C11445b.C11446a();
        aVar.f27523b = hc.f24831b;
        aVar.f27524c = hc.f24832c;
        int ordinal = hc.f24830a.ordinal();
        int i = 3;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal != 3) {
            i = 0;
        }
        aVar.f27525d = i;
        return aVar;
    }

    /* renamed from: a */
    public C10336Hc mo63373a(C11428kg.C11441k.C11442a.C11445b.C11446a aVar) {
        C10081a.C10083b bVar;
        int i = aVar.f27525d;
        if (i == 1) {
            bVar = C10081a.C10083b.PRIORITY_LOW_POWER;
        } else if (i == 2) {
            bVar = C10081a.C10083b.PRIORITY_BALANCED_POWER_ACCURACY;
        } else if (i != 3) {
            bVar = C10081a.C10083b.PRIORITY_NO_POWER;
        } else {
            bVar = C10081a.C10083b.PRIORITY_HIGH_ACCURACY;
        }
        return new C10336Hc(bVar, aVar.f27523b, aVar.f27524c);
    }
}
