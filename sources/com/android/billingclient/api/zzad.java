package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzad implements Callable<Void> {
    final /* synthetic */ String zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ SkuDetailsResponseListener zzc;
    final /* synthetic */ BillingClientImpl zzd;

    zzad(BillingClientImpl billingClientImpl, String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zzd = billingClientImpl;
        this.zza = str;
        this.zzb = list;
        this.zzc = skuDetailsResponseListener;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzd.zzB(new zzac(this, this.zzd.zza(this.zza, this.zzb, (String) null)));
        return null;
    }
}
