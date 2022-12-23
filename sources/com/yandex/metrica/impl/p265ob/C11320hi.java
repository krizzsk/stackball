package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.hi */
class C11320hi {

    /* renamed from: a */
    private final C10530Mm f27075a;

    /* renamed from: b */
    private final long f27076b;

    /* renamed from: c */
    private long f27077c;

    /* renamed from: d */
    private long f27078d;

    /* renamed from: e */
    private long f27079e;

    C11320hi(C10616Om om, C10530Mm mm) {
        this.f27076b = ((C10580Nm) om).mo61840a();
        this.f27075a = mm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63016a() {
        this.f27077c = this.f27075a.mo61805b(this.f27076b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63017b() {
        this.f27078d = this.f27075a.mo61805b(this.f27076b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo63018c() {
        this.f27079e = this.f27075a.mo61805b(this.f27076b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo63019d() {
        return this.f27077c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo63020e() {
        return this.f27078d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo63021f() {
        return this.f27079e;
    }
}
