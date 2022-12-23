package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzaft implements zzaga<zzbek> {
    zzaft() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbek zzbek = (zzbek) obj;
        if (zzbek.zzabx() != null) {
            zzbek.zzabx().zzms();
        }
        zzc zzabf = zzbek.zzabf();
        if (zzabf != null) {
            zzabf.close();
            return;
        }
        zzc zzabg = zzbek.zzabg();
        if (zzabg != null) {
            zzabg.close();
        } else {
            zzawr.zzfc("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
