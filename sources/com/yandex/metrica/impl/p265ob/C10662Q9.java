package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11169e;

/* renamed from: com.yandex.metrica.impl.ob.Q9 */
public class C10662Q9<T, P extends C11169e> {

    /* renamed from: a */
    private final String f25444a;

    /* renamed from: b */
    private final C11976y8 f25445b;

    /* renamed from: c */
    private final C10629P9<P> f25446c;

    /* renamed from: d */
    private final C11194ea<T, P> f25447d;

    public C10662Q9(String str, C11976y8 y8Var, C10629P9<P> p9, C11194ea<T, P> eaVar) {
        this.f25444a = str;
        this.f25445b = y8Var;
        this.f25446c = p9;
        this.f25447d = eaVar;
    }

    /* renamed from: a */
    public void mo61952a(T t) {
        this.f25445b.mo61855a(this.f25444a, this.f25446c.mo61715a(this.f25447d.mo61050b(t)));
    }

    /* renamed from: b */
    public T mo61953b() {
        try {
            byte[] a = this.f25445b.mo61856a(this.f25444a);
            if (C10796U2.m27893a(a)) {
                return this.f25447d.mo61049a(this.f25446c.mo61390a());
            }
            return this.f25447d.mo61049a(this.f25446c.mo61391a(a));
        } catch (Throwable unused) {
            return this.f25447d.mo61049a(this.f25446c.mo61390a());
        }
    }

    /* renamed from: a */
    public void mo61951a() {
        this.f25445b.mo61857b(this.f25444a);
    }
}
