package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzawf extends zzawn {
    private final /* synthetic */ zzawd zzdui;

    zzawf(zzawd zzawd) {
        this.zzdui = zzawd;
    }

    public final void zzup() {
        zzaad zzaad = new zzaad(this.zzdui.zzvf, this.zzdui.zzbmo.zzbnd);
        synchronized (this.zzdui.lock) {
            try {
                zzq.zzlf();
                zzaae.zza(this.zzdui.zzdtv, zzaad);
            } catch (IllegalArgumentException e) {
                zzawr.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}
