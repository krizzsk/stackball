package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.qk */
final class C14390qk implements fw0 {

    /* renamed from: a */
    private final ew0 f39166a = new ew0();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f39167b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f39168c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final mb1 f39169d;

    /* renamed from: e */
    private int f39170e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f39171f;

    /* renamed from: g */
    private long f39172g;

    /* renamed from: h */
    private long f39173h;

    /* renamed from: i */
    private long f39174i;

    /* renamed from: j */
    private long f39175j;

    /* renamed from: k */
    private long f39176k;

    /* renamed from: l */
    private long f39177l;

    /* renamed from: com.yandex.mobile.ads.impl.qk$b */
    private final class C14392b implements s71 {
        private C14392b() {
        }

        /* renamed from: a */
        public boolean mo64897a() {
            return true;
        }

        /* renamed from: b */
        public s71.C14566a mo64898b(long j) {
            long b = C14390qk.this.f39169d.mo68644b(j);
            long b2 = C14390qk.this.f39167b;
            int i = ih1.f34858a;
            u71 u71 = new u71(j, Math.max(b2, Math.min((C14390qk.this.f39167b + ((b * (C14390qk.this.f39168c - C14390qk.this.f39167b)) / C14390qk.this.f39171f)) - 30000, C14390qk.this.f39168c - 1)));
            return new s71.C14566a(u71, u71);
        }

        /* renamed from: c */
        public long mo64899c() {
            return C14390qk.this.f39169d.mo68641a(C14390qk.this.f39171f);
        }
    }

