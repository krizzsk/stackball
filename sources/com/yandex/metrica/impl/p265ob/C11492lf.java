package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.lf */
public class C11492lf implements C11529mf {

    /* renamed from: a */
    private final C11508ln f27662a;

    public C11492lf() {
        this(new C11508ln());
    }

    C11492lf(C11508ln lnVar) {
        this.f27662a = lnVar;
    }

    /* renamed from: a */
    public byte[] mo61983a(C10926Xe xe, C11384jh jhVar) {
        byte[] bArr = new byte[0];
        try {
            bArr = C10823V0.m27968a(xe.f26258b);
        } catch (Throwable unused) {
        }
        byte[] a = this.f27662a.mo63310a(xe.f26274r).mo62918a(bArr);
        return a == null ? new byte[0] : a;
    }
}
