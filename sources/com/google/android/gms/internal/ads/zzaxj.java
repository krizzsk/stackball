package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.StatFs;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zzaxj extends zzaxk {
    public final int zzxk() {
        return 14;
    }

    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    public final long zzxo() {
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcom)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
