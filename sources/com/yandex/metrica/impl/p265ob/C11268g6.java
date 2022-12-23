package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.g6 */
public class C11268g6 {

    /* renamed from: a */
    private final int f26954a;

    /* renamed from: b */
    private final C11418k6 f26955b;

    /* renamed from: c */
    private C11306h6 f26956c;

    public C11268g6(Context context, C11101c4 c4Var, int i) {
        this(new C11418k6(context, c4Var), i);
    }

    /* renamed from: b */
    private void m29040b() {
        this.f26955b.mo63182a(this.f26956c);
    }

    /* renamed from: a */
    public C10533N0 mo62949a(String str) {
        C10533N0 n0;
        if (this.f26956c == null) {
            C11306h6 a = this.f26955b.mo63181a();
            this.f26956c = a;
            int d = a.mo62996d();
            int i = this.f26954a;
            if (d != i) {
                this.f26956c.mo62994b(i);
                m29040b();
            }
        }
        int hashCode = str.hashCode();
        if (this.f26956c.mo62993b().contains(Integer.valueOf(hashCode))) {
            return C10533N0.NON_FIRST_OCCURENCE;
        }
        if (this.f26956c.mo62997e()) {
            n0 = C10533N0.FIRST_OCCURRENCE;
        } else {
            n0 = C10533N0.UNKNOWN;
        }
        if (this.f26956c.mo62995c() < 1000) {
            this.f26956c.mo62991a(hashCode);
        } else {
            this.f26956c.mo62992a(false);
        }
        m29040b();
        return n0;
    }

    C11268g6(C11418k6 k6Var, int i) {
        this.f26954a = i;
        this.f26955b = k6Var;
    }

    /* renamed from: a */
    public void mo62950a() {
        if (this.f26956c == null) {
            C11306h6 a = this.f26955b.mo63181a();
            this.f26956c = a;
            int d = a.mo62996d();
            int i = this.f26954a;
            if (d != i) {
                this.f26956c.mo62994b(i);
                m29040b();
            }
        }
        this.f26956c.mo62990a();
        this.f26956c.mo62992a(true);
        m29040b();
    }
}
