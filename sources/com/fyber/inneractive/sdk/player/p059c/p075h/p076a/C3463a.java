package com.fyber.inneractive.sdk.player.p059c.p075h.p076a;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.h.a.a */
public final class C3463a {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8608a(long r16, com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r18, com.fyber.inneractive.sdk.player.p059c.p063d.C3278n[] r19) {
        /*
            r0 = r18
            r1 = r19
        L_0x0004:
            int r2 = r18.mo19383b()
            r3 = 1
            if (r2 <= r3) goto L_0x0090
            int r2 = m8607a(r18)
            int r4 = m8607a(r18)
            r5 = -1
            if (r4 == r5) goto L_0x0082
            int r5 = r18.mo19383b()
            if (r4 <= r5) goto L_0x001d
            goto L_0x0082
        L_0x001d:
            r5 = 4
            r6 = 3
            r7 = 8
            r8 = 0
            if (r2 != r5) goto L_0x004d
            if (r4 >= r7) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r2 = r0.f9626b
            int r5 = r18.mo19387d()
            int r9 = r18.mo19389e()
            int r10 = r18.mo19396j()
            int r11 = r18.mo19387d()
            r0.mo19386c(r2)
            r2 = 181(0xb5, float:2.54E-43)
            if (r5 != r2) goto L_0x004d
            r2 = 49
            if (r9 != r2) goto L_0x004d
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r10 != r2) goto L_0x004d
            if (r11 != r6) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x007e
            r0.mo19388d(r7)
            int r2 = r18.mo19387d()
            r2 = r2 & 31
            r0.mo19388d(r3)
            int r2 = r2 * 3
            int r3 = r0.f9626b
            int r5 = r1.length
        L_0x0061:
            if (r8 >= r5) goto L_0x0077
            r9 = r1[r8]
            r0.mo19386c(r3)
            r9.mo19041a(r0, r2)
            r12 = 1
            r14 = 0
            r15 = 0
            r10 = r16
            r13 = r2
            r9.mo19038a(r10, r12, r13, r14, r15)
            int r8 = r8 + 1
            goto L_0x0061
        L_0x0077:
            int r2 = r2 + 10
            int r4 = r4 - r2
            r0.mo19388d(r4)
            goto L_0x0004
        L_0x007e:
            r0.mo19388d(r4)
            goto L_0x0004
        L_0x0082:
            java.lang.String r2 = "CeaUtil"
            java.lang.String r3 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r2, r3)
            int r2 = r0.f9627c
            r0.mo19386c(r2)
            goto L_0x0004
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p075h.p076a.C3463a.m8608a(long, com.fyber.inneractive.sdk.player.c.k.k, com.fyber.inneractive.sdk.player.c.d.n[]):void");
    }

    /* renamed from: a */
    private static int m8607a(C3548k kVar) {
        int i = 0;
        while (kVar.mo19383b() != 0) {
            int d = kVar.mo19387d();
            i += d;
            if (d != 255) {
                return i;
            }
        }
        return -1;
    }
}
