package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.C12248a;
import java.io.EOFException;
import java.io.IOException;

public final class po0 implements w50 {

    /* renamed from: q */
    private static final C12248a.C12249a f38754q = $$Lambda$po0$sFj3oDsbrP8Tyn9rYXKvtiJKCBQ.INSTANCE;

    /* renamed from: a */
    private final int f38755a;

    /* renamed from: b */
    private final long f38756b;

    /* renamed from: c */
    private final fy0 f38757c;

    /* renamed from: d */
    private final so0 f38758d;

    /* renamed from: e */
    private final a90 f38759e;

    /* renamed from: f */
    private final nc0 f38760f;

    /* renamed from: g */
    private x50 f38761g;

    /* renamed from: h */
    private ke1 f38762h;

    /* renamed from: i */
    private int f38763i;

    /* renamed from: j */
    private Metadata f38764j;

    /* renamed from: k */
    private v71 f38765k;

    /* renamed from: l */
    private boolean f38766l;

    /* renamed from: m */
    private long f38767m;

    /* renamed from: n */
    private long f38768n;

    /* renamed from: o */
    private long f38769o;

    /* renamed from: p */
    private int f38770p;

    static {
        $$Lambda$po0$o73w4wQnG9s4hC1E5L7OxTZMHdo r0 = $$Lambda$po0$o73w4wQnG9s4hC1E5L7OxTZMHdo.INSTANCE;
    }

