package com.chartboost.sdk.Libraries;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.chartboost.sdk.Libraries.c */
public final class C1822c {
    /* renamed from: a */
    public static String m4016a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        Locale locale = Locale.US;
        return String.format(locale, "%0" + (bArr.length << 1) + "x", new Object[]{bigInteger});
    }

    /* renamed from: b */
    public static synchronized byte[] m4017b(byte[] bArr) {
        synchronized (C1822c.class) {
            if (bArr == null) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bArr);
                byte[] digest = instance.digest();
                return digest;
            } catch (NoSuchAlgorithmException e) {
                CBLogging.m3993b("CBCrypto", "sha1: " + e.toString());
                return null;
            } catch (Exception e2) {
                CBLogging.m3993b("CBCrypto", "sha1: " + e2.toString());
                return null;
            }
        }
    }

    /* renamed from: a */
    public static String m4015a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes("UTF-8"));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
