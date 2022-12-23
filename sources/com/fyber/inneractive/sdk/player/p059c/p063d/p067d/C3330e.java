package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import android.util.Pair;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.e */
public final class C3330e implements C3268f {

    /* renamed from: a */
    public static final C3271i f8699a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3330e()};
        }
    };

    /* renamed from: b */
    private static final int f8700b = C3560t.m8893e("seig");

    /* renamed from: c */
    private static final byte[] f8701c = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    private int f8702A;

    /* renamed from: B */
    private int f8703B;

    /* renamed from: C */
    private boolean f8704C;

    /* renamed from: D */
    private C3270h f8705D;

    /* renamed from: E */
    private C3278n f8706E;

    /* renamed from: F */
    private C3278n[] f8707F;

    /* renamed from: G */
    private boolean f8708G;

    /* renamed from: d */
    private final int f8709d;

    /* renamed from: e */
    private final C3339i f8710e;

    /* renamed from: f */
    private final SparseArray<C3333b> f8711f;

    /* renamed from: g */
    private final C3548k f8712g;

    /* renamed from: h */
    private final C3548k f8713h;

    /* renamed from: i */
    private final C3548k f8714i;

    /* renamed from: j */
    private final C3548k f8715j;

    /* renamed from: k */
    private final C3558r f8716k;

    /* renamed from: l */
    private final C3548k f8717l;

    /* renamed from: m */
    private final byte[] f8718m;

    /* renamed from: n */
    private final Stack<C3317a.C3318a> f8719n;

    /* renamed from: o */
    private final LinkedList<C3332a> f8720o;

    /* renamed from: p */
    private int f8721p;

    /* renamed from: q */
    private int f8722q;

    /* renamed from: r */
    private long f8723r;

    /* renamed from: s */
    private int f8724s;

    /* renamed from: t */
    private C3548k f8725t;

    /* renamed from: u */
    private long f8726u;

    /* renamed from: v */
    private int f8727v;

    /* renamed from: w */
    private long f8728w;

    /* renamed from: x */
    private long f8729x;

    /* renamed from: y */
    private C3333b f8730y;

    /* renamed from: z */
    private int f8731z;

    public C3330e() {
        this(0);
    }

    public C3330e(int i) {
        this(i, (byte) 0);
    }

    private C3330e(int i, byte b) {
        this(i, 0);
    }

    private C3330e(int i, char c) {
        this.f8709d = i | 0;
        this.f8716k = null;
        this.f8710e = null;
        this.f8717l = new C3548k(16);
        this.f8712g = new C3548k(C3544i.f9604a);
        this.f8713h = new C3548k(5);
        this.f8714i = new C3548k();
        this.f8715j = new C3548k(1);
        this.f8718m = new byte[16];
        this.f8719n = new Stack<>();
        this.f8720o = new LinkedList<>();
        this.f8711f = new SparseArray<>();
        this.f8728w = -9223372036854775807L;
        this.f8729x = -9223372036854775807L;
        m8233a();
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        return C3338h.m8261a(gVar);
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f8705D = hVar;
        if (this.f8710e != null) {
            C3333b bVar = new C3333b(hVar.mo19056a(0));
            bVar.mo19132a(this.f8710e, new C3327c(0, 0, 0, 0));
            this.f8711f.put(0, bVar);
            m8237b();
            this.f8705D.mo19058b();
        }
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        int size = this.f8711f.size();
        for (int i = 0; i < size; i++) {
            this.f8711f.valueAt(i).mo19131a();
        }
        this.f8720o.clear();
        this.f8727v = 0;
        this.f8719n.clear();
        m8233a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:253:0x0281 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18998a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r27, com.fyber.inneractive.sdk.player.p059c.p063d.C3275l r28) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
        L_0x0004:
            int r2 = r0.f8721p
            r3 = 2
            r5 = 8
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x043d
            r8 = 4
            if (r2 == r6) goto L_0x02de
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x0282
            if (r2 != r11) goto L_0x010a
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            if (r2 != 0) goto L_0x0084
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r2 = r0.f8711f
            int r12 = r2.size()
            r13 = 0
            r14 = 0
        L_0x0026:
            if (r13 >= r12) goto L_0x0049
            java.lang.Object r15 = r2.valueAt(r13)
            com.fyber.inneractive.sdk.player.c.d.d.e$b r15 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3333b) r15
            int r11 = r15.f8740g
            com.fyber.inneractive.sdk.player.c.d.d.k r4 = r15.f8734a
            int r4 = r4.f8811e
            if (r11 == r4) goto L_0x0045
            com.fyber.inneractive.sdk.player.c.d.d.k r4 = r15.f8734a
            long[] r4 = r4.f8813g
            int r11 = r15.f8740g
            r17 = r4[r11]
            int r4 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0045
            r14 = r15
            r9 = r17
        L_0x0045:
            int r13 = r13 + 1
            r11 = 3
            goto L_0x0026
        L_0x0049:
            if (r14 != 0) goto L_0x0067
            long r2 = r0.f8726u
            long r4 = r27.mo19012c()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005f
            r1.mo19009b(r3)
            r26.m8233a()
            r3 = 0
            r6 = 0
            goto L_0x027f
        L_0x005f:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0067:
            com.fyber.inneractive.sdk.player.c.d.d.k r2 = r14.f8734a
            long[] r2 = r2.f8813g
            int r4 = r14.f8740g
            r9 = r2[r4]
            long r11 = r27.mo19012c()
            long r9 = r9 - r11
            int r2 = (int) r9
            if (r2 >= 0) goto L_0x007f
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r4 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r4)
            r2 = 0
        L_0x007f:
            r1.mo19009b(r2)
            r0.f8730y = r14
        L_0x0084:
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.d.k r2 = r2.f8734a
            int[] r2 = r2.f8815i
            com.fyber.inneractive.sdk.player.c.d.d.e$b r4 = r0.f8730y
            int r4 = r4.f8738e
            r2 = r2[r4]
            r0.f8731z = r2
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.d.k r2 = r2.f8734a
            boolean r2 = r2.f8819m
            if (r2 == 0) goto L_0x00f4
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.d.k r4 = r2.f8734a
            com.fyber.inneractive.sdk.player.c.k.k r9 = r4.f8823q
            com.fyber.inneractive.sdk.player.c.d.d.c r10 = r4.f8807a
            int r10 = r10.f8690a
            com.fyber.inneractive.sdk.player.c.d.d.j r11 = r4.f8821o
            if (r11 == 0) goto L_0x00ab
            com.fyber.inneractive.sdk.player.c.d.d.j r10 = r4.f8821o
            goto L_0x00b1
        L_0x00ab:
            com.fyber.inneractive.sdk.player.c.d.d.i r11 = r2.f8736c
            com.fyber.inneractive.sdk.player.c.d.d.j[] r11 = r11.f8800h
            r10 = r11[r10]
        L_0x00b1:
            int r10 = r10.f8805b
            boolean[] r4 = r4.f8820n
            int r11 = r2.f8738e
            boolean r4 = r4[r11]
            com.fyber.inneractive.sdk.player.c.k.k r11 = r0.f8715j
            byte[] r11 = r11.f9625a
            if (r4 == 0) goto L_0x00c2
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x00c3
        L_0x00c2:
            r12 = 0
        L_0x00c3:
            r12 = r12 | r10
            byte r12 = (byte) r12
            r11[r7] = r12
            com.fyber.inneractive.sdk.player.c.k.k r11 = r0.f8715j
            r11.mo19386c(r7)
            com.fyber.inneractive.sdk.player.c.d.n r2 = r2.f8735b
            com.fyber.inneractive.sdk.player.c.k.k r11 = r0.f8715j
            r2.mo19041a(r11, r6)
            r2.mo19041a(r9, r10)
            if (r4 != 0) goto L_0x00db
            int r10 = r10 + 1
            goto L_0x00ec
        L_0x00db:
            int r4 = r9.mo19389e()
            r11 = -2
            r9.mo19388d(r11)
            int r4 = r4 * 6
            int r4 = r4 + r3
            r2.mo19041a(r9, r4)
            int r10 = r10 + 1
            int r10 = r10 + r4
        L_0x00ec:
            r0.f8702A = r10
            int r2 = r0.f8731z
            int r2 = r2 + r10
            r0.f8731z = r2
            goto L_0x00f6
        L_0x00f4:
            r0.f8702A = r7
        L_0x00f6:
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.d.i r2 = r2.f8736c
            int r2 = r2.f8799g
            if (r2 != r6) goto L_0x0106
            int r2 = r0.f8731z
            int r2 = r2 - r5
            r0.f8731z = r2
            r1.mo19009b(r5)
        L_0x0106:
            r0.f8721p = r8
            r0.f8703B = r7
        L_0x010a:
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.d.k r2 = r2.f8734a
            com.fyber.inneractive.sdk.player.c.d.d.e$b r4 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.d.i r4 = r4.f8736c
            com.fyber.inneractive.sdk.player.c.d.d.e$b r5 = r0.f8730y
            com.fyber.inneractive.sdk.player.c.d.n r9 = r5.f8735b
            com.fyber.inneractive.sdk.player.c.d.d.e$b r5 = r0.f8730y
            int r5 = r5.f8738e
            int r10 = r4.f8803k
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r10 == 0) goto L_0x01d9
            com.fyber.inneractive.sdk.player.c.k.k r10 = r0.f8713h
            byte[] r10 = r10.f9625a
            r10[r7] = r7
            r10[r6] = r7
            r10[r3] = r7
            int r3 = r4.f8803k
            int r3 = r3 + r6
            int r13 = r4.f8803k
            int r13 = 4 - r13
        L_0x0131:
            int r14 = r0.f8702A
            int r15 = r0.f8731z
            if (r14 >= r15) goto L_0x01eb
            int r14 = r0.f8703B
            if (r14 != 0) goto L_0x017c
            r1.mo19010b(r10, r13, r3)
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8713h
            r14.mo19386c(r7)
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8713h
            int r14 = r14.mo19400n()
            int r14 = r14 - r6
            r0.f8703B = r14
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8712g
            r14.mo19386c(r7)
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8712g
            r9.mo19041a(r14, r8)
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8713h
            r9.mo19041a(r14, r6)
            com.fyber.inneractive.sdk.player.c.d.n[] r14 = r0.f8707F
            if (r14 == 0) goto L_0x016d
            com.fyber.inneractive.sdk.player.c.h r14 = r4.f8798f
            java.lang.String r14 = r14.f8493f
            byte r15 = r10[r8]
            boolean r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8808a((java.lang.String) r14, (byte) r15)
            if (r14 == 0) goto L_0x016d
            r14 = 1
            goto L_0x016e
        L_0x016d:
            r14 = 0
        L_0x016e:
            r0.f8704C = r14
            int r14 = r0.f8702A
            int r14 = r14 + 5
            r0.f8702A = r14
            int r14 = r0.f8731z
            int r14 = r14 + r13
            r0.f8731z = r14
            goto L_0x0131
        L_0x017c:
            boolean r15 = r0.f8704C
            if (r15 == 0) goto L_0x01c5
            com.fyber.inneractive.sdk.player.c.k.k r15 = r0.f8714i
            r15.mo19379a(r14)
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8714i
            byte[] r14 = r14.f9625a
            int r15 = r0.f8703B
            r1.mo19010b(r14, r7, r15)
            com.fyber.inneractive.sdk.player.c.k.k r14 = r0.f8714i
            int r15 = r0.f8703B
            r9.mo19041a(r14, r15)
            int r14 = r0.f8703B
            com.fyber.inneractive.sdk.player.c.k.k r15 = r0.f8714i
            byte[] r15 = r15.f9625a
            com.fyber.inneractive.sdk.player.c.k.k r8 = r0.f8714i
            int r8 = r8.f9627c
            int r8 = com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8803a((byte[]) r15, (int) r8)
            com.fyber.inneractive.sdk.player.c.k.k r15 = r0.f8714i
            com.fyber.inneractive.sdk.player.c.h r6 = r4.f8798f
            java.lang.String r6 = r6.f8493f
            java.lang.String r7 = "video/hevc"
            boolean r6 = r7.equals(r6)
            r15.mo19386c(r6)
            com.fyber.inneractive.sdk.player.c.k.k r6 = r0.f8714i
            r6.mo19384b(r8)
            long r6 = r2.mo19134b(r5)
            long r6 = r6 * r11
            com.fyber.inneractive.sdk.player.c.k.k r8 = r0.f8714i
            com.fyber.inneractive.sdk.player.c.d.n[] r15 = r0.f8707F
            com.fyber.inneractive.sdk.player.p059c.p075h.p076a.C3463a.m8608a(r6, r8, r15)
            goto L_0x01ca
        L_0x01c5:
            r6 = 0
            int r14 = r9.mo19035a(r1, r14, r6)
        L_0x01ca:
            int r6 = r0.f8702A
            int r6 = r6 + r14
            r0.f8702A = r6
            int r6 = r0.f8703B
            int r6 = r6 - r14
            r0.f8703B = r6
            r6 = 1
            r7 = 0
            r8 = 4
            goto L_0x0131
        L_0x01d9:
            int r3 = r0.f8702A
            int r6 = r0.f8731z
            if (r3 >= r6) goto L_0x01eb
            int r6 = r6 - r3
            r3 = 0
            int r6 = r9.mo19035a(r1, r6, r3)
            int r3 = r0.f8702A
            int r3 = r3 + r6
            r0.f8702A = r3
            goto L_0x01d9
        L_0x01eb:
            long r6 = r2.mo19134b(r5)
            long r6 = r6 * r11
            boolean r3 = r2.f8819m
            if (r3 == 0) goto L_0x01f8
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            boolean[] r8 = r2.f8818l
            boolean r5 = r8[r5]
            r12 = r3 | r5
            com.fyber.inneractive.sdk.player.c.d.d.c r3 = r2.f8807a
            int r3 = r3.f8690a
            boolean r5 = r2.f8819m
            if (r5 == 0) goto L_0x0216
            com.fyber.inneractive.sdk.player.c.d.d.j r5 = r2.f8821o
            if (r5 == 0) goto L_0x020e
            com.fyber.inneractive.sdk.player.c.d.d.j r3 = r2.f8821o
            goto L_0x0212
        L_0x020e:
            com.fyber.inneractive.sdk.player.c.d.d.j[] r4 = r4.f8800h
            r3 = r4[r3]
        L_0x0212:
            byte[] r3 = r3.f8806c
            r15 = r3
            goto L_0x0217
        L_0x0216:
            r15 = 0
        L_0x0217:
            com.fyber.inneractive.sdk.player.c.k.r r3 = r0.f8716k
            if (r3 == 0) goto L_0x021f
            long r6 = r3.mo19423b(r6)
        L_0x021f:
            int r13 = r0.f8731z
            r14 = 0
            r10 = r6
            r9.mo19038a(r10, r12, r13, r14, r15)
        L_0x0226:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.c.d.d.e$a> r3 = r0.f8720o
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x024d
            java.util.LinkedList<com.fyber.inneractive.sdk.player.c.d.d.e$a> r3 = r0.f8720o
            java.lang.Object r3 = r3.removeFirst()
            com.fyber.inneractive.sdk.player.c.d.d.e$a r3 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3332a) r3
            int r4 = r0.f8727v
            int r5 = r3.f8733b
            int r4 = r4 - r5
            r0.f8727v = r4
            com.fyber.inneractive.sdk.player.c.d.n r8 = r0.f8706E
            long r4 = r3.f8732a
            long r9 = r6 + r4
            r11 = 1
            int r12 = r3.f8733b
            int r13 = r0.f8727v
            r14 = 0
            r8.mo19038a(r9, r11, r12, r13, r14)
            goto L_0x0226
        L_0x024d:
            com.fyber.inneractive.sdk.player.c.d.d.e$b r3 = r0.f8730y
            int r4 = r3.f8738e
            r5 = 1
            int r4 = r4 + r5
            r3.f8738e = r4
            com.fyber.inneractive.sdk.player.c.d.d.e$b r3 = r0.f8730y
            int r4 = r3.f8739f
            int r4 = r4 + r5
            r3.f8739f = r4
            com.fyber.inneractive.sdk.player.c.d.d.e$b r3 = r0.f8730y
            int r3 = r3.f8739f
            int[] r2 = r2.f8814h
            com.fyber.inneractive.sdk.player.c.d.d.e$b r4 = r0.f8730y
            int r4 = r4.f8740g
            r2 = r2[r4]
            if (r3 != r2) goto L_0x027a
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            int r3 = r2.f8740g
            int r3 = r3 + r5
            r2.f8740g = r3
            com.fyber.inneractive.sdk.player.c.d.d.e$b r2 = r0.f8730y
            r3 = 0
            r2.f8739f = r3
            r2 = 0
            r0.f8730y = r2
            goto L_0x027b
        L_0x027a:
            r3 = 0
        L_0x027b:
            r2 = 3
            r0.f8721p = r2
            r6 = 1
        L_0x027f:
            if (r6 == 0) goto L_0x0004
            return r3
        L_0x0282:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r2 = r0.f8711f
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x028a:
            if (r3 >= r2) goto L_0x02af
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r5 = r0.f8711f
            java.lang.Object r5 = r5.valueAt(r3)
            com.fyber.inneractive.sdk.player.c.d.d.e$b r5 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3333b) r5
            com.fyber.inneractive.sdk.player.c.d.d.k r5 = r5.f8734a
            boolean r6 = r5.f8824r
            if (r6 == 0) goto L_0x02ac
            long r6 = r5.f8810d
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02ac
            long r4 = r5.f8810d
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r6 = r0.f8711f
            java.lang.Object r6 = r6.valueAt(r3)
            com.fyber.inneractive.sdk.player.c.d.d.e$b r6 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3333b) r6
            r9 = r4
            r4 = r6
        L_0x02ac:
            int r3 = r3 + 1
            goto L_0x028a
        L_0x02af:
            if (r4 != 0) goto L_0x02b6
            r2 = 3
            r0.f8721p = r2
            goto L_0x0004
        L_0x02b6:
            long r2 = r27.mo19012c()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 < 0) goto L_0x02d6
            r1.mo19009b(r2)
            com.fyber.inneractive.sdk.player.c.d.d.k r2 = r4.f8734a
            com.fyber.inneractive.sdk.player.c.k.k r3 = r2.f8823q
            byte[] r3 = r3.f9625a
            int r4 = r2.f8822p
            r5 = 0
            r1.mo19010b(r3, r5, r4)
            com.fyber.inneractive.sdk.player.c.k.k r3 = r2.f8823q
            r3.mo19386c(r5)
            r2.f8824r = r5
            goto L_0x0004
        L_0x02d6:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x02de:
            long r6 = r0.f8723r
            int r2 = (int) r6
            int r4 = r0.f8724s
            int r2 = r2 - r4
            com.fyber.inneractive.sdk.player.c.k.k r4 = r0.f8725t
            if (r4 == 0) goto L_0x0431
            byte[] r4 = r4.f9625a
            r1.mo19010b(r4, r5, r2)
            com.fyber.inneractive.sdk.player.c.d.d.a$b r2 = new com.fyber.inneractive.sdk.player.c.d.d.a$b
            int r4 = r0.f8722q
            com.fyber.inneractive.sdk.player.c.k.k r6 = r0.f8725t
            r2.<init>(r4, r6)
            long r6 = r27.mo19012c()
            java.util.Stack<com.fyber.inneractive.sdk.player.c.d.d.a$a> r4 = r0.f8719n
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x030f
            java.util.Stack<com.fyber.inneractive.sdk.player.c.d.d.a$a> r3 = r0.f8719n
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.c.d.d.a$a r3 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3318a) r3
            r3.mo19124a((com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b) r2)
            goto L_0x0434
        L_0x030f:
            int r4 = r2.f8653aP
            int r8 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8560A
            if (r4 != r8) goto L_0x03d7
            com.fyber.inneractive.sdk.player.c.k.k r2 = r2.f8657aQ
            r2.mo19386c(r5)
            int r4 = r2.mo19396j()
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r4)
            r5 = 4
            r2.mo19388d(r5)
            long r14 = r2.mo19394h()
            if (r4 != 0) goto L_0x0335
            long r4 = r2.mo19394h()
            long r8 = r2.mo19394h()
            goto L_0x033d
        L_0x0335:
            long r4 = r2.mo19402p()
            long r8 = r2.mo19402p()
        L_0x033d:
            long r6 = r6 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r4
            r12 = r14
            long r20 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r8, (long) r10, (long) r12)
            r2.mo19388d(r3)
            int r3 = r2.mo19389e()
            int[] r12 = new int[r3]
            long[] r13 = new long[r3]
            long[] r10 = new long[r3]
            long[] r11 = new long[r3]
            r22 = r20
            r8 = 0
        L_0x0359:
            if (r8 >= r3) goto L_0x03af
            int r9 = r2.mo19396j()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x03a7
            long r24 = r2.mo19394h()
            r16 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r16
            r12[r8] = r9
            r13[r8] = r6
            r11[r8] = r22
            long r4 = r4 + r24
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r8
            r8 = r4
            r28 = r3
            r24 = r4
            r3 = r10
            r4 = r11
            r10 = r22
            r5 = r12
            r1 = r13
            r12 = r14
            long r22 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r8, (long) r10, (long) r12)
            r8 = r4[r19]
            long r8 = r22 - r8
            r3[r19] = r8
            r8 = 4
            r2.mo19388d(r8)
            r9 = r5[r19]
            long r9 = (long) r9
            long r6 = r6 + r9
            int r9 = r19 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r12 = r5
            r8 = r9
            r4 = r24
            r1 = r27
            r3 = r28
            goto L_0x0359
        L_0x03a7:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x03af:
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.fyber.inneractive.sdk.player.c.d.a r6 = new com.fyber.inneractive.sdk.player.c.d.a
            r6.<init>(r5, r1, r3, r4)
            android.util.Pair r1 = android.util.Pair.create(r2, r6)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f8729x = r2
            com.fyber.inneractive.sdk.player.c.d.h r2 = r0.f8705D
            java.lang.Object r1 = r1.second
            com.fyber.inneractive.sdk.player.c.d.m r1 = (com.fyber.inneractive.sdk.player.p059c.p063d.C3276m) r1
            r2.mo19057a((com.fyber.inneractive.sdk.player.p059c.p063d.C3276m) r1)
            r1 = 1
            r0.f8708G = r1
            goto L_0x042e
        L_0x03d7:
            int r1 = r2.f8653aP
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8593aG
            if (r1 != r3) goto L_0x042e
            com.fyber.inneractive.sdk.player.c.k.k r1 = r2.f8657aQ
            com.fyber.inneractive.sdk.player.c.d.n r2 = r0.f8706E
            if (r2 == 0) goto L_0x042e
            r2 = 12
            r1.mo19386c(r2)
            r1.mo19403q()
            r1.mo19403q()
            long r7 = r1.mo19394h()
            long r3 = r1.mo19394h()
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r3, (long) r5, (long) r7)
            r1.mo19386c(r2)
            int r9 = r1.mo19383b()
            com.fyber.inneractive.sdk.player.c.d.n r2 = r0.f8706E
            r2.mo19041a(r1, r9)
            long r1 = r0.f8729x
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x041f
            com.fyber.inneractive.sdk.player.c.d.n r5 = r0.f8706E
            long r6 = r1 + r3
            r8 = 1
            r10 = 0
            r11 = 0
            r5.mo19038a(r6, r8, r9, r10, r11)
            goto L_0x042e
        L_0x041f:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.c.d.d.e$a> r1 = r0.f8720o
            com.fyber.inneractive.sdk.player.c.d.d.e$a r2 = new com.fyber.inneractive.sdk.player.c.d.d.e$a
            r2.<init>(r3, r9)
            r1.addLast(r2)
            int r1 = r0.f8727v
            int r1 = r1 + r9
            r0.f8727v = r1
        L_0x042e:
            r1 = r27
            goto L_0x0434
        L_0x0431:
            r1.mo19009b(r2)
        L_0x0434:
            long r2 = r27.mo19012c()
            r0.m8234a((long) r2)
            goto L_0x0004
        L_0x043d:
            int r2 = r0.f8724s
            if (r2 != 0) goto L_0x0466
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            byte[] r2 = r2.f9625a
            r4 = 1
            r6 = 0
            boolean r2 = r1.mo19007a(r2, r6, r5, r4)
            if (r2 != 0) goto L_0x044f
            goto L_0x05c8
        L_0x044f:
            r0.f8724s = r5
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            r2.mo19386c(r6)
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            long r6 = r2.mo19394h()
            r0.f8723r = r6
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            int r2 = r2.mo19396j()
            r0.f8722q = r2
        L_0x0466:
            long r6 = r0.f8723r
            r8 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0482
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            byte[] r2 = r2.f9625a
            r1.mo19010b(r2, r5, r5)
            int r2 = r0.f8724s
            int r2 = r2 + r5
            r0.f8724s = r2
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            long r6 = r2.mo19402p()
            r0.f8723r = r6
        L_0x0482:
            long r6 = r0.f8723r
            int r2 = r0.f8724s
            long r8 = (long) r2
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x05d4
            long r6 = r27.mo19012c()
            int r2 = r0.f8724s
            long r8 = (long) r2
            long r6 = r6 - r8
            int r2 = r0.f8722q
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8570K
            if (r2 != r4) goto L_0x04b5
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r2 = r0.f8711f
            int r2 = r2.size()
            r4 = 0
        L_0x04a0:
            if (r4 >= r2) goto L_0x04b5
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r8 = r0.f8711f
            java.lang.Object r8 = r8.valueAt(r4)
            com.fyber.inneractive.sdk.player.c.d.d.e$b r8 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3333b) r8
            com.fyber.inneractive.sdk.player.c.d.d.k r8 = r8.f8734a
            r8.f8808b = r6
            r8.f8810d = r6
            r8.f8809c = r6
            int r4 = r4 + 1
            goto L_0x04a0
        L_0x04b5:
            int r2 = r0.f8722q
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8634h
            if (r2 != r4) goto L_0x04db
            r2 = 0
            r0.f8730y = r2
            long r4 = r0.f8723r
            long r6 = r6 + r4
            r0.f8726u = r6
            boolean r2 = r0.f8708G
            if (r2 != 0) goto L_0x04d6
            com.fyber.inneractive.sdk.player.c.d.h r2 = r0.f8705D
            com.fyber.inneractive.sdk.player.c.d.m$a r4 = new com.fyber.inneractive.sdk.player.c.d.m$a
            long r5 = r0.f8728w
            r4.<init>(r5)
            r2.mo19057a((com.fyber.inneractive.sdk.player.p059c.p063d.C3276m) r4)
            r2 = 1
            r0.f8708G = r2
        L_0x04d6:
            r0.f8721p = r3
        L_0x04d8:
            r2 = 1
            goto L_0x05c7
        L_0x04db:
            int r2 = r0.f8722q
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8561B
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8563D
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8564E
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8565F
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8566G
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8570K
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8571L
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8572M
            if (r2 == r3) goto L_0x0504
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8575P
            if (r2 != r3) goto L_0x0502
            goto L_0x0504
        L_0x0502:
            r2 = 0
            goto L_0x0505
        L_0x0504:
            r2 = 1
        L_0x0505:
            if (r2 == 0) goto L_0x052e
            long r2 = r27.mo19012c()
            long r4 = r0.f8723r
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<com.fyber.inneractive.sdk.player.c.d.d.a$a> r4 = r0.f8719n
            com.fyber.inneractive.sdk.player.c.d.d.a$a r5 = new com.fyber.inneractive.sdk.player.c.d.d.a$a
            int r6 = r0.f8722q
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.f8723r
            int r6 = r0.f8724s
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x052a
            r0.m8234a((long) r2)
            goto L_0x04d8
        L_0x052a:
            r26.m8233a()
            goto L_0x04d8
        L_0x052e:
            int r2 = r0.f8722q
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8578S
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8577R
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8562C
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8560A
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8579T
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8649w
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8650x
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8574O
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8651y
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8652z
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8580U
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8604ac
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8605ad
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8609ah
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8608ag
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8606ae
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8607af
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8576Q
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8573N
            if (r2 == r3) goto L_0x0583
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8593aG
            if (r2 != r3) goto L_0x0581
            goto L_0x0583
        L_0x0581:
            r2 = 0
            goto L_0x0584
        L_0x0583:
            r2 = 1
        L_0x0584:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x05bb
            int r2 = r0.f8724s
            if (r2 != r5) goto L_0x05b3
            long r6 = r0.f8723r
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x05ab
            com.fyber.inneractive.sdk.player.c.k.k r2 = new com.fyber.inneractive.sdk.player.c.k.k
            int r3 = (int) r6
            r2.<init>((int) r3)
            r0.f8725t = r2
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8717l
            byte[] r2 = r2.f9625a
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8725t
            byte[] r3 = r3.f9625a
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r3, r4, r5)
            r2 = 1
            r0.f8721p = r2
            goto L_0x05c7
        L_0x05ab:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x05b3:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x05bb:
            long r5 = r0.f8723r
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x05cc
            r2 = 0
            r0.f8725t = r2
            r2 = 1
            r0.f8721p = r2
        L_0x05c7:
            r6 = 1
        L_0x05c8:
            if (r6 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x05cc:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x05d4:
            com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.mo18998a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    /* renamed from: a */
    private void m8233a() {
        this.f8721p = 0;
        this.f8724s = 0;
    }

    /* renamed from: a */
    private void m8234a(long j) throws C3295l {
        C3339i a;
        long j2;
        while (!this.f8719n.isEmpty() && this.f8719n.peek().f8654aQ == j) {
            C3317a.C3318a pop = this.f8719n.pop();
            if (pop.f8653aP == C3317a.f8561B) {
                boolean z = true;
                C3535a.m8785b(this.f8710e == null, "Unexpected moov box.");
                C3227a a2 = m8232a(pop.f8655aR);
                C3317a.C3318a e = pop.mo19126e(C3317a.f8572M);
                SparseArray sparseArray = new SparseArray();
                int size = e.f8655aR.size();
                long j3 = -9223372036854775807L;
                for (int i = 0; i < size; i++) {
                    C3317a.C3319b bVar = e.f8655aR.get(i);
                    if (bVar.f8653aP == C3317a.f8651y) {
                        C3548k kVar = bVar.f8657aQ;
                        kVar.mo19386c(12);
                        Pair create = Pair.create(Integer.valueOf(kVar.mo19396j()), new C3327c(kVar.mo19400n() - 1, kVar.mo19400n(), kVar.mo19400n(), kVar.mo19396j()));
                        sparseArray.put(((Integer) create.first).intValue(), create.second);
                    } else if (bVar.f8653aP == C3317a.f8573N) {
                        C3548k kVar2 = bVar.f8657aQ;
                        kVar2.mo19386c(8);
                        if (C3317a.m8206a(kVar2.mo19396j()) == 0) {
                            j2 = kVar2.mo19394h();
                        } else {
                            j2 = kVar2.mo19402p();
                        }
                        j3 = j2;
                    }
                }
                SparseArray sparseArray2 = new SparseArray();
                int size2 = pop.f8656aS.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C3317a.C3318a aVar = pop.f8656aS.get(i2);
                    if (aVar.f8653aP == C3317a.f8563D && (a = C3320b.m8218a(aVar, pop.mo19125d(C3317a.f8562C), j3, a2, false)) != null) {
                        sparseArray2.put(a.f8793a, a);
                    }
                }
                int size3 = sparseArray2.size();
                if (this.f8711f.size() == 0) {
                    for (int i3 = 0; i3 < size3; i3++) {
                        C3339i iVar = (C3339i) sparseArray2.valueAt(i3);
                        C3333b bVar2 = new C3333b(this.f8705D.mo19056a(i3));
                        bVar2.mo19132a(iVar, (C3327c) sparseArray.get(iVar.f8793a));
                        this.f8711f.put(iVar.f8793a, bVar2);
                        this.f8728w = Math.max(this.f8728w, iVar.f8797e);
                    }
                    m8237b();
                    this.f8705D.mo19058b();
                } else {
                    if (this.f8711f.size() != size3) {
                        z = false;
                    }
                    C3535a.m8784b(z);
                    for (int i4 = 0; i4 < size3; i4++) {
                        C3339i iVar2 = (C3339i) sparseArray2.valueAt(i4);
                        this.f8711f.get(iVar2.f8793a).mo19132a(iVar2, (C3327c) sparseArray.get(iVar2.f8793a));
                    }
                }
            } else if (pop.f8653aP == C3317a.f8570K) {
                m8235a(pop);
            } else if (!this.f8719n.isEmpty()) {
                this.f8719n.peek().mo19123a(pop);
            }
        }
        m8233a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0229  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8235a(com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3318a r53) throws com.fyber.inneractive.sdk.player.p059c.C3295l {
        /*
            r52 = this;
            r0 = r52
            r1 = r53
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r2 = r0.f8711f
            int r3 = r0.f8709d
            byte[] r4 = r0.f8718m
            java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a$a> r5 = r1.f8656aS
            int r5 = r5.size()
            r7 = 0
        L_0x0011:
            if (r7 >= r5) goto L_0x04bf
            java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a$a> r8 = r1.f8656aS
            java.lang.Object r8 = r8.get(r7)
            com.fyber.inneractive.sdk.player.c.d.d.a$a r8 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3318a) r8
            int r9 = r8.f8653aP
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8571L
            if (r9 != r10) goto L_0x04a7
            int r9 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8650x
            com.fyber.inneractive.sdk.player.c.d.d.a$b r9 = r8.mo19125d(r9)
            com.fyber.inneractive.sdk.player.c.k.k r9 = r9.f8657aQ
            r10 = 8
            r9.mo19386c(r10)
            int r11 = r9.mo19396j()
            int r11 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8207b(r11)
            int r12 = r9.mo19396j()
            r13 = r3 & 16
            if (r13 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r12 = 0
        L_0x0040:
            java.lang.Object r12 = r2.get(r12)
            com.fyber.inneractive.sdk.player.c.d.d.e$b r12 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3333b) r12
            r13 = 1
            if (r12 != 0) goto L_0x004b
            r12 = 0
            goto L_0x0095
        L_0x004b:
            r14 = r11 & 1
            if (r14 == 0) goto L_0x005b
            long r14 = r9.mo19402p()
            com.fyber.inneractive.sdk.player.c.d.d.k r6 = r12.f8734a
            r6.f8809c = r14
            com.fyber.inneractive.sdk.player.c.d.d.k r6 = r12.f8734a
            r6.f8810d = r14
        L_0x005b:
            com.fyber.inneractive.sdk.player.c.d.d.c r6 = r12.f8737d
            r14 = r11 & 2
            if (r14 == 0) goto L_0x0067
            int r14 = r9.mo19400n()
            int r14 = r14 - r13
            goto L_0x0069
        L_0x0067:
            int r14 = r6.f8690a
        L_0x0069:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x0072
            int r15 = r9.mo19400n()
            goto L_0x0074
        L_0x0072:
            int r15 = r6.f8691b
        L_0x0074:
            r17 = r11 & 16
            if (r17 == 0) goto L_0x007f
            int r17 = r9.mo19400n()
            r13 = r17
            goto L_0x0081
        L_0x007f:
            int r13 = r6.f8692c
        L_0x0081:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x008a
            int r6 = r9.mo19400n()
            goto L_0x008c
        L_0x008a:
            int r6 = r6.f8693d
        L_0x008c:
            com.fyber.inneractive.sdk.player.c.d.d.k r9 = r12.f8734a
            com.fyber.inneractive.sdk.player.c.d.d.c r11 = new com.fyber.inneractive.sdk.player.c.d.d.c
            r11.<init>(r14, r15, r13, r6)
            r9.f8807a = r11
        L_0x0095:
            if (r12 == 0) goto L_0x04a7
            com.fyber.inneractive.sdk.player.c.d.d.k r6 = r12.f8734a
            long r13 = r6.f8825s
            r12.mo19131a()
            int r9 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8649w
            com.fyber.inneractive.sdk.player.c.d.d.a$b r9 = r8.mo19125d(r9)
            if (r9 == 0) goto L_0x00c9
            r9 = r3 & 2
            if (r9 != 0) goto L_0x00c9
            int r9 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8649w
            com.fyber.inneractive.sdk.player.c.d.d.a$b r9 = r8.mo19125d(r9)
            com.fyber.inneractive.sdk.player.c.k.k r9 = r9.f8657aQ
            r9.mo19386c(r10)
            int r11 = r9.mo19396j()
            int r11 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r11)
            r13 = 1
            if (r11 != r13) goto L_0x00c5
            long r13 = r9.mo19402p()
            goto L_0x00c9
        L_0x00c5:
            long r13 = r9.mo19394h()
        L_0x00c9:
            java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a$b> r9 = r8.f8655aR
            int r11 = r9.size()
            r19 = r2
            r2 = 0
            r10 = 0
            r15 = 0
        L_0x00d4:
            if (r15 >= r11) goto L_0x00ff
            java.lang.Object r20 = r9.get(r15)
            r21 = r5
            r5 = r20
            com.fyber.inneractive.sdk.player.c.d.d.a$b r5 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b) r5
            r22 = r13
            int r13 = r5.f8653aP
            int r14 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8652z
            if (r13 != r14) goto L_0x00f8
            com.fyber.inneractive.sdk.player.c.k.k r5 = r5.f8657aQ
            r13 = 12
            r5.mo19386c(r13)
            int r5 = r5.mo19400n()
            if (r5 <= 0) goto L_0x00f8
            int r2 = r2 + r5
            int r10 = r10 + 1
        L_0x00f8:
            int r15 = r15 + 1
            r5 = r21
            r13 = r22
            goto L_0x00d4
        L_0x00ff:
            r21 = r5
            r22 = r13
            r5 = 0
            r12.f8740g = r5
            r12.f8739f = r5
            r12.f8738e = r5
            com.fyber.inneractive.sdk.player.c.d.d.k r5 = r12.f8734a
            r5.f8811e = r10
            r5.f8812f = r2
            int[] r13 = r5.f8814h
            if (r13 == 0) goto L_0x0119
            int[] r13 = r5.f8814h
            int r13 = r13.length
            if (r13 >= r10) goto L_0x0121
        L_0x0119:
            long[] r13 = new long[r10]
            r5.f8813g = r13
            int[] r10 = new int[r10]
            r5.f8814h = r10
        L_0x0121:
            int[] r10 = r5.f8815i
            if (r10 == 0) goto L_0x012a
            int[] r10 = r5.f8815i
            int r10 = r10.length
            if (r10 >= r2) goto L_0x0142
        L_0x012a:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r10 = new int[r2]
            r5.f8815i = r10
            int[] r10 = new int[r2]
            r5.f8816j = r10
            long[] r10 = new long[r2]
            r5.f8817k = r10
            boolean[] r10 = new boolean[r2]
            r5.f8818l = r10
            boolean[] r2 = new boolean[r2]
            r5.f8820n = r2
        L_0x0142:
            r2 = 0
            r5 = 0
            r10 = 0
        L_0x0145:
            if (r2 >= r11) goto L_0x02d5
            java.lang.Object r24 = r9.get(r2)
            r15 = r24
            com.fyber.inneractive.sdk.player.c.d.d.a$b r15 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b) r15
            int r13 = r15.f8653aP
            int r14 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8652z
            if (r13 != r14) goto L_0x02aa
            int r13 = r5 + 1
            com.fyber.inneractive.sdk.player.c.k.k r14 = r15.f8657aQ
            r15 = 8
            r14.mo19386c(r15)
            int r15 = r14.mo19396j()
            int r15 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8207b(r15)
            r24 = r9
            com.fyber.inneractive.sdk.player.c.d.d.i r9 = r12.f8736c
            r28 = r11
            com.fyber.inneractive.sdk.player.c.d.d.k r11 = r12.f8734a
            r29 = r13
            com.fyber.inneractive.sdk.player.c.d.d.c r13 = r11.f8807a
            int[] r0 = r11.f8814h
            int r30 = r14.mo19400n()
            r0[r5] = r30
            long[] r0 = r11.f8813g
            r31 = r6
            r30 = r7
            long r6 = r11.f8809c
            r0[r5] = r6
            r0 = r15 & 1
            if (r0 == 0) goto L_0x0197
            long[] r0 = r11.f8813g
            r6 = r0[r5]
            int r1 = r14.mo19396j()
            r32 = r2
            long r1 = (long) r1
            long r6 = r6 + r1
            r0[r5] = r6
            goto L_0x0199
        L_0x0197:
            r32 = r2
        L_0x0199:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x019f
            r0 = 1
            goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            int r1 = r13.f8693d
            if (r0 == 0) goto L_0x01a8
            int r1 = r14.mo19400n()
        L_0x01a8:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01ae
            r2 = 1
            goto L_0x01af
        L_0x01ae:
            r2 = 0
        L_0x01af:
            r6 = r15 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x01b5
            r6 = 1
            goto L_0x01b6
        L_0x01b5:
            r6 = 0
        L_0x01b6:
            r7 = r15 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x01bc
            r7 = 1
            goto L_0x01bd
        L_0x01bc:
            r7 = 0
        L_0x01bd:
            r15 = r15 & 2048(0x800, float:2.87E-42)
            r33 = r1
            if (r15 == 0) goto L_0x01c5
            r15 = 1
            goto L_0x01c6
        L_0x01c5:
            r15 = 0
        L_0x01c6:
            long[] r1 = r9.f8801i
            if (r1 == 0) goto L_0x01f0
            long[] r1 = r9.f8801i
            int r1 = r1.length
            r34 = r4
            r4 = 1
            if (r1 != r4) goto L_0x01f2
            long[] r1 = r9.f8801i
            r4 = 0
            r35 = r1[r4]
            r26 = 0
            int r1 = (r35 > r26 ? 1 : (r35 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x01f2
            long[] r1 = r9.f8802j
            r35 = r1[r4]
            r37 = 1000(0x3e8, double:4.94E-321)
            r4 = r7
            r1 = r8
            long r7 = r9.f8795c
            r39 = r7
            long r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r35, (long) r37, (long) r39)
            r35 = r12
            goto L_0x01f8
        L_0x01f0:
            r34 = r4
        L_0x01f2:
            r4 = r7
            r1 = r8
            r35 = r12
            r7 = 0
        L_0x01f8:
            int[] r12 = r11.f8815i
            r36 = r1
            int[] r1 = r11.f8816j
            r26 = r12
            long[] r12 = r11.f8817k
            r27 = r12
            boolean[] r12 = r11.f8818l
            r37 = r12
            int r12 = r9.f8794b
            r38 = r7
            r7 = 2
            if (r12 != r7) goto L_0x0215
            r7 = r3 & 1
            if (r7 == 0) goto L_0x0215
            r7 = 1
            goto L_0x0216
        L_0x0215:
            r7 = 0
        L_0x0216:
            int[] r8 = r11.f8814h
            r8 = r8[r5]
            int r8 = r8 + r10
            r12 = r10
            long r9 = r9.f8795c
            r46 = r9
            if (r5 <= 0) goto L_0x0225
            long r9 = r11.f8825s
            goto L_0x0227
        L_0x0225:
            r9 = r22
        L_0x0227:
            if (r12 >= r8) goto L_0x02a2
            if (r2 == 0) goto L_0x0230
            int r5 = r14.mo19400n()
            goto L_0x0232
        L_0x0230:
            int r5 = r13.f8691b
        L_0x0232:
            if (r6 == 0) goto L_0x023f
            int r20 = r14.mo19400n()
            r51 = r20
            r20 = r2
            r2 = r51
            goto L_0x0243
        L_0x023f:
            r20 = r2
            int r2 = r13.f8692c
        L_0x0243:
            if (r12 != 0) goto L_0x024c
            if (r0 == 0) goto L_0x024c
            r48 = r0
            r0 = r33
            goto L_0x025b
        L_0x024c:
            if (r4 == 0) goto L_0x0257
            int r40 = r14.mo19396j()
            r48 = r0
            r0 = r40
            goto L_0x025b
        L_0x0257:
            r48 = r0
            int r0 = r13.f8693d
        L_0x025b:
            if (r15 == 0) goto L_0x026e
            r49 = r3
            int r3 = r14.mo19396j()
            int r3 = r3 * 1000
            r50 = r4
            long r3 = (long) r3
            long r3 = r3 / r46
            int r4 = (int) r3
            r1[r12] = r4
            goto L_0x0275
        L_0x026e:
            r49 = r3
            r50 = r4
            r3 = 0
            r1[r12] = r3
        L_0x0275:
            r42 = 1000(0x3e8, double:4.94E-321)
            r40 = r9
            r44 = r46
            long r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r40, (long) r42, (long) r44)
            long r3 = r3 - r38
            r27[r12] = r3
            r26[r12] = r2
            r2 = 16
            int r0 = r0 >> r2
            r2 = 1
            r0 = r0 & r2
            if (r0 != 0) goto L_0x0292
            if (r7 == 0) goto L_0x0290
            if (r12 != 0) goto L_0x0292
        L_0x0290:
            r0 = 1
            goto L_0x0293
        L_0x0292:
            r0 = 0
        L_0x0293:
            r37[r12] = r0
            long r2 = (long) r5
            long r9 = r9 + r2
            int r12 = r12 + 1
            r2 = r20
            r0 = r48
            r3 = r49
            r4 = r50
            goto L_0x0227
        L_0x02a2:
            r49 = r3
            r11.f8825s = r9
            r10 = r8
            r5 = r29
            goto L_0x02bd
        L_0x02aa:
            r32 = r2
            r49 = r3
            r34 = r4
            r31 = r6
            r30 = r7
            r36 = r8
            r24 = r9
            r28 = r11
            r35 = r12
            r12 = r10
        L_0x02bd:
            int r2 = r32 + 1
            r0 = r52
            r1 = r53
            r9 = r24
            r11 = r28
            r7 = r30
            r6 = r31
            r4 = r34
            r12 = r35
            r8 = r36
            r3 = r49
            goto L_0x0145
        L_0x02d5:
            r49 = r3
            r34 = r4
            r31 = r6
            r30 = r7
            r36 = r8
            r35 = r12
            int r0 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8604ac
            com.fyber.inneractive.sdk.player.c.d.d.a$b r0 = r8.mo19125d(r0)
            if (r0 == 0) goto L_0x0363
            r12 = r35
            com.fyber.inneractive.sdk.player.c.d.d.i r1 = r12.f8736c
            com.fyber.inneractive.sdk.player.c.d.d.j[] r1 = r1.f8800h
            r2 = r31
            com.fyber.inneractive.sdk.player.c.d.d.c r3 = r2.f8807a
            int r3 = r3.f8690a
            r1 = r1[r3]
            com.fyber.inneractive.sdk.player.c.k.k r0 = r0.f8657aQ
            int r1 = r1.f8805b
            r3 = 8
            r0.mo19386c(r3)
            int r4 = r0.mo19396j()
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8207b(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x030f
            r0.mo19388d(r3)
        L_0x030f:
            int r3 = r0.mo19387d()
            int r4 = r0.mo19400n()
            int r5 = r2.f8812f
            if (r4 != r5) goto L_0x0345
            if (r3 != 0) goto L_0x0332
            boolean[] r3 = r2.f8820n
            r5 = 0
            r6 = 0
        L_0x0321:
            if (r5 >= r4) goto L_0x0341
            int r7 = r0.mo19387d()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x032c
            r7 = 1
            goto L_0x032d
        L_0x032c:
            r7 = 0
        L_0x032d:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x0321
        L_0x0332:
            if (r3 <= r1) goto L_0x0336
            r0 = 1
            goto L_0x0337
        L_0x0336:
            r0 = 0
        L_0x0337:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.f8820n
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x0341:
            r2.mo19133a(r6)
            goto L_0x0365
        L_0x0345:
            com.fyber.inneractive.sdk.player.c.l r0 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Length mismatch: "
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r3 = ", "
            r1.append(r3)
            int r2 = r2.f8812f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0363:
            r2 = r31
        L_0x0365:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8605ad
            com.fyber.inneractive.sdk.player.c.d.d.a$b r0 = r8.mo19125d(r0)
            if (r0 == 0) goto L_0x03b2
            com.fyber.inneractive.sdk.player.c.k.k r0 = r0.f8657aQ
            r1 = 8
            r0.mo19386c(r1)
            int r3 = r0.mo19396j()
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8207b(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0383
            r0.mo19388d(r1)
        L_0x0383:
            int r1 = r0.mo19400n()
            if (r1 != r5) goto L_0x039e
            int r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r3)
            long r3 = r2.f8810d
            if (r1 != 0) goto L_0x0396
            long r0 = r0.mo19394h()
            goto L_0x039a
        L_0x0396:
            long r0 = r0.mo19402p()
        L_0x039a:
            long r3 = r3 + r0
            r2.f8810d = r3
            goto L_0x03b2
        L_0x039e:
            com.fyber.inneractive.sdk.player.c.l r0 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x03b2:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8609ah
            com.fyber.inneractive.sdk.player.c.d.d.a$b r0 = r8.mo19125d(r0)
            if (r0 == 0) goto L_0x03c0
            com.fyber.inneractive.sdk.player.c.k.k r0 = r0.f8657aQ
            r1 = 0
            m8236a(r0, r1, r2)
        L_0x03c0:
            int r0 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8606ae
            com.fyber.inneractive.sdk.player.c.d.d.a$b r0 = r8.mo19125d(r0)
            int r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8607af
            com.fyber.inneractive.sdk.player.c.d.d.a$b r1 = r8.mo19125d(r1)
            if (r0 == 0) goto L_0x0466
            if (r1 == 0) goto L_0x0466
            com.fyber.inneractive.sdk.player.c.k.k r0 = r0.f8657aQ
            com.fyber.inneractive.sdk.player.c.k.k r1 = r1.f8657aQ
            r3 = 8
            r0.mo19386c(r3)
            int r3 = r0.mo19396j()
            int r4 = r0.mo19396j()
            int r5 = f8700b
            if (r4 != r5) goto L_0x0466
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r3)
            r4 = 4
            r5 = 1
            if (r3 != r5) goto L_0x03f0
            r0.mo19388d(r4)
        L_0x03f0:
            int r0 = r0.mo19396j()
            if (r0 != r5) goto L_0x045e
            r0 = 8
            r1.mo19386c(r0)
            int r0 = r1.mo19396j()
            int r3 = r1.mo19396j()
            int r6 = f8700b
            if (r3 != r6) goto L_0x0466
            int r0 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r0)
            if (r0 != r5) goto L_0x0421
            long r3 = r1.mo19394h()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0419
            r3 = 2
            goto L_0x0427
        L_0x0419:
            com.fyber.inneractive.sdk.player.c.l r0 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x0421:
            r3 = 2
            if (r0 < r3) goto L_0x0427
            r1.mo19388d(r4)
        L_0x0427:
            long r4 = r1.mo19394h()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0456
            r1.mo19388d(r3)
            int r0 = r1.mo19387d()
            r3 = 1
            if (r0 != r3) goto L_0x043d
            r0 = 1
            goto L_0x043e
        L_0x043d:
            r0 = 0
        L_0x043e:
            if (r0 == 0) goto L_0x0466
            int r0 = r1.mo19387d()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r1.mo19382a(r5, r6, r4)
            r2.f8819m = r3
            com.fyber.inneractive.sdk.player.c.d.d.j r1 = new com.fyber.inneractive.sdk.player.c.d.d.j
            r1.<init>(r3, r0, r5)
            r2.f8821o = r1
            goto L_0x0466
        L_0x0456:
            com.fyber.inneractive.sdk.player.c.l r0 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x045e:
            com.fyber.inneractive.sdk.player.c.l r0 = new com.fyber.inneractive.sdk.player.c.l
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0466:
            java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a$b> r0 = r8.f8655aR
            int r0 = r0.size()
            r5 = 0
        L_0x046d:
            if (r5 >= r0) goto L_0x04a4
            java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a$b> r1 = r8.f8655aR
            java.lang.Object r1 = r1.get(r5)
            com.fyber.inneractive.sdk.player.c.d.d.a$b r1 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b) r1
            int r3 = r1.f8653aP
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8608ag
            if (r3 != r4) goto L_0x0498
            com.fyber.inneractive.sdk.player.c.k.k r1 = r1.f8657aQ
            r3 = 8
            r1.mo19386c(r3)
            r4 = r34
            r6 = 16
            r7 = 0
            r1.mo19382a(r4, r7, r6)
            byte[] r9 = f8701c
            boolean r9 = java.util.Arrays.equals(r4, r9)
            if (r9 == 0) goto L_0x049f
            m8236a(r1, r6, r2)
            goto L_0x049f
        L_0x0498:
            r4 = r34
            r3 = 8
            r6 = 16
            r7 = 0
        L_0x049f:
            int r5 = r5 + 1
            r34 = r4
            goto L_0x046d
        L_0x04a4:
            r4 = r34
            goto L_0x04af
        L_0x04a7:
            r19 = r2
            r49 = r3
            r21 = r5
            r30 = r7
        L_0x04af:
            r7 = 0
            int r0 = r30 + 1
            r1 = r53
            r7 = r0
            r2 = r19
            r5 = r21
            r3 = r49
            r0 = r52
            goto L_0x0011
        L_0x04bf:
            r0 = r1
            r7 = 0
            java.util.List<com.fyber.inneractive.sdk.player.c.d.d.a$b> r0 = r0.f8655aR
            com.fyber.inneractive.sdk.player.c.c.a r0 = m8232a((java.util.List<com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b>) r0)
            if (r0 == 0) goto L_0x054c
            r1 = r52
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r2 = r1.f8711f
            int r2 = r2.size()
            r6 = 0
        L_0x04d2:
            if (r6 >= r2) goto L_0x054c
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d.e$b> r3 = r1.f8711f
            java.lang.Object r3 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.c.d.d.e$b r3 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.C3333b) r3
            com.fyber.inneractive.sdk.player.c.d.n r4 = r3.f8735b
            com.fyber.inneractive.sdk.player.c.d.d.i r3 = r3.f8736c
            com.fyber.inneractive.sdk.player.c.h r3 = r3.f8798f
            com.fyber.inneractive.sdk.player.c.h r5 = new com.fyber.inneractive.sdk.player.c.h
            r8 = r5
            java.lang.String r9 = r3.f8488a
            java.lang.String r10 = r3.f8492e
            java.lang.String r11 = r3.f8493f
            java.lang.String r12 = r3.f8490c
            int r13 = r3.f8489b
            int r14 = r3.f8494g
            int r15 = r3.f8497j
            int r7 = r3.f8498k
            r16 = r7
            float r7 = r3.f8499l
            r17 = r7
            int r7 = r3.f8500m
            r18 = r7
            float r7 = r3.f8501n
            r19 = r7
            byte[] r7 = r3.f8503p
            r20 = r7
            int r7 = r3.f8502o
            r21 = r7
            com.fyber.inneractive.sdk.player.c.l.b r7 = r3.f8504q
            r22 = r7
            int r7 = r3.f8505r
            r23 = r7
            int r7 = r3.f8506s
            r24 = r7
            int r7 = r3.f8507t
            r25 = r7
            int r7 = r3.f8508u
            r26 = r7
            int r7 = r3.f8509v
            r27 = r7
            int r7 = r3.f8511x
            r28 = r7
            java.lang.String r7 = r3.f8512y
            r29 = r7
            int r7 = r3.f8513z
            r30 = r7
            r53 = r2
            long r1 = r3.f8510w
            r31 = r1
            java.util.List<byte[]> r1 = r3.f8495h
            r33 = r1
            com.fyber.inneractive.sdk.player.c.f.a r1 = r3.f8491d
            r35 = r1
            r34 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)
            r4.mo19040a(r5)
            int r6 = r6 + 1
            r1 = r52
            r2 = r53
            goto L_0x04d2
        L_0x054c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.m8235a(com.fyber.inneractive.sdk.player.c.d.d.a$a):void");
    }

    /* renamed from: b */
    private void m8237b() {
        if ((this.f8709d & 4) != 0 && this.f8706E == null) {
            C3278n a = this.f8705D.mo19056a(this.f8711f.size());
            this.f8706E = a;
            a.mo19040a(C3290h.m8112a("application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f8709d & 8) != 0 && this.f8707F == null) {
            C3278n a2 = this.f8705D.mo19056a(this.f8711f.size() + 1);
            a2.mo19040a(C3290h.m8120a((String) null, "application/cea-608", 0, (String) null, (C3227a) null));
            this.f8707F = new C3278n[]{a2};
        }
    }

    /* renamed from: a */
    private static void m8236a(C3548k kVar, int i, C3341k kVar2) throws C3295l {
        kVar.mo19386c(i + 8);
        int b = C3317a.m8207b(kVar.mo19396j());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int n = kVar.mo19400n();
            if (n == kVar2.f8812f) {
                Arrays.fill(kVar2.f8820n, 0, n, z);
                kVar2.mo19133a(kVar.mo19383b());
                kVar.mo19382a(kVar2.f8823q.f9625a, 0, kVar2.f8822p);
                kVar2.f8823q.mo19386c(0);
                kVar2.f8824r = false;
                return;
            }
            throw new C3295l("Length mismatch: " + n + ", " + kVar2.f8812f);
        }
        throw new C3295l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.fyber.inneractive.sdk.player.p059c.p062c.C3227a m8232a(java.util.List<com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b2
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.c.d.d.a$b r5 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b) r5
            int r6 = r5.f8653aP
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8580U
            if (r6 != r7) goto L_0x00ae
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.fyber.inneractive.sdk.player.c.k.k r5 = r5.f8657aQ
            byte[] r5 = r5.f9625a
            com.fyber.inneractive.sdk.player.c.k.k r6 = new com.fyber.inneractive.sdk.player.c.k.k
            r6.<init>((byte[]) r5)
            int r7 = r6.f9627c
            r8 = 32
            if (r7 >= r8) goto L_0x002e
        L_0x002c:
            r6 = r2
            goto L_0x0092
        L_0x002e:
            r6.mo19386c(r1)
            int r7 = r6.mo19396j()
            int r8 = r6.mo19383b()
            int r8 = r8 + 4
            if (r7 == r8) goto L_0x003e
            goto L_0x002c
        L_0x003e:
            int r7 = r6.mo19396j()
            int r8 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8580U
            if (r7 == r8) goto L_0x0047
            goto L_0x002c
        L_0x0047:
            int r7 = r6.mo19396j()
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x0066
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported pssh version: "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002c
        L_0x0066:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo19398l()
            long r12 = r6.mo19398l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x007e
            int r7 = r6.mo19400n()
            int r7 = r7 * 16
            r6.mo19388d(r7)
        L_0x007e:
            int r7 = r6.mo19400n()
            int r8 = r6.mo19383b()
            if (r7 == r8) goto L_0x0089
            goto L_0x002c
        L_0x0089:
            byte[] r8 = new byte[r7]
            r6.mo19382a(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0092:
            if (r6 != 0) goto L_0x0096
            r6 = r2
            goto L_0x009a
        L_0x0096:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x009a:
            if (r6 != 0) goto L_0x00a4
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00ae
        L_0x00a4:
            com.fyber.inneractive.sdk.player.c.c.a$a r7 = new com.fyber.inneractive.sdk.player.c.c.a$a
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        L_0x00ae:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b2:
            if (r4 != 0) goto L_0x00b5
            return r2
        L_0x00b5:
            com.fyber.inneractive.sdk.player.c.c.a r14 = new com.fyber.inneractive.sdk.player.c.c.a
            r14.<init>((java.util.List<com.fyber.inneractive.sdk.player.p059c.p062c.C3227a.C3229a>) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e.m8232a(java.util.List):com.fyber.inneractive.sdk.player.c.c.a");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.e$a */
    private static final class C3332a {

        /* renamed from: a */
        public final long f8732a;

        /* renamed from: b */
        public final int f8733b;

        public C3332a(long j, int i) {
            this.f8732a = j;
            this.f8733b = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.e$b */
    private static final class C3333b {

        /* renamed from: a */
        public final C3341k f8734a = new C3341k();

        /* renamed from: b */
        public final C3278n f8735b;

        /* renamed from: c */
        public C3339i f8736c;

        /* renamed from: d */
        public C3327c f8737d;

        /* renamed from: e */
        public int f8738e;

        /* renamed from: f */
        public int f8739f;

        /* renamed from: g */
        public int f8740g;

        public C3333b(C3278n nVar) {
            this.f8735b = nVar;
        }

        /* renamed from: a */
        public final void mo19132a(C3339i iVar, C3327c cVar) {
            this.f8736c = (C3339i) C3535a.m8781a(iVar);
            this.f8737d = (C3327c) C3535a.m8781a(cVar);
            this.f8735b.mo19040a(iVar.f8798f);
            mo19131a();
        }

        /* renamed from: a */
        public final void mo19131a() {
            C3341k kVar = this.f8734a;
            kVar.f8811e = 0;
            kVar.f8825s = 0;
            kVar.f8819m = false;
            kVar.f8824r = false;
            kVar.f8821o = null;
            this.f8738e = 0;
            this.f8740g = 0;
            this.f8739f = 0;
        }
    }
}
