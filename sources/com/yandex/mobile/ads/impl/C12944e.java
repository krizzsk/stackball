package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.e */
public final class C12944e {

    /* renamed from: a */
    private static final int[] f32856a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f32857b = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* renamed from: c */
    private static final int[] f32858c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: d */
    private static final int[] f32859d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f32860e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f32861f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.yandex.mobile.ads.impl.e$b */
    public static final class C12946b {

        /* renamed from: a */
        public final String f32862a;

        /* renamed from: b */
        public final int f32863b;

        /* renamed from: c */
        public final int f32864c;

        /* renamed from: d */
        public final int f32865d;

        /* renamed from: e */
        public final int f32866e;

        private C12946b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f32862a = str;
            this.f32864c = i2;
            this.f32863b = i3;
            this.f32865d = i4;
            this.f32866e = i5;
        }
    }

    /* renamed from: a */
    public static Format m35518a(fy0 fy0, String str, String str2, DrmInitData drmInitData) {
        int i = f32857b[(fy0.mo67126r() & 192) >> 6];
        int r = fy0.mo67126r();
        int i2 = f32859d[(r & 56) >> 3];
        if ((r & 4) != 0) {
            i2++;
        }
        return Format.m31683a(str, "audio/ac3", (String) null, -1, -1, i2, i, -1, (List<byte[]>) null, drmInitData, 0, str2);
    }

    /* renamed from: b */
    public static Format m35520b(fy0 fy0, String str, String str2, DrmInitData drmInitData) {
        fy0.mo67114f(2);
        int i = f32857b[(fy0.mo67126r() & 192) >> 6];
        int r = fy0.mo67126r();
        int i2 = f32859d[(r & 14) >> 1];
        if ((r & 1) != 0) {
            i2++;
        }
        if (((fy0.mo67126r() & 30) >> 1) > 0 && (2 & fy0.mo67126r()) != 0) {
            i2 += 2;
        }
        return Format.m31683a(str, (fy0.mo67098a() <= 0 || (fy0.mo67126r() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, -1, (List<byte[]>) null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static C12946b m35519a(ey0 ey0) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ey0 ey02 = ey0;
        int e = ey0.mo66898e();
        ey02.mo66897d(40);
        boolean z = ey02.mo66886a(5) > 10;
        ey02.mo66895c(e);
        int i12 = -1;
        if (z) {
            ey02.mo66897d(16);
            int a = ey02.mo66886a(2);
            if (a == 0) {
                i12 = 0;
            } else if (a == 1) {
                i12 = 1;
            } else if (a == 2) {
                i12 = 2;
            }
            ey02.mo66897d(3);
            int a2 = (ey02.mo66886a(11) + 1) * 2;
            int a3 = ey02.mo66886a(2);
            if (a3 == 3) {
                i6 = f32858c[ey02.mo66886a(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = ey02.mo66886a(2);
                i7 = f32856a[i8];
                i6 = f32857b[a3];
            }
            int i13 = i7 * 256;
            int a4 = ey02.mo66886a(3);
            boolean f = ey0.mo66900f();
            int i14 = f32859d[a4] + (f ? 1 : 0);
            ey02.mo66897d(10);
            if (ey0.mo66900f()) {
                ey02.mo66897d(8);
            }
            if (a4 == 0) {
                ey02.mo66897d(5);
                if (ey0.mo66900f()) {
                    ey02.mo66897d(8);
                }
            }
            if (i12 == 1 && ey0.mo66900f()) {
                ey02.mo66897d(16);
            }
            if (ey0.mo66900f()) {
                if (a4 > 2) {
                    ey02.mo66897d(2);
                }
                if ((a4 & 1) == 0 || a4 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    ey02.mo66897d(6);
                }
                if ((a4 & 4) != 0) {
                    ey02.mo66897d(i10);
                }
                if (f && ey0.mo66900f()) {
                    ey02.mo66897d(5);
                }
                if (i12 == 0) {
                    if (ey0.mo66900f()) {
                        i11 = 6;
                        ey02.mo66897d(6);
                    } else {
                        i11 = 6;
                    }
                    if (a4 == 0 && ey0.mo66900f()) {
                        ey02.mo66897d(i11);
                    }
                    if (ey0.mo66900f()) {
                        ey02.mo66897d(i11);
                    }
                    int a5 = ey02.mo66886a(2);
                    if (a5 == 1) {
                        ey02.mo66897d(5);
                    } else if (a5 == 2) {
                        ey02.mo66897d(12);
                    } else if (a5 == 3) {
                        int a6 = ey02.mo66886a(5);
                        if (ey0.mo66900f()) {
                            ey02.mo66897d(5);
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(4);
                            }
                            if (ey0.mo66900f()) {
                                if (ey0.mo66900f()) {
                                    ey02.mo66897d(4);
                                }
                                if (ey0.mo66900f()) {
                                    ey02.mo66897d(4);
                                }
                            }
                        }
                        if (ey0.mo66900f()) {
                            ey02.mo66897d(5);
                            if (ey0.mo66900f()) {
                                ey02.mo66897d(7);
                                if (ey0.mo66900f()) {
                                    ey02.mo66897d(8);
                                }
                            }
                        }
                        ey02.mo66897d((a6 + 2) * 8);
                        ey0.mo66894c();
                    }
                    if (a4 < 2) {
                        if (ey0.mo66900f()) {
                            ey02.mo66897d(14);
                        }
                        if (a4 == 0 && ey0.mo66900f()) {
                            ey02.mo66897d(14);
                        }
                    }
                    if (ey0.mo66900f()) {
                        if (i8 == 0) {
                            ey02.mo66897d(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (ey0.mo66900f()) {
                                    ey02.mo66897d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (ey0.mo66900f()) {
                ey02.mo66897d(5);
                if (a4 == 2) {
                    ey02.mo66897d(4);
                }
                if (a4 >= 6) {
                    ey02.mo66897d(2);
                }
                if (ey0.mo66900f()) {
                    ey02.mo66897d(8);
                }
                if (a4 == 0 && ey0.mo66900f()) {
                    ey02.mo66897d(8);
                }
                if (a3 < 3) {
                    ey0.mo66901g();
                }
            }
            if (i12 == 0 && i8 != 3) {
                ey0.mo66901g();
            }
            if (i12 != 2 || (i8 != 3 && !ey0.mo66900f())) {
                i9 = 6;
            } else {
                i9 = 6;
                ey02.mo66897d(6);
            }
            str = (ey0.mo66900f() && ey02.mo66886a(i9) == 1 && ey02.mo66886a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i = i13;
            i2 = a2;
            i3 = i6;
            i4 = i14;
        } else {
            ey02.mo66897d(32);
            int a7 = ey02.mo66886a(2);
            String str2 = a7 == 3 ? null : "audio/ac3";
            int a8 = m35515a(a7, ey02.mo66886a(6));
            ey02.mo66897d(8);
            int a9 = ey02.mo66886a(3);
            if (!((a9 & 1) == 0 || a9 == 1)) {
                ey02.mo66897d(2);
            }
            if ((a9 & 4) != 0) {
                ey02.mo66897d(2);
            }
            if (a9 == 2) {
                ey02.mo66897d(2);
            }
            int[] iArr = f32857b;
            str = str2;
            i2 = a8;
            i3 = a7 < iArr.length ? iArr[a7] : -1;
            i4 = f32859d[a9] + (ey0.mo66900f() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new C12946b(str, i5, i4, i3, i2, i);
    }

    /* renamed from: a */
    public static int m35517a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return m35515a((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    /* renamed from: a */
    public static int m35516a(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f32856a[i] * 256;
    }

    /* renamed from: a */
    private static int m35515a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f32857b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f32861f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f32860e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
