package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcvo implements zzdak<Object> {
    private final Executor executor;
    private final zzdri<String> zzglp;

    public zzcvo(zzdri<String> zzdri, Executor executor2) {
        this.zzglp = zzdri;
        this.executor = executor2;
    }

    public final zzdri<Object> zzaqa() {
        return zzdqw.zzb(this.zzglp, zzcvn.zzbly, this.executor);
    }
}
