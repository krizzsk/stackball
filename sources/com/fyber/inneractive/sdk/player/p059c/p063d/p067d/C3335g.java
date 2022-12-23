package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3272j;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a;
import com.fyber.inneractive.sdk.player.p059c.p072f.C3417a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.g */
public final class C3335g implements C3268f, C3276m {

    /* renamed from: a */
    public static final C3271i f8771a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3335g()};
        }
    };

    /* renamed from: b */
    private static final int f8772b = C3560t.m8893e("qt  ");

    /* renamed from: c */
    private final C3548k f8773c = new C3548k(C3544i.f9604a);

    /* renamed from: d */
    private final C3548k f8774d = new C3548k(4);

    /* renamed from: e */
    private final C3548k f8775e = new C3548k(16);

    /* renamed from: f */
    private final Stack<C3317a.C3318a> f8776f = new Stack<>();

    /* renamed from: g */
    private int f8777g;

    /* renamed from: h */
    private int f8778h;

    /* renamed from: i */
    private long f8779i;

    /* renamed from: j */
    private int f8780j;

    /* renamed from: k */
    private C3548k f8781k;

    /* renamed from: l */
    private int f8782l;

    /* renamed from: m */
    private int f8783m;

    /* renamed from: n */
    private C3270h f8784n;

    /* renamed from: o */
    private C3337a[] f8785o;

    /* renamed from: p */
    private long f8786p;

    /* renamed from: q */
    private boolean f8787q;

    /* renamed from: b_ */
    public final boolean mo18995b_() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        return C3338h.m8263b(gVar);
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f8784n = hVar;
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f8776f.clear();
        this.f8780j = 0;
        this.f8782l = 0;
        this.f8783m = 0;
        if (j == 0) {
            m8252c();
            return;
        }
        C3337a[] aVarArr = this.f8785o;
        if (aVarArr != null) {
            for (C3337a aVar : aVarArr) {
                C3342l lVar = aVar.f8789b;
                int a = lVar.mo19135a(j2);
                if (a == -1) {
                    a = lVar.mo19136b(j2);
                }
                aVar.f8791d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x0196 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0193  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18998a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r24, com.fyber.inneractive.sdk.player.p059c.p063d.C3275l r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f8777g
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x0198
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0115
            if (r3 != r10) goto L_0x010f
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001d:
            com.fyber.inneractive.sdk.player.c.d.d.g$a[] r14 = r0.f8785o
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003b
            r14 = r14[r3]
            int r15 = r14.f8791d
            com.fyber.inneractive.sdk.player.c.d.d.l r11 = r14.f8789b
            int r11 = r11.f8826a
            if (r15 == r11) goto L_0x0038
            com.fyber.inneractive.sdk.player.c.d.d.l r11 = r14.f8789b
            long[] r11 = r11.f8827b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0038
            r5 = r3
            r12 = r14
        L_0x0038:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x003b:
            if (r5 != r4) goto L_0x003e
            return r4
        L_0x003e:
            r3 = r14[r5]
            com.fyber.inneractive.sdk.player.c.d.n r4 = r3.f8790c
            int r5 = r3.f8791d
            com.fyber.inneractive.sdk.player.c.d.d.l r11 = r3.f8789b
            long[] r11 = r11.f8827b
            r12 = r11[r5]
            com.fyber.inneractive.sdk.player.c.d.d.l r11 = r3.f8789b
            int[] r11 = r11.f8828c
            r11 = r11[r5]
            com.fyber.inneractive.sdk.player.c.d.d.i r14 = r3.f8788a
            int r14 = r14.f8799g
            if (r14 != r6) goto L_0x005b
            r14 = 8
            long r12 = r12 + r14
            int r11 = r11 + -8
        L_0x005b:
            long r14 = r24.mo19012c()
            long r14 = r12 - r14
            int r10 = r0.f8782l
            long r6 = (long) r10
            long r14 = r14 + r6
            r6 = 0
            int r10 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x010b
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0071
            goto L_0x010b
        L_0x0071:
            int r2 = (int) r14
            r1.mo19009b(r2)
            com.fyber.inneractive.sdk.player.c.d.d.i r2 = r3.f8788a
            int r2 = r2.f8803k
            if (r2 == 0) goto L_0x00d2
            com.fyber.inneractive.sdk.player.c.k.k r2 = r0.f8774d
            byte[] r2 = r2.f9625a
            r6 = 0
            r2[r6] = r6
            r7 = 1
            r2[r7] = r6
            r7 = 2
            r2[r7] = r6
            com.fyber.inneractive.sdk.player.c.d.d.i r2 = r3.f8788a
            int r2 = r2.f8803k
            com.fyber.inneractive.sdk.player.c.d.d.i r6 = r3.f8788a
            int r6 = r6.f8803k
            r7 = 4
            int r6 = 4 - r6
        L_0x0093:
            int r7 = r0.f8782l
            if (r7 >= r11) goto L_0x00e8
            int r7 = r0.f8783m
            if (r7 != 0) goto L_0x00c2
            com.fyber.inneractive.sdk.player.c.k.k r7 = r0.f8774d
            byte[] r7 = r7.f9625a
            r1.mo19010b(r7, r6, r2)
            com.fyber.inneractive.sdk.player.c.k.k r7 = r0.f8774d
            r8 = 0
            r7.mo19386c(r8)
            com.fyber.inneractive.sdk.player.c.k.k r7 = r0.f8774d
            int r7 = r7.mo19400n()
            r0.f8783m = r7
            com.fyber.inneractive.sdk.player.c.k.k r7 = r0.f8773c
            r7.mo19386c(r8)
            com.fyber.inneractive.sdk.player.c.k.k r7 = r0.f8773c
            r9 = 4
            r4.mo19041a(r7, r9)
            int r7 = r0.f8782l
            int r7 = r7 + r9
            r0.f8782l = r7
            int r11 = r11 + r6
            goto L_0x0093
        L_0x00c2:
            r8 = 0
            int r7 = r4.mo19035a(r1, r7, r8)
            int r8 = r0.f8782l
            int r8 = r8 + r7
            r0.f8782l = r8
            int r8 = r0.f8783m
            int r8 = r8 - r7
            r0.f8783m = r8
            goto L_0x0093
        L_0x00d2:
            int r2 = r0.f8782l
            if (r2 >= r11) goto L_0x00e8
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.mo19035a(r1, r2, r6)
            int r6 = r0.f8782l
            int r6 = r6 + r2
            r0.f8782l = r6
            int r6 = r0.f8783m
            int r6 = r6 - r2
            r0.f8783m = r6
            goto L_0x00d2
        L_0x00e8:
            r20 = r11
            com.fyber.inneractive.sdk.player.c.d.d.l r1 = r3.f8789b
            long[] r1 = r1.f8830e
            r17 = r1[r5]
            com.fyber.inneractive.sdk.player.c.d.d.l r1 = r3.f8789b
            int[] r1 = r1.f8831f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.mo19038a(r17, r19, r20, r21, r22)
            int r1 = r3.f8791d
            r4 = 1
            int r1 = r1 + r4
            r3.f8791d = r1
            r1 = 0
            r0.f8782l = r1
            r0.f8783m = r1
            return r1
        L_0x010b:
            r4 = 1
            r2.f8396a = r12
            return r4
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0115:
            long r3 = r0.f8779i
            int r6 = r0.f8780j
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r24.mo19012c()
            long r6 = r6 + r3
            com.fyber.inneractive.sdk.player.c.k.k r10 = r0.f8781k
            if (r10 == 0) goto L_0x0175
            byte[] r8 = r10.f9625a
            int r9 = r0.f8780j
            int r4 = (int) r3
            r1.mo19010b(r8, r9, r4)
            int r3 = r0.f8778h
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8586a
            if (r3 != r4) goto L_0x0158
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8781k
            r3.mo19386c(r5)
            int r4 = r3.mo19396j()
            int r5 = f8772b
            if (r4 != r5) goto L_0x0141
        L_0x013f:
            r3 = 1
            goto L_0x0155
        L_0x0141:
            r4 = 4
            r3.mo19388d(r4)
        L_0x0145:
            int r4 = r3.mo19383b()
            if (r4 <= 0) goto L_0x0154
            int r4 = r3.mo19396j()
            int r5 = f8772b
            if (r4 != r5) goto L_0x0145
            goto L_0x013f
        L_0x0154:
            r3 = 0
        L_0x0155:
            r0.f8787q = r3
            goto L_0x017d
        L_0x0158:
            java.util.Stack<com.fyber.inneractive.sdk.player.c.d.d.a$a> r3 = r0.f8776f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x017d
            java.util.Stack<com.fyber.inneractive.sdk.player.c.d.d.a$a> r3 = r0.f8776f
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.c.d.d.a$a r3 = (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3318a) r3
            com.fyber.inneractive.sdk.player.c.d.d.a$b r4 = new com.fyber.inneractive.sdk.player.c.d.d.a$b
            int r5 = r0.f8778h
            com.fyber.inneractive.sdk.player.c.k.k r8 = r0.f8781k
            r4.<init>(r5, r8)
            r3.mo19124a((com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b) r4)
            goto L_0x017d
        L_0x0175:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x017f
            int r4 = (int) r3
            r1.mo19009b(r4)
        L_0x017d:
            r3 = 0
            goto L_0x0187
        L_0x017f:
            long r8 = r24.mo19012c()
            long r8 = r8 + r3
            r2.f8396a = r8
            r3 = 1
        L_0x0187:
            r0.m8251b(r6)
            if (r3 == 0) goto L_0x0193
            int r3 = r0.f8777g
            r4 = 2
            if (r3 == r4) goto L_0x0193
            r7 = 1
            goto L_0x0194
        L_0x0193:
            r7 = 0
        L_0x0194:
            if (r7 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0198:
            r3 = 1
            int r6 = r0.f8780j
            if (r6 != 0) goto L_0x01c2
            com.fyber.inneractive.sdk.player.c.k.k r6 = r0.f8775e
            byte[] r6 = r6.f9625a
            r7 = 0
            boolean r6 = r1.mo19007a(r6, r7, r5, r3)
            if (r6 != 0) goto L_0x01ab
            r6 = 0
            goto L_0x02aa
        L_0x01ab:
            r0.f8780j = r5
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8775e
            r3.mo19386c(r7)
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8775e
            long r6 = r3.mo19394h()
            r0.f8779i = r6
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8775e
            int r3 = r3.mo19396j()
            r0.f8778h = r3
        L_0x01c2:
            long r6 = r0.f8779i
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01de
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8775e
            byte[] r3 = r3.f9625a
            r1.mo19010b(r3, r5, r5)
            int r3 = r0.f8780j
            int r3 = r3 + r5
            r0.f8780j = r3
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8775e
            long r6 = r3.mo19402p()
            r0.f8779i = r6
        L_0x01de:
            int r3 = r0.f8778h
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8561B
            if (r3 == r6) goto L_0x01fb
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8563D
            if (r3 == r6) goto L_0x01fb
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8564E
            if (r3 == r6) goto L_0x01fb
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8565F
            if (r3 == r6) goto L_0x01fb
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8566G
            if (r3 == r6) goto L_0x01fb
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8575P
            if (r3 != r6) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            r6 = 0
            goto L_0x01fc
        L_0x01fb:
            r6 = 1
        L_0x01fc:
            if (r6 == 0) goto L_0x0228
            long r5 = r24.mo19012c()
            long r7 = r0.f8779i
            long r5 = r5 + r7
            int r3 = r0.f8780j
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.fyber.inneractive.sdk.player.c.d.d.a$a> r3 = r0.f8776f
            com.fyber.inneractive.sdk.player.c.d.d.a$a r7 = new com.fyber.inneractive.sdk.player.c.d.d.a$a
            int r8 = r0.f8778h
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.f8779i
            int r3 = r0.f8780j
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0222
            r0.m8251b(r5)
            goto L_0x0225
        L_0x0222:
            r23.m8252c()
        L_0x0225:
            r3 = 1
            goto L_0x02a9
        L_0x0228:
            int r3 = r0.f8778h
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8577R
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8562C
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8578S
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8579T
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8614am
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8615an
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8616ao
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8576Q
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8617ap
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8618aq
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8619ar
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8620as
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8621at
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8574O
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8586a
            if (r3 == r6) goto L_0x026d
            int r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8587aA
            if (r3 != r6) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r6 = 0
            goto L_0x026e
        L_0x026d:
            r6 = 1
        L_0x026e:
            if (r6 == 0) goto L_0x02a3
            int r3 = r0.f8780j
            if (r3 != r5) goto L_0x0276
            r6 = 1
            goto L_0x0277
        L_0x0276:
            r6 = 0
        L_0x0277:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r6)
            long r6 = r0.f8779i
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0285
            r6 = 1
            goto L_0x0286
        L_0x0285:
            r6 = 0
        L_0x0286:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r6)
            com.fyber.inneractive.sdk.player.c.k.k r3 = new com.fyber.inneractive.sdk.player.c.k.k
            long r6 = r0.f8779i
            int r7 = (int) r6
            r3.<init>((int) r7)
            r0.f8781k = r3
            com.fyber.inneractive.sdk.player.c.k.k r3 = r0.f8775e
            byte[] r3 = r3.f9625a
            com.fyber.inneractive.sdk.player.c.k.k r6 = r0.f8781k
            byte[] r6 = r6.f9625a
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r6, r7, r5)
            r3 = 1
            r0.f8777g = r3
            goto L_0x02a9
        L_0x02a3:
            r3 = 1
            r5 = 0
            r0.f8781k = r5
            r0.f8777g = r3
        L_0x02a9:
            r6 = 1
        L_0x02aa:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3335g.mo18998a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    /* renamed from: b */
    public final long mo18994b() {
        return this.f8786p;
    }

    /* renamed from: a */
    public final long mo18993a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C3337a aVar : this.f8785o) {
            C3342l lVar = aVar.f8789b;
            int a = lVar.mo19135a(j);
            if (a == -1) {
                a = lVar.mo19136b(j);
            }
            long j3 = lVar.f8827b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: c */
    private void m8252c() {
        this.f8777g = 0;
        this.f8780j = 0;
    }

    /* renamed from: b */
    private void m8251b(long j) throws C3295l {
        int i;
        C3317a.C3318a aVar;
        C3272j jVar;
        C3339i a;
        long j2;
        C3337a aVar2;
        C3339i iVar;
        C3290h hVar;
        C3335g gVar = this;
        while (!gVar.f8776f.isEmpty() && gVar.f8776f.peek().f8654aQ == j) {
            C3317a.C3318a pop = gVar.f8776f.pop();
            if (pop.f8653aP == C3317a.f8561B) {
                long j3 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                C3417a aVar3 = null;
                C3272j jVar2 = new C3272j();
                C3317a.C3319b d = pop.mo19125d(C3317a.f8587aA);
                if (!(d == null || (aVar3 = C3320b.m8220a(d, gVar.f8787q)) == null)) {
                    jVar2.mo19060a(aVar3);
                }
                int i2 = 0;
                while (i2 < pop.f8656aS.size()) {
                    C3317a.C3318a aVar4 = pop.f8656aS.get(i2);
                    if (aVar4.f8653aP == C3317a.f8563D && (a = C3320b.m8218a(aVar4, pop.mo19125d(C3317a.f8562C), -9223372036854775807L, (C3227a) null, gVar.f8787q)) != null) {
                        C3342l a2 = C3320b.m8219a(a, aVar4.mo19126e(C3317a.f8564E).mo19126e(C3317a.f8565F).mo19126e(C3317a.f8566G), jVar2);
                        if (a2.f8826a != 0) {
                            C3337a aVar5 = new C3337a(a, a2, gVar.f8784n.mo19056a(i2));
                            int i3 = a2.f8829d + 30;
                            C3290h hVar2 = a.f8798f;
                            C3290h hVar3 = new C3290h(hVar2.f8488a, hVar2.f8492e, hVar2.f8493f, hVar2.f8490c, hVar2.f8489b, i3, hVar2.f8497j, hVar2.f8498k, hVar2.f8499l, hVar2.f8500m, hVar2.f8501n, hVar2.f8503p, hVar2.f8502o, hVar2.f8504q, hVar2.f8505r, hVar2.f8506s, hVar2.f8507t, hVar2.f8508u, hVar2.f8509v, hVar2.f8511x, hVar2.f8512y, hVar2.f8513z, hVar2.f8510w, hVar2.f8495h, hVar2.f8496i, hVar2.f8491d);
                            if (a.f8794b == 1) {
                                if (jVar2.mo19059a()) {
                                    hVar = new C3290h(hVar3.f8488a, hVar3.f8492e, hVar3.f8493f, hVar3.f8490c, hVar3.f8489b, hVar3.f8494g, hVar3.f8497j, hVar3.f8498k, hVar3.f8499l, hVar3.f8500m, hVar3.f8501n, hVar3.f8503p, hVar3.f8502o, hVar3.f8504q, hVar3.f8505r, hVar3.f8506s, hVar3.f8507t, jVar2.f8380b, jVar2.f8381c, hVar3.f8511x, hVar3.f8512y, hVar3.f8513z, hVar3.f8510w, hVar3.f8495h, hVar3.f8496i, hVar3.f8491d);
                                } else {
                                    hVar = hVar3;
                                }
                                if (aVar3 != null) {
                                    jVar = jVar2;
                                    C3290h hVar4 = hVar;
                                    aVar = pop;
                                    aVar2 = aVar5;
                                    iVar = a;
                                    i = i2;
                                    j2 = j3;
                                    hVar3 = new C3290h(hVar.f8488a, hVar.f8492e, hVar.f8493f, hVar.f8490c, hVar4.f8489b, hVar4.f8494g, hVar4.f8497j, hVar4.f8498k, hVar4.f8499l, hVar4.f8500m, hVar4.f8501n, hVar4.f8503p, hVar4.f8502o, hVar4.f8504q, hVar4.f8505r, hVar4.f8506s, hVar4.f8507t, hVar4.f8508u, hVar4.f8509v, hVar4.f8511x, hVar4.f8512y, hVar4.f8513z, hVar4.f8510w, hVar4.f8495h, hVar4.f8496i, aVar3);
                                } else {
                                    aVar = pop;
                                    j2 = j3;
                                    jVar = jVar2;
                                    aVar2 = aVar5;
                                    iVar = a;
                                    i = i2;
                                    hVar3 = hVar;
                                }
                            } else {
                                aVar = pop;
                                j2 = j3;
                                jVar = jVar2;
                                aVar2 = aVar5;
                                iVar = a;
                                i = i2;
                            }
                            aVar2.f8790c.mo19040a(hVar3);
                            long max = Math.max(j2, iVar.f8797e);
                            arrayList.add(aVar2);
                            j3 = max;
                            i2 = i + 1;
                            gVar = this;
                            jVar2 = jVar;
                            pop = aVar;
                        }
                    }
                    aVar = pop;
                    jVar = jVar2;
                    i = i2;
                    j3 = j3;
                    i2 = i + 1;
                    gVar = this;
                    jVar2 = jVar;
                    pop = aVar;
                }
                gVar.f8786p = j3;
                gVar.f8785o = (C3337a[]) arrayList.toArray(new C3337a[arrayList.size()]);
                gVar.f8784n.mo19058b();
                gVar.f8784n.mo19057a((C3276m) gVar);
                gVar.f8776f.clear();
                gVar.f8777g = 2;
            } else {
                C3317a.C3318a aVar6 = pop;
                if (!gVar.f8776f.isEmpty()) {
                    gVar.f8776f.peek().mo19123a(aVar6);
                }
            }
        }
        if (gVar.f8777g != 2) {
            m8252c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.g$a */
    private static final class C3337a {

        /* renamed from: a */
        public final C3339i f8788a;

        /* renamed from: b */
        public final C3342l f8789b;

        /* renamed from: c */
        public final C3278n f8790c;

        /* renamed from: d */
        public int f8791d;

        public C3337a(C3339i iVar, C3342l lVar, C3278n nVar) {
            this.f8788a = iVar;
            this.f8789b = lVar;
            this.f8790c = nVar;
        }
    }
}
