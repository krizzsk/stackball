package com.adcolony.sdk;

import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.adcolony.sdk.x0 */
class C0893x0 {
    C0893x0() {
    }

    /* renamed from: a */
    private static String m1131a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            byte b2 = (b >>> 4) & Ascii.f10109SI;
            int i = 0;
            while (true) {
                sb.append((char) ((b2 < 0 || b2 > 9) ? (b2 - 10) + 97 : b2 + 48));
                b2 = b & Ascii.f10109SI;
                int i2 = i + 1;
                if (i >= 1) {
                    break;
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m1130a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(str.getBytes("iso-8859-1"), 0, str.length());
        return m1131a(instance.digest());
    }
}
