package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzpp implements Runnable {
    private final /* synthetic */ zzpl zzbki;
    private final /* synthetic */ int zzbkj;
    private final /* synthetic */ long zzbkk;

    zzpp(zzpl zzpl, int i, long j) {
        this.zzbki = zzpl;
        this.zzbkj = i;
        this.zzbkk = j;
    }

    public final void run() {
        this.zzbki.zzbkh.zzf(this.zzbkj, this.zzbkk);
    }
}
