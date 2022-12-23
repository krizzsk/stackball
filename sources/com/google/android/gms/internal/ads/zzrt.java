package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzrt extends AppOpenAd {
    private final zzrm zzbsa;

    public zzrt(zzrm zzrm) {
        this.zzbsa = zzrm;
    }

    /* access modifiers changed from: protected */
    public final zzvz zzdv() {
        try {
            return this.zzbsa.zzdv();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(zzrs zzrs) {
        try {
            this.zzbsa.zza(zzrs);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
