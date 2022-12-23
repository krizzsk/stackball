package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zziv implements zzhv {
    private int zzags = -1;
    private float zzahf = 1.0f;
    private float zzahg = 1.0f;
    private ByteBuffer zzakn;
    private int zzalk = -1;
    private ByteBuffer zzalo;
    private boolean zzalp;
    private zzis zzamw;
    private ShortBuffer zzamx;
    private long zzamy;
    private long zzamz;

    public zziv() {
        ByteBuffer byteBuffer = zzaig;
        this.zzalo = byteBuffer;
        this.zzamx = byteBuffer.asShortBuffer();
        this.zzakn = zzaig;
    }

    public final int zzfj() {
        return 2;
    }

    public final float zzb(float f) {
        float zza = zzov.zza(f, 0.1f, 8.0f);
        this.zzahf = zza;
        return zza;
    }

    public final float zzc(float f) {
        this.zzahg = zzov.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzgj() {
        return this.zzamy;
    }

    public final long zzgk() {
        return this.zzamz;
    }

    public final boolean zzb(int i, int i2, int i3) throws zzhu {
        if (i3 != 2) {
            throw new zzhu(i, i2, i3);
        } else if (this.zzalk == i && this.zzags == i2) {
            return false;
        } else {
            this.zzalk = i;
            this.zzags = i2;
            return true;
        }
    }

    public final boolean isActive() {
        return Math.abs(this.zzahf - 1.0f) >= 0.01f || Math.abs(this.zzahg - 1.0f) >= 0.01f;
    }

    public final int zzfi() {
        return this.zzags;
    }

    public final void zzi(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzamy += (long) remaining;
            this.zzamw.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzge = (this.zzamw.zzge() * this.zzags) << 1;
        if (zzge > 0) {
            if (this.zzalo.capacity() < zzge) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzge).order(ByteOrder.nativeOrder());
                this.zzalo = order;
                this.zzamx = order.asShortBuffer();
            } else {
                this.zzalo.clear();
                this.zzamx.clear();
            }
            this.zzamw.zzb(this.zzamx);
            this.zzamz += (long) zzge;
            this.zzalo.limit(zzge);
            this.zzakn = this.zzalo;
        }
    }

    public final void zzfk() {
        this.zzamw.zzfk();
        this.zzalp = true;
    }

    public final ByteBuffer zzfl() {
        ByteBuffer byteBuffer = this.zzakn;
        this.zzakn = zzaig;
        return byteBuffer;
    }

    public final boolean zzfd() {
        if (!this.zzalp) {
            return false;
        }
        zzis zzis = this.zzamw;
        return zzis == null || zzis.zzge() == 0;
    }

    public final void flush() {
        zzis zzis = new zzis(this.zzalk, this.zzags);
        this.zzamw = zzis;
        zzis.setSpeed(this.zzahf);
        this.zzamw.zza(this.zzahg);
        this.zzakn = zzaig;
        this.zzamy = 0;
        this.zzamz = 0;
        this.zzalp = false;
    }

    public final void reset() {
        this.zzamw = null;
        ByteBuffer byteBuffer = zzaig;
        this.zzalo = byteBuffer;
        this.zzamx = byteBuffer.asShortBuffer();
        this.zzakn = zzaig;
        this.zzags = -1;
        this.zzalk = -1;
        this.zzamy = 0;
        this.zzamz = 0;
        this.zzalp = false;
    }
}
