package com.yandex.mobile.ads.exo.source;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.source.C12285e;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.t71;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.source.b */
public final class C12280b implements C12285e, C12285e.C12286a {

    /* renamed from: b */
    public final C12285e f30071b;

    /* renamed from: c */
    private C12285e.C12286a f30072c;

    /* renamed from: d */
    private C12281a[] f30073d = new C12281a[0];

    /* renamed from: e */
    private long f30074e;

    /* renamed from: f */
    long f30075f;

    /* renamed from: g */
    long f30076g;

    /* renamed from: com.yandex.mobile.ads.exo.source.b$a */
    private final class C12281a implements C12309l {

        /* renamed from: a */
        public final C12309l f30077a;

        /* renamed from: b */
        private boolean f30078b;

        public C12281a(C12309l lVar) {
            this.f30077a = lVar;
        }

        /* renamed from: a */
        public void mo65271a() throws IOException {
            this.f30077a.mo65271a();
        }

        /* renamed from: b */
        public void mo65272b() {
            this.f30078b = false;
        }

        /* renamed from: c */
        public boolean mo65273c() {
            return !C12280b.this.mo65264c() && this.f30077a.mo65273c();
        }

        /* renamed from: a */
        public int mo65270a(q70 q70, C14387qj qjVar, boolean z) {
            if (C12280b.this.mo65264c()) {
                return -3;
            }
            if (this.f30078b) {
                qjVar.mo71020e(4);
                return -4;
            }
            int a = this.f30077a.mo65270a(q70, qjVar, z);
            if (a == -5) {
                Format format = q70.f39018c;
                format.getClass();
                int i = format.f29546z;
                if (!(i == 0 && format.f29517A == 0)) {
                    C12280b bVar = C12280b.this;
                    int i2 = 0;
                    if (bVar.f30075f != 0) {
                        i = 0;
                    }
                    if (bVar.f30076g == Long.MIN_VALUE) {
                        i2 = format.f29517A;
                    }
                    q70.f39018c = format.mo64768a(i, i2);
                }
                return -5;
            }
            C12280b bVar2 = C12280b.this;
            long j = bVar2.f30076g;
            if (j == Long.MIN_VALUE || ((a != -4 || qjVar.f39149f < j) && (a != -3 || bVar2.mo65265e() != Long.MIN_VALUE || qjVar.f39148e))) {
                return a;
            }
            qjVar.mo66557b();
            qjVar.mo71020e(4);
            this.f30078b = true;
            return -4;
        }

        /* renamed from: a */
        public int mo65269a(long j) {
            if (C12280b.this.mo65264c()) {
                return -3;
            }
            return this.f30077a.mo65269a(j);
        }
    }

    public C12280b(C12285e eVar, boolean z, long j, long j2) {
        this.f30071b = eVar;
        this.f30074e = z ? j : -9223372036854775807L;
        this.f30075f = j;
        this.f30076g = j2;
    }

    /* renamed from: a */
    public void mo65259a(C12285e.C12286a aVar, long j) {
        this.f30072c = aVar;
        this.f30071b.mo65259a((C12285e.C12286a) this, j);
    }

    /* renamed from: b */
    public TrackGroupArray mo65261b() {
        return this.f30071b.mo65261b();
    }

    /* renamed from: c */
    public void mo65263c(long j) {
        this.f30071b.mo65263c(j);
    }

