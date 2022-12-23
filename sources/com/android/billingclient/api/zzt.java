package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzd;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@3.0.3 */
final class zzt implements Callable<Integer> {
    final /* synthetic */ String zza;
    final /* synthetic */ BillingClientImpl zzb;

    zzt(BillingClientImpl billingClientImpl, String str) {
        this.zzb = billingClientImpl;
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzd zzc = this.zzb.zzg;
        String packageName = this.zzb.zzf.getPackageName();
        String str = this.zza;
        Bundle bundle = new Bundle();
        bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        return Integer.valueOf(zzc.zzi(7, packageName, str, bundle));
    }
}
