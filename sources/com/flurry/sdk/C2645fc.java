package com.flurry.sdk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: com.flurry.sdk.fc */
public final class C2645fc {

    /* renamed from: com.flurry.sdk.fc$a */
    public static class C2646a {
        /* renamed from: a */
        public static MessageDigest m5750a(String str) {
            try {
                return MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.flurry.sdk.fc$b */
    public static class C2647b {

        /* renamed from: a */
        private static final Random f6207a = new SecureRandom();

        /* renamed from: b */
        private static final char[] f6208b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

        /* renamed from: a */
        public static String m5751a() {
            char[] cArr = new char[32];
            for (int i = 0; i < 32; i++) {
                char[] cArr2 = f6208b;
                cArr[i] = cArr2[f6207a.nextInt(cArr2.length)];
            }
            return new String(cArr);
        }
    }
}