    /* renamed from: e */
    public long mo65265e() {
        long e = this.f30071b.mo65265e();
        if (e != Long.MIN_VALUE) {
            long j = this.f30076g;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: f */
    public void mo65266f() throws IOException {
        this.f30071b.mo65266f();
    }

    /* renamed from: g */
    public long mo65267g() {
        long g = this.f30071b.mo65267g();
        if (g != Long.MIN_VALUE) {
            long j = this.f30076g;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: h */
    public long mo65268h() {
        if (mo65264c()) {
            long j = this.f30074e;
            this.f30074e = -9223372036854775807L;
            long h = mo65268h();
            return h != -9223372036854775807L ? h : j;
        }
        long h2 = this.f30071b.mo65268h();
        if (h2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C13479j9.m37708b(h2 >= this.f30075f);
        long j2 = this.f30076g;
        if (j2 != Long.MIN_VALUE && h2 > j2) {
            z = false;
        }
        C13479j9.m37708b(z);
        return h2;
    }

    /* renamed from: b */
    public boolean mo65262b(long j) {
        return this.f30071b.mo65262b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo65264c() {
        return this.f30074e != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r1 > r5) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo65257a(com.yandex.mobile.ads.exo.trackselection.C12330d[] r16, boolean[] r17, com.yandex.mobile.ads.exo.source.C12309l[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.yandex.mobile.ads.exo.source.b$a[] r1 = new com.yandex.mobile.ads.exo.source.C12280b.C12281a[r1]
            r0.f30073d = r1
            int r1 = r9.length
            com.yandex.mobile.ads.exo.source.l[] r10 = new com.yandex.mobile.ads.exo.source.C12309l[r1]
            r11 = 0
            r1 = 0
        L_0x000f:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0028
            com.yandex.mobile.ads.exo.source.b$a[] r2 = r0.f30073d
            r3 = r9[r1]
            com.yandex.mobile.ads.exo.source.b$a r3 = (com.yandex.mobile.ads.exo.source.C12280b.C12281a) r3
            r2[r1] = r3
            r3 = r2[r1]
            if (r3 == 0) goto L_0x0023
            r2 = r2[r1]
            com.yandex.mobile.ads.exo.source.l r12 = r2.f30077a
        L_0x0023:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0028:
            com.yandex.mobile.ads.exo.source.e r1 = r0.f30071b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo65257a(r2, r3, r4, r5, r6)
            boolean r3 = r15.mo65264c()
            r4 = 1
            if (r3 == 0) goto L_0x0068
            long r5 = r0.f30075f
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0068
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0063
            int r3 = r8.length
            r5 = 0
        L_0x004c:
            if (r5 >= r3) goto L_0x0063
            r6 = r8[r5]
            if (r6 == 0) goto L_0x0060
            com.yandex.mobile.ads.exo.Format r6 = r6.mo65389b()
            java.lang.String r6 = r6.f29530j
            boolean r6 = com.yandex.mobile.ads.impl.wn0.m43728e(r6)
            if (r6 != 0) goto L_0x0060
            r3 = 1
            goto L_0x0064
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0068
            r5 = r1
            goto L_0x006d
        L_0x0068:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006d:
            r0.f30074e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            long r5 = r0.f30075f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0086
            long r5 = r0.f30076g
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r4 = 0
        L_0x0087:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r4)
        L_0x008a:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00b6
            r3 = r10[r11]
            if (r3 != 0) goto L_0x0096
            com.yandex.mobile.ads.exo.source.b$a[] r3 = r0.f30073d
            r3[r11] = r12
            goto L_0x00ad
        L_0x0096:
            com.yandex.mobile.ads.exo.source.b$a[] r3 = r0.f30073d
            r4 = r3[r11]
            if (r4 == 0) goto L_0x00a4
            r4 = r3[r11]
            com.yandex.mobile.ads.exo.source.l r4 = r4.f30077a
            r5 = r10[r11]
            if (r4 == r5) goto L_0x00ad
        L_0x00a4:
            com.yandex.mobile.ads.exo.source.b$a r4 = new com.yandex.mobile.ads.exo.source.b$a
            r5 = r10[r11]
            r4.<init>(r5)
            r3[r11] = r4
        L_0x00ad:
            com.yandex.mobile.ads.exo.source.b$a[] r3 = r0.f30073d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x008a
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12280b.mo65257a(com.yandex.mobile.ads.exo.trackselection.d[], boolean[], com.yandex.mobile.ads.exo.source.l[], boolean[], long):long");
    }

    /* renamed from: a */
    public void mo65258a(long j, boolean z) {
        this.f30071b.mo65258a(j, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo65255a(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f30074e = r0
            com.yandex.mobile.ads.exo.source.b$a[] r0 = r6.f30073d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo65272b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.yandex.mobile.ads.exo.source.e r0 = r6.f30071b
            long r0 = r0.mo65255a(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f30075f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f30076g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12280b.mo65255a(long):long");
    }

    /* renamed from: a */
    public long mo65256a(long j, t71 t71) {
        long j2 = this.f30075f;
        if (j == j2) {
            return j2;
        }
        int i = ih1.f34858a;
        long max = Math.max(0, Math.min(t71.f40259a, j - j2));
        long j3 = t71.f40260b;
        long j4 = this.f30076g;
        long max2 = Math.max(0, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (!(max == t71.f40259a && max2 == t71.f40260b)) {
            t71 = new t71(max, max2);
        }
        return this.f30071b.mo65256a(j, t71);
    }

    /* renamed from: a */
    public boolean mo65260a() {
        return this.f30071b.mo65260a();
    }

    /* renamed from: a */
    public void mo64926a(C12285e eVar) {
        C12285e.C12286a aVar = this.f30072c;
        aVar.getClass();
        aVar.mo64926a(this);
    }

    /* renamed from: a */
    public void mo64929a(C12310m mVar) {
        C12285e.C12286a aVar = this.f30072c;
        aVar.getClass();
        aVar.mo64929a(this);
    }
}
