package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbbz implements Runnable {
    private boolean zzbqh = false;
    private zzbbk zzecf;

    zzbbz(zzbbk zzbbk) {
        this.zzecf = zzbbk;
    }

    public final void run() {
        if (!this.zzbqh) {
            this.zzecf.zzyx();
            zzzo();
        }
    }

    public final void pause() {
        this.zzbqh = true;
        this.zzecf.zzyx();
    }

    public final void resume() {
        this.zzbqh = false;
        zzzo();
    }

    private final void zzzo() {
        zzaxa.zzdwf.removeCallbacks(this);
        zzaxa.zzdwf.postDelayed(this, 250);
    }
}
