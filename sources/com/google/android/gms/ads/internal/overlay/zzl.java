package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzawn;
import com.google.android.gms.internal.ads.zzaxa;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzl extends zzawn {
    final /* synthetic */ zzc zzdkr;

    private zzl(zzc zzc) {
        this.zzdkr = zzc;
    }

    public final void zzup() {
        Bitmap zza = zzq.zzlp().zza(Integer.valueOf(this.zzdkr.zzdjq.zzdla.zzbme));
        if (zza != null) {
            zzaxa.zzdwf.post(new zzk(this, zzq.zzky().zza(this.zzdkr.zzaad, zza, this.zzdkr.zzdjq.zzdla.zzbmc, this.zzdkr.zzdjq.zzdla.zzbmd)));
        }
    }
}
