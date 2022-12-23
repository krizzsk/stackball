package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzai {
    private final List<PurchaseHistoryRecord> zza;
    private final BillingResult zzb;

    zzai(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    /* access modifiers changed from: package-private */
    public final BillingResult zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final List<PurchaseHistoryRecord> zzb() {
        return this.zza;
    }
}
