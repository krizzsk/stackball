package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzbbj implements Runnable {
    private final zzbbi zzebi;

    private zzbbj(zzbbi zzbbi) {
        this.zzebi = zzbbi;
    }

    static Runnable zza(zzbbi zzbbi) {
        return new zzbbj(zzbbi);
    }

    public final void run() {
        this.zzebi.stop();
    }
}
