package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.a */
final class C3343a implements C3351f {

    /* renamed from: a */
    final long f8832a;

    /* renamed from: b */
    final long f8833b;

    /* renamed from: c */
    final C3353h f8834c;

    /* renamed from: d */
    long f8835d;

    /* renamed from: e */
    private final C3350e f8836e = new C3350e();

    /* renamed from: f */
    private int f8837f;

    /* renamed from: g */
    private long f8838g;

    /* renamed from: h */
    private long f8839h;

    /* renamed from: i */
    private long f8840i;

    /* renamed from: j */
    private long f8841j;

    /* renamed from: k */
    private long f8842k;

    /* renamed from: l */
    private long f8843l;

    public C3343a(long j, long j2, C3353h hVar, int i, long j3) {
        C3535a.m8782a(j >= 0 && j2 > j);
        this.f8834c = hVar;
        this.f8832a = j;
        this.f8833b = j2;
        if (((long) i) == j2 - j) {
            this.f8835d = j3;
            this.f8837f = 3;
            return;
        }
        this.f8837f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo19137a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            int r0 = r6.f8837f
            r2 = 0
            r7 = 3
            r3 = 1
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x0111
            r4 = 2
            if (r0 == r4) goto L_0x001b
            if (r0 != r7) goto L_0x0015
            r0 = -1
            return r0
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x001b:
            long r8 = r6.f8839h
            r10 = 0
            r12 = 2
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
        L_0x0025:
            r0 = 3
            goto L_0x00f9
        L_0x0028:
            long r14 = r6.f8840i
            long r4 = r6.f8841j
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x0037
            long r2 = r6.f8842k
        L_0x0032:
            long r2 = r2 + r12
            long r2 = -r2
        L_0x0034:
            r4 = r10
            goto L_0x00e4
        L_0x0037:
            long r4 = r21.mo19012c()
            long r14 = r6.f8841j
            boolean r14 = r6.m8269a(r1, r14)
            if (r14 != 0) goto L_0x0052
            long r2 = r6.f8840i
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            goto L_0x0034
        L_0x004a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No ogg page can be found."
            r0.<init>(r1)
            throw r0
        L_0x0052:
            com.fyber.inneractive.sdk.player.c.d.e.e r14 = r6.f8836e
            r14.mo19145a(r1, r2)
            r21.mo19006a()
            com.fyber.inneractive.sdk.player.c.d.e.e r2 = r6.f8836e
            long r14 = r2.f8862c
            long r8 = r8 - r14
            com.fyber.inneractive.sdk.player.c.d.e.e r2 = r6.f8836e
            int r2 = r2.f8867h
            com.fyber.inneractive.sdk.player.c.d.e.e r14 = r6.f8836e
            int r14 = r14.f8868i
            int r2 = r2 + r14
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x007c
            r15 = 72000(0x11940, double:3.55727E-319)
            int r17 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            r1.mo19009b(r2)
            com.fyber.inneractive.sdk.player.c.d.e.e r0 = r6.f8836e
            long r2 = r0.f8862c
            goto L_0x0032
        L_0x007c:
            r15 = 100000(0x186a0, double:4.94066E-319)
            if (r14 >= 0) goto L_0x008c
            r6.f8841j = r4
            com.fyber.inneractive.sdk.player.c.d.e.e r4 = r6.f8836e
            long r4 = r4.f8862c
            r6.f8843l = r4
            r18 = r8
            goto L_0x00b0
        L_0x008c:
            long r4 = r21.mo19012c()
            long r10 = (long) r2
            long r4 = r4 + r10
            r6.f8840i = r4
            com.fyber.inneractive.sdk.player.c.d.e.e r4 = r6.f8836e
            long r4 = r4.f8862c
            r6.f8842k = r4
            long r4 = r6.f8841j
            r18 = r8
            long r7 = r6.f8840i
            long r4 = r4 - r7
            long r4 = r4 + r10
            int r7 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b0
            r1.mo19009b(r2)
            long r2 = r6.f8842k
            long r2 = r2 + r12
            long r2 = -r2
        L_0x00ad:
            r4 = 0
            goto L_0x00e4
        L_0x00b0:
            long r4 = r6.f8841j
            long r7 = r6.f8840i
            long r4 = r4 - r7
            int r9 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r9 >= 0) goto L_0x00bd
            r6.f8841j = r7
            r2 = r7
            goto L_0x00ad
        L_0x00bd:
            if (r14 > 0) goto L_0x00c0
            r3 = 2
        L_0x00c0:
            int r2 = r2 * r3
            long r2 = (long) r2
            long r4 = r21.mo19012c()
            long r4 = r4 - r2
            long r2 = r6.f8841j
            long r7 = r6.f8840i
            long r2 = r2 - r7
            long r2 = r2 * r18
            long r9 = r6.f8843l
            long r14 = r6.f8842k
            long r9 = r9 - r14
            long r2 = r2 / r9
            long r4 = r4 + r2
            long r2 = java.lang.Math.max(r4, r7)
            long r4 = r6.f8841j
            r7 = 1
            long r4 = r4 - r7
            long r2 = java.lang.Math.min(r2, r4)
            goto L_0x00ad
        L_0x00e4:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e9
            return r2
        L_0x00e9:
            long r4 = r6.f8839h
            long r2 = r2 + r12
            long r7 = -r2
            r0 = r20
            r1 = r21
            r2 = r4
            r4 = r7
            long r10 = r0.m8268a(r1, r2, r4)
            goto L_0x0025
        L_0x00f9:
            r6.f8837f = r0
            long r10 = r10 + r12
            long r0 = -r10
            return r0
        L_0x00fe:
            long r4 = r21.mo19012c()
            r6.f8838g = r4
            r6.f8837f = r3
            long r7 = r6.f8833b
            r9 = 65307(0xff1b, double:3.2266E-319)
            long r7 = r7 - r9
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0111
            return r7
        L_0x0111:
            long r3 = r6.f8833b
            boolean r0 = r6.m8269a(r1, r3)
            if (r0 == 0) goto L_0x014e
            com.fyber.inneractive.sdk.player.c.d.e.e r0 = r6.f8836e
            r0.mo19144a()
        L_0x011e:
            com.fyber.inneractive.sdk.player.c.d.e.e r0 = r6.f8836e
            int r0 = r0.f8861b
            r3 = 4
            r0 = r0 & r3
            if (r0 == r3) goto L_0x0142
            long r3 = r21.mo19012c()
            long r7 = r6.f8833b
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0142
            com.fyber.inneractive.sdk.player.c.d.e.e r0 = r6.f8836e
            r0.mo19145a(r1, r2)
            com.fyber.inneractive.sdk.player.c.d.e.e r0 = r6.f8836e
            int r0 = r0.f8867h
            com.fyber.inneractive.sdk.player.c.d.e.e r3 = r6.f8836e
            int r3 = r3.f8868i
            int r0 = r0 + r3
            r1.mo19009b(r0)
            goto L_0x011e
        L_0x0142:
            com.fyber.inneractive.sdk.player.c.d.e.e r0 = r6.f8836e
            long r0 = r0.f8862c
            r6.f8835d = r0
            r0 = 3
            r6.f8837f = r0
            long r0 = r6.f8838g
            return r0
        L_0x014e:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3343a.mo19137a(com.fyber.inneractive.sdk.player.c.d.g):long");
    }

    /* renamed from: a_ */
    public final long mo19139a_(long j) {
        long j2;
        int i = this.f8837f;
        C3535a.m8782a(i == 3 || i == 2);
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = this.f8834c.mo19151b(j);
        }
        this.f8839h = j2;
        this.f8837f = 2;
        this.f8840i = this.f8832a;
        this.f8841j = this.f8833b;
        this.f8842k = 0;
        this.f8843l = this.f8835d;
        return j2;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.a$a */
    private class C3344a implements C3276m {
        /* renamed from: b_ */
        public final boolean mo18995b_() {
            return true;
        }

        private C3344a() {
        }

        /* synthetic */ C3344a(C3343a aVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final long mo18993a(long j) {
            if (j == 0) {
                return C3343a.this.f8832a;
            }
            long b = C3343a.this.f8834c.mo19151b(j);
            C3343a aVar = C3343a.this;
            long j2 = aVar.f8832a + (((b * (aVar.f8833b - aVar.f8832a)) / aVar.f8835d) - 30000);
            if (j2 < aVar.f8832a) {
                j2 = aVar.f8832a;
            }
            return j2 >= aVar.f8833b ? aVar.f8833b - 1 : j2;
        }

        /* renamed from: b */
        public final long mo18994b() {
            return C3343a.this.f8834c.mo19148a(C3343a.this.f8835d);
        }
    }

    /* renamed from: a */
    private boolean m8269a(C3269g gVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f8833b);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (gVar.mo19012c() + ((long) i2) <= min || (i2 = (int) (min - gVar.mo19012c())) >= 4) {
                gVar.mo19011b(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        gVar.mo19009b(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            gVar.mo19009b(i);
        }
    }

    /* renamed from: a */
    private long m8268a(C3269g gVar, long j, long j2) throws IOException, InterruptedException {
        this.f8836e.mo19145a(gVar, false);
        while (this.f8836e.f8862c < j) {
            gVar.mo19009b(this.f8836e.f8867h + this.f8836e.f8868i);
            j2 = this.f8836e.f8862c;
            this.f8836e.mo19145a(gVar, false);
        }
        gVar.mo19006a();
        return j2;
    }

    /* renamed from: a */
    public final /* synthetic */ C3276m mo19138a() {
        if (this.f8835d != 0) {
            return new C3344a(this, (byte) 0);
        }
        return null;
    }
}
