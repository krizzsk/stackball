package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcrg implements zzbxz {
    private final zzazz zzbml;
    private final zzdgo zzfkd;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzdri<zzcen> zzgft;
    private final zzbek zzghd;
    private final Context zzvf;

    private zzcrg(Context context, zzcey zzcey, zzdhe zzdhe, zzazz zzazz, zzdgo zzdgo, zzdri<zzcen> zzdri, zzbek zzbek) {
        this.zzvf = context;
        this.zzfud = zzcey;
        this.zzfll = zzdhe;
        this.zzbml = zzazz;
        this.zzfkd = zzdgo;
        this.zzgft = zzdri;
        this.zzghd = zzbek;
    }

    public final void zza(boolean z, Context context) {
        zzbek zzbek;
        zzbek zzbek2;
        zzcen zzcen = (zzcen) zzdqw.zzb(this.zzgft);
        try {
            zzdgo zzdgo = this.zzfkd;
            if (!this.zzghd.zzaby()) {
                zzbek2 = this.zzghd;
            } else {
                if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzclh)).booleanValue()) {
                    zzbek2 = this.zzghd;
                } else {
                    zzbek zzc = this.zzfud.zzc(this.zzfll.zzbmp);
                    zzagl.zza(zzc, (zzagk) zzcen.zzafx());
                    zzcfo zzcfo = new zzcfo();
                    zzcfo.zzc(this.zzvf, zzc.getView());
                    zzcen.zzaez().zzb(zzc, true);
                    zzc.zzabj().zza((zzbfv) new zzcrj(zzcfo, zzc));
                    zzbfw zzabj = zzc.zzabj();
                    zzc.getClass();
                    zzabj.zza(zzcri.zzq(zzc));
                    zzc.zzb(zzdgo.zzgtr.zzdku, zzdgo.zzgtr.zzdkw, (String) null);
                    zzbek = zzc;
                    zzbek.zzba(true);
                    zzq.zzkw();
                    zzg zzg = new zzg(false, zzaxa.zzbb(this.zzvf), false, 0.0f, -1, z, this.zzfkd.zzfin, this.zzfkd.zzbmh);
                    zzq.zzkv();
                    Context context2 = context;
                    zzn.zza(context2, new AdOverlayInfoParcel((zzub) null, (zzo) zzcen.zzafq(), (zzt) null, zzbek, this.zzfkd.zzgty, this.zzbml, this.zzfkd.zzdny, zzg, this.zzfkd.zzgtr.zzdku, this.zzfkd.zzgtr.zzdkw), true);
                }
            }
            zzbek = zzbek2;
            zzbek.zzba(true);
            zzq.zzkw();
            zzg zzg2 = new zzg(false, zzaxa.zzbb(this.zzvf), false, 0.0f, -1, z, this.zzfkd.zzfin, this.zzfkd.zzbmh);
            zzq.zzkv();
            Context context22 = context;
            zzn.zza(context22, new AdOverlayInfoParcel((zzub) null, (zzo) zzcen.zzafq(), (zzt) null, zzbek, this.zzfkd.zzgty, this.zzbml, this.zzfkd.zzdny, zzg2, this.zzfkd.zzgtr.zzdku, this.zzfkd.zzgtr.zzdkw), true);
        } catch (zzbew e) {
            zzazw.zzc("", e);
        }
    }
}
