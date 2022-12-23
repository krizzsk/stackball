package com.yandex.metrica.impl.p265ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.be */
public class C11080be implements C11150de {

    /* renamed from: a */
    private final C11150de f26604a;

    /* renamed from: b */
    private final C11150de f26605b;

    /* renamed from: com.yandex.metrica.impl.ob.be$a */
    public static class C11081a {

        /* renamed from: a */
        private C11150de f26606a;

        /* renamed from: b */
        private C11150de f26607b;

        public C11081a(C11150de deVar, C11150de deVar2) {
            this.f26606a = deVar;
            this.f26607b = deVar2;
        }

        /* renamed from: a */
        public C11081a mo62697a(C10675Qi qi) {
            this.f26607b = new C11528me(qi.mo61990E());
            return this;
        }

        /* renamed from: a */
        public C11081a mo62698a(boolean z) {
            this.f26606a = new C11207ee(z);
            return this;
        }

        /* renamed from: a */
        public C11080be mo62699a() {
            return new C11080be(this.f26606a, this.f26607b);
        }
    }

    C11080be(C11150de deVar, C11150de deVar2) {
        this.f26604a = deVar;
        this.f26605b = deVar2;
    }

    /* renamed from: b */
    public static C11081a m28584b() {
        return new C11081a(new C11207ee(false), new C11528me((List<C11347ie>) null));
    }

    /* renamed from: a */
    public boolean mo62695a(String str) {
        return this.f26605b.mo62695a(str) && this.f26604a.mo62695a(str);
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.f26604a + ", mStartupStateStrategy=" + this.f26605b + '}';
    }

    /* renamed from: a */
    public C11081a mo62694a() {
        return new C11081a(this.f26604a, this.f26605b);
    }
}
