package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.appsflyer.ServerParameters;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import com.google.android.gms.internal.ads.zzln;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzkj {
    private static final int zzavb = zzov.zzbj(ServerParameters.META);
    private static final int zzavp = zzov.zzbj("vide");
    private static final int zzavq = zzov.zzbj("soun");
    private static final int zzavr = zzov.zzbj("text");
    private static final int zzavs = zzov.zzbj("sbtl");
    private static final int zzavt = zzov.zzbj("subt");
    private static final int zzavu = zzov.zzbj("clcp");
    private static final int zzavv = zzov.zzbj("cenc");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x049b: MOVE  (r10v11 java.lang.String) = (r25v11 java.lang.String)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0485 A[SYNTHETIC] */
    public static com.google.android.gms.internal.ads.zzkx zza(com.google.android.gms.internal.ads.zzkh r50, com.google.android.gms.internal.ads.zzkk r51, long r52, com.google.android.gms.internal.ads.zzja r54, boolean r55) throws com.google.android.gms.internal.ads.zzhi {
        /*
            r0 = r50
            int r1 = com.google.android.gms.internal.ads.zzki.zzate
            com.google.android.gms.internal.ads.zzkh r1 = r0.zzao(r1)
            int r2 = com.google.android.gms.internal.ads.zzki.zzats
            com.google.android.gms.internal.ads.zzkk r2 = r1.zzan(r2)
            com.google.android.gms.internal.ads.zzos r2 = r2.zzavw
            r3 = 16
            r2.zzbi(r3)
            int r2 = r2.readInt()
            int r4 = zzavq
            r5 = 4
            r6 = 3
            r8 = -1
            if (r2 != r4) goto L_0x0022
            r12 = 1
            goto L_0x0042
        L_0x0022:
            int r4 = zzavp
            if (r2 != r4) goto L_0x0028
            r12 = 2
            goto L_0x0042
        L_0x0028:
            int r4 = zzavr
            if (r2 == r4) goto L_0x0041
            int r4 = zzavs
            if (r2 == r4) goto L_0x0041
            int r4 = zzavt
            if (r2 == r4) goto L_0x0041
            int r4 = zzavu
            if (r2 != r4) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r4 = zzavb
            if (r2 != r4) goto L_0x003f
            r12 = 4
            goto L_0x0042
        L_0x003f:
            r12 = -1
            goto L_0x0042
        L_0x0041:
            r12 = 3
        L_0x0042:
            r2 = 0
            if (r12 != r8) goto L_0x0046
            return r2
        L_0x0046:
            int r4 = com.google.android.gms.internal.ads.zzki.zzato
            com.google.android.gms.internal.ads.zzkk r4 = r0.zzan(r4)
            com.google.android.gms.internal.ads.zzos r4 = r4.zzavw
            r10 = 8
            r4.zzbi(r10)
            int r11 = r4.readInt()
            int r11 = com.google.android.gms.internal.ads.zzki.zzap(r11)
            if (r11 != 0) goto L_0x0060
            r13 = 8
            goto L_0x0062
        L_0x0060:
            r13 = 16
        L_0x0062:
            r4.zzbj(r13)
            int r13 = r4.readInt()
            r4.zzbj(r5)
            int r14 = r4.getPosition()
            if (r11 != 0) goto L_0x0074
            r15 = 4
            goto L_0x0076
        L_0x0074:
            r15 = 8
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 >= r15) goto L_0x0086
            byte[] r7 = r4.data
            int r16 = r14 + r9
            byte r7 = r7[r16]
            if (r7 == r8) goto L_0x0083
            r7 = 0
            goto L_0x0087
        L_0x0083:
            int r9 = r9 + 1
            goto L_0x0077
        L_0x0086:
            r7 = 1
        L_0x0087:
            r16 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x0096
            r4.zzbj(r15)
        L_0x0093:
            r14 = r18
            goto L_0x00a6
        L_0x0096:
            if (r11 != 0) goto L_0x009d
            long r14 = r4.zzjb()
            goto L_0x00a1
        L_0x009d:
            long r14 = r4.zzjf()
        L_0x00a1:
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x00a6
            goto L_0x0093
        L_0x00a6:
            r4.zzbj(r3)
            int r7 = r4.readInt()
            int r9 = r4.readInt()
            r4.zzbj(r5)
            int r11 = r4.readInt()
            int r4 = r4.readInt()
            r5 = 65536(0x10000, float:9.18355E-41)
            r3 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x00cb
            if (r9 != r5) goto L_0x00cb
            if (r11 != r3) goto L_0x00cb
            if (r4 != 0) goto L_0x00cb
            r3 = 90
            goto L_0x00e2
        L_0x00cb:
            if (r7 != 0) goto L_0x00d6
            if (r9 != r3) goto L_0x00d6
            if (r11 != r5) goto L_0x00d6
            if (r4 != 0) goto L_0x00d6
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x00e2
        L_0x00d6:
            if (r7 != r3) goto L_0x00e1
            if (r9 != 0) goto L_0x00e1
            if (r11 != 0) goto L_0x00e1
            if (r4 != r3) goto L_0x00e1
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            com.google.android.gms.internal.ads.zzkp r4 = new com.google.android.gms.internal.ads.zzkp
            r4.<init>(r13, r14, r3)
            long r22 = r4.zzcw
            r3 = r51
            com.google.android.gms.internal.ads.zzos r3 = r3.zzavw
            r3.zzbi(r10)
            int r5 = r3.readInt()
            int r5 = com.google.android.gms.internal.ads.zzki.zzap(r5)
            if (r5 != 0) goto L_0x00ff
            r5 = 8
            goto L_0x0101
        L_0x00ff:
            r5 = 16
        L_0x0101:
            r3.zzbj(r5)
            long r28 = r3.zzjb()
            int r3 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x010d
            goto L_0x0118
        L_0x010d:
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r26 = r28
            long r13 = com.google.android.gms.internal.ads.zzov.zza((long) r22, (long) r24, (long) r26)
            r18 = r13
        L_0x0118:
            int r3 = com.google.android.gms.internal.ads.zzki.zzatf
            com.google.android.gms.internal.ads.zzkh r3 = r1.zzao(r3)
            int r5 = com.google.android.gms.internal.ads.zzki.zzatg
            com.google.android.gms.internal.ads.zzkh r3 = r3.zzao(r5)
            int r5 = com.google.android.gms.internal.ads.zzki.zzatr
            com.google.android.gms.internal.ads.zzkk r1 = r1.zzan(r5)
            com.google.android.gms.internal.ads.zzos r1 = r1.zzavw
            r1.zzbi(r10)
            int r5 = r1.readInt()
            int r5 = com.google.android.gms.internal.ads.zzki.zzap(r5)
            if (r5 != 0) goto L_0x013c
            r7 = 8
            goto L_0x013e
        L_0x013c:
            r7 = 16
        L_0x013e:
            r1.zzbj(r7)
            long r13 = r1.zzjb()
            if (r5 != 0) goto L_0x0149
            r5 = 4
            goto L_0x014b
        L_0x0149:
            r5 = 8
        L_0x014b:
            r1.zzbj(r5)
            int r1 = r1.readUnsignedShort()
            int r5 = r1 >> 10
            r5 = r5 & 31
            int r5 = r5 + 96
            char r5 = (char) r5
            int r7 = r1 >> 5
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r5)
            r9.append(r7)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            int r5 = com.google.android.gms.internal.ads.zzki.zzatt
            com.google.android.gms.internal.ads.zzkk r3 = r3.zzan(r5)
            com.google.android.gms.internal.ads.zzos r3 = r3.zzavw
            int r5 = r4.f10088id
            int r7 = r4.zzagn
            java.lang.Object r9 = r1.second
            java.lang.String r9 = (java.lang.String) r9
            r11 = 12
            r3.zzbi(r11)
            int r11 = r3.readInt()
            com.google.android.gms.internal.ads.zzko r13 = new com.google.android.gms.internal.ads.zzko
            r13.<init>(r11)
            r14 = 0
        L_0x01a2:
            if (r14 >= r11) goto L_0x0678
            int r15 = r3.getPosition()
            int r6 = r3.readInt()
            if (r6 <= 0) goto L_0x01b0
            r10 = 1
            goto L_0x01b1
        L_0x01b0:
            r10 = 0
        L_0x01b1:
            java.lang.String r2 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzoh.checkArgument(r10, r2)
            int r10 = r3.readInt()
            int r8 = com.google.android.gms.internal.ads.zzki.zzasb
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzasc
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzatz
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzaul
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzasd
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzase
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzasf
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzavk
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.zzki.zzavl
            if (r10 != r8) goto L_0x01e0
            goto L_0x04d3
        L_0x01e0:
            int r8 = com.google.android.gms.internal.ads.zzki.zzasi
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzaua
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasn
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasp
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasr
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasu
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzass
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzast
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzauy
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzauz
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasl
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasm
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzasj
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.zzki.zzavo
            if (r10 != r8) goto L_0x021a
            goto L_0x02b8
        L_0x021a:
            int r2 = com.google.android.gms.internal.ads.zzki.zzauj
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.zzki.zzauu
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.zzki.zzauv
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.zzki.zzauw
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.zzki.zzaux
            if (r10 != r2) goto L_0x022f
            goto L_0x0249
        L_0x022f:
            int r2 = com.google.android.gms.internal.ads.zzki.zzavn
            if (r10 != r2) goto L_0x0245
            java.lang.String r2 = java.lang.Integer.toString(r5)
            java.lang.String r8 = "application/x-camera-motion"
            r51 = r11
            r10 = -1
            r11 = 0
            com.google.android.gms.internal.ads.zzhf r2 = com.google.android.gms.internal.ads.zzhf.zza(r2, r8, r11, r10, r11)
            r13.zzahd = r2
            goto L_0x02fb
        L_0x0245:
            r51 = r11
            goto L_0x02fb
        L_0x0249:
            r51 = r11
            int r2 = r15 + 8
            r8 = 8
            int r2 = r2 + r8
            r3.zzbi(r2)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.zzki.zzauj
            java.lang.String r11 = "application/ttml+xml"
            if (r10 != r2) goto L_0x0265
            r31 = r11
        L_0x0260:
            r38 = r25
        L_0x0262:
            r40 = 0
            goto L_0x029b
        L_0x0265:
            int r2 = com.google.android.gms.internal.ads.zzki.zzauu
            if (r10 != r2) goto L_0x027f
            int r2 = r6 + -8
            int r2 = r2 - r8
            byte[] r8 = new byte[r2]
            r10 = 0
            r3.zze(r8, r10, r2)
            java.util.List r2 = java.util.Collections.singletonList(r8)
            java.lang.String r8 = "application/x-quicktime-tx3g"
            r40 = r2
            r31 = r8
            r38 = r25
            goto L_0x029b
        L_0x027f:
            int r2 = com.google.android.gms.internal.ads.zzki.zzauv
            if (r10 != r2) goto L_0x0288
            java.lang.String r2 = "application/x-mp4-vtt"
        L_0x0285:
            r31 = r2
            goto L_0x0260
        L_0x0288:
            int r2 = com.google.android.gms.internal.ads.zzki.zzauw
            if (r10 != r2) goto L_0x0291
            r31 = r11
            r38 = r16
            goto L_0x0262
        L_0x0291:
            int r2 = com.google.android.gms.internal.ads.zzki.zzaux
            if (r10 != r2) goto L_0x02b2
            r2 = 1
            r13.zzawh = r2
            java.lang.String r2 = "application/x-mp4-cea-608"
            goto L_0x0285
        L_0x029b:
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = 0
            r36 = -1
            r37 = 0
            r35 = r9
            com.google.android.gms.internal.ads.zzhf r2 = com.google.android.gms.internal.ads.zzhf.zza(r30, r31, r32, r33, r34, r35, r36, r37, r38, r40)
            r13.zzahd = r2
            goto L_0x02fb
        L_0x02b2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02b8:
            r51 = r11
            int r8 = r15 + 8
            r11 = 8
            int r8 = r8 + r11
            r3.zzbi(r8)
            r8 = 6
            if (r55 == 0) goto L_0x02cf
            int r22 = r3.readUnsignedShort()
            r3.zzbj(r8)
            r11 = r22
            goto L_0x02d3
        L_0x02cf:
            r3.zzbj(r11)
            r11 = 0
        L_0x02d3:
            if (r11 == 0) goto L_0x0306
            r8 = 1
            if (r11 != r8) goto L_0x02d9
            goto L_0x0306
        L_0x02d9:
            r8 = 2
            if (r11 != r8) goto L_0x02fb
            r8 = 16
            r3.zzbj(r8)
            long r25 = r3.readLong()
            double r25 = java.lang.Double.longBitsToDouble(r25)
            r8 = r12
            long r11 = java.lang.Math.round(r25)
            int r12 = (int) r11
            int r11 = r3.zzje()
            r25 = r11
            r11 = 20
            r3.zzbj(r11)
            goto L_0x0323
        L_0x02fb:
            r46 = r1
            r47 = r4
            r48 = r7
            r45 = r12
        L_0x0303:
            r1 = 3
            goto L_0x065f
        L_0x0306:
            r8 = r12
            int r12 = r3.readUnsignedShort()
            r26 = r12
            r12 = 6
            r3.zzbj(r12)
            int r12 = r3.zzjd()
            r25 = r12
            r12 = 1
            if (r11 != r12) goto L_0x031f
            r11 = 16
            r3.zzbj(r11)
        L_0x031f:
            r12 = r25
            r25 = r26
        L_0x0323:
            int r11 = r3.getPosition()
            r26 = r12
            int r12 = com.google.android.gms.internal.ads.zzki.zzaua
            if (r10 != r12) goto L_0x0334
            int r10 = zza((com.google.android.gms.internal.ads.zzos) r3, (int) r15, (int) r6, (com.google.android.gms.internal.ads.zzko) r13, (int) r14)
            r3.zzbi(r11)
        L_0x0334:
            int r12 = com.google.android.gms.internal.ads.zzki.zzasn
            r27 = r11
            java.lang.String r11 = "audio/raw"
            if (r10 != r12) goto L_0x033f
            java.lang.String r10 = "audio/ac3"
            goto L_0x0388
        L_0x033f:
            int r12 = com.google.android.gms.internal.ads.zzki.zzasp
            if (r10 != r12) goto L_0x0346
            java.lang.String r10 = "audio/eac3"
            goto L_0x0388
        L_0x0346:
            int r12 = com.google.android.gms.internal.ads.zzki.zzasr
            if (r10 != r12) goto L_0x034d
            java.lang.String r10 = "audio/vnd.dts"
            goto L_0x0388
        L_0x034d:
            int r12 = com.google.android.gms.internal.ads.zzki.zzass
            if (r10 == r12) goto L_0x0386
            int r12 = com.google.android.gms.internal.ads.zzki.zzast
            if (r10 != r12) goto L_0x0356
            goto L_0x0386
        L_0x0356:
            int r12 = com.google.android.gms.internal.ads.zzki.zzasu
            if (r10 != r12) goto L_0x035d
            java.lang.String r10 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0388
        L_0x035d:
            int r12 = com.google.android.gms.internal.ads.zzki.zzauy
            if (r10 != r12) goto L_0x0364
            java.lang.String r10 = "audio/3gpp"
            goto L_0x0388
        L_0x0364:
            int r12 = com.google.android.gms.internal.ads.zzki.zzauz
            if (r10 != r12) goto L_0x036b
            java.lang.String r10 = "audio/amr-wb"
            goto L_0x0388
        L_0x036b:
            int r12 = com.google.android.gms.internal.ads.zzki.zzasl
            if (r10 == r12) goto L_0x0384
            int r12 = com.google.android.gms.internal.ads.zzki.zzasm
            if (r10 != r12) goto L_0x0374
            goto L_0x0384
        L_0x0374:
            int r12 = com.google.android.gms.internal.ads.zzki.zzasj
            if (r10 != r12) goto L_0x037b
            java.lang.String r10 = "audio/mpeg"
            goto L_0x0388
        L_0x037b:
            int r12 = com.google.android.gms.internal.ads.zzki.zzavo
            if (r10 != r12) goto L_0x0382
            java.lang.String r10 = "audio/alac"
            goto L_0x0388
        L_0x0382:
            r10 = 0
            goto L_0x0388
        L_0x0384:
            r10 = r11
            goto L_0x0388
        L_0x0386:
            java.lang.String r10 = "audio/vnd.dts.hd"
        L_0x0388:
            r45 = r8
            r12 = 0
            r49 = r25
            r25 = r10
            r10 = r27
            r27 = r26
            r26 = r49
        L_0x0395:
            int r8 = r10 - r15
            if (r8 >= r6) goto L_0x0490
            r3.zzbi(r10)
            int r8 = r3.readInt()
            r46 = r1
            if (r8 <= 0) goto L_0x03a6
            r1 = 1
            goto L_0x03a7
        L_0x03a6:
            r1 = 0
        L_0x03a7:
            com.google.android.gms.internal.ads.zzoh.checkArgument(r1, r2)
            int r1 = r3.readInt()
            r47 = r4
            int r4 = com.google.android.gms.internal.ads.zzki.zzatj
            if (r1 == r4) goto L_0x041c
            if (r55 == 0) goto L_0x03bb
            int r4 = com.google.android.gms.internal.ads.zzki.zzask
            if (r1 != r4) goto L_0x03bb
            goto L_0x041c
        L_0x03bb:
            int r4 = com.google.android.gms.internal.ads.zzki.zzaso
            if (r1 != r4) goto L_0x03d1
            int r1 = r10 + 8
            r3.zzbi(r1)
            java.lang.String r1 = java.lang.Integer.toString(r5)
            r4 = 0
            com.google.android.gms.internal.ads.zzhf r1 = com.google.android.gms.internal.ads.zzht.zza(r3, r1, r9, r4)
            r13.zzahd = r1
        L_0x03cf:
            r4 = 0
            goto L_0x0417
        L_0x03d1:
            int r4 = com.google.android.gms.internal.ads.zzki.zzasq
            if (r1 != r4) goto L_0x03e6
            int r1 = r10 + 8
            r3.zzbi(r1)
            java.lang.String r1 = java.lang.Integer.toString(r5)
            r4 = 0
            com.google.android.gms.internal.ads.zzhf r1 = com.google.android.gms.internal.ads.zzht.zzb(r3, r1, r9, r4)
            r13.zzahd = r1
            goto L_0x03cf
        L_0x03e6:
            int r4 = com.google.android.gms.internal.ads.zzki.zzasv
            if (r1 != r4) goto L_0x0409
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = -1
            r37 = 0
            r38 = 0
            r39 = 0
            r31 = r25
            r35 = r26
            r36 = r27
            r40 = r9
            com.google.android.gms.internal.ads.zzhf r1 = com.google.android.gms.internal.ads.zzhf.zza(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r13.zzahd = r1
            goto L_0x03cf
        L_0x0409:
            int r4 = com.google.android.gms.internal.ads.zzki.zzavo
            if (r1 != r4) goto L_0x03cf
            byte[] r1 = new byte[r8]
            r3.zzbi(r10)
            r4 = 0
            r3.zze(r1, r4, r8)
            r12 = r1
        L_0x0417:
            r48 = r7
            r0 = -1
            goto L_0x0485
        L_0x041c:
            int r4 = com.google.android.gms.internal.ads.zzki.zzatj
            if (r1 != r4) goto L_0x0425
            r48 = r7
            r1 = r10
        L_0x0423:
            r0 = -1
            goto L_0x0451
        L_0x0425:
            int r1 = r3.getPosition()
        L_0x0429:
            int r4 = r1 - r10
            if (r4 >= r8) goto L_0x044d
            r3.zzbi(r1)
            int r4 = r3.readInt()
            if (r4 <= 0) goto L_0x0438
            r0 = 1
            goto L_0x0439
        L_0x0438:
            r0 = 0
        L_0x0439:
            com.google.android.gms.internal.ads.zzoh.checkArgument(r0, r2)
            int r0 = r3.readInt()
            r48 = r7
            int r7 = com.google.android.gms.internal.ads.zzki.zzatj
            if (r0 != r7) goto L_0x0447
            goto L_0x0423
        L_0x0447:
            int r1 = r1 + r4
            r0 = r50
            r7 = r48
            goto L_0x0429
        L_0x044d:
            r48 = r7
            r0 = -1
            r1 = -1
        L_0x0451:
            if (r1 == r0) goto L_0x0485
            android.util.Pair r1 = zzb(r3, r1)
            java.lang.Object r4 = r1.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.second
            r12 = r1
            byte[] r12 = (byte[]) r12
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0483
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzok.zze(r12)
            java.lang.Object r7 = r1.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r26 = r1
            r25 = r4
            r27 = r7
            goto L_0x0485
        L_0x0483:
            r25 = r4
        L_0x0485:
            int r10 = r10 + r8
            r0 = r50
            r1 = r46
            r4 = r47
            r7 = r48
            goto L_0x0395
        L_0x0490:
            r46 = r1
            r47 = r4
            r48 = r7
            r0 = -1
            com.google.android.gms.internal.ads.zzhf r1 = r13.zzahd
            if (r1 != 0) goto L_0x0303
            r10 = r25
            if (r10 == 0) goto L_0x0303
            boolean r1 = r11.equals(r10)
            if (r1 == 0) goto L_0x04a8
            r37 = 2
            goto L_0x04aa
        L_0x04a8:
            r37 = -1
        L_0x04aa:
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = -1
            if (r12 != 0) goto L_0x04b9
            r38 = 0
            goto L_0x04bf
        L_0x04b9:
            java.util.List r1 = java.util.Collections.singletonList(r12)
            r38 = r1
        L_0x04bf:
            r39 = 0
            r40 = 0
            r31 = r10
            r35 = r26
            r36 = r27
            r41 = r9
            com.google.android.gms.internal.ads.zzhf r1 = com.google.android.gms.internal.ads.zzhf.zza(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r13.zzahd = r1
            goto L_0x0303
        L_0x04d3:
            r46 = r1
            r47 = r4
            r48 = r7
            r51 = r11
            r45 = r12
            r0 = -1
            int r1 = r15 + 8
            r4 = 8
            int r1 = r1 + r4
            r3.zzbi(r1)
            r1 = 16
            r3.zzbj(r1)
            int r35 = r3.readUnsignedShort()
            int r36 = r3.readUnsignedShort()
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 50
            r3.zzbj(r7)
            int r7 = r3.getPosition()
            int r8 = com.google.android.gms.internal.ads.zzki.zzatz
            if (r10 != r8) goto L_0x0509
            int r10 = zza((com.google.android.gms.internal.ads.zzos) r3, (int) r15, (int) r6, (com.google.android.gms.internal.ads.zzko) r13, (int) r14)
            r3.zzbi(r7)
        L_0x0509:
            r4 = 0
            r31 = 0
            r38 = 0
            r40 = 1065353216(0x3f800000, float:1.0)
            r41 = 0
            r42 = -1
        L_0x0514:
            int r8 = r7 - r15
            if (r8 >= r6) goto L_0x0644
            r3.zzbi(r7)
            int r8 = r3.getPosition()
            int r11 = r3.readInt()
            if (r11 != 0) goto L_0x052c
            int r12 = r3.getPosition()
            int r12 = r12 - r15
            if (r12 == r6) goto L_0x0644
        L_0x052c:
            if (r11 <= 0) goto L_0x0530
            r12 = 1
            goto L_0x0531
        L_0x0530:
            r12 = 0
        L_0x0531:
            com.google.android.gms.internal.ads.zzoh.checkArgument(r12, r2)
            int r12 = r3.readInt()
            int r0 = com.google.android.gms.internal.ads.zzki.zzath
            if (r12 != r0) goto L_0x055c
            if (r31 != 0) goto L_0x0540
            r0 = 1
            goto L_0x0541
        L_0x0540:
            r0 = 0
        L_0x0541:
            com.google.android.gms.internal.ads.zzoh.checkState(r0)
            int r8 = r8 + 8
            r3.zzbi(r8)
            com.google.android.gms.internal.ads.zzox r0 = com.google.android.gms.internal.ads.zzox.zzf(r3)
            java.util.List<byte[]> r8 = r0.zzagk
            int r12 = r0.zzart
            r13.zzart = r12
            if (r4 != 0) goto L_0x0559
            float r0 = r0.zzbhm
            r40 = r0
        L_0x0559:
            java.lang.String r31 = "video/avc"
            goto L_0x0579
        L_0x055c:
            int r0 = com.google.android.gms.internal.ads.zzki.zzati
            if (r12 != r0) goto L_0x0580
            if (r31 != 0) goto L_0x0564
            r0 = 1
            goto L_0x0565
        L_0x0564:
            r0 = 0
        L_0x0565:
            com.google.android.gms.internal.ads.zzoh.checkState(r0)
            int r8 = r8 + 8
            r3.zzbi(r8)
            com.google.android.gms.internal.ads.zzpd r0 = com.google.android.gms.internal.ads.zzpd.zzh(r3)
            java.util.List<byte[]> r8 = r0.zzagk
            int r0 = r0.zzart
            r13.zzart = r0
            java.lang.String r31 = "video/hevc"
        L_0x0579:
            r25 = r2
            r38 = r8
        L_0x057d:
            r1 = 3
            goto L_0x063c
        L_0x0580:
            int r0 = com.google.android.gms.internal.ads.zzki.zzavm
            if (r12 != r0) goto L_0x0598
            if (r31 != 0) goto L_0x0588
            r0 = 1
            goto L_0x0589
        L_0x0588:
            r0 = 0
        L_0x0589:
            com.google.android.gms.internal.ads.zzoh.checkState(r0)
            int r0 = com.google.android.gms.internal.ads.zzki.zzavk
            if (r10 != r0) goto L_0x0593
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0595
        L_0x0593:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0595:
            r31 = r0
            goto L_0x05a6
        L_0x0598:
            int r0 = com.google.android.gms.internal.ads.zzki.zzasg
            if (r12 != r0) goto L_0x05a9
            if (r31 != 0) goto L_0x05a0
            r0 = 1
            goto L_0x05a1
        L_0x05a0:
            r0 = 0
        L_0x05a1:
            com.google.android.gms.internal.ads.zzoh.checkState(r0)
            java.lang.String r31 = "video/3gpp"
        L_0x05a6:
            r25 = r2
            goto L_0x057d
        L_0x05a9:
            int r0 = com.google.android.gms.internal.ads.zzki.zzatj
            if (r12 != r0) goto L_0x05c8
            if (r31 != 0) goto L_0x05b1
            r0 = 1
            goto L_0x05b2
        L_0x05b1:
            r0 = 0
        L_0x05b2:
            com.google.android.gms.internal.ads.zzoh.checkState(r0)
            android.util.Pair r0 = zzb(r3, r8)
            java.lang.Object r8 = r0.first
            r31 = r8
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r38 = java.util.Collections.singletonList(r0)
            goto L_0x05a6
        L_0x05c8:
            int r0 = com.google.android.gms.internal.ads.zzki.zzaui
            if (r12 != r0) goto L_0x05e2
            int r8 = r8 + 8
            r3.zzbi(r8)
            int r0 = r3.zzje()
            int r4 = r3.zzje()
            float r0 = (float) r0
            float r4 = (float) r4
            float r40 = r0 / r4
            r25 = r2
            r1 = 3
            r4 = 1
            goto L_0x063c
        L_0x05e2:
            int r0 = com.google.android.gms.internal.ads.zzki.zzavi
            if (r12 != r0) goto L_0x0612
            int r0 = r8 + 8
        L_0x05e8:
            int r12 = r0 - r8
            if (r12 >= r11) goto L_0x060b
            r3.zzbi(r0)
            int r12 = r3.readInt()
            int r1 = r3.readInt()
            r25 = r2
            int r2 = com.google.android.gms.internal.ads.zzki.zzavj
            if (r1 != r2) goto L_0x0605
            byte[] r1 = r3.data
            int r12 = r12 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r12)
            goto L_0x060e
        L_0x0605:
            int r0 = r0 + r12
            r2 = r25
            r1 = 16
            goto L_0x05e8
        L_0x060b:
            r25 = r2
            r0 = 0
        L_0x060e:
            r41 = r0
            goto L_0x057d
        L_0x0612:
            r25 = r2
            int r0 = com.google.android.gms.internal.ads.zzki.zzavh
            if (r12 != r0) goto L_0x057d
            int r0 = r3.readUnsignedByte()
            r1 = 3
            r3.zzbj(r1)
            if (r0 != 0) goto L_0x063c
            int r0 = r3.readUnsignedByte()
            if (r0 == 0) goto L_0x063a
            r2 = 1
            if (r0 == r2) goto L_0x0637
            r2 = 2
            if (r0 == r2) goto L_0x0634
            if (r0 == r1) goto L_0x0631
            goto L_0x063c
        L_0x0631:
            r42 = 3
            goto L_0x063c
        L_0x0634:
            r42 = 2
            goto L_0x063c
        L_0x0637:
            r42 = 1
            goto L_0x063c
        L_0x063a:
            r42 = 0
        L_0x063c:
            int r7 = r7 + r11
            r2 = r25
            r0 = -1
            r1 = 16
            goto L_0x0514
        L_0x0644:
            r1 = 3
            if (r31 == 0) goto L_0x065f
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = -1
            r37 = -1082130432(0xffffffffbf800000, float:-1.0)
            r43 = 0
            r44 = 0
            r39 = r48
            com.google.android.gms.internal.ads.zzhf r0 = com.google.android.gms.internal.ads.zzhf.zza(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r13.zzahd = r0
        L_0x065f:
            int r15 = r15 + r6
            r3.zzbi(r15)
            int r14 = r14 + 1
            r0 = r50
            r11 = r51
            r12 = r45
            r1 = r46
            r4 = r47
            r7 = r48
            r2 = 0
            r6 = 3
            r8 = -1
            r10 = 8
            goto L_0x01a2
        L_0x0678:
            r46 = r1
            r47 = r4
            r45 = r12
            int r0 = com.google.android.gms.internal.ads.zzki.zzatp
            r1 = r50
            com.google.android.gms.internal.ads.zzkh r0 = r1.zzao(r0)
            if (r0 == 0) goto L_0x06e3
            int r1 = com.google.android.gms.internal.ads.zzki.zzatq
            com.google.android.gms.internal.ads.zzkk r0 = r0.zzan(r1)
            if (r0 != 0) goto L_0x0691
            goto L_0x06e3
        L_0x0691:
            com.google.android.gms.internal.ads.zzos r0 = r0.zzavw
            r1 = 8
            r0.zzbi(r1)
            int r1 = r0.readInt()
            int r1 = com.google.android.gms.internal.ads.zzki.zzap(r1)
            int r2 = r0.zzje()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r7 = 0
        L_0x06a9:
            if (r7 >= r2) goto L_0x06dc
            r5 = 1
            if (r1 != r5) goto L_0x06b3
            long r8 = r0.zzjf()
            goto L_0x06b7
        L_0x06b3:
            long r8 = r0.zzjb()
        L_0x06b7:
            r3[r7] = r8
            if (r1 != r5) goto L_0x06c0
            long r8 = r0.readLong()
            goto L_0x06c5
        L_0x06c0:
            int r6 = r0.readInt()
            long r8 = (long) r6
        L_0x06c5:
            r4[r7] = r8
            short r6 = r0.readShort()
            if (r6 != r5) goto L_0x06d4
            r6 = 2
            r0.zzbj(r6)
            int r7 = r7 + 1
            goto L_0x06a9
        L_0x06d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x06dc:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x06e8
        L_0x06e3:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x06e8:
            com.google.android.gms.internal.ads.zzhf r2 = r13.zzahd
            if (r2 != 0) goto L_0x06ed
            return r0
        L_0x06ed:
            com.google.android.gms.internal.ads.zzkx r0 = new com.google.android.gms.internal.ads.zzkx
            int r11 = r47.f10088id
            r2 = r46
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            com.google.android.gms.internal.ads.zzhf r4 = r13.zzahd
            int r5 = r13.zzawh
            com.google.android.gms.internal.ads.zzla[] r6 = r13.zzawg
            int r7 = r13.zzart
            java.lang.Object r8 = r1.first
            r23 = r8
            long[] r23 = (long[]) r23
            java.lang.Object r1 = r1.second
            r24 = r1
            long[] r24 = (long[]) r24
            r10 = r0
            r12 = r45
            r13 = r2
            r15 = r28
            r17 = r18
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkj.zza(com.google.android.gms.internal.ads.zzkh, com.google.android.gms.internal.ads.zzkk, long, com.google.android.gms.internal.ads.zzja, boolean):com.google.android.gms.internal.ads.zzkx");
    }

    public static zzkz zza(zzkx zzkx, zzkh zzkh, zzjq zzjq) throws zzhi {
        zzkl zzkl;
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
        zzkx zzkx2;
        int[] iArr3;
        int i5;
        boolean z2;
        long[] jArr3;
        long[] jArr4;
        int[] iArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        zzkx zzkx3 = zzkx;
        zzkh zzkh2 = zzkh;
        zzjq zzjq2 = zzjq;
        zzkk zzan = zzkh2.zzan(zzki.zzauq);
        if (zzan != null) {
            zzkl = new zzkn(zzan);
        } else {
            zzkk zzan2 = zzkh2.zzan(zzki.zzaur);
            if (zzan2 != null) {
                zzkl = new zzkq(zzan2);
            } else {
                throw new zzhi("Track has no sample table size information");
            }
        }
        int zzgw = zzkl.zzgw();
        if (zzgw == 0) {
            return new zzkz(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzkk zzan3 = zzkh2.zzan(zzki.zzaus);
        if (zzan3 == null) {
            zzan3 = zzkh2.zzan(zzki.zzaut);
            z = true;
        } else {
            z = false;
        }
        zzos zzos = zzan3.zzavw;
        zzos zzos2 = zzkh2.zzan(zzki.zzaup).zzavw;
        zzos zzos3 = zzkh2.zzan(zzki.zzaum).zzavw;
        zzkk zzan4 = zzkh2.zzan(zzki.zzaun);
        zzos zzos4 = null;
        zzos zzos5 = zzan4 != null ? zzan4.zzavw : null;
        zzkk zzan5 = zzkh2.zzan(zzki.zzauo);
        zzos zzos6 = zzan5 != null ? zzan5.zzavw : null;
        zzkm zzkm = new zzkm(zzos2, zzos, z);
        zzos3.zzbi(12);
        int zzje = zzos3.zzje() - 1;
        int zzje2 = zzos3.zzje();
        int zzje3 = zzos3.zzje();
        if (zzos6 != null) {
            zzos6.zzbi(12);
            i = zzos6.zzje();
        } else {
            i = 0;
        }
        int i10 = -1;
        if (zzos5 != null) {
            zzos5.zzbi(12);
            i2 = zzos5.zzje();
            if (i2 > 0) {
                i10 = zzos5.zzje() - 1;
                zzos4 = zzos5;
            }
        } else {
            zzos4 = zzos5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzkl.zzgy() && "audio/raw".equals(zzkx3.zzahd.zzagi) && zzje == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[zzgw];
            iArr = new int[zzgw];
            jArr = new long[zzgw];
            int i11 = i2;
            iArr2 = new int[zzgw];
            zzos zzos7 = zzos3;
            int i12 = i10;
            long j3 = 0;
            j = 0;
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i;
            int i18 = zzje3;
            int i19 = zzje2;
            int i20 = zzje;
            int i21 = i11;
            while (i13 < zzgw) {
                while (i15 == 0) {
                    zzoh.checkState(zzkm.zzgz());
                    j3 = zzkm.zzavy;
                    i15 = zzkm.zzavx;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (zzos6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = zzos6.zzje();
                        i16 = zzos6.readInt();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j3;
                iArr[i13] = zzkl.zzgx();
                if (iArr[i13] > i4) {
                    i4 = iArr[i13];
                }
                int i25 = zzgw;
                zzkl zzkl2 = zzkl;
                jArr[i13] = j + ((long) i24);
                iArr2[i13] = zzos4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = zzos4.zzje() - 1;
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
                    i9 = zzos7.zzje();
                    i8 = zzos7.zzje();
                    i20--;
                }
                int i29 = i9;
                j3 += (long) iArr[i13];
                i15--;
                i13++;
                zzgw = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i29;
                zzkl zzkl3 = zzkl2;
                i18 = i8;
                zzkl = zzkl3;
            }
            i3 = zzgw;
            long[] jArr7 = jArr5;
            int i30 = i19;
            zzoh.checkArgument(i14 == 0);
            while (i17 > 0) {
                zzoh.checkArgument(zzos6.zzje() == 0);
                zzos6.readInt();
                i17--;
            }
            if (i21 == 0 && i30 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    zzkx2 = zzkx;
                    jArr2 = jArr7;
                }
            } else {
                i7 = i15;
            }
            zzkx2 = zzkx;
            int i31 = zzkx2.f10089id;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i31);
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
            zzkx2 = zzkx3;
            i3 = zzgw;
            zzkl zzkl4 = zzkl;
            long[] jArr8 = new long[zzkm.length];
            int i32 = zzkm.length;
            int[] iArr5 = new int[i32];
            while (zzkm.zzgz()) {
                jArr8[zzkm.index] = zzkm.zzavy;
                iArr5[zzkm.index] = zzkm.zzavx;
            }
            int zzgx = zzkl4.zzgx();
            long j4 = (long) zzje3;
            int i33 = 8192 / zzgx;
            int i34 = 0;
            for (int i35 = 0; i35 < i32; i35++) {
                i34 += zzov.zzf(iArr5[i35], i33);
            }
            long[] jArr9 = new long[i34];
            int[] iArr6 = new int[i34];
            long[] jArr10 = new long[i34];
            int[] iArr7 = new int[i34];
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i36 < i32) {
                int i40 = iArr5[i36];
                long j5 = jArr8[i36];
                int i41 = i40;
                long[] jArr11 = jArr8;
                int i42 = i41;
                while (i42 > 0) {
                    int min = Math.min(i33, i42);
                    jArr9[i38] = j5;
                    iArr6[i38] = zzgx * min;
                    i39 = Math.max(i39, iArr6[i38]);
                    jArr10[i38] = ((long) i37) * j4;
                    iArr7[i38] = 1;
                    j5 += (long) iArr6[i38];
                    i37 += min;
                    i42 -= min;
                    i38++;
                    i32 = i32;
                    iArr5 = iArr5;
                }
                int i43 = i32;
                int[] iArr8 = iArr5;
                i36++;
                jArr8 = jArr11;
            }
            zzkr zzkr = new zzkr(jArr9, iArr6, i39, jArr10, iArr7);
            jArr2 = zzkr.zzany;
            iArr = zzkr.zzanx;
            i4 = zzkr.zzawl;
            jArr = zzkr.zzawm;
            iArr2 = zzkr.zzawn;
            j = 0;
        }
        if (zzkx2.zzayi == null || zzjq.zzgs()) {
            zzov.zza(jArr, 1000000, zzkx2.zzcv);
            return new zzkz(jArr2, iArr, i4, jArr, iArr2);
        }
        if (zzkx2.zzayi.length == 1 && zzkx2.type == 1 && jArr.length >= 2) {
            long j6 = zzkx2.zzayj[0];
            long zza = zzov.zza(zzkx2.zzayi[0], zzkx2.zzcv, zzkx2.zzayf) + j6;
            if (jArr[0] <= j6 && j6 < jArr[1] && jArr[jArr.length - 1] < zza && zza <= j) {
                long j7 = j - zza;
                long zza2 = zzov.zza(j6 - jArr[0], (long) zzkx2.zzahd.zzagt, zzkx2.zzcv);
                long zza3 = zzov.zza(j7, (long) zzkx2.zzahd.zzagt, zzkx2.zzcv);
                if (!(zza2 == 0 && zza3 == 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    int i44 = (int) zza2;
                    zzjq zzjq3 = zzjq;
                    zzjq3.zzagv = i44;
                    zzjq3.zzagw = (int) zza3;
                    zzov.zza(jArr, 1000000, zzkx2.zzcv);
                    return new zzkz(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        if (zzkx2.zzayi.length == 1) {
            char c = 0;
            if (zzkx2.zzayi[0] == 0) {
                int i45 = 0;
                while (i45 < jArr.length) {
                    jArr[i45] = zzov.zza(jArr[i45] - zzkx2.zzayj[c], 1000000, zzkx2.zzcv);
                    i45++;
                    c = 0;
                }
                return new zzkz(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = zzkx2.type == 1;
        boolean z4 = false;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        while (i47 < zzkx2.zzayi.length) {
            long j8 = zzkx2.zzayj[i47];
            if (j8 != -1) {
                i6 = i4;
                long zza4 = zzov.zza(zzkx2.zzayi[i47], zzkx2.zzcv, zzkx2.zzayf);
                int zzb = zzov.zzb(jArr, j8, true, true);
                int zzb2 = zzov.zzb(jArr, j8 + zza4, z3, false);
                i46 += zzb2 - zzb;
                z4 |= i48 != zzb;
                i48 = zzb2;
            } else {
                i6 = i4;
            }
            i47++;
            i4 = i6;
        }
        int i49 = i4;
        boolean z5 = z4 | (i46 != i3);
        long[] jArr12 = z5 ? new long[i46] : jArr2;
        int[] iArr9 = z5 ? new int[i46] : iArr;
        int i50 = z5 ? 0 : i49;
        int[] iArr10 = z5 ? new int[i46] : iArr2;
        long[] jArr13 = new long[i46];
        int i51 = i50;
        int i52 = 0;
        int i53 = 0;
        while (i52 < zzkx2.zzayi.length) {
            long j9 = zzkx2.zzayj[i52];
            long j10 = zzkx2.zzayi[i52];
            if (j9 != -1) {
                int[] iArr11 = iArr10;
                i5 = i52;
                long j11 = zzkx2.zzcv;
                long[] jArr14 = jArr12;
                long[] jArr15 = jArr2;
                int zzb3 = zzov.zzb(jArr, j9, true, true);
                int zzb4 = zzov.zzb(jArr, zzov.zza(j10, j11, zzkx2.zzayf) + j9, z3, false);
                if (z5) {
                    int i54 = zzb4 - zzb3;
                    jArr3 = jArr14;
                    jArr4 = jArr15;
                    System.arraycopy(jArr4, zzb3, jArr3, i53, i54);
                    System.arraycopy(iArr, zzb3, iArr9, i53, i54);
                    z2 = z3;
                    iArr4 = iArr11;
                    System.arraycopy(iArr2, zzb3, iArr4, i53, i54);
                } else {
                    jArr3 = jArr14;
                    z2 = z3;
                    iArr4 = iArr11;
                    jArr4 = jArr15;
                }
                int i55 = i51;
                while (zzb3 < zzb4) {
                    int[] iArr12 = iArr4;
                    int i56 = zzb4;
                    long j12 = j9;
                    jArr13[i53] = zzov.zza(j2, 1000000, zzkx2.zzayf) + zzov.zza(jArr[zzb3] - j9, 1000000, zzkx2.zzcv);
                    if (z5 && iArr9[i53] > i55) {
                        i55 = iArr[zzb3];
                    }
                    i53++;
                    zzb3++;
                    j9 = j12;
                    zzb4 = i56;
                    iArr4 = iArr12;
                }
                iArr3 = iArr4;
                i51 = i55;
            } else {
                z2 = z3;
                jArr3 = jArr12;
                iArr3 = iArr10;
                i5 = i52;
                jArr4 = jArr2;
            }
            j2 += j10;
            i52 = i5 + 1;
            jArr2 = jArr4;
            jArr12 = jArr3;
            z3 = z2;
            iArr10 = iArr3;
        }
        long[] jArr16 = jArr12;
        int[] iArr13 = iArr10;
        boolean z6 = false;
        for (int i57 = 0; i57 < iArr13.length && !z6; i57++) {
            z6 |= (iArr13[i57] & 1) != 0;
        }
        if (z6) {
            return new zzkz(jArr16, iArr9, i51, jArr13, iArr13);
        }
        throw new zzhi("The edited sample sequence does not contain a sync sample.");
    }

    public static zzln zza(zzkk zzkk, boolean z) {
        if (z) {
            return null;
        }
        zzos zzos = zzkk.zzavw;
        zzos.zzbi(8);
        while (zzos.zziz() >= 8) {
            int position = zzos.getPosition();
            int readInt = zzos.readInt();
            if (zzos.readInt() == zzki.zzavb) {
                zzos.zzbi(position);
                int i = position + readInt;
                zzos.zzbj(12);
                while (true) {
                    if (zzos.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzos.getPosition();
                    int readInt2 = zzos.readInt();
                    if (zzos.readInt() == zzki.zzavc) {
                        zzos.zzbi(position2);
                        int i2 = position2 + readInt2;
                        zzos.zzbj(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzos.getPosition() < i2) {
                            zzln.zza zzd = zzku.zzd(zzos);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzln((List<? extends zzln.zza>) arrayList);
                        }
                    } else {
                        zzos.zzbj(readInt2 - 8);
                    }
                }
                return null;
            }
            zzos.zzbj(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzos zzos, int i) {
        zzos.zzbi(i + 8 + 4);
        zzos.zzbj(1);
        zzc(zzos);
        zzos.zzbj(2);
        int readUnsignedByte = zzos.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzos.zzbj(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzos.zzbj(zzos.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzos.zzbj(2);
        }
        zzos.zzbj(1);
        zzc(zzos);
        int readUnsignedByte2 = zzos.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case TsExtractor.TS_STREAM_TYPE_AC4:
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
        zzos.zzbj(12);
        zzos.zzbj(1);
        int zzc = zzc(zzos);
        byte[] bArr = new byte[zzc];
        zzos.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzos zzos, int i, int i2, zzko zzko, int i3) {
        zzos zzos2 = zzos;
        int position = zzos.getPosition();
        while (true) {
            boolean z = false;
            if (position - i >= i2) {
                return 0;
            }
            zzos.zzbi(position);
            int readInt = zzos.readInt();
            zzoh.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzos.readInt() == zzki.zzatv) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzla zzla = null;
                boolean z2 = false;
                while (i4 - position < readInt) {
                    zzos.zzbi(i4);
                    int readInt2 = zzos.readInt();
                    int readInt3 = zzos.readInt();
                    if (readInt3 == zzki.zzaub) {
                        num = Integer.valueOf(zzos.readInt());
                    } else if (readInt3 == zzki.zzatw) {
                        zzos.zzbj(4);
                        z2 = zzos.readInt() == zzavv;
                    } else if (readInt3 == zzki.zzatx) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzla = null;
                                break;
                            }
                            zzos.zzbi(i5);
                            int readInt4 = zzos.readInt();
                            if (zzos.readInt() == zzki.zzaty) {
                                zzos.zzbj(6);
                                boolean z3 = zzos.readUnsignedByte() == 1;
                                int readUnsignedByte = zzos.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzos.zze(bArr, 0, 16);
                                zzla = new zzla(z3, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                    }
                    i4 += readInt2;
                }
                if (z2) {
                    zzoh.checkArgument(num != null, "frma atom is mandatory");
                    if (zzla != null) {
                        z = true;
                    }
                    zzoh.checkArgument(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzla);
                }
                if (pair != null) {
                    zzko.zzawg[i3] = (zzla) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzko zzko2 = zzko;
            position += readInt;
        }
    }

    private static int zzc(zzos zzos) {
        int readUnsignedByte = zzos.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzos.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
