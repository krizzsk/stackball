package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.ee */
class C11207ee implements C11150de {

    /* renamed from: a */
    private final boolean f26831a;

    C11207ee(boolean z) {
        this.f26831a = z;
    }

    /* renamed from: a */
    public boolean mo62695a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f26831a;
        }
        return true;
    }

    public String toString() {
        return "LocationFlagStrategy{mEnabled=" + this.f26831a + '}';
    }
}
