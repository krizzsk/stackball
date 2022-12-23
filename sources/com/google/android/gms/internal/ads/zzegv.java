package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzegv<K, V, V2> {
    final LinkedHashMap<K, zzehm<V>> zzijb;

    zzegv(int i) {
        this.zzijb = zzegy.zzhu(i);
    }

    /* access modifiers changed from: package-private */
    public zzegv<K, V, V2> zza(K k, zzehm<V> zzehm) {
        this.zzijb.put(zzehf.zza(k, SDKConstants.PARAM_KEY), zzehf.zza(zzehm, IronSourceConstants.EVENTS_PROVIDER));
        return this;
    }
}
