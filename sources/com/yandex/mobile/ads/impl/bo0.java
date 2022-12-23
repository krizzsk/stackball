package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class bo0 {

    /* renamed from: a */
    private final String f31379a;

    /* renamed from: b */
    private final int f31380b;

    public bo0(String str, int i) {
        this("AES/CBC/PKCS5Padding", "RSA/ECB/PKCS1Padding", str, i);
    }

    /* renamed from: a */
    public byte[] mo66101a(byte[] bArr) {
        try {
            byte[] decode = Base64.decode(this.f31379a, 0);
            if (decode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                secureRandom.nextBytes(bArr2);
                return m34285a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
        }
        return null;
    }

    private bo0(String str, String str2, String str3, int i) {
        this.f31379a = str3;
        this.f31380b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[SYNTHETIC, Splitter:B:25:0x0064] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m34285a(byte[] r6, byte[] r7, byte[] r8, java.security.PublicKey r9) {
        /*
            r5 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0061 }
            int r2 = r7.length     // Catch:{ all -> 0x0061 }
            int r3 = r8.length     // Catch:{ all -> 0x0061 }
            int r2 = r2 + r3
            r1.<init>(r2)     // Catch:{ all -> 0x0061 }
            r1.write(r7)     // Catch:{ all -> 0x0057 }
            r1.write(r8)     // Catch:{ all -> 0x0057 }
            byte[] r2 = r1.toByteArray()     // Catch:{ all -> 0x0057 }
            r1.close()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ all -> 0x0061 }
            com.yandex.mobile.ads.impl.f7 r3 = new com.yandex.mobile.ads.impl.f7     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "AES/CBC/PKCS5Padding"
            r3.<init>(r4, r7, r8)     // Catch:{ all -> 0x0061 }
            r7 = 1
            r1.init(r7, r9)     // Catch:{ all -> 0x0061 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0061 }
            int r8 = r6.length     // Catch:{ all -> 0x0061 }
            r7.<init>(r8)     // Catch:{ all -> 0x0061 }
            r8 = 4
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ all -> 0x0055 }
            int r9 = r5.f31380b     // Catch:{ all -> 0x0055 }
            java.nio.ByteBuffer r8 = r8.putInt(r9)     // Catch:{ all -> 0x0055 }
            byte[] r8 = r8.array()     // Catch:{ all -> 0x0055 }
            r7.write(r8)     // Catch:{ all -> 0x0055 }
            byte[] r8 = r1.doFinal(r2)     // Catch:{ all -> 0x0055 }
            r7.write(r8)     // Catch:{ all -> 0x0055 }
            byte[] r6 = r3.mo66933a(r6)     // Catch:{ all -> 0x0055 }
            r7.write(r6)     // Catch:{ all -> 0x0055 }
            byte[] r6 = r7.toByteArray()     // Catch:{ all -> 0x0055 }
            r7.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            return r6
        L_0x0055:
            goto L_0x0062
        L_0x0057:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ all -> 0x0061 }
        L_0x0060:
            throw r6     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r7 = r0
        L_0x0062:
            if (r7 == 0) goto L_0x0067
            r7.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bo0.m34285a(byte[], byte[], byte[], java.security.PublicKey):byte[]");
    }
}
