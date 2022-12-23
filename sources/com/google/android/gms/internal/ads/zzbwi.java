package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbwi extends zzbui<VideoController.VideoLifecycleCallbacks> {
    private boolean zzekx;

    protected zzbwi(Set<zzbvt<VideoController.VideoLifecycleCallbacks>> set) {
        super(set);
    }

    public final void onVideoPause() {
        zza(zzbwl.zzfnf);
    }

    public final void onVideoEnd() {
        zza(zzbwk.zzfnf);
    }

    public final synchronized void onVideoStart() {
        zza(zzbwn.zzfnf);
        this.zzekx = true;
    }

    public final synchronized void onVideoPlay() {
        if (!this.zzekx) {
            zza(zzbwm.zzfnf);
            this.zzekx = true;
        }
        zza(zzbwp.zzfnf);
    }
}
