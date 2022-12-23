package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzsn implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzsf zzbsu;
    private final /* synthetic */ zzbaj zzbsv;
    final /* synthetic */ zzsl zzbsw;

    zzsn(zzsl zzsl, zzsf zzsf, zzbaj zzbaj) {
        this.zzbsw = zzsl;
        this.zzbsu = zzsf;
        this.zzbsv = zzbaj;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzbsw.lock) {
            if (!this.zzbsw.zzbst) {
                boolean unused = this.zzbsw.zzbst = true;
                zzsg zzd = this.zzbsw.zzbsg;
                if (zzd != null) {
                    this.zzbsv.addListener(new zzsp(this.zzbsv, zzbab.zzdzr.zzf(new zzsq(this, zzd, this.zzbsu, this.zzbsv))), zzbab.zzdzw);
                }
            }
        }
    }
}
