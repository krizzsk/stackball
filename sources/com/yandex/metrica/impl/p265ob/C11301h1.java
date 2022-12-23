package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.h1 */
public class C11301h1 {

    /* renamed from: a */
    private final C10616Om f27023a;

    /* renamed from: b */
    private final C10691R2 f27024b;

    /* renamed from: c */
    private final C10364I9 f27025c;

    /* renamed from: d */
    private long f27026d;

    /* renamed from: e */
    private C12033zi f27027e;

    /* renamed from: f */
    private final C10868W0 f27028f;

    C11301h1(C10364I9 i9, C12033zi ziVar, C10616Om om, C10691R2 r2, C10868W0 w0) {
        this.f27025c = i9;
        this.f27027e = ziVar;
        this.f27026d = i9.mo61516d(0);
        this.f27023a = om;
        this.f27024b = r2;
        this.f27028f = w0;
    }

    /* renamed from: a */
    public void mo62985a() {
        C12033zi ziVar = this.f27027e;
        if (ziVar != null && this.f27024b.mo62107b(this.f27026d, ziVar.f28909a, "should send EVENT_IDENTITY_LIGHT")) {
            this.f27028f.mo61577b();
            long b = this.f27023a.mo61841b();
            this.f27026d = b;
            this.f27025c.mo61527i(b);
        }
    }

    /* renamed from: a */
    public void mo62986a(C12033zi ziVar) {
        this.f27027e = ziVar;
    }
}
