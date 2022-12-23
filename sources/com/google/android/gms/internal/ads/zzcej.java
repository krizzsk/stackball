package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcej implements zzagk {
    private final zzbrx zzflh;
    private final zzatc zzfwu;
    private final String zzfwv;
    private final String zzfww;

    public zzcej(zzbrx zzbrx, zzdgo zzdgo) {
        this.zzflh = zzbrx;
        this.zzfwu = zzdgo.zzdoi;
        this.zzfwv = zzdgo.zzdgb;
        this.zzfww = zzdgo.zzdgc;
    }

    public final void zzsm() {
        this.zzflh.onRewardedVideoStarted();
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzatc zzatc) {
        int i;
        String str;
        zzatc zzatc2 = this.zzfwu;
        if (zzatc2 != null) {
            zzatc = zzatc2;
        }
        if (zzatc != null) {
            str = zzatc.type;
            i = zzatc.zzdqy;
        } else {
            str = "";
            i = 1;
        }
        this.zzflh.zzb(new zzasb(str, i), this.zzfwv, this.zzfww);
    }

    public final void zzsn() {
        this.zzflh.onRewardedVideoCompleted();
    }
}
