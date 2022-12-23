package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzcki implements zzdqj {
    static final zzdqj zzbly = new zzcki();

    private zzcki() {
    }

    public final zzdri zzf(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzdqw.immediateFailedFuture(new zzclp("Timed out waiting for ad response.", 2));
    }
}
