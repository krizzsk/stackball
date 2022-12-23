package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbvh implements zzegz<Set<zzbvt<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbuj zzfoh;

    private zzbvh(zzbuj zzbuj) {
        this.zzfoh = zzbuj;
    }

    public static zzbvh zzaa(zzbuj zzbuj) {
        return new zzbvh(zzbuj);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
