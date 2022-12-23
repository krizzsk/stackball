package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ke */
public class C10430Ke implements C11194ea<C10202E0, Integer> {
    /* renamed from: a */
    public Integer mo61050b(C10202E0 e0) {
        int ordinal = e0.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal != 3) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public C10202E0 mo61049a(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return C10202E0.APP;
        }
        if (intValue == 2) {
            return C10202E0.RETAIL;
        }
        if (intValue != 3) {
            return C10202E0.UNDEFINED;
        }
        return C10202E0.SATELLITE;
    }
}
