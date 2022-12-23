package com.yandex.mobile.ads.impl;

import java.io.IOException;

public final class g70 {

    /* renamed from: com.yandex.mobile.ads.impl.g70$a */
    public static final class C13179a {

        /* renamed from: a */
        public long f33897a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (r7 == r1.f36004f) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        if ((r17.mo67126r() * 1000) == r3) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ac, code lost:
        if (r4 == r3) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m36495a(com.yandex.mobile.ads.impl.fy0 r17, com.yandex.mobile.ads.impl.k70 r18, int r19, com.yandex.mobile.ads.impl.g70.C13179a r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r17.mo67105b()
            long r3 = r17.mo67128t()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0019
            return r9
        L_0x0019:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            r4 = 7
            if (r6 > r4) goto L_0x0051
            int r4 = r1.f36005g
            int r4 = r4 - r10
            if (r6 != r4) goto L_0x005c
            goto L_0x005a
        L_0x0051:
            r4 = 10
            if (r6 > r4) goto L_0x005c
            int r4 = r1.f36005g
            r6 = 2
            if (r4 != r6) goto L_0x005c
        L_0x005a:
            r4 = 1
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r4 == 0) goto L_0x00ca
            if (r8 != 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            int r4 = r1.f36007i
            if (r8 != r4) goto L_0x0068
        L_0x0066:
            r4 = 1
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 == 0) goto L_0x00ca
            if (r3 != 0) goto L_0x00ca
            r3 = r20
            boolean r3 = m36496a((com.yandex.mobile.ads.impl.fy0) r0, (com.yandex.mobile.ads.impl.k70) r1, (boolean) r5, (com.yandex.mobile.ads.impl.g70.C13179a) r3)
            if (r3 == 0) goto L_0x00ca
            int r3 = m36493a((com.yandex.mobile.ads.impl.fy0) r0, (int) r12)
            r4 = -1
            if (r3 == r4) goto L_0x0082
            int r4 = r1.f36000b
            if (r3 > r4) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            if (r3 == 0) goto L_0x00ca
            int r3 = r1.f36003e
            if (r7 != 0) goto L_0x008a
            goto L_0x00ae
        L_0x008a:
            r4 = 11
            if (r7 > r4) goto L_0x0093
            int r1 = r1.f36004f
            if (r7 != r1) goto L_0x00b0
            goto L_0x00ae
        L_0x0093:
            r1 = 12
            if (r7 != r1) goto L_0x00a0
            int r1 = r17.mo67126r()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00b0
            goto L_0x00ae
        L_0x00a0:
            r1 = 14
            if (r7 > r1) goto L_0x00b0
            int r4 = r17.mo67132x()
            if (r7 != r1) goto L_0x00ac
            int r4 = r4 * 10
        L_0x00ac:
            if (r4 != r3) goto L_0x00b0
        L_0x00ae:
            r1 = 1
            goto L_0x00b1
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            if (r1 == 0) goto L_0x00ca
            int r1 = r17.mo67126r()
            int r3 = r17.mo67105b()
            byte[] r0 = r0.f33778a
            int r3 = r3 - r10
            int r0 = com.yandex.mobile.ads.impl.ih1.m37387b((byte[]) r0, (int) r2, (int) r3, (int) r9)
            if (r1 != r0) goto L_0x00c6
            r0 = 1
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 == 0) goto L_0x00ca
            r9 = 1
        L_0x00ca:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.g70.m36495a(com.yandex.mobile.ads.impl.fy0, com.yandex.mobile.ads.impl.k70, int, com.yandex.mobile.ads.impl.g70$a):boolean");
    }

    /* renamed from: a */
    public static boolean m36497a(C13416ik ikVar, k70 k70, int i, C13179a aVar) throws IOException, InterruptedException {
        long b = ikVar.mo67808b();
        byte[] bArr = new byte[2];
        ikVar.mo67806a(bArr, 0, 2, false);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            ikVar.mo67812d();
            ikVar.mo67805a((int) (b - ikVar.mo67811c()), false);
            return false;
        }
        fy0 fy0 = new fy0(16);
        System.arraycopy(bArr, 0, fy0.f33778a, 0, 2);
        fy0.mo67110d(y50.m44209a(ikVar, fy0.f33778a, 2, 14));
        ikVar.mo67812d();
        ikVar.mo67805a((int) (b - ikVar.mo67811c()), false);
        return m36495a(fy0, k70, i, aVar);
    }

    /* renamed from: a */
    public static long m36494a(C13416ik ikVar, k70 k70) throws IOException, InterruptedException {
        ikVar.mo67812d();
        boolean z = true;
        ikVar.mo67805a(1, false);
        byte[] bArr = new byte[1];
        ikVar.mo67806a(bArr, 0, 1, false);
        boolean z2 = (bArr[0] & 1) == 1;
        ikVar.mo67805a(2, false);
        int i = z2 ? 7 : 6;
        fy0 fy0 = new fy0(i);
        fy0.mo67110d(y50.m44209a(ikVar, fy0.f33778a, 0, i));
        ikVar.mo67812d();
        long j = 0;
        try {
            long y = fy0.mo67133y();
            if (!z2) {
                y *= (long) k70.f36000b;
            }
            j = y;
        } catch (NumberFormatException unused) {
            z = false;
        }
        if (z) {
            return j;
        }
        throw new jy0();
    }

    /* renamed from: a */
    public static int m36493a(fy0 fy0, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return fy0.mo67126r() + 1;
            case 7:
                return fy0.mo67132x() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private static boolean m36496a(fy0 fy0, k70 k70, boolean z, C13179a aVar) {
        try {
            long y = fy0.mo67133y();
            if (!z) {
                y *= (long) k70.f36000b;
            }
            aVar.f33897a = y;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
