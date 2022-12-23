package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Vi */
public class C10856Vi {

    /* renamed from: a */
    public final C10857a f26092a;

    /* renamed from: b */
    public final C10857a f26093b;

    /* renamed from: com.yandex.metrica.impl.ob.Vi$a */
    public static class C10857a {

        /* renamed from: a */
        public final int f26094a;

        /* renamed from: b */
        public final long f26095b;

        public C10857a(int i, long j) {
            this.f26094a = i;
            this.f26095b = j;
        }

        public String toString() {
            return "Item{refreshEventCount=" + this.f26094a + ", refreshPeriodSeconds=" + this.f26095b + '}';
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vi$b */
    public enum C10858b {
        WIFI,
        CELL
    }

    public C10856Vi(C10857a aVar, C10857a aVar2) {
        this.f26092a = aVar;
        this.f26093b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.f26092a + ", wifi=" + this.f26093b + '}';
    }
}
