package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Lm */
public class C10470Lm implements C11011a1 {

    /* renamed from: a */
    private volatile long f25135a;

    /* renamed from: b */
    private C10364I9 f25136b;

    /* renamed from: c */
    private C10616Om f25137c;

    /* renamed from: com.yandex.metrica.impl.ob.Lm$b */
    private static class C10472b {

        /* renamed from: a */
        static C10470Lm f25138a = new C10470Lm();
    }

    /* renamed from: c */
    public static C10470Lm m26853c() {
        return C10472b.f25138a;
    }

    /* renamed from: a */
    public synchronized long mo61544a() {
        return this.f25135a;
    }

    /* renamed from: b */
    public synchronized void mo61745b() {
        this.f25136b.mo61515c(false);
        this.f25136b.mo61454c();
    }

    /* renamed from: d */
    public synchronized void mo61746d() {
        C10364I9 u = C10619P0.m27164i().mo61893u();
        C10580Nm nm = new C10580Nm();
        this.f25136b = u;
        this.f25135a = u.mo61508b(0);
        this.f25137c = nm;
    }

    /* renamed from: e */
    public synchronized boolean mo61747e() {
        return this.f25136b.mo61507a(true);
    }

    private C10470Lm() {
    }

    /* renamed from: a */
    public synchronized void mo61744a(long j, Long l) {
        this.f25135a = (j - this.f25137c.mo61840a()) / 1000;
        boolean z = true;
        if (this.f25136b.mo61507a(true)) {
            if (l != null) {
                long abs = Math.abs(j - this.f25137c.mo61840a());
                C10364I9 i9 = this.f25136b;
                if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                    z = false;
                }
                i9.mo61515c(z);
            } else {
                this.f25136b.mo61515c(false);
            }
        }
        this.f25136b.mo61532l(this.f25135a);
        this.f25136b.mo61454c();
    }
}
