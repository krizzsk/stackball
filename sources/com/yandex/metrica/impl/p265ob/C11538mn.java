package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.mn */
public enum C11538mn {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);
    

    /* renamed from: a */
    private final int f27741a;

    private C11538mn(int i) {
        this.f27741a = i;
    }

    /* renamed from: a */
    public int mo63328a() {
        return this.f27741a;
    }

    /* renamed from: a */
    public static C11538mn m29810a(Integer num) {
        if (num != null) {
            C11538mn[] values = values();
            for (int i = 0; i < 3; i++) {
                C11538mn mnVar = values[i];
                if (mnVar.f27741a == num.intValue()) {
                    return mnVar;
                }
            }
        }
        return NONE;
    }
}
