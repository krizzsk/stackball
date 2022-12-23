package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.flurry.sdk.cs */
public class C2506cs<ObjectType> {

    /* renamed from: a */
    private static final String f5868a = C2506cs.class.getSimpleName();

    /* renamed from: b */
    private C2587dw<ObjectType> f5869b;

    public C2506cs(C2587dw<ObjectType> dwVar) {
        this.f5869b = dwVar;
    }

    /* renamed from: com.flurry.sdk.cs$a */
    public enum C2507a {
        NONE(""),
        CRYPTO_ALGO_PADDING_7("AES/CBC/PKCS7Padding"),
        CRYPTO_ALGO_PADDING_5("AES/CBC/PKCS5Padding");
        

        /* renamed from: d */
        String f5874d;

        private C2507a(String str) {
            this.f5874d = str;
        }

        /* renamed from: a */
        public static C2507a m5412a(int i) {
            for (C2507a aVar : values()) {
                if (aVar.ordinal() == i) {
                    return aVar;
                }
            }
            return NONE;
        }
    }

    /* renamed from: a */
    public final byte[] mo17715a(ObjectType objecttype, Key key, IvParameterSpec ivParameterSpec, C2507a aVar) throws IOException {
        if (objecttype == null || key == null || aVar == null) {
            C2530db.m5474a(5, f5868a, "Cannot encrypt, invalid params.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f5869b.mo17563a(byteArrayOutputStream, objecttype);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            Cipher instance = Cipher.getInstance(aVar.f5874d);
            instance.init(1, key, ivParameterSpec);
            return instance.doFinal(byteArray);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            String str = f5868a;
            C2530db.m5474a(5, str, "Error in encrypt " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final ObjectType mo17714a(byte[] bArr, Key key, IvParameterSpec ivParameterSpec, C2507a aVar) throws IOException {
        if (bArr == null || key == null || aVar == null) {
            C2530db.m5474a(5, f5868a, "Cannot decrypt, invalid params.");
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance(aVar.f5874d);
            instance.init(2, key, ivParameterSpec);
            return this.f5869b.mo17562a(new ByteArrayInputStream(instance.doFinal(bArr)));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            String str = f5868a;
            C2530db.m5474a(5, str, "Error in decrypt " + e.getMessage());
            return null;
        }
    }
}
