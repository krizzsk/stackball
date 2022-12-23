package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzdgb extends AdMetadataListener {
    private final /* synthetic */ zzxa zzgsx;
    private final /* synthetic */ zzdgc zzgsy;

    zzdgb(zzdgc zzdgc, zzxa zzxa) {
        this.zzgsy = zzdgc;
        this.zzgsx = zzxa;
    }

    public final void onAdMetadataChanged() {
        if (this.zzgsy.zzgtb != null) {
            try {
                this.zzgsx.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzawr.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
