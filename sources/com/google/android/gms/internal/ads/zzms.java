package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzms implements zzjt {
    private final zzos zzaow = new zzos(32);
    private final zzns zzbay;
    private final int zzbdn;
    private final zzmq zzbdo = new zzmq();
    private final zzmp zzbdp = new zzmp();
    private final AtomicInteger zzbdq = new AtomicInteger();
    private zzmr zzbdr;
    private zzmr zzbds;
    private zzhf zzbdt;
    private boolean zzbdu;
    private zzhf zzbdv;
    private long zzbdw;
    private int zzbdx;
    private zzmu zzbdy;

    public zzms(zzns zzns) {
        this.zzbay = zzns;
        this.zzbdn = zzns.zzin();
        int i = this.zzbdn;
        this.zzbdx = i;
        zzmr zzmr = new zzmr(0, i);
        this.zzbdr = zzmr;
        this.zzbds = zzmr;
    }

    public final void zzk(boolean z) {
        int andSet = this.zzbdq.getAndSet(z ? 0 : 2);
        zzia();
        this.zzbdo.zzib();
        if (andSet == 2) {
            this.zzbdt = null;
        }
    }

    public final int zzic() {
        return this.zzbdo.zzic();
    }

    public final void disable() {
        if (this.zzbdq.getAndSet(2) == 0) {
            zzia();
        }
    }

    public final boolean zzid() {
        return this.zzbdo.zzid();
    }

    public final zzhf zzie() {
        return this.zzbdo.zzie();
    }

    public final long zzhu() {
        return this.zzbdo.zzhu();
    }

    public final void zzih() {
        long zzif = this.zzbdo.zzif();
        if (zzif != -1) {
            zzej(zzif);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbdo.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzej(zzd);
        return true;
    }

    public final int zza(zzhh zzhh, zzjb zzjb, boolean z, boolean z2, long j) {
        int i;
        zzjb zzjb2 = zzjb;
        int zza = this.zzbdo.zza(zzhh, zzjb, z, z2, this.zzbdt, this.zzbdp);
        if (zza == -5) {
            this.zzbdt = zzhh.zzahd;
            return -5;
        } else if (zza == -4) {
            if (!zzjb.zzgh()) {
                if (zzjb2.timeUs < j) {
                    zzjb2.zzy(Integer.MIN_VALUE);
                }
                if (zzjb.isEncrypted()) {
                    zzmp zzmp = this.zzbdp;
                    long j2 = zzmp.zzavy;
                    this.zzaow.reset(1);
                    zza(j2, this.zzaow.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzaow.data[0];
                    boolean z3 = (b & 128) != 0;
                    byte b2 = b & Byte.MAX_VALUE;
                    if (zzjb2.zzano.f10087iv == null) {
                        zzjb2.zzano.f10087iv = new byte[16];
                    }
                    zza(j3, zzjb2.zzano.f10087iv, (int) b2);
                    long j4 = j3 + ((long) b2);
                    if (z3) {
                        this.zzaow.reset(2);
                        zza(j4, this.zzaow.data, 2);
                        j4 += 2;
                        i = this.zzaow.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zzjb2.zzano.numBytesOfClearData;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzjb2.zzano.numBytesOfEncryptedData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i2 = i * 6;
                        this.zzaow.reset(i2);
                        zza(j4, this.zzaow.data, i2);
                        j4 += (long) i2;
                        this.zzaow.zzbi(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.zzaow.readUnsignedShort();
                            iArr4[i3] = this.zzaow.zzje();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzmp.size - ((int) (j4 - zzmp.zzavy));
                    }
                    zzjw zzjw = zzmp.zzaqs;
                    zzjb2.zzano.set(i, iArr2, iArr4, zzjw.zzaol, zzjb2.zzano.f10087iv, zzjw.zzaok);
                    int i4 = (int) (j4 - zzmp.zzavy);
                    zzmp.zzavy += (long) i4;
                    zzmp.size -= i4;
                }
                zzjb2.zzab(this.zzbdp.size);
                long j5 = this.zzbdp.zzavy;
                ByteBuffer byteBuffer = zzjb2.zzcs;
                int i5 = this.zzbdp.size;
                zzej(j5);
                while (i5 > 0) {
                    int i6 = (int) (j5 - this.zzbdr.zzbdj);
                    int min = Math.min(i5, this.zzbdn - i6);
                    zznp zznp = this.zzbdr.zzbdl;
                    byteBuffer.put(zznp.data, zznp.zzbb(i6), min);
                    j5 += (long) min;
                    i5 -= min;
                    if (j5 == this.zzbdr.zzarx) {
                        this.zzbay.zza(zznp);
                        this.zzbdr = this.zzbdr.zzig();
                    }
                }
                zzej(this.zzbdp.zzbcw);
            }
            return -4;
        } else if (zza == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzej(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbdr.zzbdj);
            int min = Math.min(i - i2, this.zzbdn - i3);
            zznp zznp = this.zzbdr.zzbdl;
            System.arraycopy(zznp.data, zznp.zzbb(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zzbdr.zzarx) {
                this.zzbay.zza(zznp);
                this.zzbdr = this.zzbdr.zzig();
            }
        }
    }

    private final void zzej(long j) {
        while (j >= this.zzbdr.zzarx) {
            this.zzbay.zza(this.zzbdr.zzbdl);
            this.zzbdr = this.zzbdr.zzig();
        }
    }

    public final void zza(zzmu zzmu) {
        this.zzbdy = zzmu;
    }

    public final void zze(zzhf zzhf) {
        zzhf zzhf2 = zzhf == null ? null : zzhf;
        boolean zzg = this.zzbdo.zzg(zzhf2);
        this.zzbdv = zzhf;
        this.zzbdu = false;
        zzmu zzmu = this.zzbdy;
        if (zzmu != null && zzg) {
            zzmu.zzf(zzhf2);
        }
    }

    public final int zza(zzjl zzjl, int i, boolean z) throws IOException, InterruptedException {
        if (!zzii()) {
            int zzad = zzjl.zzad(i);
            if (zzad != -1) {
                return zzad;
            }
            throw new EOFException();
        }
        try {
            int zzaw = zzaw(i);
            zznp zznp = this.zzbds.zzbdl;
            int read = zzjl.read(zznp.data, zznp.zzbb(this.zzbdx), zzaw);
            if (read != -1) {
                this.zzbdx += read;
                this.zzbdw += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            zzij();
        }
    }

    public final void zza(zzos zzos, int i) {
        if (!zzii()) {
            zzos.zzbj(i);
            return;
        }
        while (i > 0) {
            int zzaw = zzaw(i);
            zznp zznp = this.zzbds.zzbdl;
            zzos.zze(zznp.data, zznp.zzbb(this.zzbdx), zzaw);
            this.zzbdx += zzaw;
            this.zzbdw += (long) zzaw;
            i -= zzaw;
        }
        zzij();
    }

    public final void zza(long j, int i, int i2, int i3, zzjw zzjw) {
        if (!zzii()) {
            long j2 = j;
            this.zzbdo.zzei(j);
            return;
        }
        long j3 = j;
        try {
            this.zzbdo.zza(j, i, this.zzbdw - ((long) i2), i2, zzjw);
        } finally {
            zzij();
        }
    }

    private final boolean zzii() {
        return this.zzbdq.compareAndSet(0, 1);
    }

    private final void zzij() {
        if (!this.zzbdq.compareAndSet(1, 0)) {
            zzia();
        }
    }

    private final void zzia() {
        this.zzbdo.zzia();
        zzmr zzmr = this.zzbdr;
        if (zzmr.zzbdk) {
            int i = (this.zzbds.zzbdk ? 1 : 0) + (((int) (this.zzbds.zzbdj - zzmr.zzbdj)) / this.zzbdn);
            zznp[] zznpArr = new zznp[i];
            for (int i2 = 0; i2 < i; i2++) {
                zznpArr[i2] = zzmr.zzbdl;
                zzmr = zzmr.zzig();
            }
            this.zzbay.zza(zznpArr);
        }
        zzmr zzmr2 = new zzmr(0, this.zzbdn);
        this.zzbdr = zzmr2;
        this.zzbds = zzmr2;
        this.zzbdw = 0;
        this.zzbdx = this.zzbdn;
        this.zzbay.zzn();
    }

    private final int zzaw(int i) {
        if (this.zzbdx == this.zzbdn) {
            this.zzbdx = 0;
            if (this.zzbds.zzbdk) {
                this.zzbds = this.zzbds.zzbdm;
            }
            zzmr zzmr = this.zzbds;
            zznp zzim = this.zzbay.zzim();
            zzmr zzmr2 = new zzmr(this.zzbds.zzarx, this.zzbdn);
            zzmr.zzbdl = zzim;
            zzmr.zzbdm = zzmr2;
            zzmr.zzbdk = true;
        }
        return Math.min(i, this.zzbdn - this.zzbdx);
    }
}
