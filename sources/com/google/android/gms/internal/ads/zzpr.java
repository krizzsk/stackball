package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzpr implements Runnable {
    private final /* synthetic */ zzpl zzbki;
    private final /* synthetic */ Surface zzbkl;

    zzpr(zzpl zzpl, Surface surface) {
        this.zzbki = zzpl;
        this.zzbkl = surface;
    }

    public final void run() {
        this.zzbki.zzbkh.zzb(this.zzbkl);
    }
}
