package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.util.Arrays;
import java.util.List;

public final class k20 {

    /* renamed from: a */
    private static final int[] f35934a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f35935b = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};

    /* renamed from: c */
    private static final int[] f35936c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static Format m38148a(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        ey0 ey0;
        int i;
        byte[] bArr2 = bArr;
        int i2 = 0;
        if (bArr2[0] == Byte.MAX_VALUE) {
            ey0 = new ey0(bArr2, bArr2.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
            if (copyOf[0] == -2 || copyOf[0] == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b;
                }
            }
            ey0 = new ey0(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                ey0 ey02 = new ey0(copyOf, copyOf.length);
                while (ey02.mo66891b() >= 16) {
                    ey02.mo66897d(2);
                    ey0.mo66887a(ey02.mo66886a(14), 14);
                }
            }
            ey0.mo66888a(copyOf);
        }
        ey0.mo66897d(60);
        int i5 = f35934a[ey0.mo66886a(6)];
        int i6 = f35935b[ey0.mo66886a(4)];
        int a = ey0.mo66886a(5);
        int[] iArr = f35936c;
        if (a >= iArr.length) {
            i = -1;
        } else {
            i = (iArr[a] * 1000) / 2;
        }
        ey0.mo66897d(10);
        if (ey0.mo66886a(2) > 0) {
            i2 = 1;
        }
        return Format.m31683a(str, "audio/vnd.dts", (String) null, i, -1, i5 + i2, i6, -1, (List<byte[]>) null, (DrmInitData) null, 0, str2);
    }
}
