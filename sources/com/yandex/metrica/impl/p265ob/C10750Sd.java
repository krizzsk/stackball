package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Sd */
public class C10750Sd implements C10808Ud {

    /* renamed from: a */
    private long f25772a;

    /* renamed from: b */
    private int f25773b;

    /* renamed from: c */
    private final C10782Td f25774c;

    /* renamed from: d */
    private final C10167Ci f25775d;

    /* renamed from: e */
    private final C10691R2 f25776e;

    /* renamed from: f */
    private final C10616Om f25777f;

    public C10750Sd(C10782Td td, C10167Ci ci) {
        this(td, ci, new C10691R2(), new C10580Nm());
    }

    /* renamed from: b */
    private void m27707b() {
        this.f25773b = this.f25774c.mo62299b();
        this.f25772a = this.f25774c.mo62296a();
    }

    /* renamed from: a */
    public boolean mo62128a() {
        C10167Ci ci = this.f25775d;
        if (ci != null) {
            long j = this.f25772a;
            if (j != 0) {
                C10691R2 r2 = this.f25776e;
                int i = ci.f24456b * ((1 << (this.f25773b - 1)) - 1);
                int i2 = ci.f24455a;
                if (i > i2) {
                    i = i2;
                }
                return r2.mo62107b(j, (long) i, "last send attempt");
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo62229c() {
        this.f25773b = 1;
        this.f25772a = 0;
        this.f25774c.mo62297a(1);
        this.f25774c.mo62298a(this.f25772a);
    }

    /* renamed from: d */
    public void mo62230d() {
        long b = this.f25777f.mo61841b();
        this.f25772a = b;
        this.f25773b++;
        this.f25774c.mo62298a(b);
        this.f25774c.mo62297a(this.f25773b);
    }

    C10750Sd(C10782Td td, C10167Ci ci, C10691R2 r2, C10616Om om) {
        this.f25775d = ci;
        this.f25774c = td;
        this.f25776e = r2;
        this.f25777f = om;
        m27707b();
    }
}
