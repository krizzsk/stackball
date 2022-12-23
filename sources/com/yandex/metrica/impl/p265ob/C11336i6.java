package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.i6 */
class C11336i6 implements C11194ea<C11306h6, C11209eg> {
    C11336i6() {
    }

    /* renamed from: a */
    public C11209eg mo61050b(C11306h6 h6Var) {
        C11209eg egVar = new C11209eg();
        egVar.f26835e = new int[h6Var.mo62993b().size()];
        int i = 0;
        for (Integer intValue : h6Var.mo62993b()) {
            egVar.f26835e[i] = intValue.intValue();
            i++;
        }
        egVar.f26834d = h6Var.mo62995c();
        egVar.f26833c = h6Var.mo62996d();
        egVar.f26832b = h6Var.mo62997e();
        return egVar;
    }

    /* renamed from: a */
    public C11306h6 mo61049a(C11209eg egVar) {
        return new C11306h6(egVar.f26832b, egVar.f26833c, egVar.f26834d, C10796U2.m27885a(egVar.f26835e));
    }
}
