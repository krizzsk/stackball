package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbgd implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzaun zzeij;
    private final /* synthetic */ zzbgc zzelm;

    zzbgd(zzbgc zzbgc, zzaun zzaun) {
        this.zzelm = zzbgc;
        this.zzeij = zzaun;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzelm.zza(view, this.zzeij, 10);
    }
}
