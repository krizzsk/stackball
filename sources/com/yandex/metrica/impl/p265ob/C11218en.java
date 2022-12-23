package com.yandex.metrica.impl.p265ob;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.en */
public class C11218en {

    /* renamed from: a */
    private final String f26853a;

    /* renamed from: b */
    private final byte[] f26854b;

    /* renamed from: c */
    private final byte[] f26855c;

    public C11218en(String str, byte[] bArr, byte[] bArr2) {
        this.f26853a = str;
        this.f26854b = bArr;
        this.f26855c = bArr2;
    }

    /* renamed from: a */
    public byte[] mo62846a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f26854b, "AES");
        Cipher instance = Cipher.getInstance(this.f26853a);
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f26855c));
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public byte[] mo62847a(byte[] bArr, int i, int i2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f26854b, "AES");
        Cipher instance = Cipher.getInstance(this.f26853a);
        instance.init(2, secretKeySpec, new IvParameterSpec(this.f26855c));
        return instance.doFinal(bArr, i, i2);
    }
}
