package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Ascii;
import com.yandex.mobile.ads.impl.C12867dc;
import java.io.IOException;

final class y11 extends C12867dc {

    /* renamed from: com.yandex.mobile.ads.impl.y11$b */
    private static final class C15229b implements C12867dc.C12873f {

        /* renamed from: a */
        private final de1 f42742a;

        /* renamed from: b */
        private final fy0 f42743b;

        /* renamed from: a */
        public C12867dc.C12872e mo66553a(C13416ik ikVar, long j) throws IOException, InterruptedException {
            int a;
            long c = ikVar.mo67811c();
            int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, ikVar.mo67804a() - c);
            this.f42743b.mo67108c(min);
            ikVar.mo67806a(this.f42743b.f33778a, 0, min, false);
            fy0 fy0 = this.f42743b;
            int i = -1;
            long j2 = -9223372036854775807L;
            int i2 = -1;
            while (fy0.mo67098a() >= 4) {
                if (y11.m44163a(fy0.f33778a, fy0.mo67105b()) != 442) {
                    fy0.mo67114f(1);
                } else {
                    fy0.mo67114f(4);
                    long a2 = z11.m44458a(fy0);
                    if (a2 != -9223372036854775807L) {
                        long b = this.f42742a.mo66566b(a2);
                        if (b > j) {
                            if (j2 == -9223372036854775807L) {
                                return C12867dc.C12872e.m35199a(b, c);
                            }
                            return C12867dc.C12872e.m35198a(c + ((long) i2));
                        } else if (100000 + b > j) {
                            return C12867dc.C12872e.m35198a(c + ((long) fy0.mo67105b()));
                        } else {
                            i2 = fy0.mo67105b();
                            j2 = b;
                        }
                    }
                    int c2 = fy0.mo67107c();
                    if (fy0.mo67098a() >= 10) {
                        fy0.mo67114f(9);
                        int r = fy0.mo67126r() & 7;
                        if (fy0.mo67098a() >= r) {
                            fy0.mo67114f(r);
                            if (fy0.mo67098a() >= 4) {
                                if (y11.m44163a(fy0.f33778a, fy0.mo67105b()) == 443) {
                                    fy0.mo67114f(4);
                                    int x = fy0.mo67132x();
                                    if (fy0.mo67098a() < x) {
                                        fy0.mo67112e(c2);
                                    } else {
                                        fy0.mo67114f(x);
                                    }
                                }
                                while (true) {
                                    if (fy0.mo67098a() < 4 || (a = y11.m44163a(fy0.f33778a, fy0.mo67105b())) == 442 || a == 441 || (a >>> 8) != 1) {
                                        break;
                                    }
                                    fy0.mo67114f(4);
                                    if (fy0.mo67098a() < 2) {
                                        fy0.mo67112e(c2);
                                        break;
                                    }
                                    fy0.mo67112e(Math.min(fy0.mo67107c(), fy0.mo67105b() + fy0.mo67132x()));
                                }
                            } else {
                                fy0.mo67112e(c2);
                            }
                        } else {
                            fy0.mo67112e(c2);
                        }
                    } else {
                        fy0.mo67112e(c2);
                    }
                    i = fy0.mo67105b();
                }
            }
            if (j2 != -9223372036854775807L) {
                return C12867dc.C12872e.m35201b(j2, c + ((long) i));
            }
            return C12867dc.C12872e.f32529d;
        }

        private C15229b(de1 de1) {
            this.f42742a = de1;
            this.f42743b = new fy0();
        }

        /* renamed from: a */
        public void mo66554a() {
            this.f42743b.mo67102a(ih1.f34863f);
        }
    }

    public y11(de1 de1, long j, long j2) {
        super(new C12867dc.C12869b(), new C15229b(de1), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* renamed from: a */
    static int m44163a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
