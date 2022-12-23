package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.tf1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.c */
public final class C12685c implements w50 {

    /* renamed from: a */
    private final C12844d f31743a = new C12844d();

    /* renamed from: b */
    private final fy0 f31744b = new fy0(2786);

    /* renamed from: c */
    private boolean f31745c;

    static {
        $$Lambda$c$Vi0NfuXAP4kCnfGg_8WwYxoro r0 = $$Lambda$c$Vi0NfuXAP4kCnfGg_8WwYxoro.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ w50[] m34529a() {
        return new w50[]{new C12685c()};
    }

    public void release() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r8.mo67812d();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if ((r4 - r3) < 8192) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo64891a(com.yandex.mobile.ads.impl.C13416ik r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.fy0 r0 = new com.yandex.mobile.ads.impl.fy0
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f33778a
            r8.mo67806a(r4, r2, r1, r2)
            r0.mo67112e(r2)
            int r4 = r0.mo67129u()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0059
            r8.mo67812d()
            r8.mo67805a(r3, r2)
            r4 = r3
        L_0x0021:
            r1 = 0
        L_0x0022:
            byte[] r5 = r0.f33778a
            r6 = 6
            r8.mo67806a(r5, r2, r6, r2)
            r0.mo67112e(r2)
            int r5 = r0.mo67132x()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0043
            r8.mo67812d()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x003f
            return r2
        L_0x003f:
            r8.mo67805a(r4, r2)
            goto L_0x0021
        L_0x0043:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0049
            return r5
        L_0x0049:
            byte[] r5 = r0.f33778a
            int r5 = com.yandex.mobile.ads.impl.C12944e.m35517a((byte[]) r5)
            r6 = -1
            if (r5 != r6) goto L_0x0053
            return r2
        L_0x0053:
            int r5 = r5 + -6
            r8.mo67805a(r5, r2)
            goto L_0x0022
        L_0x0059:
            r4 = 3
            r0.mo67114f(r4)
            int r4 = r0.mo67125q()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo67805a(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12685c.mo64891a(com.yandex.mobile.ads.impl.ik):boolean");
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f31743a.mo65664a(x50, new tf1.C14678d(Integer.MIN_VALUE, 0, 1));
        x50.mo65311c();
        x50.mo65309a(new s71.C14567b(-9223372036854775807L, 0));
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f31745c = false;
        this.f31743a.mo65661a();
    }

    /* renamed from: a */
    public int mo64888a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        int b = ikVar.mo67807b(this.f31744b.f33778a, 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.f31744b.mo67112e(0);
        this.f31744b.mo67110d(b);
        if (!this.f31745c) {
            this.f31743a.mo65662a(0, 4);
            this.f31745c = true;
        }
        this.f31743a.mo65663a(this.f31744b);
        return 0;
    }
}
