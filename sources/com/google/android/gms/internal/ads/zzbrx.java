package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbrx extends zzbui<zzbqx> {
    public zzbrx(Set<zzbvt<zzbqx>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbsa.zzfnf);
    }

    public final void onAdLeftApplication() {
        zza(zzbrz.zzfnf);
    }

    public final void onAdOpened() {
        zza(zzbsc.zzfnf);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbsb.zzfnf);
    }

    public final void zzb(zzasd zzasd, String str, String str2) {
        zza(new zzbse(zzasd, str, str2));
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbsd.zzfnf);
    }
}
