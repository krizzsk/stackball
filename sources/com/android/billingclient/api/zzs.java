package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzs implements Callable<Bundle> {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzs(BillingClientImpl billingClientImpl, String str, Bundle bundle) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.zzc.zzg.zzj(8, this.zzc.zzf.getPackageName(), this.zza, BillingClient.SkuType.SUBS, this.zzb);
    }
}
