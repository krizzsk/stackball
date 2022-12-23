package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzceh extends VideoController.VideoLifecycleCallbacks {
    private final zzbzx zzfqb;

    public zzceh(zzbzx zzbzx) {
        this.zzfqb = zzbzx;
    }

    public final void onVideoStart() {
        zzxm zza = zza(this.zzfqb);
        if (zza != null) {
            try {
                zza.onVideoStart();
            } catch (RemoteException e) {
                zzawr.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        zzxm zza = zza(this.zzfqb);
        if (zza != null) {
            try {
                zza.onVideoPause();
            } catch (RemoteException e) {
                zzawr.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoEnd() {
        zzxm zza = zza(this.zzfqb);
        if (zza != null) {
            try {
                zza.onVideoEnd();
            } catch (RemoteException e) {
                zzawr.zzd("Unable to call onVideoEnd()", e);
            }
        }
    }

    private static zzxm zza(zzbzx zzbzx) {
        zzxl videoController = zzbzx.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzqg();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