    public C14390qk(mb1 mb1, long j, long j2, long j3, long j4, boolean z) {
        C13479j9.m37705a(j >= 0 && j2 > j);
        this.f39169d = mb1;
        this.f39167b = j;
        this.f39168c = j2;
        if (j3 == j2 - j || z) {
            this.f39171f = j4;
            this.f39170e = 4;
            return;
        }
        this.f39170e = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo67092a(com.yandex.mobile.ads.impl.C13416ik r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r0.f39170e
            r3 = 1
            r4 = 0
            r5 = 4
            if (r2 == 0) goto L_0x00fb
            if (r2 == r3) goto L_0x010e
            r3 = 2
            r8 = 3
            r9 = -1
            if (r2 == r3) goto L_0x001e
            if (r2 == r8) goto L_0x00c5
            if (r2 != r5) goto L_0x0018
            return r9
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x001e:
            long r2 = r0.f39174i
            long r11 = r0.f39175j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0027
            goto L_0x0065
        L_0x0027:
            long r2 = r21.mo67811c()
            long r11 = r0.f39175j
            boolean r11 = r0.m41276a(r1, r11)
            if (r11 != 0) goto L_0x0044
            long r11 = r0.f39174i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            r2 = r9
            goto L_0x00bd
        L_0x003c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0044:
            com.yandex.mobile.ads.impl.ew0 r11 = r0.f39166a
            r11.mo66880a(r1, r4)
            r21.mo67812d()
            long r11 = r0.f39173h
            com.yandex.mobile.ads.impl.ew0 r13 = r0.f39166a
            long r14 = r13.f33167b
            long r11 = r11 - r14
            int r6 = r13.f33169d
            int r7 = r13.f33170e
            int r6 = r6 + r7
            r16 = 0
            int r7 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x0068
            r18 = 72000(0x11940, double:3.55727E-319)
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0068
        L_0x0065:
            r2 = r9
            r11 = r2
            goto L_0x00bd
        L_0x0068:
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x0071
            r0.f39175j = r2
            r0.f39177l = r14
            goto L_0x007f
        L_0x0071:
            long r2 = r21.mo67811c()
            long r13 = (long) r6
            long r2 = r2 + r13
            r0.f39174i = r2
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            long r2 = r2.f33167b
            r0.f39176k = r2
        L_0x007f:
            long r2 = r0.f39175j
            long r13 = r0.f39174i
            long r2 = r2 - r13
            r16 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x0090
            r0.f39175j = r13
            r2 = r9
            r11 = r13
            goto L_0x00bd
        L_0x0090:
            long r2 = (long) r6
            if (r7 > 0) goto L_0x0096
            r6 = 2
            goto L_0x0098
        L_0x0096:
            r6 = 1
        L_0x0098:
            long r2 = r2 * r6
            long r6 = r21.mo67811c()
            long r6 = r6 - r2
            long r2 = r0.f39175j
            long r4 = r0.f39174i
            long r17 = r2 - r4
            long r11 = r11 * r17
            long r8 = r0.f39177l
            long r13 = r0.f39176k
            long r8 = r8 - r13
            long r11 = r11 / r8
            long r6 = r6 + r11
            r8 = 1
            long r2 = r2 - r8
            int r8 = com.yandex.mobile.ads.impl.ih1.f34858a
            long r2 = java.lang.Math.min(r6, r2)
            long r11 = java.lang.Math.max(r4, r2)
            r2 = -1
        L_0x00bd:
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00c2
            return r11
        L_0x00c2:
            r2 = 3
            r0.f39170e = r2
        L_0x00c5:
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            r3 = 0
            r2.mo66880a(r1, r3)
        L_0x00cb:
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            long r3 = r2.f33167b
            long r5 = r0.f39173h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00ee
            int r3 = r2.f33169d
            int r2 = r2.f33170e
            int r3 = r3 + r2
            r1.mo67813d(r3)
            long r2 = r21.mo67811c()
            r0.f39174i = r2
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            long r3 = r2.f33167b
            r0.f39176k = r3
            r3 = 0
            r2.mo66880a(r1, r3)
            goto L_0x00cb
        L_0x00ee:
            r21.mo67812d()
            r1 = 4
            r0.f39170e = r1
            long r1 = r0.f39176k
            r3 = 2
            long r1 = r1 + r3
            long r1 = -r1
            return r1
        L_0x00fb:
            long r4 = r21.mo67811c()
            r0.f39172g = r4
            r0.f39170e = r3
            long r2 = r0.f39168c
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r2 = r2 - r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x010e
            return r2
        L_0x010e:
            long r2 = r0.f39168c
            boolean r2 = r0.m41276a(r1, r2)
            if (r2 == 0) goto L_0x014a
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            r2.mo66879a()
        L_0x011b:
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            int r2 = r2.f33166a
            r3 = 4
            r2 = r2 & r3
            if (r2 == r3) goto L_0x013e
            long r2 = r21.mo67811c()
            long r4 = r0.f39168c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x013e
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            r3 = 0
            r2.mo66880a(r1, r3)
            com.yandex.mobile.ads.impl.ew0 r2 = r0.f39166a
            int r4 = r2.f33169d
            int r2 = r2.f33170e
            int r4 = r4 + r2
            r1.mo67813d(r4)
            goto L_0x011b
        L_0x013e:
            com.yandex.mobile.ads.impl.ew0 r1 = r0.f39166a
            long r1 = r1.f33167b
            r0.f39171f = r1
            r1 = 4
            r0.f39170e = r1
            long r1 = r0.f39172g
            return r1
        L_0x014a:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14390qk.mo67092a(com.yandex.mobile.ads.impl.ik):long");
    }

    /* renamed from: a */
    public s71 mo67093a() {
        if (this.f39171f != 0) {
            return new C14392b();
        }
        return null;
    }

    /* renamed from: a */
    public void mo67094a(long j) {
        int i = ih1.f34858a;
        this.f39173h = Math.max(0, Math.min(j, this.f39171f - 1));
        this.f39170e = 2;
        this.f39174i = this.f39167b;
        this.f39175j = this.f39168c;
        this.f39176k = 0;
        this.f39177l = this.f39171f;
    }

    /* renamed from: a */
    private boolean m41276a(C13416ik ikVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f39168c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (ikVar.mo67811c() + ((long) i2) <= min || (i2 = (int) (min - ikVar.mo67811c())) >= 4) {
                ikVar.mo67806a(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        ikVar.mo67813d(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            ikVar.mo67813d(i);
        }
    }
}
