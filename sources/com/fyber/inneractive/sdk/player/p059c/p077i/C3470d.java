package com.fyber.inneractive.sdk.player.p059c.p077i;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.p059c.C3236d;
import com.fyber.inneractive.sdk.player.p059c.C3298o;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3461i;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3473e;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.c.i.d */
public abstract class C3470d extends C3476g {

    /* renamed from: b */
    private final SparseArray<Map<C3461i, C3472b>> f9393b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f9394c = new SparseBooleanArray();

    /* renamed from: d */
    private int f9395d = 0;

    /* renamed from: e */
    private C3471a f9396e;

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.d$b */
    public static final class C3472b {

        /* renamed from: a */
        public final C3473e.C3474a f9403a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3473e[] mo19297a(C3298o[] oVarArr, C3461i[] iVarArr, int[][][] iArr) throws C3236d;

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0186  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.player.p059c.p077i.C3478h mo19302a(com.fyber.inneractive.sdk.player.p059c.C3298o[] r19, com.fyber.inneractive.sdk.player.p059c.p074g.C3461i r20) throws com.fyber.inneractive.sdk.player.p059c.C3236d {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int r3 = r1.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r1.length
            int r5 = r5 + r4
            com.fyber.inneractive.sdk.player.c.g.h[][] r6 = new com.fyber.inneractive.sdk.player.p059c.p074g.C3460h[r5][]
            int r7 = r1.length
            int r7 = r7 + r4
            int[][][] r7 = new int[r7][][]
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0025
            int r9 = r2.f9363b
            com.fyber.inneractive.sdk.player.c.g.h[] r9 = new com.fyber.inneractive.sdk.player.p059c.p074g.C3460h[r9]
            r6[r8] = r9
            int r9 = r2.f9363b
            int[][] r9 = new int[r9][]
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0025:
            int r5 = r1.length
            int[] r11 = new int[r5]
            r8 = 0
        L_0x0029:
            if (r8 >= r5) goto L_0x0036
            r9 = r1[r8]
            int r9 = r9.mo18893m()
            r11[r8] = r9
            int r8 = r8 + 1
            goto L_0x0029
        L_0x0036:
            r5 = 0
        L_0x0037:
            int r8 = r2.f9363b
            if (r5 >= r8) goto L_0x0099
            com.fyber.inneractive.sdk.player.c.g.h[] r8 = r2.f9364c
            r8 = r8[r5]
            int r9 = r1.length
            r10 = 0
            r12 = 0
        L_0x0042:
            int r13 = r1.length
            if (r10 >= r13) goto L_0x0064
            r13 = r1[r10]
            r15 = 0
        L_0x0048:
            int r14 = r8.f9359a
            if (r15 >= r14) goto L_0x0060
            com.fyber.inneractive.sdk.player.c.h[] r14 = r8.f9360b
            r14 = r14[r15]
            int r14 = r13.mo19100a(r14)
            r4 = 3
            r14 = r14 & r4
            if (r14 <= r12) goto L_0x005c
            r9 = r10
            if (r14 == r4) goto L_0x0064
            r12 = r14
        L_0x005c:
            int r15 = r15 + 1
            r4 = 1
            goto L_0x0048
        L_0x0060:
            int r10 = r10 + 1
            r4 = 1
            goto L_0x0042
        L_0x0064:
            int r4 = r1.length
            if (r9 != r4) goto L_0x006c
            int r4 = r8.f9359a
            int[] r4 = new int[r4]
            goto L_0x0085
        L_0x006c:
            r4 = r1[r9]
            int r10 = r8.f9359a
            int[] r10 = new int[r10]
            r12 = 0
        L_0x0073:
            int r13 = r8.f9359a
            if (r12 >= r13) goto L_0x0084
            com.fyber.inneractive.sdk.player.c.h[] r13 = r8.f9360b
            r13 = r13[r12]
            int r13 = r4.mo19100a(r13)
            r10[r12] = r13
            int r12 = r12 + 1
            goto L_0x0073
        L_0x0084:
            r4 = r10
        L_0x0085:
            r10 = r3[r9]
            r12 = r6[r9]
            r12[r10] = r8
            r8 = r7[r9]
            r8[r10] = r4
            r4 = r3[r9]
            r8 = 1
            int r4 = r4 + r8
            r3[r9] = r4
            int r5 = r5 + 1
            r4 = 1
            goto L_0x0037
        L_0x0099:
            int r4 = r1.length
            com.fyber.inneractive.sdk.player.c.g.i[] r4 = new com.fyber.inneractive.sdk.player.p059c.p074g.C3461i[r4]
            int r5 = r1.length
            int[] r9 = new int[r5]
            r5 = 0
        L_0x00a0:
            int r8 = r1.length
            if (r5 >= r8) goto L_0x00c9
            r8 = r3[r5]
            com.fyber.inneractive.sdk.player.c.g.i r10 = new com.fyber.inneractive.sdk.player.c.g.i
            r12 = r6[r5]
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r8)
            com.fyber.inneractive.sdk.player.c.g.h[] r12 = (com.fyber.inneractive.sdk.player.p059c.p074g.C3460h[]) r12
            r10.<init>(r12)
            r4[r5] = r10
            r10 = r7[r5]
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r10, r8)
            int[][] r8 = (int[][]) r8
            r7[r5] = r8
            r8 = r1[r5]
            int r8 = r8.mo18872a()
            r9[r5] = r8
            int r5 = r5 + 1
            goto L_0x00a0
        L_0x00c9:
            int r5 = r1.length
            r3 = r3[r5]
            com.fyber.inneractive.sdk.player.c.g.i r13 = new com.fyber.inneractive.sdk.player.c.g.i
            int r5 = r1.length
            r5 = r6[r5]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r5, r3)
            com.fyber.inneractive.sdk.player.c.g.h[] r3 = (com.fyber.inneractive.sdk.player.p059c.p074g.C3460h[]) r3
            r13.<init>(r3)
            com.fyber.inneractive.sdk.player.c.i.e[] r3 = r0.mo19297a(r1, r4, r7)
            r5 = 0
        L_0x00df:
            int r6 = r1.length
            r14 = 0
            if (r5 >= r6) goto L_0x0121
            android.util.SparseBooleanArray r6 = r0.f9394c
            boolean r6 = r6.get(r5)
            if (r6 == 0) goto L_0x00ec
            goto L_0x011c
        L_0x00ec:
            r6 = r4[r5]
            android.util.SparseArray<java.util.Map<com.fyber.inneractive.sdk.player.c.g.i, com.fyber.inneractive.sdk.player.c.i.d$b>> r8 = r0.f9393b
            java.lang.Object r8 = r8.get(r5)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x0100
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L_0x0100
            r8 = 1
            goto L_0x0101
        L_0x0100:
            r8 = 0
        L_0x0101:
            if (r8 == 0) goto L_0x011e
            android.util.SparseArray<java.util.Map<com.fyber.inneractive.sdk.player.c.g.i, com.fyber.inneractive.sdk.player.c.i.d$b>> r8 = r0.f9393b
            java.lang.Object r8 = r8.get(r5)
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r8 = r8.get(r6)
            com.fyber.inneractive.sdk.player.c.i.d$b r8 = (com.fyber.inneractive.sdk.player.p059c.p077i.C3470d.C3472b) r8
            if (r8 != 0) goto L_0x0114
            goto L_0x011c
        L_0x0114:
            com.fyber.inneractive.sdk.player.c.i.e$a r8 = r8.f9403a
            com.fyber.inneractive.sdk.player.c.g.h[] r6 = r6.f9364c
            com.fyber.inneractive.sdk.player.c.i.e r14 = r8.mo19304a()
        L_0x011c:
            r3[r5] = r14
        L_0x011e:
            int r5 = r5 + 1
            goto L_0x00df
        L_0x0121:
            com.fyber.inneractive.sdk.player.c.i.d$a r5 = new com.fyber.inneractive.sdk.player.c.i.d$a
            r8 = r5
            r10 = r4
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            int r6 = r1.length
            com.fyber.inneractive.sdk.player.c.p[] r6 = new com.fyber.inneractive.sdk.player.p059c.C3299p[r6]
            r8 = 0
        L_0x012d:
            int r9 = r1.length
            if (r8 >= r9) goto L_0x013d
            r9 = r3[r8]
            if (r9 == 0) goto L_0x0137
            com.fyber.inneractive.sdk.player.c.p r9 = com.fyber.inneractive.sdk.player.p059c.C3299p.f8522a
            goto L_0x0138
        L_0x0137:
            r9 = r14
        L_0x0138:
            r6[r8] = r9
            int r8 = r8 + 1
            goto L_0x012d
        L_0x013d:
            int r8 = r0.f9395d
            if (r8 == 0) goto L_0x01b8
            r10 = 0
            r11 = -1
            r12 = -1
        L_0x0144:
            int r13 = r1.length
            if (r10 >= r13) goto L_0x019f
            r13 = r1[r10]
            int r13 = r13.mo18872a()
            r14 = r3[r10]
            r15 = 1
            if (r13 == r15) goto L_0x0155
            r15 = 2
            if (r13 != r15) goto L_0x0196
        L_0x0155:
            if (r14 == 0) goto L_0x0196
            r15 = r7[r10]
            r9 = r4[r10]
            if (r14 != 0) goto L_0x015f
        L_0x015d:
            r0 = 0
            goto L_0x0184
        L_0x015f:
            com.fyber.inneractive.sdk.player.c.g.h r0 = r14.mo19289a()
            int r0 = r9.mo19286a(r0)
            r9 = 0
        L_0x0168:
            int r1 = r14.mo19291b()
            if (r9 >= r1) goto L_0x0183
            r1 = r15[r0]
            int r17 = r14.mo19292b(r9)
            r1 = r1[r17]
            r17 = r0
            r0 = 16
            r1 = r1 & r0
            if (r1 == r0) goto L_0x017e
            goto L_0x015d
        L_0x017e:
            int r9 = r9 + 1
            r0 = r17
            goto L_0x0168
        L_0x0183:
            r0 = 1
        L_0x0184:
            if (r0 == 0) goto L_0x0196
            r0 = 1
            if (r13 != r0) goto L_0x018f
            r1 = -1
            if (r12 == r1) goto L_0x018d
            goto L_0x0192
        L_0x018d:
            r12 = r10
            goto L_0x0198
        L_0x018f:
            r1 = -1
            if (r11 == r1) goto L_0x0194
        L_0x0192:
            r4 = 0
            goto L_0x01a2
        L_0x0194:
            r11 = r10
            goto L_0x0198
        L_0x0196:
            r0 = 1
            r1 = -1
        L_0x0198:
            int r10 = r10 + 1
            r0 = r18
            r1 = r19
            goto L_0x0144
        L_0x019f:
            r0 = 1
            r1 = -1
            r4 = 1
        L_0x01a2:
            if (r12 == r1) goto L_0x01a9
            if (r11 == r1) goto L_0x01a9
            r16 = 1
            goto L_0x01ab
        L_0x01a9:
            r16 = 0
        L_0x01ab:
            r0 = r4 & r16
            if (r0 == 0) goto L_0x01b8
            com.fyber.inneractive.sdk.player.c.p r0 = new com.fyber.inneractive.sdk.player.c.p
            r0.<init>(r8)
            r6[r12] = r0
            r6[r11] = r0
        L_0x01b8:
            com.fyber.inneractive.sdk.player.c.i.h r0 = new com.fyber.inneractive.sdk.player.c.i.h
            com.fyber.inneractive.sdk.player.c.i.f r1 = new com.fyber.inneractive.sdk.player.c.i.f
            r1.<init>(r3)
            r0.<init>(r2, r1, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p077i.C3470d.mo19302a(com.fyber.inneractive.sdk.player.c.o[], com.fyber.inneractive.sdk.player.c.g.i):com.fyber.inneractive.sdk.player.c.i.h");
    }

    /* renamed from: a */
    public final void mo19303a(Object obj) {
        this.f9396e = (C3471a) obj;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.i.d$a */
    public static final class C3471a {

        /* renamed from: a */
        public final int f9397a;

        /* renamed from: b */
        private final int[] f9398b;

        /* renamed from: c */
        private final C3461i[] f9399c;

        /* renamed from: d */
        private final int[] f9400d;

        /* renamed from: e */
        private final int[][][] f9401e;

        /* renamed from: f */
        private final C3461i f9402f;

        C3471a(int[] iArr, C3461i[] iVarArr, int[] iArr2, int[][][] iArr3, C3461i iVar) {
            this.f9398b = iArr;
            this.f9399c = iVarArr;
            this.f9401e = iArr3;
            this.f9400d = iArr2;
            this.f9402f = iVar;
            this.f9397a = iVarArr.length;
        }
    }
}
