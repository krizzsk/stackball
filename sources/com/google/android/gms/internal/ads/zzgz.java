package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzgz extends zzdns {
    private final /* synthetic */ zzgw zzafk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgz(zzgw zzgw, Looper looper) {
        super(looper);
        this.zzafk = zzgw;
    }

    public final void handleMessage(Message message) {
        this.zzafk.zza(message);
    }
}
