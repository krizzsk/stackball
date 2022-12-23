package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.ke1;

public final class je1 {

    /* renamed from: a */
    public final boolean f35268a;

    /* renamed from: b */
    public final String f35269b;

    /* renamed from: c */
    public final ke1.C13702a f35270c;

    /* renamed from: d */
    public final int f35271d;

    /* renamed from: e */
    public final byte[] f35272e;

    public je1(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        C13479j9.m37705a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f35268a = z;
        this.f35269b = str;
        this.f35271d = i;
        this.f35272e = bArr2;
        this.f35270c = new ke1.C13702a(m37777a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m37777a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 2;
        }
        if (!(c == 2 || c == 3)) {
            Log.w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        }
        return 1;
    }
}
