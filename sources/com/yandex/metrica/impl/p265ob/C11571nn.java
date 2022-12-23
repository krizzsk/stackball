package com.yandex.metrica.impl.p265ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.nn */
public class C11571nn implements C11473kn {
    /* renamed from: a */
    public C11407jn mo62917a(C11411k0 k0Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public byte[] mo62918a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
