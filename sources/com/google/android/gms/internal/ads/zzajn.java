package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzajn implements zzaga<zzakd> {
    private final /* synthetic */ zzais zzdcx;
    private final /* synthetic */ zzajf zzdcy;
    private final /* synthetic */ zzdt zzdda;
    private final /* synthetic */ zzazb zzddb;

    zzajn(zzajf zzajf, zzdt zzdt, zzais zzais, zzazb zzazb) {
        this.zzdcy = zzajf;
        this.zzdda = zzdt;
        this.zzdcx = zzais;
        this.zzddb = zzazb;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzakd zzakd = (zzakd) obj;
        synchronized (this.zzdcy.lock) {
            zzawr.zzfb("JS Engine is requesting an update");
            if (this.zzdcy.status == 0) {
                zzawr.zzfb("Starting reload.");
                int unused = this.zzdcy.status = 2;
                this.zzdcy.zza(this.zzdda);
            }
            this.zzdcx.zzb("/requestReload", (zzaga) this.zzddb.get());
        }
    }
}
