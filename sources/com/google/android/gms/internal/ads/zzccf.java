package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzccf implements zzdnx {
    private final JSONObject zzfhd;
    private final zzcca zzfvk;

    zzccf(zzcca zzcca, JSONObject jSONObject) {
        this.zzfvk = zzcca;
        this.zzfhd = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zzfvk.zza(this.zzfhd, (List) obj);
    }
}
