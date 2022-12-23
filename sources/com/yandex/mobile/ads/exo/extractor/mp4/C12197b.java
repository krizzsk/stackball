package com.yandex.mobile.ads.exo.extractor.mp4;

import android.util.Pair;
import com.yandex.mobile.ads.exo.extractor.mp4.C12194a;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.je1;
import com.yandex.mobile.ads.impl.wn0;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.b */
final class C12197b {

    /* renamed from: a */
    private static final byte[] f29605a = ih1.m37390b("OpusHead");

    /* renamed from: b */
    public static final /* synthetic */ int f29606b = 0;

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.b$a */
    private static final class C12198a {

        /* renamed from: a */
        public final int f29607a;

        /* renamed from: b */
        public int f29608b;

        /* renamed from: c */
        public int f29609c;

        /* renamed from: d */
        public long f29610d;

        /* renamed from: e */
        private final boolean f29611e;

        /* renamed from: f */
        private final fy0 f29612f;

        /* renamed from: g */
        private final fy0 f29613g;

        /* renamed from: h */
        private int f29614h;

        /* renamed from: i */
        private int f29615i;

        public C12198a(fy0 fy0, fy0 fy02, boolean z) {
            this.f29613g = fy0;
            this.f29612f = fy02;
            this.f29611e = z;
            fy02.mo67112e(12);
            this.f29607a = fy02.mo67130v();
            fy0.mo67112e(12);
            this.f29615i = fy0.mo67130v();
            C13479j9.m37709b(fy0.mo67113f() != 1 ? false : true, "first_chunk must be 1");
            this.f29608b = -1;
        }

