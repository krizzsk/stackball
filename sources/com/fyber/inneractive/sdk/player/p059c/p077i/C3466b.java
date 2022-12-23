package com.fyber.inneractive.sdk.player.p059c.p077i;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3460h;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3461i;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3473e;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.c.i.b */
public final class C3466b extends C3470d {

    /* renamed from: b */
    private static final int[] f9373b = new int[0];

    /* renamed from: c */
    private final C3473e.C3474a f9374c;

    /* renamed from: d */
    private final AtomicReference<C3468b> f9375d;

    /* renamed from: a */
    private static int m8614a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: a */
    private static boolean m8622a(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.b$b */
    public static final class C3468b {

        /* renamed from: a */
        public final String f9379a;

        /* renamed from: b */
        public final String f9380b;

        /* renamed from: c */
        public final boolean f9381c;

        /* renamed from: d */
        public final boolean f9382d;

        /* renamed from: e */
        public final int f9383e;

        /* renamed from: f */
        public final int f9384f;

        /* renamed from: g */
        public final int f9385g;

        /* renamed from: h */
        public final boolean f9386h;

        /* renamed from: i */
        public final boolean f9387i;

        /* renamed from: j */
        public final int f9388j;

        /* renamed from: k */
        public final int f9389k;

        /* renamed from: l */
        public final boolean f9390l;

        public C3468b() {
            this((byte) 0);
        }

        private C3468b(byte b) {
            this.f9379a = null;
            this.f9380b = null;
            this.f9381c = false;
            this.f9382d = true;
            this.f9383e = Integer.MAX_VALUE;
            this.f9384f = Integer.MAX_VALUE;
            this.f9385g = Integer.MAX_VALUE;
            this.f9386h = true;
            this.f9387i = true;
            this.f9388j = Integer.MAX_VALUE;
            this.f9389k = Integer.MAX_VALUE;
            this.f9390l = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C3468b bVar = (C3468b) obj;
                return this.f9381c == bVar.f9381c && this.f9382d == bVar.f9382d && this.f9383e == bVar.f9383e && this.f9384f == bVar.f9384f && this.f9386h == bVar.f9386h && this.f9387i == bVar.f9387i && this.f9390l == bVar.f9390l && this.f9388j == bVar.f9388j && this.f9389k == bVar.f9389k && this.f9385g == bVar.f9385g && TextUtils.equals(this.f9379a, bVar.f9379a) && TextUtils.equals(this.f9380b, bVar.f9380b);
            }
        }

        public final int hashCode() {
            return (((((((((((((((((((((this.f9379a.hashCode() * 31) + this.f9380b.hashCode()) * 31) + (this.f9381c ? 1 : 0)) * 31) + (this.f9382d ? 1 : 0)) * 31) + this.f9383e) * 31) + this.f9384f) * 31) + this.f9385g) * 31) + (this.f9386h ? 1 : 0)) * 31) + (this.f9387i ? 1 : 0)) * 31) + (this.f9390l ? 1 : 0)) * 31) + this.f9388j) * 31) + this.f9389k;
        }
    }

    public C3466b() {
        this((byte) 0);
    }

