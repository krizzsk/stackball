package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.a0 */
class C0580a0 {

    /* renamed from: c */
    static C0580a0 f185c = new C0580a0(3, false);

    /* renamed from: d */
    static C0580a0 f186d = new C0580a0(3, true);

    /* renamed from: e */
    static C0580a0 f187e = new C0580a0(2, false);

    /* renamed from: f */
    static C0580a0 f188f = new C0580a0(2, true);

    /* renamed from: g */
    static C0580a0 f189g = new C0580a0(1, false);

    /* renamed from: h */
    static C0580a0 f190h = new C0580a0(1, true);

    /* renamed from: i */
    static C0580a0 f191i = new C0580a0(0, false);

    /* renamed from: j */
    static C0580a0 f192j = new C0580a0(0, true);

    /* renamed from: a */
    private final int f193a;

    /* renamed from: b */
    private final boolean f194b;

    /* renamed from: com.adcolony.sdk.a0$a */
    static class C0581a {

        /* renamed from: a */
        StringBuilder f195a = new StringBuilder();

        C0581a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0581a mo9415a(char c) {
            if (c != 10) {
                this.f195a.append(c);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0581a mo9419a(String str) {
            this.f195a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0581a mo9418a(Object obj) {
            if (obj != null) {
                this.f195a.append(obj.toString());
            } else {
                this.f195a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0581a mo9416a(double d) {
            C0849u0.m911a(d, 2, this.f195a);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0581a mo9417a(int i) {
            this.f195a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0581a mo9420a(boolean z) {
            this.f195a.append(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9421a(C0580a0 a0Var) {
            a0Var.m149a(this.f195a.toString());
        }
    }

    C0580a0(int i, boolean z) {
        this.f193a = i;
        this.f194b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m149a(String str) {
        C0578a.m143c().mo9616t().mo9484a(this.f193a, str, this.f194b);
    }
}