    public po0() {
        this(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m40878a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: a */
    private static boolean m40879a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static w50[] m40882b() {
        return new w50[]{new po0(0)};
    }

    /* renamed from: c */
    private boolean m40883c(C13416ik ikVar) throws IOException, InterruptedException {
        v71 v71 = this.f38765k;
        if (v71 != null) {
            long b = v71.mo66337b();
            if (b != -1 && ikVar.mo67808b() > b - 4) {
                return true;
            }
        }
        try {
            return !ikVar.mo67806a(this.f38757c.f33778a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        return m40880a(ikVar, true);
    }

    public void release() {
    }

    public po0(int i) {
        this(i, -9223372036854775807L);
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f38761g = x50;
        this.f38762h = x50.mo65304a(0, 1);
        this.f38761g.mo65311c();
    }

    public po0(int i, long j) {
        this.f38755a = i;
        this.f38756b = j;
        this.f38757c = new fy0(10);
        this.f38758d = new so0();
        this.f38759e = new a90();
        this.f38767m = -9223372036854775807L;
        this.f38760f = new nc0();
    }

    /* renamed from: b */
    private v71 m40881b(C13416ik ikVar) throws IOException, InterruptedException {
        ikVar.mo67806a(this.f38757c.f33778a, 0, 4, false);
        this.f38757c.mo67112e(0);
        so0.m42103a(this.f38757c.mo67113f(), this.f38758d);
        return new C14099nh(ikVar.mo67804a(), ikVar.mo67811c(), this.f38758d);
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f38763i = 0;
        this.f38767m = -9223372036854775807L;
        this.f38768n = 0;
        this.f38770p = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64888a(com.yandex.mobile.ads.impl.C13416ik r33, com.yandex.mobile.ads.impl.r01 r34) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            int r2 = r0.f38763i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m40880a((com.yandex.mobile.ads.impl.C13416ik) r1, (boolean) r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.yandex.mobile.ads.impl.v71 r2 = r0.f38765k
            r5 = 0
            r7 = 1
            if (r2 != 0) goto L_0x0197
            com.yandex.mobile.ads.impl.fy0 r13 = new com.yandex.mobile.ads.impl.fy0
            com.yandex.mobile.ads.impl.so0 r2 = r0.f38758d
            int r2 = r2.f40094c
            r13.<init>((int) r2)
            byte[] r2 = r13.f33778a
            com.yandex.mobile.ads.impl.so0 r8 = r0.f38758d
            int r8 = r8.f40094c
            r1.mo67806a(r2, r4, r8, r4)
            com.yandex.mobile.ads.impl.so0 r2 = r0.f38758d
            int r8 = r2.f40092a
            r8 = r8 & r7
            r9 = 36
            if (r8 == 0) goto L_0x0038
            int r2 = r2.f40096e
            if (r2 == r7) goto L_0x003c
            r2 = 36
            goto L_0x0041
        L_0x0038:
            int r2 = r2.f40096e
            if (r2 == r7) goto L_0x003f
        L_0x003c:
            r2 = 21
            goto L_0x0041
        L_0x003f:
            r2 = 13
        L_0x0041:
            int r8 = r13.mo67107c()
            int r10 = r2 + 4
            r11 = 1483304551(0x58696e67, float:1.02664153E15)
            r14 = 1231971951(0x496e666f, float:976486.94)
            r12 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 < r10) goto L_0x005f
            r13.mo67112e(r2)
            int r8 = r13.mo67113f()
            if (r8 == r11) goto L_0x005d
            if (r8 != r14) goto L_0x005f
        L_0x005d:
            r15 = r8
            goto L_0x0075
        L_0x005f:
            int r8 = r13.mo67107c()
            r10 = 40
            if (r8 < r10) goto L_0x0074
            r13.mo67112e(r9)
            int r8 = r13.mo67113f()
            if (r8 != r12) goto L_0x0074
            r15 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0075
        L_0x0074:
            r15 = 0
        L_0x0075:
            r16 = 0
            if (r15 == r11) goto L_0x009a
            if (r15 != r14) goto L_0x007c
            goto L_0x009a
        L_0x007c:
            if (r15 != r12) goto L_0x0094
            long r8 = r33.mo67804a()
            long r10 = r33.mo67811c()
            com.yandex.mobile.ads.impl.so0 r12 = r0.f38758d
            com.yandex.mobile.ads.impl.ui1 r2 = com.yandex.mobile.ads.impl.ui1.m42693a(r8, r10, r12, r13)
            com.yandex.mobile.ads.impl.so0 r8 = r0.f38758d
            int r8 = r8.f40094c
            r1.mo67813d(r8)
            goto L_0x00fc
        L_0x0094:
            r33.mo67812d()
            r2 = r16
            goto L_0x00fc
        L_0x009a:
            long r8 = r33.mo67804a()
            long r10 = r33.mo67811c()
            com.yandex.mobile.ads.impl.so0 r12 = r0.f38758d
            com.yandex.mobile.ads.impl.er1 r8 = com.yandex.mobile.ads.impl.er1.m35723a(r8, r10, r12, r13)
            if (r8 == 0) goto L_0x00e5
            com.yandex.mobile.ads.impl.a90 r9 = r0.f38759e
            int r10 = r9.f30475a
            if (r10 == r3) goto L_0x00b6
            int r9 = r9.f30476b
            if (r9 == r3) goto L_0x00b6
            r9 = 1
            goto L_0x00b7
        L_0x00b6:
            r9 = 0
        L_0x00b7:
            if (r9 != 0) goto L_0x00e5
            r33.mo67812d()
            int r2 = r2 + 141
            r1.mo67805a(r2, r4)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f38757c
            byte[] r2 = r2.f33778a
            r9 = 3
            r1.mo67806a(r2, r4, r9, r4)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f38757c
            r2.mo67112e(r4)
            com.yandex.mobile.ads.impl.a90 r2 = r0.f38759e
            com.yandex.mobile.ads.impl.fy0 r9 = r0.f38757c
            int r9 = r9.mo67129u()
            r2.getClass()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00e1
            if (r9 <= 0) goto L_0x00e5
        L_0x00e1:
            r2.f30475a = r10
            r2.f30476b = r9
        L_0x00e5:
            com.yandex.mobile.ads.impl.so0 r2 = r0.f38758d
            int r2 = r2.f40094c
            r1.mo67813d(r2)
            if (r8 == 0) goto L_0x00fb
            boolean r2 = r8.mo64897a()
            if (r2 != 0) goto L_0x00fb
            if (r15 != r14) goto L_0x00fb
            com.yandex.mobile.ads.impl.v71 r2 = r32.m40881b(r33)
            goto L_0x00fc
        L_0x00fb:
            r2 = r8
        L_0x00fc:
            com.yandex.mobile.ads.exo.metadata.Metadata r8 = r0.f38764j
            long r9 = r33.mo67811c()
            if (r8 == 0) goto L_0x011d
            int r11 = r8.mo64997c()
            r12 = 0
        L_0x0109:
            if (r12 >= r11) goto L_0x011d
            com.yandex.mobile.ads.exo.metadata.Metadata$Entry r13 = r8.mo64994a((int) r12)
            boolean r14 = r13 instanceof com.yandex.mobile.ads.exo.metadata.id3.MlltFrame
            if (r14 == 0) goto L_0x011a
            com.yandex.mobile.ads.exo.metadata.id3.MlltFrame r13 = (com.yandex.mobile.ads.exo.metadata.id3.MlltFrame) r13
            com.yandex.mobile.ads.impl.co0 r8 = com.yandex.mobile.ads.impl.co0.m34781a(r9, r13)
            goto L_0x011f
        L_0x011a:
            int r12 = r12 + 1
            goto L_0x0109
        L_0x011d:
            r8 = r16
        L_0x011f:
            boolean r9 = r0.f38766l
            if (r9 == 0) goto L_0x012b
            com.yandex.mobile.ads.impl.v71$a r2 = new com.yandex.mobile.ads.impl.v71$a
            r2.<init>()
            r0.f38765k = r2
            goto L_0x0149
        L_0x012b:
            if (r8 == 0) goto L_0x0130
            r0.f38765k = r8
            goto L_0x0134
        L_0x0130:
            if (r2 == 0) goto L_0x0134
            r0.f38765k = r2
        L_0x0134:
            com.yandex.mobile.ads.impl.v71 r2 = r0.f38765k
            if (r2 == 0) goto L_0x0143
            boolean r2 = r2.mo64897a()
            if (r2 != 0) goto L_0x0149
            int r2 = r0.f38755a
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0149
        L_0x0143:
            com.yandex.mobile.ads.impl.v71 r2 = r32.m40881b(r33)
            r0.f38765k = r2
        L_0x0149:
            com.yandex.mobile.ads.impl.x50 r2 = r0.f38761g
            com.yandex.mobile.ads.impl.v71 r8 = r0.f38765k
            r2.mo65309a(r8)
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f38762h
            r17 = 0
            com.yandex.mobile.ads.impl.so0 r8 = r0.f38758d
            java.lang.String r9 = r8.f40093b
            r19 = 0
            r20 = -1
            r21 = 4096(0x1000, float:5.74E-42)
            int r10 = r8.f40096e
            int r8 = r8.f40095d
            r24 = -1
            com.yandex.mobile.ads.impl.a90 r11 = r0.f38759e
            int r12 = r11.f30475a
            int r11 = r11.f30476b
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            int r13 = r0.f38755a
            r13 = r13 & 2
            if (r13 == 0) goto L_0x017b
            r31 = r16
            goto L_0x017f
        L_0x017b:
            com.yandex.mobile.ads.exo.metadata.Metadata r13 = r0.f38764j
            r31 = r13
        L_0x017f:
            r18 = r9
            r22 = r10
            r23 = r8
            r25 = r12
            r26 = r11
            com.yandex.mobile.ads.exo.Format r8 = com.yandex.mobile.ads.exo.Format.m31682a((java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (int) r20, (int) r21, (int) r22, (int) r23, (int) r24, (int) r25, (int) r26, (java.util.List<byte[]>) r27, (com.yandex.mobile.ads.exo.drm.DrmInitData) r28, (int) r29, (java.lang.String) r30, (com.yandex.mobile.ads.exo.metadata.Metadata) r31)
            r2.mo65339a(r8)
            long r8 = r33.mo67811c()
            r0.f38769o = r8
            goto L_0x01ac
        L_0x0197:
            long r8 = r0.f38769o
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x01ac
            long r8 = r33.mo67811c()
            long r10 = r0.f38769o
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ac
            long r10 = r10 - r8
            int r2 = (int) r10
            r1.mo67813d(r2)
        L_0x01ac:
            int r2 = r0.f38770p
            if (r2 != 0) goto L_0x0213
            r33.mo67812d()
            boolean r2 = r32.m40883c(r33)
            if (r2 == 0) goto L_0x01bb
            goto L_0x024e
        L_0x01bb:
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f38757c
            r2.mo67112e(r4)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f38757c
            int r2 = r2.mo67113f()
            int r8 = r0.f38763i
            long r8 = (long) r8
            boolean r8 = m40879a((int) r2, (long) r8)
            if (r8 == 0) goto L_0x020d
            int r8 = com.yandex.mobile.ads.impl.so0.m42104b(r2)
            if (r8 != r3) goto L_0x01d6
            goto L_0x020d
        L_0x01d6:
            com.yandex.mobile.ads.impl.so0 r8 = r0.f38758d
            com.yandex.mobile.ads.impl.so0.m42103a((int) r2, (com.yandex.mobile.ads.impl.so0) r8)
            long r8 = r0.f38767m
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0206
            com.yandex.mobile.ads.impl.v71 r2 = r0.f38765k
            long r8 = r33.mo67811c()
            long r8 = r2.mo66336a(r8)
            r0.f38767m = r8
            long r8 = r0.f38756b
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0206
            com.yandex.mobile.ads.impl.v71 r2 = r0.f38765k
            long r5 = r2.mo66336a(r5)
            long r8 = r0.f38767m
            long r10 = r0.f38756b
            long r10 = r10 - r5
            long r8 = r8 + r10
            r0.f38767m = r8
        L_0x0206:
            com.yandex.mobile.ads.impl.so0 r2 = r0.f38758d
            int r2 = r2.f40094c
            r0.f38770p = r2
            goto L_0x0213
        L_0x020d:
            r1.mo67813d(r7)
            r0.f38763i = r4
            goto L_0x024d
        L_0x0213:
            com.yandex.mobile.ads.impl.ke1 r2 = r0.f38762h
            int r5 = r0.f38770p
            int r1 = r2.mo65335a(r1, r5, r7)
            if (r1 != r3) goto L_0x021e
            goto L_0x024e
        L_0x021e:
            int r2 = r0.f38770p
            int r2 = r2 - r1
            r0.f38770p = r2
            if (r2 <= 0) goto L_0x0226
            goto L_0x024d
        L_0x0226:
            long r1 = r0.f38767m
            long r5 = r0.f38768n
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r7
            com.yandex.mobile.ads.impl.so0 r3 = r0.f38758d
            int r7 = r3.f40095d
            long r7 = (long) r7
            long r5 = r5 / r7
            long r8 = r1 + r5
            com.yandex.mobile.ads.impl.ke1 r7 = r0.f38762h
            int r11 = r3.f40094c
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo65337a(r8, r10, r11, r12, r13)
            long r1 = r0.f38768n
            com.yandex.mobile.ads.impl.so0 r3 = r0.f38758d
            int r3 = r3.f40098g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f38768n = r1
            r0.f38770p = r4
        L_0x024d:
            r3 = 0
        L_0x024e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.po0.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }

    /* renamed from: a */
    public void mo69389a() {
        this.f38766l = true;
    }

    /* renamed from: a */
    private boolean m40880a(C13416ik ikVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int b;
        C12248a.C12249a aVar;
        int i3 = z ? 16384 : 131072;
        ikVar.mo67812d();
        if (ikVar.mo67811c() == 0) {
            if ((this.f38755a & 2) == 0) {
                aVar = null;
            } else {
                aVar = f38754q;
            }
            Metadata a = this.f38760f.mo69023a(ikVar, aVar);
            this.f38764j = a;
            if (a != null) {
                this.f38759e.mo65697a(a);
            }
            i = (int) ikVar.mo67808b();
            if (!z) {
                ikVar.mo67813d(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m40883c(ikVar)) {
                this.f38757c.mo67112e(0);
                int f = this.f38757c.mo67113f();
                if ((i2 == 0 || m40879a(f, (long) i2)) && (b = so0.m42104b(f)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        so0.m42103a(f, this.f38758d);
                        i2 = f;
                    }
                    ikVar.mo67805a(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            ikVar.mo67812d();
                            ikVar.mo67805a(i + i6, false);
                        } else {
                            ikVar.mo67813d(1);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new jy0("Searched too many bytes.");
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ikVar.mo67813d(i + i5);
        } else {
            ikVar.mo67812d();
        }
        this.f38763i = i2;
        return true;
    }
}
