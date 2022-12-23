package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdcb implements zzdak<zzdcc> {
    List<String> zzdmi;
    private zzdrh zzfur;
    zzzl zzgpu;

    public zzdcb(zzzl zzzl, zzdrh zzdrh, List<String> list) {
        this.zzgpu = zzzl;
        this.zzfur = zzdrh;
        this.zzdmi = list;
    }

    public final zzdri<zzdcc> zzaqa() {
        return this.zzfur.zzd(new zzdce(this));
    }
}
