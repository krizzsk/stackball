package com.yandex.mobile.ads.exo.extractor.mp4;

import com.yandex.mobile.ads.impl.C13416ik;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.h */
final class C12211h {

    /* renamed from: a */
    private static final int[] f29704a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153};

    /* renamed from: a */
    public static boolean m31857a(C13416ik ikVar) throws IOException, InterruptedException {
        return m31858a(ikVar, true);
    }

    /* renamed from: b */
    public static boolean m31859b(C13416ik ikVar) throws IOException, InterruptedException {
        return m31858a(ikVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ee, code lost:
        r0 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m31858a(com.yandex.mobile.ads.impl.C13416ik r22, boolean r23) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r0 = r22
            long r1 = r22.mo67804a()
            r3 = 4096(0x1000, double:2.0237E-320)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0014
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            int r4 = (int) r3
            com.yandex.mobile.ads.impl.fy0 r3 = new com.yandex.mobile.ads.impl.fy0
            r8 = 64
            r3.<init>((int) r8)
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x001f:
            if (r9 >= r4) goto L_0x00ee
            r12 = 8
            r3.mo67108c(r12)
            byte[] r13 = r3.f33778a
            r0.mo67806a(r13, r8, r12, r8)
            long r13 = r3.mo67128t()
            int r15 = r3.mo67113f()
            r16 = 1
            r11 = 16
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x0048
            byte[] r13 = r3.f33778a
            r0.mo67806a(r13, r12, r12, r8)
            r3.mo67110d(r11)
            long r13 = r3.mo67122n()
            goto L_0x0061
        L_0x0048:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x005f
            long r16 = r22.mo67804a()
            int r11 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x005f
            long r13 = r22.mo67808b()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L_0x005f:
            r11 = 8
        L_0x0061:
            long r5 = (long) r11
            int r18 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r18 >= 0) goto L_0x0067
            return r8
        L_0x0067:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L_0x007a
            int r5 = (int) r13
            int r4 = r4 + r5
            if (r7 == 0) goto L_0x0077
            long r5 = (long) r4
            int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x0077
            int r4 = (int) r1
        L_0x0077:
            r5 = -1
            goto L_0x001f
        L_0x007a:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto L_0x00ea
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L_0x0086
            goto L_0x00ea
        L_0x0086:
            r18 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            long r1 = r1 - r5
            r20 = r9
            long r8 = (long) r4
            int r21 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r21 < 0) goto L_0x0093
            goto L_0x00ee
        L_0x0093:
            long r13 = r13 - r5
            int r1 = (int) r13
            int r9 = r20 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto L_0x00dd
            if (r1 >= r12) goto L_0x00a0
            r2 = 0
            return r2
        L_0x00a0:
            r2 = 0
            r3.mo67108c(r1)
            byte[] r5 = r3.f33778a
            r0.mo67806a(r5, r2, r1, r2)
            int r1 = r1 / 4
            r2 = 0
        L_0x00ac:
            if (r2 >= r1) goto L_0x00d9
            r5 = 1
            if (r2 != r5) goto L_0x00b6
            r6 = 4
            r3.mo67114f(r6)
            goto L_0x00d6
        L_0x00b6:
            int r6 = r3.mo67113f()
            int r8 = r6 >>> 8
            r12 = 3368816(0x336770, float:4.720717E-39)
            if (r8 != r12) goto L_0x00c2
            goto L_0x00cc
        L_0x00c2:
            int[] r8 = f29704a
            int r12 = r8.length
            r13 = 0
        L_0x00c6:
            if (r13 >= r12) goto L_0x00d1
            r14 = r8[r13]
            if (r14 != r6) goto L_0x00ce
        L_0x00cc:
            r6 = 1
            goto L_0x00d2
        L_0x00ce:
            int r13 = r13 + 1
            goto L_0x00c6
        L_0x00d1:
            r6 = 0
        L_0x00d2:
            if (r6 == 0) goto L_0x00d6
            r10 = 1
            goto L_0x00d9
        L_0x00d6:
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00d9:
            r2 = 0
            if (r10 != 0) goto L_0x00e3
            return r2
        L_0x00dd:
            r2 = 0
            if (r1 == 0) goto L_0x00e3
            r0.mo67805a(r1, r2)
        L_0x00e3:
            r1 = r18
            r5 = -1
            r8 = 0
            goto L_0x001f
        L_0x00ea:
            r2 = 0
            r5 = 1
            r0 = 1
            goto L_0x00f1
        L_0x00ee:
            r2 = 0
            r5 = 1
            r0 = 0
        L_0x00f1:
            if (r10 == 0) goto L_0x00f9
            r1 = r23
            if (r1 != r0) goto L_0x00f9
            r8 = 1
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12211h.m31858a(com.yandex.mobile.ads.impl.ik, boolean):boolean");
    }
}
