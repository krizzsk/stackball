package com.yandex.mobile.ads.exo.extractor.mp4;

import com.yandex.mobile.ads.exo.extractor.mp4.C12194a;
import com.yandex.mobile.ads.impl.C13416ik;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ie1;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.nq0;
import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.u71;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.x50;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.f */
public final class C12208f implements w50, s71 {

    /* renamed from: a */
    private final fy0 f29679a = new fy0(nq0.f37879a);

    /* renamed from: b */
    private final fy0 f29680b = new fy0(4);

    /* renamed from: c */
    private final fy0 f29681c = new fy0();

    /* renamed from: d */
    private final fy0 f29682d = new fy0(16);

    /* renamed from: e */
    private final ArrayDeque<C12194a.C12195a> f29683e = new ArrayDeque<>();

    /* renamed from: f */
    private int f29684f;

    /* renamed from: g */
    private int f29685g;

    /* renamed from: h */
    private long f29686h;

    /* renamed from: i */
    private int f29687i;

    /* renamed from: j */
    private fy0 f29688j;

    /* renamed from: k */
    private int f29689k = -1;

    /* renamed from: l */
    private int f29690l;

    /* renamed from: m */
    private int f29691m;

    /* renamed from: n */
    private int f29692n;

    /* renamed from: o */
    private x50 f29693o;

    /* renamed from: p */
    private C12209a[] f29694p;

    /* renamed from: q */
    private long[][] f29695q;

    /* renamed from: r */
    private int f29696r;

    /* renamed from: s */
    private long f29697s;

    /* renamed from: t */
    private boolean f29698t;

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.f$a */
    private static final class C12209a {

        /* renamed from: a */
        public final ie1 f29699a;

        /* renamed from: b */
        public final C12213j f29700b;

        /* renamed from: c */
        public final ke1 f29701c;

        /* renamed from: d */
        public int f29702d;

        public C12209a(ie1 ie1, C12213j jVar, ke1 ke1) {
            this.f29699a = ie1;
            this.f29700b = jVar;
            this.f29701c = ke1;
        }
    }

    static {
        $$Lambda$f$1HfLshJQNVcx9hdCOeWSfvIrQso r0 = $$Lambda$f$1HfLshJQNVcx9hdCOeWSfvIrQso.INSTANCE;
    }

    public C12208f(int i) {
    }

