package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzk implements Callable<Void> {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchaseHistoryResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzk(BillingClientImpl billingClientImpl, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchaseHistoryResponseListener;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzc.zzB(new zzj(this, BillingClientImpl.zzg(this.zzc, this.zza)));
        return null;
    }
}
