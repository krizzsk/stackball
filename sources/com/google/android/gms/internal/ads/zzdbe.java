package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdbe implements zzdak<zzdbb> {
    private final Executor executor;
    private final PackageInfo zzdly;
    private final zzavz zzgpa;
    private final String zzgpd;

    public zzdbe(zzavz zzavz, Executor executor2, String str, PackageInfo packageInfo) {
        this.zzgpa = zzavz;
        this.executor = executor2;
        this.zzgpd = str;
        this.zzdly = packageInfo;
    }

    public final zzdri<zzdbb> zzaqa() {
        return zzdqw.zzb(zzdqw.zzb(this.zzgpa.zza(this.zzgpd, this.zzdly), zzdbd.zzdsc, this.executor), Throwable.class, new zzdbg(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzf(Throwable th) throws Exception {
        return zzdqw.zzag(new zzdbb(this.zzgpd));
    }
}