        /* renamed from: a */
        public boolean mo64884a() {
            long j;
            int i = this.f29608b + 1;
            this.f29608b = i;
            if (i == this.f29607a) {
                return false;
            }
            if (this.f29611e) {
                j = this.f29612f.mo67131w();
            } else {
                j = this.f29612f.mo67128t();
            }
            this.f29610d = j;
            if (this.f29608b == this.f29614h) {
                this.f29609c = this.f29613g.mo67130v();
                this.f29613g.mo67114f(4);
                int i2 = this.f29615i - 1;
                this.f29615i = i2;
                this.f29614h = i2 > 0 ? this.f29613g.mo67130v() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.b$b */
    private interface C12199b {
        /* renamed from: a */
        int mo64885a();

        /* renamed from: b */
        int mo64886b();

        /* renamed from: c */
        boolean mo64887c();
    }

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.b$c */
    static final class C12200c implements C12199b {

        /* renamed from: a */
        private final int f29616a;

        /* renamed from: b */
        private final int f29617b;

        /* renamed from: c */
        private final fy0 f29618c;

        public C12200c(C12194a.C12196b bVar) {
            fy0 fy0 = bVar.f29604b;
            this.f29618c = fy0;
            fy0.mo67112e(12);
            this.f29616a = fy0.mo67130v();
            this.f29617b = fy0.mo67130v();
        }

        /* renamed from: a */
        public int mo64885a() {
            return this.f29617b;
        }

        /* renamed from: b */
        public int mo64886b() {
            int i = this.f29616a;
            return i == 0 ? this.f29618c.mo67130v() : i;
        }

        /* renamed from: c */
        public boolean mo64887c() {
            return this.f29616a != 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.b$d */
    static final class C12201d implements C12199b {

        /* renamed from: a */
        private final fy0 f29619a;

        /* renamed from: b */
        private final int f29620b;

        /* renamed from: c */
        private final int f29621c;

        /* renamed from: d */
        private int f29622d;

        /* renamed from: e */
        private int f29623e;

        public C12201d(C12194a.C12196b bVar) {
            fy0 fy0 = bVar.f29604b;
            this.f29619a = fy0;
            fy0.mo67112e(12);
            this.f29621c = fy0.mo67130v() & 255;
            this.f29620b = fy0.mo67130v();
        }

        /* renamed from: a */
        public int mo64885a() {
            return this.f29620b;
        }

        /* renamed from: b */
        public int mo64886b() {
            int i = this.f29621c;
            if (i == 8) {
                return this.f29619a.mo67126r();
            }
            if (i == 16) {
                return this.f29619a.mo67132x();
            }
            int i2 = this.f29622d;
            this.f29622d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f29623e & 15;
            }
            int r = this.f29619a.mo67126r();
            this.f29623e = r;
            return (r & 240) >> 4;
        }

        /* renamed from: c */
        public boolean mo64887c() {
            return false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.b$e */
    private static final class C12202e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f29624a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f29625b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f29626c;

        public C12202e(int i, long j, int i2) {
            this.f29624a = i;
            this.f29625b = j;
            this.f29626c = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x08af  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0931  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.impl.ie1 m31805a(com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a r53, com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b r54, long r55, com.yandex.mobile.ads.exo.drm.DrmInitData r57, boolean r58, boolean r59) throws com.yandex.mobile.ads.impl.jy0 {
        /*
            r0 = r53
            r1 = r57
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r2 = r0.mo64882c(r2)
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r3 = r2.mo64883d(r3)
            com.yandex.mobile.ads.impl.fy0 r3 = r3.f29604b
            r4 = 16
            r3.mo67112e(r4)
            int r3 = r3.mo67113f()
            r6 = 4
            r8 = -1
            r10 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r3 != r10) goto L_0x0026
            r13 = 1
            goto L_0x004c
        L_0x0026:
            r10 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 != r10) goto L_0x002d
            r13 = 2
            goto L_0x004c
        L_0x002d:
            r10 = 1952807028(0x74657874, float:7.272211E31)
            if (r3 == r10) goto L_0x004b
            r10 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r3 == r10) goto L_0x004b
            r10 = 1937072756(0x73756274, float:1.944137E31)
            if (r3 == r10) goto L_0x004b
            r10 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r3 != r10) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            r10 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 != r10) goto L_0x0049
            r13 = 4
            goto L_0x004c
        L_0x0049:
            r13 = -1
            goto L_0x004c
        L_0x004b:
            r13 = 3
        L_0x004c:
            r3 = 0
            if (r13 != r8) goto L_0x0050
            return r3
        L_0x0050:
            r10 = 1953196132(0x746b6864, float:7.46037E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r10 = r0.mo64883d(r10)
            com.yandex.mobile.ads.impl.fy0 r10 = r10.f29604b
            r11 = 8
            r10.mo67112e(r11)
            int r12 = r10.mo67113f()
            int r12 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r12)
            if (r12 != 0) goto L_0x006b
            r14 = 8
            goto L_0x006d
        L_0x006b:
            r14 = 16
        L_0x006d:
            r10.mo67114f(r14)
            int r14 = r10.mo67113f()
            r10.mo67114f(r6)
            int r15 = r10.mo67105b()
            if (r12 != 0) goto L_0x007f
            r5 = 4
            goto L_0x0081
        L_0x007f:
            r5 = 8
        L_0x0081:
            r9 = 0
        L_0x0082:
            if (r9 >= r5) goto L_0x0091
            byte[] r7 = r10.f33778a
            int r20 = r15 + r9
            byte r7 = r7[r20]
            if (r7 == r8) goto L_0x008e
            r7 = 0
            goto L_0x0092
        L_0x008e:
            int r9 = r9 + 1
            goto L_0x0082
        L_0x0091:
            r7 = 1
        L_0x0092:
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x00a1
            r10.mo67114f(r5)
        L_0x009e:
            r8 = r22
            goto L_0x00b3
        L_0x00a1:
            if (r12 != 0) goto L_0x00a8
            long r24 = r10.mo67128t()
            goto L_0x00ac
        L_0x00a8:
            long r24 = r10.mo67131w()
        L_0x00ac:
            int r5 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r5 != 0) goto L_0x00b1
            goto L_0x009e
        L_0x00b1:
            r8 = r24
        L_0x00b3:
            r10.mo67114f(r4)
            int r7 = r10.mo67113f()
            int r12 = r10.mo67113f()
            r10.mo67114f(r6)
            int r15 = r10.mo67113f()
            int r10 = r10.mo67113f()
            r5 = 65536(0x10000, float:9.18355E-41)
            r6 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x00d8
            if (r12 != r5) goto L_0x00d8
            if (r15 != r6) goto L_0x00d8
            if (r10 != 0) goto L_0x00d8
            r5 = 90
            goto L_0x00ef
        L_0x00d8:
            if (r7 != 0) goto L_0x00e3
            if (r12 != r6) goto L_0x00e3
            if (r15 != r5) goto L_0x00e3
            if (r10 != 0) goto L_0x00e3
            r5 = 270(0x10e, float:3.78E-43)
            goto L_0x00ef
        L_0x00e3:
            if (r7 != r6) goto L_0x00ee
            if (r12 != 0) goto L_0x00ee
            if (r15 != 0) goto L_0x00ee
            if (r10 != r6) goto L_0x00ee
            r5 = 180(0xb4, float:2.52E-43)
            goto L_0x00ef
        L_0x00ee:
            r5 = 0
        L_0x00ef:
            com.yandex.mobile.ads.exo.extractor.mp4.b$e r6 = new com.yandex.mobile.ads.exo.extractor.mp4.b$e
            r6.<init>(r14, r8, r5)
            int r5 = (r55 > r22 ? 1 : (r55 == r22 ? 0 : -1))
            if (r5 != 0) goto L_0x0101
            long r7 = r6.f29625b
            r5 = r54
            r26 = r7
            goto L_0x0105
        L_0x0101:
            r5 = r54
            r26 = r55
        L_0x0105:
            com.yandex.mobile.ads.impl.fy0 r5 = r5.f29604b
            r5.mo67112e(r11)
            int r7 = r5.mo67113f()
            int r7 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r7)
            if (r7 != 0) goto L_0x0117
            r7 = 8
            goto L_0x0119
        L_0x0117:
            r7 = 16
        L_0x0119:
            r5.mo67114f(r7)
            long r7 = r5.mo67128t()
            int r5 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r5 != 0) goto L_0x0127
            r9 = r22
            goto L_0x0130
        L_0x0127:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r7
            long r9 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r26, (long) r28, (long) r30)
        L_0x0130:
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r5 = r2.mo64882c(r5)
            r12 = 1937007212(0x7374626c, float:1.9362132E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r5 = r5.mo64882c(r12)
            r12 = 1835296868(0x6d646864, float:4.418049E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = r2.mo64883d(r12)
            com.yandex.mobile.ads.impl.fy0 r2 = r2.f29604b
            r2.mo67112e(r11)
            int r12 = r2.mo67113f()
            int r12 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r12)
            if (r12 != 0) goto L_0x0157
            r14 = 8
            goto L_0x0159
        L_0x0157:
            r14 = 16
        L_0x0159:
            r2.mo67114f(r14)
            long r14 = r2.mo67128t()
            if (r12 != 0) goto L_0x0164
            r12 = 4
            goto L_0x0166
        L_0x0164:
            r12 = 8
        L_0x0166:
            r2.mo67114f(r12)
            int r2 = r2.mo67132x()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r4 = ""
            r12.append(r4)
            int r4 = r2 >> 10
            r4 = r4 & 31
            int r4 = r4 + 96
            char r4 = (char) r4
            r12.append(r4)
            int r4 = r2 >> 5
            r4 = r4 & 31
            int r4 = r4 + 96
            char r4 = (char) r4
            r12.append(r4)
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            android.util.Pair r2 = android.util.Pair.create(r4, r2)
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r4 = r5.mo64883d(r4)
            com.yandex.mobile.ads.impl.fy0 r4 = r4.f29604b
            int r12 = r6.f29624a
            int r14 = r6.f29626c
            java.lang.Object r5 = r2.second
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r5 = 12
            r4.mo67112e(r5)
            int r5 = r4.mo67113f()
            com.yandex.mobile.ads.impl.je1[] r11 = new com.yandex.mobile.ads.impl.je1[r5]
            r26 = r3
            r3 = 0
            r38 = 0
            r41 = 0
        L_0x01c7:
            if (r3 >= r5) goto L_0x08a1
            r54 = r5
            int r5 = r4.mo67105b()
            r55 = r9
            int r9 = r4.mo67113f()
            r42 = r7
            if (r9 <= 0) goto L_0x01db
            r10 = 1
            goto L_0x01dc
        L_0x01db:
            r10 = 0
        L_0x01dc:
            java.lang.String r7 = "childAtomSize should be positive"
            com.yandex.mobile.ads.impl.C13479j9.m37706a(r10, r7)
            int r8 = r4.mo67113f()
            r10 = 1635148593(0x61766331, float:2.840654E20)
            if (r8 == r10) goto L_0x0690
            r10 = 1635148595(0x61766333, float:2.8406544E20)
            if (r8 == r10) goto L_0x0690
            r10 = 1701733238(0x656e6376, float:7.035987E22)
            if (r8 == r10) goto L_0x0690
            r10 = 1836070006(0x6d703476, float:4.646239E27)
            if (r8 == r10) goto L_0x0690
            r10 = 1752589105(0x68766331, float:4.6541277E24)
            if (r8 == r10) goto L_0x0690
            r10 = 1751479857(0x68657631, float:4.3344087E24)
            if (r8 == r10) goto L_0x0690
            r10 = 1932670515(0x73323633, float:1.4119387E31)
            if (r8 == r10) goto L_0x0690
            r10 = 1987063864(0x76703038, float:1.21789965E33)
            if (r8 == r10) goto L_0x0690
            r10 = 1987063865(0x76703039, float:1.2178997E33)
            if (r8 == r10) goto L_0x0690
            r10 = 1635135537(0x61763031, float:2.8383572E20)
            if (r8 == r10) goto L_0x0690
            r10 = 1685479798(0x64766176, float:1.8179687E22)
            if (r8 == r10) goto L_0x0690
            r10 = 1685479729(0x64766131, float:1.817961E22)
            if (r8 == r10) goto L_0x0690
            r10 = 1685481573(0x64766865, float:1.8181686E22)
            if (r8 == r10) goto L_0x0690
            r10 = 1685481521(0x64766831, float:1.8181627E22)
            if (r8 != r10) goto L_0x022d
            goto L_0x0690
        L_0x022d:
            r10 = 1836069985(0x6d703461, float:4.6462328E27)
            r44 = r13
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r45 = r2
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r8 == r10) goto L_0x034f
            if (r8 == r13) goto L_0x034f
            r10 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r8 == r10) goto L_0x034f
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r8 == r10) goto L_0x034f
            r10 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r8 == r10) goto L_0x034f
            r10 = 1685353315(0x64747363, float:1.803728E22)
            if (r8 == r10) goto L_0x034f
            r10 = 1685353317(0x64747365, float:1.8037282E22)
            if (r8 == r10) goto L_0x034f
            r10 = 1685353320(0x64747368, float:1.8037286E22)
            if (r8 == r10) goto L_0x034f
            r10 = 1685353324(0x6474736c, float:1.803729E22)
            if (r8 == r10) goto L_0x034f
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r8 == r10) goto L_0x034f
            r10 = 1935767394(0x73617762, float:1.7863284E31)
            if (r8 == r10) goto L_0x034f
            r10 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r8 == r10) goto L_0x034f
            r10 = 1936684916(0x736f7774, float:1.89725E31)
            if (r8 == r10) goto L_0x034f
            r10 = 1953984371(0x74776f73, float:7.841539E31)
            if (r8 == r10) goto L_0x034f
            r10 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r8 == r10) goto L_0x034f
            if (r8 == r2) goto L_0x034f
            r10 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r8 == r10) goto L_0x034f
            r10 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r8 == r10) goto L_0x034f
            r10 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r8 == r10) goto L_0x034f
            r10 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r8 != r10) goto L_0x0297
            goto L_0x034f
        L_0x0297:
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r8 == r2) goto L_0x02ce
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r8 == r2) goto L_0x02ce
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r8 == r2) goto L_0x02ce
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r8 == r2) goto L_0x02ce
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r8 != r2) goto L_0x02b1
            goto L_0x02ce
        L_0x02b1:
            r2 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r8 != r2) goto L_0x02ca
            java.lang.String r2 = java.lang.Integer.toString(r12)
            java.lang.String r7 = "application/x-camera-motion"
            r8 = -1
            r10 = 0
            com.yandex.mobile.ads.exo.Format r26 = com.yandex.mobile.ads.exo.Format.m31686a(r2, r7, r10, r8, r10)
            r46 = r54
            r51 = r3
            r49 = r6
            goto L_0x0344
        L_0x02ca:
            r46 = r54
            goto L_0x0393
        L_0x02ce:
            r10 = r54
            int r2 = r5 + 8
            r7 = 8
            int r2 = r2 + r7
            r4.mo67112e(r2)
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r8 != r2) goto L_0x02eb
            java.lang.String r2 = "application/ttml+xml"
        L_0x02e4:
            r34 = r26
            r36 = 0
        L_0x02e8:
            r27 = r2
            goto L_0x032a
        L_0x02eb:
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r8 != r2) goto L_0x0306
            int r2 = r9 + -8
            int r2 = r2 - r7
            byte[] r7 = new byte[r2]
            r8 = 0
            r4.mo67104a(r7, r8, r2)
            java.util.List r2 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r36 = r2
            r34 = r26
            r27 = r7
            goto L_0x032a
        L_0x0306:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r8 != r2) goto L_0x030e
            java.lang.String r2 = "application/x-mp4-vtt"
            goto L_0x02e4
        L_0x030e:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r8 != r2) goto L_0x031c
            java.lang.String r2 = "application/ttml+xml"
            r27 = r2
            r34 = r20
            r36 = 0
            goto L_0x032a
        L_0x031c:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r8 != r2) goto L_0x0349
            java.lang.String r2 = "application/x-mp4-cea-608"
            r34 = r26
            r36 = 0
            r41 = 1
            goto L_0x02e8
        L_0x032a:
            java.lang.String r26 = java.lang.Integer.toString(r12)
            r28 = 0
            r29 = -1
            r30 = 0
            r32 = -1
            r33 = 0
            r31 = r15
            com.yandex.mobile.ads.exo.Format r26 = com.yandex.mobile.ads.exo.Format.m31684a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r51 = r3
            r49 = r6
            r46 = r10
        L_0x0344:
            r52 = r11
            r50 = r14
            goto L_0x039c
        L_0x0349:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x034f:
            r10 = r54
            int r27 = r5 + 8
            r2 = 8
            int r13 = r27 + 8
            r4.mo67112e(r13)
            if (r59 == 0) goto L_0x0365
            int r13 = r4.mo67132x()
            r2 = 6
            r4.mo67114f(r2)
            goto L_0x0369
        L_0x0365:
            r4.mo67114f(r2)
            r13 = 0
        L_0x0369:
            if (r13 == 0) goto L_0x039f
            r2 = 1
            if (r13 != r2) goto L_0x036f
            goto L_0x039f
        L_0x036f:
            r2 = 2
            if (r13 != r2) goto L_0x0391
            r2 = 16
            r4.mo67114f(r2)
            long r29 = r4.mo67122n()
            double r29 = java.lang.Double.longBitsToDouble(r29)
            r2 = r14
            long r13 = java.lang.Math.round(r29)
            int r14 = (int) r13
            int r13 = r4.mo67130v()
            r46 = r10
            r10 = 20
            r4.mo67114f(r10)
            goto L_0x03ba
        L_0x0391:
            r46 = r10
        L_0x0393:
            r2 = r14
            r50 = r2
            r51 = r3
            r49 = r6
            r52 = r11
        L_0x039c:
            r1 = 3
            goto L_0x0885
        L_0x039f:
            r46 = r10
            r2 = r14
            int r10 = r4.mo67132x()
            r14 = 6
            r4.mo67114f(r14)
            int r14 = r4.mo67127s()
            r27 = r10
            r10 = 1
            if (r13 != r10) goto L_0x03b8
            r10 = 16
            r4.mo67114f(r10)
        L_0x03b8:
            r13 = r27
        L_0x03ba:
            int r10 = r4.mo67105b()
            r27 = r13
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r8 != r13) goto L_0x03f4
            android.util.Pair r13 = m31804a(r4, r5, r9)
            if (r13 == 0) goto L_0x03ef
            java.lang.Object r8 = r13.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r1 != 0) goto L_0x03d9
            r28 = r8
            r8 = 0
            goto L_0x03e5
        L_0x03d9:
            r28 = r8
            java.lang.Object r8 = r13.second
            com.yandex.mobile.ads.impl.je1 r8 = (com.yandex.mobile.ads.impl.je1) r8
            java.lang.String r8 = r8.f35269b
            com.yandex.mobile.ads.exo.drm.DrmInitData r8 = r1.mo64833a((java.lang.String) r8)
        L_0x03e5:
            java.lang.Object r13 = r13.second
            com.yandex.mobile.ads.impl.je1 r13 = (com.yandex.mobile.ads.impl.je1) r13
            r11[r3] = r13
            r13 = r8
            r8 = r28
            goto L_0x03f0
        L_0x03ef:
            r13 = r1
        L_0x03f0:
            r4.mo67112e(r10)
            goto L_0x03f5
        L_0x03f4:
            r13 = r1
        L_0x03f5:
            r28 = r10
            r10 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r8 != r10) goto L_0x0401
            java.lang.String r10 = "audio/ac3"
        L_0x03fe:
            r8 = -1
            goto L_0x048e
        L_0x0401:
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r8 != r10) goto L_0x0409
            java.lang.String r10 = "audio/eac3"
            goto L_0x03fe
        L_0x0409:
            r10 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r8 != r10) goto L_0x0411
            java.lang.String r10 = "audio/ac4"
            goto L_0x03fe
        L_0x0411:
            r10 = 1685353315(0x64747363, float:1.803728E22)
            if (r8 != r10) goto L_0x0419
            java.lang.String r10 = "audio/vnd.dts"
            goto L_0x03fe
        L_0x0419:
            r10 = 1685353320(0x64747368, float:1.8037286E22)
            if (r8 == r10) goto L_0x048a
            r10 = 1685353324(0x6474736c, float:1.803729E22)
            if (r8 != r10) goto L_0x0425
            goto L_0x048a
        L_0x0425:
            r10 = 1685353317(0x64747365, float:1.8037282E22)
            if (r8 != r10) goto L_0x042d
            java.lang.String r10 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03fe
        L_0x042d:
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r8 != r10) goto L_0x0435
            java.lang.String r10 = "audio/3gpp"
            goto L_0x03fe
        L_0x0435:
            r10 = 1935767394(0x73617762, float:1.7863284E31)
            if (r8 != r10) goto L_0x043d
            java.lang.String r10 = "audio/amr-wb"
            goto L_0x03fe
        L_0x043d:
            r10 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r8 == r10) goto L_0x0486
            r10 = 1936684916(0x736f7774, float:1.89725E31)
            if (r8 != r10) goto L_0x0448
            goto L_0x0486
        L_0x0448:
            r10 = 1953984371(0x74776f73, float:7.841539E31)
            if (r8 != r10) goto L_0x0452
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r10 = "audio/raw"
            goto L_0x048e
        L_0x0452:
            r10 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r8 != r10) goto L_0x045a
            java.lang.String r10 = "audio/mpeg"
            goto L_0x03fe
        L_0x045a:
            r10 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r8 != r10) goto L_0x0462
            java.lang.String r10 = "audio/alac"
            goto L_0x03fe
        L_0x0462:
            r10 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r8 != r10) goto L_0x046a
            java.lang.String r10 = "audio/g711-alaw"
            goto L_0x03fe
        L_0x046a:
            r10 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r8 != r10) goto L_0x0472
            java.lang.String r10 = "audio/g711-mlaw"
            goto L_0x03fe
        L_0x0472:
            r10 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r8 != r10) goto L_0x047a
            java.lang.String r10 = "audio/opus"
            goto L_0x03fe
        L_0x047a:
            r10 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r8 != r10) goto L_0x0483
            java.lang.String r10 = "audio/flac"
            goto L_0x03fe
        L_0x0483:
            r8 = -1
            r10 = 0
            goto L_0x048e
        L_0x0486:
            java.lang.String r10 = "audio/raw"
            r8 = 2
            goto L_0x048e
        L_0x048a:
            java.lang.String r10 = "audio/vnd.dts.hd"
            goto L_0x03fe
        L_0x048e:
            r49 = r6
            r40 = r10
            r48 = r14
            r47 = r27
            r14 = r28
            r10 = 0
        L_0x0499:
            int r6 = r14 - r5
            if (r6 >= r9) goto L_0x065c
            r4.mo67112e(r14)
            int r6 = r4.mo67113f()
            if (r6 <= 0) goto L_0x04a8
            r0 = 1
            goto L_0x04a9
        L_0x04a8:
            r0 = 0
        L_0x04a9:
            com.yandex.mobile.ads.impl.C13479j9.m37706a(r0, r7)
            int r0 = r4.mo67113f()
            r50 = r2
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 == r2) goto L_0x05f4
            if (r59 == 0) goto L_0x04c7
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r0 != r2) goto L_0x04c7
            r51 = r3
            r52 = r11
            r2 = 1702061171(0x65736473, float:7.183675E22)
            goto L_0x05f8
        L_0x04c7:
            r2 = 1684103987(0x64616333, float:1.6630662E22)
            if (r0 != r2) goto L_0x04e2
            int r0 = r14 + 8
            r4.mo67112e(r0)
            java.lang.String r0 = java.lang.Integer.toString(r12)
            com.yandex.mobile.ads.exo.Format r0 = com.yandex.mobile.ads.impl.C12944e.m35518a(r4, r0, r15, r13)
        L_0x04d9:
            r26 = r0
            r51 = r3
            r52 = r11
        L_0x04df:
            r2 = -1
            goto L_0x0651
        L_0x04e2:
            r2 = 1684366131(0x64656333, float:1.692581E22)
            if (r0 != r2) goto L_0x04f5
            int r0 = r14 + 8
            r4.mo67112e(r0)
            java.lang.String r0 = java.lang.Integer.toString(r12)
            com.yandex.mobile.ads.exo.Format r0 = com.yandex.mobile.ads.impl.C12944e.m35520b(r4, r0, r15, r13)
            goto L_0x04d9
        L_0x04f5:
            r2 = 1684103988(0x64616334, float:1.6630663E22)
            if (r0 != r2) goto L_0x0537
            int r0 = r14 + 8
            r4.mo67112e(r0)
            java.lang.String r26 = java.lang.Integer.toString(r12)
            r0 = 1
            r4.mo67114f(r0)
            int r2 = r4.mo67126r()
            r2 = r2 & 32
            int r2 = r2 >> 5
            if (r2 != r0) goto L_0x0518
            r0 = 48000(0xbb80, float:6.7262E-41)
            r32 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x051e
        L_0x0518:
            r0 = 44100(0xac44, float:6.1797E-41)
            r32 = 44100(0xac44, float:6.1797E-41)
        L_0x051e:
            r28 = 0
            r29 = -1
            r30 = -1
            r31 = 2
            r33 = -1
            r34 = 0
            r36 = 0
            java.lang.String r27 = "audio/ac4"
            r35 = r13
            r37 = r15
            com.yandex.mobile.ads.exo.Format r0 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29, (int) r30, (int) r31, (int) r32, (int) r33, (java.util.List<byte[]>) r34, (com.yandex.mobile.ads.exo.drm.DrmInitData) r35, (int) r36, (java.lang.String) r37)
            goto L_0x04d9
        L_0x0537:
            r2 = 1684305011(0x64647473, float:1.6856995E22)
            if (r0 != r2) goto L_0x055c
            java.lang.String r26 = java.lang.Integer.toString(r12)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = -1
            r34 = 0
            r36 = 0
            r27 = r40
            r31 = r47
            r32 = r48
            r35 = r13
            r37 = r15
            com.yandex.mobile.ads.exo.Format r0 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29, (int) r30, (int) r31, (int) r32, (int) r33, (java.util.List<byte[]>) r34, (com.yandex.mobile.ads.exo.drm.DrmInitData) r35, (int) r36, (java.lang.String) r37)
            goto L_0x04d9
        L_0x055c:
            r2 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r0 != r2) goto L_0x057d
            int r0 = r6 + -8
            byte[] r2 = f29605a
            int r10 = r2.length
            int r10 = r10 + r0
            byte[] r10 = new byte[r10]
            r51 = r3
            int r3 = r2.length
            r52 = r11
            r11 = 0
            java.lang.System.arraycopy(r2, r11, r10, r11, r3)
            int r3 = r14 + 8
            r4.mo67112e(r3)
            int r2 = r2.length
            r4.mo67104a(r10, r2, r0)
            goto L_0x04df
        L_0x057d:
            r51 = r3
            r52 = r11
            r2 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r0 != r2) goto L_0x05ac
            int r0 = r6 + -12
            int r2 = r0 + 4
            byte[] r2 = new byte[r2]
            r3 = 102(0x66, float:1.43E-43)
            r10 = 0
            r2[r10] = r3
            r3 = 76
            r10 = 1
            r2[r10] = r3
            r3 = 97
            r10 = 2
            r2[r10] = r3
            r3 = 67
            r10 = 3
            r2[r10] = r3
            int r3 = r14 + 12
            r4.mo67112e(r3)
            r3 = 4
            r4.mo67104a(r2, r3, r0)
            r10 = r2
            goto L_0x04df
        L_0x05ac:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r3 = 4
            if (r0 != r2) goto L_0x04df
            int r0 = r6 + -12
            byte[] r10 = new byte[r0]
            int r11 = r14 + 12
            r4.mo67112e(r11)
            r11 = 0
            r4.mo67104a(r10, r11, r0)
            com.yandex.mobile.ads.impl.fy0 r0 = new com.yandex.mobile.ads.impl.fy0
            r0.<init>((byte[]) r10)
            r2 = 9
            r0.mo67112e(r2)
            int r2 = r0.mo67126r()
            r3 = 20
            r0.mo67112e(r3)
            int r0 = r0.mo67130v()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r48 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r47 = r0.intValue()
            goto L_0x04df
        L_0x05f4:
            r51 = r3
            r52 = r11
        L_0x05f8:
            r11 = 0
            if (r0 != r2) goto L_0x05fe
            r0 = r14
        L_0x05fc:
            r2 = -1
            goto L_0x0624
        L_0x05fe:
            int r0 = r4.mo67105b()
        L_0x0602:
            int r2 = r0 - r14
            if (r2 >= r6) goto L_0x0622
            r4.mo67112e(r0)
            int r2 = r4.mo67113f()
            if (r2 <= 0) goto L_0x0611
            r3 = 1
            goto L_0x0612
        L_0x0611:
            r3 = 0
        L_0x0612:
            com.yandex.mobile.ads.impl.C13479j9.m37706a(r3, r7)
            int r3 = r4.mo67113f()
            r11 = 1702061171(0x65736473, float:7.183675E22)
            if (r3 != r11) goto L_0x061f
            goto L_0x05fc
        L_0x061f:
            int r0 = r0 + r2
            r11 = 0
            goto L_0x0602
        L_0x0622:
            r0 = -1
            goto L_0x05fc
        L_0x0624:
            if (r0 == r2) goto L_0x0651
            android.util.Pair r0 = m31803a(r4, r0)
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.lang.String r10 = "audio/mp4a-latm"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x064e
            android.util.Pair r10 = com.yandex.mobile.ads.impl.C12972eg.m35652a((byte[]) r0)
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r48 = r11.intValue()
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r47 = r10.intValue()
        L_0x064e:
            r10 = r0
            r40 = r3
        L_0x0651:
            int r14 = r14 + r6
            r0 = r53
            r2 = r50
            r3 = r51
            r11 = r52
            goto L_0x0499
        L_0x065c:
            r50 = r2
            r51 = r3
            r52 = r11
            r2 = -1
            if (r26 != 0) goto L_0x039c
            if (r40 == 0) goto L_0x039c
            java.lang.String r26 = java.lang.Integer.toString(r12)
            r28 = 0
            r29 = -1
            r30 = -1
            if (r10 != 0) goto L_0x0676
            r34 = 0
            goto L_0x067c
        L_0x0676:
            java.util.List r0 = java.util.Collections.singletonList(r10)
            r34 = r0
        L_0x067c:
            r36 = 0
            r27 = r40
            r31 = r47
            r32 = r48
            r33 = r8
            r35 = r13
            r37 = r15
            com.yandex.mobile.ads.exo.Format r26 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29, (int) r30, (int) r31, (int) r32, (int) r33, (java.util.List<byte[]>) r34, (com.yandex.mobile.ads.exo.drm.DrmInitData) r35, (int) r36, (java.lang.String) r37)
            goto L_0x039c
        L_0x0690:
            r46 = r54
            r45 = r2
            r51 = r3
            r49 = r6
            r52 = r11
            r44 = r13
            r50 = r14
            r2 = -1
            int r0 = r5 + 8
            r3 = 8
            int r0 = r0 + r3
            r4.mo67112e(r0)
            r0 = 16
            r4.mo67114f(r0)
            int r31 = r4.mo67132x()
            int r32 = r4.mo67132x()
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 50
            r4.mo67114f(r6)
            int r6 = r4.mo67105b()
            r10 = 1701733238(0x656e6376, float:7.035987E22)
            if (r8 != r10) goto L_0x06ee
            android.util.Pair r10 = m31804a(r4, r5, r9)
            if (r10 == 0) goto L_0x06e7
            java.lang.Object r8 = r10.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r1 != 0) goto L_0x06d6
            r11 = 0
            goto L_0x06e0
        L_0x06d6:
            java.lang.Object r11 = r10.second
            com.yandex.mobile.ads.impl.je1 r11 = (com.yandex.mobile.ads.impl.je1) r11
            java.lang.String r11 = r11.f35269b
            com.yandex.mobile.ads.exo.drm.DrmInitData r11 = r1.mo64833a((java.lang.String) r11)
        L_0x06e0:
            java.lang.Object r10 = r10.second
            com.yandex.mobile.ads.impl.je1 r10 = (com.yandex.mobile.ads.impl.je1) r10
            r52[r51] = r10
            goto L_0x06e8
        L_0x06e7:
            r11 = r1
        L_0x06e8:
            r4.mo67112e(r6)
            r40 = r11
            goto L_0x06f0
        L_0x06ee:
            r40 = r1
        L_0x06f0:
            r11 = r38
            r3 = 0
            r10 = 0
            r27 = 0
            r34 = 0
            r36 = 1065353216(0x3f800000, float:1.0)
            r37 = 0
            r38 = -1
        L_0x06fe:
            int r13 = r6 - r5
            if (r13 >= r9) goto L_0x086b
            r4.mo67112e(r6)
            int r13 = r4.mo67105b()
            int r14 = r4.mo67113f()
            if (r14 != 0) goto L_0x0719
            int r22 = r4.mo67105b()
            int r0 = r22 - r5
            if (r0 != r9) goto L_0x0719
            goto L_0x086b
        L_0x0719:
            if (r14 <= 0) goto L_0x071d
            r0 = 1
            goto L_0x071e
        L_0x071d:
            r0 = 0
        L_0x071e:
            com.yandex.mobile.ads.impl.C13479j9.m37706a(r0, r7)
            int r0 = r4.mo67113f()
            r2 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r2) goto L_0x0748
            if (r27 != 0) goto L_0x072e
            r0 = 1
            goto L_0x072f
        L_0x072e:
            r0 = 0
        L_0x072f:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            int r13 = r13 + 8
            r4.mo67112e(r13)
            com.yandex.mobile.ads.exo.video.a r0 = com.yandex.mobile.ads.exo.video.C12339a.m32497a(r4)
            java.util.List<byte[]> r2 = r0.f30325a
            int r11 = r0.f30326b
            if (r3 != 0) goto L_0x0745
            float r0 = r0.f30329e
            r36 = r0
        L_0x0745:
            java.lang.String r27 = "video/avc"
            goto L_0x0765
        L_0x0748:
            r2 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r2) goto L_0x076a
            if (r27 != 0) goto L_0x0751
            r0 = 1
            goto L_0x0752
        L_0x0751:
            r0 = 0
        L_0x0752:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            int r13 = r13 + 8
            r4.mo67112e(r13)
            com.yandex.mobile.ads.exo.video.b r0 = com.yandex.mobile.ads.exo.video.C12340b.m32498a(r4)
            java.util.List<byte[]> r2 = r0.f30330a
            int r0 = r0.f30331b
            java.lang.String r27 = "video/hevc"
            r11 = r0
        L_0x0765:
            r34 = r2
        L_0x0767:
            r1 = 3
            goto L_0x0863
        L_0x076a:
            r2 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r2) goto L_0x0854
            r2 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 != r2) goto L_0x0776
            goto L_0x0854
        L_0x0776:
            r2 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r2) goto L_0x078e
            if (r27 != 0) goto L_0x077f
            r0 = 1
            goto L_0x0780
        L_0x077f:
            r0 = 0
        L_0x0780:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            r2 = 1987063864(0x76703038, float:1.21789965E33)
            if (r8 != r2) goto L_0x078b
            java.lang.String r27 = "video/x-vnd.on2.vp8"
            goto L_0x0767
        L_0x078b:
            java.lang.String r27 = "video/x-vnd.on2.vp9"
            goto L_0x0767
        L_0x078e:
            r2 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r2) goto L_0x079e
            if (r27 != 0) goto L_0x0797
            r0 = 1
            goto L_0x0798
        L_0x0797:
            r0 = 0
        L_0x0798:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            java.lang.String r27 = "video/av01"
            goto L_0x0767
        L_0x079e:
            r2 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r2) goto L_0x07ae
            if (r27 != 0) goto L_0x07a7
            r0 = 1
            goto L_0x07a8
        L_0x07a7:
            r0 = 0
        L_0x07a8:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            java.lang.String r27 = "video/3gpp"
            goto L_0x0767
        L_0x07ae:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r2) goto L_0x07ce
            if (r27 != 0) goto L_0x07b7
            r0 = 1
            goto L_0x07b8
        L_0x07b7:
            r0 = 0
        L_0x07b8:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)
            android.util.Pair r0 = m31803a(r4, r13)
            java.lang.Object r13 = r0.first
            r27 = r13
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r34 = java.util.Collections.singletonList(r0)
            goto L_0x0767
        L_0x07ce:
            r2 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r2) goto L_0x07e8
            int r13 = r13 + 8
            r4.mo67112e(r13)
            int r0 = r4.mo67130v()
            int r2 = r4.mo67130v()
            float r0 = (float) r0
            float r2 = (float) r2
            float r36 = r0 / r2
            r1 = 3
            r3 = 1
            goto L_0x0863
        L_0x07e8:
            r2 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r2) goto L_0x081e
            int r0 = r13 + 8
        L_0x07ef:
            int r2 = r0 - r13
            if (r2 >= r14) goto L_0x0818
            r4.mo67112e(r0)
            int r2 = r4.mo67113f()
            int r1 = r4.mo67113f()
            r54 = r3
            r3 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r1 != r3) goto L_0x0812
            byte[] r1 = r4.f33778a
            int r2 = r2 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r2)
            r3 = r54
            r37 = r0
            goto L_0x0767
        L_0x0812:
            int r0 = r0 + r2
            r3 = r54
            r1 = r57
            goto L_0x07ef
        L_0x0818:
            r54 = r3
            r1 = 3
            r37 = 0
            goto L_0x0863
        L_0x081e:
            r54 = r3
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r1) goto L_0x0852
            int r0 = r4.mo67126r()
            r1 = 3
            r4.mo67114f(r1)
            if (r0 != 0) goto L_0x0861
            int r0 = r4.mo67126r()
            if (r0 == 0) goto L_0x084d
            r2 = 1
            if (r0 == r2) goto L_0x0848
            r2 = 2
            if (r0 == r2) goto L_0x0843
            if (r0 == r1) goto L_0x083e
            goto L_0x0861
        L_0x083e:
            r3 = r54
            r38 = 3
            goto L_0x0863
        L_0x0843:
            r3 = r54
            r38 = 2
            goto L_0x0863
        L_0x0848:
            r3 = r54
            r38 = 1
            goto L_0x0863
        L_0x084d:
            r3 = r54
            r38 = 0
            goto L_0x0863
        L_0x0852:
            r1 = 3
            goto L_0x0861
        L_0x0854:
            r54 = r3
            r1 = 3
            com.yandex.mobile.ads.impl.b20 r0 = com.yandex.mobile.ads.impl.b20.m34115a(r4)
            if (r0 == 0) goto L_0x0861
            java.lang.String r10 = r0.f31202a
            java.lang.String r27 = "video/dolby-vision"
        L_0x0861:
            r3 = r54
        L_0x0863:
            int r6 = r6 + r14
            r1 = r57
            r0 = 16
            r2 = -1
            goto L_0x06fe
        L_0x086b:
            r1 = 3
            if (r27 != 0) goto L_0x086f
            goto L_0x0883
        L_0x086f:
            java.lang.String r26 = java.lang.Integer.toString(r12)
            r29 = -1
            r30 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r39 = 0
            r28 = r10
            r35 = r50
            com.yandex.mobile.ads.exo.Format r26 = com.yandex.mobile.ads.exo.Format.m31681a((java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29, (int) r30, (int) r31, (int) r32, (float) r33, (java.util.List<byte[]>) r34, (int) r35, (float) r36, (byte[]) r37, (int) r38, (com.yandex.mobile.ads.exo.video.ColorInfo) r39, (com.yandex.mobile.ads.exo.drm.DrmInitData) r40)
        L_0x0883:
            r38 = r11
        L_0x0885:
            int r5 = r5 + r9
            r4.mo67112e(r5)
            int r3 = r51 + 1
            r0 = r53
            r9 = r55
            r1 = r57
            r7 = r42
            r13 = r44
            r2 = r45
            r5 = r46
            r6 = r49
            r14 = r50
            r11 = r52
            goto L_0x01c7
        L_0x08a1:
            r45 = r2
            r49 = r6
            r42 = r7
            r55 = r9
            r52 = r11
            r44 = r13
            if (r58 != 0) goto L_0x0928
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r53
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r0 = r1.mo64882c(r0)
            if (r0 == 0) goto L_0x0916
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r0 = r0.mo64883d(r1)
            if (r0 != 0) goto L_0x08c4
            goto L_0x0916
        L_0x08c4:
            com.yandex.mobile.ads.impl.fy0 r0 = r0.f29604b
            r1 = 8
            r0.mo67112e(r1)
            int r1 = r0.mo67113f()
            int r1 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r1)
            int r2 = r0.mo67130v()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r7 = 0
        L_0x08dc:
            if (r7 >= r2) goto L_0x090f
            r5 = 1
            if (r1 != r5) goto L_0x08e6
            long r8 = r0.mo67131w()
            goto L_0x08ea
        L_0x08e6:
            long r8 = r0.mo67128t()
        L_0x08ea:
            r3[r7] = r8
            if (r1 != r5) goto L_0x08f3
            long r8 = r0.mo67122n()
            goto L_0x08f8
        L_0x08f3:
            int r6 = r0.mo67113f()
            long r8 = (long) r6
        L_0x08f8:
            r4[r7] = r8
            short r6 = r0.mo67124p()
            if (r6 != r5) goto L_0x0907
            r6 = 2
            r0.mo67114f(r6)
            int r7 = r7 + 1
            goto L_0x08dc
        L_0x0907:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x090f:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x091b
        L_0x0916:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x091b:
            java.lang.Object r2 = r1.first
            long[] r2 = (long[]) r2
            java.lang.Object r1 = r1.second
            long[] r1 = (long[]) r1
            r25 = r1
            r24 = r2
            goto L_0x092d
        L_0x0928:
            r0 = 0
            r24 = r0
            r25 = r24
        L_0x092d:
            if (r26 != 0) goto L_0x0931
            r3 = r0
            goto L_0x0955
        L_0x0931:
            com.yandex.mobile.ads.impl.ie1 r3 = new com.yandex.mobile.ads.impl.ie1
            int r12 = r49.f29624a
            r0 = r45
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
            r0 = r52
            r11 = r3
            r13 = r44
            r16 = r42
            r18 = r55
            r20 = r26
            r21 = r41
            r22 = r0
            r23 = r38
            r11.<init>(r12, r13, r14, r16, r18, r20, r21, r22, r23, r24, r25)
        L_0x0955:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12197b.m31805a(com.yandex.mobile.ads.exo.extractor.mp4.a$a, com.yandex.mobile.ads.exo.extractor.mp4.a$b, long, com.yandex.mobile.ads.exo.drm.DrmInitData, boolean, boolean):com.yandex.mobile.ads.impl.ie1");
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m31803a(fy0 fy0, int i) {
        fy0.mo67112e(i + 8 + 4);
        fy0.mo67114f(1);
        m31802a(fy0);
        fy0.mo67114f(2);
        int r = fy0.mo67126r();
        if ((r & 128) != 0) {
            fy0.mo67114f(2);
        }
        if ((r & 64) != 0) {
            fy0.mo67114f(fy0.mo67132x());
        }
        if ((r & 32) != 0) {
            fy0.mo67114f(2);
        }
        fy0.mo67114f(1);
        m31802a(fy0);
        String a = wn0.m43724a(fy0.mo67126r());
        if ("audio/mpeg".equals(a) || "audio/vnd.dts".equals(a) || "audio/vnd.dts.hd".equals(a)) {
            return Pair.create(a, (Object) null);
        }
        fy0.mo67114f(12);
        fy0.mo67114f(1);
        int a2 = m31802a(fy0);
        byte[] bArr = new byte[a2];
        fy0.mo67104a(bArr, 0, a2);
        return Pair.create(a, bArr);
    }

    /* renamed from: a */
    private static Pair<Integer, je1> m31804a(fy0 fy0, int i, int i2) {
        Pair<Integer, je1> pair;
        Integer num;
        je1 je1;
        int i3;
        int i4;
        byte[] bArr;
        fy0 fy02 = fy0;
        int b = fy0.mo67105b();
        while (b - i < i2) {
            fy02.mo67112e(b);
            int f = fy0.mo67113f();
            boolean z = true;
            C13479j9.m37706a(f > 0, "childAtomSize should be positive");
            if (fy0.mo67113f() == 1936289382) {
                int i5 = b + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - b < f) {
                    fy02.mo67112e(i5);
                    int f2 = fy0.mo67113f();
                    int f3 = fy0.mo67113f();
                    if (f3 == 1718775137) {
                        num2 = Integer.valueOf(fy0.mo67113f());
                    } else if (f3 == 1935894637) {
                        fy02.mo67114f(4);
                        str = fy02.mo67106b(4);
                    } else if (f3 == 1935894633) {
                        i6 = i5;
                        i7 = f2;
                    }
                    i5 += f2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C13479j9.m37706a(num2 != null, "frma atom is mandatory");
                    C13479j9.m37706a(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            je1 = null;
                            break;
                        }
                        fy02.mo67112e(i8);
                        int f4 = fy0.mo67113f();
                        if (fy0.mo67113f() == 1952804451) {
                            int b2 = C12194a.m31799b(fy0.mo67113f());
                            fy02.mo67114f(1);
                            if (b2 == 0) {
                                fy02.mo67114f(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int r = fy0.mo67126r();
                                i4 = r & 15;
                                i3 = (r & 240) >> 4;
                            }
                            boolean z2 = fy0.mo67126r() == 1;
                            int r2 = fy0.mo67126r();
                            byte[] bArr2 = new byte[16];
                            fy02.mo67104a(bArr2, 0, 16);
                            if (!z2 || r2 != 0) {
                                bArr = null;
                            } else {
                                int r3 = fy0.mo67126r();
                                byte[] bArr3 = new byte[r3];
                                fy02.mo67104a(bArr3, 0, r3);
                                bArr = bArr3;
                            }
                            num = num2;
                            je1 = new je1(z2, str, r2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += f4;
                        }
                    }
                    if (je1 == null) {
                        z = false;
                    }
                    C13479j9.m37706a(z, "tenc atom is mandatory");
                    pair = Pair.create(num, je1);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            b += f;
        }
        return null;
    }

    /* renamed from: a */
    private static int m31802a(fy0 fy0) {
        int r = fy0.mo67126r();
        int i = r & 127;
        while ((r & 128) == 128) {
            r = fy0.mo67126r();
            i = (i << 7) | (r & 127);
        }
        return i;
    }
}
