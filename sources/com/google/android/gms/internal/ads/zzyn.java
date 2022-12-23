package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzyn implements Runnable {
    private final /* synthetic */ zzyk zzchu;

    zzyn(zzyk zzyk) {
        this.zzchu = zzyk;
    }

    public final void run() {
        if (this.zzchu.zzcht.zzbmt != null) {
            try {
                this.zzchu.zzcht.zzbmt.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazw.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
