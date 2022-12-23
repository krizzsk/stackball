package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzl implements Runnable {
    final /* synthetic */ PurchaseHistoryResponseListener zza;

    zzl(BillingClientImpl billingClientImpl, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = purchaseHistoryResponseListener;
    }

    public final void run() {
        this.zza.onPurchaseHistoryResponse(zzam.zzr, (List<PurchaseHistoryRecord>) null);
    }
}
