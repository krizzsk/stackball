package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbeq implements zzdqx<Map<String, String>> {
    private final /* synthetic */ zzbej zzeik;
    private final /* synthetic */ List zzein;
    private final /* synthetic */ String zzeio;

    zzbeq(zzbej zzbej, List list, String str) {
        this.zzeik = zzbej;
        this.zzein = list;
        this.zzeio = str;
    }

    public final void zzb(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.zzeik.zza((Map<String, String>) (Map) obj, (List<zzaga<? super zzbek>>) this.zzein, this.zzeio);
    }
}
