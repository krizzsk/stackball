package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzaiq implements Runnable {
    private final zzair zzdby;
    private final zzaga zzdbz;
    private final Map zzdca;

    zzaiq(zzair zzair, zzaga zzaga, Map map) {
        this.zzdby = zzair;
        this.zzdbz = zzaga;
        this.zzdca = map;
    }

    public final void run() {
        this.zzdby.zza(this.zzdbz, this.zzdca);
    }
}
