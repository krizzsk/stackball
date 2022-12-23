package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzj implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzk zzb;

    zzj(zzk zzk, zzai zzai) {
        this.zzb = zzk;
        this.zza = zzai;
    }

    public final void run() {
        this.zzb.zzb.onPurchaseHistoryResponse(this.zza.zza(), this.zza.zzb());
    }
}
