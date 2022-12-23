package com.yandex.mobile.ads.impl;

public final class uf1 {
    /* renamed from: a */
    public static long m42679a(fy0 fy0, int i, int i2) {
        fy0.mo67112e(i);
        if (fy0.mo67098a() < 5) {
            return -9223372036854775807L;
        }
        int f = fy0.mo67113f();
        if ((8388608 & f) != 0 || ((2096896 & f) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((f & 32) != 0) && fy0.mo67126r() >= 7 && fy0.mo67098a() >= 7) {
            if ((fy0.mo67126r() & 16) == 16) {
                byte[] bArr = new byte[6];
                fy0.mo67104a(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
