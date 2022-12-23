package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Ascii;
import java.io.IOException;

final class z11 {

    /* renamed from: a */
    private final de1 f42996a = new de1(0);

    /* renamed from: b */
    private final fy0 f42997b = new fy0();

    /* renamed from: c */
    private boolean f42998c;

    /* renamed from: d */
    private boolean f42999d;

    /* renamed from: e */
    private boolean f43000e;

    /* renamed from: f */
    private long f43001f = -9223372036854775807L;

    /* renamed from: g */
    private long f43002g = -9223372036854775807L;

    /* renamed from: h */
    private long f43003h = -9223372036854775807L;

    z11() {
    }

    /* renamed from: a */
    public int mo71145a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        long j = -9223372036854775807L;
        if (!this.f43000e) {
            long a = ikVar.mo67804a();
            int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, a);
            long j2 = a - ((long) min);
            if (ikVar.mo67811c() != j2) {
                r01.f39340a = j2;
                return 1;
            }
            this.f42997b.mo67108c(min);
            ikVar.mo67812d();
            ikVar.mo67806a(this.f42997b.f33778a, 0, min, false);
            fy0 fy0 = this.f42997b;
            int b = fy0.mo67105b();
            int c = fy0.mo67107c() - 4;
            while (true) {
                if (c < b) {
                    break;
                }
                if (m44457a(fy0.f33778a, c) == 442) {
                    fy0.mo67112e(c + 4);
                    long a2 = m44458a(fy0);
                    if (a2 != -9223372036854775807L) {
                        j = a2;
                        break;
                    }
                }
                c--;
            }
            this.f43002g = j;
            this.f43000e = true;
            return 0;
        } else if (this.f43002g == -9223372036854775807L) {
            m44456a(ikVar);
            return 0;
        } else if (!this.f42999d) {
            int min2 = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, ikVar.mo67804a());
            long j3 = (long) 0;
            if (ikVar.mo67811c() != j3) {
                r01.f39340a = j3;
                return 1;
            }
            this.f42997b.mo67108c(min2);
            ikVar.mo67812d();
            ikVar.mo67806a(this.f42997b.f33778a, 0, min2, false);
            fy0 fy02 = this.f42997b;
            int b2 = fy02.mo67105b();
            int c2 = fy02.mo67107c();
            while (true) {
                if (b2 >= c2 - 3) {
                    break;
                }
                if (m44457a(fy02.f33778a, b2) == 442) {
                    fy02.mo67112e(b2 + 4);
                    long a3 = m44458a(fy02);
                    if (a3 != -9223372036854775807L) {
                        j = a3;
                        break;
                    }
                }
                b2++;
            }
            this.f43001f = j;
            this.f42999d = true;
            return 0;
        } else {
            long j4 = this.f43001f;
            if (j4 == -9223372036854775807L) {
                m44456a(ikVar);
                return 0;
            }
            this.f43003h = this.f42996a.mo66566b(this.f43002g) - this.f42996a.mo66566b(j4);
            m44456a(ikVar);
            return 0;
        }
    }

    /* renamed from: b */
    public de1 mo71147b() {
        return this.f42996a;
    }

    /* renamed from: c */
    public boolean mo71148c() {
        return this.f42998c;
    }

    /* renamed from: a */
    public long mo71146a() {
        return this.f43003h;
    }

    /* renamed from: a */
    public static long m44458a(fy0 fy0) {
        fy0 fy02 = fy0;
        int b = fy0.mo67105b();
        if (fy0.mo67098a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        fy02.mo67104a(bArr, 0, 9);
        fy02.mo67112e(b);
        if (!((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3)) {
            return -9223372036854775807L;
        }
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: a */
    private int m44456a(C13416ik ikVar) {
        this.f42997b.mo67102a(ih1.f34863f);
        this.f42998c = true;
        ikVar.mo67812d();
        return 0;
    }

    /* renamed from: a */
    private int m44457a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