    private C3466b(byte b) {
        this.f9374c = null;
        this.f9375d = new AtomicReference<>(new C3468b());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0123 A[LOOP:1: B:17:0x0059->B:45:0x0123, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.player.p059c.p077i.C3473e[] mo19297a(com.fyber.inneractive.sdk.player.p059c.C3298o[] r36, com.fyber.inneractive.sdk.player.p059c.p074g.C3461i[] r37, int[][][] r38) throws com.fyber.inneractive.sdk.player.p059c.C3236d {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            int r2 = r1.length
            com.fyber.inneractive.sdk.player.c.i.e[] r3 = new com.fyber.inneractive.sdk.player.p059c.p077i.C3473e[r2]
            java.util.concurrent.atomic.AtomicReference<com.fyber.inneractive.sdk.player.c.i.b$b> r4 = r0.f9375d
            java.lang.Object r4 = r4.get()
            com.fyber.inneractive.sdk.player.c.i.b$b r4 = (com.fyber.inneractive.sdk.player.p059c.p077i.C3466b.C3468b) r4
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0012:
            r10 = 2
            if (r6 >= r2) goto L_0x0198
            r12 = r1[r6]
            int r12 = r12.mo18872a()
            if (r10 != r12) goto L_0x0180
            if (r7 != 0) goto L_0x016a
            r7 = r1[r6]
            r12 = r37[r6]
            r13 = r38[r6]
            int r15 = r4.f9383e
            int r14 = r4.f9384f
            int r5 = r4.f9385g
            boolean r9 = r4.f9382d
            boolean r11 = r4.f9381c
            int r10 = r4.f9388j
            int r1 = r4.f9389k
            r22 = r2
            boolean r2 = r4.f9390l
            r23 = r8
            com.fyber.inneractive.sdk.player.c.i.e$a r8 = r0.f9374c
            boolean r0 = r4.f9386h
            r24 = r3
            boolean r3 = r4.f9387i
            if (r8 == 0) goto L_0x013e
            if (r9 == 0) goto L_0x0048
            r9 = 12
            goto L_0x004a
        L_0x0048:
            r9 = 8
        L_0x004a:
            if (r11 == 0) goto L_0x0055
            int r7 = r7.mo18893m()
            r7 = r7 & r9
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = 0
        L_0x0056:
            r16 = r14
            r11 = 0
        L_0x0059:
            int r14 = r12.f9363b
            if (r11 >= r14) goto L_0x0133
            com.fyber.inneractive.sdk.player.c.g.h[] r14 = r12.f9364c
            r14 = r14[r11]
            r25 = r13[r11]
            r17 = r15
            int r15 = r14.f9359a
            r26 = r4
            r4 = 2
            if (r15 >= r4) goto L_0x007a
            int[] r14 = f9373b
            r30 = r3
            r27 = r6
        L_0x0072:
            r29 = r7
            r31 = r16
            r33 = r17
            goto L_0x011a
        L_0x007a:
            java.util.List r15 = m8621a(r14, r10, r1, r2)
            r27 = r6
            int r6 = r15.size()
            if (r6 >= r4) goto L_0x008b
            int[] r14 = f9373b
            r30 = r3
            goto L_0x0072
        L_0x008b:
            if (r7 != 0) goto L_0x00ed
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r30 = r3
            r29 = r7
            r6 = 0
            r7 = 0
            r28 = 0
        L_0x009a:
            int r3 = r15.size()
            if (r6 >= r3) goto L_0x00e2
            java.lang.Object r3 = r15.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r18 = r15
            com.fyber.inneractive.sdk.player.c.h[] r15 = r14.f9360b
            r3 = r15[r3]
            java.lang.String r3 = r3.f8493f
            boolean r15 = r4.add(r3)
            r32 = r14
            r31 = r16
            r33 = r17
            r34 = r18
            if (r15 == 0) goto L_0x00d7
            r15 = r25
            r16 = r9
            r17 = r3
            r18 = r33
            r19 = r31
            r20 = r5
            r21 = r34
            int r14 = m8615a(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r14 <= r7) goto L_0x00d7
            r28 = r3
            r7 = r14
        L_0x00d7:
            int r6 = r6 + 1
            r16 = r31
            r14 = r32
            r17 = r33
            r15 = r34
            goto L_0x009a
        L_0x00e2:
            r32 = r14
            r34 = r15
            r31 = r16
            r33 = r17
            r17 = r28
            goto L_0x00fb
        L_0x00ed:
            r30 = r3
            r29 = r7
            r32 = r14
            r34 = r15
            r31 = r16
            r33 = r17
            r17 = 0
        L_0x00fb:
            r14 = r32
            r15 = r25
            r16 = r9
            r18 = r33
            r19 = r31
            r20 = r5
            r21 = r34
            m8626b(r14, r15, r16, r17, r18, r19, r20, r21)
            int r3 = r34.size()
            r4 = 2
            if (r3 >= r4) goto L_0x0116
            int[] r14 = f9373b
            goto L_0x011a
        L_0x0116:
            int[] r14 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8886a((java.util.List<java.lang.Integer>) r34)
        L_0x011a:
            int r3 = r14.length
            if (r3 <= 0) goto L_0x0123
            com.fyber.inneractive.sdk.player.c.i.e r3 = r8.mo19304a()
            r9 = r3
            goto L_0x0149
        L_0x0123:
            int r11 = r11 + 1
            r4 = r26
            r6 = r27
            r7 = r29
            r3 = r30
            r16 = r31
            r15 = r33
            goto L_0x0059
        L_0x0133:
            r30 = r3
            r26 = r4
            r27 = r6
            r33 = r15
            r31 = r16
            goto L_0x0148
        L_0x013e:
            r30 = r3
            r26 = r4
            r27 = r6
            r31 = r14
            r33 = r15
        L_0x0148:
            r9 = 0
        L_0x0149:
            if (r9 != 0) goto L_0x015f
            r14 = r33
            r15 = r31
            r16 = r5
            r17 = r10
            r18 = r1
            r19 = r2
            r20 = r0
            r21 = r30
            com.fyber.inneractive.sdk.player.c.i.e r9 = m8617a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x015f:
            r24[r27] = r9
            r0 = r24[r27]
            if (r0 == 0) goto L_0x0167
            r0 = 1
            goto L_0x0168
        L_0x0167:
            r0 = 0
        L_0x0168:
            r7 = r0
            goto L_0x0174
        L_0x016a:
            r22 = r2
            r24 = r3
            r26 = r4
            r27 = r6
            r23 = r8
        L_0x0174:
            r0 = r37[r27]
            int r0 = r0.f9363b
            if (r0 <= 0) goto L_0x017c
            r11 = 1
            goto L_0x017d
        L_0x017c:
            r11 = 0
        L_0x017d:
            r8 = r23 | r11
            goto L_0x018a
        L_0x0180:
            r22 = r2
            r24 = r3
            r26 = r4
            r27 = r6
            r23 = r8
        L_0x018a:
            int r6 = r27 + 1
            r0 = r35
            r1 = r36
            r2 = r22
            r3 = r24
            r4 = r26
            goto L_0x0012
        L_0x0198:
            r24 = r3
            r26 = r4
            r23 = r8
            r0 = r2
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x01a2:
            if (r1 >= r0) goto L_0x020f
            r4 = r36[r1]
            int r4 = r4.mo18872a()
            r5 = 1
            if (r4 == r5) goto L_0x01e3
            r6 = 2
            if (r4 == r6) goto L_0x01e0
            r7 = 3
            if (r4 == r7) goto L_0x01c2
            r4 = r37[r1]
            r7 = r38[r1]
            r8 = r26
            boolean r9 = r8.f9387i
            com.fyber.inneractive.sdk.player.c.i.e r4 = m8620a((com.fyber.inneractive.sdk.player.p059c.p074g.C3461i) r4, (int[][]) r7, (boolean) r9)
            r24[r1] = r4
            goto L_0x01dd
        L_0x01c2:
            r8 = r26
            if (r3 != 0) goto L_0x01dd
            r3 = r37[r1]
            r4 = r38[r1]
            java.lang.String r7 = r8.f9380b
            java.lang.String r9 = r8.f9379a
            boolean r10 = r8.f9387i
            com.fyber.inneractive.sdk.player.c.i.e r3 = m8618a(r3, r4, r7, r9, r10)
            r24[r1] = r3
            r3 = r24[r1]
            if (r3 == 0) goto L_0x01dc
            r3 = 1
            goto L_0x01dd
        L_0x01dc:
            r3 = 0
        L_0x01dd:
            r4 = r35
            goto L_0x020a
        L_0x01e0:
            r8 = r26
            goto L_0x01dd
        L_0x01e3:
            r8 = r26
            r6 = 2
            if (r2 != 0) goto L_0x01dd
            r9 = r37[r1]
            r10 = r38[r1]
            java.lang.String r11 = r8.f9379a
            boolean r12 = r8.f9387i
            boolean r13 = r8.f9381c
            if (r23 == 0) goto L_0x01f8
            r14 = 0
            r4 = r35
            goto L_0x01fd
        L_0x01f8:
            r4 = r35
            com.fyber.inneractive.sdk.player.c.i.e$a r2 = r4.f9374c
            r14 = r2
        L_0x01fd:
            com.fyber.inneractive.sdk.player.c.i.e r2 = m8619a(r9, r10, r11, r12, r13, r14)
            r24[r1] = r2
            r2 = r24[r1]
            if (r2 == 0) goto L_0x0209
            r2 = 1
            goto L_0x020a
        L_0x0209:
            r2 = 0
        L_0x020a:
            int r1 = r1 + 1
            r26 = r8
            goto L_0x01a2
        L_0x020f:
            r4 = r35
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p077i.C3466b.mo19297a(com.fyber.inneractive.sdk.player.c.o[], com.fyber.inneractive.sdk.player.c.g.i[], int[][][]):com.fyber.inneractive.sdk.player.c.i.e[]");
    }

    /* renamed from: a */
    private static int m8615a(C3460h hVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (m8625a(hVar.f9360b[intValue], str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: b */
    private static void m8626b(C3460h hVar, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            if (!m8625a(hVar.f9360b[intValue], str, iArr[intValue], i, i2, i3, i4)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: a */
    private static boolean m8625a(C3290h hVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m8622a(i, false) || (i & i2) == 0 || ((str != null && !C3560t.m8885a((Object) hVar.f8493f, (Object) str)) || ((hVar.f8497j != -1 && hVar.f8497j > i3) || ((hVar.f8498k != -1 && hVar.f8498k > i4) || (hVar.f8489b != -1 && hVar.f8489b > i5))))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r3.f8497j <= r22) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r3.f8498k <= r23) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r3.f8489b <= r24) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.fyber.inneractive.sdk.player.p059c.p077i.C3473e m8617a(com.fyber.inneractive.sdk.player.p059c.p074g.C3461i r20, int[][] r21, int r22, int r23, int r24, int r25, int r26, boolean r27, boolean r28, boolean r29) {
        /*
            r0 = r20
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0008:
            int r10 = r0.f9363b
            if (r4 >= r10) goto L_0x00d7
            com.fyber.inneractive.sdk.player.c.g.h[] r10 = r0.f9364c
            r10 = r10[r4]
            r11 = r25
            r12 = r26
            r13 = r27
            java.util.List r14 = m8621a(r10, r11, r12, r13)
            r15 = r21[r4]
            r1 = 0
        L_0x001d:
            int r3 = r10.f9359a
            if (r1 >= r3) goto L_0x00cf
            r3 = r15[r1]
            r2 = r29
            boolean r3 = m8622a((int) r3, (boolean) r2)
            if (r3 == 0) goto L_0x00c1
            com.fyber.inneractive.sdk.player.c.h[] r3 = r10.f9360b
            r3 = r3[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r14.contains(r0)
            r17 = 1
            if (r0 == 0) goto L_0x0067
            int r0 = r3.f8497j
            r2 = -1
            if (r0 == r2) goto L_0x0047
            int r0 = r3.f8497j
            r2 = r22
            if (r0 > r2) goto L_0x0067
            goto L_0x0049
        L_0x0047:
            r2 = r22
        L_0x0049:
            int r0 = r3.f8498k
            r2 = -1
            if (r0 == r2) goto L_0x0055
            int r0 = r3.f8498k
            r2 = r23
            if (r0 > r2) goto L_0x0067
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            int r0 = r3.f8489b
            r2 = -1
            if (r0 == r2) goto L_0x0063
            int r0 = r3.f8489b
            r2 = r24
            if (r0 > r2) goto L_0x0069
            goto L_0x0065
        L_0x0063:
            r2 = r24
        L_0x0065:
            r0 = 1
            goto L_0x006a
        L_0x0067:
            r2 = r24
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 != 0) goto L_0x006e
            if (r28 == 0) goto L_0x00c1
        L_0x006e:
            if (r0 == 0) goto L_0x0076
            r18 = 2
            r18 = r5
            r2 = 2
            goto L_0x0079
        L_0x0076:
            r18 = r5
            r2 = 1
        L_0x0079:
            r5 = r15[r1]
            r19 = r10
            r10 = 0
            boolean r5 = m8622a((int) r5, (boolean) r10)
            if (r5 == 0) goto L_0x0086
            int r2 = r2 + 1000
        L_0x0086:
            if (r2 <= r7) goto L_0x008b
            r16 = 1
            goto L_0x008d
        L_0x008b:
            r16 = 0
        L_0x008d:
            if (r2 != r7) goto L_0x00b2
            int r10 = r3.mo19087a()
            if (r10 == r8) goto L_0x009e
            int r10 = r3.mo19087a()
            int r10 = m8614a((int) r10, (int) r8)
            goto L_0x00a4
        L_0x009e:
            int r10 = r3.f8489b
            int r10 = m8614a((int) r10, (int) r9)
        L_0x00a4:
            if (r5 == 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            if (r10 <= 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ab:
            if (r10 >= 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r17 = 0
        L_0x00b0:
            r16 = r17
        L_0x00b2:
            if (r16 == 0) goto L_0x00c5
            int r0 = r3.f8489b
            int r3 = r3.mo19087a()
            r9 = r0
            r6 = r1
            r7 = r2
            r8 = r3
            r5 = r19
            goto L_0x00c7
        L_0x00c1:
            r18 = r5
            r19 = r10
        L_0x00c5:
            r5 = r18
        L_0x00c7:
            int r1 = r1 + 1
            r0 = r20
            r10 = r19
            goto L_0x001d
        L_0x00cf:
            r18 = r5
            int r4 = r4 + 1
            r0 = r20
            goto L_0x0008
        L_0x00d7:
            if (r5 != 0) goto L_0x00db
            r0 = 0
            return r0
        L_0x00db:
            com.fyber.inneractive.sdk.player.c.i.c r0 = new com.fyber.inneractive.sdk.player.c.i.c
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p077i.C3466b.m8617a(com.fyber.inneractive.sdk.player.c.g.i, int[][], int, int, int, int, int, boolean, boolean, boolean):com.fyber.inneractive.sdk.player.c.i.e");
    }

    /* renamed from: a */
    private static C3473e m8619a(C3461i iVar, int[][] iArr, String str, boolean z, boolean z2, C3473e.C3474a aVar) {
        int[] iArr2;
        int a;
        boolean z3;
        String str2;
        C3461i iVar2 = iVar;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < iVar2.f9363b; i4++) {
            C3460h hVar = iVar2.f9364c[i4];
            int[] iArr3 = iArr[i4];
            for (int i5 = 0; i5 < hVar.f9359a; i5++) {
                if (m8622a(iArr3[i5], z)) {
                    C3290h hVar2 = hVar.f9360b[i5];
                    int i6 = iArr3[i5];
                    if ((hVar2.f8511x & 1) != 0) {
                        str2 = str;
                        z3 = true;
                    } else {
                        str2 = str;
                        z3 = false;
                    }
                    int i7 = m8624a(hVar2, str2) ? z3 ? 4 : 3 : z3 ? 2 : 1;
                    if (m8622a(i6, false)) {
                        i7 += 1000;
                    }
                    if (i7 > i3) {
                        i = i4;
                        i2 = i5;
                        i3 = i7;
                    }
                } else {
                    String str3 = str;
                }
            }
            String str4 = str;
            boolean z4 = z;
        }
        if (i == -1) {
            return null;
        }
        C3460h hVar3 = iVar2.f9364c[i];
        if (aVar != null) {
            int[] iArr4 = iArr[i];
            HashSet hashSet = new HashSet();
            C3467a aVar2 = null;
            int i8 = 0;
            for (int i9 = 0; i9 < hVar3.f9359a; i9++) {
                C3290h hVar4 = hVar3.f9360b[i9];
                C3467a aVar3 = new C3467a(hVar4.f8505r, hVar4.f8506s, z2 ? null : hVar4.f8493f);
                if (hashSet.add(aVar3) && (a = m8616a(hVar3, iArr4, aVar3)) > i8) {
                    i8 = a;
                    aVar2 = aVar3;
                }
            }
            if (i8 > 1) {
                iArr2 = new int[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < hVar3.f9359a; i11++) {
                    if (m8623a(hVar3.f9360b[i11], iArr4[i11], aVar2)) {
                        iArr2[i10] = i11;
                        i10++;
                    }
                }
            } else {
                iArr2 = f9373b;
            }
            if (iArr2.length > 0) {
                return aVar.mo19304a();
            }
        }
        return new C3469c(hVar3, i2);
    }

    /* renamed from: a */
    private static int m8616a(C3460h hVar, int[] iArr, C3467a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < hVar.f9359a; i2++) {
            if (m8623a(hVar.f9360b[i2], iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m8623a(C3290h hVar, int i, C3467a aVar) {
        if (!m8622a(i, false) || hVar.f8505r != aVar.f9376a || hVar.f8506s != aVar.f9377b || (aVar.f9378c != null && !TextUtils.equals(aVar.f9378c, hVar.f8493f))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0072 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.fyber.inneractive.sdk.player.p059c.p077i.C3473e m8618a(com.fyber.inneractive.sdk.player.p059c.p074g.C3461i r18, int[][] r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            r0 = r18
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            int r7 = r0.f9363b
            if (r3 >= r7) goto L_0x007e
            com.fyber.inneractive.sdk.player.c.g.h[] r7 = r0.f9364c
            r7 = r7[r3]
            r8 = r19[r3]
            r9 = 0
        L_0x0013:
            int r10 = r7.f9359a
            if (r9 >= r10) goto L_0x0075
            r10 = r8[r9]
            r11 = r22
            boolean r10 = m8622a((int) r10, (boolean) r11)
            if (r10 == 0) goto L_0x006e
            com.fyber.inneractive.sdk.player.c.h[] r10 = r7.f9360b
            r10 = r10[r9]
            int r12 = r10.f8511x
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x002d
            r12 = 1
            goto L_0x002e
        L_0x002d:
            r12 = 0
        L_0x002e:
            int r14 = r10.f8511x
            r15 = 2
            r14 = r14 & r15
            if (r14 == 0) goto L_0x0039
            r14 = r20
            r16 = 1
            goto L_0x003d
        L_0x0039:
            r14 = r20
            r16 = 0
        L_0x003d:
            boolean r17 = m8624a((com.fyber.inneractive.sdk.player.p059c.C3290h) r10, (java.lang.String) r14)
            if (r17 == 0) goto L_0x004d
            if (r12 == 0) goto L_0x0047
            r13 = 6
            goto L_0x0050
        L_0x0047:
            if (r16 != 0) goto L_0x004b
            r13 = 5
            goto L_0x0050
        L_0x004b:
            r13 = 4
            goto L_0x0050
        L_0x004d:
            if (r12 == 0) goto L_0x0053
            r13 = 3
        L_0x0050:
            r12 = r21
            goto L_0x005e
        L_0x0053:
            r12 = r21
            if (r16 == 0) goto L_0x0072
            boolean r10 = m8624a((com.fyber.inneractive.sdk.player.p059c.C3290h) r10, (java.lang.String) r12)
            if (r10 == 0) goto L_0x005e
            r13 = 2
        L_0x005e:
            r10 = r8[r9]
            boolean r10 = m8622a((int) r10, (boolean) r2)
            if (r10 == 0) goto L_0x0068
            int r13 = r13 + 1000
        L_0x0068:
            if (r13 <= r6) goto L_0x0072
            r4 = r7
            r5 = r9
            r6 = r13
            goto L_0x0072
        L_0x006e:
            r14 = r20
            r12 = r21
        L_0x0072:
            int r9 = r9 + 1
            goto L_0x0013
        L_0x0075:
            r14 = r20
            r12 = r21
            r11 = r22
            int r3 = r3 + 1
            goto L_0x0008
        L_0x007e:
            if (r4 != 0) goto L_0x0081
            return r1
        L_0x0081:
            com.fyber.inneractive.sdk.player.c.i.c r0 = new com.fyber.inneractive.sdk.player.c.i.c
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p077i.C3466b.m8618a(com.fyber.inneractive.sdk.player.c.g.i, int[][], java.lang.String, java.lang.String, boolean):com.fyber.inneractive.sdk.player.c.i.e");
    }

    /* renamed from: a */
    private static C3473e m8620a(C3461i iVar, int[][] iArr, boolean z) {
        C3460h hVar = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iVar.f9363b; i3++) {
            C3460h hVar2 = iVar.f9364c[i3];
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < hVar2.f9359a; i4++) {
                if (m8622a(iArr2[i4], z)) {
                    int i5 = 1;
                    if ((hVar2.f9360b[i4].f8511x & 1) != 0) {
                        i5 = 2;
                    }
                    if (m8622a(iArr2[i4], false)) {
                        i5 += 1000;
                    }
                    if (i5 > i2) {
                        hVar = hVar2;
                        i = i4;
                        i2 = i5;
                    }
                }
            }
        }
        if (hVar == null) {
            return null;
        }
        return new C3469c(hVar, i);
    }

    /* renamed from: a */
    private static boolean m8624a(C3290h hVar, String str) {
        return str != null && TextUtils.equals(str, C3560t.m8890b(hVar.f8512y));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.Integer> m8621a(com.fyber.inneractive.sdk.player.p059c.p074g.C3460h r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f9359a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.f9359a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00ae
            if (r14 != r2) goto L_0x0020
            goto L_0x00ae
        L_0x0020:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0024:
            int r5 = r12.f9359a
            r6 = 1
            if (r3 >= r5) goto L_0x0088
            com.fyber.inneractive.sdk.player.c.h[] r5 = r12.f9360b
            r5 = r5[r3]
            int r7 = r5.f8497j
            if (r7 <= 0) goto L_0x0085
            int r7 = r5.f8498k
            if (r7 <= 0) goto L_0x0085
            int r7 = r5.f8497j
            int r8 = r5.f8498k
            if (r15 == 0) goto L_0x0049
            if (r7 <= r8) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r13 <= r14) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r9 == r6) goto L_0x0049
            r6 = r13
            r9 = r14
            goto L_0x004b
        L_0x0049:
            r9 = r13
            r6 = r14
        L_0x004b:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x005b
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8871a((int) r11, (int) r7)
            r6.<init>(r9, r7)
            goto L_0x0065
        L_0x005b:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8871a((int) r10, (int) r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x0065:
            int r7 = r5.f8497j
            int r8 = r5.f8498k
            int r7 = r7 * r8
            int r8 = r5.f8497j
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r8 < r9) goto L_0x0085
            int r5 = r5.f8498k
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x0085
            if (r7 >= r4) goto L_0x0085
            r4 = r7
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0088:
            if (r4 == r2) goto L_0x00ae
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x008f:
            if (r13 < 0) goto L_0x00ae
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.c.h[] r15 = r12.f9360b
            r14 = r15[r14]
            int r14 = r14.mo19087a()
            r15 = -1
            if (r14 == r15) goto L_0x00a8
            if (r14 <= r4) goto L_0x00ab
        L_0x00a8:
            r0.remove(r13)
        L_0x00ab:
            int r13 = r13 + -1
            goto L_0x008f
        L_0x00ae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p077i.C3466b.m8621a(com.fyber.inneractive.sdk.player.c.g.h, int, int, boolean):java.util.List");
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.b$a */
    private static final class C3467a {

        /* renamed from: a */
        public final int f9376a;

        /* renamed from: b */
        public final int f9377b;

        /* renamed from: c */
        public final String f9378c;

        public C3467a(int i, int i2, String str) {
            this.f9376a = i;
            this.f9377b = i2;
            this.f9378c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C3467a aVar = (C3467a) obj;
                return this.f9376a == aVar.f9376a && this.f9377b == aVar.f9377b && TextUtils.equals(this.f9378c, aVar.f9378c);
            }
        }

        public final int hashCode() {
            int i = ((this.f9376a * 31) + this.f9377b) * 31;
            String str = this.f9378c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }
}
