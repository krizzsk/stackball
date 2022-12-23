package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzj implements zzaa {
    private final Executor zzv;

    public zzj(Handler handler) {
        this.zzv = new zzi(this, handler);
    }

    public final void zzb(zzq<?> zzq, zzz<?> zzz) {
        zza(zzq, zzz, (Runnable) null);
    }

    public final void zza(zzq<?> zzq, zzz<?> zzz, Runnable runnable) {
        zzq.zzk();
        zzq.zzb("post-response");
        this.zzv.execute(new zzl(zzq, zzz, runnable));
    }

    public final void zza(zzq<?> zzq, zzae zzae) {
        zzq.zzb("post-error");
        this.zzv.execute(new zzl(zzq, zzz.zzd(zzae), (Runnable) null));
    }
}
