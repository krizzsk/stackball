package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzckb implements zzegz<PackageInfo> {
    private final zzehm<Context> zzenp;
    private final zzehm<ApplicationInfo> zzgbc;

    private zzckb(zzehm<Context> zzehm, zzehm<ApplicationInfo> zzehm2) {
        this.zzenp = zzehm;
        this.zzgbc = zzehm2;
    }

    public static zzckb zzak(zzehm<Context> zzehm, zzehm<ApplicationInfo> zzehm2) {
        return new zzckb(zzehm, zzehm2);
    }

    public final /* synthetic */ Object get() {
        return zzcjr.zza(this.zzenp.get(), this.zzgbc.get());
    }
}
