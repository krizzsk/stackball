package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbaz implements Runnable {
    private final /* synthetic */ zzbav zzeba;
    private final /* synthetic */ String zzebc;
    private final /* synthetic */ String zzebd;

    zzbaz(zzbav zzbav, String str, String str2) {
        this.zzeba = zzbav;
        this.zzebc = str;
        this.zzebd = str2;
    }

    public final void run() {
        if (this.zzeba.zzeay != null) {
            this.zzeba.zzeay.zzm(this.zzebc, this.zzebd);
        }
    }
}
