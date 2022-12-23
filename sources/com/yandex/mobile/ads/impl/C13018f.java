package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.tf1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.f */
public final class C13018f implements w50 {

    /* renamed from: a */
    private final C13152g f33195a = new C13152g();

    /* renamed from: b */
    private final fy0 f33196b = new fy0(16384);

    /* renamed from: c */
    private boolean f33197c;

    static {
        $$Lambda$f$rhuC1Nx8r4tNsB4tq9xzoSix6rQ r0 = $$Lambda$f$rhuC1Nx8r4tNsB4tq9xzoSix6rQ.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ w50[] m35858a() {
        return new w50[]{new C13018f()};
    }

    public void release() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r15.mo67812d();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if ((r4 - r3) < 8192) goto L_0x0046;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo64891a(com.yandex.mobile.ads.impl.C13416ik r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r14 = this;
            com.yandex.mobile.ads.impl.fy0 r0 = new com.yandex.mobile.ads.impl.fy0
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f33778a
            r15.mo67806a(r4, r2, r1, r2)
            r0.mo67112e(r2)
            int r4 = r0.mo67129u()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L_0x008e
            r15.mo67812d()
            r15.mo67805a(r3, r2)
            r4 = r3
        L_0x0022:
            r1 = 0
        L_0x0023:
            byte[] r5 = r0.f33778a
            r7 = 7
            r15.mo67806a(r5, r2, r7, r2)
            r0.mo67112e(r2)
            int r5 = r0.mo67132x()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L_0x004a
            if (r5 == r9) goto L_0x004a
            r15.mo67812d()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0046
            return r2
        L_0x0046:
            r15.mo67805a(r4, r2)
            goto L_0x0022
        L_0x004a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L_0x0050
            return r8
        L_0x0050:
            byte[] r8 = r0.f33778a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L_0x0058
            r11 = -1
            goto L_0x0085
        L_0x0058:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x007f
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0080
        L_0x007f:
            r7 = 4
        L_0x0080:
            if (r5 != r9) goto L_0x0084
            int r7 = r7 + 2
        L_0x0084:
            int r11 = r11 + r7
        L_0x0085:
            if (r11 != r12) goto L_0x0088
            return r2
        L_0x0088:
            int r11 = r11 + -7
            r15.mo67805a(r11, r2)
            goto L_0x0023
        L_0x008e:
            r0.mo67114f(r6)
            int r4 = r0.mo67125q()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.mo67805a(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13018f.mo64891a(com.yandex.mobile.ads.impl.ik):boolean");
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f33195a.mo65664a(x50, new tf1.C14678d(Integer.MIN_VALUE, 0, 1));
        x50.mo65311c();
        x50.mo65309a(new s71.C14567b(-9223372036854775807L, 0));
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f33197c = false;
        this.f33195a.mo65661a();
    }

    /* renamed from: a */
    public int mo64888a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        int b = ikVar.mo67807b(this.f33196b.f33778a, 0, 16384);
        if (b == -1) {
            return -1;
        }
        this.f33196b.mo67112e(0);
        this.f33196b.mo67110d(b);
        if (!this.f33197c) {
            this.f33195a.mo65662a(0, 4);
            this.f33197c = true;
        }
        this.f33195a.mo65663a(this.f33196b);
        return 0;
    }
}
