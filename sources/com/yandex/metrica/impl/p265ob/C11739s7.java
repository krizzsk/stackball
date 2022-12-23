package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.s7 */
public class C11739s7 implements C11194ea<C11233f7, C10404Jf> {

    /* renamed from: a */
    private final C11708r7 f28124a;

    /* renamed from: b */
    private final C11781t7 f28125b;

    public C11739s7() {
        this(new C11708r7(new C10182D7()), new C11781t7());
    }

    /* renamed from: a */
    public Object mo61049a(Object obj) {
        C10404Jf jf = (C10404Jf) obj;
        throw new UnsupportedOperationException();
    }

    C11739s7(C11708r7 r7Var, C11781t7 t7Var) {
        this.f28124a = r7Var;
        this.f28125b = t7Var;
    }

    /* renamed from: a */
    public C10404Jf mo61050b(C11233f7 f7Var) {
        C10404Jf jf = new C10404Jf();
        jf.f25023b = this.f28124a.mo61050b(f7Var.f26894a);
        String str = f7Var.f26895b;
        if (str != null) {
            jf.f25024c = str;
        }
        jf.f25025d = this.f28125b.mo62559a(f7Var.f26896c);
        return jf;
    }
}
