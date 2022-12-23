package com.inmobi.media;

import android.util.Base64;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.inmobi.media.hc */
/* compiled from: RequestEncryptionUtils */
public class C5339hc {

    /* renamed from: a */
    private static final String f12224a = C5339hc.class.getSimpleName();

    /* renamed from: b */
    private static String f12225b = "AES";

    /* renamed from: c */
    private static String f12226c = "AES/CBC/PKCS7Padding";

    /* renamed from: d */
    private static byte[] f12227d;

    /* renamed from: a */
    public static String m12314a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, String str2, String str3) {
        try {
            byte[] b = m12323b(str.getBytes("UTF-8"), bArr, bArr2);
            byte[] b2 = m12322b(b, bArr3);
            byte[] a = m12317a(b);
            byte[] a2 = m12317a(b2);
            return new String(Base64.encode(m12319a(m12317a(m12318a(m12319a(m12319a(m12317a(bArr), m12317a(bArr3)), m12317a(bArr2)), str3, str2)), m12319a(a, a2)), 8));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static byte[] m12323b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f12225b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        try {
            Cipher instance = Cipher.getInstance(f12226c);
            instance.init(1, secretKeySpec, ivParameterSpec);
            instance.init(1, secretKeySpec, ivParameterSpec);
            instance.init(1, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static byte[] m12321b() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128, new SecureRandom());
            SecretKey generateKey = instance.generateKey();
            if (generateKey != null) {
                return generateKey.getEncoded();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static byte[] m12322b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, 0, bArr2.length, "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m12317a(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong((long) bArr.length);
        byte[] array = allocate.array();
        byte[] bArr2 = new byte[(array.length + bArr.length)];
        System.arraycopy(array, 0, bArr2, 0, array.length);
        System.arraycopy(bArr, 0, bArr2, array.length, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m12318a(byte[] bArr, String str, String str2) {
        BigInteger bigInteger = new BigInteger(str2, 16);
        BigInteger bigInteger2 = new BigInteger(str, 16);
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/nopadding");
            instance.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2)));
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m12319a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|18|19|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|10|(2:12|13)(2:14|(5:16|17|18|19|20))|21|22|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized byte[] m12315a() {
        /*
            java.lang.Class<com.inmobi.media.hc> r0 = com.inmobi.media.C5339hc.class
            monitor-enter(r0)
            android.content.Context r1 = com.inmobi.media.C5314go.m12203c()     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x000d
            byte[] r1 = f12227d     // Catch:{ all -> 0x005c }
            monitor-exit(r0)
            return r1
        L_0x000d:
            com.inmobi.media.gz r2 = new com.inmobi.media.gz     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "aes_key_store"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x005c }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            long r5 = r2.mo40671a()     // Catch:{ all -> 0x005c }
            long r3 = r3 - r5
            r5 = 86400(0x15180, double:4.26873E-319)
            r1 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0038
            byte[] r3 = m12321b()     // Catch:{ Exception -> 0x0058 }
            f12227d = r3     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = android.util.Base64.encodeToString(r3, r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r3 = "aes_public_key"
            r2.mo40679b(r3, r1)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0058
        L_0x0038:
            byte[] r3 = f12227d     // Catch:{ Exception -> 0x0058 }
            if (r3 != 0) goto L_0x0058
            java.lang.String r3 = "aes_public_key"
            java.lang.String r3 = r2.mo40677b(r3)     // Catch:{ Exception -> 0x0058 }
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0049 }
            f12227d = r3     // Catch:{ IllegalArgumentException -> 0x0049 }
            goto L_0x0058
        L_0x0049:
            byte[] r3 = m12321b()     // Catch:{ Exception -> 0x0058 }
            f12227d = r3     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = android.util.Base64.encodeToString(r3, r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r3 = "aes_public_key"
            r2.mo40679b(r3, r1)     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            byte[] r1 = f12227d     // Catch:{ all -> 0x005c }
            monitor-exit(r0)
            return r1
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5339hc.m12315a():byte[]");
    }

    /* renamed from: a */
    public static byte[] m12320a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f12225b);
        try {
            Cipher instance = Cipher.getInstance(f12226c);
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m12316a(int i) {
        byte[] bArr = new byte[i];
        try {
            new SecureRandom().nextBytes(bArr);
        } catch (Exception unused) {
        }
        return bArr;
    }
}
