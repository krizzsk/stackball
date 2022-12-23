package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzfh implements Callable {
    private final zzbv.zza.C15642zza zzaam;
    private final zzeo zzvp;

    public zzfh(zzeo zzeo, zzbv.zza.C15642zza zza) {
        this.zzvp = zzeo;
        this.zzaam = zza;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzcz */
    public final Void call() throws Exception {
        if (this.zzvp.zzcq() != null) {
            this.zzvp.zzcq().get();
        }
        zzbv.zza zzcp = this.zzvp.zzcp();
        if (zzcp == null) {
            return null;
        }
        try {
            synchronized (this.zzaam) {
                zzbv.zza.C15642zza zza = this.zzaam;
                byte[] byteArray = zzcp.toByteArray();
                zza.zza(byteArray, 0, byteArray.length, zzebq.zzbed());
            }
            return null;
        } catch (zzeco unused) {
            return null;
        }
    }
}
