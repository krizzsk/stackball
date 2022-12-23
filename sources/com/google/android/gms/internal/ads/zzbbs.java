package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbbs {
    private final long zzech = TimeUnit.MILLISECONDS.toNanos(((Long) zzvj.zzpv().zzd(zzzz.zzcjq)).longValue());
    private long zzeci;
    private boolean zzecj = true;

    zzbbs() {
    }

    public final void zzyq() {
        this.zzecj = true;
    }

    public final void zza(SurfaceTexture surfaceTexture, zzbbf zzbbf) {
        if (zzbbf != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.zzecj || Math.abs(timestamp - this.zzeci) >= this.zzech) {
                this.zzecj = false;
                this.zzeci = timestamp;
                zzaxa.zzdwf.post(new zzbbr(this, zzbbf));
            }
        }
    }
}
