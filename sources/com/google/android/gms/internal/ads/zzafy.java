package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzafy implements zzaga<zzbek> {
    zzafy() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbek zzbek = (zzbek) obj;
        if (map.keySet().contains("start")) {
            zzbek.zzbc(true);
        }
        if (map.keySet().contains("stop")) {
            zzbek.zzbc(false);
        }
    }
}
