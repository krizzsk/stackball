package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.I0 */
public enum C10351I0 {
    NATIVE(0),
    JS(1);
    

    /* renamed from: a */
    public final int f24858a;

    private C10351I0(int i) {
        this.f24858a = i;
    }

    /* renamed from: a */
    public static C10351I0 m26494a(int i) {
        C10351I0[] values = values();
        for (int i2 = 0; i2 < 2; i2++) {
            C10351I0 i0 = values[i2];
            if (i0.f24858a == i) {
                return i0;
            }
        }
        return NATIVE;
    }
}
