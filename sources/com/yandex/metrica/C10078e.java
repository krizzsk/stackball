package com.yandex.metrica;

@Deprecated
/* renamed from: com.yandex.metrica.e */
public enum C10078e {
    PHONE("phone"),
    TABLET("tablet"),
    TV("tv");
    

    /* renamed from: a */
    private final String f24244a;

    private C10078e(String str) {
        this.f24244a = str;
    }

    /* renamed from: a */
    public String mo60963a() {
        return this.f24244a;
    }

    /* renamed from: a */
    public static C10078e m25944a(String str) {
        C10078e[] values = values();
        for (int i = 0; i < 3; i++) {
            C10078e eVar = values[i];
            if (eVar.f24244a.equals(str)) {
                return eVar;
            }
        }
        return null;
    }
}
