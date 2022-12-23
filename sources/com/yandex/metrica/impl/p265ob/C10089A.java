package com.yandex.metrica.impl.p265ob;

import android.util.Pair;

/* renamed from: com.yandex.metrica.impl.ob.A */
public class C10089A {

    /* renamed from: a */
    private C10320Gm f24292a;

    /* renamed from: b */
    private long f24293b;

    /* renamed from: c */
    private boolean f24294c;

    /* renamed from: d */
    private final C10473Ln f24295d;

    /* renamed from: com.yandex.metrica.impl.ob.A$a */
    public static final class C10090a {

        /* renamed from: a */
        public final String f24296a;

        /* renamed from: b */
        public final long f24297b;

        public C10090a(String str, long j) {
            this.f24296a = str;
            this.f24297b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10090a.class != obj.getClass()) {
                return false;
            }
            C10090a aVar = (C10090a) obj;
            if (this.f24297b != aVar.f24297b) {
                return false;
            }
            String str = this.f24296a;
            String str2 = aVar.f24296a;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
                return true;
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f24296a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f24297b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public C10089A(String str, long j, C10380Im im) {
        this(str, j, new C10473Ln(im, "[App Environment]"));
    }

    /* renamed from: a */
    public synchronized void mo61035a(Pair<String, String> pair) {
        if (this.f24295d.mo61749b(this.f24292a, (String) pair.first, (String) pair.second)) {
            this.f24294c = true;
        }
    }

    /* renamed from: b */
    public synchronized void mo61036b() {
        this.f24292a = new C10320Gm();
    }

    public synchronized String toString() {
        return "Map size " + this.f24292a.size() + ". Is changed " + this.f24294c + ". Current revision " + this.f24293b;
    }

    C10089A(String str, long j, C10473Ln ln) {
        this.f24293b = j;
        try {
            this.f24292a = new C10320Gm(str);
        } catch (Throwable unused) {
            this.f24292a = new C10320Gm();
        }
        this.f24295d = ln;
    }

    /* renamed from: a */
    public synchronized C10090a mo61034a() {
        if (this.f24294c) {
            this.f24293b++;
            this.f24294c = false;
        }
        return new C10090a(C11993ym.m30997g(this.f24292a), this.f24293b);
    }
}
