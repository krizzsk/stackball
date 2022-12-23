package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbtf implements Runnable {
    private final WeakReference<zzbte> zzfno;

    private zzbtf(zzbte zzbte) {
        this.zzfno = new WeakReference<>(zzbte);
    }

    public final void run() {
        zzbte zzbte = (zzbte) this.zzfno.get();
        if (zzbte != null) {
            zzbte.zzaiw();
        }
    }
}
