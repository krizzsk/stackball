package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzmd implements zzmt {
    /* access modifiers changed from: private */
    public final int track;
    private final /* synthetic */ zzly zzbau;

    public zzmd(zzly zzly, int i) {
        this.zzbau = zzly;
        this.track = i;
    }

    public final boolean isReady() {
        return this.zzbau.zzav(this.track);
    }

    public final void zzhr() throws IOException {
        this.zzbau.zzhr();
    }

    public final int zzb(zzhh zzhh, zzjb zzjb, boolean z) {
        return this.zzbau.zza(this.track, zzhh, zzjb, z);
    }

    public final void zzeh(long j) {
        this.zzbau.zzd(this.track, j);
    }
}
