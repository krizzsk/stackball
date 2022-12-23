package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.tf1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class sf1 implements w50 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f39955a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<de1> f39956b;

    /* renamed from: c */
    private final fy0 f39957c;

    /* renamed from: d */
    private final SparseIntArray f39958d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final tf1.C14677c f39959e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseArray<tf1> f39960f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f39961g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseBooleanArray f39962h;

    /* renamed from: i */
    private final rf1 f39963i;

    /* renamed from: j */
    private qf1 f39964j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public x50 f39965k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f39966l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f39967m;

    /* renamed from: n */
    private boolean f39968n;

    /* renamed from: o */
    private boolean f39969o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public tf1 f39970p;

    /* renamed from: q */
    private int f39971q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f39972r;

    /* renamed from: com.yandex.mobile.ads.impl.sf1$a */
    private class C14590a implements q71 {

        /* renamed from: a */
        private final ey0 f39973a = new ey0(new byte[4]);

        public C14590a() {
        }

        /* renamed from: a */
        public void mo69504a(de1 de1, x50 x50, tf1.C14678d dVar) {
        }

        /* renamed from: a */
        public void mo69505a(fy0 fy0) {
            if (fy0.mo67126r() == 0 && (fy0.mo67126r() & 128) != 0) {
                fy0.mo67114f(6);
                int a = fy0.mo67098a() / 4;
                for (int i = 0; i < a; i++) {
                    fy0.mo67101a(this.f39973a, 4);
                    int a2 = this.f39973a.mo66886a(16);
                    this.f39973a.mo66897d(3);
                    if (a2 == 0) {
                        this.f39973a.mo66897d(13);
                    } else {
                        int a3 = this.f39973a.mo66886a(13);
                        sf1.this.f39960f.put(a3, new r71(new C14591b(a3)));
                        sf1.m41956d(sf1.this);
                    }
                }
                if (sf1.this.f39955a != 2) {
                    sf1.this.f39960f.remove(0);
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sf1$b */
    private class C14591b implements q71 {

        /* renamed from: a */
        private final ey0 f39975a = new ey0(new byte[5]);

        /* renamed from: b */
        private final SparseArray<tf1> f39976b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f39977c = new SparseIntArray();

        /* renamed from: d */
        private final int f39978d;

        public C14591b(int i) {
            this.f39978d = i;
        }

        /* renamed from: a */
        public void mo69504a(de1 de1, x50 x50, tf1.C14678d dVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0168, code lost:
            if (r26.mo67126r() == r14) goto L_0x016a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0240 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0236  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69505a(com.yandex.mobile.ads.impl.fy0 r26) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                int r2 = r26.mo67126r()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                com.yandex.mobile.ads.impl.sf1 r2 = com.yandex.mobile.ads.impl.sf1.this
                int r2 = r2.f39955a
                r4 = 0
                r5 = 1
                if (r2 == r5) goto L_0x0046
                com.yandex.mobile.ads.impl.sf1 r2 = com.yandex.mobile.ads.impl.sf1.this
                int r2 = r2.f39955a
                if (r2 == r3) goto L_0x0046
                com.yandex.mobile.ads.impl.sf1 r2 = com.yandex.mobile.ads.impl.sf1.this
                int r2 = r2.f39966l
                if (r2 != r5) goto L_0x0027
                goto L_0x0046
            L_0x0027:
                com.yandex.mobile.ads.impl.de1 r2 = new com.yandex.mobile.ads.impl.de1
                com.yandex.mobile.ads.impl.sf1 r6 = com.yandex.mobile.ads.impl.sf1.this
                java.util.List r6 = r6.f39956b
                java.lang.Object r6 = r6.get(r4)
                com.yandex.mobile.ads.impl.de1 r6 = (com.yandex.mobile.ads.impl.de1) r6
                long r6 = r6.mo66563a()
                r2.<init>(r6)
                com.yandex.mobile.ads.impl.sf1 r6 = com.yandex.mobile.ads.impl.sf1.this
                java.util.List r6 = r6.f39956b
                r6.add(r2)
                goto L_0x0052
            L_0x0046:
                com.yandex.mobile.ads.impl.sf1 r2 = com.yandex.mobile.ads.impl.sf1.this
                java.util.List r2 = r2.f39956b
                java.lang.Object r2 = r2.get(r4)
                com.yandex.mobile.ads.impl.de1 r2 = (com.yandex.mobile.ads.impl.de1) r2
            L_0x0052:
                int r6 = r26.mo67126r()
                r6 = r6 & 128(0x80, float:1.794E-43)
                if (r6 != 0) goto L_0x005b
                return
            L_0x005b:
                r1.mo67114f(r5)
                int r6 = r26.mo67132x()
                r7 = 3
                r1.mo67114f(r7)
                com.yandex.mobile.ads.impl.ey0 r8 = r0.f39975a
                r1.mo67101a((com.yandex.mobile.ads.impl.ey0) r8, (int) r3)
                com.yandex.mobile.ads.impl.ey0 r8 = r0.f39975a
                r8.mo66897d(r7)
                com.yandex.mobile.ads.impl.sf1 r8 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.ey0 r9 = r0.f39975a
                r10 = 13
                int r9 = r9.mo66886a((int) r10)
                int unused = r8.f39972r = r9
                com.yandex.mobile.ads.impl.ey0 r8 = r0.f39975a
                r1.mo67101a((com.yandex.mobile.ads.impl.ey0) r8, (int) r3)
                com.yandex.mobile.ads.impl.ey0 r8 = r0.f39975a
                r9 = 4
                r8.mo66897d(r9)
                com.yandex.mobile.ads.impl.ey0 r8 = r0.f39975a
                r11 = 12
                int r8 = r8.mo66886a((int) r11)
                r1.mo67114f(r8)
                com.yandex.mobile.ads.impl.sf1 r8 = com.yandex.mobile.ads.impl.sf1.this
                int r8 = r8.f39955a
                r12 = 8192(0x2000, float:1.14794E-41)
                r13 = 0
                r14 = 21
                if (r8 != r3) goto L_0x00d0
                com.yandex.mobile.ads.impl.sf1 r8 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.tf1 r8 = r8.f39970p
                if (r8 != 0) goto L_0x00d0
                com.yandex.mobile.ads.impl.tf1$b r8 = new com.yandex.mobile.ads.impl.tf1$b
                byte[] r15 = com.yandex.mobile.ads.impl.ih1.f34863f
                r8.<init>(r14, r13, r13, r15)
                com.yandex.mobile.ads.impl.sf1 r15 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.tf1$c r13 = r15.f39959e
                com.yandex.mobile.ads.impl.tf1 r8 = r13.mo70176a(r14, r8)
                com.yandex.mobile.ads.impl.tf1 unused = r15.f39970p = r8
                com.yandex.mobile.ads.impl.sf1 r8 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.tf1 r8 = r8.f39970p
                com.yandex.mobile.ads.impl.sf1 r13 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.x50 r13 = r13.f39965k
                com.yandex.mobile.ads.impl.tf1$d r15 = new com.yandex.mobile.ads.impl.tf1$d
                r15.<init>(r6, r14, r12)
                r8.mo66378a(r2, r13, r15)
            L_0x00d0:
                android.util.SparseArray<com.yandex.mobile.ads.impl.tf1> r8 = r0.f39976b
                r8.clear()
                android.util.SparseIntArray r8 = r0.f39977c
                r8.clear()
                int r8 = r26.mo67098a()
            L_0x00de:
                if (r8 <= 0) goto L_0x0251
                com.yandex.mobile.ads.impl.ey0 r13 = r0.f39975a
                r15 = 5
                r1.mo67101a((com.yandex.mobile.ads.impl.ey0) r13, (int) r15)
                com.yandex.mobile.ads.impl.ey0 r13 = r0.f39975a
                r5 = 8
                int r5 = r13.mo66886a((int) r5)
                com.yandex.mobile.ads.impl.ey0 r13 = r0.f39975a
                r13.mo66897d(r7)
                com.yandex.mobile.ads.impl.ey0 r13 = r0.f39975a
                int r13 = r13.mo66886a((int) r10)
                com.yandex.mobile.ads.impl.ey0 r10 = r0.f39975a
                r10.mo66897d(r9)
                com.yandex.mobile.ads.impl.ey0 r10 = r0.f39975a
                int r10 = r10.mo66886a((int) r11)
                int r11 = r26.mo67105b()
                int r12 = r11 + r10
                r16 = -1
                r3 = -1
                r17 = 0
                r18 = 0
            L_0x0111:
                int r4 = r26.mo67105b()
                if (r4 >= r12) goto L_0x01cd
                int r4 = r26.mo67126r()
                int r19 = r26.mo67126r()
                int r20 = r26.mo67105b()
                int r9 = r20 + r19
                r7 = 89
                if (r4 != r15) goto L_0x014f
                long r21 = r26.mo67128t()
                r23 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
                if (r4 != 0) goto L_0x0135
                goto L_0x0153
            L_0x0135:
                r23 = 1161904947(0x45414333, double:5.74057318E-315)
                int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
                if (r4 != 0) goto L_0x013d
                goto L_0x015d
            L_0x013d:
                r23 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
                if (r4 != 0) goto L_0x0145
                goto L_0x016a
            L_0x0145:
                r23 = 1212503619(0x48455643, double:5.990563836E-315)
                int r4 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
                if (r4 != 0) goto L_0x0155
                r3 = 36
                goto L_0x0155
            L_0x014f:
                r15 = 106(0x6a, float:1.49E-43)
                if (r4 != r15) goto L_0x0159
            L_0x0153:
                r3 = 129(0x81, float:1.81E-43)
            L_0x0155:
                r22 = r2
                r15 = 4
                goto L_0x01bc
            L_0x0159:
                r15 = 122(0x7a, float:1.71E-43)
                if (r4 != r15) goto L_0x0160
            L_0x015d:
                r3 = 135(0x87, float:1.89E-43)
                goto L_0x0155
            L_0x0160:
                r15 = 127(0x7f, float:1.78E-43)
                if (r4 != r15) goto L_0x016d
                int r4 = r26.mo67126r()
                if (r4 != r14) goto L_0x0155
            L_0x016a:
                r3 = 172(0xac, float:2.41E-43)
                goto L_0x0155
            L_0x016d:
                r15 = 123(0x7b, float:1.72E-43)
                if (r4 != r15) goto L_0x0174
                r3 = 138(0x8a, float:1.93E-43)
                goto L_0x0155
            L_0x0174:
                r15 = 10
                if (r4 != r15) goto L_0x0182
                r15 = 3
                java.lang.String r4 = r1.mo67106b(r15)
                java.lang.String r17 = r4.trim()
                goto L_0x0155
            L_0x0182:
                r15 = 3
                if (r4 != r7) goto L_0x0155
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x018a:
                int r4 = r26.mo67105b()
                if (r4 >= r9) goto L_0x01b5
                java.lang.String r4 = r1.mo67106b(r15)
                java.lang.String r4 = r4.trim()
                int r7 = r26.mo67126r()
                r15 = 4
                byte[] r14 = new byte[r15]
                r22 = r2
                r2 = 0
                r1.mo67104a(r14, r2, r15)
                com.yandex.mobile.ads.impl.tf1$a r2 = new com.yandex.mobile.ads.impl.tf1$a
                r2.<init>(r4, r7, r14)
                r3.add(r2)
                r2 = r22
                r7 = 89
                r14 = 21
                r15 = 3
                goto L_0x018a
            L_0x01b5:
                r22 = r2
                r15 = 4
                r18 = r3
                r3 = 89
            L_0x01bc:
                int r2 = r26.mo67105b()
                int r9 = r9 - r2
                r1.mo67114f(r9)
                r2 = r22
                r7 = 3
                r9 = 4
                r14 = 21
                r15 = 5
                goto L_0x0111
            L_0x01cd:
                r22 = r2
                r15 = 4
                r1.mo67112e(r12)
                com.yandex.mobile.ads.impl.tf1$b r2 = new com.yandex.mobile.ads.impl.tf1$b
                byte[] r4 = r1.f33778a
                byte[] r4 = java.util.Arrays.copyOfRange(r4, r11, r12)
                r7 = r17
                r9 = r18
                r2.<init>(r3, r7, r9, r4)
                r4 = 6
                if (r5 != r4) goto L_0x01e6
                r5 = r3
            L_0x01e6:
                int r10 = r10 + 5
                int r8 = r8 - r10
                com.yandex.mobile.ads.impl.sf1 r3 = com.yandex.mobile.ads.impl.sf1.this
                int r3 = r3.f39955a
                r4 = 2
                if (r3 != r4) goto L_0x01f4
                r3 = r5
                goto L_0x01f5
            L_0x01f4:
                r3 = r13
            L_0x01f5:
                com.yandex.mobile.ads.impl.sf1 r7 = com.yandex.mobile.ads.impl.sf1.this
                android.util.SparseBooleanArray r7 = r7.f39961g
                boolean r7 = r7.get(r3)
                if (r7 == 0) goto L_0x0204
                r4 = 21
                goto L_0x0240
            L_0x0204:
                com.yandex.mobile.ads.impl.sf1 r7 = com.yandex.mobile.ads.impl.sf1.this
                int r7 = r7.f39955a
                if (r7 != r4) goto L_0x0217
                r4 = 21
                if (r5 != r4) goto L_0x0219
                com.yandex.mobile.ads.impl.sf1 r2 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.tf1 r2 = r2.f39970p
                goto L_0x0223
            L_0x0217:
                r4 = 21
            L_0x0219:
                com.yandex.mobile.ads.impl.sf1 r7 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.tf1$c r7 = r7.f39959e
                com.yandex.mobile.ads.impl.tf1 r2 = r7.mo70176a(r5, r2)
            L_0x0223:
                com.yandex.mobile.ads.impl.sf1 r5 = com.yandex.mobile.ads.impl.sf1.this
                int r5 = r5.f39955a
                r7 = 2
                if (r5 != r7) goto L_0x0236
                android.util.SparseIntArray r5 = r0.f39977c
                r7 = 8192(0x2000, float:1.14794E-41)
                int r5 = r5.get(r3, r7)
                if (r13 >= r5) goto L_0x0240
            L_0x0236:
                android.util.SparseIntArray r5 = r0.f39977c
                r5.put(r3, r13)
                android.util.SparseArray<com.yandex.mobile.ads.impl.tf1> r5 = r0.f39976b
                r5.put(r3, r2)
            L_0x0240:
                r2 = r22
                r3 = 2
                r4 = 0
                r5 = 1
                r7 = 3
                r9 = 4
                r10 = 13
                r11 = 12
                r12 = 8192(0x2000, float:1.14794E-41)
                r14 = 21
                goto L_0x00de
            L_0x0251:
                r22 = r2
                android.util.SparseIntArray r1 = r0.f39977c
                int r1 = r1.size()
                r2 = 0
            L_0x025a:
                if (r2 >= r1) goto L_0x02b7
                android.util.SparseIntArray r3 = r0.f39977c
                int r3 = r3.keyAt(r2)
                android.util.SparseIntArray r4 = r0.f39977c
                int r4 = r4.valueAt(r2)
                com.yandex.mobile.ads.impl.sf1 r5 = com.yandex.mobile.ads.impl.sf1.this
                android.util.SparseBooleanArray r5 = r5.f39961g
                r7 = 1
                r5.put(r3, r7)
                com.yandex.mobile.ads.impl.sf1 r5 = com.yandex.mobile.ads.impl.sf1.this
                android.util.SparseBooleanArray r5 = r5.f39962h
                r5.put(r4, r7)
                android.util.SparseArray<com.yandex.mobile.ads.impl.tf1> r5 = r0.f39976b
                java.lang.Object r5 = r5.valueAt(r2)
                com.yandex.mobile.ads.impl.tf1 r5 = (com.yandex.mobile.ads.impl.tf1) r5
                if (r5 == 0) goto L_0x02ae
                com.yandex.mobile.ads.impl.sf1 r7 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.tf1 r7 = r7.f39970p
                if (r5 == r7) goto L_0x02a0
                com.yandex.mobile.ads.impl.sf1 r7 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.x50 r7 = r7.f39965k
                com.yandex.mobile.ads.impl.tf1$d r8 = new com.yandex.mobile.ads.impl.tf1$d
                r9 = 8192(0x2000, float:1.14794E-41)
                r8.<init>(r6, r3, r9)
                r3 = r22
                r5.mo66378a(r3, r7, r8)
                goto L_0x02a4
            L_0x02a0:
                r3 = r22
                r9 = 8192(0x2000, float:1.14794E-41)
            L_0x02a4:
                com.yandex.mobile.ads.impl.sf1 r7 = com.yandex.mobile.ads.impl.sf1.this
                android.util.SparseArray r7 = r7.f39960f
                r7.put(r4, r5)
                goto L_0x02b2
            L_0x02ae:
                r3 = r22
                r9 = 8192(0x2000, float:1.14794E-41)
            L_0x02b2:
                int r2 = r2 + 1
                r22 = r3
                goto L_0x025a
            L_0x02b7:
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                int r1 = r1.f39955a
                r2 = 2
                if (r1 != r2) goto L_0x02de
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                boolean r1 = r1.f39967m
                if (r1 != 0) goto L_0x0316
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.x50 r1 = r1.f39965k
                r1.mo65311c()
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                r2 = 0
                int unused = r1.f39966l = r2
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                r3 = 1
                boolean unused = r1.f39967m = r3
                goto L_0x0316
            L_0x02de:
                r2 = 0
                r3 = 1
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                android.util.SparseArray r1 = r1.f39960f
                int r4 = r0.f39978d
                r1.remove(r4)
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                int r4 = r1.f39955a
                if (r4 != r3) goto L_0x02f5
                r4 = 0
                goto L_0x02fd
            L_0x02f5:
                com.yandex.mobile.ads.impl.sf1 r2 = com.yandex.mobile.ads.impl.sf1.this
                int r2 = r2.f39966l
                int r4 = r2 + -1
            L_0x02fd:
                int unused = r1.f39966l = r4
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                int r1 = r1.f39966l
                if (r1 != 0) goto L_0x0316
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                com.yandex.mobile.ads.impl.x50 r1 = r1.f39965k
                r1.mo65311c()
                com.yandex.mobile.ads.impl.sf1 r1 = com.yandex.mobile.ads.impl.sf1.this
                boolean unused = r1.f39967m = r3
            L_0x0316:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sf1.C14591b.mo69505a(com.yandex.mobile.ads.impl.fy0):void");
        }
    }

    static {
        $$Lambda$sf1$3XTQMHd67prj6203nebxlJKzr8 r0 = $$Lambda$sf1$3XTQMHd67prj6203nebxlJKzr8.INSTANCE;
    }

    public sf1(int i) {
        this(1, i);
    }

    /* renamed from: d */
    static /* synthetic */ int m41956d(sf1 sf1) {
        int i = sf1.f39966l;
        sf1.f39966l = i + 1;
        return i;
    }

    public void release() {
    }

    public sf1(int i, int i2) {
        this(i, new de1(0), new C14762uk(i2));
    }

    public sf1(int i, de1 de1, tf1.C14677c cVar) {
        this.f39959e = (tf1.C14677c) C13479j9.m37703a(cVar);
        this.f39955a = i;
        if (i == 1 || i == 2) {
            this.f39956b = Collections.singletonList(de1);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f39956b = arrayList;
            arrayList.add(de1);
        }
        this.f39957c = new fy0(new byte[9400], 0);
        this.f39961g = new SparseBooleanArray();
        this.f39962h = new SparseBooleanArray();
        this.f39960f = new SparseArray<>();
        this.f39958d = new SparseIntArray();
        this.f39963i = new rf1();
        this.f39972r = -1;
        m41954b();
    }

    /* renamed from: b */
    private void m41954b() {
        this.f39961g.clear();
        this.f39960f.clear();
        SparseArray<tf1> a = this.f39959e.mo70175a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f39960f.put(a.keyAt(i), a.valueAt(i));
        }
        this.f39960f.put(0, new r71(new C14590a()));
        this.f39970p = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static w50[] m41951a() {
        return new w50[]{new sf1(0)};
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        boolean z;
        byte[] bArr = this.f39957c.f33778a;
        ikVar.mo67806a(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i2 * TsExtractor.TS_PACKET_SIZE) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                ikVar.mo67813d(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f39965k = x50;
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        qf1 qf1;
        C13479j9.m37708b(this.f39955a != 2);
        int size = this.f39956b.size();
        for (int i = 0; i < size; i++) {
            de1 de1 = this.f39956b.get(i);
            if ((de1.mo66567c() == -9223372036854775807L) || !(de1.mo66567c() == 0 || de1.mo66563a() == j2)) {
                de1.mo66569d();
                de1.mo66568c(j2);
            }
        }
        if (!(j2 == 0 || (qf1 = this.f39964j) == null)) {
            qf1.mo66548a(j2);
        }
        this.f39957c.mo67134z();
        this.f39958d.clear();
        for (int i2 = 0; i2 < this.f39960f.size(); i2++) {
            this.f39960f.valueAt(i2).mo66377a();
        }
        this.f39971q = 0;
    }

    /* renamed from: a */
    public int mo64888a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        boolean z;
        boolean z2;
        long j;
        C13416ik ikVar2 = ikVar;
        r01 r012 = r01;
        long a = ikVar.mo67804a();
        if (this.f39967m) {
            if (((a == -1 || this.f39955a == 2) ? false : true) && !this.f39963i.mo69764c()) {
                return this.f39963i.mo69761a(ikVar2, r012, this.f39972r);
            }
            if (!this.f39968n) {
                this.f39968n = true;
                if (this.f39963i.mo69762a() != -9223372036854775807L) {
                    qf1 qf1 = r3;
                    j = 0;
                    qf1 qf12 = new qf1(this.f39963i.mo69763b(), this.f39963i.mo69762a(), a, this.f39972r);
                    this.f39964j = qf1;
                    this.f39965k.mo65309a(qf1.mo66547a());
                } else {
                    j = 0;
                    this.f39965k.mo65309a(new s71.C14567b(this.f39963i.mo69762a(), 0));
                }
            } else {
                j = 0;
            }
            if (this.f39969o) {
                z = false;
                this.f39969o = false;
                mo64889a(j, j);
                if (ikVar.mo67811c() != j) {
                    r012.f39340a = j;
                    return 1;
                }
            } else {
                z = false;
            }
            qf1 qf13 = this.f39964j;
            if (qf13 != null && qf13.mo66551b()) {
                return this.f39964j.mo66546a(ikVar2, r012);
            }
        } else {
            z = false;
        }
        fy0 fy0 = this.f39957c;
        byte[] bArr = fy0.f33778a;
        if (9400 - fy0.mo67105b() < 188) {
            int a2 = this.f39957c.mo67098a();
            if (a2 > 0) {
                System.arraycopy(bArr, this.f39957c.mo67105b(), bArr, z, a2);
            }
            this.f39957c.mo67103a(bArr, a2);
        }
        while (true) {
            if (this.f39957c.mo67098a() >= 188) {
                z2 = true;
                break;
            }
            int c = this.f39957c.mo67107c();
            int b = ikVar2.mo67807b(bArr, c, 9400 - c);
            if (b == -1) {
                z2 = false;
                break;
            }
            this.f39957c.mo67110d(c + b);
        }
        if (!z2) {
            return -1;
        }
        int b2 = this.f39957c.mo67105b();
        int c2 = this.f39957c.mo67107c();
        byte[] bArr2 = this.f39957c.f33778a;
        int i = b2;
        while (i < c2 && bArr2[i] != 71) {
            i++;
        }
        this.f39957c.mo67112e(i);
        int i2 = i + TsExtractor.TS_PACKET_SIZE;
        if (i2 > c2) {
            int i3 = this.f39971q + (i - b2);
            this.f39971q = i3;
            if (this.f39955a == 2 && i3 > 376) {
                throw new jy0("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f39971q = z;
        }
        int c3 = this.f39957c.mo67107c();
        if (i2 > c3) {
            return z;
        }
        int f = this.f39957c.mo67113f();
        if ((8388608 & f) != 0) {
            this.f39957c.mo67112e(i2);
            return z;
        }
        int i4 = ((4194304 & f) != 0 ? 1 : 0) | 0;
        int i5 = (2096896 & f) >> 8;
        boolean z3 = (f & 32) != 0;
        tf1 tf1 = (f & 16) != 0 ? this.f39960f.get(i5) : null;
        if (tf1 == null) {
            this.f39957c.mo67112e(i2);
            return z;
        }
        if (this.f39955a != 2) {
            int i6 = f & 15;
            int i7 = this.f39958d.get(i5, i6 - 1);
            this.f39958d.put(i5, i6);
            if (i7 == i6) {
                this.f39957c.mo67112e(i2);
                return z;
            } else if (i6 != ((i7 + 1) & 15)) {
                tf1.mo66377a();
            }
        }
        if (z3) {
            int r = this.f39957c.mo67126r();
            i4 |= (this.f39957c.mo67126r() & 64) != 0 ? 2 : 0;
            this.f39957c.mo67114f(r - 1);
        }
        boolean z4 = this.f39967m;
        if (this.f39955a == 2 || z4 || !this.f39962h.get(i5, z)) {
            this.f39957c.mo67110d(i2);
            tf1.mo66379a(this.f39957c, i4);
            this.f39957c.mo67110d(c3);
        }
        if (this.f39955a != 2 && !z4 && this.f39967m && a != -1) {
            this.f39969o = true;
        }
        this.f39957c.mo67112e(i2);
        return z ? 1 : 0;
    }
}
