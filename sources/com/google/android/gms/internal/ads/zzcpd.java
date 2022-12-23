package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcpd implements zzbxz {
    private zzbro zzfpi = null;
    private final zzdgo zzfpj;
    private final zzanv zzgfv;
    private final boolean zzgfw;

    zzcpd(zzdgo zzdgo, zzanv zzanv, boolean z) {
        this.zzfpj = zzdgo;
        this.zzgfv = zzanv;
        this.zzgfw = z;
    }

    public final void zza(boolean z, Context context) throws zzbxy {
        boolean z2;
        try {
            if (this.zzgfw) {
                z2 = this.zzgfv.zzaa(ObjectWrapper.wrap(context));
            } else {
                z2 = this.zzgfv.zzz(ObjectWrapper.wrap(context));
            }
            if (!z2) {
                throw new zzbxy("Adapter failed to show.");
            } else if (this.zzfpi != null && this.zzfpj.zzgub == 2) {
                this.zzfpi.onAdImpression();
            }
        } catch (Throwable th) {
            throw new zzbxy(th);
        }
    }

    public final void zza(zzbro zzbro) {
        this.zzfpi = zzbro;
    }
}
