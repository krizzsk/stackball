package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcdm implements zzacg {
    private final /* synthetic */ zzcdn zzfwb;

    zzcdm(zzcdn zzcdn) {
        this.zzfwb = zzcdn;
    }

    public final void zzc(MotionEvent motionEvent) {
    }

    public final void zzrx() {
        if (this.zzfwb.zzftd != null) {
            this.zzfwb.zzftd.zzfx(NativeCustomTemplateAd.ASSET_NAME_VIDEO);
        }
    }
}
