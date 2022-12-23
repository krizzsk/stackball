package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzkt implements zzjm, zzjr {
    private static final zzjn zzaon = new zzkw();
    private static final int zzawo = zzov.zzbj("qt  ");
    private long zzaht;
    private final zzos zzaou = new zzos(zzon.zzbhb);
    private final zzos zzaov = new zzos(4);
    private int zzaqj;
    private int zzaqk;
    private zzjo zzaqn;
    private final zzos zzawp = new zzos(16);
    private final Stack<zzkh> zzawq = new Stack<>();
    private int zzawr;
    private int zzaws;
    private long zzawt;
    private int zzawu;
    private zzos zzawv;
    private zzkv[] zzaww;
    private boolean zzawx;

    public final boolean isSeekable() {
        return true;
    }

    public final void release() {
    }

    public final boolean zza(zzjl zzjl) throws IOException, InterruptedException {
        return zzky.zzd(zzjl);
    }

    public final void zza(zzjo zzjo) {
        this.zzaqn = zzjo;
    }

    public final void zzc(long j, long j2) {
        this.zzawq.clear();
        this.zzawu = 0;
        this.zzaqk = 0;
        this.zzaqj = 0;
        if (j == 0) {
            zzha();
            return;
        }
        zzkv[] zzkvArr = this.zzaww;
        if (zzkvArr != null) {
            for (zzkv zzkv : zzkvArr) {
                zzkz zzkz = zzkv.zzayd;
                int zzec = zzkz.zzec(j2);
                if (zzec == -1) {
                    zzec = zzkz.zzed(j2);
                }
                zzkv.zzawj = zzec;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x0198 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzjl r24, com.google.android.gms.internal.ads.zzjs r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.zzawr
            r4 = -1
            r5 = 8
            r6 = 1
            if (r3 == 0) goto L_0x019a
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0115
            if (r3 != r10) goto L_0x010f
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001d:
            com.google.android.gms.internal.ads.zzkv[] r14 = r0.zzaww
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003b
            r14 = r14[r3]
            int r15 = r14.zzawj
            com.google.android.gms.internal.ads.zzkz r11 = r14.zzayd
            int r11 = r11.zzawf
            if (r15 == r11) goto L_0x0038
            com.google.android.gms.internal.ads.zzkz r11 = r14.zzayd
            long[] r11 = r11.zzany
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
            com.google.android.gms.internal.ads.zzjt r4 = r3.zzaye
            int r5 = r3.zzawj
            com.google.android.gms.internal.ads.zzkz r11 = r3.zzayd
            long[] r11 = r11.zzany
            r12 = r11[r5]
            com.google.android.gms.internal.ads.zzkz r11 = r3.zzayd
            int[] r11 = r11.zzanx
            r11 = r11[r5]
            com.google.android.gms.internal.ads.zzkx r14 = r3.zzayc
            int r14 = r14.zzayg
            if (r14 != r6) goto L_0x005b
            r14 = 8
            long r12 = r12 + r14
            int r11 = r11 + -8
        L_0x005b:
            long r14 = r24.getPosition()
            long r14 = r12 - r14
            int r10 = r0.zzaqk
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
            r1.zzae(r2)
            com.google.android.gms.internal.ads.zzkx r2 = r3.zzayc
            int r2 = r2.zzart
            if (r2 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzos r2 = r0.zzaov
            byte[] r2 = r2.data
            r6 = 0
            r2[r6] = r6
            r7 = 1
            r2[r7] = r6
            r7 = 2
            r2[r7] = r6
            com.google.android.gms.internal.ads.zzkx r2 = r3.zzayc
            int r2 = r2.zzart
            com.google.android.gms.internal.ads.zzkx r6 = r3.zzayc
            int r6 = r6.zzart
            r7 = 4
            int r6 = 4 - r6
        L_0x0093:
            int r7 = r0.zzaqk
            if (r7 >= r11) goto L_0x00e8
            int r7 = r0.zzaqj
            if (r7 != 0) goto L_0x00c2
            com.google.android.gms.internal.ads.zzos r7 = r0.zzaov
            byte[] r7 = r7.data
            r1.readFully(r7, r6, r2)
            com.google.android.gms.internal.ads.zzos r7 = r0.zzaov
            r8 = 0
            r7.zzbi(r8)
            com.google.android.gms.internal.ads.zzos r7 = r0.zzaov
            int r7 = r7.zzje()
            r0.zzaqj = r7
            com.google.android.gms.internal.ads.zzos r7 = r0.zzaou
            r7.zzbi(r8)
            com.google.android.gms.internal.ads.zzos r7 = r0.zzaou
            r9 = 4
            r4.zza(r7, r9)
            int r7 = r0.zzaqk
            int r7 = r7 + r9
            r0.zzaqk = r7
            int r11 = r11 + r6
            goto L_0x0093
        L_0x00c2:
            r8 = 0
            int r7 = r4.zza(r1, r7, r8)
            int r8 = r0.zzaqk
            int r8 = r8 + r7
            r0.zzaqk = r8
            int r8 = r0.zzaqj
            int r8 = r8 - r7
            r0.zzaqj = r8
            goto L_0x0093
        L_0x00d2:
            int r2 = r0.zzaqk
            if (r2 >= r11) goto L_0x00e8
            int r2 = r11 - r2
            r6 = 0
            int r2 = r4.zza(r1, r2, r6)
            int r6 = r0.zzaqk
            int r6 = r6 + r2
            r0.zzaqk = r6
            int r6 = r0.zzaqj
            int r6 = r6 - r2
            r0.zzaqj = r6
            goto L_0x00d2
        L_0x00e8:
            r20 = r11
            com.google.android.gms.internal.ads.zzkz r1 = r3.zzayd
            long[] r1 = r1.zzayl
            r17 = r1[r5]
            com.google.android.gms.internal.ads.zzkz r1 = r3.zzayd
            int[] r1 = r1.zzawn
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.zza(r17, r19, r20, r21, r22)
            int r1 = r3.zzawj
            r4 = 1
            int r1 = r1 + r4
            r3.zzawj = r1
            r1 = 0
            r0.zzaqk = r1
            r0.zzaqj = r1
            return r1
        L_0x010b:
            r4 = 1
            r2.position = r12
            return r4
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0115:
            long r3 = r0.zzawt
            int r6 = r0.zzawu
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r24.getPosition()
            long r6 = r6 + r3
            com.google.android.gms.internal.ads.zzos r10 = r0.zzawv
            if (r10 == 0) goto L_0x0177
            byte[] r8 = r10.data
            int r9 = r0.zzawu
            int r4 = (int) r3
            r1.readFully(r8, r9, r4)
            int r3 = r0.zzaws
            int r4 = com.google.android.gms.internal.ads.zzki.zzasa
            if (r3 != r4) goto L_0x0158
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawv
            r3.zzbi(r5)
            int r4 = r3.readInt()
            int r5 = zzawo
            if (r4 != r5) goto L_0x0141
        L_0x013f:
            r3 = 1
            goto L_0x0155
        L_0x0141:
            r4 = 4
            r3.zzbj(r4)
        L_0x0145:
            int r4 = r3.zziz()
            if (r4 <= 0) goto L_0x0154
            int r4 = r3.readInt()
            int r5 = zzawo
            if (r4 != r5) goto L_0x0145
            goto L_0x013f
        L_0x0154:
            r3 = 0
        L_0x0155:
            r0.zzawx = r3
            goto L_0x017f
        L_0x0158:
            java.util.Stack<com.google.android.gms.internal.ads.zzkh> r3 = r0.zzawq
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x017f
            java.util.Stack<com.google.android.gms.internal.ads.zzkh> r3 = r0.zzawq
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzkh r3 = (com.google.android.gms.internal.ads.zzkh) r3
            com.google.android.gms.internal.ads.zzkk r4 = new com.google.android.gms.internal.ads.zzkk
            int r5 = r0.zzaws
            com.google.android.gms.internal.ads.zzos r8 = r0.zzawv
            r4.<init>(r5, r8)
            java.util.List<com.google.android.gms.internal.ads.zzkk> r3 = r3.zzary
            r3.add(r4)
            goto L_0x017f
        L_0x0177:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0181
            int r4 = (int) r3
            r1.zzae(r4)
        L_0x017f:
            r3 = 0
            goto L_0x0189
        L_0x0181:
            long r8 = r24.getPosition()
            long r8 = r8 + r3
            r2.position = r8
            r3 = 1
        L_0x0189:
            r0.zzeb(r6)
            if (r3 == 0) goto L_0x0195
            int r3 = r0.zzawr
            r4 = 2
            if (r3 == r4) goto L_0x0195
            r7 = 1
            goto L_0x0196
        L_0x0195:
            r7 = 0
        L_0x0196:
            if (r7 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x019a:
            r3 = 1
            int r6 = r0.zzawu
            if (r6 != 0) goto L_0x01c4
            com.google.android.gms.internal.ads.zzos r6 = r0.zzawp
            byte[] r6 = r6.data
            r7 = 0
            boolean r6 = r1.zza(r6, r7, r5, r3)
            if (r6 != 0) goto L_0x01ad
            r6 = 0
            goto L_0x02ac
        L_0x01ad:
            r0.zzawu = r5
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawp
            r3.zzbi(r7)
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawp
            long r6 = r3.zzjb()
            r0.zzawt = r6
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawp
            int r3 = r3.readInt()
            r0.zzaws = r3
        L_0x01c4:
            long r6 = r0.zzawt
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01e0
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawp
            byte[] r3 = r3.data
            r1.readFully(r3, r5, r5)
            int r3 = r0.zzawu
            int r3 = r3 + r5
            r0.zzawu = r3
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawp
            long r6 = r3.zzjf()
            r0.zzawt = r6
        L_0x01e0:
            int r3 = r0.zzaws
            int r6 = com.google.android.gms.internal.ads.zzki.zzatb
            if (r3 == r6) goto L_0x01fd
            int r6 = com.google.android.gms.internal.ads.zzki.zzatd
            if (r3 == r6) goto L_0x01fd
            int r6 = com.google.android.gms.internal.ads.zzki.zzate
            if (r3 == r6) goto L_0x01fd
            int r6 = com.google.android.gms.internal.ads.zzki.zzatf
            if (r3 == r6) goto L_0x01fd
            int r6 = com.google.android.gms.internal.ads.zzki.zzatg
            if (r3 == r6) goto L_0x01fd
            int r6 = com.google.android.gms.internal.ads.zzki.zzatp
            if (r3 != r6) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            r6 = 0
            goto L_0x01fe
        L_0x01fd:
            r6 = 1
        L_0x01fe:
            if (r6 == 0) goto L_0x022a
            long r5 = r24.getPosition()
            long r7 = r0.zzawt
            long r5 = r5 + r7
            int r3 = r0.zzawu
            long r7 = (long) r3
            long r5 = r5 - r7
            java.util.Stack<com.google.android.gms.internal.ads.zzkh> r3 = r0.zzawq
            com.google.android.gms.internal.ads.zzkh r7 = new com.google.android.gms.internal.ads.zzkh
            int r8 = r0.zzaws
            r7.<init>(r8, r5)
            r3.add(r7)
            long r7 = r0.zzawt
            int r3 = r0.zzawu
            long r9 = (long) r3
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0224
            r0.zzeb(r5)
            goto L_0x0227
        L_0x0224:
            r23.zzha()
        L_0x0227:
            r3 = 1
            goto L_0x02ab
        L_0x022a:
            int r3 = r0.zzaws
            int r6 = com.google.android.gms.internal.ads.zzki.zzatr
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzatc
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzats
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzatt
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzaum
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzaun
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzauo
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzatq
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzaup
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzauq
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzaur
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzaus
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzaut
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzato
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzasa
            if (r3 == r6) goto L_0x026f
            int r6 = com.google.android.gms.internal.ads.zzki.zzava
            if (r3 != r6) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r6 = 0
            goto L_0x0270
        L_0x026f:
            r6 = 1
        L_0x0270:
            if (r6 == 0) goto L_0x02a5
            int r3 = r0.zzawu
            if (r3 != r5) goto L_0x0278
            r6 = 1
            goto L_0x0279
        L_0x0278:
            r6 = 0
        L_0x0279:
            com.google.android.gms.internal.ads.zzoh.checkState(r6)
            long r6 = r0.zzawt
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0287
            r6 = 1
            goto L_0x0288
        L_0x0287:
            r6 = 0
        L_0x0288:
            com.google.android.gms.internal.ads.zzoh.checkState(r6)
            com.google.android.gms.internal.ads.zzos r3 = new com.google.android.gms.internal.ads.zzos
            long r6 = r0.zzawt
            int r7 = (int) r6
            r3.<init>((int) r7)
            r0.zzawv = r3
            com.google.android.gms.internal.ads.zzos r3 = r0.zzawp
            byte[] r3 = r3.data
            com.google.android.gms.internal.ads.zzos r6 = r0.zzawv
            byte[] r6 = r6.data
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r6, r7, r5)
            r3 = 1
            r0.zzawr = r3
            goto L_0x02ab
        L_0x02a5:
            r3 = 1
            r5 = 0
            r0.zzawv = r5
            r0.zzawr = r3
        L_0x02ab:
            r6 = 1
        L_0x02ac:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zza(com.google.android.gms.internal.ads.zzjl, com.google.android.gms.internal.ads.zzjs):int");
    }

    public final long getDurationUs() {
        return this.zzaht;
    }

    public final long zzdz(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzkv zzkv : this.zzaww) {
            zzkz zzkz = zzkv.zzayd;
            int zzec = zzkz.zzec(j);
            if (zzec == -1) {
                zzec = zzkz.zzed(j);
            }
            long j3 = zzkz.zzany[zzec];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzha() {
        this.zzawr = 0;
        this.zzawu = 0;
    }

    private final void zzeb(long j) throws zzhi {
        zzln zzln;
        zzjq zzjq;
        zzkx zza;
        while (!this.zzawq.isEmpty() && this.zzawq.peek().zzarx == j) {
            zzkh pop = this.zzawq.pop();
            if (pop.type == zzki.zzatb) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j3 = Long.MAX_VALUE;
                zzln zzln2 = null;
                zzjq zzjq2 = new zzjq();
                zzkk zzan = pop.zzan(zzki.zzava);
                if (!(zzan == null || (zzln2 = zzkj.zza(zzan, this.zzawx)) == null)) {
                    zzjq2.zzb(zzln2);
                }
                int i = 0;
                while (i < pop.zzarz.size()) {
                    zzkh zzkh = pop.zzarz.get(i);
                    if (zzkh.type == zzki.zzatd && (zza = zzkj.zza(zzkh, pop.zzan(zzki.zzatc), -9223372036854775807L, (zzja) null, this.zzawx)) != null) {
                        zzkz zza2 = zzkj.zza(zza, zzkh.zzao(zzki.zzate).zzao(zzki.zzatf).zzao(zzki.zzatg), zzjq2);
                        if (zza2.zzawf != 0) {
                            zzkv zzkv = new zzkv(zza, zza2, this.zzaqn.zzc(i, zza.type));
                            zzhf zzr = zza.zzahd.zzr(zza2.zzawl + 30);
                            if (zza.type == 1) {
                                if (zzjq2.zzgs()) {
                                    zzr = zzr.zzb(zzjq2.zzagv, zzjq2.zzagw);
                                }
                                if (zzln2 != null) {
                                    zzr = zzr.zza(zzln2);
                                }
                            }
                            zzkv.zzaye.zze(zzr);
                            zzln = zzln2;
                            zzjq = zzjq2;
                            j2 = Math.max(j2, zza.zzaht);
                            arrayList.add(zzkv);
                            long j4 = zza2.zzany[0];
                            if (j4 < j3) {
                                j3 = j4;
                            }
                            i++;
                            zzjq2 = zzjq;
                            zzln2 = zzln;
                        }
                    }
                    zzln = zzln2;
                    zzjq = zzjq2;
                    i++;
                    zzjq2 = zzjq;
                    zzln2 = zzln;
                }
                this.zzaht = j2;
                this.zzaww = (zzkv[]) arrayList.toArray(new zzkv[arrayList.size()]);
                this.zzaqn.zzgr();
                this.zzaqn.zza(this);
                this.zzawq.clear();
                this.zzawr = 2;
            } else if (!this.zzawq.isEmpty()) {
                this.zzawq.peek().zzarz.add(pop);
            }
        }
        if (this.zzawr != 2) {
            zzha();
        }
    }
}
