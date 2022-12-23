package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbde implements zzegl {
    private final ByteBuffer zzalo;

    zzbde(ByteBuffer byteBuffer) {
        this.zzalo = byteBuffer.duplicate();
    }

    public final void close() throws IOException {
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.zzalo.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zzalo.remaining());
        byte[] bArr = new byte[min];
        this.zzalo.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long size() throws IOException {
        return (long) this.zzalo.limit();
    }

    public final long position() throws IOException {
        return (long) this.zzalo.position();
    }

    public final void zzfc(long j) throws IOException {
        this.zzalo.position((int) j);
    }

    public final ByteBuffer zzh(long j, long j2) throws IOException {
        int position = this.zzalo.position();
        this.zzalo.position((int) j);
        ByteBuffer slice = this.zzalo.slice();
        slice.limit((int) j2);
        this.zzalo.position(position);
        return slice;
    }
}
