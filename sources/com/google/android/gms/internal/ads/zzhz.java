package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzhz implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ zziy zzaim;

    zzhz(zzhw zzhw, zziy zziy) {
        this.zzail = zzhw;
        this.zzaim = zziy;
    }

    public final void run() {
        this.zzail.zzaih.zzc(this.zzaim);
    }
}
