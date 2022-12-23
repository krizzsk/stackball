package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.ln */
public class C11508ln {

    /* renamed from: a */
    private final C10264Fm<C11538mn, C11473kn> f27702a;

    /* renamed from: b */
    private final C10264Fm<C11413k1, C11473kn> f27703b;

    public C11508ln() {
        this(new C11358in(), new C11571nn(), new C11254fn());
    }

    /* renamed from: a */
    public C11473kn mo63310a(C11538mn mnVar) {
        return this.f27702a.mo61334a(mnVar);
    }

    public C11508ln(C11473kn knVar, C11473kn knVar2, C11473kn knVar3) {
        C10264Fm<C11538mn, C11473kn> fm = new C10264Fm<>(knVar);
        this.f27702a = fm;
        fm.mo61336a(C11538mn.NONE, knVar);
        fm.mo61336a(C11538mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, knVar2);
        fm.mo61336a(C11538mn.AES_VALUE_ENCRYPTION, knVar3);
        C10264Fm<C11413k1, C11473kn> fm2 = new C10264Fm<>(knVar);
        this.f27703b = fm2;
        fm2.mo61336a(C11413k1.EVENT_TYPE_IDENTITY, knVar3);
    }

    /* renamed from: a */
    public C11473kn mo63309a(C11411k0 k0Var) {
        return this.f27703b.mo61334a(C11413k1.m29450a(k0Var.mo63161n()));
    }
}
