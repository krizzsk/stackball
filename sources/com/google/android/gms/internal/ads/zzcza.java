package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcza implements zzegz<zzcyx> {
    private final zzehm<PackageInfo> zzfmq;
    private final zzehm<ApplicationInfo> zzgbc;

    private zzcza(zzehm<ApplicationInfo> zzehm, zzehm<PackageInfo> zzehm2) {
        this.zzgbc = zzehm;
        this.zzfmq = zzehm2;
    }

    public static zzcza zzax(zzehm<ApplicationInfo> zzehm, zzehm<PackageInfo> zzehm2) {
        return new zzcza(zzehm, zzehm2);
    }

    public static zzcyx zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzcyx(applicationInfo, packageInfo);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzgbc.get(), this.zzfmq.get());
    }
}
