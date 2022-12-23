package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zznr implements zznu {
    private final byte[] data;
    private Uri uri;
    private int zzbfk;
    private int zzbfl;

    public zznr(byte[] bArr) {
        zzoh.checkNotNull(bArr);
        zzoh.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    public final long zza(zznv zznv) throws IOException {
        this.uri = zznv.uri;
        this.zzbfk = (int) zznv.position;
        int length = (int) (zznv.zzce == -1 ? ((long) this.data.length) - zznv.position : zznv.zzce);
        this.zzbfl = length;
        if (length > 0 && this.zzbfk + length <= this.data.length) {
            return (long) length;
        }
        int i = this.zzbfk;
        long j = zznv.zzce;
        int length2 = this.data.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzbfl;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.data, this.zzbfk, bArr, i, min);
        this.zzbfk += min;
        this.zzbfl -= min;
        return min;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws IOException {
        this.uri = null;
    }
}
