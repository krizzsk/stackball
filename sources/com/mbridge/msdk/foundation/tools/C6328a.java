package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.mbridge.msdk.foundation.tools.a */
/* compiled from: AESCBCUtil */
public final class C6328a {

    /* renamed from: a */
    private static byte[] f15699a = new byte[32];

    /* renamed from: b */
    private static byte[] f15700b = new byte[16];

    static {
        if (!TextUtils.isEmpty("ebmclXzZOhtU2sRlZxGL8A")) {
            try {
                byte[] digest = MessageDigest.getInstance("sha-384").digest("ebmclXzZOhtU2sRlZxGL8A".getBytes());
                System.arraycopy(digest, 0, f15699a, 0, 32);
                System.arraycopy(digest, 32, f15700b, 0, 16);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m16055a(String str) {
        return m16056a(str, f15699a, f15700b);
    }

    /* renamed from: a */
    private static String m16056a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C6329a());
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(instance.doFinal(str.getBytes()), 0));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.a$a */
    /* compiled from: AESCBCUtil */
    public static class C6329a extends Provider {
        public C6329a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }
}
