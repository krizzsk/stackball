package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdrn<V> extends zzdqu<V> implements zzdri<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> zzhik;

    public zzdrn(zzdri<V> zzdri, ScheduledFuture<?> scheduledFuture) {
        super(zzdri);
        this.zzhik = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.zzhik.cancel(z);
        }
        return cancel;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.zzhik.getDelay(timeUnit);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzhik.compareTo((Delayed) obj);
    }
}
