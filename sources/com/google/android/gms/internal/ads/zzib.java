package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzib implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ zzhf zzaiq;

    zzib(zzhw zzhw, zzhf zzhf) {
        this.zzail = zzhw;
        this.zzaiq = zzhf;
    }

    public final void run() {
        this.zzail.zzaih.zzc(this.zzaiq);
    }
}
