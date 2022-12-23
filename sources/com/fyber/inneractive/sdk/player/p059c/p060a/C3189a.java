package com.fyber.inneractive.sdk.player.p059c.p060a;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.a */
public final class C3189a {

    /* renamed from: a */
    private static final int[] f7928a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f7929b = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* renamed from: c */
    private static final int[] f7930c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: d */
    private static final int[] f7931d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f7932e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f7933f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m7718a() {
        return 1536;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.a$a */
    public static final class C3190a {

        /* renamed from: a */
        public final String f7934a;

        /* renamed from: b */
        public final int f7935b;

        /* renamed from: c */
        public final int f7936c;

        /* renamed from: d */
        public final int f7937d;

        /* renamed from: e */
        public final int f7938e;

        /* synthetic */ C3190a(String str, int i, int i2, int i3, int i4, byte b) {
            this(str, i, i2, i3, i4);
        }

        private C3190a(String str, int i, int i2, int i3, int i4) {
            this.f7934a = str;
            this.f7936c = i;
            this.f7935b = i2;
            this.f7937d = i3;
            this.f7938e = i4;
        }
    }

    /* renamed from: a */
    public static C3290h m7723a(C3548k kVar, String str, String str2, C3227a aVar) {
        int i = f7929b[(kVar.mo19387d() & 192) >> 6];
        int d = kVar.mo19387d();
        int i2 = f7931d[(d & 56) >> 3];
        if ((d & 4) != 0) {
            i2++;
        }
        return C3290h.m8115a(str, "audio/ac3", -1, -1, i2, i, (List<byte[]>) null, aVar, str2);
    }

    /* renamed from: b */
    public static C3290h m7724b(C3548k kVar, String str, String str2, C3227a aVar) {
        kVar.mo19388d(2);
        int i = f7929b[(kVar.mo19387d() & 192) >> 6];
        int d = kVar.mo19387d();
        int i2 = f7931d[(d & 14) >> 1];
        if ((d & 1) != 0) {
            i2++;
        }
        return C3290h.m8115a(str, "audio/eac3", -1, -1, i2, i, (List<byte[]>) null, aVar, str2);
    }

    /* renamed from: a */
    public static int m7721a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return m7719a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: a */
    public static int m7720a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f7928a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: a */
    private static int m7719a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f7929b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f7933f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f7932e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: a */
    public static C3190a m7722a(C3547j jVar) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6 = (jVar.f9622b * 8) + jVar.f9623c;
        jVar.mo19376b(40);
        boolean z = jVar.mo19377c(5) == 16;
        jVar.mo19374a(i6);
        int i7 = 6;
        if (z) {
            jVar.mo19376b(21);
            int c = (jVar.mo19377c(11) + 1) * 2;
            int c2 = jVar.mo19377c(2);
            if (c2 == 3) {
                i5 = f7930c[jVar.mo19377c(2)];
            } else {
                i7 = f7928a[jVar.mo19377c(2)];
                i5 = f7929b[c2];
            }
            i4 = jVar.mo19377c(3);
            i = i7 * 256;
            i2 = c;
            i3 = i5;
            str = "audio/eac3";
        } else {
            jVar.mo19376b(32);
            int c3 = jVar.mo19377c(2);
            int a = m7719a(c3, jVar.mo19377c(6));
            jVar.mo19376b(8);
            int c4 = jVar.mo19377c(3);
            if (!((c4 & 1) == 0 || c4 == 1)) {
                jVar.mo19376b(2);
            }
            if ((c4 & 4) != 0) {
                jVar.mo19376b(2);
            }
            if (c4 == 2) {
                jVar.mo19376b(2);
            }
            i2 = a;
            i4 = c4;
            i3 = f7929b[c3];
            str = "audio/ac3";
            i = 1536;
        }
        return new C3190a(str, f7931d[i4] + (jVar.mo19375a() ? 1 : 0), i3, i2, i, (byte) 0);
    }
}
