package com.yandex.metrica.impl.p265ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.Qe */
public class C10670Qe implements C11529mf {

    /* renamed from: a */
    private final C11508ln f25483a;

    public C10670Qe() {
        this(new C11508ln());
    }

    C10670Qe(C11508ln lnVar) {
        this.f25483a = lnVar;
    }

    /* renamed from: a */
    public byte[] mo61983a(C10926Xe xe, C11384jh jhVar) {
        byte[] bArr = new byte[0];
        String str = xe.f26258b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f25483a.mo63310a(xe.f26274r).mo62918a(bArr);
    }
}
