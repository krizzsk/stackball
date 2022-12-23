package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcpb implements zzbxz {
    private final zzazz zzbml;
    private final zzdgo zzfso;
    private final zzdri<zzbwu> zzgft;
    private final zzbek zzgfu;
    private final Context zzvf;

    private zzcpb(Context context, zzazz zzazz, zzdri<zzbwu> zzdri, zzdgo zzdgo, zzbek zzbek) {
        this.zzvf = context;
        this.zzbml = zzazz;
        this.zzgft = zzdri;
        this.zzfso = zzdgo;
        this.zzgfu = zzbek;
    }

    public final void zza(boolean z, Context context) {
        this.zzgfu.zzba(true);
        zzq.zzkw();
        zzg zzg = new zzg(false, zzaxa.zzbb(this.zzvf), false, 0.0f, -1, z, this.zzfso.zzfin, false);
        zzq.zzkv();
        Context context2 = context;
        zzn.zza(context2, new AdOverlayInfoParcel((zzub) null, (zzo) ((zzbwu) zzdqw.zzb(this.zzgft)).zzafq(), (zzt) null, this.zzgfu, this.zzfso.zzgty, this.zzbml, this.zzfso.zzdny, zzg, this.zzfso.zzgtr.zzdku, this.zzfso.zzgtr.zzdkw), true);
    }
}
