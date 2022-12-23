package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbta extends zzbui<zzbtb> implements zzbrp, zzbsr {
    private final zzdgo zzfgk;
    private AtomicBoolean zzfnm = new AtomicBoolean();

    public zzbta(Set<zzbvt<zzbtb>> set, zzdgo zzdgo) {
        super(set);
        this.zzfgk = zzdgo;
    }

    public final void onAdImpression() {
        if (this.zzfgk.zzgtl == 2 || this.zzfgk.zzgtl == 5 || this.zzfgk.zzgtl == 4) {
            zzaiu();
        }
    }

    public final void zzait() {
        if (this.zzfgk.zzgtl == 1) {
            zzaiu();
        }
    }

    private final void zzaiu() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcuh)).booleanValue() && this.zzfnm.compareAndSet(false, true) && this.zzfgk.zzgue != null && this.zzfgk.zzgue.type == 3) {
            zza(new zzbsz(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbtb zzbtb) throws Exception {
        zzbtb.zzb(this.zzfgk.zzgue);
    }
}
