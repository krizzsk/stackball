package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzbdz implements Runnable {
    private final boolean zzecc;
    private final long zzefe;
    private final zzbbx zzehk;

    zzbdz(zzbbx zzbbx, boolean z, long j) {
        this.zzehk = zzbbx;
        this.zzecc = z;
        this.zzefe = j;
    }

    public final void run() {
        this.zzehk.zza(this.zzecc, this.zzefe);
    }
}
