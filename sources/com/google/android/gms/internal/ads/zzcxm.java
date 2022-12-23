package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcxm implements zzdak<zzcxj> {
    private ApplicationInfo applicationInfo;
    private zzawt zzduw;
    private ScheduledExecutorService zzfky;
    zzdhe zzfll;
    private zzalc zzgmy;

    public zzcxm(zzalc zzalc, ScheduledExecutorService scheduledExecutorService, zzawt zzawt, ApplicationInfo applicationInfo2, zzdhe zzdhe) {
        this.zzgmy = zzalc;
        this.zzfky = scheduledExecutorService;
        this.zzduw = zzawt;
        this.applicationInfo = applicationInfo2;
        this.zzfll = zzdhe;
    }

    public final zzdri<zzcxj> zzaqa() {
        zzdri<V> zzdri;
        if (!zzabc.zzcvm.get().booleanValue()) {
            zzdri = zzdqw.zzag(null);
        } else if (!this.zzduw.zzwu()) {
            zzdri = zzdqw.zzag(null);
        } else {
            zzdri = zzdqw.zzb(zzdqw.zza(this.zzgmy.zza(this.applicationInfo), ((Long) zzvj.zzpv().zzd(zzzz.zzcpg)).longValue(), TimeUnit.MILLISECONDS, this.zzfky), Throwable.class, zzcxn.zzbly, zzbab.zzdzw);
        }
        return zzdqw.zzb(zzdqw.zzb(zzdri, new zzcxo(this), (Executor) this.zzfky), zzcxl.zzdsc, (Executor) zzbab.zzdzr);
    }
}
