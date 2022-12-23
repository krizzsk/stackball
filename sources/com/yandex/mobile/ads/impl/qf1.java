package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import com.yandex.mobile.ads.impl.C12867dc;
import java.io.IOException;

final class qf1 extends C12867dc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qf1(com.yandex.mobile.ads.impl.de1 r17, long r18, long r20, int r22) {
        /*
            r16 = this;
            com.yandex.mobile.ads.impl.dc$b r1 = new com.yandex.mobile.ads.impl.dc$b
            r1.<init>()
            com.yandex.mobile.ads.impl.qf1$a r2 = new com.yandex.mobile.ads.impl.qf1$a
            r0 = r17
            r3 = r22
            r2.<init>(r3, r0)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qf1.<init>(com.yandex.mobile.ads.impl.de1, long, long, int):void");
    }

    /* renamed from: com.yandex.mobile.ads.impl.qf1$a */
    private static final class C14382a implements C12867dc.C12873f {

        /* renamed from: a */
        private final de1 f39105a;

        /* renamed from: b */
        private final fy0 f39106b = new fy0();

        /* renamed from: c */
        private final int f39107c;

        public C14382a(int i, de1 de1) {
            this.f39107c = i;
            this.f39105a = de1;
        }

        /* renamed from: a */
        public C12867dc.C12872e mo66553a(C13416ik ikVar, long j) throws IOException, InterruptedException {
            long c = ikVar.mo67811c();
            int min = (int) Math.min(112800, ikVar.mo67804a() - c);
            this.f39106b.mo67108c(min);
            ikVar.mo67806a(this.f39106b.f33778a, 0, min, false);
            fy0 fy0 = this.f39106b;
            int c2 = fy0.mo67107c();
            long j2 = -1;
            long j3 = -1;
            long j4 = -9223372036854775807L;
            while (fy0.mo67098a() >= 188) {
                byte[] bArr = fy0.f33778a;
                int b = fy0.mo67105b();
                while (b < c2 && bArr[b] != 71) {
                    b++;
                }
                int i = b + TsExtractor.TS_PACKET_SIZE;
                if (i > c2) {
                    break;
                }
                long a = uf1.m42679a(fy0, b, this.f39107c);
                if (a != -9223372036854775807L) {
                    long b2 = this.f39105a.mo66566b(a);
                    if (b2 > j) {
                        if (j4 == -9223372036854775807L) {
                            return C12867dc.C12872e.m35199a(b2, c);
                        }
                        return C12867dc.C12872e.m35198a(c + j3);
                    } else if (100000 + b2 > j) {
                        return C12867dc.C12872e.m35198a(c + ((long) b));
                    } else {
                        j4 = b2;
                        j3 = (long) b;
                    }
                }
                fy0.mo67112e(i);
                j2 = (long) i;
            }
            if (j4 != -9223372036854775807L) {
                return C12867dc.C12872e.m35201b(j4, c + j2);
            }
            return C12867dc.C12872e.f32529d;
        }

        /* renamed from: a */
        public void mo66554a() {
            this.f39106b.mo67102a(ih1.f34863f);
        }
    }
}
