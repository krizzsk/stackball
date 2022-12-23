package com.yandex.mobile.ads.impl;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.mobile.ads.impl.f7 */
public class C13034f7 {

    /* renamed from: a */
    private final String f33253a;

    /* renamed from: b */
    private final byte[] f33254b;

    /* renamed from: c */
    private final byte[] f33255c;

    public C13034f7(String str, byte[] bArr, byte[] bArr2) {
        this.f33253a = str;
        this.f33254b = bArr;
        this.f33255c = bArr2;
    }

    /* renamed from: a */
    public byte[] mo66933a(byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f33254b, "AES");
        Cipher instance = Cipher.getInstance(this.f33253a);
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f33255c));
        return instance.doFinal(bArr);
    }
}
