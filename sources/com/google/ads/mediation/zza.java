package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zza extends AdMetadataListener {
    private final /* synthetic */ AbstractAdViewAdapter zzmd;

    zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzmd = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.zzmd.zzma != null && this.zzmd.zzmb != null) {
            this.zzmd.zzmb.zzb(this.zzmd.zzma.getAdMetadata());
        }
    }
}
