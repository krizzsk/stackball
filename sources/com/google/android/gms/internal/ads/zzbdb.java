package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbdb implements zznu {
    private Uri uri;
    private final zznu zzegg;
    private final long zzegh;
    private final zznu zzegi;
    private long zzegj;

    zzbdb(zznu zznu, int i, zznu zznu2) {
        this.zzegg = zznu;
        this.zzegh = (long) i;
        this.zzegi = zznu2;
    }

    public final long zza(zznv zznv) throws IOException {
        zznv zznv2;
        long j;
        zznv zznv3 = zznv;
        this.uri = zznv3.uri;
        zznv zznv4 = null;
        if (zznv3.position >= this.zzegh) {
            zznv2 = null;
        } else {
            long j2 = zznv3.position;
            if (zznv3.zzce != -1) {
                j = Math.min(zznv3.zzce, this.zzegh - j2);
            } else {
                j = this.zzegh - j2;
            }
            zznv2 = new zznv(zznv3.uri, j2, j, (String) null);
        }
        if (zznv3.zzce == -1 || zznv3.position + zznv3.zzce > this.zzegh) {
            zznv4 = new zznv(zznv3.uri, Math.max(this.zzegh, zznv3.position), zznv3.zzce != -1 ? Math.min(zznv3.zzce, (zznv3.position + zznv3.zzce) - this.zzegh) : -1, (String) null);
        }
        long j3 = 0;
        long zza = zznv2 != null ? this.zzegg.zza(zznv2) : 0;
        if (zznv4 != null) {
            j3 = this.zzegi.zza(zznv4);
        }
        this.zzegj = zznv3.position;
        if (zza == -1 || j3 == -1) {
            return -1;
        }
        return zza + j3;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzegj;
        long j2 = this.zzegh;
        if (j < j2) {
            i3 = this.zzegg.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.zzegj += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.zzegj < this.zzegh) {
            return i3;
        }
        int read = this.zzegi.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.zzegj += (long) read;
        return i4;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws IOException {
        this.zzegg.close();
        this.zzegi.close();
    }
}
