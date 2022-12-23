package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.yandex.mobile.ads.impl.eg */
public final class C12972eg {

    /* renamed from: a */
    private static final byte[] f32966a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f32967b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f32968c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m35652a(byte[] bArr) throws jy0 {
        return m35651a(new ey0(bArr, bArr.length), false);
    }

    /* renamed from: a */
    public static byte[] m35653a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f32966a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m35651a(ey0 ey0, boolean z) throws jy0 {
        int a = ey0.mo66886a(5);
        if (a == 31) {
            a = ey0.mo66886a(6) + 32;
        }
        int a2 = m35650a(ey0);
        int a3 = ey0.mo66886a(4);
        if (a == 5 || a == 29) {
            a2 = m35650a(ey0);
            int a4 = ey0.mo66886a(5);
            if (a4 == 31) {
                a4 = ey0.mo66886a(6) + 32;
            }
            a = a4;
            if (a == 22) {
                a3 = ey0.mo66886a(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a == 6 || a == 7 || a == 17 || a == 1 || a == 2 || a == 3 || a == 4)) {
                switch (a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new jy0("Unsupported audio object type: " + a);
                }
            }
            ey0.mo66897d(1);
            if (ey0.mo66900f()) {
                ey0.mo66897d(14);
            }
            boolean f = ey0.mo66900f();
            if (a3 != 0) {
                if (a == 6 || a == 20) {
                    ey0.mo66897d(3);
                }
                if (f) {
                    if (a == 22) {
                        ey0.mo66897d(16);
                    }
                    if (a == 17 || a == 19 || a == 20 || a == 23) {
                        ey0.mo66897d(3);
                    }
                    ey0.mo66897d(1);
                }
                switch (a) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int a5 = ey0.mo66886a(2);
                        if (a5 == 2 || a5 == 3) {
                            throw new jy0("Unsupported epConfig: " + a5);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = f32968c[a3];
        if (i == -1) {
            z2 = false;
        }
        C13479j9.m37705a(z2);
        return Pair.create(Integer.valueOf(a2), Integer.valueOf(i));
    }

    /* renamed from: a */
    private static int m35650a(ey0 ey0) {
        int a = ey0.mo66886a(4);
        if (a == 15) {
            return ey0.mo66886a(24);
        }
        C13479j9.m37705a(a < 13);
        return f32967b[a];
    }
}
