package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzkf {
    private static final long[] zzarv = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private int state;
    private final byte[] zzaod = new byte[8];

    public final void reset() {
        this.state = 0;
        this.length = 0;
    }

    public final long zza(zzjl zzjl, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.state == 0) {
            if (!zzjl.zza(this.zzaod, 0, 1, z)) {
                return -1;
            }
            int zzam = zzam(this.zzaod[0] & 255);
            this.length = zzam;
            if (zzam != -1) {
                this.state = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.length;
        if (i2 > i) {
            this.state = 0;
            return -2;
        }
        if (i2 != 1) {
            zzjl.readFully(this.zzaod, 1, i2 - 1);
        }
        this.state = 0;
        return zza(this.zzaod, this.length, z2);
    }

    public final int zzgv() {
        return this.length;
    }

    public static int zzam(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = zzarv;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long zza(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~zzarv[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
