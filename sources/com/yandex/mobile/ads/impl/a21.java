package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;

public final class a21 implements w50 {

    /* renamed from: a */
    private final de1 f30413a;

    /* renamed from: b */
    private final SparseArray<C12351a> f30414b = new SparseArray<>();

    /* renamed from: c */
    private final fy0 f30415c = new fy0(4096);

    /* renamed from: d */
    private final z11 f30416d = new z11();

    /* renamed from: e */
    private boolean f30417e;

    /* renamed from: f */
    private boolean f30418f;

    /* renamed from: g */
    private boolean f30419g;

    /* renamed from: h */
    private long f30420h;

    /* renamed from: i */
    private y11 f30421i;

    /* renamed from: j */
    private x50 f30422j;

    /* renamed from: k */
    private boolean f30423k;

    static {
        $$Lambda$a21$WxZEPJNV8PXuwUlqLNP_Hsyj8CI r0 = $$Lambda$a21$WxZEPJNV8PXuwUlqLNP_Hsyj8CI.INSTANCE;
    }

    public a21(de1 de1) {
        this.f30413a = de1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static w50[] m33585a() {
        return new w50[]{new a21(new de1(0))};
    }

    public void release() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.a21$a */
    private static final class C12351a {

        /* renamed from: a */
        private final a30 f30424a;

        /* renamed from: b */
        private final de1 f30425b;

        /* renamed from: c */
        private final ey0 f30426c = new ey0(new byte[64]);

        /* renamed from: d */
        private boolean f30427d;

        /* renamed from: e */
        private boolean f30428e;

        /* renamed from: f */
        private boolean f30429f;

        /* renamed from: g */
        private long f30430g;

        public C12351a(a30 a30, de1 de1) {
            this.f30424a = a30;
            this.f30425b = de1;
        }

        /* renamed from: a */
        public void mo65655a() {
            this.f30429f = false;
            this.f30424a.mo65661a();
        }

        /* renamed from: a */
        public void mo65656a(fy0 fy0) throws jy0 {
            fy0.mo67104a(this.f30426c.f33187a, 0, 3);
            this.f30426c.mo66895c(0);
            this.f30426c.mo66897d(8);
            this.f30427d = this.f30426c.mo66900f();
            this.f30428e = this.f30426c.mo66900f();
            this.f30426c.mo66897d(6);
            fy0.mo67104a(this.f30426c.f33187a, 0, this.f30426c.mo66886a(8));
            this.f30426c.mo66895c(0);
            this.f30430g = 0;
            if (this.f30427d) {
                this.f30426c.mo66897d(4);
                this.f30426c.mo66897d(1);
                this.f30426c.mo66897d(1);
                long a = (((long) this.f30426c.mo66886a(3)) << 30) | ((long) (this.f30426c.mo66886a(15) << 15)) | ((long) this.f30426c.mo66886a(15));
                this.f30426c.mo66897d(1);
                if (!this.f30429f && this.f30428e) {
                    this.f30426c.mo66897d(4);
                    this.f30426c.mo66897d(1);
                    this.f30426c.mo66897d(1);
                    this.f30426c.mo66897d(1);
                    this.f30425b.mo66566b((((long) this.f30426c.mo66886a(3)) << 30) | ((long) (this.f30426c.mo66886a(15) << 15)) | ((long) this.f30426c.mo66886a(15)));
                    this.f30429f = true;
                }
                this.f30430g = this.f30425b.mo66566b(a);
            }
            this.f30424a.mo65662a(this.f30430g, 4);
            this.f30424a.mo65663a(fy0);
            this.f30424a.mo65665b();
        }
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        ikVar.mo67806a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ikVar.mo67805a(bArr[13] & 7, false);
        ikVar.mo67806a(bArr, 0, 3, false);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f30422j = x50;
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        if ((this.f30413a.mo66567c() == -9223372036854775807L) || !(this.f30413a.mo66563a() == 0 || this.f30413a.mo66563a() == j2)) {
            this.f30413a.mo66569d();
            this.f30413a.mo66568c(j2);
        }
        y11 y11 = this.f30421i;
        if (y11 != null) {
            y11.mo66548a(j2);
        }
        for (int i = 0; i < this.f30414b.size(); i++) {
            this.f30414b.valueAt(i).mo65655a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64888a(com.yandex.mobile.ads.impl.C13416ik r17, com.yandex.mobile.ads.impl.r01 r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            long r9 = r17.mo67804a()
            r11 = -1
            r13 = 1
            r14 = 0
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            if (r3 == 0) goto L_0x0026
            com.yandex.mobile.ads.impl.z11 r3 = r0.f30416d
            boolean r3 = r3.mo71148c()
            if (r3 != 0) goto L_0x0026
            com.yandex.mobile.ads.impl.z11 r3 = r0.f30416d
            int r1 = r3.mo71145a((com.yandex.mobile.ads.impl.C13416ik) r1, (com.yandex.mobile.ads.impl.r01) r2)
            return r1
        L_0x0026:
            boolean r3 = r0.f30423k
            if (r3 != 0) goto L_0x006d
            r0.f30423k = r13
            com.yandex.mobile.ads.impl.z11 r3 = r0.f30416d
            long r3 = r3.mo71146a()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x005b
            com.yandex.mobile.ads.impl.y11 r7 = new com.yandex.mobile.ads.impl.y11
            com.yandex.mobile.ads.impl.z11 r3 = r0.f30416d
            com.yandex.mobile.ads.impl.de1 r4 = r3.mo71147b()
            com.yandex.mobile.ads.impl.z11 r3 = r0.f30416d
            long r5 = r3.mo71146a()
            r3 = r7
            r13 = r7
            r7 = r9
            r3.<init>(r4, r5, r7)
            r0.f30421i = r13
            com.yandex.mobile.ads.impl.x50 r3 = r0.f30422j
            com.yandex.mobile.ads.impl.s71 r4 = r13.mo66547a()
            r3.mo65309a(r4)
            goto L_0x006d
        L_0x005b:
            com.yandex.mobile.ads.impl.x50 r3 = r0.f30422j
            com.yandex.mobile.ads.impl.s71$b r4 = new com.yandex.mobile.ads.impl.s71$b
            com.yandex.mobile.ads.impl.z11 r5 = r0.f30416d
            long r5 = r5.mo71146a()
            r7 = 0
            r4.<init>(r5, r7)
            r3.mo65309a(r4)
        L_0x006d:
            com.yandex.mobile.ads.impl.y11 r3 = r0.f30421i
            if (r3 == 0) goto L_0x007e
            boolean r3 = r3.mo66551b()
            if (r3 == 0) goto L_0x007e
            com.yandex.mobile.ads.impl.y11 r3 = r0.f30421i
            int r1 = r3.mo66546a((com.yandex.mobile.ads.impl.C13416ik) r1, (com.yandex.mobile.ads.impl.r01) r2)
            return r1
        L_0x007e:
            r17.mo67812d()
            if (r15 == 0) goto L_0x0089
            long r2 = r17.mo67808b()
            long r9 = r9 - r2
            goto L_0x008a
        L_0x0089:
            r9 = r11
        L_0x008a:
            r2 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0096
            r3 = 4
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0096
            return r2
        L_0x0096:
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f30415c
            byte[] r3 = r3.f33778a
            r4 = 4
            r5 = 1
            boolean r3 = r1.mo67806a(r3, r14, r4, r5)
            if (r3 != 0) goto L_0x00a3
            return r2
        L_0x00a3:
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f30415c
            r3.mo67112e(r14)
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f30415c
            int r3 = r3.mo67113f()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r3 != r4) goto L_0x00b3
            return r2
        L_0x00b3:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r3 != r2) goto L_0x00d5
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            byte[] r2 = r2.f33778a
            r3 = 10
            r1.mo67806a(r2, r14, r3, r14)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            r3 = 9
            r2.mo67112e(r3)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            int r2 = r2.mo67126r()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.mo67813d(r2)
            return r14
        L_0x00d5:
            r2 = 443(0x1bb, float:6.21E-43)
            r4 = 2
            r5 = 6
            if (r3 != r2) goto L_0x00f2
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            byte[] r2 = r2.f33778a
            r1.mo67806a(r2, r14, r4, r14)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            r2.mo67112e(r14)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            int r2 = r2.mo67132x()
            int r2 = r2 + r5
            r1.mo67813d(r2)
            return r14
        L_0x00f2:
            r2 = r3 & -256(0xffffffffffffff00, float:NaN)
            int r2 = r2 >> 8
            r6 = 1
            if (r2 == r6) goto L_0x00fd
            r1.mo67813d(r6)
            return r14
        L_0x00fd:
            r2 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.yandex.mobile.ads.impl.a21$a> r3 = r0.f30414b
            java.lang.Object r3 = r3.get(r2)
            com.yandex.mobile.ads.impl.a21$a r3 = (com.yandex.mobile.ads.impl.a21.C12351a) r3
            boolean r6 = r0.f30417e
            if (r6 != 0) goto L_0x0188
            if (r3 != 0) goto L_0x0167
            r6 = 189(0xbd, float:2.65E-43)
            r7 = 0
            if (r2 != r6) goto L_0x0122
            com.yandex.mobile.ads.impl.d r6 = new com.yandex.mobile.ads.impl.d
            r6.<init>(r7)
            r8 = 1
            r0.f30418f = r8
            long r9 = r17.mo67811c()
            r0.f30420h = r9
        L_0x0120:
            r7 = r6
            goto L_0x014b
        L_0x0122:
            r8 = 1
            r6 = r2 & 224(0xe0, float:3.14E-43)
            r9 = 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L_0x0137
            com.yandex.mobile.ads.impl.to0 r6 = new com.yandex.mobile.ads.impl.to0
            r6.<init>(r7)
            r0.f30418f = r8
            long r9 = r17.mo67811c()
            r0.f30420h = r9
            goto L_0x0120
        L_0x0137:
            r6 = r2 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r6 != r9) goto L_0x014b
            com.yandex.mobile.ads.impl.i90 r6 = new com.yandex.mobile.ads.impl.i90
            r6.<init>(r7)
            r0.f30419g = r8
            long r7 = r17.mo67811c()
            r0.f30420h = r7
            goto L_0x0120
        L_0x014b:
            if (r7 == 0) goto L_0x0167
            com.yandex.mobile.ads.impl.tf1$d r3 = new com.yandex.mobile.ads.impl.tf1$d
            r6 = 256(0x100, float:3.59E-43)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.<init>(r8, r2, r6)
            com.yandex.mobile.ads.impl.x50 r6 = r0.f30422j
            r7.mo65664a((com.yandex.mobile.ads.impl.x50) r6, (com.yandex.mobile.ads.impl.tf1.C14678d) r3)
            com.yandex.mobile.ads.impl.a21$a r3 = new com.yandex.mobile.ads.impl.a21$a
            com.yandex.mobile.ads.impl.de1 r6 = r0.f30413a
            r3.<init>(r7, r6)
            android.util.SparseArray<com.yandex.mobile.ads.impl.a21$a> r6 = r0.f30414b
            r6.put(r2, r3)
        L_0x0167:
            boolean r2 = r0.f30418f
            if (r2 == 0) goto L_0x0175
            boolean r2 = r0.f30419g
            if (r2 == 0) goto L_0x0175
            long r6 = r0.f30420h
            r8 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 + r8
            goto L_0x0178
        L_0x0175:
            r6 = 1048576(0x100000, double:5.180654E-318)
        L_0x0178:
            long r8 = r17.mo67811c()
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0188
            r2 = 1
            r0.f30417e = r2
            com.yandex.mobile.ads.impl.x50 r2 = r0.f30422j
            r2.mo65311c()
        L_0x0188:
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            byte[] r2 = r2.f33778a
            r1.mo67806a(r2, r14, r4, r14)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            r2.mo67112e(r14)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f30415c
            int r2 = r2.mo67132x()
            int r2 = r2 + r5
            if (r3 != 0) goto L_0x01a1
            r1.mo67813d(r2)
            goto L_0x01bf
        L_0x01a1:
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f30415c
            r4.mo67108c(r2)
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f30415c
            byte[] r4 = r4.f33778a
            r1.mo67809b(r4, r14, r2, r14)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f30415c
            r1.mo67112e(r5)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f30415c
            r3.mo65656a(r1)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f30415c
            byte[] r2 = r1.f33778a
            int r2 = r2.length
            r1.mo67110d(r2)
        L_0x01bf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.a21.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }
}
