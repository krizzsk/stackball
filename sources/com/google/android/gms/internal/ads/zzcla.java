package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcla implements zzbtm {
    private final zzauu zzboj;
    private final Context zzvf;

    zzcla(Context context, zzauu zzauu) {
        this.zzvf = context;
        this.zzboj = zzauu;
    }

    public final void zzd(zzarj zzarj) {
    }

    public final void zzb(zzdha zzdha) {
        if (!TextUtils.isEmpty(zzdha.zzgus.zzgup.zzdou)) {
            this.zzboj.zza(this.zzvf, zzdha.zzgur.zzfll.zzguw);
            this.zzboj.zzj(this.zzvf, zzdha.zzgus.zzgup.zzdou);
        }
    }
}
