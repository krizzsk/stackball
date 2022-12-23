package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ti */
public final class C10787Ti {

    /* renamed from: a */
    private final int f25881a;

    public C10787Ti(int i) {
        this.f25881a = i;
    }

    /* renamed from: a */
    public final int mo62303a() {
        return this.f25881a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C10787Ti) && this.f25881a == ((C10787Ti) obj).f25881a;
        }
        return true;
    }

    public int hashCode() {
        return this.f25881a;
    }

    public String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f25881a + ")";
    }
}
