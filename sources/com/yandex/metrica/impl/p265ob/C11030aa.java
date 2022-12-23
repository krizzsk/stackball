package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10322H;
import com.yandex.metrica.impl.p265ob.C11083bg;

/* renamed from: com.yandex.metrica.impl.ob.aa */
public class C11030aa implements C11194ea<C10322H, C11083bg.C11084a> {
    /* renamed from: a */
    public C11083bg.C11084a mo61050b(C10322H h) {
        C11083bg.C11084a aVar = new C11083bg.C11084a();
        C10322H.C10323a aVar2 = h.f24797a;
        if (aVar2 != null) {
            int ordinal = aVar2.ordinal();
            if (ordinal == 0) {
                aVar.f26611b = 1;
            } else if (ordinal == 1) {
                aVar.f26611b = 2;
            } else if (ordinal == 2) {
                aVar.f26611b = 3;
            } else if (ordinal == 3) {
                aVar.f26611b = 4;
            } else if (ordinal == 4) {
                aVar.f26611b = 5;
            }
        }
        Boolean bool = h.f24798b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f26612c = 1;
            } else {
                aVar.f26612c = 0;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public C10322H mo61049a(C11083bg.C11084a aVar) {
        C10322H.C10323a aVar2;
        int i = aVar.f26611b;
        Boolean bool = null;
        if (i == 1) {
            aVar2 = C10322H.C10323a.ACTIVE;
        } else if (i == 2) {
            aVar2 = C10322H.C10323a.WORKING_SET;
        } else if (i == 3) {
            aVar2 = C10322H.C10323a.FREQUENT;
        } else if (i != 4) {
            aVar2 = i != 5 ? null : C10322H.C10323a.RESTRICTED;
        } else {
            aVar2 = C10322H.C10323a.RARE;
        }
        int i2 = aVar.f26612c;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C10322H(aVar2, bool);
    }
}
