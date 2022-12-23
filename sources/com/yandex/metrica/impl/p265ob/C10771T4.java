package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p265ob.C10910X3;
import com.yandex.metrica.impl.p265ob.C10912X4;

/* renamed from: com.yandex.metrica.impl.ob.T4 */
public class C10771T4 implements C11369j4, C10946Y4, C11416k4 {

    /* renamed from: a */
    private final C11101c4 f25838a;

    /* renamed from: b */
    private final C11999z0 f25839b;

    /* renamed from: c */
    private C10799U4 f25840c;

    /* renamed from: d */
    private C12015z4 f25841d;

    /* renamed from: com.yandex.metrica.impl.ob.T4$a */
    static class C10772a {
        C10772a() {
        }

        /* renamed from: a */
        public C10799U4 mo62278a(Context context, C11101c4 c4Var, C10675Qi qi, C10912X4.C10913a aVar) {
            return new C10799U4(new C10912X4.C10914b(context, c4Var.mo62716b()), qi, aVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T4$b */
    static class C10773b {

        /* renamed from: a */
        private final C11575o1 f25842a;

        C10773b() {
            this(C10619P0.m27164i().mo61882j());
        }

        /* renamed from: a */
        public C11999z0<C10771T4> mo62279a(C10771T4 t4, C10890Wi wi, C10980Z4 z4, C10363I8 i8) {
            C11999z0<C10771T4> z0Var = new C11999z0<>(t4, wi.mo62455a(), z4, i8);
            this.f25842a.mo63391a(z0Var);
            return z0Var;
        }

        C10773b(C11575o1 o1Var) {
            this.f25842a = o1Var;
        }
    }

    public C10771T4(Context context, C11101c4 c4Var, C10910X3.C10911a aVar, C10675Qi qi, C10890Wi wi, CounterConfiguration.C10019b bVar) {
        this(context, c4Var, aVar, qi, wi, bVar, new C10980Z4(), new C10773b(), new C10772a(), new C12015z4(context, c4Var), C10619P0.m27164i().mo61897y().mo61659a(c4Var.mo62715a()));
    }

    /* renamed from: a */
    public void mo61737a(C10342Hi hi, C10675Qi qi) {
    }

    /* renamed from: a */
    public void mo62275a(C10910X3.C10911a aVar) {
        this.f25840c.mo62906a(aVar);
    }

    /* renamed from: b */
    public void mo62277b() {
        if (this.f25841d.mo64184a(((C10912X4) this.f25840c.mo62907b()).mo62473E())) {
            this.f25839b.mo64180a(C10385J0.m26634a());
            this.f25841d.mo64182a();
        }
    }

    /* renamed from: a */
    public void mo62276a(C11411k0 k0Var) {
        this.f25839b.mo64180a(k0Var);
    }

    /* renamed from: a */
    public synchronized void mo61738a(C10675Qi qi) {
        this.f25840c.mo62904a(qi);
        this.f25841d.mo64183a(qi.mo62001P());
    }

    /* renamed from: a */
    public C10912X4 mo62274a() {
        return (C10912X4) this.f25840c.mo62907b();
    }

    public C10771T4(Context context, C11101c4 c4Var, C10910X3.C10911a aVar, C10675Qi qi, C10890Wi wi, CounterConfiguration.C10019b bVar, C10980Z4 z4, C10773b bVar2, C10772a aVar2, C12015z4 z4Var, C10363I8 i8) {
        this.f25838a = c4Var;
        this.f25841d = z4Var;
        this.f25839b = bVar2.mo62279a(this, wi, z4, i8);
        synchronized (this) {
            this.f25841d.mo64183a(qi.mo62001P());
            this.f25840c = aVar2.mo62278a(context, c4Var, qi, new C10912X4.C10913a(aVar));
        }
    }
}
