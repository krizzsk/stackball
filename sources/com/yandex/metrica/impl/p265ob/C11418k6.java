package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.k6 */
public class C11418k6 {

    /* renamed from: a */
    private final C11336i6 f27379a;

    /* renamed from: b */
    private final C11371j6 f27380b;

    /* renamed from: c */
    private final C11976y8 f27381c;

    public C11418k6(Context context, C11101c4 c4Var) {
        this(new C11371j6(), new C11336i6(), C10663Qa.m27298a(context).mo61956a(c4Var), "event_hashes");
    }

    /* renamed from: a */
    public C11306h6 mo63181a() {
        try {
            byte[] a = this.f27381c.mo61856a("event_hashes");
            if (C10796U2.m27893a(a)) {
                C11336i6 i6Var = this.f27379a;
                this.f27380b.getClass();
                return i6Var.mo61049a(new C11209eg());
            }
            C11336i6 i6Var2 = this.f27379a;
            this.f27380b.getClass();
            return i6Var2.mo61049a((C11209eg) C11169e.m28803a(new C11209eg(), a));
        } catch (Throwable unused) {
            C11336i6 i6Var3 = this.f27379a;
            this.f27380b.getClass();
            return i6Var3.mo61049a(new C11209eg());
        }
    }

    C11418k6(C11371j6 j6Var, C11336i6 i6Var, C11976y8 y8Var, String str) {
        this.f27380b = j6Var;
        this.f27379a = i6Var;
        this.f27381c = y8Var;
    }

    /* renamed from: a */
    public void mo63182a(C11306h6 h6Var) {
        C11976y8 y8Var = this.f27381c;
        C11371j6 j6Var = this.f27380b;
        C11209eg a = this.f27379a.mo61050b(h6Var);
        j6Var.getClass();
        y8Var.mo61855a("event_hashes", C11169e.m28804a((C11169e) a));
    }
}
