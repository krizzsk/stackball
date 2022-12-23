package com.yandex.mobile.ads.impl;

import java.io.IOException;

final class y50 {
    /* renamed from: a */
    public static int m44209a(C13416ik ikVar, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3 = 0;
        while (i3 < i2) {
            int a = ikVar.mo67803a(bArr, i + i3, i2 - i3);
            if (a == -1) {
                break;
            }
            i3 += a;
        }
        return i3;
    }
}
