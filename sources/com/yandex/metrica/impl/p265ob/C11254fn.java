package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.fn */
public class C11254fn implements C11473kn {

    /* renamed from: a */
    private final C11218en f26926a;

    C11254fn() {
        this(new C11167dn(C10619P0.m27164i().mo61879f()));
    }

    /* renamed from: a */
    public C11407jn mo62917a(C11411k0 k0Var) {
        String str;
        String p = k0Var.mo63163p();
        if (!TextUtils.isEmpty(p)) {
            try {
                byte[] a = this.f26926a.mo62846a(p.getBytes("UTF-8"));
                if (a != null) {
                    str = Base64.encodeToString(a, 0);
                    return new C11407jn(k0Var.mo62216f(str), C11538mn.AES_VALUE_ENCRYPTION);
                }
            } catch (Throwable unused) {
            }
        }
        str = null;
        return new C11407jn(k0Var.mo62216f(str), C11538mn.AES_VALUE_ENCRYPTION);
    }

    C11254fn(C11167dn dnVar) {
        this(new C11218en("AES/CBC/PKCS5Padding", dnVar.mo62800b(), dnVar.mo62799a()));
    }

    C11254fn(C11218en enVar) {
        this.f26926a = enVar;
    }

    /* renamed from: a */
    public byte[] mo62918a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            C11218en enVar = this.f26926a;
            enVar.getClass();
            return enVar.mo62847a(decode, 0, decode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
