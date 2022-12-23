package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbdv extends zzbdl {
    public zzbdv(zzbbx zzbbx) {
        super(zzbbx);
    }

    public final void abort() {
    }

    public final boolean zzfl(String str) {
        zzbbx zzbbx = (zzbbx) this.zzego.get();
        if (zzbbx != null) {
            zzbbx.zza(zzfm(str), (zzbdl) this);
        }
        zzawr.zzfc("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfm(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