    /* renamed from: d */
    private void m31847d() {
        this.f29684f = 0;
        this.f29687i = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static w50[] m31848e() {
        return new w50[]{new C12208f(0)};
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        return C12211h.m31859b(ikVar);
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        C12209a[] aVarArr = this.f29694p;
        if (aVarArr.length == 0) {
            u71 u71 = u71.f40581c;
            return new s71.C14566a(u71, u71);
        }
        int i = this.f29696r;
        if (i != -1) {
            C12213j jVar = aVarArr[i].f29700b;
            int a = jVar.mo64901a(j);
            if (a == -1) {
                a = jVar.mo64902b(j);
            }
            if (a == -1) {
                u71 u712 = u71.f40581c;
                return new s71.C14566a(u712, u712);
            }
            long j6 = jVar.f29728f[a];
            j2 = jVar.f29725c[a];
            if (j6 >= j || a >= jVar.f29724b - 1 || (b = jVar.mo64902b(j)) == -1 || b == a) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = jVar.f29728f[b];
                j5 = jVar.f29725c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C12209a[] aVarArr2 = this.f29694p;
            if (i2 >= aVarArr2.length) {
                break;
            }
            if (i2 != this.f29696r) {
                C12213j jVar2 = aVarArr2[i2].f29700b;
                long a2 = m31845a(jVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m31845a(jVar2, j4, j3);
                }
                j2 = a2;
            }
            i2++;
        }
        u71 u713 = new u71(j, j2);
        if (j4 == -9223372036854775807L) {
            return new s71.C14566a(u713, u713);
        }
        return new s71.C14566a(u713, new u71(j4, j3));
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f29697s;
    }

    public void release() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x07f7  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x090e A[LOOP:23: B:341:0x090b->B:343:0x090e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x092d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bd  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31846c(long r55) throws com.yandex.mobile.ads.impl.jy0 {
        /*
            r54 = this;
            r0 = r54
        L_0x0002:
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r1 = r0.f29683e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x09a3
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r1 = r0.f29683e
            java.lang.Object r1 = r1.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r1 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r1
            long r3 = r1.f29601b
            int r1 = (r3 > r55 ? 1 : (r3 == r55 ? 0 : -1))
            if (r1 != 0) goto L_0x09a3
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r1 = r0.f29683e
            java.lang.Object r1 = r1.pop()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r1 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r1
            int r3 = r1.f29600a
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r3 != r4) goto L_0x0986
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.yandex.mobile.ads.impl.a90 r4 = new com.yandex.mobile.ads.impl.a90
            r4.<init>()
            r5 = 1969517665(0x75647461, float:2.8960062E32)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r5 = r1.mo64883d(r5)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            r8 = 12
            r9 = 8
            if (r5 == 0) goto L_0x00b9
            boolean r11 = r0.f29698t
            int r12 = com.yandex.mobile.ads.exo.extractor.mp4.C12197b.f29606b
            if (r11 == 0) goto L_0x004b
            goto L_0x00b2
        L_0x004b:
            com.yandex.mobile.ads.impl.fy0 r5 = r5.f29604b
            r5.mo67112e(r9)
        L_0x0050:
            int r11 = r5.mo67098a()
            if (r11 < r9) goto L_0x00b2
            int r11 = r5.mo67105b()
            int r12 = r5.mo67113f()
            int r13 = r5.mo67113f()
            if (r13 != r7) goto L_0x00ad
            r5.mo67112e(r11)
            int r11 = r11 + r12
            r5.mo67114f(r8)
        L_0x006b:
            int r12 = r5.mo67105b()
            if (r12 >= r11) goto L_0x00b2
            int r12 = r5.mo67105b()
            int r13 = r5.mo67113f()
            int r14 = r5.mo67113f()
            if (r14 != r6) goto L_0x00a8
            r5.mo67112e(r12)
            int r12 = r12 + r13
            r5.mo67114f(r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x008b:
            int r13 = r5.mo67105b()
            if (r13 >= r12) goto L_0x009b
            com.yandex.mobile.ads.exo.metadata.Metadata$Entry r13 = com.yandex.mobile.ads.exo.extractor.mp4.C12207e.m31842b(r5)
            if (r13 == 0) goto L_0x008b
            r11.add(r13)
            goto L_0x008b
        L_0x009b:
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00b2
        L_0x00a2:
            com.yandex.mobile.ads.exo.metadata.Metadata r5 = new com.yandex.mobile.ads.exo.metadata.Metadata
            r5.<init>((java.util.List<? extends com.yandex.mobile.ads.exo.metadata.Metadata.Entry>) r11)
            goto L_0x00b3
        L_0x00a8:
            int r12 = r12 + r13
            r5.mo67112e(r12)
            goto L_0x006b
        L_0x00ad:
            int r11 = r11 + r12
            r5.mo67112e(r11)
            goto L_0x0050
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            if (r5 == 0) goto L_0x00ba
            r4.mo65697a((com.yandex.mobile.ads.exo.metadata.Metadata) r5)
            goto L_0x00ba
        L_0x00b9:
            r5 = 0
        L_0x00ba:
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r7 = r1.mo64882c(r7)
            java.lang.String r11 = "AtomParsers"
            r12 = 4
            r13 = 1
            if (r7 == 0) goto L_0x01ad
            int r15 = com.yandex.mobile.ads.exo.extractor.mp4.C12197b.f29606b
            r15 = 1751411826(0x68646c72, float:4.3148E24)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r15 = r7.mo64883d(r15)
            r10 = 1801812339(0x6b657973, float:2.7741754E26)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r10 = r7.mo64883d(r10)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r6 = r7.mo64883d(r6)
            if (r15 == 0) goto L_0x01ad
            if (r10 == 0) goto L_0x01ad
            if (r6 == 0) goto L_0x01ad
            com.yandex.mobile.ads.impl.fy0 r7 = r15.f29604b
            r15 = 16
            r7.mo67112e(r15)
            int r7 = r7.mo67113f()
            r15 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r7 == r15) goto L_0x00f0
            goto L_0x01ad
        L_0x00f0:
            com.yandex.mobile.ads.impl.fy0 r7 = r10.f29604b
            r7.mo67112e(r8)
            int r10 = r7.mo67113f()
            java.lang.String[] r15 = new java.lang.String[r10]
            r2 = 0
        L_0x00fc:
            if (r2 >= r10) goto L_0x0111
            int r17 = r7.mo67113f()
            r7.mo67114f(r12)
            int r12 = r17 + -8
            java.lang.String r12 = r7.mo67106b(r12)
            r15[r2] = r12
            int r2 = r2 + 1
            r12 = 4
            goto L_0x00fc
        L_0x0111:
            com.yandex.mobile.ads.impl.fy0 r2 = r6.f29604b
            r2.mo67112e(r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x011b:
            int r7 = r2.mo67098a()
            if (r7 <= r9) goto L_0x01a0
            int r7 = r2.mo67105b()
            int r12 = r2.mo67113f()
            int r17 = r2.mo67113f()
            int r9 = r17 + -1
            if (r9 < 0) goto L_0x0179
            if (r9 >= r10) goto L_0x0179
            r9 = r15[r9]
            int r13 = r7 + r12
        L_0x0137:
            int r8 = r2.mo67105b()
            if (r8 >= r13) goto L_0x016e
            int r21 = r2.mo67113f()
            int r14 = r2.mo67113f()
            r22 = r10
            r10 = 1684108385(0x64617461, float:1.6635614E22)
            if (r14 != r10) goto L_0x0164
            int r8 = r2.mo67113f()
            int r10 = r2.mo67113f()
            int r13 = r21 + -16
            byte[] r14 = new byte[r13]
            r23 = r15
            r15 = 0
            r2.mo67104a(r14, r15, r13)
            com.yandex.mobile.ads.exo.extractor.mp4.MdtaMetadataEntry r13 = new com.yandex.mobile.ads.exo.extractor.mp4.MdtaMetadataEntry
            r13.<init>(r9, r14, r10, r8)
            goto L_0x0173
        L_0x0164:
            r23 = r15
            int r8 = r8 + r21
            r2.mo67112e(r8)
            r10 = r22
            goto L_0x0137
        L_0x016e:
            r22 = r10
            r23 = r15
            r13 = 0
        L_0x0173:
            if (r13 == 0) goto L_0x0191
            r6.add(r13)
            goto L_0x0191
        L_0x0179:
            r22 = r10
            r23 = r15
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Skipped metadata with unknown key index: "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r11, r8)
        L_0x0191:
            int r7 = r7 + r12
            r2.mo67112e(r7)
            r10 = r22
            r15 = r23
            r8 = 12
            r9 = 8
            r13 = 1
            goto L_0x011b
        L_0x01a0:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x01a7
            goto L_0x01ad
        L_0x01a7:
            com.yandex.mobile.ads.exo.metadata.Metadata r2 = new com.yandex.mobile.ads.exo.metadata.Metadata
            r2.<init>((java.util.List<? extends com.yandex.mobile.ads.exo.metadata.Metadata.Entry>) r6)
            goto L_0x01ae
        L_0x01ad:
            r2 = 0
        L_0x01ae:
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x01b5:
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r9 = r1.f29603d
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x07e0
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r9 = r1.f29603d
            java.lang.Object r9 = r9.get(r8)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r9 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r9
            int r14 = r9.f29600a
            r15 = 1953653099(0x7472616b, float:7.681346E31)
            if (r14 == r15) goto L_0x01dd
        L_0x01cc:
            r24 = r1
            r26 = r2
            r25 = r3
            r45 = r4
            r36 = r5
            r0 = r7
            r20 = r8
            r38 = r11
            goto L_0x07c4
        L_0x01dd:
            r14 = 1836476516(0x6d766864, float:4.7662196E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r23 = r1.mo64883d(r14)
            boolean r14 = r0.f29698t
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = 0
            r22 = r9
            r27 = r6
            r28 = r14
            com.yandex.mobile.ads.impl.ie1 r14 = com.yandex.mobile.ads.exo.extractor.mp4.C12197b.m31805a(r22, r23, r24, r26, r27, r28)
            if (r14 != 0) goto L_0x01fa
            goto L_0x01cc
        L_0x01fa:
            r15 = 1835297121(0x6d646961, float:4.4181236E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r9 = r9.mo64882c(r15)
            r15 = 1835626086(0x6d696e66, float:4.515217E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r9 = r9.mo64882c(r15)
            r15 = 1937007212(0x7374626c, float:1.9362132E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r9 = r9.mo64882c(r15)
            r15 = 1937011578(0x7374737a, float:1.936741E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r15 = r9.mo64883d(r15)
            if (r15 == 0) goto L_0x021e
            com.yandex.mobile.ads.exo.extractor.mp4.b$c r6 = new com.yandex.mobile.ads.exo.extractor.mp4.b$c
            r6.<init>(r15)
            goto L_0x022d
        L_0x021e:
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r6 = r9.mo64883d(r6)
            if (r6 == 0) goto L_0x07d8
            com.yandex.mobile.ads.exo.extractor.mp4.b$d r15 = new com.yandex.mobile.ads.exo.extractor.mp4.b$d
            r15.<init>(r6)
            r6 = r15
        L_0x022d:
            int r15 = r6.mo64885a()
            if (r15 != 0) goto L_0x0266
            com.yandex.mobile.ads.exo.extractor.mp4.j r6 = new com.yandex.mobile.ads.exo.extractor.mp4.j
            r9 = 0
            long[] r10 = new long[r9]
            int[] r12 = new int[r9]
            long[] r13 = new long[r9]
            int[] r15 = new int[r9]
            r31 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = r6
            r28 = r14
            r29 = r10
            r30 = r12
            r32 = r13
            r33 = r15
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r24 = r1
            r26 = r2
            r25 = r3
            r45 = r4
            r36 = r5
            r37 = r7
            r20 = r8
        L_0x0262:
            r38 = r11
            goto L_0x07b8
        L_0x0266:
            r10 = 1937007471(0x7374636f, float:1.9362445E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r10 = r9.mo64883d(r10)
            if (r10 != 0) goto L_0x0278
            r10 = 1668232756(0x636f3634, float:4.4126776E21)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r10 = r9.mo64883d(r10)
            r12 = 1
            goto L_0x0279
        L_0x0278:
            r12 = 0
        L_0x0279:
            com.yandex.mobile.ads.impl.fy0 r10 = r10.f29604b
            r13 = 1937011555(0x73747363, float:1.9367382E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r13 = r9.mo64883d(r13)
            com.yandex.mobile.ads.impl.fy0 r13 = r13.f29604b
            r24 = r1
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r1 = r9.mo64883d(r1)
            com.yandex.mobile.ads.impl.fy0 r1 = r1.f29604b
            r25 = r3
            r3 = 1937011571(0x73747373, float:1.9367401E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r3 = r9.mo64883d(r3)
            if (r3 == 0) goto L_0x029f
            com.yandex.mobile.ads.impl.fy0 r3 = r3.f29604b
            r26 = r2
            goto L_0x02a2
        L_0x029f:
            r26 = r2
            r3 = 0
        L_0x02a2:
            r2 = 1668576371(0x63747473, float:4.5093966E21)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = r9.mo64883d(r2)
            if (r2 == 0) goto L_0x02ae
            com.yandex.mobile.ads.impl.fy0 r2 = r2.f29604b
            goto L_0x02af
        L_0x02ae:
            r2 = 0
        L_0x02af:
            com.yandex.mobile.ads.exo.extractor.mp4.b$a r9 = new com.yandex.mobile.ads.exo.extractor.mp4.b$a
            r9.<init>(r13, r10, r12)
            r10 = 12
            r1.mo67112e(r10)
            int r12 = r1.mo67130v()
            r13 = 1
            int r12 = r12 - r13
            int r13 = r1.mo67130v()
            r20 = r13
            int r13 = r1.mo67130v()
            if (r2 == 0) goto L_0x02d3
            r2.mo67112e(r10)
            int r27 = r2.mo67130v()
            goto L_0x02d5
        L_0x02d3:
            r27 = 0
        L_0x02d5:
            if (r3 == 0) goto L_0x02ed
            r3.mo67112e(r10)
            int r28 = r3.mo67130v()
            if (r28 <= 0) goto L_0x02e9
            int r21 = r3.mo67130v()
            r17 = 1
            int r21 = r21 + -1
            goto L_0x02f1
        L_0x02e9:
            r3 = 0
            r21 = -1
            goto L_0x02f1
        L_0x02ed:
            r21 = -1
            r28 = 0
        L_0x02f1:
            boolean r29 = r6.mo64887c()
            if (r29 == 0) goto L_0x030d
            com.yandex.mobile.ads.exo.Format r10 = r14.f34838f
            java.lang.String r10 = r10.f29530j
            r36 = r5
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x030f
            if (r12 != 0) goto L_0x030f
            if (r27 != 0) goto L_0x030f
            if (r28 != 0) goto L_0x030f
            r5 = 1
            goto L_0x0310
        L_0x030d:
            r36 = r5
        L_0x030f:
            r5 = 0
        L_0x0310:
            if (r5 != 0) goto L_0x047e
            long[] r5 = new long[r15]
            int[] r10 = new int[r15]
            r29 = r12
            long[] r12 = new long[r15]
            int[] r0 = new int[r15]
            r38 = r4
            r37 = r7
            r7 = r13
            r4 = r21
            r33 = r27
            r13 = r28
            r34 = r29
            r21 = 0
            r29 = 0
            r31 = 0
            r39 = 0
            r40 = 0
            r27 = r1
            r28 = r14
            r1 = 0
            r14 = 0
            r53 = r20
            r20 = r8
            r8 = r53
        L_0x033f:
            if (r14 >= r15) goto L_0x03f9
            r41 = r31
            r31 = r21
            r21 = 1
        L_0x0347:
            if (r31 != 0) goto L_0x0360
            boolean r21 = r9.mo64884a()
            if (r21 == 0) goto L_0x0360
            r35 = r7
            r32 = r8
            long r7 = r9.f29610d
            r41 = r7
            int r7 = r9.f29609c
            r31 = r7
            r8 = r32
            r7 = r35
            goto L_0x0347
        L_0x0360:
            r35 = r7
            r32 = r8
            if (r21 != 0) goto L_0x0380
            java.lang.String r3 = "Unexpected end of chunk data"
            android.util.Log.w(r11, r3)
            long[] r5 = java.util.Arrays.copyOf(r5, r14)
            int[] r10 = java.util.Arrays.copyOf(r10, r14)
            long[] r12 = java.util.Arrays.copyOf(r12, r14)
            int[] r0 = java.util.Arrays.copyOf(r0, r14)
            r15 = r14
            r3 = r31
            goto L_0x0400
        L_0x0380:
            if (r2 == 0) goto L_0x0393
        L_0x0382:
            if (r40 != 0) goto L_0x0391
            if (r33 <= 0) goto L_0x0391
            int r40 = r2.mo67130v()
            int r39 = r2.mo67113f()
            int r33 = r33 + -1
            goto L_0x0382
        L_0x0391:
            int r40 = r40 + -1
        L_0x0393:
            r7 = r39
            r5[r14] = r41
            int r8 = r6.mo64886b()
            r10[r14] = r8
            r8 = r10[r14]
            if (r8 <= r1) goto L_0x03a3
            r1 = r10[r14]
        L_0x03a3:
            r43 = r5
            r8 = r6
            long r5 = (long) r7
            long r5 = r29 + r5
            r12[r14] = r5
            if (r3 != 0) goto L_0x03af
            r5 = 1
            goto L_0x03b0
        L_0x03af:
            r5 = 0
        L_0x03b0:
            r0[r14] = r5
            if (r14 != r4) goto L_0x03c0
            r5 = 1
            r0[r14] = r5
            int r13 = r13 + -1
            if (r13 <= 0) goto L_0x03c0
            int r4 = r3.mo67130v()
            int r4 = r4 - r5
        L_0x03c0:
            r6 = r0
            r21 = r1
            r5 = r35
            long r0 = (long) r5
            long r29 = r29 + r0
            int r0 = r32 + -1
            if (r0 != 0) goto L_0x03d9
            if (r34 <= 0) goto L_0x03d9
            int r0 = r27.mo67130v()
            int r1 = r27.mo67113f()
            int r34 = r34 + -1
            goto L_0x03da
        L_0x03d9:
            r1 = r5
        L_0x03da:
            r5 = r10[r14]
            r35 = r0
            r32 = r1
            long r0 = (long) r5
            long r0 = r41 + r0
            int r5 = r31 + -1
            int r14 = r14 + 1
            r39 = r7
            r7 = r32
            r31 = r0
            r0 = r6
            r6 = r8
            r1 = r21
            r8 = r35
            r21 = r5
            r5 = r43
            goto L_0x033f
        L_0x03f9:
            r6 = r0
            r43 = r5
            r32 = r8
            r3 = r21
        L_0x0400:
            r7 = r39
            long r6 = (long) r7
            long r29 = r29 + r6
        L_0x0405:
            if (r33 <= 0) goto L_0x0415
            int r4 = r2.mo67130v()
            if (r4 == 0) goto L_0x040f
            r2 = 0
            goto L_0x0416
        L_0x040f:
            r2.mo67113f()
            int r33 = r33 + -1
            goto L_0x0405
        L_0x0415:
            r2 = 1
        L_0x0416:
            if (r13 != 0) goto L_0x0428
            if (r32 != 0) goto L_0x0428
            if (r3 != 0) goto L_0x0428
            if (r34 != 0) goto L_0x0428
            r4 = r40
            if (r4 != 0) goto L_0x042a
            if (r2 != 0) goto L_0x0425
            goto L_0x042a
        L_0x0425:
            r7 = r28
            goto L_0x0478
        L_0x0428:
            r4 = r40
        L_0x042a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Inconsistent stbl box for track "
            r6.append(r7)
            r7 = r28
            int r8 = r7.f34833a
            r6.append(r8)
            java.lang.String r8 = ": remainingSynchronizationSamples "
            r6.append(r8)
            r6.append(r13)
            java.lang.String r8 = ", remainingSamplesAtTimestampDelta "
            r6.append(r8)
            r8 = r32
            r6.append(r8)
            java.lang.String r8 = ", remainingSamplesInChunk "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r3 = ", remainingTimestampDeltaChanges "
            r6.append(r3)
            r3 = r34
            r6.append(r3)
            java.lang.String r3 = ", remainingSamplesAtTimestampOffset "
            r6.append(r3)
            r6.append(r4)
            if (r2 != 0) goto L_0x046c
            java.lang.String r2 = ", ctts invalid"
            goto L_0x046e
        L_0x046c:
            java.lang.String r2 = ""
        L_0x046e:
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.w(r11, r2)
        L_0x0478:
            r9 = r0
            r31 = r1
            r8 = r5
            goto L_0x0516
        L_0x047e:
            r38 = r4
            r37 = r7
            r20 = r8
            r7 = r14
            int r0 = r9.f29607a
            long[] r1 = new long[r0]
            int[] r2 = new int[r0]
        L_0x048b:
            boolean r3 = r9.mo64884a()
            if (r3 == 0) goto L_0x049c
            int r3 = r9.f29608b
            long r4 = r9.f29610d
            r1[r3] = r4
            int r4 = r9.f29609c
            r2[r3] = r4
            goto L_0x048b
        L_0x049c:
            com.yandex.mobile.ads.exo.Format r3 = r7.f34838f
            int r4 = r3.f29545y
            int r3 = r3.f29543w
            int r3 = com.yandex.mobile.ads.impl.ih1.m37386b(r4, r3)
            long r4 = (long) r13
            r6 = 8192(0x2000, float:1.14794E-41)
            int r6 = r6 / r3
            r8 = 0
            r9 = 0
        L_0x04ac:
            if (r8 >= r0) goto L_0x04b8
            r10 = r2[r8]
            int r10 = com.yandex.mobile.ads.impl.ih1.m37366a((int) r10, (int) r6)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x04ac
        L_0x04b8:
            long[] r8 = new long[r9]
            int[] r10 = new int[r9]
            long[] r12 = new long[r9]
            int[] r9 = new int[r9]
            r13 = 0
            r14 = 0
            r21 = 0
            r27 = 0
        L_0x04c6:
            if (r13 >= r0) goto L_0x0511
            r28 = r2[r13]
            r29 = r1[r13]
            r30 = r29
            r29 = r1
            r1 = r28
            r28 = r0
            r0 = r27
        L_0x04d6:
            if (r1 <= 0) goto L_0x0504
            int r27 = java.lang.Math.min(r6, r1)
            r8[r21] = r30
            int r32 = r3 * r27
            r10[r21] = r32
            r32 = r2
            r2 = r10[r21]
            int r0 = java.lang.Math.max(r0, r2)
            r33 = r3
            long r2 = (long) r14
            long r2 = r2 * r4
            r12[r21] = r2
            r2 = 1
            r9[r21] = r2
            r2 = r10[r21]
            long r2 = (long) r2
            long r30 = r30 + r2
            int r14 = r14 + r27
            int r1 = r1 - r27
            int r21 = r21 + 1
            r2 = r32
            r3 = r33
            goto L_0x04d6
        L_0x0504:
            r32 = r2
            r33 = r3
            int r13 = r13 + 1
            r27 = r0
            r0 = r28
            r1 = r29
            goto L_0x04c6
        L_0x0511:
            long r0 = (long) r14
            long r29 = r4 * r0
            r31 = r27
        L_0x0516:
            long r4 = r7.f34835c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r29
            long r34 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r0, (long) r2, (long) r4)
            long[] r0 = r7.f34840h
            r1 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 != 0) goto L_0x0542
            long r3 = r7.f34835c
            com.yandex.mobile.ads.impl.ih1.m37380a((long[]) r12, (long) r1, (long) r3)
            com.yandex.mobile.ads.exo.extractor.mp4.j r6 = new com.yandex.mobile.ads.exo.extractor.mp4.j
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r10
            r32 = r12
            r33 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r45 = r38
            goto L_0x0262
        L_0x0542:
            int r3 = r0.length
            r4 = 1
            if (r3 != r4) goto L_0x0605
            int r3 = r7.f34834b
            if (r3 != r4) goto L_0x0605
            int r3 = r12.length
            r4 = 2
            if (r3 < r4) goto L_0x0605
            long[] r3 = r7.f34841i
            r4 = 0
            r5 = r3[r4]
            r39 = r0[r4]
            long r3 = r7.f34835c
            long r13 = r7.f34836d
            r41 = r3
            r43 = r13
            long r3 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r39, (long) r41, (long) r43)
            long r3 = r3 + r5
            int r0 = r12.length
            r13 = 1
            int r0 = r0 - r13
            int r13 = com.yandex.mobile.ads.impl.ih1.f34858a
            r14 = 4
            int r13 = java.lang.Math.min(r14, r0)
            r1 = 0
            int r2 = java.lang.Math.max(r1, r13)
            int r13 = r12.length
            int r13 = r13 - r14
            int r0 = java.lang.Math.min(r13, r0)
            int r0 = java.lang.Math.max(r1, r0)
            r32 = r12[r1]
            int r1 = (r32 > r5 ? 1 : (r32 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0593
            r1 = r12[r2]
            int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r13 >= 0) goto L_0x0593
            r0 = r12[r0]
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0593
            int r0 = (r3 > r29 ? 1 : (r3 == r29 ? 0 : -1))
            if (r0 > 0) goto L_0x0593
            r0 = 1
            goto L_0x0594
        L_0x0593:
            r0 = 0
        L_0x0594:
            if (r0 == 0) goto L_0x0602
            long r39 = r29 - r3
            r0 = 0
            r1 = r12[r0]
            long r41 = r5 - r1
            com.yandex.mobile.ads.exo.Format r0 = r7.f34838f
            int r0 = r0.f29544x
            long r0 = (long) r0
            long r2 = r7.f34835c
            r43 = r0
            r45 = r2
            long r0 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r41, (long) r43, (long) r45)
            com.yandex.mobile.ads.exo.Format r2 = r7.f34838f
            int r2 = r2.f29544x
            long r2 = (long) r2
            long r4 = r7.f34835c
            r41 = r2
            r43 = r4
            long r2 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r39, (long) r41, (long) r43)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x05c5
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0602
        L_0x05c5:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0602
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0602
            int r1 = (int) r0
            r0 = r38
            r0.f30475a = r1
            int r1 = (int) r2
            r0.f30476b = r1
            long r1 = r7.f34835c
            r3 = 1000000(0xf4240, double:4.940656E-318)
            com.yandex.mobile.ads.impl.ih1.m37380a((long[]) r12, (long) r3, (long) r1)
            long[] r1 = r7.f34840h
            r2 = 0
            r38 = r1[r2]
            long r1 = r7.f34836d
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r42 = r1
            long r34 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r38, (long) r40, (long) r42)
            com.yandex.mobile.ads.exo.extractor.mp4.j r6 = new com.yandex.mobile.ads.exo.extractor.mp4.j
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r10
            r32 = r12
            r33 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0651
        L_0x0602:
            r0 = r38
            goto L_0x0608
        L_0x0605:
            r0 = r38
            r14 = 4
        L_0x0608:
            long[] r1 = r7.f34840h
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L_0x0655
            r2 = 0
            r3 = r1[r2]
            r5 = 0
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x0655
            long[] r1 = r7.f34841i
            r3 = r1[r2]
            r1 = 0
        L_0x061c:
            int r2 = r12.length
            if (r1 >= r2) goto L_0x0633
            r5 = r12[r1]
            long r38 = r5 - r3
            long r5 = r7.f34835c
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r42 = r5
            long r5 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r38, (long) r40, (long) r42)
            r12[r1] = r5
            int r1 = r1 + 1
            goto L_0x061c
        L_0x0633:
            long r38 = r29 - r3
            long r1 = r7.f34835c
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r42 = r1
            long r34 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r38, (long) r40, (long) r42)
            com.yandex.mobile.ads.exo.extractor.mp4.j r6 = new com.yandex.mobile.ads.exo.extractor.mp4.j
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r10
            r32 = r12
            r33 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
        L_0x0651:
            r45 = r0
            goto L_0x0262
        L_0x0655:
            int r2 = r7.f34834b
            r3 = 1
            if (r2 != r3) goto L_0x065c
            r2 = 1
            goto L_0x065d
        L_0x065c:
            r2 = 0
        L_0x065d:
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r1 = r1.length
            int[] r1 = new int[r1]
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
        L_0x0667:
            long[] r14 = r7.f34840h
            r38 = r11
            int r11 = r14.length
            if (r4 >= r11) goto L_0x06d4
            long[] r11 = r7.f34841i
            r21 = r10
            r10 = r11[r4]
            r27 = -1
            int r29 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r29 == 0) goto L_0x06c5
            r39 = r14[r4]
            r27 = r15
            long r14 = r7.f34835c
            r28 = r5
            r29 = r6
            long r5 = r7.f34836d
            r41 = r14
            r43 = r5
            long r5 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r39, (long) r41, (long) r43)
            r14 = 1
            int r15 = com.yandex.mobile.ads.impl.ih1.m37388b((long[]) r12, (long) r10, (boolean) r14, (boolean) r14)
            r3[r4] = r15
            long r10 = r10 + r5
            r5 = 0
            int r6 = com.yandex.mobile.ads.impl.ih1.m37368a((long[]) r12, (long) r10, (boolean) r2, (boolean) r5)
            r1[r4] = r6
        L_0x069d:
            r5 = r3[r4]
            r6 = r1[r4]
            if (r5 >= r6) goto L_0x06b1
            r5 = r3[r4]
            r5 = r9[r5]
            r5 = r5 & r14
            if (r5 != 0) goto L_0x06b1
            r5 = r3[r4]
            int r5 = r5 + r14
            r3[r4] = r5
            r14 = 1
            goto L_0x069d
        L_0x06b1:
            r5 = r1[r4]
            r6 = r3[r4]
            int r5 = r5 - r6
            int r5 = r28 + r5
            r6 = r3[r4]
            if (r13 == r6) goto L_0x06be
            r6 = 1
            goto L_0x06bf
        L_0x06be:
            r6 = 0
        L_0x06bf:
            r6 = r29 | r6
            r10 = r1[r4]
            r13 = r10
            goto L_0x06cb
        L_0x06c5:
            r28 = r5
            r29 = r6
            r27 = r15
        L_0x06cb:
            int r4 = r4 + 1
            r10 = r21
            r15 = r27
            r11 = r38
            goto L_0x0667
        L_0x06d4:
            r29 = r6
            r21 = r10
            if (r5 == r15) goto L_0x06dc
            r2 = 1
            goto L_0x06dd
        L_0x06dc:
            r2 = 0
        L_0x06dd:
            r2 = r29 | r2
            if (r2 == 0) goto L_0x06e4
            long[] r4 = new long[r5]
            goto L_0x06e5
        L_0x06e4:
            r4 = r8
        L_0x06e5:
            if (r2 == 0) goto L_0x06ea
            int[] r6 = new int[r5]
            goto L_0x06ec
        L_0x06ea:
            r6 = r21
        L_0x06ec:
            if (r2 == 0) goto L_0x06f0
            r31 = 0
        L_0x06f0:
            if (r2 == 0) goto L_0x06f5
            int[] r10 = new int[r5]
            goto L_0x06f6
        L_0x06f5:
            r10 = r9
        L_0x06f6:
            long[] r5 = new long[r5]
            r45 = r0
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x06fe:
            long[] r0 = r7.f34840h
            int r0 = r0.length
            if (r11 >= r0) goto L_0x0793
            long[] r0 = r7.f34841i
            r27 = r0[r11]
            r0 = r3[r11]
            r29 = r3
            r3 = r1[r11]
            r30 = r1
            if (r2 == 0) goto L_0x0721
            int r1 = r3 - r0
            java.lang.System.arraycopy(r8, r0, r4, r15, r1)
            r32 = r8
            r8 = r21
            java.lang.System.arraycopy(r8, r0, r6, r15, r1)
            java.lang.System.arraycopy(r9, r0, r10, r15, r1)
            goto L_0x0725
        L_0x0721:
            r32 = r8
            r8 = r21
        L_0x0725:
            r1 = r31
        L_0x0727:
            if (r0 >= r3) goto L_0x0773
            r21 = r9
            r33 = r10
            long r9 = r7.f34836d
            r41 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r13
            r43 = r9
            long r9 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r39, (long) r41, (long) r43)
            r34 = r12[r0]
            r39 = r3
            r46 = r4
            long r3 = r34 - r27
            r34 = r12
            r40 = r13
            r12 = 0
            long r47 = java.lang.Math.max(r12, r3)
            long r3 = r7.f34835c
            r49 = 1000000(0xf4240, double:4.940656E-318)
            r51 = r3
            long r3 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r47, (long) r49, (long) r51)
            long r9 = r9 + r3
            r5[r15] = r9
            if (r2 == 0) goto L_0x0762
            r3 = r6[r15]
            if (r3 <= r1) goto L_0x0762
            r1 = r8[r0]
        L_0x0762:
            int r15 = r15 + 1
            int r0 = r0 + 1
            r9 = r21
            r10 = r33
            r12 = r34
            r3 = r39
            r13 = r40
            r4 = r46
            goto L_0x0727
        L_0x0773:
            r46 = r4
            r21 = r9
            r33 = r10
            r34 = r12
            r40 = r13
            long[] r0 = r7.f34840h
            r3 = r0[r11]
            long r13 = r40 + r3
            int r11 = r11 + 1
            r31 = r1
            r3 = r29
            r1 = r30
            r4 = r46
            r21 = r8
            r8 = r32
            goto L_0x06fe
        L_0x0793:
            r46 = r4
            r33 = r10
            r40 = r13
            long r0 = r7.f34836d
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r40
            r41 = r2
            r43 = r0
            long r34 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r39, (long) r41, (long) r43)
            com.yandex.mobile.ads.exo.extractor.mp4.j r0 = new com.yandex.mobile.ads.exo.extractor.mp4.j
            r27 = r0
            r28 = r7
            r29 = r46
            r30 = r6
            r32 = r5
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r6 = r0
        L_0x07b8:
            int r0 = r6.f29724b
            if (r0 != 0) goto L_0x07bf
            r0 = r37
            goto L_0x07c4
        L_0x07bf:
            r0 = r37
            r0.add(r6)
        L_0x07c4:
            int r8 = r20 + 1
            r7 = r0
            r1 = r24
            r3 = r25
            r2 = r26
            r5 = r36
            r11 = r38
            r4 = r45
            r6 = 0
            r0 = r54
            goto L_0x01b5
        L_0x07d8:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        L_0x07e0:
            r26 = r2
            r25 = r3
            r45 = r4
            r36 = r5
            r0 = r7
            int r1 = r0.size()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r2
            r4 = 0
            r7 = -1
        L_0x07f5:
            if (r4 >= r1) goto L_0x08ea
            java.lang.Object r8 = r0.get(r4)
            com.yandex.mobile.ads.exo.extractor.mp4.j r8 = (com.yandex.mobile.ads.exo.extractor.mp4.C12213j) r8
            com.yandex.mobile.ads.impl.ie1 r9 = r8.f29723a
            long r10 = r9.f34837e
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x0806
            goto L_0x0808
        L_0x0806:
            long r10 = r8.f29730h
        L_0x0808:
            long r5 = java.lang.Math.max(r5, r10)
            com.yandex.mobile.ads.exo.extractor.mp4.f$a r12 = new com.yandex.mobile.ads.exo.extractor.mp4.f$a
            r13 = r54
            com.yandex.mobile.ads.impl.x50 r14 = r13.f29693o
            int r15 = r9.f34834b
            com.yandex.mobile.ads.impl.ke1 r14 = r14.mo65304a(r4, r15)
            r12.<init>(r9, r8, r14)
            int r14 = r8.f29727e
            int r14 = r14 + 30
            com.yandex.mobile.ads.exo.Format r15 = r9.f34838f
            com.yandex.mobile.ads.exo.Format r14 = r15.mo64773b(r14)
            int r15 = r9.f34834b
            r2 = 2
            if (r15 != r2) goto L_0x0841
            r2 = 0
            int r15 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0843
            int r8 = r8.f29724b
            r15 = 1
            if (r8 <= r15) goto L_0x0843
            float r8 = (float) r8
            float r10 = (float) r10
            r11 = 1232348160(0x49742400, float:1000000.0)
            float r10 = r10 / r11
            float r8 = r8 / r10
            com.yandex.mobile.ads.exo.Format r14 = r14.mo64766a((float) r8)
            goto L_0x0843
        L_0x0841:
            r2 = 0
        L_0x0843:
            int r8 = r9.f34834b
            r10 = 1
            if (r8 != r10) goto L_0x086c
            r10 = r45
            int r8 = r10.f30475a
            r11 = -1
            if (r8 == r11) goto L_0x0855
            int r15 = r10.f30476b
            if (r15 == r11) goto L_0x0855
            r11 = 1
            goto L_0x0856
        L_0x0855:
            r11 = 0
        L_0x0856:
            if (r11 == 0) goto L_0x085e
            int r11 = r10.f30476b
            com.yandex.mobile.ads.exo.Format r14 = r14.mo64768a((int) r8, (int) r11)
        L_0x085e:
            if (r36 == 0) goto L_0x0869
            com.yandex.mobile.ads.exo.drm.DrmInitData r8 = r14.f29533m
            r11 = r36
            com.yandex.mobile.ads.exo.Format r14 = r14.mo64770a((com.yandex.mobile.ads.exo.drm.DrmInitData) r8, (com.yandex.mobile.ads.exo.metadata.Metadata) r11)
            goto L_0x08b7
        L_0x0869:
            r11 = r36
            goto L_0x08b7
        L_0x086c:
            r11 = r36
            r10 = r45
            r15 = 2
            if (r8 != r15) goto L_0x08b7
            if (r26 == 0) goto L_0x08b7
            r8 = 0
        L_0x0876:
            int r15 = r26.mo64997c()
            if (r8 >= r15) goto L_0x08b7
            r15 = r26
            com.yandex.mobile.ads.exo.metadata.Metadata$Entry r2 = r15.mo64994a((int) r8)
            boolean r3 = r2 instanceof com.yandex.mobile.ads.exo.extractor.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L_0x08a8
            com.yandex.mobile.ads.exo.extractor.mp4.MdtaMetadataEntry r2 = (com.yandex.mobile.ads.exo.extractor.mp4.MdtaMetadataEntry) r2
            java.lang.String r3 = r2.f29596b
            r37 = r0
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x08aa
            com.yandex.mobile.ads.exo.metadata.Metadata r0 = new com.yandex.mobile.ads.exo.metadata.Metadata
            r16 = r1
            r3 = 1
            com.yandex.mobile.ads.exo.metadata.Metadata$Entry[] r1 = new com.yandex.mobile.ads.exo.metadata.Metadata.Entry[r3]
            r3 = 0
            r1[r3] = r2
            r0.<init>((com.yandex.mobile.ads.exo.metadata.Metadata.Entry[]) r1)
            com.yandex.mobile.ads.exo.drm.DrmInitData r1 = r14.f29533m
            com.yandex.mobile.ads.exo.Format r14 = r14.mo64770a((com.yandex.mobile.ads.exo.drm.DrmInitData) r1, (com.yandex.mobile.ads.exo.metadata.Metadata) r0)
            goto L_0x08ac
        L_0x08a8:
            r37 = r0
        L_0x08aa:
            r16 = r1
        L_0x08ac:
            int r8 = r8 + 1
            r26 = r15
            r1 = r16
            r0 = r37
            r2 = 0
            goto L_0x0876
        L_0x08b7:
            r37 = r0
            r16 = r1
            r15 = r26
            com.yandex.mobile.ads.impl.ke1 r0 = r12.f29701c
            r0.mo65339a(r14)
            int r0 = r9.f34834b
            r1 = 2
            if (r0 != r1) goto L_0x08cf
            r0 = -1
            if (r7 != r0) goto L_0x08d0
            int r7 = r25.size()
            goto L_0x08d0
        L_0x08cf:
            r0 = -1
        L_0x08d0:
            r1 = r25
            r1.add(r12)
            int r4 = r4 + 1
            r25 = r1
            r45 = r10
            r36 = r11
            r26 = r15
            r1 = r16
            r0 = r37
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x07f5
        L_0x08ea:
            r0 = -1
            r13 = r54
            r1 = r25
            r13.f29696r = r7
            r13.f29697s = r5
            r2 = 0
            com.yandex.mobile.ads.exo.extractor.mp4.f$a[] r3 = new com.yandex.mobile.ads.exo.extractor.mp4.C12208f.C12209a[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            com.yandex.mobile.ads.exo.extractor.mp4.f$a[] r1 = (com.yandex.mobile.ads.exo.extractor.mp4.C12208f.C12209a[]) r1
            r13.f29694p = r1
            int r2 = r1.length
            long[][] r2 = new long[r2][]
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            long[] r4 = new long[r4]
            int r5 = r1.length
            boolean[] r5 = new boolean[r5]
            r15 = 0
        L_0x090b:
            int r6 = r1.length
            if (r15 >= r6) goto L_0x0926
            r6 = r1[r15]
            com.yandex.mobile.ads.exo.extractor.mp4.j r6 = r6.f29700b
            int r6 = r6.f29724b
            long[] r6 = new long[r6]
            r2[r15] = r6
            r6 = r1[r15]
            com.yandex.mobile.ads.exo.extractor.mp4.j r6 = r6.f29700b
            long[] r6 = r6.f29728f
            r7 = 0
            r8 = r6[r7]
            r4[r15] = r8
            int r15 = r15 + 1
            goto L_0x090b
        L_0x0926:
            r7 = 0
            r15 = 0
            r22 = 0
        L_0x092a:
            int r6 = r1.length
            if (r15 >= r6) goto L_0x0971
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
            r11 = -1
        L_0x0934:
            int r10 = r1.length
            if (r6 >= r10) goto L_0x0947
            boolean r10 = r5[r6]
            if (r10 != 0) goto L_0x0944
            r18 = r4[r6]
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0944
            r8 = r4[r6]
            r11 = r6
        L_0x0944:
            int r6 = r6 + 1
            goto L_0x0934
        L_0x0947:
            r6 = r3[r11]
            r8 = r2[r11]
            r8[r6] = r22
            r8 = r1[r11]
            com.yandex.mobile.ads.exo.extractor.mp4.j r8 = r8.f29700b
            int[] r8 = r8.f29726d
            r8 = r8[r6]
            long r8 = (long) r8
            long r22 = r22 + r8
            r8 = 1
            int r6 = r6 + r8
            r3[r11] = r6
            r9 = r2[r11]
            int r9 = r9.length
            if (r6 >= r9) goto L_0x096c
            r9 = r1[r11]
            com.yandex.mobile.ads.exo.extractor.mp4.j r9 = r9.f29700b
            long[] r9 = r9.f29728f
            r17 = r9[r6]
            r4[r11] = r17
            goto L_0x092a
        L_0x096c:
            r5[r11] = r8
            int r15 = r15 + 1
            goto L_0x092a
        L_0x0971:
            r13.f29695q = r2
            com.yandex.mobile.ads.impl.x50 r0 = r13.f29693o
            r0.mo65311c()
            com.yandex.mobile.ads.impl.x50 r0 = r13.f29693o
            r0.mo65309a(r13)
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r13.f29683e
            r0.clear()
            r0 = 2
            r13.f29684f = r0
            goto L_0x09a0
        L_0x0986:
            r13 = r0
            r24 = r1
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r13.f29683e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x09a0
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r13.f29683e
            java.lang.Object r0 = r0.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r0 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r0
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r0.f29603d
            r1 = r24
            r0.add(r1)
        L_0x09a0:
            r0 = r13
            goto L_0x0002
        L_0x09a3:
            r13 = r0
            int r0 = r13.f29684f
            r1 = 2
            if (r0 == r1) goto L_0x09ac
            r54.m31847d()
        L_0x09ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12208f.m31846c(long):void");
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f29693o = x50;
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f29683e.clear();
        this.f29687i = 0;
        this.f29689k = -1;
        this.f29690l = 0;
        this.f29691m = 0;
        this.f29692n = 0;
        if (j == 0) {
            m31847d();
            return;
        }
        C12209a[] aVarArr = this.f29694p;
        if (aVarArr != null) {
            for (C12209a aVar : aVarArr) {
                C12213j jVar = aVar.f29700b;
                int a = jVar.mo64901a(j2);
                if (a == -1) {
                    a = jVar.mo64902b(j2);
                }
                aVar.f29702d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x0224 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0221  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64888a(com.yandex.mobile.ads.impl.C13416ik r31, com.yandex.mobile.ads.impl.r01 r32) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
        L_0x0006:
            int r3 = r0.f29684f
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0226
            r12 = 262144(0x40000, double:1.295163E-318)
            r14 = 2
            if (r3 == r10) goto L_0x01a0
            if (r3 != r14) goto L_0x019a
            long r3 = r31.mo67811c()
            int r9 = r0.f29689k
            if (r9 != r8) goto L_0x0098
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r15
            r20 = r17
            r24 = r20
            r7 = 1
            r9 = 0
            r19 = 1
            r22 = -1
            r23 = -1
        L_0x0036:
            com.yandex.mobile.ads.exo.extractor.mp4.f$a[] r14 = r0.f29694p
            int r11 = r14.length
            if (r9 >= r11) goto L_0x007d
            r11 = r14[r9]
            int r14 = r11.f29702d
            com.yandex.mobile.ads.exo.extractor.mp4.j r11 = r11.f29700b
            int r10 = r11.f29724b
            if (r14 != r10) goto L_0x0046
            goto L_0x0079
        L_0x0046:
            long[] r10 = r11.f29725c
            r26 = r10[r14]
            long[][] r10 = r0.f29695q
            r10 = r10[r9]
            r28 = r10[r14]
            long r26 = r26 - r3
            int r10 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x005d
            int r10 = (r26 > r12 ? 1 : (r26 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r10 = 0
            goto L_0x005e
        L_0x005d:
            r10 = 1
        L_0x005e:
            if (r10 != 0) goto L_0x0062
            if (r7 != 0) goto L_0x0068
        L_0x0062:
            if (r10 != r7) goto L_0x006f
            int r11 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r11 >= 0) goto L_0x006f
        L_0x0068:
            r23 = r9
            r7 = r10
            r24 = r26
            r20 = r28
        L_0x006f:
            int r11 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r11 >= 0) goto L_0x0079
            r22 = r9
            r19 = r10
            r17 = r28
        L_0x0079:
            int r9 = r9 + 1
            r10 = 1
            goto L_0x0036
        L_0x007d:
            int r7 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0090
            if (r19 == 0) goto L_0x0090
            r9 = 10485760(0xa00000, double:5.180654E-317)
            long r17 = r17 + r9
            int r7 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            r7 = r22
            goto L_0x0092
        L_0x0090:
            r7 = r23
        L_0x0092:
            r0.f29689k = r7
            if (r7 != r8) goto L_0x0098
            goto L_0x0199
        L_0x0098:
            com.yandex.mobile.ads.exo.extractor.mp4.f$a[] r7 = r0.f29694p
            int r9 = r0.f29689k
            r7 = r7[r9]
            com.yandex.mobile.ads.impl.ke1 r14 = r7.f29701c
            int r9 = r7.f29702d
            com.yandex.mobile.ads.exo.extractor.mp4.j r10 = r7.f29700b
            long[] r11 = r10.f29725c
            r12 = r11[r9]
            int[] r10 = r10.f29726d
            r10 = r10[r9]
            long r3 = r12 - r3
            int r11 = r0.f29690l
            r17 = r9
            long r8 = (long) r11
            long r3 = r3 + r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0196
            r5 = 262144(0x40000, double:1.295163E-318)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x00c1
            goto L_0x0196
        L_0x00c1:
            com.yandex.mobile.ads.impl.ie1 r2 = r7.f29699a
            int r2 = r2.f34839g
            r5 = 1
            if (r2 != r5) goto L_0x00cd
            r5 = 8
            long r3 = r3 + r5
            int r10 = r10 + -8
        L_0x00cd:
            int r2 = (int) r3
            r1.mo67813d(r2)
            com.yandex.mobile.ads.impl.ie1 r2 = r7.f29699a
            int r3 = r2.f34842j
            if (r3 == 0) goto L_0x0134
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29680b
            byte[] r2 = r2.f33778a
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r5 = 2
            r2[r5] = r4
            int r5 = 4 - r3
        L_0x00e6:
            int r6 = r0.f29691m
            if (r6 >= r10) goto L_0x0171
            int r6 = r0.f29692n
            if (r6 != 0) goto L_0x011f
            r1.mo67809b(r2, r5, r3, r4)
            int r6 = r0.f29690l
            int r6 = r6 + r3
            r0.f29690l = r6
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29680b
            r6.mo67112e(r4)
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29680b
            int r6 = r6.mo67113f()
            if (r6 < 0) goto L_0x0117
            r0.f29692n = r6
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29679a
            r6.mo67112e(r4)
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f29679a
            r6 = 4
            r14.mo65341a(r4, r6)
            int r4 = r0.f29691m
            int r4 = r4 + r6
            r0.f29691m = r4
            int r10 = r10 + r5
            goto L_0x0132
        L_0x0117:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>(r2)
            throw r1
        L_0x011f:
            int r6 = r14.mo65335a(r1, r6, r4)
            int r4 = r0.f29690l
            int r4 = r4 + r6
            r0.f29690l = r4
            int r4 = r0.f29691m
            int r4 = r4 + r6
            r0.f29691m = r4
            int r4 = r0.f29692n
            int r4 = r4 - r6
            r0.f29692n = r4
        L_0x0132:
            r4 = 0
            goto L_0x00e6
        L_0x0134:
            com.yandex.mobile.ads.exo.Format r2 = r2.f34838f
            java.lang.String r2 = r2.f29530j
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0156
            int r2 = r0.f29691m
            if (r2 != 0) goto L_0x0154
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29681c
            com.yandex.mobile.ads.impl.C13266h.m36738a(r10, r2)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29681c
            r3 = 7
            r14.mo65341a(r2, r3)
            int r2 = r0.f29691m
            int r2 = r2 + r3
            r0.f29691m = r2
        L_0x0154:
            int r10 = r10 + 7
        L_0x0156:
            int r2 = r0.f29691m
            if (r2 >= r10) goto L_0x0171
            int r2 = r10 - r2
            r3 = 0
            int r2 = r14.mo65335a(r1, r2, r3)
            int r3 = r0.f29690l
            int r3 = r3 + r2
            r0.f29690l = r3
            int r3 = r0.f29691m
            int r3 = r3 + r2
            r0.f29691m = r3
            int r3 = r0.f29692n
            int r3 = r3 - r2
            r0.f29692n = r3
            goto L_0x0156
        L_0x0171:
            r18 = r10
            com.yandex.mobile.ads.exo.extractor.mp4.j r1 = r7.f29700b
            long[] r2 = r1.f29728f
            r15 = r2[r17]
            int[] r1 = r1.f29729g
            r17 = r1[r17]
            r19 = 0
            r20 = 0
            r14.mo65337a(r15, r17, r18, r19, r20)
            int r1 = r7.f29702d
            r2 = 1
            int r1 = r1 + r2
            r7.f29702d = r1
            r1 = -1
            r0.f29689k = r1
            r1 = 0
            r0.f29690l = r1
            r0.f29691m = r1
            r0.f29692n = r1
            r8 = 0
            goto L_0x0199
        L_0x0196:
            r2.f39340a = r12
            r8 = 1
        L_0x0199:
            return r8
        L_0x019a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x01a0:
            long r5 = r0.f29686h
            int r3 = r0.f29687i
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r31.mo67811c()
            long r7 = r7 + r5
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29688j
            if (r3 == 0) goto L_0x0200
            byte[] r3 = r3.f33778a
            int r10 = r0.f29687i
            int r6 = (int) r5
            r5 = 0
            r1.mo67809b(r3, r10, r6, r5)
            int r3 = r0.f29685g
            if (r3 != r4) goto L_0x01e1
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29688j
            r3.mo67112e(r9)
            int r4 = r3.mo67113f()
            r5 = 1903435808(0x71742020, float:1.2088509E30)
            if (r4 != r5) goto L_0x01cb
            goto L_0x01db
        L_0x01cb:
            r4 = 4
            r3.mo67114f(r4)
        L_0x01cf:
            int r4 = r3.mo67098a()
            if (r4 <= 0) goto L_0x01dd
            int r4 = r3.mo67113f()
            if (r4 != r5) goto L_0x01cf
        L_0x01db:
            r3 = 1
            goto L_0x01de
        L_0x01dd:
            r3 = 0
        L_0x01de:
            r0.f29698t = r3
            goto L_0x020b
        L_0x01e1:
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r3 = r0.f29683e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x020b
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r3 = r0.f29683e
            java.lang.Object r3 = r3.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r3 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r3
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r4 = new com.yandex.mobile.ads.exo.extractor.mp4.a$b
            int r5 = r0.f29685g
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29688j
            r4.<init>(r5, r6)
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r3 = r3.f29602c
            r3.add(r4)
            goto L_0x020b
        L_0x0200:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x020d
            int r3 = (int) r5
            r1.mo67813d(r3)
        L_0x020b:
            r3 = 0
            goto L_0x0215
        L_0x020d:
            long r3 = r31.mo67811c()
            long r3 = r3 + r5
            r2.f39340a = r3
            r3 = 1
        L_0x0215:
            r0.m31846c(r7)
            if (r3 == 0) goto L_0x0221
            int r3 = r0.f29684f
            r4 = 2
            if (r3 == r4) goto L_0x0221
            r11 = 1
            goto L_0x0222
        L_0x0221:
            r11 = 0
        L_0x0222:
            if (r11 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0226:
            r3 = 1
            int r7 = r0.f29687i
            if (r7 != 0) goto L_0x0250
            com.yandex.mobile.ads.impl.fy0 r7 = r0.f29682d
            byte[] r7 = r7.f33778a
            r8 = 0
            boolean r7 = r1.mo67809b(r7, r8, r9, r3)
            if (r7 != 0) goto L_0x0239
            r10 = 0
            goto L_0x03b8
        L_0x0239:
            r0.f29687i = r9
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29682d
            r3.mo67112e(r8)
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29682d
            long r7 = r3.mo67128t()
            r0.f29686h = r7
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29682d
            int r3 = r3.mo67113f()
            r0.f29685g = r3
        L_0x0250:
            long r7 = r0.f29686h
            r10 = 1
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x026e
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29682d
            byte[] r3 = r3.f33778a
            r5 = 0
            r1.mo67809b(r3, r9, r9, r5)
            int r3 = r0.f29687i
            int r3 = r3 + r9
            r0.f29687i = r3
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29682d
            long r5 = r3.mo67131w()
            r0.f29686h = r5
            goto L_0x029d
        L_0x026e:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x029d
            long r5 = r31.mo67804a()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x028e
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r3 = r0.f29683e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x028e
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r3 = r0.f29683e
            java.lang.Object r3 = r3.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r3 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r3
            long r5 = r3.f29601b
        L_0x028e:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x029d
            long r7 = r31.mo67811c()
            long r5 = r5 - r7
            int r3 = r0.f29687i
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.f29686h = r5
        L_0x029d:
            long r5 = r0.f29686h
            int r3 = r0.f29687i
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x03bc
            int r5 = r0.f29685g
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x02ce
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x02ce
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x02ce
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x02ce
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x02ce
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x02ce
            if (r5 != r7) goto L_0x02cc
            goto L_0x02ce
        L_0x02cc:
            r6 = 0
            goto L_0x02cf
        L_0x02ce:
            r6 = 1
        L_0x02cf:
            r8 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == 0) goto L_0x0328
            long r3 = r31.mo67811c()
            long r5 = r0.f29686h
            long r3 = r3 + r5
            int r10 = r0.f29687i
            long r10 = (long) r10
            long r3 = r3 - r10
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0309
            int r5 = r0.f29685g
            if (r5 != r7) goto L_0x0309
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f29681c
            r5.mo67108c(r9)
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f29681c
            byte[] r5 = r5.f33778a
            r6 = 0
            r1.mo67806a(r5, r6, r9, r6)
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f29681c
            r6 = 4
            r5.mo67114f(r6)
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f29681c
            int r5 = r5.mo67113f()
            if (r5 != r8) goto L_0x0306
            r31.mo67812d()
            goto L_0x0309
        L_0x0306:
            r1.mo67813d(r6)
        L_0x0309:
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r5 = r0.f29683e
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r6 = new com.yandex.mobile.ads.exo.extractor.mp4.a$a
            int r7 = r0.f29685g
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f29686h
            int r7 = r0.f29687i
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0322
            r0.m31846c(r3)
            goto L_0x0325
        L_0x0322:
            r30.m31847d()
        L_0x0325:
            r3 = 1
            goto L_0x03b7
        L_0x0328:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x037f
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x037f
            if (r5 == r8) goto L_0x037f
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x037f
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x037f
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x037f
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x037f
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x037f
            if (r5 == r4) goto L_0x037f
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x037f
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x037f
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x037d
            goto L_0x037f
        L_0x037d:
            r5 = 0
            goto L_0x0380
        L_0x037f:
            r5 = 1
        L_0x0380:
            if (r5 == 0) goto L_0x03b1
            if (r3 != r9) goto L_0x0386
            r5 = 1
            goto L_0x0387
        L_0x0386:
            r5 = 0
        L_0x0387:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r5)
            long r3 = r0.f29686h
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0395
            r5 = 1
            goto L_0x0396
        L_0x0395:
            r5 = 0
        L_0x0396:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r5)
            com.yandex.mobile.ads.impl.fy0 r3 = new com.yandex.mobile.ads.impl.fy0
            long r4 = r0.f29686h
            int r5 = (int) r4
            r3.<init>((int) r5)
            r0.f29688j = r3
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f29682d
            byte[] r4 = r4.f33778a
            byte[] r3 = r3.f33778a
            r5 = 0
            java.lang.System.arraycopy(r4, r5, r3, r5, r9)
            r3 = 1
            r0.f29684f = r3
            goto L_0x03b7
        L_0x03b1:
            r3 = 1
            r4 = 0
            r0.f29688j = r4
            r0.f29684f = r3
        L_0x03b7:
            r10 = 1
        L_0x03b8:
            if (r10 != 0) goto L_0x0006
            r3 = -1
            return r3
        L_0x03bc:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12208f.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }

    /* renamed from: a */
    private static long m31845a(C12213j jVar, long j, long j2) {
        int a = jVar.mo64901a(j);
        if (a == -1) {
            a = jVar.mo64902b(j);
        }
        if (a == -1) {
            return j2;
        }
        return Math.min(jVar.f29725c[a], j2);
    }
}
