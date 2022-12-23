package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Ui */
public class C10816Ui {

    /* renamed from: a */
    public final long f25965a;

    public C10816Ui(long j) {
        this.f25965a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10816Ui.class == obj.getClass() && this.f25965a == ((C10816Ui) obj).f25965a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f25965a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "StatSending{disabledReportingInterval=" + this.f25965a + '}';
    }
}
