package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ii */
public class C11353ii {

    /* renamed from: a */
    private long f27127a;

    /* renamed from: b */
    private long f27128b;

    /* renamed from: c */
    private final C10616Om f27129c;

    /* renamed from: d */
    private final C10530Mm f27130d;

    C11353ii() {
        this(new C10580Nm(), new C10530Mm());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized double mo63046a() {
        return (double) this.f27130d.mo61805b(this.f27128b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized double mo63047b() {
        return (double) this.f27130d.mo61805b(this.f27127a, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo63048c() {
        this.f27128b = this.f27129c.mo61840a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo63049d() {
        this.f27127a = this.f27129c.mo61840a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo63050e() {
        this.f27128b = 0;
    }

    C11353ii(C10616Om om, C10530Mm mm) {
        this.f27129c = om;
        this.f27130d = mm;
    }
}
