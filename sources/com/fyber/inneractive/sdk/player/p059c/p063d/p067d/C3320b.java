package com.fyber.inneractive.sdk.player.p059c.p063d.p067d;

import android.util.Log;
import android.util.Pair;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3272j;
import com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a;
import com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3328d;
import com.fyber.inneractive.sdk.player.p059c.p072f.C3417a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b */
final class C3320b {

    /* renamed from: a */
    private static final int f8658a = C3560t.m8893e("vide");

    /* renamed from: b */
    private static final int f8659b = C3560t.m8893e("soun");

    /* renamed from: c */
    private static final int f8660c = C3560t.m8893e("text");

    /* renamed from: d */
    private static final int f8661d = C3560t.m8893e("sbtl");

    /* renamed from: e */
    private static final int f8662e = C3560t.m8893e("subt");

    /* renamed from: f */
    private static final int f8663f = C3560t.m8893e("clcp");

    /* renamed from: g */
    private static final int f8664g = C3560t.m8893e("cenc");

    /* renamed from: h */
    private static final int f8665h = C3560t.m8893e(ServerParameters.META);

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$b */
    private interface C3322b {
        /* renamed from: a */
        int mo19128a();

        /* renamed from: b */
        int mo19129b();

        /* renamed from: c */
        boolean mo19130c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r5 == 0) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3339i m8218a(com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3318a r25, com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3319b r26, long r27, com.fyber.inneractive.sdk.player.p059c.p062c.C3227a r29, boolean r30) throws com.fyber.inneractive.sdk.player.p059c.C3295l {
        /*
            r0 = r25
            int r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8564E
            com.fyber.inneractive.sdk.player.c.d.d.a$a r1 = r0.mo19126e(r1)
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8578S
            com.fyber.inneractive.sdk.player.c.d.d.a$b r2 = r1.mo19125d(r2)
            com.fyber.inneractive.sdk.player.c.k.k r2 = r2.f8657aQ
            r3 = 16
            r2.mo19386c(r3)
            int r2 = r2.mo19396j()
            int r4 = f8659b
            r5 = -1
            r7 = 4
            if (r2 != r4) goto L_0x0021
            r10 = 1
            goto L_0x0043
        L_0x0021:
            int r4 = f8658a
            if (r2 != r4) goto L_0x0028
            r2 = 2
            r10 = 2
            goto L_0x0043
        L_0x0028:
            int r4 = f8660c
            if (r2 == r4) goto L_0x0041
            int r4 = f8661d
            if (r2 == r4) goto L_0x0041
            int r4 = f8662e
            if (r2 == r4) goto L_0x0041
            int r4 = f8663f
            if (r2 != r4) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r4 = f8665h
            if (r2 != r4) goto L_0x003f
            r10 = 4
            goto L_0x0043
        L_0x003f:
            r10 = -1
            goto L_0x0043
        L_0x0041:
            r2 = 3
            r10 = 3
        L_0x0043:
            r2 = 0
            if (r10 != r5) goto L_0x0047
            return r2
        L_0x0047:
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8574O
            com.fyber.inneractive.sdk.player.c.d.d.a$b r4 = r0.mo19125d(r4)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r4.f8657aQ
            r8 = 8
            r4.mo19386c(r8)
            int r9 = r4.mo19396j()
            int r9 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r9)
            if (r9 != 0) goto L_0x0061
            r11 = 8
            goto L_0x0063
        L_0x0061:
            r11 = 16
        L_0x0063:
            r4.mo19388d(r11)
            int r11 = r4.mo19396j()
            r4.mo19388d(r7)
            int r12 = r4.f9626b
            if (r9 != 0) goto L_0x0073
            r13 = 4
            goto L_0x0075
        L_0x0073:
            r13 = 8
        L_0x0075:
            r14 = 0
            r15 = 0
        L_0x0077:
            if (r15 >= r13) goto L_0x0086
            byte[] r6 = r4.f9625a
            int r17 = r12 + r15
            byte r6 = r6[r17]
            if (r6 == r5) goto L_0x0083
            r6 = 0
            goto L_0x0087
        L_0x0083:
            int r15 = r15 + 1
            goto L_0x0077
        L_0x0086:
            r6 = 1
        L_0x0087:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0093
            r4.mo19388d(r13)
        L_0x0091:
            r5 = r15
            goto L_0x00a5
        L_0x0093:
            if (r9 != 0) goto L_0x009a
            long r5 = r4.mo19394h()
            goto L_0x009e
        L_0x009a:
            long r5 = r4.mo19402p()
        L_0x009e:
            r12 = 0
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x00a5
            goto L_0x0091
        L_0x00a5:
            r4.mo19388d(r3)
            int r9 = r4.mo19396j()
            int r12 = r4.mo19396j()
            r4.mo19388d(r7)
            int r13 = r4.mo19396j()
            int r4 = r4.mo19396j()
            r3 = 65536(0x10000, float:9.18355E-41)
            r7 = -65536(0xffffffffffff0000, float:NaN)
            if (r9 != 0) goto L_0x00ca
            if (r12 != r3) goto L_0x00ca
            if (r13 != r7) goto L_0x00ca
            if (r4 != 0) goto L_0x00ca
            r14 = 90
            goto L_0x00df
        L_0x00ca:
            if (r9 != 0) goto L_0x00d5
            if (r12 != r7) goto L_0x00d5
            if (r13 != r3) goto L_0x00d5
            if (r4 != 0) goto L_0x00d5
            r14 = 270(0x10e, float:3.78E-43)
            goto L_0x00df
        L_0x00d5:
            if (r9 != r7) goto L_0x00df
            if (r12 != 0) goto L_0x00df
            if (r13 != 0) goto L_0x00df
            if (r4 != r7) goto L_0x00df
            r14 = 180(0xb4, float:2.52E-43)
        L_0x00df:
            com.fyber.inneractive.sdk.player.c.d.d.b$f r3 = new com.fyber.inneractive.sdk.player.c.d.d.b$f
            r3.<init>(r11, r5, r14)
            int r4 = (r27 > r15 ? 1 : (r27 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x00ef
            long r4 = r3.f8688b
            r19 = r4
            r4 = r26
            goto L_0x00f3
        L_0x00ef:
            r4 = r26
            r19 = r27
        L_0x00f3:
            com.fyber.inneractive.sdk.player.c.k.k r4 = r4.f8657aQ
            r4.mo19386c(r8)
            int r5 = r4.mo19396j()
            int r5 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r5)
            if (r5 != 0) goto L_0x0105
            r5 = 8
            goto L_0x0107
        L_0x0105:
            r5 = 16
        L_0x0107:
            r4.mo19388d(r5)
            long r13 = r4.mo19394h()
            int r4 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x0113
            goto L_0x011d
        L_0x0113:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r13
            long r4 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8877a((long) r19, (long) r21, (long) r23)
            r15 = r4
        L_0x011d:
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8565F
            com.fyber.inneractive.sdk.player.c.d.d.a$a r4 = r1.mo19126e(r4)
            int r5 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8566G
            com.fyber.inneractive.sdk.player.c.d.d.a$a r4 = r4.mo19126e(r5)
            int r5 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8577R
            com.fyber.inneractive.sdk.player.c.d.d.a$b r1 = r1.mo19125d(r5)
            com.fyber.inneractive.sdk.player.c.k.k r1 = r1.f8657aQ
            r1.mo19386c(r8)
            int r5 = r1.mo19396j()
            int r5 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.m8206a(r5)
            if (r5 != 0) goto L_0x0141
            r6 = 8
            goto L_0x0143
        L_0x0141:
            r6 = 16
        L_0x0143:
            r1.mo19388d(r6)
            long r6 = r1.mo19394h()
            if (r5 != 0) goto L_0x014d
            r8 = 4
        L_0x014d:
            r1.mo19388d(r8)
            int r1 = r1.mo19389e()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r8 = r1 >> 10
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            r5.append(r8)
            int r8 = r1 >> 5
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            r5.append(r8)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            int r5 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8579T
            com.fyber.inneractive.sdk.player.c.d.d.a$b r4 = r4.mo19125d(r5)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r4.f8657aQ
            int r5 = r3.f8687a
            int r6 = r3.f8689c
            java.lang.Object r7 = r1.second
            r20 = r7
            java.lang.String r20 = (java.lang.String) r20
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r29
            r22 = r30
            com.fyber.inneractive.sdk.player.c.d.d.b$c r4 = m8217a(r17, r18, r19, r20, r21, r22)
            int r5 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8575P
            com.fyber.inneractive.sdk.player.c.d.d.a$a r0 = r0.mo19126e(r5)
            android.util.Pair r0 = m8215a((com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.C3318a) r0)
            com.fyber.inneractive.sdk.player.c.h r5 = r4.f8676b
            if (r5 != 0) goto L_0x01b0
            return r2
        L_0x01b0:
            com.fyber.inneractive.sdk.player.c.d.d.i r2 = new com.fyber.inneractive.sdk.player.c.d.d.i
            int r9 = r3.f8687a
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r11 = r1.longValue()
            com.fyber.inneractive.sdk.player.c.h r1 = r4.f8676b
            int r3 = r4.f8678d
            com.fyber.inneractive.sdk.player.c.d.d.j[] r5 = r4.f8675a
            int r4 = r4.f8677c
            java.lang.Object r6 = r0.first
            r21 = r6
            long[] r21 = (long[]) r21
            java.lang.Object r0 = r0.second
            r22 = r0
            long[] r22 = (long[]) r22
            r8 = r2
            r17 = r1
            r18 = r3
            r19 = r5
            r20 = r4
            r8.<init>(r9, r10, r11, r13, r15, r17, r18, r19, r20, r21, r22)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3320b.m8218a(com.fyber.inneractive.sdk.player.c.d.d.a$a, com.fyber.inneractive.sdk.player.c.d.d.a$b, long, com.fyber.inneractive.sdk.player.c.c.a, boolean):com.fyber.inneractive.sdk.player.c.d.d.i");
    }

    /* renamed from: a */
    public static C3342l m8219a(C3339i iVar, C3317a.C3318a aVar, C3272j jVar) throws C3295l {
        C3322b bVar;
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        int[] iArr;
        int i4;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        C3339i iVar2;
        long[] jArr3;
        int i5;
        boolean z2;
        int[] iArr3;
        long[] jArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        C3339i iVar3 = iVar;
        C3317a.C3318a aVar2 = aVar;
        C3272j jVar2 = jVar;
        C3317a.C3319b d = aVar2.mo19125d(C3317a.f8618aq);
        if (d != null) {
            bVar = new C3324d(d);
        } else {
            C3317a.C3319b d2 = aVar2.mo19125d(C3317a.f8619ar);
            if (d2 != null) {
                bVar = new C3325e(d2);
            } else {
                throw new C3295l("Track has no sample table size information");
            }
        }
        int a = bVar.mo19128a();
        if (a == 0) {
            return new C3342l(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        C3317a.C3319b d3 = aVar2.mo19125d(C3317a.f8620as);
        if (d3 == null) {
            d3 = aVar2.mo19125d(C3317a.f8621at);
            z = true;
        } else {
            z = false;
        }
        C3548k kVar = d3.f8657aQ;
        C3548k kVar2 = aVar2.mo19125d(C3317a.f8617ap).f8657aQ;
        C3548k kVar3 = aVar2.mo19125d(C3317a.f8614am).f8657aQ;
        C3317a.C3319b d4 = aVar2.mo19125d(C3317a.f8615an);
        C3548k kVar4 = null;
        C3548k kVar5 = d4 != null ? d4.f8657aQ : null;
        C3317a.C3319b d5 = aVar2.mo19125d(C3317a.f8616ao);
        C3548k kVar6 = d5 != null ? d5.f8657aQ : null;
        C3321a aVar3 = new C3321a(kVar2, kVar, z);
        kVar3.mo19386c(12);
        int n = kVar3.mo19400n() - 1;
        int n2 = kVar3.mo19400n();
        int n3 = kVar3.mo19400n();
        if (kVar6 != null) {
            kVar6.mo19386c(12);
            i = kVar6.mo19400n();
        } else {
            i = 0;
        }
        int i10 = -1;
        if (kVar5 != null) {
            kVar5.mo19386c(12);
            i2 = kVar5.mo19400n();
            if (i2 > 0) {
                i10 = kVar5.mo19400n() - 1;
                kVar4 = kVar5;
            }
        } else {
            kVar4 = kVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(bVar.mo19130c() && "audio/raw".equals(iVar3.f8798f.f8493f) && n == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[a];
            iArr = new int[a];
            jArr = new long[a];
            int i11 = i2;
            iArr2 = new int[a];
            C3548k kVar7 = kVar3;
            int i12 = i10;
            long j3 = 0;
            j = 0;
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i;
            int i18 = n3;
            int i19 = n2;
            int i20 = n;
            int i21 = i11;
            while (i13 < a) {
                while (i15 == 0) {
                    C3535a.m8784b(aVar3.mo19127a());
                    j3 = aVar3.f8669d;
                    i15 = aVar3.f8668c;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (kVar6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = kVar6.mo19400n();
                        i16 = kVar6.mo19396j();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j3;
                iArr[i13] = bVar.mo19129b();
                if (iArr[i13] > i4) {
                    i4 = iArr[i13];
                }
                int i25 = a;
                C3322b bVar2 = bVar;
                jArr[i13] = j + ((long) i24);
                iArr2[i13] = kVar4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = kVar4.mo19400n() - 1;
                    }
                }
                int i26 = i23;
                long[] jArr6 = jArr5;
                j += (long) i26;
                int i27 = i22 - 1;
                if (i27 != 0 || i20 <= 0) {
                    int i28 = i27;
                    i8 = i26;
                    i9 = i28;
                } else {
                    i9 = kVar7.mo19400n();
                    i8 = kVar7.mo19400n();
                    i20--;
                }
                int i29 = i9;
                j3 += (long) iArr[i13];
                i15--;
                i13++;
                a = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i29;
                C3322b bVar3 = bVar2;
                i18 = i8;
                bVar = bVar3;
            }
            i3 = a;
            long[] jArr7 = jArr5;
            int i30 = i19;
            C3535a.m8782a(i14 == 0);
            while (i17 > 0) {
                C3535a.m8782a(kVar6.mo19400n() == 0);
                kVar6.mo19396j();
                i17--;
            }
            if (i21 == 0 && i30 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    iVar2 = iVar;
                    jArr2 = jArr7;
                }
            } else {
                i7 = i15;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            iVar2 = iVar;
            sb.append(iVar2.f8793a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i30);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i20);
            Log.w("AtomParsers", sb.toString());
            jArr2 = jArr7;
        } else {
            iVar2 = iVar3;
            i3 = a;
            C3322b bVar4 = bVar;
            long[] jArr8 = new long[aVar3.f8666a];
            int[] iArr4 = new int[aVar3.f8666a];
            while (aVar3.mo19127a()) {
                jArr8[aVar3.f8667b] = aVar3.f8669d;
                iArr4[aVar3.f8667b] = aVar3.f8668c;
            }
            C3328d.C3329a a2 = C3328d.m8231a(bVar4.mo19129b(), jArr8, iArr4, (long) n3);
            jArr2 = a2.f8694a;
            iArr = a2.f8695b;
            i4 = a2.f8696c;
            jArr = a2.f8697d;
            iArr2 = a2.f8698e;
            j = 0;
        }
        if (iVar2.f8801i == null || jVar.mo19059a()) {
            C3560t.m8883a(jArr, iVar2.f8795c);
            return new C3342l(jArr2, iArr, i4, jArr, iArr2);
        }
        if (iVar2.f8801i.length == 1 && iVar2.f8794b == 1 && jArr.length >= 2) {
            long j4 = iVar2.f8802j[0];
            long a3 = C3560t.m8877a(iVar2.f8801i[0], iVar2.f8795c, iVar2.f8796d) + j4;
            if (jArr[0] <= j4 && j4 < jArr[1] && jArr[jArr.length - 1] < a3 && a3 <= j) {
                long a4 = C3560t.m8877a(j4 - jArr[0], (long) iVar2.f8798f.f8506s, iVar2.f8795c);
                long a5 = C3560t.m8877a(j - a3, (long) iVar2.f8798f.f8506s, iVar2.f8795c);
                if (!(a4 == 0 && a5 == 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                    int i31 = (int) a4;
                    C3272j jVar3 = jVar;
                    jVar3.f8380b = i31;
                    jVar3.f8381c = (int) a5;
                    C3560t.m8883a(jArr, iVar2.f8795c);
                    return new C3342l(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        if (iVar2.f8801i.length == 1) {
            char c = 0;
            if (iVar2.f8801i[0] == 0) {
                int i32 = 0;
                while (i32 < jArr.length) {
                    jArr[i32] = C3560t.m8877a(jArr[i32] - iVar2.f8802j[c], 1000000, iVar2.f8795c);
                    i32++;
                    c = 0;
                }
                return new C3342l(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = iVar2.f8794b == 1;
        boolean z4 = false;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (i33 < iVar2.f8801i.length) {
            long j5 = iVar2.f8802j[i33];
            if (j5 != -1) {
                i6 = i4;
                long a6 = C3560t.m8877a(iVar2.f8801i[i33], iVar2.f8795c, iVar2.f8796d);
                int a7 = C3560t.m8875a(jArr, j5, true, true);
                int a8 = C3560t.m8875a(jArr, j5 + a6, z3, false);
                i34 += a8 - a7;
                z4 |= i35 != a7;
                i35 = a8;
            } else {
                i6 = i4;
            }
            i33++;
            i4 = i6;
        }
        int i36 = i4;
        boolean z5 = z4 | (i34 != i3);
        long[] jArr9 = z5 ? new long[i34] : jArr2;
        int[] iArr5 = z5 ? new int[i34] : iArr;
        int i37 = z5 ? 0 : i36;
        int[] iArr6 = z5 ? new int[i34] : iArr2;
        long[] jArr10 = new long[i34];
        int i38 = i37;
        int i39 = 0;
        int i40 = 0;
        while (i39 < iVar2.f8801i.length) {
            long j6 = iVar2.f8802j[i39];
            long j7 = iVar2.f8801i[i39];
            if (j6 != -1) {
                int[] iArr7 = iArr6;
                i5 = i39;
                long j8 = iVar2.f8795c;
                jArr3 = jArr10;
                long[] jArr11 = jArr2;
                int a9 = C3560t.m8875a(jArr, j6, true, true);
                int a10 = C3560t.m8875a(jArr, C3560t.m8877a(j7, j8, iVar2.f8796d) + j6, z3, false);
                if (z5) {
                    int i41 = a10 - a9;
                    jArr4 = jArr11;
                    System.arraycopy(jArr4, a9, jArr9, i40, i41);
                    System.arraycopy(iArr, a9, iArr5, i40, i41);
                    iArr3 = iArr7;
                    System.arraycopy(iArr2, a9, iArr3, i40, i41);
                } else {
                    iArr3 = iArr7;
                    jArr4 = jArr11;
                }
                int i42 = i38;
                while (a9 < a10) {
                    boolean z6 = z3;
                    int i43 = a10;
                    long j9 = j6;
                    jArr3[i40] = C3560t.m8877a(j2, 1000000, iVar2.f8796d) + C3560t.m8877a(jArr[a9] - j6, 1000000, iVar2.f8795c);
                    if (z5 && iArr5[i40] > i42) {
                        i42 = iArr[a9];
                    }
                    i40++;
                    a9++;
                    a10 = i43;
                    z3 = z6;
                    j6 = j9;
                }
                z2 = z3;
                i38 = i42;
            } else {
                z2 = z3;
                jArr3 = jArr10;
                iArr3 = iArr6;
                i5 = i39;
                jArr4 = jArr2;
            }
            j2 += j7;
            i39 = i5 + 1;
            jArr10 = jArr3;
            jArr2 = jArr4;
            iArr6 = iArr3;
            z3 = z2;
        }
        long[] jArr12 = jArr10;
        int[] iArr8 = iArr6;
        boolean z7 = false;
        for (int i44 = 0; i44 < iArr8.length && !z7; i44++) {
            z7 |= (iArr8[i44] & 1) != 0;
        }
        if (z7) {
            return new C3342l(jArr9, iArr5, i38, jArr12, iArr8);
        }
        throw new C3295l("The edited sample sequence does not contain a sync sample.");
    }

    /* renamed from: a */
    public static C3417a m8220a(C3317a.C3319b bVar, boolean z) {
        if (z) {
            return null;
        }
        C3548k kVar = bVar.f8657aQ;
        kVar.mo19386c(8);
        while (kVar.mo19383b() >= 8) {
            int i = kVar.f9626b;
            int j = kVar.mo19396j();
            if (kVar.mo19396j() == C3317a.f8588aB) {
                kVar.mo19386c(i);
                int i2 = i + j;
                kVar.mo19388d(12);
                while (true) {
                    if (kVar.f9626b >= i2) {
                        break;
                    }
                    int i3 = kVar.f9626b;
                    int j2 = kVar.mo19396j();
                    if (kVar.mo19396j() == C3317a.f8589aC) {
                        kVar.mo19386c(i3);
                        int i4 = i3 + j2;
                        kVar.mo19388d(8);
                        ArrayList arrayList = new ArrayList();
                        while (kVar.f9626b < i4) {
                            C3417a.C3419a a = C3334f.m8245a(kVar);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new C3417a((List<? extends C3417a.C3419a>) arrayList);
                        }
                    } else {
                        kVar.mo19388d(j2 - 8);
                    }
                }
                return null;
            }
            kVar.mo19388d(j - 8);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x033e: MOVE  (r7v21 java.lang.String) = (r30v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* renamed from: a */
    private static com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3320b.C3323c m8217a(com.fyber.inneractive.sdk.player.p059c.p080k.C3548k r31, int r32, int r33, java.lang.String r34, com.fyber.inneractive.sdk.player.p059c.p062c.C3227a r35, boolean r36) throws com.fyber.inneractive.sdk.player.p059c.C3295l {
        /*
            r0 = r31
            r12 = r34
            r15 = r35
            r1 = 12
            r0.mo19386c(r1)
            int r14 = r31.mo19396j()
            com.fyber.inneractive.sdk.player.c.d.d.b$c r13 = new com.fyber.inneractive.sdk.player.c.d.d.b$c
            r13.<init>(r14)
            r11 = 0
            r10 = 0
        L_0x0016:
            if (r10 >= r14) goto L_0x0518
            int r9 = r0.f9626b
            int r7 = r31.mo19396j()
            r8 = 1
            if (r7 <= 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.String r6 = "childAtomSize should be positive"
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8783a((boolean) r1, (java.lang.Object) r6)
            int r1 = r31.mo19396j()
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8628b
            r3 = 16
            r4 = 2
            r16 = 0
            r5 = 8
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8629c
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8585Z
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8613al
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8630d
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8631e
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8632f
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8597aK
            if (r1 == r2) goto L_0x0383
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8598aL
            if (r1 != r2) goto L_0x005a
            goto L_0x0383
        L_0x005a:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8635i
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8602aa
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8640n
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8642p
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8644r
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8647u
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8645s
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8646t
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8626ay
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8627az
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8638l
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8639m
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8636j
            if (r1 == r2) goto L_0x0130
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8601aO
            if (r1 != r2) goto L_0x0094
            goto L_0x0130
        L_0x0094:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8611aj
            if (r1 == r2) goto L_0x00c2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8622au
            if (r1 == r2) goto L_0x00c2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8623av
            if (r1 == r2) goto L_0x00c2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8624aw
            if (r1 == r2) goto L_0x00c2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8625ax
            if (r1 != r2) goto L_0x00a9
            goto L_0x00c2
        L_0x00a9:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8600aN
            if (r1 != r2) goto L_0x00b9
            java.lang.String r1 = java.lang.Integer.toString(r32)
            java.lang.String r2 = "application/x-camera-motion"
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8121a((java.lang.String) r1, (java.lang.String) r2, (com.fyber.inneractive.sdk.player.p059c.p062c.C3227a) r15)
            r13.f8676b = r1
        L_0x00b9:
            r12 = r7
            r7 = r9
            r11 = r10
            r6 = r13
            r1 = r14
            r25 = 0
            goto L_0x0508
        L_0x00c2:
            int r2 = r9 + 8
            int r2 = r2 + r5
            r0.mo19386c(r2)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8611aj
            java.lang.String r6 = "application/ttml+xml"
            if (r1 != r4) goto L_0x00d9
            r18 = r16
            r16 = r2
        L_0x00d7:
            r2 = r6
            goto L_0x0111
        L_0x00d9:
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8622au
            if (r1 != r4) goto L_0x00f1
            int r1 = r7 + -8
            int r1 = r1 - r5
            byte[] r4 = new byte[r1]
            r0.mo19382a(r4, r11, r1)
            java.util.List r1 = java.util.Collections.singletonList(r4)
            java.lang.String r4 = "application/x-quicktime-tx3g"
            r18 = r1
            r16 = r2
            r2 = r4
            goto L_0x0111
        L_0x00f1:
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8623av
            if (r1 != r4) goto L_0x00fd
            java.lang.String r1 = "application/x-mp4-vtt"
        L_0x00f7:
            r18 = r16
            r16 = r2
            r2 = r1
            goto L_0x0111
        L_0x00fd:
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8624aw
            if (r1 != r4) goto L_0x0108
            r1 = 0
            r18 = r16
            r16 = r1
            goto L_0x00d7
        L_0x0108:
            int r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8625ax
            if (r1 != r4) goto L_0x012a
            r13.f8678d = r8
            java.lang.String r1 = "application/x-mp4-cea-608"
            goto L_0x00f7
        L_0x0111:
            java.lang.String r1 = java.lang.Integer.toString(r32)
            r3 = 0
            r5 = -1
            r4 = r34
            r6 = r35
            r11 = r7
            r7 = r16
            r20 = r14
            r14 = r9
            r9 = r18
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8119a(r1, r2, r3, r4, r5, r6, r7, r9)
            r13.f8676b = r1
            goto L_0x016a
        L_0x012a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0130:
            r11 = r7
            r20 = r14
            r14 = r9
            int r9 = r14 + 8
            int r9 = r9 + r5
            r0.mo19386c(r9)
            r2 = 6
            if (r36 == 0) goto L_0x0145
            int r7 = r31.mo19389e()
            r0.mo19388d(r2)
            goto L_0x0149
        L_0x0145:
            r0.mo19388d(r5)
            r7 = 0
        L_0x0149:
            if (r7 == 0) goto L_0x0174
            if (r7 != r8) goto L_0x014e
            goto L_0x0174
        L_0x014e:
            if (r7 != r4) goto L_0x016a
            r0.mo19388d(r3)
            long r2 = r31.mo19398l()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r3 = (int) r2
            int r2 = r31.mo19400n()
            r5 = 20
            r0.mo19388d(r5)
            goto L_0x01a3
        L_0x016a:
            r12 = r11
            r6 = r13
            r7 = r14
            r1 = r20
            r25 = 0
            r11 = r10
            goto L_0x0508
        L_0x0174:
            int r9 = r31.mo19389e()
            r0.mo19388d(r2)
            byte[] r2 = r0.f9625a
            int r3 = r0.f9626b
            int r8 = r3 + 1
            r0.f9626b = r8
            byte r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r5
            byte[] r3 = r0.f9625a
            int r5 = r0.f9626b
            int r8 = r5 + 1
            r0.f9626b = r8
            byte r3 = r3[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r2
            int r2 = r0.f9626b
            int r2 = r2 + r4
            r0.f9626b = r2
            r8 = 1
            if (r7 != r8) goto L_0x01a2
            r2 = 16
            r0.mo19388d(r2)
        L_0x01a2:
            r2 = r9
        L_0x01a3:
            int r5 = r0.f9626b
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8602aa
            if (r1 != r7) goto L_0x01b0
            int r1 = m8214a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r0, (int) r14, (int) r11, (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3320b.C3323c) r13, (int) r10)
            r0.mo19386c(r5)
        L_0x01b0:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8640n
            java.lang.String r9 = "audio/raw"
            if (r1 != r7) goto L_0x01b9
            java.lang.String r1 = "audio/ac3"
            goto L_0x0203
        L_0x01b9:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8642p
            if (r1 != r7) goto L_0x01c0
            java.lang.String r1 = "audio/eac3"
            goto L_0x0203
        L_0x01c0:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8644r
            if (r1 != r7) goto L_0x01c7
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x0203
        L_0x01c7:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8645s
            if (r1 == r7) goto L_0x0201
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8646t
            if (r1 != r7) goto L_0x01d0
            goto L_0x0201
        L_0x01d0:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8647u
            if (r1 != r7) goto L_0x01d7
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0203
        L_0x01d7:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8626ay
            if (r1 != r7) goto L_0x01de
            java.lang.String r1 = "audio/3gpp"
            goto L_0x0203
        L_0x01de:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8627az
            if (r1 != r7) goto L_0x01e5
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x0203
        L_0x01e5:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8638l
            if (r1 == r7) goto L_0x01ff
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8639m
            if (r1 != r7) goto L_0x01ee
            goto L_0x01ff
        L_0x01ee:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8636j
            if (r1 != r7) goto L_0x01f5
            java.lang.String r1 = "audio/mpeg"
            goto L_0x0203
        L_0x01f5:
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8601aO
            if (r1 != r7) goto L_0x01fc
            java.lang.String r1 = "audio/alac"
            goto L_0x0203
        L_0x01fc:
            r1 = r16
            goto L_0x0203
        L_0x01ff:
            r1 = r9
            goto L_0x0203
        L_0x0201:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x0203:
            r7 = r1
            r18 = r2
            r21 = r3
            r22 = r16
        L_0x020a:
            int r1 = r5 - r14
            if (r1 >= r11) goto L_0x0333
            r0.mo19386c(r5)
            int r3 = r31.mo19396j()
            if (r3 <= 0) goto L_0x0219
            r1 = 1
            goto L_0x021a
        L_0x0219:
            r1 = 0
        L_0x021a:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8783a((boolean) r1, (java.lang.Object) r6)
            int r1 = r31.mo19396j()
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8569J
            if (r1 == r2) goto L_0x02b9
            if (r36 == 0) goto L_0x022d
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8637k
            if (r1 != r2) goto L_0x022d
            goto L_0x02b9
        L_0x022d:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8641o
            if (r1 != r2) goto L_0x024b
            int r1 = r5 + 8
            r0.mo19386c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r32)
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.p060a.C3189a.m7723a(r0, r1, r12, r15)
            r13.f8676b = r1
        L_0x0240:
            r2 = r3
            r29 = r6
            r30 = r7
            r17 = r10
            r10 = r9
        L_0x0248:
            r9 = 0
            goto L_0x02b2
        L_0x024b:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8643q
            if (r1 != r2) goto L_0x025f
            int r1 = r5 + 8
            r0.mo19386c(r1)
            java.lang.String r1 = java.lang.Integer.toString(r32)
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.p060a.C3189a.m7724b(r0, r1, r12, r15)
            r13.f8676b = r1
            goto L_0x0240
        L_0x025f:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8648v
            if (r1 != r2) goto L_0x028e
            java.lang.String r1 = java.lang.Integer.toString(r32)
            r23 = -1
            r24 = -1
            r25 = 0
            r2 = r7
            r26 = r3
            r3 = r23
            r4 = r24
            r28 = r5
            r5 = r18
            r29 = r6
            r6 = r21
            r30 = r7
            r7 = r25
            r8 = r35
            r17 = r10
            r10 = r9
            r9 = r34
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8115a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.f8676b = r1
            goto L_0x02ad
        L_0x028e:
            r26 = r3
            r28 = r5
            r29 = r6
            r30 = r7
            r17 = r10
            r10 = r9
            int r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8601aO
            if (r1 != r2) goto L_0x02ad
            r2 = r26
            byte[] r1 = new byte[r2]
            r5 = r28
            r0.mo19386c(r5)
            r9 = 0
            r0.mo19382a(r1, r9, r2)
            r22 = r1
            goto L_0x02b2
        L_0x02ad:
            r2 = r26
            r5 = r28
            goto L_0x0248
        L_0x02b2:
            r4 = r29
            r7 = r30
            r3 = -1
            goto L_0x032a
        L_0x02b9:
            r2 = r3
            r29 = r6
            r30 = r7
            r17 = r10
            r10 = r9
            r9 = 0
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8569J
            if (r1 != r3) goto L_0x02cb
            r1 = r5
            r4 = r29
        L_0x02c9:
            r3 = -1
            goto L_0x02f3
        L_0x02cb:
            int r1 = r0.f9626b
        L_0x02cd:
            int r3 = r1 - r5
            if (r3 >= r2) goto L_0x02ef
            r0.mo19386c(r1)
            int r3 = r31.mo19396j()
            r4 = r29
            if (r3 <= 0) goto L_0x02de
            r8 = 1
            goto L_0x02df
        L_0x02de:
            r8 = 0
        L_0x02df:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8783a((boolean) r8, (java.lang.Object) r4)
            int r6 = r31.mo19396j()
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8569J
            if (r6 != r7) goto L_0x02eb
            goto L_0x02c9
        L_0x02eb:
            int r1 = r1 + r3
            r29 = r4
            goto L_0x02cd
        L_0x02ef:
            r4 = r29
            r1 = -1
            goto L_0x02c9
        L_0x02f3:
            if (r1 == r3) goto L_0x0328
            android.util.Pair r1 = m8216a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r0, (int) r1)
            java.lang.Object r6 = r1.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            java.lang.String r7 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0324
            android.util.Pair r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3538c.m8788a((byte[]) r1)
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r22 = r1
            r18 = r7
            r21 = r8
            goto L_0x0326
        L_0x0324:
            r22 = r1
        L_0x0326:
            r7 = r6
            goto L_0x032a
        L_0x0328:
            r7 = r30
        L_0x032a:
            int r5 = r5 + r2
            r6 = r4
            r9 = r10
            r10 = r17
            r4 = 2
            r8 = 1
            goto L_0x020a
        L_0x0333:
            r30 = r7
            r17 = r10
            r3 = -1
            r10 = r9
            r9 = 0
            com.fyber.inneractive.sdk.player.c.h r1 = r13.f8676b
            if (r1 != 0) goto L_0x0377
            r7 = r30
            if (r7 == 0) goto L_0x0377
            boolean r1 = r10.equals(r7)
            if (r1 == 0) goto L_0x034b
            r27 = 2
            goto L_0x034d
        L_0x034b:
            r27 = -1
        L_0x034d:
            java.lang.String r1 = java.lang.Integer.toString(r32)
            r3 = -1
            r4 = -1
            if (r22 != 0) goto L_0x0358
            r8 = r16
            goto L_0x035d
        L_0x0358:
            java.util.List r2 = java.util.Collections.singletonList(r22)
            r8 = r2
        L_0x035d:
            r10 = 0
            r2 = r7
            r5 = r18
            r6 = r21
            r7 = r27
            r16 = 0
            r9 = r35
            r15 = r17
            r12 = r11
            r25 = 0
            r11 = r34
            com.fyber.inneractive.sdk.player.c.h r1 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8114a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.f8676b = r1
            goto L_0x037c
        L_0x0377:
            r12 = r11
            r15 = r17
            r25 = 0
        L_0x037c:
            r6 = r13
            r7 = r14
            r11 = r15
            r1 = r20
            goto L_0x0508
        L_0x0383:
            r4 = r6
            r12 = r7
            r15 = r10
            r20 = r14
            r3 = -1
            r25 = 0
            r14 = r9
            int r9 = r14 + 8
            int r9 = r9 + r5
            r0.mo19386c(r9)
            r2 = 16
            r0.mo19388d(r2)
            int r2 = r31.mo19389e()
            int r17 = r31.mo19389e()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 50
            r0.mo19388d(r6)
            int r6 = r0.f9626b
            int r7 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8585Z
            if (r1 != r7) goto L_0x03b3
            int r1 = m8214a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r0, (int) r14, (int) r12, (com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3320b.C3323c) r13, (int) r15)
            r0.mo19386c(r6)
        L_0x03b3:
            r3 = r16
            r18 = r3
            r21 = r18
            r11 = 0
            r22 = -1
        L_0x03bc:
            int r7 = r6 - r14
            if (r7 >= r12) goto L_0x04e9
            r0.mo19386c(r6)
            int r7 = r0.f9626b
            int r8 = r31.mo19396j()
            if (r8 != 0) goto L_0x03d0
            int r9 = r0.f9626b
            int r9 = r9 - r14
            if (r9 == r12) goto L_0x04e9
        L_0x03d0:
            if (r8 <= 0) goto L_0x03d4
            r9 = 1
            goto L_0x03d5
        L_0x03d4:
            r9 = 0
        L_0x03d5:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8783a((boolean) r9, (java.lang.Object) r4)
            int r9 = r31.mo19396j()
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8567H
            r29 = r4
            r4 = 3
            if (r9 != r10) goto L_0x0401
            if (r3 != 0) goto L_0x03e7
            r3 = 1
            goto L_0x03e8
        L_0x03e7:
            r3 = 0
        L_0x03e8:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r3)
            int r7 = r7 + 8
            r0.mo19386c(r7)
            com.fyber.inneractive.sdk.player.c.l.a r3 = com.fyber.inneractive.sdk.player.p059c.p081l.C3562a.m8897a(r31)
            java.util.List<byte[]> r4 = r3.f9665a
            int r7 = r3.f9666b
            r13.f8677c = r7
            if (r11 != 0) goto L_0x03fe
            float r5 = r3.f9669e
        L_0x03fe:
            java.lang.String r3 = "video/avc"
            goto L_0x041e
        L_0x0401:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8568I
            if (r9 != r10) goto L_0x0426
            if (r3 != 0) goto L_0x0409
            r3 = 1
            goto L_0x040a
        L_0x0409:
            r3 = 0
        L_0x040a:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r3)
            int r7 = r7 + 8
            r0.mo19386c(r7)
            com.fyber.inneractive.sdk.player.c.l.c r3 = com.fyber.inneractive.sdk.player.p059c.p081l.C3565c.m8899a(r31)
            java.util.List<byte[]> r4 = r3.f9675a
            int r3 = r3.f9676b
            r13.f8677c = r3
            java.lang.String r3 = "video/hevc"
        L_0x041e:
            r19 = r1
            r18 = r4
        L_0x0422:
            r7 = 1
            r9 = 2
            goto L_0x04e2
        L_0x0426:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8599aM
            if (r9 != r10) goto L_0x043c
            if (r3 != 0) goto L_0x042e
            r3 = 1
            goto L_0x042f
        L_0x042e:
            r3 = 0
        L_0x042f:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r3)
            int r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8597aK
            if (r1 != r3) goto L_0x0439
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x044a
        L_0x0439:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x044a
        L_0x043c:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8633g
            if (r9 != r10) goto L_0x044d
            if (r3 != 0) goto L_0x0444
            r3 = 1
            goto L_0x0445
        L_0x0444:
            r3 = 0
        L_0x0445:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r3)
            java.lang.String r3 = "video/3gpp"
        L_0x044a:
            r19 = r1
            goto L_0x0422
        L_0x044d:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8569J
            if (r9 != r10) goto L_0x046b
            if (r3 != 0) goto L_0x0455
            r3 = 1
            goto L_0x0456
        L_0x0455:
            r3 = 0
        L_0x0456:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r3)
            android.util.Pair r3 = m8216a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r0, (int) r7)
            java.lang.Object r4 = r3.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.second
            java.util.List r18 = java.util.Collections.singletonList(r3)
            r19 = r1
            r3 = r4
            goto L_0x0422
        L_0x046b:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8610ai
            if (r9 != r10) goto L_0x0486
            int r7 = r7 + 8
            r0.mo19386c(r7)
            int r4 = r31.mo19400n()
            int r5 = r31.mo19400n()
            float r4 = (float) r4
            float r5 = (float) r5
            float r5 = r4 / r5
            r19 = r1
            r7 = 1
            r9 = 2
            r11 = 1
            goto L_0x04e2
        L_0x0486:
            int r10 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8595aI
            if (r9 != r10) goto L_0x04b6
            int r4 = r7 + 8
        L_0x048c:
            int r9 = r4 - r7
            if (r9 >= r8) goto L_0x04b0
            r0.mo19386c(r4)
            int r9 = r31.mo19396j()
            int r10 = r31.mo19396j()
            r19 = r1
            int r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8596aJ
            if (r10 != r1) goto L_0x04ac
            byte[] r1 = r0.f9625a
            int r9 = r9 + r4
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r4, r9)
            r21 = r1
            goto L_0x0422
        L_0x04ac:
            int r4 = r4 + r9
            r1 = r19
            goto L_0x048c
        L_0x04b0:
            r19 = r1
            r21 = r16
            goto L_0x0422
        L_0x04b6:
            r19 = r1
            int r1 = com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3317a.f8594aH
            if (r9 != r1) goto L_0x0422
            int r1 = r31.mo19387d()
            r0.mo19388d(r4)
            if (r1 != 0) goto L_0x0422
            int r1 = r31.mo19387d()
            if (r1 == 0) goto L_0x04de
            r7 = 1
            if (r1 == r7) goto L_0x04da
            r9 = 2
            if (r1 == r9) goto L_0x04d7
            if (r1 == r4) goto L_0x04d4
            goto L_0x04e2
        L_0x04d4:
            r22 = 3
            goto L_0x04e2
        L_0x04d7:
            r22 = 2
            goto L_0x04e2
        L_0x04da:
            r9 = 2
            r22 = 1
            goto L_0x04e2
        L_0x04de:
            r7 = 1
            r9 = 2
            r22 = 0
        L_0x04e2:
            int r6 = r6 + r8
            r1 = r19
            r4 = r29
            goto L_0x03bc
        L_0x04e9:
            if (r3 == 0) goto L_0x037c
            java.lang.String r1 = java.lang.Integer.toString(r32)
            r4 = -1
            r23 = 0
            r6 = r13
            r13 = r1
            r7 = r14
            r1 = r20
            r14 = r3
            r11 = r15
            r15 = r4
            r16 = r2
            r19 = r33
            r20 = r5
            r24 = r35
            com.fyber.inneractive.sdk.player.c.h r2 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8116a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.f8676b = r2
        L_0x0508:
            int r9 = r7 + r12
            r0.mo19386c(r9)
            int r10 = r11 + 1
            r12 = r34
            r15 = r35
            r14 = r1
            r13 = r6
            r11 = 0
            goto L_0x0016
        L_0x0518:
            r6 = r13
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3320b.m8217a(com.fyber.inneractive.sdk.player.c.k.k, int, int, java.lang.String, com.fyber.inneractive.sdk.player.c.c.a, boolean):com.fyber.inneractive.sdk.player.c.d.d.b$c");
    }

    /* renamed from: a */
    private static Pair<long[], long[]> m8215a(C3317a.C3318a aVar) {
        C3317a.C3319b d;
        long j;
        if (aVar == null || (d = aVar.mo19125d(C3317a.f8576Q)) == null) {
            return Pair.create((Object) null, (Object) null);
        }
        C3548k kVar = d.f8657aQ;
        kVar.mo19386c(8);
        int a = C3317a.m8206a(kVar.mo19396j());
        int n = kVar.mo19400n();
        long[] jArr = new long[n];
        long[] jArr2 = new long[n];
        int i = 0;
        while (i < n) {
            jArr[i] = a == 1 ? kVar.mo19402p() : kVar.mo19394h();
            if (a == 1) {
                j = kVar.mo19398l();
            } else {
                j = (long) kVar.mo19396j();
            }
            jArr2[i] = j;
            byte[] bArr = kVar.f9625a;
            int i2 = kVar.f9626b;
            kVar.f9626b = i2 + 1;
            byte[] bArr2 = kVar.f9625a;
            int i3 = kVar.f9626b;
            kVar.f9626b = i3 + 1;
            if (((short) (((bArr[i2] & 255) << 8) | (bArr2[i3] & 255))) == 1) {
                kVar.mo19388d(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m8216a(C3548k kVar, int i) {
        kVar.mo19386c(i + 8 + 4);
        kVar.mo19388d(1);
        m8213a(kVar);
        kVar.mo19388d(2);
        int d = kVar.mo19387d();
        if ((d & 128) != 0) {
            kVar.mo19388d(2);
        }
        if ((d & 64) != 0) {
            kVar.mo19388d(kVar.mo19389e());
        }
        if ((d & 32) != 0) {
            kVar.mo19388d(2);
        }
        kVar.mo19388d(1);
        m8213a(kVar);
        int d2 = kVar.mo19387d();
        String str = null;
        if (d2 == 32) {
            str = "video/mp4v-es";
        } else if (d2 == 33) {
            str = "video/avc";
        } else if (d2 != 35) {
            if (d2 != 64) {
                if (d2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (d2 == 165) {
                    str = "audio/ac3";
                } else if (d2 != 166) {
                    switch (d2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (d2) {
                                case 169:
                                case TsExtractor.TS_STREAM_TYPE_AC4 /*172*/:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        kVar.mo19388d(12);
        kVar.mo19388d(1);
        int a = m8213a(kVar);
        byte[] bArr = new byte[a];
        kVar.mo19382a(bArr, 0, a);
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    private static int m8213a(C3548k kVar) {
        int d = kVar.mo19387d();
        int i = d & 127;
        while ((d & 128) == 128) {
            d = kVar.mo19387d();
            i = (i << 7) | (d & 127);
        }
        return i;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$a */
    private static final class C3321a {

        /* renamed from: a */
        public final int f8666a;

        /* renamed from: b */
        public int f8667b;

        /* renamed from: c */
        public int f8668c;

        /* renamed from: d */
        public long f8669d;

        /* renamed from: e */
        private final boolean f8670e;

        /* renamed from: f */
        private final C3548k f8671f;

        /* renamed from: g */
        private final C3548k f8672g;

        /* renamed from: h */
        private int f8673h;

        /* renamed from: i */
        private int f8674i;

        public C3321a(C3548k kVar, C3548k kVar2, boolean z) {
            this.f8672g = kVar;
            this.f8671f = kVar2;
            this.f8670e = z;
            kVar2.mo19386c(12);
            this.f8666a = kVar2.mo19400n();
            kVar.mo19386c(12);
            this.f8674i = kVar.mo19400n();
            C3535a.m8785b(kVar.mo19396j() != 1 ? false : true, "first_chunk must be 1");
            this.f8667b = -1;
        }

        /* renamed from: a */
        public final boolean mo19127a() {
            long j;
            int i = this.f8667b + 1;
            this.f8667b = i;
            if (i == this.f8666a) {
                return false;
            }
            if (this.f8670e) {
                j = this.f8671f.mo19402p();
            } else {
                j = this.f8671f.mo19394h();
            }
            this.f8669d = j;
            if (this.f8667b == this.f8673h) {
                this.f8668c = this.f8672g.mo19400n();
                this.f8672g.mo19388d(4);
                int i2 = this.f8674i - 1;
                this.f8674i = i2;
                this.f8673h = i2 > 0 ? this.f8672g.mo19400n() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$f */
    private static final class C3326f {

        /* renamed from: a */
        final int f8687a;

        /* renamed from: b */
        final long f8688b;

        /* renamed from: c */
        final int f8689c;

        public C3326f(int i, long j, int i2) {
            this.f8687a = i;
            this.f8688b = j;
            this.f8689c = i2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$c */
    private static final class C3323c {

        /* renamed from: a */
        public final C3340j[] f8675a;

        /* renamed from: b */
        public C3290h f8676b;

        /* renamed from: c */
        public int f8677c;

        /* renamed from: d */
        public int f8678d = 0;

        public C3323c(int i) {
            this.f8675a = new C3340j[i];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$d */
    static final class C3324d implements C3322b {

        /* renamed from: a */
        private final int f8679a = this.f8681c.mo19400n();

        /* renamed from: b */
        private final int f8680b = this.f8681c.mo19400n();

        /* renamed from: c */
        private final C3548k f8681c;

        public C3324d(C3317a.C3319b bVar) {
            C3548k kVar = bVar.f8657aQ;
            this.f8681c = kVar;
            kVar.mo19386c(12);
        }

        /* renamed from: a */
        public final int mo19128a() {
            return this.f8680b;
        }

        /* renamed from: b */
        public final int mo19129b() {
            int i = this.f8679a;
            return i == 0 ? this.f8681c.mo19400n() : i;
        }

        /* renamed from: c */
        public final boolean mo19130c() {
            return this.f8679a != 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.b$e */
    static final class C3325e implements C3322b {

        /* renamed from: a */
        private final C3548k f8682a;

        /* renamed from: b */
        private final int f8683b = this.f8682a.mo19400n();

        /* renamed from: c */
        private final int f8684c = (this.f8682a.mo19400n() & 255);

        /* renamed from: d */
        private int f8685d;

        /* renamed from: e */
        private int f8686e;

        /* renamed from: c */
        public final boolean mo19130c() {
            return false;
        }

        public C3325e(C3317a.C3319b bVar) {
            C3548k kVar = bVar.f8657aQ;
            this.f8682a = kVar;
            kVar.mo19386c(12);
        }

        /* renamed from: a */
        public final int mo19128a() {
            return this.f8683b;
        }

        /* renamed from: b */
        public final int mo19129b() {
            int i = this.f8684c;
            if (i == 8) {
                return this.f8682a.mo19387d();
            }
            if (i == 16) {
                return this.f8682a.mo19389e();
            }
            int i2 = this.f8685d;
            this.f8685d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f8686e & 15;
            }
            int d = this.f8682a.mo19387d();
            this.f8686e = d;
            return (d & 240) >> 4;
        }
    }

    /* renamed from: a */
    private static int m8214a(C3548k kVar, int i, int i2, C3323c cVar, int i3) {
        int i4 = kVar.f9626b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            kVar.mo19386c(i4);
            int j = kVar.mo19396j();
            C3535a.m8783a(j > 0, (Object) "childAtomSize should be positive");
            if (kVar.mo19396j() == C3317a.f8581V) {
                int i5 = i4 + 8;
                Pair pair = null;
                Integer num = null;
                C3340j jVar = null;
                boolean z2 = false;
                while (i5 - i4 < j) {
                    kVar.mo19386c(i5);
                    int j2 = kVar.mo19396j();
                    int j3 = kVar.mo19396j();
                    if (j3 == C3317a.f8603ab) {
                        num = Integer.valueOf(kVar.mo19396j());
                    } else if (j3 == C3317a.f8582W) {
                        kVar.mo19388d(4);
                        z2 = kVar.mo19396j() == f8664g;
                    } else if (j3 == C3317a.f8583X) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= j2) {
                                jVar = null;
                                break;
                            }
                            kVar.mo19386c(i6);
                            int j4 = kVar.mo19396j();
                            if (kVar.mo19396j() == C3317a.f8584Y) {
                                kVar.mo19388d(6);
                                boolean z3 = kVar.mo19387d() == 1;
                                int d = kVar.mo19387d();
                                byte[] bArr = new byte[16];
                                kVar.mo19382a(bArr, 0, 16);
                                jVar = new C3340j(z3, d, bArr);
                            } else {
                                i6 += j4;
                            }
                        }
                    }
                    i5 += j2;
                }
                if (z2) {
                    C3535a.m8783a(num != null, (Object) "frma atom is mandatory");
                    if (jVar != null) {
                        z = true;
                    }
                    C3535a.m8783a(z, (Object) "schi->tenc atom is mandatory");
                    pair = Pair.create(num, jVar);
                }
                if (pair != null) {
                    cVar.f8675a[i3] = (C3340j) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C3323c cVar2 = cVar;
            i4 += j;
        }
    }
}
