package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbbb implements Runnable {
    private final /* synthetic */ zzbav zzeba;
    private final /* synthetic */ int zzebe;
    private final /* synthetic */ int zzebf;

    zzbbb(zzbav zzbav, int i, int i2) {
        this.zzeba = zzbav;
        this.zzebe = i;
        this.zzebf = i2;
    }

    public final void run() {
        if (this.zzeba.zzeay != null) {
            this.zzeba.zzeay.zzk(this.zzebe, this.zzebf);
        }
    }
}
