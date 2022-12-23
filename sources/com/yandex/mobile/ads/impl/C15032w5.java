package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.tf1;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.w5 */
public final class C15032w5 implements w50 {

    /* renamed from: a */
    private final C15147x5 f41873a = new C15147x5(true);

    /* renamed from: b */
    private final fy0 f41874b = new fy0(2048);

    /* renamed from: c */
    private final fy0 f41875c;

    /* renamed from: d */
    private final ey0 f41876d;

    /* renamed from: e */
    private x50 f41877e;

    /* renamed from: f */
    private long f41878f;

    /* renamed from: g */
    private long f41879g = -1;

    /* renamed from: h */
    private int f41880h = -1;

    /* renamed from: i */
    private boolean f41881i;

    /* renamed from: j */
    private boolean f41882j;

    static {
        $$Lambda$w5$nawLgYDFKbmtNHw1H0menH6RaA r0 = $$Lambda$w5$nawLgYDFKbmtNHw1H0menH6RaA.INSTANCE;
    }

    public C15032w5(int i) {
        fy0 fy0 = new fy0(10);
        this.f41875c = fy0;
        this.f41876d = new ey0(fy0.f33778a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static w50[] m43523a() {
        return new w50[]{new C15032w5(0)};
    }

    /* renamed from: b */
    private int m43524b(C13416ik ikVar) throws IOException, InterruptedException {
        int i = 0;
        while (true) {
            ikVar.mo67806a(this.f41875c.f33778a, 0, 10, false);
            this.f41875c.mo67112e(0);
            if (this.f41875c.mo67129u() != 4801587) {
                break;
            }
            this.f41875c.mo67114f(3);
            int q = this.f41875c.mo67125q();
            i += q + 10;
            ikVar.mo67805a(q, false);
        }
        ikVar.mo67812d();
        ikVar.mo67805a(i, false);
        if (this.f41879g == -1) {
            this.f41879g = (long) i;
        }
        return i;
    }

    public void release() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.mo67812d();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo64891a(com.yandex.mobile.ads.impl.C13416ik r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.m43524b(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            com.yandex.mobile.ads.impl.fy0 r5 = r8.f41875c
            byte[] r5 = r5.f33778a
            r6 = 2
            r9.mo67806a(r5, r1, r6, r1)
            com.yandex.mobile.ads.impl.fy0 r5 = r8.f41875c
            r5.mo67112e(r1)
            com.yandex.mobile.ads.impl.fy0 r5 = r8.f41875c
            int r5 = r5.mo67132x()
            boolean r5 = com.yandex.mobile.ads.impl.C15147x5.m43952a((int) r5)
            if (r5 != 0) goto L_0x0031
            r9.mo67812d()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.mo67805a(r3, r1)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            com.yandex.mobile.ads.impl.fy0 r5 = r8.f41875c
            byte[] r5 = r5.f33778a
            r9.mo67806a(r5, r1, r6, r1)
            com.yandex.mobile.ads.impl.ey0 r5 = r8.f41876d
            r6 = 14
            r5.mo66895c(r6)
            com.yandex.mobile.ads.impl.ey0 r5 = r8.f41876d
            r6 = 13
            int r5 = r5.mo66886a((int) r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.mo67805a(r6, r1)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15032w5.mo64891a(com.yandex.mobile.ads.impl.ik):boolean");
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f41877e = x50;
        this.f41873a.mo65664a(x50, new tf1.C14678d(Integer.MIN_VALUE, 0, 1));
        x50.mo65311c();
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f41881i = false;
        this.f41873a.mo65661a();
        this.f41878f = j2;
    }

    /* renamed from: a */
    public int mo64888a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        ikVar.mo67804a();
        int b = ikVar.mo67807b(this.f41874b.f33778a, 0, 2048);
        boolean z = b == -1;
        if (!this.f41882j) {
            x50 x50 = this.f41877e;
            x50.getClass();
            x50.mo65309a(new s71.C14567b(-9223372036854775807L, 0));
            this.f41882j = true;
        }
        if (z) {
            return -1;
        }
        this.f41874b.mo67112e(0);
        this.f41874b.mo67110d(b);
        if (!this.f41881i) {
            this.f41873a.mo65662a(this.f41878f, 4);
            this.f41881i = true;
        }
        this.f41873a.mo65663a(this.f41874b);
        return 0;
    }
}
