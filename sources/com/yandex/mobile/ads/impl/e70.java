package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12867dc;
import com.yandex.mobile.ads.impl.g70;
import java.io.IOException;

final class e70 extends C12867dc {

    /* renamed from: com.yandex.mobile.ads.impl.e70$b */
    private static final class C12960b implements C12867dc.C12873f {

        /* renamed from: a */
        private final k70 f32920a;

        /* renamed from: b */
        private final int f32921b;

        /* renamed from: c */
        private final g70.C13179a f32922c;

        /* renamed from: a */
        public C12867dc.C12872e mo66553a(C13416ik ikVar, long j) throws IOException, InterruptedException {
            long c = ikVar.mo67811c();
            long a = m35586a(ikVar);
            long b = ikVar.mo67808b();
            ikVar.mo67805a(Math.max(6, this.f32920a.f36001c), false);
            long a2 = m35586a(ikVar);
            long b2 = ikVar.mo67808b();
            if (a <= j && a2 > j) {
                return C12867dc.C12872e.m35198a(b);
            }
            if (a2 <= j) {
                return C12867dc.C12872e.m35201b(a2, b2);
            }
            return C12867dc.C12872e.m35199a(a, c);
        }

        /* renamed from: a */
        public /* synthetic */ void mo66554a() {
            C12867dc.C12873f.CC.$default$a(this);
        }

        private C12960b(k70 k70, int i) {
            this.f32920a = k70;
            this.f32921b = i;
            this.f32922c = new g70.C13179a();
        }

        /* renamed from: a */
        private long m35586a(C13416ik ikVar) throws IOException, InterruptedException {
            while (ikVar.mo67808b() < ikVar.mo67804a() - 6 && !g70.m36497a(ikVar, this.f32920a, this.f32921b, this.f32922c)) {
                ikVar.mo67805a(1, false);
            }
            if (ikVar.mo67808b() < ikVar.mo67804a() - 6) {
                return this.f32922c.f33897a;
            }
            ikVar.mo67805a((int) (ikVar.mo67804a() - ikVar.mo67808b()), false);
            return this.f32920a.f36008j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e70(com.yandex.mobile.ads.impl.k70 r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            com.yandex.mobile.ads.impl.-$$Lambda$Kgj_pwLbYjEutGGO6960wqmGHT4 r1 = new com.yandex.mobile.ads.impl.-$$Lambda$Kgj_pwLbYjEutGGO6960wqmGHT4
            r1.<init>()
            com.yandex.mobile.ads.impl.e70$b r2 = new com.yandex.mobile.ads.impl.e70$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.mo68153b()
            long r7 = r0.f36008j
            long r13 = r17.mo68147a()
            int r0 = r0.f36001c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e70.<init>(com.yandex.mobile.ads.impl.k70, int, long, long):void");
    }
}
