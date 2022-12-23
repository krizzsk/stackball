package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.N0 */
public enum C10533N0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);
    

    /* renamed from: a */
    public final int f25231a;

    private C10533N0(int i) {
        this.f25231a = i;
    }

    /* renamed from: a */
    public static C10533N0 m26998a(Integer num) {
        if (num != null) {
            C10533N0[] values = values();
            for (int i = 0; i < 3; i++) {
                C10533N0 n0 = values[i];
                if (n0.f25231a == num.intValue()) {
                    return n0;
                }
            }
        }
        return UNKNOWN;
    }
}
