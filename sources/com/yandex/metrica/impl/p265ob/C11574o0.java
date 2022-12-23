package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.o0 */
class C11574o0 implements C10143Bk {

    /* renamed from: a */
    final /* synthetic */ C11668q0 f27803a;

    C11574o0(C11668q0 q0Var) {
        this.f27803a = q0Var;
    }

    /* renamed from: a */
    public void mo61033a(C10114Ak ak) {
        C10859Vj b = ak.mo61069b();
        if (b != null) {
            this.f27803a.f27997f.put("cellular_connection_type", b.mo62409m());
        }
        this.f27803a.f27997f.put("call_state", Integer.valueOf(ak.mo61068a()));
    }
}
