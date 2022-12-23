package com.fyber.inneractive.sdk.player.p059c.p060a;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.g */
public final class C3214g {

    /* renamed from: a */
    private static final int[] f8050a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f8051b = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};

    /* renamed from: c */
    private static final int[] f8052c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static C3290h m7785a(byte[] bArr, String str, String str2) {
        C3547j jVar = new C3547j(bArr);
        jVar.mo19376b(60);
        int i = f8050a[jVar.mo19377c(6)];
        int i2 = f8051b[jVar.mo19377c(4)];
        int c = jVar.mo19377c(5);
        int[] iArr = f8052c;
        int i3 = c >= iArr.length ? -1 : (iArr[c] * 1000) / 2;
        jVar.mo19376b(10);
        return C3290h.m8115a(str, "audio/vnd.dts", i3, -1, i + (jVar.mo19377c(2) > 0 ? 1 : 0), i2, (List<byte[]>) null, (C3227a) null, str2);
    }

    /* renamed from: a */
    public static int m7784a(byte[] bArr) {
        return ((((bArr[5] & 252) >> 2) | ((bArr[4] & 1) << 6)) + 1) * 32;
    }

    /* renamed from: a */
    public static int m7783a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        return ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
    }

    /* renamed from: b */
    public static int m7786b(byte[] bArr) {
        return (((bArr[7] & 240) >> 4) | ((bArr[5] & 2) << Ascii.f10102FF) | ((bArr[6] & 255) << 4)) + 1;
    }
}
