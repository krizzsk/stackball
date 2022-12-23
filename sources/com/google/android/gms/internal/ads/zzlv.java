package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzlv implements zzmw {
    private final zzmw[] zzbat;

    public zzlv(zzmw[] zzmwArr) {
        this.zzbat = zzmwArr;
    }

    public final long zzhm() {
        long j = Long.MAX_VALUE;
        for (zzmw zzhm : this.zzbat) {
            long zzhm2 = zzhm.zzhm();
            if (zzhm2 != Long.MIN_VALUE) {
                j = Math.min(j, zzhm2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzee(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zzhm = zzhm();
            if (zzhm == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzmw zzmw : this.zzbat) {
                if (zzmw.zzhm() == zzhm) {
                    z |= zzmw.zzee(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
