package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzchj implements zzdla {
    private zzst zzfyd;
    private Map<zzdkr, zzchl> zzfyn;

    zzchj(zzst zzst, Map<zzdkr, zzchl> map) {
        this.zzfyn = map;
        this.zzfyd = zzst;
    }

    public final void zza(zzdkr zzdkr, String str) {
    }

    public final void zzb(zzdkr zzdkr, String str) {
        if (this.zzfyn.containsKey(zzdkr)) {
            this.zzfyd.zza(this.zzfyn.get(zzdkr).zzfyp);
        }
    }

    public final void zza(zzdkr zzdkr, String str, Throwable th) {
        if (this.zzfyn.containsKey(zzdkr)) {
            this.zzfyd.zza(this.zzfyn.get(zzdkr).zzfyr);
        }
    }

    public final void zzc(zzdkr zzdkr, String str) {
        if (this.zzfyn.containsKey(zzdkr)) {
            this.zzfyd.zza(this.zzfyn.get(zzdkr).zzfyq);
        }
    }
}
