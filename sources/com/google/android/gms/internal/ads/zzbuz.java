package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbuz implements zzegz<Set<zzbvt<zzbsr>>> {
    private final zzbuj zzfoh;

    private zzbuz(zzbuj zzbuj) {
        this.zzfoh = zzbuj;
    }

    public static zzbuz zzu(zzbuj zzbuj) {
        return new zzbuz(zzbuj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzajj(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
