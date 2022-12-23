package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.k */
public final class C3274k {

    /* renamed from: h */
    private static final String[] f8382h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    private static final int[] f8383i = {44100, OpusUtil.SAMPLE_RATE, 32000};

    /* renamed from: j */
    private static final int[] f8384j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    private static final int[] f8385k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    private static final int[] f8386l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    private static final int[] f8387m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    private static final int[] f8388n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f8389a;

    /* renamed from: b */
    public String f8390b;

    /* renamed from: c */
    public int f8391c;

    /* renamed from: d */
    public int f8392d;

    /* renamed from: e */
    public int f8393e;

    /* renamed from: f */
    public int f8394f;

    /* renamed from: g */
    public int f8395g;

    /* renamed from: a */
    public static int m8037a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f8383i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f8384j[i4 - 1] : f8385k[i4 - 1]) * 12000) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f8386l[i4 - 1] : f8387m[i4 - 1];
        } else {
            i6 = f8388n[i4 - 1];
        }
        int i9 = 144000;
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* renamed from: a */
    public static boolean m8038a(int i, C3274k kVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i11 = f8383i[i5];
        int i12 = 2;
        if (i2 == 2) {
            i11 /= 2;
        } else if (i2 == 0) {
            i11 /= 4;
        }
        int i13 = (i >>> 9) & 1;
        if (i3 == 3) {
            i8 = i2 == 3 ? f8384j[i4 - 1] : f8385k[i4 - 1];
            i6 = (((i8 * 12000) / i11) + i13) * 4;
            i7 = 384;
        } else {
            int i14 = 1152;
            if (i2 == 3) {
                i10 = i3 == 2 ? f8386l[i4 - 1] : f8387m[i4 - 1];
            } else {
                i10 = f8388n[i4 - 1];
                if (i3 == 1) {
                    i14 = 576;
                }
                if (i3 == 1) {
                    i9 = DefaultOggSeeker.MATCH_RANGE;
                    int i15 = i14;
                    i6 = i13 + ((i9 * i8) / i11);
                    i7 = i15;
                }
            }
            i9 = 144000;
            int i152 = i14;
            i6 = i13 + ((i9 * i8) / i11);
            i7 = i152;
        }
        String str = f8382h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i12 = 1;
        }
        kVar.f8389a = i2;
        kVar.f8390b = str;
        kVar.f8391c = i6;
        kVar.f8392d = i11;
        kVar.f8393e = i12;
        kVar.f8394f = i8 * 1000;
        kVar.f8395g = i7;
        return true;
    }
}
