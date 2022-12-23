package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

public final class so0 {

    /* renamed from: h */
    private static final String[] f40085h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    private static final int[] f40086i = {44100, OpusUtil.SAMPLE_RATE, 32000};

    /* renamed from: j */
    private static final int[] f40087j = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: k */
    private static final int[] f40088k = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: l */
    private static final int[] f40089l = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};

    /* renamed from: m */
    private static final int[] f40090m = {32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};

    /* renamed from: n */
    private static final int[] f40091n = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: a */
    public int f40092a;

    /* renamed from: b */
    public String f40093b;

    /* renamed from: c */
    public int f40094c;

    /* renamed from: d */
    public int f40095d;

    /* renamed from: e */
    public int f40096e;

    /* renamed from: f */
    public int f40097f;

    /* renamed from: g */
    public int f40098g;

    /* renamed from: a */
    public static int m42101a(int i) {
        int i2;
        int i3;
        if (!m42105c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m42102a(i2, i3);
    }

    /* renamed from: b */
    public static int m42104b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m42105c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f40086i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f40087j[i4 - 1] : f40088k[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f40089l[i4 - 1] : f40090m[i4 - 1];
        } else {
            i6 = f40091n[i4 - 1];
        }
        int i9 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* renamed from: c */
    private static boolean m42105c(int i) {
        return (i & -2097152) == -2097152;
    }

    /* renamed from: a */
    public static boolean m42103a(int i, so0 so0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (!m42105c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = f40086i[i5];
        int i11 = 2;
        if (i2 == 2) {
            i10 /= 2;
        } else if (i2 == 0) {
            i10 /= 4;
        }
        int i12 = (i >>> 9) & 1;
        int a = m42102a(i2, i3);
        if (i3 == 3) {
            i7 = i2 == 3 ? f40087j[i4 - 1] : f40088k[i4 - 1];
            i6 = (((i7 * 12) / i10) + i12) * 4;
        } else {
            if (i2 == 3) {
                i9 = i3 == 2 ? f40089l[i4 - 1] : f40090m[i4 - 1];
                i8 = (i9 * 144) / i10;
            } else {
                i9 = f40091n[i4 - 1];
                i8 = ((i3 == 1 ? 72 : 144) * i9) / i10;
            }
            i6 = i8 + i12;
        }
        String str = f40085h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i11 = 1;
        }
        so0.f40092a = i2;
        so0.f40093b = str;
        so0.f40094c = i6;
        so0.f40095d = i10;
        so0.f40096e = i11;
        so0.f40097f = i7;
        so0.f40098g = a;
        return true;
    }

    /* renamed from: a */
    private static int m42102a(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
