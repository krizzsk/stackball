package com.fyber.inneractive.sdk.player.p059c.p080k;

import android.util.Pair;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.c */
public final class C3538c {

    /* renamed from: a */
    private static final byte[] f9590a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f9591b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f9592c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static byte[] m8789a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m8788a(byte[] bArr) {
        C3547j jVar = new C3547j(bArr);
        int a = m8787a(jVar);
        int b = m8791b(jVar);
        int c = jVar.mo19377c(4);
        if (a == 5 || a == 29) {
            b = m8791b(jVar);
            if (m8787a(jVar) == 22) {
                c = jVar.mo19377c(4);
            }
        }
        int i = f9592c[c];
        C3535a.m8782a(i != -1);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static byte[] m8790a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f9590a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f9590a.length, i2);
        return bArr3;
    }

    /* renamed from: a */
    private static int m8787a(C3547j jVar) {
        int c = jVar.mo19377c(5);
        return c == 31 ? jVar.mo19377c(6) + 32 : c;
    }

    /* renamed from: b */
    private static int m8791b(C3547j jVar) {
        int c = jVar.mo19377c(4);
        if (c == 15) {
            return jVar.mo19377c(24);
        }
        C3535a.m8782a(c < 13);
        return f9591b[c];
    }
}
