package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcyu implements zzdak<zzcyr> {
    private final zzdrh zzglk;
    private final Set<String> zzgly;
    private final Context zzvf;

    public zzcyu(zzdrh zzdrh, Context context, Set<String> set) {
        this.zzglk = zzdrh;
        this.zzvf = context;
        this.zzgly = set;
    }

    public final zzdri<zzcyr> zzaqa() {
        return this.zzglk.zzd(new zzcyt(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyr zzaqj() throws Exception {
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcqw)).booleanValue() || !zzcyr.zze(this.zzgly)) {
            return new zzcyr((String) null);
        }
        return new zzcyr(zzq.zzll().getVersion(this.zzvf));
    }
}
