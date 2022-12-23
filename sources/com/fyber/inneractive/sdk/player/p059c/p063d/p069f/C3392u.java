package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.u */
public final class C3392u implements C3268f {

    /* renamed from: a */
    public static final C3271i f9141a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3392u()};
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final long f9142b = ((long) C3560t.m8893e("AC-3"));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final long f9143c = ((long) C3560t.m8893e("EAC3"));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final long f9144d = ((long) C3560t.m8893e("HEVC"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f9145e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<C3558r> f9146f;

    /* renamed from: g */
    private final C3548k f9147g;

    /* renamed from: h */
    private final SparseIntArray f9148h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3396v.C3399c f9149i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SparseArray<C3396v> f9150j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final SparseBooleanArray f9151k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C3270h f9152l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f9153m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f9154n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3396v f9155o;

    /* renamed from: b */
    static /* synthetic */ int m8433b(C3392u uVar) {
        int i = uVar.f9153m;
        uVar.f9153m = i + 1;
        return i;
    }

    public C3392u() {
        this((byte) 0);
    }

    private C3392u(byte b) {
        this(1, 0);
    }

    public C3392u(int i, int i2) {
        this(i, new C3558r(0), new C3370e(i2));
    }

    private C3392u(int i, C3558r rVar, C3396v.C3399c cVar) {
        this.f9149i = (C3396v.C3399c) C3535a.m8781a(cVar);
        this.f9145e = i;
        if (i == 1 || i == 2) {
            this.f9146f = Collections.singletonList(rVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f9146f = arrayList;
            arrayList.add(rVar);
        }
        this.f9147g = new C3548k(940);
        this.f9151k = new SparseBooleanArray();
        this.f9150j = new SparseArray<>();
        this.f9148h = new SparseIntArray();
        m8438d();
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        byte[] bArr = this.f9147g.f9625a;
        gVar.mo19014c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * TsExtractor.TS_PACKET_SIZE) + i] == 71) {
                    i2++;
                } else {
                    i++;
                }
            }
            gVar.mo19009b(i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f9152l = hVar;
        hVar.mo19057a((C3276m) new C3276m.C3277a(-9223372036854775807L));
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        int size = this.f9146f.size();
        for (int i = 0; i < size; i++) {
            this.f9146f.get(i).f9653b = -9223372036854775807L;
        }
        this.f9147g.mo19378a();
        this.f9148h.clear();
        m8438d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r11 != ((r7 + 1) & 15)) goto L_0x00af;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18998a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r10, com.fyber.inneractive.sdk.player.p059c.p063d.C3275l r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.c.k.k r11 = r9.f9147g
            byte[] r11 = r11.f9625a
            com.fyber.inneractive.sdk.player.c.k.k r0 = r9.f9147g
            int r0 = r0.f9626b
            int r0 = 940 - r0
            r1 = 188(0xbc, float:2.63E-43)
            r2 = 0
            if (r0 >= r1) goto L_0x0023
            com.fyber.inneractive.sdk.player.c.k.k r0 = r9.f9147g
            int r0 = r0.mo19383b()
            if (r0 <= 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.c.k.k r3 = r9.f9147g
            int r3 = r3.f9626b
            java.lang.System.arraycopy(r11, r3, r11, r2, r0)
        L_0x001e:
            com.fyber.inneractive.sdk.player.c.k.k r3 = r9.f9147g
            r3.mo19381a((byte[]) r11, (int) r0)
        L_0x0023:
            com.fyber.inneractive.sdk.player.c.k.k r0 = r9.f9147g
            int r0 = r0.mo19383b()
            if (r0 >= r1) goto L_0x0040
            com.fyber.inneractive.sdk.player.c.k.k r0 = r9.f9147g
            int r0 = r0.f9627c
            int r3 = 940 - r0
            int r3 = r10.mo19005a(r11, r0, r3)
            r4 = -1
            if (r3 != r4) goto L_0x0039
            return r4
        L_0x0039:
            com.fyber.inneractive.sdk.player.c.k.k r4 = r9.f9147g
            int r0 = r0 + r3
            r4.mo19384b(r0)
            goto L_0x0023
        L_0x0040:
            com.fyber.inneractive.sdk.player.c.k.k r10 = r9.f9147g
            int r10 = r10.f9627c
            com.fyber.inneractive.sdk.player.c.k.k r0 = r9.f9147g
            int r0 = r0.f9626b
        L_0x0048:
            if (r0 >= r10) goto L_0x0053
            byte r3 = r11[r0]
            r4 = 71
            if (r3 == r4) goto L_0x0053
            int r0 = r0 + 1
            goto L_0x0048
        L_0x0053:
            com.fyber.inneractive.sdk.player.c.k.k r11 = r9.f9147g
            r11.mo19386c(r0)
            int r0 = r0 + r1
            if (r0 <= r10) goto L_0x005c
            return r2
        L_0x005c:
            com.fyber.inneractive.sdk.player.c.k.k r11 = r9.f9147g
            int r11 = r11.mo19396j()
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x006d
            com.fyber.inneractive.sdk.player.c.k.k r10 = r9.f9147g
            r10.mo19386c(r0)
            return r2
        L_0x006d:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r11
            r3 = 1
            if (r1 == 0) goto L_0x0075
            r1 = 1
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            r4 = 2096896(0x1fff00, float:2.938377E-39)
            r4 = r4 & r11
            int r4 = r4 >> 8
            r5 = r11 & 32
            if (r5 == 0) goto L_0x0082
            r5 = 1
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0089
            r6 = 1
            goto L_0x008a
        L_0x0089:
            r6 = 0
        L_0x008a:
            int r7 = r9.f9145e
            r8 = 2
            if (r7 == r8) goto L_0x00ae
            r11 = r11 & 15
            android.util.SparseIntArray r7 = r9.f9148h
            int r8 = r11 + -1
            int r7 = r7.get(r4, r8)
            android.util.SparseIntArray r8 = r9.f9148h
            r8.put(r4, r11)
            if (r7 != r11) goto L_0x00a8
            if (r6 == 0) goto L_0x00ae
            com.fyber.inneractive.sdk.player.c.k.k r10 = r9.f9147g
            r10.mo19386c(r0)
            return r2
        L_0x00a8:
            int r7 = r7 + r3
            r7 = r7 & 15
            if (r11 == r7) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r5 == 0) goto L_0x00bc
            com.fyber.inneractive.sdk.player.c.k.k r11 = r9.f9147g
            int r11 = r11.mo19387d()
            com.fyber.inneractive.sdk.player.c.k.k r5 = r9.f9147g
            r5.mo19388d(r11)
        L_0x00bc:
            if (r6 == 0) goto L_0x00dc
            android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.f.v> r11 = r9.f9150j
            java.lang.Object r11 = r11.get(r4)
            com.fyber.inneractive.sdk.player.c.d.f.v r11 = (com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v) r11
            if (r11 == 0) goto L_0x00dc
            if (r3 == 0) goto L_0x00cd
            r11.mo19174a()
        L_0x00cd:
            com.fyber.inneractive.sdk.player.c.k.k r3 = r9.f9147g
            r3.mo19384b(r0)
            com.fyber.inneractive.sdk.player.c.k.k r3 = r9.f9147g
            r11.mo19175a(r3, r1)
            com.fyber.inneractive.sdk.player.c.k.k r11 = r9.f9147g
            r11.mo19384b(r10)
        L_0x00dc:
            com.fyber.inneractive.sdk.player.c.k.k r10 = r9.f9147g
            r10.mo19386c(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.mo18998a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    /* renamed from: d */
    private void m8438d() {
        this.f9151k.clear();
        this.f9150j.clear();
        SparseArray<C3396v> a = this.f9149i.mo19162a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f9150j.put(a.keyAt(i), a.valueAt(i));
        }
        this.f9150j.put(0, new C3389r(new C3394a()));
        this.f9155o = null;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.u$a */
    private class C3394a implements C3388q {

        /* renamed from: b */
        private final C3547j f9157b = new C3547j(new byte[4]);

        /* renamed from: a */
        public final void mo19178a(C3558r rVar, C3270h hVar, C3396v.C3400d dVar) {
        }

        public C3394a() {
        }

        /* renamed from: a */
        public final void mo19177a(C3548k kVar) {
            if (kVar.mo19387d() == 0) {
                kVar.mo19388d(7);
                int b = kVar.mo19383b() / 4;
                for (int i = 0; i < b; i++) {
                    kVar.mo19380a(this.f9157b, 4);
                    int c = this.f9157b.mo19377c(16);
                    this.f9157b.mo19376b(3);
                    if (c == 0) {
                        this.f9157b.mo19376b(13);
                    } else {
                        int c2 = this.f9157b.mo19377c(13);
                        C3392u.this.f9150j.put(c2, new C3389r(new C3395b(c2)));
                        C3392u.m8433b(C3392u.this);
                    }
                }
                if (C3392u.this.f9145e != 2) {
                    C3392u.this.f9150j.remove(0);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.u$b */
    private class C3395b implements C3388q {

        /* renamed from: b */
        private final C3547j f9159b = new C3547j(new byte[5]);

        /* renamed from: c */
        private final SparseArray<C3396v> f9160c = new SparseArray<>();

        /* renamed from: d */
        private final SparseIntArray f9161d = new SparseIntArray();

        /* renamed from: e */
        private final int f9162e;

        /* renamed from: a */
        public final void mo19178a(C3558r rVar, C3270h hVar, C3396v.C3400d dVar) {
        }

        public C3395b(int i) {
            this.f9162e = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0220 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0213  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19177a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                int r2 = r27.mo19387d()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                com.fyber.inneractive.sdk.player.c.d.f.u r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r2 = r2.f9145e
                r4 = 1
                r5 = 0
                if (r2 == r4) goto L_0x0044
                com.fyber.inneractive.sdk.player.c.d.f.u r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r2 = r2.f9145e
                if (r2 == r3) goto L_0x0044
                com.fyber.inneractive.sdk.player.c.d.f.u r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r2 = r2.f9153m
                if (r2 != r4) goto L_0x0027
                goto L_0x0044
            L_0x0027:
                com.fyber.inneractive.sdk.player.c.k.r r2 = new com.fyber.inneractive.sdk.player.c.k.r
                com.fyber.inneractive.sdk.player.c.d.f.u r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                java.util.List r6 = r6.f9146f
                java.lang.Object r6 = r6.get(r5)
                com.fyber.inneractive.sdk.player.c.k.r r6 = (com.fyber.inneractive.sdk.player.p059c.p080k.C3558r) r6
                long r6 = r6.f9652a
                r2.<init>(r6)
                com.fyber.inneractive.sdk.player.c.d.f.u r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                java.util.List r6 = r6.f9146f
                r6.add(r2)
                goto L_0x0050
            L_0x0044:
                com.fyber.inneractive.sdk.player.c.d.f.u r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                java.util.List r2 = r2.f9146f
                java.lang.Object r2 = r2.get(r5)
                com.fyber.inneractive.sdk.player.c.k.r r2 = (com.fyber.inneractive.sdk.player.p059c.p080k.C3558r) r2
            L_0x0050:
                r1.mo19388d(r3)
                int r6 = r27.mo19389e()
                r7 = 5
                r1.mo19388d(r7)
                com.fyber.inneractive.sdk.player.c.k.j r8 = r0.f9159b
                r1.mo19380a((com.fyber.inneractive.sdk.player.p059c.p080k.C3547j) r8, (int) r3)
                com.fyber.inneractive.sdk.player.c.k.j r8 = r0.f9159b
                r9 = 4
                r8.mo19376b(r9)
                com.fyber.inneractive.sdk.player.c.k.j r8 = r0.f9159b
                r10 = 12
                int r8 = r8.mo19377c(r10)
                r1.mo19388d(r8)
                com.fyber.inneractive.sdk.player.c.d.f.u r8 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r8 = r8.f9145e
                r11 = 8192(0x2000, float:1.14794E-41)
                r12 = 0
                r13 = 21
                if (r8 != r3) goto L_0x00ae
                com.fyber.inneractive.sdk.player.c.d.f.u r8 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.f.v r8 = r8.f9155o
                if (r8 != 0) goto L_0x00ae
                com.fyber.inneractive.sdk.player.c.d.f.v$b r8 = new com.fyber.inneractive.sdk.player.c.d.f.v$b
                byte[] r14 = new byte[r5]
                r8.<init>(r13, r12, r12, r14)
                com.fyber.inneractive.sdk.player.c.d.f.u r14 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.f.v$c r15 = r14.f9149i
                com.fyber.inneractive.sdk.player.c.d.f.v r8 = r15.mo19163a(r13, r8)
                com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v unused = r14.f9155o = r8
                com.fyber.inneractive.sdk.player.c.d.f.u r8 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.f.v r8 = r8.f9155o
                com.fyber.inneractive.sdk.player.c.d.f.u r14 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.h r14 = r14.f9152l
                com.fyber.inneractive.sdk.player.c.d.f.v$d r15 = new com.fyber.inneractive.sdk.player.c.d.f.v$d
                r15.<init>(r6, r13, r11)
                r8.mo19176a(r2, r14, r15)
            L_0x00ae:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.f.v> r8 = r0.f9160c
                r8.clear()
                android.util.SparseIntArray r8 = r0.f9161d
                r8.clear()
                int r8 = r27.mo19383b()
            L_0x00bc:
                if (r8 <= 0) goto L_0x0232
                com.fyber.inneractive.sdk.player.c.k.j r14 = r0.f9159b
                r1.mo19380a((com.fyber.inneractive.sdk.player.p059c.p080k.C3547j) r14, (int) r7)
                com.fyber.inneractive.sdk.player.c.k.j r14 = r0.f9159b
                r15 = 8
                int r14 = r14.mo19377c(r15)
                com.fyber.inneractive.sdk.player.c.k.j r15 = r0.f9159b
                r12 = 3
                r15.mo19376b(r12)
                com.fyber.inneractive.sdk.player.c.k.j r15 = r0.f9159b
                r4 = 13
                int r4 = r15.mo19377c(r4)
                com.fyber.inneractive.sdk.player.c.k.j r15 = r0.f9159b
                r15.mo19376b(r9)
                com.fyber.inneractive.sdk.player.c.k.j r15 = r0.f9159b
                int r15 = r15.mo19377c(r10)
                int r10 = r1.f9626b
                int r11 = r10 + r15
                r16 = -1
                r3 = 0
                r13 = -1
                r17 = 0
            L_0x00ee:
                int r5 = r1.f9626b
                if (r5 >= r11) goto L_0x01ac
                int r5 = r27.mo19387d()
                int r18 = r27.mo19387d()
                int r9 = r1.f9626b
                int r9 = r9 + r18
                r12 = 89
                r20 = 135(0x87, float:1.89E-43)
                r21 = 129(0x81, float:1.81E-43)
                if (r5 != r7) goto L_0x012d
                long r22 = r27.mo19394h()
                long r24 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.f9142b
                int r5 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
                if (r5 != 0) goto L_0x0113
                goto L_0x0131
            L_0x0113:
                long r24 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.f9143c
                int r5 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
                if (r5 != 0) goto L_0x011c
                goto L_0x013d
            L_0x011c:
                long r20 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.f9144d
                int r5 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
                if (r5 != 0) goto L_0x0126
                r13 = 36
            L_0x0126:
                r19 = r2
                r21 = r6
                r12 = 4
                goto L_0x019d
            L_0x012d:
                r7 = 106(0x6a, float:1.49E-43)
                if (r5 != r7) goto L_0x0139
            L_0x0131:
                r19 = r2
                r21 = r6
                r12 = 4
                r13 = 129(0x81, float:1.81E-43)
                goto L_0x019d
            L_0x0139:
                r7 = 122(0x7a, float:1.71E-43)
                if (r5 != r7) goto L_0x0145
            L_0x013d:
                r19 = r2
                r21 = r6
                r12 = 4
                r13 = 135(0x87, float:1.89E-43)
                goto L_0x019d
            L_0x0145:
                r7 = 123(0x7b, float:1.72E-43)
                if (r5 != r7) goto L_0x0153
                r5 = 138(0x8a, float:1.93E-43)
                r19 = r2
                r21 = r6
                r12 = 4
                r13 = 138(0x8a, float:1.93E-43)
                goto L_0x019d
            L_0x0153:
                r7 = 10
                if (r5 != r7) goto L_0x0161
                r7 = 3
                java.lang.String r3 = r1.mo19390e(r7)
                java.lang.String r3 = r3.trim()
                goto L_0x0126
            L_0x0161:
                r7 = 3
                if (r5 != r12) goto L_0x0126
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x0169:
                int r13 = r1.f9626b
                if (r13 >= r9) goto L_0x0194
                java.lang.String r13 = r1.mo19390e(r7)
                java.lang.String r13 = r13.trim()
                int r7 = r27.mo19387d()
                r19 = r2
                r12 = 4
                byte[] r2 = new byte[r12]
                r21 = r6
                r6 = 0
                r1.mo19382a(r2, r6, r12)
                com.fyber.inneractive.sdk.player.c.d.f.v$a r6 = new com.fyber.inneractive.sdk.player.c.d.f.v$a
                r6.<init>(r13, r7, r2)
                r5.add(r6)
                r2 = r19
                r6 = r21
                r7 = 3
                r12 = 89
                goto L_0x0169
            L_0x0194:
                r19 = r2
                r21 = r6
                r12 = 4
                r17 = r5
                r13 = 89
            L_0x019d:
                int r2 = r1.f9626b
                int r9 = r9 - r2
                r1.mo19388d(r9)
                r2 = r19
                r6 = r21
                r7 = 5
                r9 = 4
                r12 = 3
                goto L_0x00ee
            L_0x01ac:
                r19 = r2
                r21 = r6
                r12 = 4
                r1.mo19386c(r11)
                com.fyber.inneractive.sdk.player.c.d.f.v$b r2 = new com.fyber.inneractive.sdk.player.c.d.f.v$b
                byte[] r5 = r1.f9625a
                byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r11)
                r6 = r17
                r2.<init>(r13, r3, r6, r5)
                r3 = 6
                if (r14 != r3) goto L_0x01c6
                int r14 = r2.f9166a
            L_0x01c6:
                int r15 = r15 + 5
                int r8 = r8 - r15
                com.fyber.inneractive.sdk.player.c.d.f.u r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r3 = r3.f9145e
                r5 = 2
                if (r3 != r5) goto L_0x01d4
                r3 = r14
                goto L_0x01d5
            L_0x01d4:
                r3 = r4
            L_0x01d5:
                com.fyber.inneractive.sdk.player.c.d.f.u r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                android.util.SparseBooleanArray r6 = r6.f9151k
                boolean r6 = r6.get(r3)
                if (r6 != 0) goto L_0x021e
                com.fyber.inneractive.sdk.player.c.d.f.u r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r6 = r6.f9145e
                if (r6 != r5) goto L_0x01f4
                r5 = 21
                if (r14 != r5) goto L_0x01f6
                com.fyber.inneractive.sdk.player.c.d.f.u r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.f.v r2 = r2.f9155o
                goto L_0x0200
            L_0x01f4:
                r5 = 21
            L_0x01f6:
                com.fyber.inneractive.sdk.player.c.d.f.u r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.f.v$c r6 = r6.f9149i
                com.fyber.inneractive.sdk.player.c.d.f.v r2 = r6.mo19163a(r14, r2)
            L_0x0200:
                com.fyber.inneractive.sdk.player.c.d.f.u r6 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r6 = r6.f9145e
                r7 = 2
                if (r6 != r7) goto L_0x0213
                android.util.SparseIntArray r6 = r0.f9161d
                r7 = 8192(0x2000, float:1.14794E-41)
                int r6 = r6.get(r3, r7)
                if (r4 >= r6) goto L_0x0220
            L_0x0213:
                android.util.SparseIntArray r6 = r0.f9161d
                r6.put(r3, r4)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.f.v> r4 = r0.f9160c
                r4.put(r3, r2)
                goto L_0x0220
            L_0x021e:
                r5 = 21
            L_0x0220:
                r2 = r19
                r6 = r21
                r3 = 2
                r4 = 1
                r5 = 0
                r7 = 5
                r9 = 4
                r10 = 12
                r11 = 8192(0x2000, float:1.14794E-41)
                r12 = 0
                r13 = 21
                goto L_0x00bc
            L_0x0232:
                r19 = r2
                r21 = r6
                android.util.SparseIntArray r1 = r0.f9161d
                int r1 = r1.size()
                r6 = 0
            L_0x023d:
                if (r6 >= r1) goto L_0x0299
                android.util.SparseIntArray r2 = r0.f9161d
                int r2 = r2.keyAt(r6)
                com.fyber.inneractive.sdk.player.c.d.f.u r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                android.util.SparseBooleanArray r3 = r3.f9151k
                r4 = 1
                r3.put(r2, r4)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.f.v> r3 = r0.f9160c
                java.lang.Object r3 = r3.valueAt(r6)
                com.fyber.inneractive.sdk.player.c.d.f.v r3 = (com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v) r3
                if (r3 == 0) goto L_0x028c
                com.fyber.inneractive.sdk.player.c.d.f.u r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.f.v r4 = r4.f9155o
                if (r3 == r4) goto L_0x0276
                com.fyber.inneractive.sdk.player.c.d.f.u r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.h r4 = r4.f9152l
                com.fyber.inneractive.sdk.player.c.d.f.v$d r5 = new com.fyber.inneractive.sdk.player.c.d.f.v$d
                r7 = r21
                r8 = 8192(0x2000, float:1.14794E-41)
                r5.<init>(r7, r2, r8)
                r2 = r19
                r3.mo19176a(r2, r4, r5)
                goto L_0x027c
            L_0x0276:
                r2 = r19
                r7 = r21
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x027c:
                com.fyber.inneractive.sdk.player.c.d.f.u r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                android.util.SparseArray r4 = r4.f9150j
                android.util.SparseIntArray r5 = r0.f9161d
                int r5 = r5.valueAt(r6)
                r4.put(r5, r3)
                goto L_0x0292
            L_0x028c:
                r2 = r19
                r7 = r21
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x0292:
                int r6 = r6 + 1
                r19 = r2
                r21 = r7
                goto L_0x023d
            L_0x0299:
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r1 = r1.f9145e
                r2 = 2
                if (r1 != r2) goto L_0x02bf
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                boolean r1 = r1.f9154n
                if (r1 != 0) goto L_0x02f7
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.h r1 = r1.f9152l
                r1.mo19058b()
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                r2 = 0
                int unused = r1.f9153m = r2
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                boolean unused = r1.f9154n = true
                return
            L_0x02bf:
                r2 = 0
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                android.util.SparseArray r1 = r1.f9150j
                int r3 = r0.f9162e
                r1.remove(r3)
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r3 = r1.f9145e
                r4 = 1
                if (r3 != r4) goto L_0x02d6
                r5 = 0
                goto L_0x02de
            L_0x02d6:
                com.fyber.inneractive.sdk.player.c.d.f.u r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r2 = r2.f9153m
                int r5 = r2 + -1
            L_0x02de:
                int unused = r1.f9153m = r5
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                int r1 = r1.f9153m
                if (r1 != 0) goto L_0x02f7
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                com.fyber.inneractive.sdk.player.c.d.h r1 = r1.f9152l
                r1.mo19058b()
                com.fyber.inneractive.sdk.player.c.d.f.u r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.this
                boolean unused = r1.f9154n = true
            L_0x02f7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u.C3395b.mo19177a(com.fyber.inneractive.sdk.player.c.k.k):void");
        }
    }
}
