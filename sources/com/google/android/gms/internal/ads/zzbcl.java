package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzbcl implements Runnable {
    private final int zzdwt;
    private final zzbce zzees;

    zzbcl(zzbce zzbce, int i) {
        this.zzees = zzbce;
        this.zzdwt = i;
    }

    public final void run() {
        this.zzees.zzdk(this.zzdwt);
    }
}
