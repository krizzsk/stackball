package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbrr extends zzbui<zzbrs> {
    public zzbrr(Set<zzbvt<zzbrs>> set) {
        super(set);
    }

    public final void zzbx(Context context) {
        zza(new zzbru(context));
    }

    public final void zzby(Context context) {
        zza(new zzbrt(context));
    }

    public final void zzbz(Context context) {
        zza(new zzbrw(context));
    }

    public final void zza(zzbwj zzbwj, Executor executor) {
        zza(zzbvt.zzb(new zzbrv(this, zzbwj), executor));
    }
}
