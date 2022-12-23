package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zztf;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcnb implements zzdqx<Bundle> {
    private final /* synthetic */ boolean zzgec;
    final /* synthetic */ zzcmy zzged;

    zzcnb(zzcmy zzcmy, boolean z) {
        this.zzged = zzcmy;
        this.zzgec = z;
    }

    public final void zzb(Throwable th) {
        zzawr.zzfa("Failed to get signals bundle");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList zza = zzcmy.zzm(bundle);
        zztf.zzo.zzc zzb = zzcmy.zzl(bundle);
        this.zzged.zzgdu.zza(new zzcna(this, this.zzgec, zza, this.zzged.zzk(bundle), zzb));
    }
}
