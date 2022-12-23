package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.ads.instream.InstreamAdView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzahz extends InstreamAd {
    private MediaContent zzbkq = zzss();
    private VideoController zzcgy = zzsr();
    private final zzaho zzdbo;

    public zzahz(zzaho zzaho) {
        this.zzdbo = zzaho;
    }

    public final void zza(InstreamAdView instreamAdView) {
        if (instreamAdView == null) {
            zzazw.zzfa("showInView: parameter view must not be null.");
            return;
        }
        try {
            this.zzdbo.zzr(ObjectWrapper.wrap(instreamAdView));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final MediaContent getMediaContent() {
        return this.zzbkq;
    }

    public final VideoController getVideoController() {
        return this.zzcgy;
    }

    public final float getVideoDuration() {
        VideoController videoController = this.zzcgy;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoDuration();
    }

    public final float getVideoCurrentTime() {
        VideoController videoController = this.zzcgy;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getVideoCurrentTime();
    }

    public final float getAspectRatio() {
        VideoController videoController = this.zzcgy;
        if (videoController == null) {
            return 0.0f;
        }
        return videoController.getAspectRatio();
    }

    public final void destroy() {
        try {
            this.zzdbo.destroy();
            this.zzcgy = null;
            this.zzbkq = null;
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    private final VideoController zzsr() {
        VideoController videoController = new VideoController();
        try {
            videoController.zza(this.zzdbo.getVideoController());
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
        return videoController;
    }

    private final MediaContent zzss() {
        try {
            if (this.zzdbo.zzsl() != null) {
                return new zzyg(this.zzdbo.zzsl());
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
