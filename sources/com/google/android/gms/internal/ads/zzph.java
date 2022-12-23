package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzph implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzpg zzbjp;

    private zzph(zzpg zzpg, MediaCodec mediaCodec) {
        this.zzbjp = zzpg;
        mediaCodec.setOnFrameRenderedListener(this, new zzdns());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this == this.zzbjp.zzbjm) {
            this.zzbjp.zzji();
        }
    }
}
