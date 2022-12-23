package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzdqr<V> extends zzdra<V> {
    zzdqr() {
    }

    public static <V> zzdqr<V> zzg(zzdri<V> zzdri) {
        if (zzdri instanceof zzdqr) {
            return (zzdqr) zzdri;
        }
        return new zzdqt(zzdri);
    }

    public final <X extends Throwable> zzdqr<V> zza(Class<X> cls, zzdnx<? super X, ? extends V> zzdnx, Executor executor) {
        zzdpx zzdpx = new zzdpx(this, cls, zzdnx);
        addListener(zzdpx, zzdrk.zza(executor, zzdpx));
        return zzdpx;
    }

    public final zzdqr<V> zza(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zzdqr) zzdqw.zza(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> zzdqr<T> zzb(zzdqj<? super V, T> zzdqj, Executor executor) {
        zzdoj.checkNotNull(executor);
        zzdqb zzdqb = new zzdqb(this, zzdqj);
        addListener(zzdqb, zzdrk.zza(executor, zzdqb));
        return zzdqb;
    }

    public final <T> zzdqr<T> zza(zzdnx<? super V, T> zzdnx, Executor executor) {
        zzdoj.checkNotNull(zzdnx);
        zzdqa zzdqa = new zzdqa(this, zzdnx);
        addListener(zzdqa, zzdrk.zza(executor, zzdqa));
        return zzdqa;
    }
}
