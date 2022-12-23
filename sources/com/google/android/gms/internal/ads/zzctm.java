package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzctm implements zzub {
    private zzvl zzgjq;

    public final synchronized void zzb(zzvl zzvl) {
        this.zzgjq = zzvl;
    }

    public final synchronized void onAdClicked() {
        if (this.zzgjq != null) {
            try {
                this.zzgjq.onAdClicked();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
