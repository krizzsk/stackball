package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzczm implements zzdak<zzczj> {
    private final ScheduledExecutorService zzfky;
    private final zzdhe zzfll;
    private final zzdrh zzfur;
    private final zzcsx zzghn;
    private String zzgla;
    private final zzcsz zzgns;
    private final Context zzvf;

    public zzczm(zzdrh zzdrh, ScheduledExecutorService scheduledExecutorService, String str, zzcsz zzcsz, Context context, zzdhe zzdhe, zzcsx zzcsx) {
        this.zzfur = zzdrh;
        this.zzfky = scheduledExecutorService;
        this.zzgla = str;
        this.zzgns = zzcsz;
        this.zzvf = context;
        this.zzfll = zzdhe;
        this.zzghn = zzcsx;
    }

    public final zzdri<zzczj> zzaqa() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnb)).booleanValue()) {
            return zzdqw.zza(new zzczl(this), this.zzfur);
        }
        return zzdqw.zzag(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(String str, List list, Bundle bundle) throws Exception {
        zzbaj zzbaj = new zzbaj();
        this.zzghn.zzgm(str);
        zzanv zzgn = this.zzghn.zzgn(str);
        if (zzgn != null) {
            Bundle bundle2 = bundle;
            zzgn.zza(ObjectWrapper.wrap(this.zzvf), this.zzgla, bundle2, (Bundle) list.get(0), this.zzfll.zzbmp, (zzanw) new zzctf(str, zzgn, zzbaj));
            return zzbaj;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzaqm() {
        Map<String, List<Bundle>> zzs = this.zzgns.zzs(this.zzgla, this.zzfll.zzgux);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : zzs.entrySet()) {
            String str = (String) next.getKey();
            arrayList.add(zzdqr.zzg(zzdqw.zza(new zzczo(this, str, (List) next.getValue(), this.zzfll.zzguw.zzcen != null ? this.zzfll.zzguw.zzcen.getBundle(str) : null), this.zzfur)).zza(((Long) zzvj.zzpv().zzd(zzzz.zzcna)).longValue(), TimeUnit.MILLISECONDS, this.zzfky).zza(Throwable.class, new zzczn(str), (Executor) this.zzfur));
        }
        return zzdqw.zzk(arrayList).zza(new zzczq(arrayList), this.zzfur);
    }
}
