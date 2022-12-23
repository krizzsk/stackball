package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.yc */
class C11982yc {

    /* renamed from: a */
    private C10807Uc f28774a;

    /* renamed from: b */
    private final C10129B8 f28775b;

    /* renamed from: c */
    private final C10101A8 f28776c;

    public C11982yc(C10807Uc uc, C10129B8 b8, C10101A8 a8) {
        this.f28774a = uc;
        this.f28775b = b8;
        this.f28776c = a8;
    }

    /* renamed from: a */
    public void mo64140a() {
        C10807Uc uc = this.f28774a;
        if (uc != null) {
            long c = this.f28775b.mo63591c();
            int i = uc.f25915f;
            boolean z = true;
            if (c > ((long) i)) {
                this.f28775b.mo63588b((int) (((float) i) * 0.1f));
            }
            C10807Uc uc2 = this.f28774a;
            long c2 = this.f28776c.mo63591c();
            int i2 = uc2.f25915f;
            if (c2 <= ((long) i2)) {
                z = false;
            }
            if (z) {
                this.f28776c.mo63588b((int) (((float) i2) * 0.1f));
            }
        }
    }

    /* renamed from: a */
    public void mo64141a(C10807Uc uc) {
        this.f28774a = uc;
    }
}
