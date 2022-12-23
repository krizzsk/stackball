package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzblc implements zzqq {
    private final Clock zzbnt;
    private Runnable zzdva = null;
    private final ScheduledExecutorService zzfif;
    private ScheduledFuture<?> zzfig;
    private long zzfih = -1;
    private long zzfii = -1;
    private boolean zzfij = false;

    public zzblc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zzfif = scheduledExecutorService;
        this.zzbnt = clock;
        zzq.zzkz().zza(this);
    }

    public final void zzp(boolean z) {
        if (z) {
            zzagr();
        } else {
            zzagq();
        }
    }

    public final synchronized void zza(int i, Runnable runnable) {
        this.zzdva = runnable;
        long j = (long) i;
        this.zzfih = this.zzbnt.elapsedRealtime() + j;
        this.zzfig = this.zzfif.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzagq() {
        if (!this.zzfij) {
            if (this.zzfig == null || this.zzfig.isDone()) {
                this.zzfii = -1;
            } else {
                this.zzfig.cancel(true);
                this.zzfii = this.zzfih - this.zzbnt.elapsedRealtime();
            }
            this.zzfij = true;
        }
    }

    private final synchronized void zzagr() {
        if (this.zzfij) {
            if (this.zzfii > 0 && this.zzfig != null && this.zzfig.isCancelled()) {
                this.zzfig = this.zzfif.schedule(this.zzdva, this.zzfii, TimeUnit.MILLISECONDS);
            }
            this.zzfij = false;
        }
    }
}
