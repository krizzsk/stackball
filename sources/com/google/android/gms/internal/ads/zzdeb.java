package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdeb<R> implements zzdjj {
    public final Executor executor;
    public final String zzbsc;
    public final zzuj zzdlx;
    public final zzut zzgmd;
    public final zzdew<R> zzgrt;
    public final zzdev zzgru;
    @Nullable
    private final zzdiy zzgrv;

    public zzdeb(zzdew<R> zzdew, zzdev zzdev, zzuj zzuj, String str, Executor executor2, zzut zzut, @Nullable zzdiy zzdiy) {
        this.zzgrt = zzdew;
        this.zzgru = zzdev;
        this.zzdlx = zzuj;
        this.zzbsc = str;
        this.executor = executor2;
        this.zzgmd = zzut;
        this.zzgrv = zzdiy;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public final zzdiy zzarl() {
        return this.zzgrv;
    }

    public final zzdjj zzarm() {
        return new zzdeb(this.zzgrt, this.zzgru, this.zzdlx, this.zzbsc, this.executor, this.zzgmd, this.zzgrv);
    }
}
